package edu.kit.scc.cfeditor.cfengine.ui.contentassist.antlr.internal; 

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
import edu.kit.scc.cfeditor.cfengine.services.CfengineEditorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCfengineEditorParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ANY_OTHER", "RULE_STRING", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "'=>'", "';'", "','", "'('", "')'", "'.'", "'!'", "'bundle'", "'{'", "'}'", "':'", "'::'", "'@'", "'body'", "'$('", "'${'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=5;
    public static final int RULE_INT=7;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;

        public InternalCfengineEditorParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g"; }


     
     	private CfengineEditorGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(CfengineEditorGrammarAccess grammarAccess) {
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:61:1: entryRuleCfModel : ruleCfModel EOF ;
    public final void entryRuleCfModel() throws RecognitionException {
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:62:1: ( ruleCfModel EOF )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:63:1: ruleCfModel EOF
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:70:1: ruleCfModel : ( ( rule__CfModel__ElementsAssignment )* ) ;
    public final void ruleCfModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:74:2: ( ( ( rule__CfModel__ElementsAssignment )* ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:75:1: ( ( rule__CfModel__ElementsAssignment )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:75:1: ( ( rule__CfModel__ElementsAssignment )* )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:76:1: ( rule__CfModel__ElementsAssignment )*
            {
             before(grammarAccess.getCfModelAccess().getElementsAssignment()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:77:1: ( rule__CfModel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17||LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:77:2: rule__CfModel__ElementsAssignment
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


    // $ANTLR start entryRuleCLASS_ID
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:89:1: entryRuleCLASS_ID : ruleCLASS_ID EOF ;
    public final void entryRuleCLASS_ID() throws RecognitionException {
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:90:1: ( ruleCLASS_ID EOF )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:91:1: ruleCLASS_ID EOF
            {
             before(grammarAccess.getCLASS_IDRule()); 
            pushFollow(FOLLOW_ruleCLASS_ID_in_entryRuleCLASS_ID122);
            ruleCLASS_ID();
            _fsp--;

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
    // $ANTLR end entryRuleCLASS_ID


    // $ANTLR start ruleCLASS_ID
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:98:1: ruleCLASS_ID : ( ( rule__CLASS_ID__Alternatives ) ) ;
    public final void ruleCLASS_ID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:102:2: ( ( ( rule__CLASS_ID__Alternatives ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:103:1: ( ( rule__CLASS_ID__Alternatives ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:103:1: ( ( rule__CLASS_ID__Alternatives ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:104:1: ( rule__CLASS_ID__Alternatives )
            {
             before(grammarAccess.getCLASS_IDAccess().getAlternatives()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:105:1: ( rule__CLASS_ID__Alternatives )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:105:2: rule__CLASS_ID__Alternatives
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Alternatives_in_ruleCLASS_ID155);
            rule__CLASS_ID__Alternatives();
            _fsp--;


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
    // $ANTLR end ruleCLASS_ID


    // $ANTLR start entryRulePLACEHOLDERB
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:117:1: entryRulePLACEHOLDERB : rulePLACEHOLDERB EOF ;
    public final void entryRulePLACEHOLDERB() throws RecognitionException {
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:118:1: ( rulePLACEHOLDERB EOF )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:119:1: rulePLACEHOLDERB EOF
            {
             before(grammarAccess.getPLACEHOLDERBRule()); 
            pushFollow(FOLLOW_rulePLACEHOLDERB_in_entryRulePLACEHOLDERB182);
            rulePLACEHOLDERB();
            _fsp--;

             after(grammarAccess.getPLACEHOLDERBRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePLACEHOLDERB189); 

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
    // $ANTLR end entryRulePLACEHOLDERB


    // $ANTLR start rulePLACEHOLDERB
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:126:1: rulePLACEHOLDERB : ( ( rule__PLACEHOLDERB__Alternatives ) ) ;
    public final void rulePLACEHOLDERB() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:130:2: ( ( ( rule__PLACEHOLDERB__Alternatives ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:131:1: ( ( rule__PLACEHOLDERB__Alternatives ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:131:1: ( ( rule__PLACEHOLDERB__Alternatives ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:132:1: ( rule__PLACEHOLDERB__Alternatives )
            {
             before(grammarAccess.getPLACEHOLDERBAccess().getAlternatives()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:133:1: ( rule__PLACEHOLDERB__Alternatives )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:133:2: rule__PLACEHOLDERB__Alternatives
            {
            pushFollow(FOLLOW_rule__PLACEHOLDERB__Alternatives_in_rulePLACEHOLDERB215);
            rule__PLACEHOLDERB__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getPLACEHOLDERBAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePLACEHOLDERB


    // $ANTLR start entryRuleAbstractElement
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:145:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:146:1: ( ruleAbstractElement EOF )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:147:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement242);
            ruleAbstractElement();
            _fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement249); 

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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:154:1: ruleAbstractElement : ( rulePart ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:158:2: ( ( rulePart ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:159:1: ( rulePart )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:159:1: ( rulePart )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:160:1: rulePart
            {
             before(grammarAccess.getAbstractElementAccess().getPartParserRuleCall()); 
            pushFollow(FOLLOW_rulePart_in_ruleAbstractElement275);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:173:1: entryRulePart : rulePart EOF ;
    public final void entryRulePart() throws RecognitionException {
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:174:1: ( rulePart EOF )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:175:1: rulePart EOF
            {
             before(grammarAccess.getPartRule()); 
            pushFollow(FOLLOW_rulePart_in_entryRulePart301);
            rulePart();
            _fsp--;

             after(grammarAccess.getPartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePart308); 

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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:182:1: rulePart : ( ( rule__Part__Alternatives ) ) ;
    public final void rulePart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:186:2: ( ( ( rule__Part__Alternatives ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:187:1: ( ( rule__Part__Alternatives ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:187:1: ( ( rule__Part__Alternatives ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:188:1: ( rule__Part__Alternatives )
            {
             before(grammarAccess.getPartAccess().getAlternatives()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:189:1: ( rule__Part__Alternatives )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:189:2: rule__Part__Alternatives
            {
            pushFollow(FOLLOW_rule__Part__Alternatives_in_rulePart334);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:201:1: entryRuleBundle : ruleBundle EOF ;
    public final void entryRuleBundle() throws RecognitionException {
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:202:1: ( ruleBundle EOF )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:203:1: ruleBundle EOF
            {
             before(grammarAccess.getBundleRule()); 
            pushFollow(FOLLOW_ruleBundle_in_entryRuleBundle361);
            ruleBundle();
            _fsp--;

             after(grammarAccess.getBundleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundle368); 

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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:210:1: ruleBundle : ( ( rule__Bundle__Group__0 ) ) ;
    public final void ruleBundle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:214:2: ( ( ( rule__Bundle__Group__0 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:215:1: ( ( rule__Bundle__Group__0 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:215:1: ( ( rule__Bundle__Group__0 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:216:1: ( rule__Bundle__Group__0 )
            {
             before(grammarAccess.getBundleAccess().getGroup()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:217:1: ( rule__Bundle__Group__0 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:217:2: rule__Bundle__Group__0
            {
            pushFollow(FOLLOW_rule__Bundle__Group__0_in_ruleBundle394);
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


    // $ANTLR start entryRuleBundlePromiseType
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:229:1: entryRuleBundlePromiseType : ruleBundlePromiseType EOF ;
    public final void entryRuleBundlePromiseType() throws RecognitionException {
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:230:1: ( ruleBundlePromiseType EOF )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:231:1: ruleBundlePromiseType EOF
            {
             before(grammarAccess.getBundlePromiseTypeRule()); 
            pushFollow(FOLLOW_ruleBundlePromiseType_in_entryRuleBundlePromiseType421);
            ruleBundlePromiseType();
            _fsp--;

             after(grammarAccess.getBundlePromiseTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundlePromiseType428); 

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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:238:1: ruleBundlePromiseType : ( ( rule__BundlePromiseType__Group__0 ) ) ;
    public final void ruleBundlePromiseType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:242:2: ( ( ( rule__BundlePromiseType__Group__0 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:243:1: ( ( rule__BundlePromiseType__Group__0 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:243:1: ( ( rule__BundlePromiseType__Group__0 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:244:1: ( rule__BundlePromiseType__Group__0 )
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getGroup()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:245:1: ( rule__BundlePromiseType__Group__0 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:245:2: rule__BundlePromiseType__Group__0
            {
            pushFollow(FOLLOW_rule__BundlePromiseType__Group__0_in_ruleBundlePromiseType454);
            rule__BundlePromiseType__Group__0();
            _fsp--;


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
    // $ANTLR end ruleBundlePromiseType


    // $ANTLR start entryRuleBundleClass
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:257:1: entryRuleBundleClass : ruleBundleClass EOF ;
    public final void entryRuleBundleClass() throws RecognitionException {
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:258:1: ( ruleBundleClass EOF )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:259:1: ruleBundleClass EOF
            {
             before(grammarAccess.getBundleClassRule()); 
            pushFollow(FOLLOW_ruleBundleClass_in_entryRuleBundleClass481);
            ruleBundleClass();
            _fsp--;

             after(grammarAccess.getBundleClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundleClass488); 

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
    // $ANTLR end entryRuleBundleClass


    // $ANTLR start ruleBundleClass
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:266:1: ruleBundleClass : ( ( rule__BundleClass__Group__0 ) ) ;
    public final void ruleBundleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:270:2: ( ( ( rule__BundleClass__Group__0 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:271:1: ( ( rule__BundleClass__Group__0 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:271:1: ( ( rule__BundleClass__Group__0 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:272:1: ( rule__BundleClass__Group__0 )
            {
             before(grammarAccess.getBundleClassAccess().getGroup()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:273:1: ( rule__BundleClass__Group__0 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:273:2: rule__BundleClass__Group__0
            {
            pushFollow(FOLLOW_rule__BundleClass__Group__0_in_ruleBundleClass514);
            rule__BundleClass__Group__0();
            _fsp--;


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
    // $ANTLR end ruleBundleClass


    // $ANTLR start entryRuleBundlePromise
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:285:1: entryRuleBundlePromise : ruleBundlePromise EOF ;
    public final void entryRuleBundlePromise() throws RecognitionException {
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:286:1: ( ruleBundlePromise EOF )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:287:1: ruleBundlePromise EOF
            {
             before(grammarAccess.getBundlePromiseRule()); 
            pushFollow(FOLLOW_ruleBundlePromise_in_entryRuleBundlePromise541);
            ruleBundlePromise();
            _fsp--;

             after(grammarAccess.getBundlePromiseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundlePromise548); 

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
    // $ANTLR end entryRuleBundlePromise


    // $ANTLR start ruleBundlePromise
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:294:1: ruleBundlePromise : ( ( rule__BundlePromise__Group__0 ) ) ;
    public final void ruleBundlePromise() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:298:2: ( ( ( rule__BundlePromise__Group__0 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:299:1: ( ( rule__BundlePromise__Group__0 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:299:1: ( ( rule__BundlePromise__Group__0 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:300:1: ( rule__BundlePromise__Group__0 )
            {
             before(grammarAccess.getBundlePromiseAccess().getGroup()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:301:1: ( rule__BundlePromise__Group__0 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:301:2: rule__BundlePromise__Group__0
            {
            pushFollow(FOLLOW_rule__BundlePromise__Group__0_in_ruleBundlePromise574);
            rule__BundlePromise__Group__0();
            _fsp--;


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
    // $ANTLR end ruleBundlePromise


    // $ANTLR start entryRulePromiseValue
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:313:1: entryRulePromiseValue : rulePromiseValue EOF ;
    public final void entryRulePromiseValue() throws RecognitionException {
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:314:1: ( rulePromiseValue EOF )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:315:1: rulePromiseValue EOF
            {
             before(grammarAccess.getPromiseValueRule()); 
            pushFollow(FOLLOW_rulePromiseValue_in_entryRulePromiseValue601);
            rulePromiseValue();
            _fsp--;

             after(grammarAccess.getPromiseValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePromiseValue608); 

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
    // $ANTLR end entryRulePromiseValue


    // $ANTLR start rulePromiseValue
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:322:1: rulePromiseValue : ( ( rule__PromiseValue__Group__0 ) ) ;
    public final void rulePromiseValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:326:2: ( ( ( rule__PromiseValue__Group__0 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:327:1: ( ( rule__PromiseValue__Group__0 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:327:1: ( ( rule__PromiseValue__Group__0 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:328:1: ( rule__PromiseValue__Group__0 )
            {
             before(grammarAccess.getPromiseValueAccess().getGroup()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:329:1: ( rule__PromiseValue__Group__0 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:329:2: rule__PromiseValue__Group__0
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group__0_in_rulePromiseValue634);
            rule__PromiseValue__Group__0();
            _fsp--;


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
    // $ANTLR end rulePromiseValue


    // $ANTLR start entryRuleBody
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:341:1: entryRuleBody : ruleBody EOF ;
    public final void entryRuleBody() throws RecognitionException {
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:342:1: ( ruleBody EOF )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:343:1: ruleBody EOF
            {
             before(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody661);
            ruleBody();
            _fsp--;

             after(grammarAccess.getBodyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody668); 

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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:350:1: ruleBody : ( ( rule__Body__Group__0 ) ) ;
    public final void ruleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:354:2: ( ( ( rule__Body__Group__0 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:355:1: ( ( rule__Body__Group__0 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:355:1: ( ( rule__Body__Group__0 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:356:1: ( rule__Body__Group__0 )
            {
             before(grammarAccess.getBodyAccess().getGroup()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:357:1: ( rule__Body__Group__0 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:357:2: rule__Body__Group__0
            {
            pushFollow(FOLLOW_rule__Body__Group__0_in_ruleBody694);
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


    // $ANTLR start entryRuleBodyClass
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:369:1: entryRuleBodyClass : ruleBodyClass EOF ;
    public final void entryRuleBodyClass() throws RecognitionException {
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:370:1: ( ruleBodyClass EOF )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:371:1: ruleBodyClass EOF
            {
             before(grammarAccess.getBodyClassRule()); 
            pushFollow(FOLLOW_ruleBodyClass_in_entryRuleBodyClass721);
            ruleBodyClass();
            _fsp--;

             after(grammarAccess.getBodyClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyClass728); 

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
    // $ANTLR end entryRuleBodyClass


    // $ANTLR start ruleBodyClass
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:378:1: ruleBodyClass : ( ( rule__BodyClass__Group__0 ) ) ;
    public final void ruleBodyClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:382:2: ( ( ( rule__BodyClass__Group__0 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:383:1: ( ( rule__BodyClass__Group__0 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:383:1: ( ( rule__BodyClass__Group__0 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:384:1: ( rule__BodyClass__Group__0 )
            {
             before(grammarAccess.getBodyClassAccess().getGroup()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:385:1: ( rule__BodyClass__Group__0 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:385:2: rule__BodyClass__Group__0
            {
            pushFollow(FOLLOW_rule__BodyClass__Group__0_in_ruleBodyClass754);
            rule__BodyClass__Group__0();
            _fsp--;


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
    // $ANTLR end ruleBodyClass


    // $ANTLR start entryRuleBodyFunction
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:397:1: entryRuleBodyFunction : ruleBodyFunction EOF ;
    public final void entryRuleBodyFunction() throws RecognitionException {
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:398:1: ( ruleBodyFunction EOF )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:399:1: ruleBodyFunction EOF
            {
             before(grammarAccess.getBodyFunctionRule()); 
            pushFollow(FOLLOW_ruleBodyFunction_in_entryRuleBodyFunction781);
            ruleBodyFunction();
            _fsp--;

             after(grammarAccess.getBodyFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyFunction788); 

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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:406:1: ruleBodyFunction : ( ( rule__BodyFunction__Group__0 ) ) ;
    public final void ruleBodyFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:410:2: ( ( ( rule__BodyFunction__Group__0 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:411:1: ( ( rule__BodyFunction__Group__0 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:411:1: ( ( rule__BodyFunction__Group__0 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:412:1: ( rule__BodyFunction__Group__0 )
            {
             before(grammarAccess.getBodyFunctionAccess().getGroup()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:413:1: ( rule__BodyFunction__Group__0 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:413:2: rule__BodyFunction__Group__0
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group__0_in_ruleBodyFunction814);
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


    // $ANTLR start entryRuleSimpleFunction
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:425:1: entryRuleSimpleFunction : ruleSimpleFunction EOF ;
    public final void entryRuleSimpleFunction() throws RecognitionException {
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:426:1: ( ruleSimpleFunction EOF )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:427:1: ruleSimpleFunction EOF
            {
             before(grammarAccess.getSimpleFunctionRule()); 
            pushFollow(FOLLOW_ruleSimpleFunction_in_entryRuleSimpleFunction841);
            ruleSimpleFunction();
            _fsp--;

             after(grammarAccess.getSimpleFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleFunction848); 

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
    // $ANTLR end entryRuleSimpleFunction


    // $ANTLR start ruleSimpleFunction
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:434:1: ruleSimpleFunction : ( ( rule__SimpleFunction__Group__0 ) ) ;
    public final void ruleSimpleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:438:2: ( ( ( rule__SimpleFunction__Group__0 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:439:1: ( ( rule__SimpleFunction__Group__0 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:439:1: ( ( rule__SimpleFunction__Group__0 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:440:1: ( rule__SimpleFunction__Group__0 )
            {
             before(grammarAccess.getSimpleFunctionAccess().getGroup()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:441:1: ( rule__SimpleFunction__Group__0 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:441:2: rule__SimpleFunction__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleFunction__Group__0_in_ruleSimpleFunction874);
            rule__SimpleFunction__Group__0();
            _fsp--;


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
    // $ANTLR end ruleSimpleFunction


    // $ANTLR start entryRuleSpecialFunction
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:453:1: entryRuleSpecialFunction : ruleSpecialFunction EOF ;
    public final void entryRuleSpecialFunction() throws RecognitionException {
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:454:1: ( ruleSpecialFunction EOF )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:455:1: ruleSpecialFunction EOF
            {
             before(grammarAccess.getSpecialFunctionRule()); 
            pushFollow(FOLLOW_ruleSpecialFunction_in_entryRuleSpecialFunction901);
            ruleSpecialFunction();
            _fsp--;

             after(grammarAccess.getSpecialFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialFunction908); 

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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:462:1: ruleSpecialFunction : ( ( rule__SpecialFunction__Group__0 ) ) ;
    public final void ruleSpecialFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:466:2: ( ( ( rule__SpecialFunction__Group__0 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:467:1: ( ( rule__SpecialFunction__Group__0 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:467:1: ( ( rule__SpecialFunction__Group__0 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:468:1: ( rule__SpecialFunction__Group__0 )
            {
             before(grammarAccess.getSpecialFunctionAccess().getGroup()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:469:1: ( rule__SpecialFunction__Group__0 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:469:2: rule__SpecialFunction__Group__0
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__0_in_ruleSpecialFunction934);
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


    // $ANTLR start entryRuleBodyPromiseType
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:481:1: entryRuleBodyPromiseType : ruleBodyPromiseType EOF ;
    public final void entryRuleBodyPromiseType() throws RecognitionException {
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:482:1: ( ruleBodyPromiseType EOF )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:483:1: ruleBodyPromiseType EOF
            {
             before(grammarAccess.getBodyPromiseTypeRule()); 
            pushFollow(FOLLOW_ruleBodyPromiseType_in_entryRuleBodyPromiseType961);
            ruleBodyPromiseType();
            _fsp--;

             after(grammarAccess.getBodyPromiseTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyPromiseType968); 

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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:490:1: ruleBodyPromiseType : ( ( rule__BodyPromiseType__NameAssignment ) ) ;
    public final void ruleBodyPromiseType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:494:2: ( ( ( rule__BodyPromiseType__NameAssignment ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:495:1: ( ( rule__BodyPromiseType__NameAssignment ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:495:1: ( ( rule__BodyPromiseType__NameAssignment ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:496:1: ( rule__BodyPromiseType__NameAssignment )
            {
             before(grammarAccess.getBodyPromiseTypeAccess().getNameAssignment()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:497:1: ( rule__BodyPromiseType__NameAssignment )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:497:2: rule__BodyPromiseType__NameAssignment
            {
            pushFollow(FOLLOW_rule__BodyPromiseType__NameAssignment_in_ruleBodyPromiseType994);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:509:1: entryRuleBundleComponent : ruleBundleComponent EOF ;
    public final void entryRuleBundleComponent() throws RecognitionException {
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:510:1: ( ruleBundleComponent EOF )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:511:1: ruleBundleComponent EOF
            {
             before(grammarAccess.getBundleComponentRule()); 
            pushFollow(FOLLOW_ruleBundleComponent_in_entryRuleBundleComponent1021);
            ruleBundleComponent();
            _fsp--;

             after(grammarAccess.getBundleComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundleComponent1028); 

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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:518:1: ruleBundleComponent : ( ( rule__BundleComponent__NameAssignment ) ) ;
    public final void ruleBundleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:522:2: ( ( ( rule__BundleComponent__NameAssignment ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:523:1: ( ( rule__BundleComponent__NameAssignment ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:523:1: ( ( rule__BundleComponent__NameAssignment ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:524:1: ( rule__BundleComponent__NameAssignment )
            {
             before(grammarAccess.getBundleComponentAccess().getNameAssignment()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:525:1: ( rule__BundleComponent__NameAssignment )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:525:2: rule__BundleComponent__NameAssignment
            {
            pushFollow(FOLLOW_rule__BundleComponent__NameAssignment_in_ruleBundleComponent1054);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:537:1: entryRuleBodyComponent : ruleBodyComponent EOF ;
    public final void entryRuleBodyComponent() throws RecognitionException {
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:538:1: ( ruleBodyComponent EOF )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:539:1: ruleBodyComponent EOF
            {
             before(grammarAccess.getBodyComponentRule()); 
            pushFollow(FOLLOW_ruleBodyComponent_in_entryRuleBodyComponent1081);
            ruleBodyComponent();
            _fsp--;

             after(grammarAccess.getBodyComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyComponent1088); 

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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:546:1: ruleBodyComponent : ( ( rule__BodyComponent__NameAssignment ) ) ;
    public final void ruleBodyComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:550:2: ( ( ( rule__BodyComponent__NameAssignment ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:551:1: ( ( rule__BodyComponent__NameAssignment ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:551:1: ( ( rule__BodyComponent__NameAssignment ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:552:1: ( rule__BodyComponent__NameAssignment )
            {
             before(grammarAccess.getBodyComponentAccess().getNameAssignment()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:553:1: ( rule__BodyComponent__NameAssignment )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:553:2: rule__BodyComponent__NameAssignment
            {
            pushFollow(FOLLOW_rule__BodyComponent__NameAssignment_in_ruleBodyComponent1114);
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


    // $ANTLR start rule__CLASS_ID__Alternatives
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:565:1: rule__CLASS_ID__Alternatives : ( ( RULE_ID ) | ( ( rule__CLASS_ID__Group_1__0 ) ) | ( ( rule__CLASS_ID__Group_2__0 ) ) | ( ( rule__CLASS_ID__Group_3__0 ) ) );
    public final void rule__CLASS_ID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:569:1: ( ( RULE_ID ) | ( ( rule__CLASS_ID__Group_1__0 ) ) | ( ( rule__CLASS_ID__Group_2__0 ) ) | ( ( rule__CLASS_ID__Group_3__0 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==EOF||LA2_1==14||LA2_1==21) ) {
                    alt2=1;
                }
                else if ( (LA2_1==15) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("565:1: rule__CLASS_ID__Alternatives : ( ( RULE_ID ) | ( ( rule__CLASS_ID__Group_1__0 ) ) | ( ( rule__CLASS_ID__Group_2__0 ) ) | ( ( rule__CLASS_ID__Group_3__0 ) ) );", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            case 13:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("565:1: rule__CLASS_ID__Alternatives : ( ( RULE_ID ) | ( ( rule__CLASS_ID__Group_1__0 ) ) | ( ( rule__CLASS_ID__Group_2__0 ) ) | ( ( rule__CLASS_ID__Group_3__0 ) ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:570:1: ( RULE_ID )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:570:1: ( RULE_ID )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:571:1: RULE_ID
                    {
                     before(grammarAccess.getCLASS_IDAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CLASS_ID__Alternatives1150); 
                     after(grammarAccess.getCLASS_IDAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:576:6: ( ( rule__CLASS_ID__Group_1__0 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:576:6: ( ( rule__CLASS_ID__Group_1__0 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:577:1: ( rule__CLASS_ID__Group_1__0 )
                    {
                     before(grammarAccess.getCLASS_IDAccess().getGroup_1()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:578:1: ( rule__CLASS_ID__Group_1__0 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:578:2: rule__CLASS_ID__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CLASS_ID__Group_1__0_in_rule__CLASS_ID__Alternatives1167);
                    rule__CLASS_ID__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getCLASS_IDAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:582:6: ( ( rule__CLASS_ID__Group_2__0 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:582:6: ( ( rule__CLASS_ID__Group_2__0 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:583:1: ( rule__CLASS_ID__Group_2__0 )
                    {
                     before(grammarAccess.getCLASS_IDAccess().getGroup_2()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:584:1: ( rule__CLASS_ID__Group_2__0 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:584:2: rule__CLASS_ID__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__CLASS_ID__Group_2__0_in_rule__CLASS_ID__Alternatives1185);
                    rule__CLASS_ID__Group_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getCLASS_IDAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:588:6: ( ( rule__CLASS_ID__Group_3__0 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:588:6: ( ( rule__CLASS_ID__Group_3__0 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:589:1: ( rule__CLASS_ID__Group_3__0 )
                    {
                     before(grammarAccess.getCLASS_IDAccess().getGroup_3()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:590:1: ( rule__CLASS_ID__Group_3__0 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:590:2: rule__CLASS_ID__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__CLASS_ID__Group_3__0_in_rule__CLASS_ID__Alternatives1203);
                    rule__CLASS_ID__Group_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getCLASS_IDAccess().getGroup_3()); 

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
    // $ANTLR end rule__CLASS_ID__Alternatives


    // $ANTLR start rule__PLACEHOLDERB__Alternatives
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:599:1: rule__PLACEHOLDERB__Alternatives : ( ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( RULE_STRING ) | ( '=>' ) | ( ';' ) | ( ',' ) | ( '(' ) | ( ')' ) );
    public final void rule__PLACEHOLDERB__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:603:1: ( ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( RULE_STRING ) | ( '=>' ) | ( ';' ) | ( ',' ) | ( '(' ) | ( ')' ) )
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
            case 10:
                {
                alt3=4;
                }
                break;
            case 11:
                {
                alt3=5;
                }
                break;
            case 12:
                {
                alt3=6;
                }
                break;
            case 13:
                {
                alt3=7;
                }
                break;
            case 14:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("599:1: rule__PLACEHOLDERB__Alternatives : ( ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( RULE_STRING ) | ( '=>' ) | ( ';' ) | ( ',' ) | ( '(' ) | ( ')' ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:604:1: ( RULE_ANY_OTHER )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:604:1: ( RULE_ANY_OTHER )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:605:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getPLACEHOLDERBAccess().getANY_OTHERTerminalRuleCall_0()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__PLACEHOLDERB__Alternatives1236); 
                     after(grammarAccess.getPLACEHOLDERBAccess().getANY_OTHERTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:610:6: ( RULE_ID )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:610:6: ( RULE_ID )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:611:1: RULE_ID
                    {
                     before(grammarAccess.getPLACEHOLDERBAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PLACEHOLDERB__Alternatives1253); 
                     after(grammarAccess.getPLACEHOLDERBAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:616:6: ( RULE_STRING )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:616:6: ( RULE_STRING )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:617:1: RULE_STRING
                    {
                     before(grammarAccess.getPLACEHOLDERBAccess().getSTRINGTerminalRuleCall_2()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PLACEHOLDERB__Alternatives1270); 
                     after(grammarAccess.getPLACEHOLDERBAccess().getSTRINGTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:622:6: ( '=>' )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:622:6: ( '=>' )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:623:1: '=>'
                    {
                     before(grammarAccess.getPLACEHOLDERBAccess().getEqualsSignGreaterThanSignKeyword_3()); 
                    match(input,10,FOLLOW_10_in_rule__PLACEHOLDERB__Alternatives1288); 
                     after(grammarAccess.getPLACEHOLDERBAccess().getEqualsSignGreaterThanSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:630:6: ( ';' )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:630:6: ( ';' )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:631:1: ';'
                    {
                     before(grammarAccess.getPLACEHOLDERBAccess().getSemicolonKeyword_4()); 
                    match(input,11,FOLLOW_11_in_rule__PLACEHOLDERB__Alternatives1308); 
                     after(grammarAccess.getPLACEHOLDERBAccess().getSemicolonKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:638:6: ( ',' )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:638:6: ( ',' )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:639:1: ','
                    {
                     before(grammarAccess.getPLACEHOLDERBAccess().getCommaKeyword_5()); 
                    match(input,12,FOLLOW_12_in_rule__PLACEHOLDERB__Alternatives1328); 
                     after(grammarAccess.getPLACEHOLDERBAccess().getCommaKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:646:6: ( '(' )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:646:6: ( '(' )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:647:1: '('
                    {
                     before(grammarAccess.getPLACEHOLDERBAccess().getLeftParenthesisKeyword_6()); 
                    match(input,13,FOLLOW_13_in_rule__PLACEHOLDERB__Alternatives1348); 
                     after(grammarAccess.getPLACEHOLDERBAccess().getLeftParenthesisKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:654:6: ( ')' )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:654:6: ( ')' )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:655:1: ')'
                    {
                     before(grammarAccess.getPLACEHOLDERBAccess().getRightParenthesisKeyword_7()); 
                    match(input,14,FOLLOW_14_in_rule__PLACEHOLDERB__Alternatives1368); 
                     after(grammarAccess.getPLACEHOLDERBAccess().getRightParenthesisKeyword_7()); 

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
    // $ANTLR end rule__PLACEHOLDERB__Alternatives


    // $ANTLR start rule__Part__Alternatives
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:667:1: rule__Part__Alternatives : ( ( ruleBundle ) | ( ruleBody ) );
    public final void rule__Part__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:671:1: ( ( ruleBundle ) | ( ruleBody ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( (LA4_0==23) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("667:1: rule__Part__Alternatives : ( ( ruleBundle ) | ( ruleBody ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:672:1: ( ruleBundle )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:672:1: ( ruleBundle )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:673:1: ruleBundle
                    {
                     before(grammarAccess.getPartAccess().getBundleParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBundle_in_rule__Part__Alternatives1402);
                    ruleBundle();
                    _fsp--;

                     after(grammarAccess.getPartAccess().getBundleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:678:6: ( ruleBody )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:678:6: ( ruleBody )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:679:1: ruleBody
                    {
                     before(grammarAccess.getPartAccess().getBodyParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBody_in_rule__Part__Alternatives1419);
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


    // $ANTLR start rule__PromiseValue__Alternatives_2
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:689:1: rule__PromiseValue__Alternatives_2 : ( ( ( rule__PromiseValue__Alternatives_2_0 ) ) | ( ( rule__PromiseValue__Group_2_1__0 ) ) | ( ( rule__PromiseValue__Group_2_2__0 ) ) );
    public final void rule__PromiseValue__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:693:1: ( ( ( rule__PromiseValue__Alternatives_2_0 ) ) | ( ( rule__PromiseValue__Group_2_1__0 ) ) | ( ( rule__PromiseValue__Group_2_2__0 ) ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==22) ) {
                    alt5=3;
                }
                else if ( (LA5_2==RULE_ID||LA5_2==RULE_STRING) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("689:1: rule__PromiseValue__Alternatives_2 : ( ( ( rule__PromiseValue__Alternatives_2_0 ) ) | ( ( rule__PromiseValue__Group_2_1__0 ) ) | ( ( rule__PromiseValue__Group_2_2__0 ) ) );", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("689:1: rule__PromiseValue__Alternatives_2 : ( ( ( rule__PromiseValue__Alternatives_2_0 ) ) | ( ( rule__PromiseValue__Group_2_1__0 ) ) | ( ( rule__PromiseValue__Group_2_2__0 ) ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:694:1: ( ( rule__PromiseValue__Alternatives_2_0 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:694:1: ( ( rule__PromiseValue__Alternatives_2_0 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:695:1: ( rule__PromiseValue__Alternatives_2_0 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getAlternatives_2_0()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:696:1: ( rule__PromiseValue__Alternatives_2_0 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:696:2: rule__PromiseValue__Alternatives_2_0
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__Alternatives_2_0_in_rule__PromiseValue__Alternatives_21451);
                    rule__PromiseValue__Alternatives_2_0();
                    _fsp--;


                    }

                     after(grammarAccess.getPromiseValueAccess().getAlternatives_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:700:6: ( ( rule__PromiseValue__Group_2_1__0 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:700:6: ( ( rule__PromiseValue__Group_2_1__0 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:701:1: ( rule__PromiseValue__Group_2_1__0 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getGroup_2_1()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:702:1: ( rule__PromiseValue__Group_2_1__0 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:702:2: rule__PromiseValue__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__Group_2_1__0_in_rule__PromiseValue__Alternatives_21469);
                    rule__PromiseValue__Group_2_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getPromiseValueAccess().getGroup_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:706:6: ( ( rule__PromiseValue__Group_2_2__0 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:706:6: ( ( rule__PromiseValue__Group_2_2__0 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:707:1: ( rule__PromiseValue__Group_2_2__0 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getGroup_2_2()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:708:1: ( rule__PromiseValue__Group_2_2__0 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:708:2: rule__PromiseValue__Group_2_2__0
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__0_in_rule__PromiseValue__Alternatives_21487);
                    rule__PromiseValue__Group_2_2__0();
                    _fsp--;


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
    // $ANTLR end rule__PromiseValue__Alternatives_2


    // $ANTLR start rule__PromiseValue__Alternatives_2_0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:717:1: rule__PromiseValue__Alternatives_2_0 : ( ( ( rule__PromiseValue__ValuesAssignment_2_0_0 ) ) | ( ( rule__PromiseValue__FunctionsAssignment_2_0_1 ) ) );
    public final void rule__PromiseValue__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:721:1: ( ( ( rule__PromiseValue__ValuesAssignment_2_0_0 ) ) | ( ( rule__PromiseValue__FunctionsAssignment_2_0_1 ) ) )
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
                    new NoViableAltException("717:1: rule__PromiseValue__Alternatives_2_0 : ( ( ( rule__PromiseValue__ValuesAssignment_2_0_0 ) ) | ( ( rule__PromiseValue__FunctionsAssignment_2_0_1 ) ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:722:1: ( ( rule__PromiseValue__ValuesAssignment_2_0_0 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:722:1: ( ( rule__PromiseValue__ValuesAssignment_2_0_0 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:723:1: ( rule__PromiseValue__ValuesAssignment_2_0_0 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getValuesAssignment_2_0_0()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:724:1: ( rule__PromiseValue__ValuesAssignment_2_0_0 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:724:2: rule__PromiseValue__ValuesAssignment_2_0_0
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__ValuesAssignment_2_0_0_in_rule__PromiseValue__Alternatives_2_01520);
                    rule__PromiseValue__ValuesAssignment_2_0_0();
                    _fsp--;


                    }

                     after(grammarAccess.getPromiseValueAccess().getValuesAssignment_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:728:6: ( ( rule__PromiseValue__FunctionsAssignment_2_0_1 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:728:6: ( ( rule__PromiseValue__FunctionsAssignment_2_0_1 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:729:1: ( rule__PromiseValue__FunctionsAssignment_2_0_1 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getFunctionsAssignment_2_0_1()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:730:1: ( rule__PromiseValue__FunctionsAssignment_2_0_1 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:730:2: rule__PromiseValue__FunctionsAssignment_2_0_1
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__FunctionsAssignment_2_0_1_in_rule__PromiseValue__Alternatives_2_01538);
                    rule__PromiseValue__FunctionsAssignment_2_0_1();
                    _fsp--;


                    }

                     after(grammarAccess.getPromiseValueAccess().getFunctionsAssignment_2_0_1()); 

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
    // $ANTLR end rule__PromiseValue__Alternatives_2_0


    // $ANTLR start rule__PromiseValue__Alternatives_2_1_1
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:739:1: rule__PromiseValue__Alternatives_2_1_1 : ( ( ( rule__PromiseValue__ValuesAssignment_2_1_1_0 ) ) | ( ( rule__PromiseValue__FunctionsAssignment_2_1_1_1 ) ) );
    public final void rule__PromiseValue__Alternatives_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:743:1: ( ( ( rule__PromiseValue__ValuesAssignment_2_1_1_0 ) ) | ( ( rule__PromiseValue__FunctionsAssignment_2_1_1_1 ) ) )
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
                    new NoViableAltException("739:1: rule__PromiseValue__Alternatives_2_1_1 : ( ( ( rule__PromiseValue__ValuesAssignment_2_1_1_0 ) ) | ( ( rule__PromiseValue__FunctionsAssignment_2_1_1_1 ) ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:744:1: ( ( rule__PromiseValue__ValuesAssignment_2_1_1_0 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:744:1: ( ( rule__PromiseValue__ValuesAssignment_2_1_1_0 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:745:1: ( rule__PromiseValue__ValuesAssignment_2_1_1_0 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getValuesAssignment_2_1_1_0()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:746:1: ( rule__PromiseValue__ValuesAssignment_2_1_1_0 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:746:2: rule__PromiseValue__ValuesAssignment_2_1_1_0
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__ValuesAssignment_2_1_1_0_in_rule__PromiseValue__Alternatives_2_1_11571);
                    rule__PromiseValue__ValuesAssignment_2_1_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getPromiseValueAccess().getValuesAssignment_2_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:750:6: ( ( rule__PromiseValue__FunctionsAssignment_2_1_1_1 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:750:6: ( ( rule__PromiseValue__FunctionsAssignment_2_1_1_1 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:751:1: ( rule__PromiseValue__FunctionsAssignment_2_1_1_1 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getFunctionsAssignment_2_1_1_1()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:752:1: ( rule__PromiseValue__FunctionsAssignment_2_1_1_1 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:752:2: rule__PromiseValue__FunctionsAssignment_2_1_1_1
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__FunctionsAssignment_2_1_1_1_in_rule__PromiseValue__Alternatives_2_1_11589);
                    rule__PromiseValue__FunctionsAssignment_2_1_1_1();
                    _fsp--;


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
    // $ANTLR end rule__PromiseValue__Alternatives_2_1_1


    // $ANTLR start rule__PromiseValue__Alternatives_2_1_2_1
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:761:1: rule__PromiseValue__Alternatives_2_1_2_1 : ( ( ( rule__PromiseValue__ValuesAssignment_2_1_2_1_0 ) ) | ( ( rule__PromiseValue__FunctionsAssignment_2_1_2_1_1 ) ) );
    public final void rule__PromiseValue__Alternatives_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:765:1: ( ( ( rule__PromiseValue__ValuesAssignment_2_1_2_1_0 ) ) | ( ( rule__PromiseValue__FunctionsAssignment_2_1_2_1_1 ) ) )
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
                    new NoViableAltException("761:1: rule__PromiseValue__Alternatives_2_1_2_1 : ( ( ( rule__PromiseValue__ValuesAssignment_2_1_2_1_0 ) ) | ( ( rule__PromiseValue__FunctionsAssignment_2_1_2_1_1 ) ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:766:1: ( ( rule__PromiseValue__ValuesAssignment_2_1_2_1_0 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:766:1: ( ( rule__PromiseValue__ValuesAssignment_2_1_2_1_0 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:767:1: ( rule__PromiseValue__ValuesAssignment_2_1_2_1_0 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getValuesAssignment_2_1_2_1_0()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:768:1: ( rule__PromiseValue__ValuesAssignment_2_1_2_1_0 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:768:2: rule__PromiseValue__ValuesAssignment_2_1_2_1_0
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__ValuesAssignment_2_1_2_1_0_in_rule__PromiseValue__Alternatives_2_1_2_11622);
                    rule__PromiseValue__ValuesAssignment_2_1_2_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getPromiseValueAccess().getValuesAssignment_2_1_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:772:6: ( ( rule__PromiseValue__FunctionsAssignment_2_1_2_1_1 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:772:6: ( ( rule__PromiseValue__FunctionsAssignment_2_1_2_1_1 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:773:1: ( rule__PromiseValue__FunctionsAssignment_2_1_2_1_1 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getFunctionsAssignment_2_1_2_1_1()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:774:1: ( rule__PromiseValue__FunctionsAssignment_2_1_2_1_1 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:774:2: rule__PromiseValue__FunctionsAssignment_2_1_2_1_1
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__FunctionsAssignment_2_1_2_1_1_in_rule__PromiseValue__Alternatives_2_1_2_11640);
                    rule__PromiseValue__FunctionsAssignment_2_1_2_1_1();
                    _fsp--;


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
    // $ANTLR end rule__PromiseValue__Alternatives_2_1_2_1


    // $ANTLR start rule__BodyFunction__Alternatives_2
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:783:1: rule__BodyFunction__Alternatives_2 : ( ( ( rule__BodyFunction__ValuesAssignment_2_0 ) ) | ( ( rule__BodyFunction__Group_2_1__0 ) ) | ( ( rule__BodyFunction__FunctionAssignment_2_2 ) ) | ( ( rule__BodyFunction__Group_2_3__0 ) ) );
    public final void rule__BodyFunction__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:787:1: ( ( ( rule__BodyFunction__ValuesAssignment_2_0 ) ) | ( ( rule__BodyFunction__Group_2_1__0 ) ) | ( ( rule__BodyFunction__FunctionAssignment_2_2 ) ) | ( ( rule__BodyFunction__Group_2_3__0 ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt9=1;
                }
                break;
            case 18:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==22) ) {
                    alt9=4;
                }
                else if ( (LA9_2==RULE_STRING) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("783:1: rule__BodyFunction__Alternatives_2 : ( ( ( rule__BodyFunction__ValuesAssignment_2_0 ) ) | ( ( rule__BodyFunction__Group_2_1__0 ) ) | ( ( rule__BodyFunction__FunctionAssignment_2_2 ) ) | ( ( rule__BodyFunction__Group_2_3__0 ) ) );", 9, 2, input);

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
                    new NoViableAltException("783:1: rule__BodyFunction__Alternatives_2 : ( ( ( rule__BodyFunction__ValuesAssignment_2_0 ) ) | ( ( rule__BodyFunction__Group_2_1__0 ) ) | ( ( rule__BodyFunction__FunctionAssignment_2_2 ) ) | ( ( rule__BodyFunction__Group_2_3__0 ) ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:788:1: ( ( rule__BodyFunction__ValuesAssignment_2_0 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:788:1: ( ( rule__BodyFunction__ValuesAssignment_2_0 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:789:1: ( rule__BodyFunction__ValuesAssignment_2_0 )
                    {
                     before(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_0()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:790:1: ( rule__BodyFunction__ValuesAssignment_2_0 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:790:2: rule__BodyFunction__ValuesAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__BodyFunction__ValuesAssignment_2_0_in_rule__BodyFunction__Alternatives_21673);
                    rule__BodyFunction__ValuesAssignment_2_0();
                    _fsp--;


                    }

                     after(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:794:6: ( ( rule__BodyFunction__Group_2_1__0 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:794:6: ( ( rule__BodyFunction__Group_2_1__0 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:795:1: ( rule__BodyFunction__Group_2_1__0 )
                    {
                     before(grammarAccess.getBodyFunctionAccess().getGroup_2_1()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:796:1: ( rule__BodyFunction__Group_2_1__0 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:796:2: rule__BodyFunction__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__0_in_rule__BodyFunction__Alternatives_21691);
                    rule__BodyFunction__Group_2_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBodyFunctionAccess().getGroup_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:800:6: ( ( rule__BodyFunction__FunctionAssignment_2_2 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:800:6: ( ( rule__BodyFunction__FunctionAssignment_2_2 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:801:1: ( rule__BodyFunction__FunctionAssignment_2_2 )
                    {
                     before(grammarAccess.getBodyFunctionAccess().getFunctionAssignment_2_2()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:802:1: ( rule__BodyFunction__FunctionAssignment_2_2 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:802:2: rule__BodyFunction__FunctionAssignment_2_2
                    {
                    pushFollow(FOLLOW_rule__BodyFunction__FunctionAssignment_2_2_in_rule__BodyFunction__Alternatives_21709);
                    rule__BodyFunction__FunctionAssignment_2_2();
                    _fsp--;


                    }

                     after(grammarAccess.getBodyFunctionAccess().getFunctionAssignment_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:806:6: ( ( rule__BodyFunction__Group_2_3__0 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:806:6: ( ( rule__BodyFunction__Group_2_3__0 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:807:1: ( rule__BodyFunction__Group_2_3__0 )
                    {
                     before(grammarAccess.getBodyFunctionAccess().getGroup_2_3()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:808:1: ( rule__BodyFunction__Group_2_3__0 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:808:2: rule__BodyFunction__Group_2_3__0
                    {
                    pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__0_in_rule__BodyFunction__Alternatives_21727);
                    rule__BodyFunction__Group_2_3__0();
                    _fsp--;


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
    // $ANTLR end rule__BodyFunction__Alternatives_2


    // $ANTLR start rule__SpecialFunction__Alternatives_2
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:817:1: rule__SpecialFunction__Alternatives_2 : ( ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( ',' ) | ( ( rule__SpecialFunction__Group_2_5__0 ) ) | ( ( rule__SpecialFunction__Group_2_6__0 ) ) | ( ( rule__SpecialFunction__FuncAssignment_2_7 ) ) );
    public final void rule__SpecialFunction__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:821:1: ( ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( ',' ) | ( ( rule__SpecialFunction__Group_2_5__0 ) ) | ( ( rule__SpecialFunction__Group_2_6__0 ) ) | ( ( rule__SpecialFunction__FuncAssignment_2_7 ) ) )
            int alt10=8;
            switch ( input.LA(1) ) {
            case RULE_ANY_OTHER:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
                {
                int LA10_2 = input.LA(2);

                if ( ((LA10_2>=RULE_ID && LA10_2<=RULE_INT)||LA10_2==12||LA10_2==14||(LA10_2>=24 && LA10_2<=25)) ) {
                    alt10=2;
                }
                else if ( (LA10_2==13) ) {
                    alt10=8;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("817:1: rule__SpecialFunction__Alternatives_2 : ( ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( ',' ) | ( ( rule__SpecialFunction__Group_2_5__0 ) ) | ( ( rule__SpecialFunction__Group_2_6__0 ) ) | ( ( rule__SpecialFunction__FuncAssignment_2_7 ) ) );", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt10=3;
                }
                break;
            case RULE_INT:
                {
                alt10=4;
                }
                break;
            case 12:
                {
                alt10=5;
                }
                break;
            case 24:
                {
                alt10=6;
                }
                break;
            case 25:
                {
                alt10=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("817:1: rule__SpecialFunction__Alternatives_2 : ( ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( ',' ) | ( ( rule__SpecialFunction__Group_2_5__0 ) ) | ( ( rule__SpecialFunction__Group_2_6__0 ) ) | ( ( rule__SpecialFunction__FuncAssignment_2_7 ) ) );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:822:1: ( RULE_ANY_OTHER )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:822:1: ( RULE_ANY_OTHER )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:823:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getANY_OTHERTerminalRuleCall_2_0()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__SpecialFunction__Alternatives_21760); 
                     after(grammarAccess.getSpecialFunctionAccess().getANY_OTHERTerminalRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:828:6: ( RULE_ID )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:828:6: ( RULE_ID )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:829:1: RULE_ID
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SpecialFunction__Alternatives_21777); 
                     after(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:834:6: ( RULE_STRING )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:834:6: ( RULE_STRING )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:835:1: RULE_STRING
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getSTRINGTerminalRuleCall_2_2()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SpecialFunction__Alternatives_21794); 
                     after(grammarAccess.getSpecialFunctionAccess().getSTRINGTerminalRuleCall_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:840:6: ( RULE_INT )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:840:6: ( RULE_INT )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:841:1: RULE_INT
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getINTTerminalRuleCall_2_3()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SpecialFunction__Alternatives_21811); 
                     after(grammarAccess.getSpecialFunctionAccess().getINTTerminalRuleCall_2_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:846:6: ( ',' )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:846:6: ( ',' )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:847:1: ','
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getCommaKeyword_2_4()); 
                    match(input,12,FOLLOW_12_in_rule__SpecialFunction__Alternatives_21829); 
                     after(grammarAccess.getSpecialFunctionAccess().getCommaKeyword_2_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:854:6: ( ( rule__SpecialFunction__Group_2_5__0 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:854:6: ( ( rule__SpecialFunction__Group_2_5__0 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:855:1: ( rule__SpecialFunction__Group_2_5__0 )
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getGroup_2_5()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:856:1: ( rule__SpecialFunction__Group_2_5__0 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:856:2: rule__SpecialFunction__Group_2_5__0
                    {
                    pushFollow(FOLLOW_rule__SpecialFunction__Group_2_5__0_in_rule__SpecialFunction__Alternatives_21848);
                    rule__SpecialFunction__Group_2_5__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSpecialFunctionAccess().getGroup_2_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:860:6: ( ( rule__SpecialFunction__Group_2_6__0 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:860:6: ( ( rule__SpecialFunction__Group_2_6__0 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:861:1: ( rule__SpecialFunction__Group_2_6__0 )
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getGroup_2_6()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:862:1: ( rule__SpecialFunction__Group_2_6__0 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:862:2: rule__SpecialFunction__Group_2_6__0
                    {
                    pushFollow(FOLLOW_rule__SpecialFunction__Group_2_6__0_in_rule__SpecialFunction__Alternatives_21866);
                    rule__SpecialFunction__Group_2_6__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSpecialFunctionAccess().getGroup_2_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:866:6: ( ( rule__SpecialFunction__FuncAssignment_2_7 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:866:6: ( ( rule__SpecialFunction__FuncAssignment_2_7 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:867:1: ( rule__SpecialFunction__FuncAssignment_2_7 )
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getFuncAssignment_2_7()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:868:1: ( rule__SpecialFunction__FuncAssignment_2_7 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:868:2: rule__SpecialFunction__FuncAssignment_2_7
                    {
                    pushFollow(FOLLOW_rule__SpecialFunction__FuncAssignment_2_7_in_rule__SpecialFunction__Alternatives_21884);
                    rule__SpecialFunction__FuncAssignment_2_7();
                    _fsp--;


                    }

                     after(grammarAccess.getSpecialFunctionAccess().getFuncAssignment_2_7()); 

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
    // $ANTLR end rule__SpecialFunction__Alternatives_2


    // $ANTLR start rule__CLASS_ID__Group_1__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:879:1: rule__CLASS_ID__Group_1__0 : rule__CLASS_ID__Group_1__0__Impl rule__CLASS_ID__Group_1__1 ;
    public final void rule__CLASS_ID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:883:1: ( rule__CLASS_ID__Group_1__0__Impl rule__CLASS_ID__Group_1__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:884:2: rule__CLASS_ID__Group_1__0__Impl rule__CLASS_ID__Group_1__1
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_1__0__Impl_in_rule__CLASS_ID__Group_1__01915);
            rule__CLASS_ID__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CLASS_ID__Group_1__1_in_rule__CLASS_ID__Group_1__01918);
            rule__CLASS_ID__Group_1__1();
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
    // $ANTLR end rule__CLASS_ID__Group_1__0


    // $ANTLR start rule__CLASS_ID__Group_1__0__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:891:1: rule__CLASS_ID__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__CLASS_ID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:895:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:896:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:896:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:897:1: RULE_ID
            {
             before(grammarAccess.getCLASS_IDAccess().getIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CLASS_ID__Group_1__0__Impl1945); 
             after(grammarAccess.getCLASS_IDAccess().getIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CLASS_ID__Group_1__0__Impl


    // $ANTLR start rule__CLASS_ID__Group_1__1
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:908:1: rule__CLASS_ID__Group_1__1 : rule__CLASS_ID__Group_1__1__Impl rule__CLASS_ID__Group_1__2 ;
    public final void rule__CLASS_ID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:912:1: ( rule__CLASS_ID__Group_1__1__Impl rule__CLASS_ID__Group_1__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:913:2: rule__CLASS_ID__Group_1__1__Impl rule__CLASS_ID__Group_1__2
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_1__1__Impl_in_rule__CLASS_ID__Group_1__11974);
            rule__CLASS_ID__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CLASS_ID__Group_1__2_in_rule__CLASS_ID__Group_1__11977);
            rule__CLASS_ID__Group_1__2();
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
    // $ANTLR end rule__CLASS_ID__Group_1__1


    // $ANTLR start rule__CLASS_ID__Group_1__1__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:920:1: rule__CLASS_ID__Group_1__1__Impl : ( '.' ) ;
    public final void rule__CLASS_ID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:924:1: ( ( '.' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:925:1: ( '.' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:925:1: ( '.' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:926:1: '.'
            {
             before(grammarAccess.getCLASS_IDAccess().getFullStopKeyword_1_1()); 
            match(input,15,FOLLOW_15_in_rule__CLASS_ID__Group_1__1__Impl2005); 
             after(grammarAccess.getCLASS_IDAccess().getFullStopKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CLASS_ID__Group_1__1__Impl


    // $ANTLR start rule__CLASS_ID__Group_1__2
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:939:1: rule__CLASS_ID__Group_1__2 : rule__CLASS_ID__Group_1__2__Impl ;
    public final void rule__CLASS_ID__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:943:1: ( rule__CLASS_ID__Group_1__2__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:944:2: rule__CLASS_ID__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_1__2__Impl_in_rule__CLASS_ID__Group_1__22036);
            rule__CLASS_ID__Group_1__2__Impl();
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
    // $ANTLR end rule__CLASS_ID__Group_1__2


    // $ANTLR start rule__CLASS_ID__Group_1__2__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:950:1: rule__CLASS_ID__Group_1__2__Impl : ( RULE_ID ) ;
    public final void rule__CLASS_ID__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:954:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:955:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:955:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:956:1: RULE_ID
            {
             before(grammarAccess.getCLASS_IDAccess().getIDTerminalRuleCall_1_2()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CLASS_ID__Group_1__2__Impl2063); 
             after(grammarAccess.getCLASS_IDAccess().getIDTerminalRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CLASS_ID__Group_1__2__Impl


    // $ANTLR start rule__CLASS_ID__Group_2__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:973:1: rule__CLASS_ID__Group_2__0 : rule__CLASS_ID__Group_2__0__Impl rule__CLASS_ID__Group_2__1 ;
    public final void rule__CLASS_ID__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:977:1: ( rule__CLASS_ID__Group_2__0__Impl rule__CLASS_ID__Group_2__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:978:2: rule__CLASS_ID__Group_2__0__Impl rule__CLASS_ID__Group_2__1
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_2__0__Impl_in_rule__CLASS_ID__Group_2__02098);
            rule__CLASS_ID__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CLASS_ID__Group_2__1_in_rule__CLASS_ID__Group_2__02101);
            rule__CLASS_ID__Group_2__1();
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
    // $ANTLR end rule__CLASS_ID__Group_2__0


    // $ANTLR start rule__CLASS_ID__Group_2__0__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:985:1: rule__CLASS_ID__Group_2__0__Impl : ( '!' ) ;
    public final void rule__CLASS_ID__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:989:1: ( ( '!' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:990:1: ( '!' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:990:1: ( '!' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:991:1: '!'
            {
             before(grammarAccess.getCLASS_IDAccess().getExclamationMarkKeyword_2_0()); 
            match(input,16,FOLLOW_16_in_rule__CLASS_ID__Group_2__0__Impl2129); 
             after(grammarAccess.getCLASS_IDAccess().getExclamationMarkKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CLASS_ID__Group_2__0__Impl


    // $ANTLR start rule__CLASS_ID__Group_2__1
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1004:1: rule__CLASS_ID__Group_2__1 : rule__CLASS_ID__Group_2__1__Impl ;
    public final void rule__CLASS_ID__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1008:1: ( rule__CLASS_ID__Group_2__1__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1009:2: rule__CLASS_ID__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_2__1__Impl_in_rule__CLASS_ID__Group_2__12160);
            rule__CLASS_ID__Group_2__1__Impl();
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
    // $ANTLR end rule__CLASS_ID__Group_2__1


    // $ANTLR start rule__CLASS_ID__Group_2__1__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1015:1: rule__CLASS_ID__Group_2__1__Impl : ( ruleCLASS_ID ) ;
    public final void rule__CLASS_ID__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1019:1: ( ( ruleCLASS_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1020:1: ( ruleCLASS_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1020:1: ( ruleCLASS_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1021:1: ruleCLASS_ID
            {
             before(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleCLASS_ID_in_rule__CLASS_ID__Group_2__1__Impl2187);
            ruleCLASS_ID();
            _fsp--;

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
    // $ANTLR end rule__CLASS_ID__Group_2__1__Impl


    // $ANTLR start rule__CLASS_ID__Group_3__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1036:1: rule__CLASS_ID__Group_3__0 : rule__CLASS_ID__Group_3__0__Impl rule__CLASS_ID__Group_3__1 ;
    public final void rule__CLASS_ID__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1040:1: ( rule__CLASS_ID__Group_3__0__Impl rule__CLASS_ID__Group_3__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1041:2: rule__CLASS_ID__Group_3__0__Impl rule__CLASS_ID__Group_3__1
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_3__0__Impl_in_rule__CLASS_ID__Group_3__02220);
            rule__CLASS_ID__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CLASS_ID__Group_3__1_in_rule__CLASS_ID__Group_3__02223);
            rule__CLASS_ID__Group_3__1();
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
    // $ANTLR end rule__CLASS_ID__Group_3__0


    // $ANTLR start rule__CLASS_ID__Group_3__0__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1048:1: rule__CLASS_ID__Group_3__0__Impl : ( '(' ) ;
    public final void rule__CLASS_ID__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1052:1: ( ( '(' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1053:1: ( '(' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1053:1: ( '(' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1054:1: '('
            {
             before(grammarAccess.getCLASS_IDAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,13,FOLLOW_13_in_rule__CLASS_ID__Group_3__0__Impl2251); 
             after(grammarAccess.getCLASS_IDAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__CLASS_ID__Group_3__0__Impl


    // $ANTLR start rule__CLASS_ID__Group_3__1
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1067:1: rule__CLASS_ID__Group_3__1 : rule__CLASS_ID__Group_3__1__Impl rule__CLASS_ID__Group_3__2 ;
    public final void rule__CLASS_ID__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1071:1: ( rule__CLASS_ID__Group_3__1__Impl rule__CLASS_ID__Group_3__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1072:2: rule__CLASS_ID__Group_3__1__Impl rule__CLASS_ID__Group_3__2
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_3__1__Impl_in_rule__CLASS_ID__Group_3__12282);
            rule__CLASS_ID__Group_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CLASS_ID__Group_3__2_in_rule__CLASS_ID__Group_3__12285);
            rule__CLASS_ID__Group_3__2();
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
    // $ANTLR end rule__CLASS_ID__Group_3__1


    // $ANTLR start rule__CLASS_ID__Group_3__1__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1079:1: rule__CLASS_ID__Group_3__1__Impl : ( ruleCLASS_ID ) ;
    public final void rule__CLASS_ID__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1083:1: ( ( ruleCLASS_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1084:1: ( ruleCLASS_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1084:1: ( ruleCLASS_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1085:1: ruleCLASS_ID
            {
             before(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_3_1()); 
            pushFollow(FOLLOW_ruleCLASS_ID_in_rule__CLASS_ID__Group_3__1__Impl2312);
            ruleCLASS_ID();
            _fsp--;

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
    // $ANTLR end rule__CLASS_ID__Group_3__1__Impl


    // $ANTLR start rule__CLASS_ID__Group_3__2
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1096:1: rule__CLASS_ID__Group_3__2 : rule__CLASS_ID__Group_3__2__Impl ;
    public final void rule__CLASS_ID__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1100:1: ( rule__CLASS_ID__Group_3__2__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1101:2: rule__CLASS_ID__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_3__2__Impl_in_rule__CLASS_ID__Group_3__22341);
            rule__CLASS_ID__Group_3__2__Impl();
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
    // $ANTLR end rule__CLASS_ID__Group_3__2


    // $ANTLR start rule__CLASS_ID__Group_3__2__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1107:1: rule__CLASS_ID__Group_3__2__Impl : ( ')' ) ;
    public final void rule__CLASS_ID__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1111:1: ( ( ')' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1112:1: ( ')' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1112:1: ( ')' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1113:1: ')'
            {
             before(grammarAccess.getCLASS_IDAccess().getRightParenthesisKeyword_3_2()); 
            match(input,14,FOLLOW_14_in_rule__CLASS_ID__Group_3__2__Impl2369); 
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
    // $ANTLR end rule__CLASS_ID__Group_3__2__Impl


    // $ANTLR start rule__Bundle__Group__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1132:1: rule__Bundle__Group__0 : rule__Bundle__Group__0__Impl rule__Bundle__Group__1 ;
    public final void rule__Bundle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1136:1: ( rule__Bundle__Group__0__Impl rule__Bundle__Group__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1137:2: rule__Bundle__Group__0__Impl rule__Bundle__Group__1
            {
            pushFollow(FOLLOW_rule__Bundle__Group__0__Impl_in_rule__Bundle__Group__02406);
            rule__Bundle__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__1_in_rule__Bundle__Group__02409);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1144:1: rule__Bundle__Group__0__Impl : ( 'bundle' ) ;
    public final void rule__Bundle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1148:1: ( ( 'bundle' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1149:1: ( 'bundle' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1149:1: ( 'bundle' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1150:1: 'bundle'
            {
             before(grammarAccess.getBundleAccess().getBundleKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Bundle__Group__0__Impl2437); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1163:1: rule__Bundle__Group__1 : rule__Bundle__Group__1__Impl rule__Bundle__Group__2 ;
    public final void rule__Bundle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1167:1: ( rule__Bundle__Group__1__Impl rule__Bundle__Group__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1168:2: rule__Bundle__Group__1__Impl rule__Bundle__Group__2
            {
            pushFollow(FOLLOW_rule__Bundle__Group__1__Impl_in_rule__Bundle__Group__12468);
            rule__Bundle__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__2_in_rule__Bundle__Group__12471);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1175:1: rule__Bundle__Group__1__Impl : ( ( rule__Bundle__ComponentAssignment_1 ) ) ;
    public final void rule__Bundle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1179:1: ( ( ( rule__Bundle__ComponentAssignment_1 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1180:1: ( ( rule__Bundle__ComponentAssignment_1 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1180:1: ( ( rule__Bundle__ComponentAssignment_1 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1181:1: ( rule__Bundle__ComponentAssignment_1 )
            {
             before(grammarAccess.getBundleAccess().getComponentAssignment_1()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1182:1: ( rule__Bundle__ComponentAssignment_1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1182:2: rule__Bundle__ComponentAssignment_1
            {
            pushFollow(FOLLOW_rule__Bundle__ComponentAssignment_1_in_rule__Bundle__Group__1__Impl2498);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1192:1: rule__Bundle__Group__2 : rule__Bundle__Group__2__Impl rule__Bundle__Group__3 ;
    public final void rule__Bundle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1196:1: ( rule__Bundle__Group__2__Impl rule__Bundle__Group__3 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1197:2: rule__Bundle__Group__2__Impl rule__Bundle__Group__3
            {
            pushFollow(FOLLOW_rule__Bundle__Group__2__Impl_in_rule__Bundle__Group__22528);
            rule__Bundle__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__3_in_rule__Bundle__Group__22531);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1204:1: rule__Bundle__Group__2__Impl : ( ( rule__Bundle__NameAssignment_2 ) ) ;
    public final void rule__Bundle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1208:1: ( ( ( rule__Bundle__NameAssignment_2 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1209:1: ( ( rule__Bundle__NameAssignment_2 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1209:1: ( ( rule__Bundle__NameAssignment_2 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1210:1: ( rule__Bundle__NameAssignment_2 )
            {
             before(grammarAccess.getBundleAccess().getNameAssignment_2()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1211:1: ( rule__Bundle__NameAssignment_2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1211:2: rule__Bundle__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Bundle__NameAssignment_2_in_rule__Bundle__Group__2__Impl2558);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1221:1: rule__Bundle__Group__3 : rule__Bundle__Group__3__Impl rule__Bundle__Group__4 ;
    public final void rule__Bundle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1225:1: ( rule__Bundle__Group__3__Impl rule__Bundle__Group__4 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1226:2: rule__Bundle__Group__3__Impl rule__Bundle__Group__4
            {
            pushFollow(FOLLOW_rule__Bundle__Group__3__Impl_in_rule__Bundle__Group__32588);
            rule__Bundle__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__4_in_rule__Bundle__Group__32591);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1233:1: rule__Bundle__Group__3__Impl : ( ( rulePLACEHOLDERB )* ) ;
    public final void rule__Bundle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1237:1: ( ( ( rulePLACEHOLDERB )* ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1238:1: ( ( rulePLACEHOLDERB )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1238:1: ( ( rulePLACEHOLDERB )* )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1239:1: ( rulePLACEHOLDERB )*
            {
             before(grammarAccess.getBundleAccess().getPLACEHOLDERBParserRuleCall_3()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1240:1: ( rulePLACEHOLDERB )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_STRING)||(LA11_0>=10 && LA11_0<=14)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1240:3: rulePLACEHOLDERB
            	    {
            	    pushFollow(FOLLOW_rulePLACEHOLDERB_in_rule__Bundle__Group__3__Impl2619);
            	    rulePLACEHOLDERB();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getBundleAccess().getPLACEHOLDERBParserRuleCall_3()); 

            }


            }

        }
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1250:1: rule__Bundle__Group__4 : rule__Bundle__Group__4__Impl rule__Bundle__Group__5 ;
    public final void rule__Bundle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1254:1: ( rule__Bundle__Group__4__Impl rule__Bundle__Group__5 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1255:2: rule__Bundle__Group__4__Impl rule__Bundle__Group__5
            {
            pushFollow(FOLLOW_rule__Bundle__Group__4__Impl_in_rule__Bundle__Group__42650);
            rule__Bundle__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__5_in_rule__Bundle__Group__42653);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1262:1: rule__Bundle__Group__4__Impl : ( '{' ) ;
    public final void rule__Bundle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1266:1: ( ( '{' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1267:1: ( '{' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1267:1: ( '{' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1268:1: '{'
            {
             before(grammarAccess.getBundleAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Bundle__Group__4__Impl2681); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1281:1: rule__Bundle__Group__5 : rule__Bundle__Group__5__Impl rule__Bundle__Group__6 ;
    public final void rule__Bundle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1285:1: ( rule__Bundle__Group__5__Impl rule__Bundle__Group__6 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1286:2: rule__Bundle__Group__5__Impl rule__Bundle__Group__6
            {
            pushFollow(FOLLOW_rule__Bundle__Group__5__Impl_in_rule__Bundle__Group__52712);
            rule__Bundle__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__6_in_rule__Bundle__Group__52715);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1293:1: rule__Bundle__Group__5__Impl : ( ( rule__Bundle__PromiseTypeAssignment_5 )* ) ;
    public final void rule__Bundle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1297:1: ( ( ( rule__Bundle__PromiseTypeAssignment_5 )* ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1298:1: ( ( rule__Bundle__PromiseTypeAssignment_5 )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1298:1: ( ( rule__Bundle__PromiseTypeAssignment_5 )* )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1299:1: ( rule__Bundle__PromiseTypeAssignment_5 )*
            {
             before(grammarAccess.getBundleAccess().getPromiseTypeAssignment_5()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1300:1: ( rule__Bundle__PromiseTypeAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1300:2: rule__Bundle__PromiseTypeAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Bundle__PromiseTypeAssignment_5_in_rule__Bundle__Group__5__Impl2742);
            	    rule__Bundle__PromiseTypeAssignment_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end rule__Bundle__Group__5__Impl


    // $ANTLR start rule__Bundle__Group__6
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1310:1: rule__Bundle__Group__6 : rule__Bundle__Group__6__Impl ;
    public final void rule__Bundle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1314:1: ( rule__Bundle__Group__6__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1315:2: rule__Bundle__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Bundle__Group__6__Impl_in_rule__Bundle__Group__62773);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1321:1: rule__Bundle__Group__6__Impl : ( '}' ) ;
    public final void rule__Bundle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1325:1: ( ( '}' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1326:1: ( '}' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1326:1: ( '}' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1327:1: '}'
            {
             before(grammarAccess.getBundleAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_19_in_rule__Bundle__Group__6__Impl2801); 
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


    // $ANTLR start rule__BundlePromiseType__Group__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1354:1: rule__BundlePromiseType__Group__0 : rule__BundlePromiseType__Group__0__Impl rule__BundlePromiseType__Group__1 ;
    public final void rule__BundlePromiseType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1358:1: ( rule__BundlePromiseType__Group__0__Impl rule__BundlePromiseType__Group__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1359:2: rule__BundlePromiseType__Group__0__Impl rule__BundlePromiseType__Group__1
            {
            pushFollow(FOLLOW_rule__BundlePromiseType__Group__0__Impl_in_rule__BundlePromiseType__Group__02846);
            rule__BundlePromiseType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BundlePromiseType__Group__1_in_rule__BundlePromiseType__Group__02849);
            rule__BundlePromiseType__Group__1();
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
    // $ANTLR end rule__BundlePromiseType__Group__0


    // $ANTLR start rule__BundlePromiseType__Group__0__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1366:1: rule__BundlePromiseType__Group__0__Impl : ( ( rule__BundlePromiseType__NameAssignment_0 ) ) ;
    public final void rule__BundlePromiseType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1370:1: ( ( ( rule__BundlePromiseType__NameAssignment_0 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1371:1: ( ( rule__BundlePromiseType__NameAssignment_0 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1371:1: ( ( rule__BundlePromiseType__NameAssignment_0 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1372:1: ( rule__BundlePromiseType__NameAssignment_0 )
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getNameAssignment_0()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1373:1: ( rule__BundlePromiseType__NameAssignment_0 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1373:2: rule__BundlePromiseType__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BundlePromiseType__NameAssignment_0_in_rule__BundlePromiseType__Group__0__Impl2876);
            rule__BundlePromiseType__NameAssignment_0();
            _fsp--;


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
    // $ANTLR end rule__BundlePromiseType__Group__0__Impl


    // $ANTLR start rule__BundlePromiseType__Group__1
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1383:1: rule__BundlePromiseType__Group__1 : rule__BundlePromiseType__Group__1__Impl rule__BundlePromiseType__Group__2 ;
    public final void rule__BundlePromiseType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1387:1: ( rule__BundlePromiseType__Group__1__Impl rule__BundlePromiseType__Group__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1388:2: rule__BundlePromiseType__Group__1__Impl rule__BundlePromiseType__Group__2
            {
            pushFollow(FOLLOW_rule__BundlePromiseType__Group__1__Impl_in_rule__BundlePromiseType__Group__12906);
            rule__BundlePromiseType__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BundlePromiseType__Group__2_in_rule__BundlePromiseType__Group__12909);
            rule__BundlePromiseType__Group__2();
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
    // $ANTLR end rule__BundlePromiseType__Group__1


    // $ANTLR start rule__BundlePromiseType__Group__1__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1395:1: rule__BundlePromiseType__Group__1__Impl : ( ':' ) ;
    public final void rule__BundlePromiseType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1399:1: ( ( ':' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1400:1: ( ':' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1400:1: ( ':' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1401:1: ':'
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__BundlePromiseType__Group__1__Impl2937); 
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
    // $ANTLR end rule__BundlePromiseType__Group__1__Impl


    // $ANTLR start rule__BundlePromiseType__Group__2
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1414:1: rule__BundlePromiseType__Group__2 : rule__BundlePromiseType__Group__2__Impl rule__BundlePromiseType__Group__3 ;
    public final void rule__BundlePromiseType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1418:1: ( rule__BundlePromiseType__Group__2__Impl rule__BundlePromiseType__Group__3 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1419:2: rule__BundlePromiseType__Group__2__Impl rule__BundlePromiseType__Group__3
            {
            pushFollow(FOLLOW_rule__BundlePromiseType__Group__2__Impl_in_rule__BundlePromiseType__Group__22968);
            rule__BundlePromiseType__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BundlePromiseType__Group__3_in_rule__BundlePromiseType__Group__22971);
            rule__BundlePromiseType__Group__3();
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
    // $ANTLR end rule__BundlePromiseType__Group__2


    // $ANTLR start rule__BundlePromiseType__Group__2__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1426:1: rule__BundlePromiseType__Group__2__Impl : ( ( rule__BundlePromiseType__PromisesAssignment_2 )* ) ;
    public final void rule__BundlePromiseType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1430:1: ( ( ( rule__BundlePromiseType__PromisesAssignment_2 )* ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1431:1: ( ( rule__BundlePromiseType__PromisesAssignment_2 )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1431:1: ( ( rule__BundlePromiseType__PromisesAssignment_2 )* )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1432:1: ( rule__BundlePromiseType__PromisesAssignment_2 )*
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getPromisesAssignment_2()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1433:1: ( rule__BundlePromiseType__PromisesAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1433:2: rule__BundlePromiseType__PromisesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__BundlePromiseType__PromisesAssignment_2_in_rule__BundlePromiseType__Group__2__Impl2998);
            	    rule__BundlePromiseType__PromisesAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end rule__BundlePromiseType__Group__2__Impl


    // $ANTLR start rule__BundlePromiseType__Group__3
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1443:1: rule__BundlePromiseType__Group__3 : rule__BundlePromiseType__Group__3__Impl ;
    public final void rule__BundlePromiseType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1447:1: ( rule__BundlePromiseType__Group__3__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1448:2: rule__BundlePromiseType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BundlePromiseType__Group__3__Impl_in_rule__BundlePromiseType__Group__33029);
            rule__BundlePromiseType__Group__3__Impl();
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
    // $ANTLR end rule__BundlePromiseType__Group__3


    // $ANTLR start rule__BundlePromiseType__Group__3__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1454:1: rule__BundlePromiseType__Group__3__Impl : ( ( rule__BundlePromiseType__ClassesAssignment_3 )* ) ;
    public final void rule__BundlePromiseType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1458:1: ( ( ( rule__BundlePromiseType__ClassesAssignment_3 )* ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1459:1: ( ( rule__BundlePromiseType__ClassesAssignment_3 )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1459:1: ( ( rule__BundlePromiseType__ClassesAssignment_3 )* )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1460:1: ( rule__BundlePromiseType__ClassesAssignment_3 )*
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getClassesAssignment_3()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1461:1: ( rule__BundlePromiseType__ClassesAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    int LA14_2 = input.LA(2);

                    if ( (LA14_2==15||LA14_2==21) ) {
                        alt14=1;
                    }


                }
                else if ( (LA14_0==13||LA14_0==16) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1461:2: rule__BundlePromiseType__ClassesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__BundlePromiseType__ClassesAssignment_3_in_rule__BundlePromiseType__Group__3__Impl3056);
            	    rule__BundlePromiseType__ClassesAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end rule__BundlePromiseType__Group__3__Impl


    // $ANTLR start rule__BundleClass__Group__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1479:1: rule__BundleClass__Group__0 : rule__BundleClass__Group__0__Impl rule__BundleClass__Group__1 ;
    public final void rule__BundleClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1483:1: ( rule__BundleClass__Group__0__Impl rule__BundleClass__Group__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1484:2: rule__BundleClass__Group__0__Impl rule__BundleClass__Group__1
            {
            pushFollow(FOLLOW_rule__BundleClass__Group__0__Impl_in_rule__BundleClass__Group__03095);
            rule__BundleClass__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BundleClass__Group__1_in_rule__BundleClass__Group__03098);
            rule__BundleClass__Group__1();
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
    // $ANTLR end rule__BundleClass__Group__0


    // $ANTLR start rule__BundleClass__Group__0__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1491:1: rule__BundleClass__Group__0__Impl : ( ( rule__BundleClass__NameAssignment_0 ) ) ;
    public final void rule__BundleClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1495:1: ( ( ( rule__BundleClass__NameAssignment_0 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1496:1: ( ( rule__BundleClass__NameAssignment_0 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1496:1: ( ( rule__BundleClass__NameAssignment_0 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1497:1: ( rule__BundleClass__NameAssignment_0 )
            {
             before(grammarAccess.getBundleClassAccess().getNameAssignment_0()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1498:1: ( rule__BundleClass__NameAssignment_0 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1498:2: rule__BundleClass__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BundleClass__NameAssignment_0_in_rule__BundleClass__Group__0__Impl3125);
            rule__BundleClass__NameAssignment_0();
            _fsp--;


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
    // $ANTLR end rule__BundleClass__Group__0__Impl


    // $ANTLR start rule__BundleClass__Group__1
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1508:1: rule__BundleClass__Group__1 : rule__BundleClass__Group__1__Impl rule__BundleClass__Group__2 ;
    public final void rule__BundleClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1512:1: ( rule__BundleClass__Group__1__Impl rule__BundleClass__Group__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1513:2: rule__BundleClass__Group__1__Impl rule__BundleClass__Group__2
            {
            pushFollow(FOLLOW_rule__BundleClass__Group__1__Impl_in_rule__BundleClass__Group__13155);
            rule__BundleClass__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BundleClass__Group__2_in_rule__BundleClass__Group__13158);
            rule__BundleClass__Group__2();
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
    // $ANTLR end rule__BundleClass__Group__1


    // $ANTLR start rule__BundleClass__Group__1__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1520:1: rule__BundleClass__Group__1__Impl : ( '::' ) ;
    public final void rule__BundleClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1524:1: ( ( '::' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1525:1: ( '::' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1525:1: ( '::' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1526:1: '::'
            {
             before(grammarAccess.getBundleClassAccess().getColonColonKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__BundleClass__Group__1__Impl3186); 
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
    // $ANTLR end rule__BundleClass__Group__1__Impl


    // $ANTLR start rule__BundleClass__Group__2
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1539:1: rule__BundleClass__Group__2 : rule__BundleClass__Group__2__Impl ;
    public final void rule__BundleClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1543:1: ( rule__BundleClass__Group__2__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1544:2: rule__BundleClass__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BundleClass__Group__2__Impl_in_rule__BundleClass__Group__23217);
            rule__BundleClass__Group__2__Impl();
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
    // $ANTLR end rule__BundleClass__Group__2


    // $ANTLR start rule__BundleClass__Group__2__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1550:1: rule__BundleClass__Group__2__Impl : ( ( ( rule__BundleClass__PromisesAssignment_2 ) ) ( ( rule__BundleClass__PromisesAssignment_2 )* ) ) ;
    public final void rule__BundleClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1554:1: ( ( ( ( rule__BundleClass__PromisesAssignment_2 ) ) ( ( rule__BundleClass__PromisesAssignment_2 )* ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1555:1: ( ( ( rule__BundleClass__PromisesAssignment_2 ) ) ( ( rule__BundleClass__PromisesAssignment_2 )* ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1555:1: ( ( ( rule__BundleClass__PromisesAssignment_2 ) ) ( ( rule__BundleClass__PromisesAssignment_2 )* ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1556:1: ( ( rule__BundleClass__PromisesAssignment_2 ) ) ( ( rule__BundleClass__PromisesAssignment_2 )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1556:1: ( ( rule__BundleClass__PromisesAssignment_2 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1557:1: ( rule__BundleClass__PromisesAssignment_2 )
            {
             before(grammarAccess.getBundleClassAccess().getPromisesAssignment_2()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1558:1: ( rule__BundleClass__PromisesAssignment_2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1558:2: rule__BundleClass__PromisesAssignment_2
            {
            pushFollow(FOLLOW_rule__BundleClass__PromisesAssignment_2_in_rule__BundleClass__Group__2__Impl3246);
            rule__BundleClass__PromisesAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getBundleClassAccess().getPromisesAssignment_2()); 

            }

            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1561:1: ( ( rule__BundleClass__PromisesAssignment_2 )* )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1562:1: ( rule__BundleClass__PromisesAssignment_2 )*
            {
             before(grammarAccess.getBundleClassAccess().getPromisesAssignment_2()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1563:1: ( rule__BundleClass__PromisesAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_STRING) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1563:2: rule__BundleClass__PromisesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__BundleClass__PromisesAssignment_2_in_rule__BundleClass__Group__2__Impl3258);
            	    rule__BundleClass__PromisesAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end rule__BundleClass__Group__2__Impl


    // $ANTLR start rule__BundlePromise__Group__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1580:1: rule__BundlePromise__Group__0 : rule__BundlePromise__Group__0__Impl rule__BundlePromise__Group__1 ;
    public final void rule__BundlePromise__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1584:1: ( rule__BundlePromise__Group__0__Impl rule__BundlePromise__Group__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1585:2: rule__BundlePromise__Group__0__Impl rule__BundlePromise__Group__1
            {
            pushFollow(FOLLOW_rule__BundlePromise__Group__0__Impl_in_rule__BundlePromise__Group__03297);
            rule__BundlePromise__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BundlePromise__Group__1_in_rule__BundlePromise__Group__03300);
            rule__BundlePromise__Group__1();
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
    // $ANTLR end rule__BundlePromise__Group__0


    // $ANTLR start rule__BundlePromise__Group__0__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1592:1: rule__BundlePromise__Group__0__Impl : ( ( rule__BundlePromise__NameAssignment_0 ) ) ;
    public final void rule__BundlePromise__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1596:1: ( ( ( rule__BundlePromise__NameAssignment_0 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1597:1: ( ( rule__BundlePromise__NameAssignment_0 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1597:1: ( ( rule__BundlePromise__NameAssignment_0 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1598:1: ( rule__BundlePromise__NameAssignment_0 )
            {
             before(grammarAccess.getBundlePromiseAccess().getNameAssignment_0()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1599:1: ( rule__BundlePromise__NameAssignment_0 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1599:2: rule__BundlePromise__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BundlePromise__NameAssignment_0_in_rule__BundlePromise__Group__0__Impl3327);
            rule__BundlePromise__NameAssignment_0();
            _fsp--;


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
    // $ANTLR end rule__BundlePromise__Group__0__Impl


    // $ANTLR start rule__BundlePromise__Group__1
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1609:1: rule__BundlePromise__Group__1 : rule__BundlePromise__Group__1__Impl rule__BundlePromise__Group__2 ;
    public final void rule__BundlePromise__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1613:1: ( rule__BundlePromise__Group__1__Impl rule__BundlePromise__Group__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1614:2: rule__BundlePromise__Group__1__Impl rule__BundlePromise__Group__2
            {
            pushFollow(FOLLOW_rule__BundlePromise__Group__1__Impl_in_rule__BundlePromise__Group__13357);
            rule__BundlePromise__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BundlePromise__Group__2_in_rule__BundlePromise__Group__13360);
            rule__BundlePromise__Group__2();
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
    // $ANTLR end rule__BundlePromise__Group__1


    // $ANTLR start rule__BundlePromise__Group__1__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1621:1: rule__BundlePromise__Group__1__Impl : ( ( rule__BundlePromise__Group_1__0 )* ) ;
    public final void rule__BundlePromise__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1625:1: ( ( ( rule__BundlePromise__Group_1__0 )* ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1626:1: ( ( rule__BundlePromise__Group_1__0 )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1626:1: ( ( rule__BundlePromise__Group_1__0 )* )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1627:1: ( rule__BundlePromise__Group_1__0 )*
            {
             before(grammarAccess.getBundlePromiseAccess().getGroup_1()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1628:1: ( rule__BundlePromise__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1628:2: rule__BundlePromise__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__BundlePromise__Group_1__0_in_rule__BundlePromise__Group__1__Impl3387);
            	    rule__BundlePromise__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end rule__BundlePromise__Group__1__Impl


    // $ANTLR start rule__BundlePromise__Group__2
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1638:1: rule__BundlePromise__Group__2 : rule__BundlePromise__Group__2__Impl ;
    public final void rule__BundlePromise__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1642:1: ( rule__BundlePromise__Group__2__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1643:2: rule__BundlePromise__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BundlePromise__Group__2__Impl_in_rule__BundlePromise__Group__23418);
            rule__BundlePromise__Group__2__Impl();
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
    // $ANTLR end rule__BundlePromise__Group__2


    // $ANTLR start rule__BundlePromise__Group__2__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1649:1: rule__BundlePromise__Group__2__Impl : ( ';' ) ;
    public final void rule__BundlePromise__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1653:1: ( ( ';' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1654:1: ( ';' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1654:1: ( ';' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1655:1: ';'
            {
             before(grammarAccess.getBundlePromiseAccess().getSemicolonKeyword_2()); 
            match(input,11,FOLLOW_11_in_rule__BundlePromise__Group__2__Impl3446); 
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
    // $ANTLR end rule__BundlePromise__Group__2__Impl


    // $ANTLR start rule__BundlePromise__Group_1__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1674:1: rule__BundlePromise__Group_1__0 : rule__BundlePromise__Group_1__0__Impl rule__BundlePromise__Group_1__1 ;
    public final void rule__BundlePromise__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1678:1: ( rule__BundlePromise__Group_1__0__Impl rule__BundlePromise__Group_1__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1679:2: rule__BundlePromise__Group_1__0__Impl rule__BundlePromise__Group_1__1
            {
            pushFollow(FOLLOW_rule__BundlePromise__Group_1__0__Impl_in_rule__BundlePromise__Group_1__03483);
            rule__BundlePromise__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BundlePromise__Group_1__1_in_rule__BundlePromise__Group_1__03486);
            rule__BundlePromise__Group_1__1();
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
    // $ANTLR end rule__BundlePromise__Group_1__0


    // $ANTLR start rule__BundlePromise__Group_1__0__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1686:1: rule__BundlePromise__Group_1__0__Impl : ( ( rule__BundlePromise__ValuesAssignment_1_0 ) ) ;
    public final void rule__BundlePromise__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1690:1: ( ( ( rule__BundlePromise__ValuesAssignment_1_0 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1691:1: ( ( rule__BundlePromise__ValuesAssignment_1_0 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1691:1: ( ( rule__BundlePromise__ValuesAssignment_1_0 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1692:1: ( rule__BundlePromise__ValuesAssignment_1_0 )
            {
             before(grammarAccess.getBundlePromiseAccess().getValuesAssignment_1_0()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1693:1: ( rule__BundlePromise__ValuesAssignment_1_0 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1693:2: rule__BundlePromise__ValuesAssignment_1_0
            {
            pushFollow(FOLLOW_rule__BundlePromise__ValuesAssignment_1_0_in_rule__BundlePromise__Group_1__0__Impl3513);
            rule__BundlePromise__ValuesAssignment_1_0();
            _fsp--;


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
    // $ANTLR end rule__BundlePromise__Group_1__0__Impl


    // $ANTLR start rule__BundlePromise__Group_1__1
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1703:1: rule__BundlePromise__Group_1__1 : rule__BundlePromise__Group_1__1__Impl ;
    public final void rule__BundlePromise__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1707:1: ( rule__BundlePromise__Group_1__1__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1708:2: rule__BundlePromise__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BundlePromise__Group_1__1__Impl_in_rule__BundlePromise__Group_1__13543);
            rule__BundlePromise__Group_1__1__Impl();
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
    // $ANTLR end rule__BundlePromise__Group_1__1


    // $ANTLR start rule__BundlePromise__Group_1__1__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1714:1: rule__BundlePromise__Group_1__1__Impl : ( ( rule__BundlePromise__Group_1_1__0 )* ) ;
    public final void rule__BundlePromise__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1718:1: ( ( ( rule__BundlePromise__Group_1_1__0 )* ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1719:1: ( ( rule__BundlePromise__Group_1_1__0 )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1719:1: ( ( rule__BundlePromise__Group_1_1__0 )* )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1720:1: ( rule__BundlePromise__Group_1_1__0 )*
            {
             before(grammarAccess.getBundlePromiseAccess().getGroup_1_1()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1721:1: ( rule__BundlePromise__Group_1_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==12) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1721:2: rule__BundlePromise__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__BundlePromise__Group_1_1__0_in_rule__BundlePromise__Group_1__1__Impl3570);
            	    rule__BundlePromise__Group_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end rule__BundlePromise__Group_1__1__Impl


    // $ANTLR start rule__BundlePromise__Group_1_1__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1735:1: rule__BundlePromise__Group_1_1__0 : rule__BundlePromise__Group_1_1__0__Impl rule__BundlePromise__Group_1_1__1 ;
    public final void rule__BundlePromise__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1739:1: ( rule__BundlePromise__Group_1_1__0__Impl rule__BundlePromise__Group_1_1__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1740:2: rule__BundlePromise__Group_1_1__0__Impl rule__BundlePromise__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__BundlePromise__Group_1_1__0__Impl_in_rule__BundlePromise__Group_1_1__03605);
            rule__BundlePromise__Group_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BundlePromise__Group_1_1__1_in_rule__BundlePromise__Group_1_1__03608);
            rule__BundlePromise__Group_1_1__1();
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
    // $ANTLR end rule__BundlePromise__Group_1_1__0


    // $ANTLR start rule__BundlePromise__Group_1_1__0__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1747:1: rule__BundlePromise__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__BundlePromise__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1751:1: ( ( ',' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1752:1: ( ',' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1752:1: ( ',' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1753:1: ','
            {
             before(grammarAccess.getBundlePromiseAccess().getCommaKeyword_1_1_0()); 
            match(input,12,FOLLOW_12_in_rule__BundlePromise__Group_1_1__0__Impl3636); 
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
    // $ANTLR end rule__BundlePromise__Group_1_1__0__Impl


    // $ANTLR start rule__BundlePromise__Group_1_1__1
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1766:1: rule__BundlePromise__Group_1_1__1 : rule__BundlePromise__Group_1_1__1__Impl ;
    public final void rule__BundlePromise__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1770:1: ( rule__BundlePromise__Group_1_1__1__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1771:2: rule__BundlePromise__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BundlePromise__Group_1_1__1__Impl_in_rule__BundlePromise__Group_1_1__13667);
            rule__BundlePromise__Group_1_1__1__Impl();
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
    // $ANTLR end rule__BundlePromise__Group_1_1__1


    // $ANTLR start rule__BundlePromise__Group_1_1__1__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1777:1: rule__BundlePromise__Group_1_1__1__Impl : ( ( rule__BundlePromise__ValuesAssignment_1_1_1 ) ) ;
    public final void rule__BundlePromise__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1781:1: ( ( ( rule__BundlePromise__ValuesAssignment_1_1_1 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1782:1: ( ( rule__BundlePromise__ValuesAssignment_1_1_1 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1782:1: ( ( rule__BundlePromise__ValuesAssignment_1_1_1 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1783:1: ( rule__BundlePromise__ValuesAssignment_1_1_1 )
            {
             before(grammarAccess.getBundlePromiseAccess().getValuesAssignment_1_1_1()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1784:1: ( rule__BundlePromise__ValuesAssignment_1_1_1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1784:2: rule__BundlePromise__ValuesAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__BundlePromise__ValuesAssignment_1_1_1_in_rule__BundlePromise__Group_1_1__1__Impl3694);
            rule__BundlePromise__ValuesAssignment_1_1_1();
            _fsp--;


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
    // $ANTLR end rule__BundlePromise__Group_1_1__1__Impl


    // $ANTLR start rule__PromiseValue__Group__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1798:1: rule__PromiseValue__Group__0 : rule__PromiseValue__Group__0__Impl rule__PromiseValue__Group__1 ;
    public final void rule__PromiseValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1802:1: ( rule__PromiseValue__Group__0__Impl rule__PromiseValue__Group__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1803:2: rule__PromiseValue__Group__0__Impl rule__PromiseValue__Group__1
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group__0__Impl_in_rule__PromiseValue__Group__03728);
            rule__PromiseValue__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group__1_in_rule__PromiseValue__Group__03731);
            rule__PromiseValue__Group__1();
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
    // $ANTLR end rule__PromiseValue__Group__0


    // $ANTLR start rule__PromiseValue__Group__0__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1810:1: rule__PromiseValue__Group__0__Impl : ( ( rule__PromiseValue__KeywordAssignment_0 ) ) ;
    public final void rule__PromiseValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1814:1: ( ( ( rule__PromiseValue__KeywordAssignment_0 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1815:1: ( ( rule__PromiseValue__KeywordAssignment_0 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1815:1: ( ( rule__PromiseValue__KeywordAssignment_0 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1816:1: ( rule__PromiseValue__KeywordAssignment_0 )
            {
             before(grammarAccess.getPromiseValueAccess().getKeywordAssignment_0()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1817:1: ( rule__PromiseValue__KeywordAssignment_0 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1817:2: rule__PromiseValue__KeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__PromiseValue__KeywordAssignment_0_in_rule__PromiseValue__Group__0__Impl3758);
            rule__PromiseValue__KeywordAssignment_0();
            _fsp--;


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
    // $ANTLR end rule__PromiseValue__Group__0__Impl


    // $ANTLR start rule__PromiseValue__Group__1
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1827:1: rule__PromiseValue__Group__1 : rule__PromiseValue__Group__1__Impl rule__PromiseValue__Group__2 ;
    public final void rule__PromiseValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1831:1: ( rule__PromiseValue__Group__1__Impl rule__PromiseValue__Group__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1832:2: rule__PromiseValue__Group__1__Impl rule__PromiseValue__Group__2
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group__1__Impl_in_rule__PromiseValue__Group__13788);
            rule__PromiseValue__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group__2_in_rule__PromiseValue__Group__13791);
            rule__PromiseValue__Group__2();
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
    // $ANTLR end rule__PromiseValue__Group__1


    // $ANTLR start rule__PromiseValue__Group__1__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1839:1: rule__PromiseValue__Group__1__Impl : ( '=>' ) ;
    public final void rule__PromiseValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1843:1: ( ( '=>' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1844:1: ( '=>' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1844:1: ( '=>' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1845:1: '=>'
            {
             before(grammarAccess.getPromiseValueAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,10,FOLLOW_10_in_rule__PromiseValue__Group__1__Impl3819); 
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
    // $ANTLR end rule__PromiseValue__Group__1__Impl


    // $ANTLR start rule__PromiseValue__Group__2
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1858:1: rule__PromiseValue__Group__2 : rule__PromiseValue__Group__2__Impl ;
    public final void rule__PromiseValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1862:1: ( rule__PromiseValue__Group__2__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1863:2: rule__PromiseValue__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group__2__Impl_in_rule__PromiseValue__Group__23850);
            rule__PromiseValue__Group__2__Impl();
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
    // $ANTLR end rule__PromiseValue__Group__2


    // $ANTLR start rule__PromiseValue__Group__2__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1869:1: rule__PromiseValue__Group__2__Impl : ( ( rule__PromiseValue__Alternatives_2 ) ) ;
    public final void rule__PromiseValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1873:1: ( ( ( rule__PromiseValue__Alternatives_2 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1874:1: ( ( rule__PromiseValue__Alternatives_2 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1874:1: ( ( rule__PromiseValue__Alternatives_2 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1875:1: ( rule__PromiseValue__Alternatives_2 )
            {
             before(grammarAccess.getPromiseValueAccess().getAlternatives_2()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1876:1: ( rule__PromiseValue__Alternatives_2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1876:2: rule__PromiseValue__Alternatives_2
            {
            pushFollow(FOLLOW_rule__PromiseValue__Alternatives_2_in_rule__PromiseValue__Group__2__Impl3877);
            rule__PromiseValue__Alternatives_2();
            _fsp--;


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
    // $ANTLR end rule__PromiseValue__Group__2__Impl


    // $ANTLR start rule__PromiseValue__Group_2_1__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1892:1: rule__PromiseValue__Group_2_1__0 : rule__PromiseValue__Group_2_1__0__Impl rule__PromiseValue__Group_2_1__1 ;
    public final void rule__PromiseValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1896:1: ( rule__PromiseValue__Group_2_1__0__Impl rule__PromiseValue__Group_2_1__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1897:2: rule__PromiseValue__Group_2_1__0__Impl rule__PromiseValue__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1__0__Impl_in_rule__PromiseValue__Group_2_1__03913);
            rule__PromiseValue__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1__1_in_rule__PromiseValue__Group_2_1__03916);
            rule__PromiseValue__Group_2_1__1();
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
    // $ANTLR end rule__PromiseValue__Group_2_1__0


    // $ANTLR start rule__PromiseValue__Group_2_1__0__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1904:1: rule__PromiseValue__Group_2_1__0__Impl : ( '{' ) ;
    public final void rule__PromiseValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1908:1: ( ( '{' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1909:1: ( '{' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1909:1: ( '{' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1910:1: '{'
            {
             before(grammarAccess.getPromiseValueAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            match(input,18,FOLLOW_18_in_rule__PromiseValue__Group_2_1__0__Impl3944); 
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
    // $ANTLR end rule__PromiseValue__Group_2_1__0__Impl


    // $ANTLR start rule__PromiseValue__Group_2_1__1
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1923:1: rule__PromiseValue__Group_2_1__1 : rule__PromiseValue__Group_2_1__1__Impl rule__PromiseValue__Group_2_1__2 ;
    public final void rule__PromiseValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1927:1: ( rule__PromiseValue__Group_2_1__1__Impl rule__PromiseValue__Group_2_1__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1928:2: rule__PromiseValue__Group_2_1__1__Impl rule__PromiseValue__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1__1__Impl_in_rule__PromiseValue__Group_2_1__13975);
            rule__PromiseValue__Group_2_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1__2_in_rule__PromiseValue__Group_2_1__13978);
            rule__PromiseValue__Group_2_1__2();
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
    // $ANTLR end rule__PromiseValue__Group_2_1__1


    // $ANTLR start rule__PromiseValue__Group_2_1__1__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1935:1: rule__PromiseValue__Group_2_1__1__Impl : ( ( rule__PromiseValue__Alternatives_2_1_1 ) ) ;
    public final void rule__PromiseValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1939:1: ( ( ( rule__PromiseValue__Alternatives_2_1_1 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1940:1: ( ( rule__PromiseValue__Alternatives_2_1_1 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1940:1: ( ( rule__PromiseValue__Alternatives_2_1_1 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1941:1: ( rule__PromiseValue__Alternatives_2_1_1 )
            {
             before(grammarAccess.getPromiseValueAccess().getAlternatives_2_1_1()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1942:1: ( rule__PromiseValue__Alternatives_2_1_1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1942:2: rule__PromiseValue__Alternatives_2_1_1
            {
            pushFollow(FOLLOW_rule__PromiseValue__Alternatives_2_1_1_in_rule__PromiseValue__Group_2_1__1__Impl4005);
            rule__PromiseValue__Alternatives_2_1_1();
            _fsp--;


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
    // $ANTLR end rule__PromiseValue__Group_2_1__1__Impl


    // $ANTLR start rule__PromiseValue__Group_2_1__2
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1952:1: rule__PromiseValue__Group_2_1__2 : rule__PromiseValue__Group_2_1__2__Impl rule__PromiseValue__Group_2_1__3 ;
    public final void rule__PromiseValue__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1956:1: ( rule__PromiseValue__Group_2_1__2__Impl rule__PromiseValue__Group_2_1__3 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1957:2: rule__PromiseValue__Group_2_1__2__Impl rule__PromiseValue__Group_2_1__3
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1__2__Impl_in_rule__PromiseValue__Group_2_1__24035);
            rule__PromiseValue__Group_2_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1__3_in_rule__PromiseValue__Group_2_1__24038);
            rule__PromiseValue__Group_2_1__3();
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
    // $ANTLR end rule__PromiseValue__Group_2_1__2


    // $ANTLR start rule__PromiseValue__Group_2_1__2__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1964:1: rule__PromiseValue__Group_2_1__2__Impl : ( ( rule__PromiseValue__Group_2_1_2__0 )* ) ;
    public final void rule__PromiseValue__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1968:1: ( ( ( rule__PromiseValue__Group_2_1_2__0 )* ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1969:1: ( ( rule__PromiseValue__Group_2_1_2__0 )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1969:1: ( ( rule__PromiseValue__Group_2_1_2__0 )* )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1970:1: ( rule__PromiseValue__Group_2_1_2__0 )*
            {
             before(grammarAccess.getPromiseValueAccess().getGroup_2_1_2()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1971:1: ( rule__PromiseValue__Group_2_1_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==12) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1971:2: rule__PromiseValue__Group_2_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__PromiseValue__Group_2_1_2__0_in_rule__PromiseValue__Group_2_1__2__Impl4065);
            	    rule__PromiseValue__Group_2_1_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end rule__PromiseValue__Group_2_1__2__Impl


    // $ANTLR start rule__PromiseValue__Group_2_1__3
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1981:1: rule__PromiseValue__Group_2_1__3 : rule__PromiseValue__Group_2_1__3__Impl ;
    public final void rule__PromiseValue__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1985:1: ( rule__PromiseValue__Group_2_1__3__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1986:2: rule__PromiseValue__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1__3__Impl_in_rule__PromiseValue__Group_2_1__34096);
            rule__PromiseValue__Group_2_1__3__Impl();
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
    // $ANTLR end rule__PromiseValue__Group_2_1__3


    // $ANTLR start rule__PromiseValue__Group_2_1__3__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1992:1: rule__PromiseValue__Group_2_1__3__Impl : ( '}' ) ;
    public final void rule__PromiseValue__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1996:1: ( ( '}' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1997:1: ( '}' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1997:1: ( '}' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1998:1: '}'
            {
             before(grammarAccess.getPromiseValueAccess().getRightCurlyBracketKeyword_2_1_3()); 
            match(input,19,FOLLOW_19_in_rule__PromiseValue__Group_2_1__3__Impl4124); 
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
    // $ANTLR end rule__PromiseValue__Group_2_1__3__Impl


    // $ANTLR start rule__PromiseValue__Group_2_1_2__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2019:1: rule__PromiseValue__Group_2_1_2__0 : rule__PromiseValue__Group_2_1_2__0__Impl rule__PromiseValue__Group_2_1_2__1 ;
    public final void rule__PromiseValue__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2023:1: ( rule__PromiseValue__Group_2_1_2__0__Impl rule__PromiseValue__Group_2_1_2__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2024:2: rule__PromiseValue__Group_2_1_2__0__Impl rule__PromiseValue__Group_2_1_2__1
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1_2__0__Impl_in_rule__PromiseValue__Group_2_1_2__04163);
            rule__PromiseValue__Group_2_1_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1_2__1_in_rule__PromiseValue__Group_2_1_2__04166);
            rule__PromiseValue__Group_2_1_2__1();
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
    // $ANTLR end rule__PromiseValue__Group_2_1_2__0


    // $ANTLR start rule__PromiseValue__Group_2_1_2__0__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2031:1: rule__PromiseValue__Group_2_1_2__0__Impl : ( ',' ) ;
    public final void rule__PromiseValue__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2035:1: ( ( ',' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2036:1: ( ',' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2036:1: ( ',' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2037:1: ','
            {
             before(grammarAccess.getPromiseValueAccess().getCommaKeyword_2_1_2_0()); 
            match(input,12,FOLLOW_12_in_rule__PromiseValue__Group_2_1_2__0__Impl4194); 
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
    // $ANTLR end rule__PromiseValue__Group_2_1_2__0__Impl


    // $ANTLR start rule__PromiseValue__Group_2_1_2__1
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2050:1: rule__PromiseValue__Group_2_1_2__1 : rule__PromiseValue__Group_2_1_2__1__Impl ;
    public final void rule__PromiseValue__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2054:1: ( rule__PromiseValue__Group_2_1_2__1__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2055:2: rule__PromiseValue__Group_2_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1_2__1__Impl_in_rule__PromiseValue__Group_2_1_2__14225);
            rule__PromiseValue__Group_2_1_2__1__Impl();
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
    // $ANTLR end rule__PromiseValue__Group_2_1_2__1


    // $ANTLR start rule__PromiseValue__Group_2_1_2__1__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2061:1: rule__PromiseValue__Group_2_1_2__1__Impl : ( ( rule__PromiseValue__Alternatives_2_1_2_1 ) ) ;
    public final void rule__PromiseValue__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2065:1: ( ( ( rule__PromiseValue__Alternatives_2_1_2_1 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2066:1: ( ( rule__PromiseValue__Alternatives_2_1_2_1 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2066:1: ( ( rule__PromiseValue__Alternatives_2_1_2_1 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2067:1: ( rule__PromiseValue__Alternatives_2_1_2_1 )
            {
             before(grammarAccess.getPromiseValueAccess().getAlternatives_2_1_2_1()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2068:1: ( rule__PromiseValue__Alternatives_2_1_2_1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2068:2: rule__PromiseValue__Alternatives_2_1_2_1
            {
            pushFollow(FOLLOW_rule__PromiseValue__Alternatives_2_1_2_1_in_rule__PromiseValue__Group_2_1_2__1__Impl4252);
            rule__PromiseValue__Alternatives_2_1_2_1();
            _fsp--;


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
    // $ANTLR end rule__PromiseValue__Group_2_1_2__1__Impl


    // $ANTLR start rule__PromiseValue__Group_2_2__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2082:1: rule__PromiseValue__Group_2_2__0 : rule__PromiseValue__Group_2_2__0__Impl rule__PromiseValue__Group_2_2__1 ;
    public final void rule__PromiseValue__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2086:1: ( rule__PromiseValue__Group_2_2__0__Impl rule__PromiseValue__Group_2_2__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2087:2: rule__PromiseValue__Group_2_2__0__Impl rule__PromiseValue__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__0__Impl_in_rule__PromiseValue__Group_2_2__04286);
            rule__PromiseValue__Group_2_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__1_in_rule__PromiseValue__Group_2_2__04289);
            rule__PromiseValue__Group_2_2__1();
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
    // $ANTLR end rule__PromiseValue__Group_2_2__0


    // $ANTLR start rule__PromiseValue__Group_2_2__0__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2094:1: rule__PromiseValue__Group_2_2__0__Impl : ( '{' ) ;
    public final void rule__PromiseValue__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2098:1: ( ( '{' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2099:1: ( '{' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2099:1: ( '{' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2100:1: '{'
            {
             before(grammarAccess.getPromiseValueAccess().getLeftCurlyBracketKeyword_2_2_0()); 
            match(input,18,FOLLOW_18_in_rule__PromiseValue__Group_2_2__0__Impl4317); 
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
    // $ANTLR end rule__PromiseValue__Group_2_2__0__Impl


    // $ANTLR start rule__PromiseValue__Group_2_2__1
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2113:1: rule__PromiseValue__Group_2_2__1 : rule__PromiseValue__Group_2_2__1__Impl rule__PromiseValue__Group_2_2__2 ;
    public final void rule__PromiseValue__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2117:1: ( rule__PromiseValue__Group_2_2__1__Impl rule__PromiseValue__Group_2_2__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2118:2: rule__PromiseValue__Group_2_2__1__Impl rule__PromiseValue__Group_2_2__2
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__1__Impl_in_rule__PromiseValue__Group_2_2__14348);
            rule__PromiseValue__Group_2_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__2_in_rule__PromiseValue__Group_2_2__14351);
            rule__PromiseValue__Group_2_2__2();
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
    // $ANTLR end rule__PromiseValue__Group_2_2__1


    // $ANTLR start rule__PromiseValue__Group_2_2__1__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2125:1: rule__PromiseValue__Group_2_2__1__Impl : ( '@' ) ;
    public final void rule__PromiseValue__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2129:1: ( ( '@' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2130:1: ( '@' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2130:1: ( '@' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2131:1: '@'
            {
             before(grammarAccess.getPromiseValueAccess().getCommercialAtKeyword_2_2_1()); 
            match(input,22,FOLLOW_22_in_rule__PromiseValue__Group_2_2__1__Impl4379); 
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
    // $ANTLR end rule__PromiseValue__Group_2_2__1__Impl


    // $ANTLR start rule__PromiseValue__Group_2_2__2
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2144:1: rule__PromiseValue__Group_2_2__2 : rule__PromiseValue__Group_2_2__2__Impl rule__PromiseValue__Group_2_2__3 ;
    public final void rule__PromiseValue__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2148:1: ( rule__PromiseValue__Group_2_2__2__Impl rule__PromiseValue__Group_2_2__3 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2149:2: rule__PromiseValue__Group_2_2__2__Impl rule__PromiseValue__Group_2_2__3
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__2__Impl_in_rule__PromiseValue__Group_2_2__24410);
            rule__PromiseValue__Group_2_2__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__3_in_rule__PromiseValue__Group_2_2__24413);
            rule__PromiseValue__Group_2_2__3();
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
    // $ANTLR end rule__PromiseValue__Group_2_2__2


    // $ANTLR start rule__PromiseValue__Group_2_2__2__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2156:1: rule__PromiseValue__Group_2_2__2__Impl : ( '(' ) ;
    public final void rule__PromiseValue__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2160:1: ( ( '(' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2161:1: ( '(' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2161:1: ( '(' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2162:1: '('
            {
             before(grammarAccess.getPromiseValueAccess().getLeftParenthesisKeyword_2_2_2()); 
            match(input,13,FOLLOW_13_in_rule__PromiseValue__Group_2_2__2__Impl4441); 
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
    // $ANTLR end rule__PromiseValue__Group_2_2__2__Impl


    // $ANTLR start rule__PromiseValue__Group_2_2__3
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2175:1: rule__PromiseValue__Group_2_2__3 : rule__PromiseValue__Group_2_2__3__Impl rule__PromiseValue__Group_2_2__4 ;
    public final void rule__PromiseValue__Group_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2179:1: ( rule__PromiseValue__Group_2_2__3__Impl rule__PromiseValue__Group_2_2__4 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2180:2: rule__PromiseValue__Group_2_2__3__Impl rule__PromiseValue__Group_2_2__4
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__3__Impl_in_rule__PromiseValue__Group_2_2__34472);
            rule__PromiseValue__Group_2_2__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__4_in_rule__PromiseValue__Group_2_2__34475);
            rule__PromiseValue__Group_2_2__4();
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
    // $ANTLR end rule__PromiseValue__Group_2_2__3


    // $ANTLR start rule__PromiseValue__Group_2_2__3__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2187:1: rule__PromiseValue__Group_2_2__3__Impl : ( RULE_ID ) ;
    public final void rule__PromiseValue__Group_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2191:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2192:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2192:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2193:1: RULE_ID
            {
             before(grammarAccess.getPromiseValueAccess().getIDTerminalRuleCall_2_2_3()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PromiseValue__Group_2_2__3__Impl4502); 
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
    // $ANTLR end rule__PromiseValue__Group_2_2__3__Impl


    // $ANTLR start rule__PromiseValue__Group_2_2__4
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2204:1: rule__PromiseValue__Group_2_2__4 : rule__PromiseValue__Group_2_2__4__Impl rule__PromiseValue__Group_2_2__5 ;
    public final void rule__PromiseValue__Group_2_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2208:1: ( rule__PromiseValue__Group_2_2__4__Impl rule__PromiseValue__Group_2_2__5 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2209:2: rule__PromiseValue__Group_2_2__4__Impl rule__PromiseValue__Group_2_2__5
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__4__Impl_in_rule__PromiseValue__Group_2_2__44531);
            rule__PromiseValue__Group_2_2__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__5_in_rule__PromiseValue__Group_2_2__44534);
            rule__PromiseValue__Group_2_2__5();
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
    // $ANTLR end rule__PromiseValue__Group_2_2__4


    // $ANTLR start rule__PromiseValue__Group_2_2__4__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2216:1: rule__PromiseValue__Group_2_2__4__Impl : ( ')' ) ;
    public final void rule__PromiseValue__Group_2_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2220:1: ( ( ')' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2221:1: ( ')' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2221:1: ( ')' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2222:1: ')'
            {
             before(grammarAccess.getPromiseValueAccess().getRightParenthesisKeyword_2_2_4()); 
            match(input,14,FOLLOW_14_in_rule__PromiseValue__Group_2_2__4__Impl4562); 
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
    // $ANTLR end rule__PromiseValue__Group_2_2__4__Impl


    // $ANTLR start rule__PromiseValue__Group_2_2__5
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2235:1: rule__PromiseValue__Group_2_2__5 : rule__PromiseValue__Group_2_2__5__Impl ;
    public final void rule__PromiseValue__Group_2_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2239:1: ( rule__PromiseValue__Group_2_2__5__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2240:2: rule__PromiseValue__Group_2_2__5__Impl
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__5__Impl_in_rule__PromiseValue__Group_2_2__54593);
            rule__PromiseValue__Group_2_2__5__Impl();
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
    // $ANTLR end rule__PromiseValue__Group_2_2__5


    // $ANTLR start rule__PromiseValue__Group_2_2__5__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2246:1: rule__PromiseValue__Group_2_2__5__Impl : ( '}' ) ;
    public final void rule__PromiseValue__Group_2_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2250:1: ( ( '}' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2251:1: ( '}' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2251:1: ( '}' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2252:1: '}'
            {
             before(grammarAccess.getPromiseValueAccess().getRightCurlyBracketKeyword_2_2_5()); 
            match(input,19,FOLLOW_19_in_rule__PromiseValue__Group_2_2__5__Impl4621); 
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
    // $ANTLR end rule__PromiseValue__Group_2_2__5__Impl


    // $ANTLR start rule__Body__Group__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2277:1: rule__Body__Group__0 : rule__Body__Group__0__Impl rule__Body__Group__1 ;
    public final void rule__Body__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2281:1: ( rule__Body__Group__0__Impl rule__Body__Group__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2282:2: rule__Body__Group__0__Impl rule__Body__Group__1
            {
            pushFollow(FOLLOW_rule__Body__Group__0__Impl_in_rule__Body__Group__04664);
            rule__Body__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__1_in_rule__Body__Group__04667);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2289:1: rule__Body__Group__0__Impl : ( 'body' ) ;
    public final void rule__Body__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2293:1: ( ( 'body' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2294:1: ( 'body' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2294:1: ( 'body' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2295:1: 'body'
            {
             before(grammarAccess.getBodyAccess().getBodyKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Body__Group__0__Impl4695); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2308:1: rule__Body__Group__1 : rule__Body__Group__1__Impl rule__Body__Group__2 ;
    public final void rule__Body__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2312:1: ( rule__Body__Group__1__Impl rule__Body__Group__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2313:2: rule__Body__Group__1__Impl rule__Body__Group__2
            {
            pushFollow(FOLLOW_rule__Body__Group__1__Impl_in_rule__Body__Group__14726);
            rule__Body__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__2_in_rule__Body__Group__14729);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2320:1: rule__Body__Group__1__Impl : ( ( rule__Body__ComponentAssignment_1 ) ) ;
    public final void rule__Body__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2324:1: ( ( ( rule__Body__ComponentAssignment_1 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2325:1: ( ( rule__Body__ComponentAssignment_1 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2325:1: ( ( rule__Body__ComponentAssignment_1 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2326:1: ( rule__Body__ComponentAssignment_1 )
            {
             before(grammarAccess.getBodyAccess().getComponentAssignment_1()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2327:1: ( rule__Body__ComponentAssignment_1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2327:2: rule__Body__ComponentAssignment_1
            {
            pushFollow(FOLLOW_rule__Body__ComponentAssignment_1_in_rule__Body__Group__1__Impl4756);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2337:1: rule__Body__Group__2 : rule__Body__Group__2__Impl rule__Body__Group__3 ;
    public final void rule__Body__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2341:1: ( rule__Body__Group__2__Impl rule__Body__Group__3 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2342:2: rule__Body__Group__2__Impl rule__Body__Group__3
            {
            pushFollow(FOLLOW_rule__Body__Group__2__Impl_in_rule__Body__Group__24786);
            rule__Body__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__3_in_rule__Body__Group__24789);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2349:1: rule__Body__Group__2__Impl : ( ( rule__Body__NameAssignment_2 ) ) ;
    public final void rule__Body__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2353:1: ( ( ( rule__Body__NameAssignment_2 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2354:1: ( ( rule__Body__NameAssignment_2 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2354:1: ( ( rule__Body__NameAssignment_2 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2355:1: ( rule__Body__NameAssignment_2 )
            {
             before(grammarAccess.getBodyAccess().getNameAssignment_2()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2356:1: ( rule__Body__NameAssignment_2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2356:2: rule__Body__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Body__NameAssignment_2_in_rule__Body__Group__2__Impl4816);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2366:1: rule__Body__Group__3 : rule__Body__Group__3__Impl rule__Body__Group__4 ;
    public final void rule__Body__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2370:1: ( rule__Body__Group__3__Impl rule__Body__Group__4 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2371:2: rule__Body__Group__3__Impl rule__Body__Group__4
            {
            pushFollow(FOLLOW_rule__Body__Group__3__Impl_in_rule__Body__Group__34846);
            rule__Body__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__4_in_rule__Body__Group__34849);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2378:1: rule__Body__Group__3__Impl : ( ( rule__Body__Group_3__0 )? ) ;
    public final void rule__Body__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2382:1: ( ( ( rule__Body__Group_3__0 )? ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2383:1: ( ( rule__Body__Group_3__0 )? )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2383:1: ( ( rule__Body__Group_3__0 )? )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2384:1: ( rule__Body__Group_3__0 )?
            {
             before(grammarAccess.getBodyAccess().getGroup_3()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2385:1: ( rule__Body__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==13) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2385:2: rule__Body__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Body__Group_3__0_in_rule__Body__Group__3__Impl4876);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2395:1: rule__Body__Group__4 : rule__Body__Group__4__Impl rule__Body__Group__5 ;
    public final void rule__Body__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2399:1: ( rule__Body__Group__4__Impl rule__Body__Group__5 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2400:2: rule__Body__Group__4__Impl rule__Body__Group__5
            {
            pushFollow(FOLLOW_rule__Body__Group__4__Impl_in_rule__Body__Group__44907);
            rule__Body__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__5_in_rule__Body__Group__44910);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2407:1: rule__Body__Group__4__Impl : ( '{' ) ;
    public final void rule__Body__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2411:1: ( ( '{' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2412:1: ( '{' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2412:1: ( '{' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2413:1: '{'
            {
             before(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Body__Group__4__Impl4938); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2426:1: rule__Body__Group__5 : rule__Body__Group__5__Impl rule__Body__Group__6 ;
    public final void rule__Body__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2430:1: ( rule__Body__Group__5__Impl rule__Body__Group__6 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2431:2: rule__Body__Group__5__Impl rule__Body__Group__6
            {
            pushFollow(FOLLOW_rule__Body__Group__5__Impl_in_rule__Body__Group__54969);
            rule__Body__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__6_in_rule__Body__Group__54972);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2438:1: rule__Body__Group__5__Impl : ( ( rule__Body__PromiseTypeAssignment_5 )* ) ;
    public final void rule__Body__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2442:1: ( ( ( rule__Body__PromiseTypeAssignment_5 )* ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2443:1: ( ( rule__Body__PromiseTypeAssignment_5 )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2443:1: ( ( rule__Body__PromiseTypeAssignment_5 )* )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2444:1: ( rule__Body__PromiseTypeAssignment_5 )*
            {
             before(grammarAccess.getBodyAccess().getPromiseTypeAssignment_5()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2445:1: ( rule__Body__PromiseTypeAssignment_5 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1==10) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2445:2: rule__Body__PromiseTypeAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Body__PromiseTypeAssignment_5_in_rule__Body__Group__5__Impl4999);
            	    rule__Body__PromiseTypeAssignment_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2455:1: rule__Body__Group__6 : rule__Body__Group__6__Impl rule__Body__Group__7 ;
    public final void rule__Body__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2459:1: ( rule__Body__Group__6__Impl rule__Body__Group__7 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2460:2: rule__Body__Group__6__Impl rule__Body__Group__7
            {
            pushFollow(FOLLOW_rule__Body__Group__6__Impl_in_rule__Body__Group__65030);
            rule__Body__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__7_in_rule__Body__Group__65033);
            rule__Body__Group__7();
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2467:1: rule__Body__Group__6__Impl : ( ( rule__Body__ClassesAssignment_6 )* ) ;
    public final void rule__Body__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2471:1: ( ( ( rule__Body__ClassesAssignment_6 )* ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2472:1: ( ( rule__Body__ClassesAssignment_6 )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2472:1: ( ( rule__Body__ClassesAssignment_6 )* )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2473:1: ( rule__Body__ClassesAssignment_6 )*
            {
             before(grammarAccess.getBodyAccess().getClassesAssignment_6()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2474:1: ( rule__Body__ClassesAssignment_6 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||LA21_0==13||LA21_0==16) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2474:2: rule__Body__ClassesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Body__ClassesAssignment_6_in_rule__Body__Group__6__Impl5060);
            	    rule__Body__ClassesAssignment_6();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end rule__Body__Group__6__Impl


    // $ANTLR start rule__Body__Group__7
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2484:1: rule__Body__Group__7 : rule__Body__Group__7__Impl ;
    public final void rule__Body__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2488:1: ( rule__Body__Group__7__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2489:2: rule__Body__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group__7__Impl_in_rule__Body__Group__75091);
            rule__Body__Group__7__Impl();
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
    // $ANTLR end rule__Body__Group__7


    // $ANTLR start rule__Body__Group__7__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2495:1: rule__Body__Group__7__Impl : ( '}' ) ;
    public final void rule__Body__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2499:1: ( ( '}' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2500:1: ( '}' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2500:1: ( '}' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2501:1: '}'
            {
             before(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_19_in_rule__Body__Group__7__Impl5119); 
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
    // $ANTLR end rule__Body__Group__7__Impl


    // $ANTLR start rule__Body__Group_3__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2530:1: rule__Body__Group_3__0 : rule__Body__Group_3__0__Impl rule__Body__Group_3__1 ;
    public final void rule__Body__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2534:1: ( rule__Body__Group_3__0__Impl rule__Body__Group_3__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2535:2: rule__Body__Group_3__0__Impl rule__Body__Group_3__1
            {
            pushFollow(FOLLOW_rule__Body__Group_3__0__Impl_in_rule__Body__Group_3__05166);
            rule__Body__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group_3__1_in_rule__Body__Group_3__05169);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2542:1: rule__Body__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Body__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2546:1: ( ( '(' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2547:1: ( '(' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2547:1: ( '(' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2548:1: '('
            {
             before(grammarAccess.getBodyAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,13,FOLLOW_13_in_rule__Body__Group_3__0__Impl5197); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2561:1: rule__Body__Group_3__1 : rule__Body__Group_3__1__Impl rule__Body__Group_3__2 ;
    public final void rule__Body__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2565:1: ( rule__Body__Group_3__1__Impl rule__Body__Group_3__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2566:2: rule__Body__Group_3__1__Impl rule__Body__Group_3__2
            {
            pushFollow(FOLLOW_rule__Body__Group_3__1__Impl_in_rule__Body__Group_3__15228);
            rule__Body__Group_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group_3__2_in_rule__Body__Group_3__15231);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2573:1: rule__Body__Group_3__1__Impl : ( ( rule__Body__VariablesAssignment_3_1 ) ) ;
    public final void rule__Body__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2577:1: ( ( ( rule__Body__VariablesAssignment_3_1 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2578:1: ( ( rule__Body__VariablesAssignment_3_1 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2578:1: ( ( rule__Body__VariablesAssignment_3_1 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2579:1: ( rule__Body__VariablesAssignment_3_1 )
            {
             before(grammarAccess.getBodyAccess().getVariablesAssignment_3_1()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2580:1: ( rule__Body__VariablesAssignment_3_1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2580:2: rule__Body__VariablesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Body__VariablesAssignment_3_1_in_rule__Body__Group_3__1__Impl5258);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2590:1: rule__Body__Group_3__2 : rule__Body__Group_3__2__Impl rule__Body__Group_3__3 ;
    public final void rule__Body__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2594:1: ( rule__Body__Group_3__2__Impl rule__Body__Group_3__3 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2595:2: rule__Body__Group_3__2__Impl rule__Body__Group_3__3
            {
            pushFollow(FOLLOW_rule__Body__Group_3__2__Impl_in_rule__Body__Group_3__25288);
            rule__Body__Group_3__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group_3__3_in_rule__Body__Group_3__25291);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2602:1: rule__Body__Group_3__2__Impl : ( ( rule__Body__Group_3_2__0 )* ) ;
    public final void rule__Body__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2606:1: ( ( ( rule__Body__Group_3_2__0 )* ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2607:1: ( ( rule__Body__Group_3_2__0 )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2607:1: ( ( rule__Body__Group_3_2__0 )* )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2608:1: ( rule__Body__Group_3_2__0 )*
            {
             before(grammarAccess.getBodyAccess().getGroup_3_2()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2609:1: ( rule__Body__Group_3_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==12) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2609:2: rule__Body__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Body__Group_3_2__0_in_rule__Body__Group_3__2__Impl5318);
            	    rule__Body__Group_3_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2619:1: rule__Body__Group_3__3 : rule__Body__Group_3__3__Impl ;
    public final void rule__Body__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2623:1: ( rule__Body__Group_3__3__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2624:2: rule__Body__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group_3__3__Impl_in_rule__Body__Group_3__35349);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2630:1: rule__Body__Group_3__3__Impl : ( ')' ) ;
    public final void rule__Body__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2634:1: ( ( ')' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2635:1: ( ')' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2635:1: ( ')' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2636:1: ')'
            {
             before(grammarAccess.getBodyAccess().getRightParenthesisKeyword_3_3()); 
            match(input,14,FOLLOW_14_in_rule__Body__Group_3__3__Impl5377); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2657:1: rule__Body__Group_3_2__0 : rule__Body__Group_3_2__0__Impl rule__Body__Group_3_2__1 ;
    public final void rule__Body__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2661:1: ( rule__Body__Group_3_2__0__Impl rule__Body__Group_3_2__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2662:2: rule__Body__Group_3_2__0__Impl rule__Body__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Body__Group_3_2__0__Impl_in_rule__Body__Group_3_2__05416);
            rule__Body__Group_3_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group_3_2__1_in_rule__Body__Group_3_2__05419);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2669:1: rule__Body__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Body__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2673:1: ( ( ',' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2674:1: ( ',' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2674:1: ( ',' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2675:1: ','
            {
             before(grammarAccess.getBodyAccess().getCommaKeyword_3_2_0()); 
            match(input,12,FOLLOW_12_in_rule__Body__Group_3_2__0__Impl5447); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2688:1: rule__Body__Group_3_2__1 : rule__Body__Group_3_2__1__Impl ;
    public final void rule__Body__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2692:1: ( rule__Body__Group_3_2__1__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2693:2: rule__Body__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group_3_2__1__Impl_in_rule__Body__Group_3_2__15478);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2699:1: rule__Body__Group_3_2__1__Impl : ( ( rule__Body__VariablesAssignment_3_2_1 ) ) ;
    public final void rule__Body__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2703:1: ( ( ( rule__Body__VariablesAssignment_3_2_1 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2704:1: ( ( rule__Body__VariablesAssignment_3_2_1 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2704:1: ( ( rule__Body__VariablesAssignment_3_2_1 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2705:1: ( rule__Body__VariablesAssignment_3_2_1 )
            {
             before(grammarAccess.getBodyAccess().getVariablesAssignment_3_2_1()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2706:1: ( rule__Body__VariablesAssignment_3_2_1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2706:2: rule__Body__VariablesAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Body__VariablesAssignment_3_2_1_in_rule__Body__Group_3_2__1__Impl5505);
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


    // $ANTLR start rule__BodyClass__Group__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2720:1: rule__BodyClass__Group__0 : rule__BodyClass__Group__0__Impl rule__BodyClass__Group__1 ;
    public final void rule__BodyClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2724:1: ( rule__BodyClass__Group__0__Impl rule__BodyClass__Group__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2725:2: rule__BodyClass__Group__0__Impl rule__BodyClass__Group__1
            {
            pushFollow(FOLLOW_rule__BodyClass__Group__0__Impl_in_rule__BodyClass__Group__05539);
            rule__BodyClass__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyClass__Group__1_in_rule__BodyClass__Group__05542);
            rule__BodyClass__Group__1();
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
    // $ANTLR end rule__BodyClass__Group__0


    // $ANTLR start rule__BodyClass__Group__0__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2732:1: rule__BodyClass__Group__0__Impl : ( ( rule__BodyClass__NameAssignment_0 ) ) ;
    public final void rule__BodyClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2736:1: ( ( ( rule__BodyClass__NameAssignment_0 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2737:1: ( ( rule__BodyClass__NameAssignment_0 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2737:1: ( ( rule__BodyClass__NameAssignment_0 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2738:1: ( rule__BodyClass__NameAssignment_0 )
            {
             before(grammarAccess.getBodyClassAccess().getNameAssignment_0()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2739:1: ( rule__BodyClass__NameAssignment_0 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2739:2: rule__BodyClass__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BodyClass__NameAssignment_0_in_rule__BodyClass__Group__0__Impl5569);
            rule__BodyClass__NameAssignment_0();
            _fsp--;


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
    // $ANTLR end rule__BodyClass__Group__0__Impl


    // $ANTLR start rule__BodyClass__Group__1
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2749:1: rule__BodyClass__Group__1 : rule__BodyClass__Group__1__Impl rule__BodyClass__Group__2 ;
    public final void rule__BodyClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2753:1: ( rule__BodyClass__Group__1__Impl rule__BodyClass__Group__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2754:2: rule__BodyClass__Group__1__Impl rule__BodyClass__Group__2
            {
            pushFollow(FOLLOW_rule__BodyClass__Group__1__Impl_in_rule__BodyClass__Group__15599);
            rule__BodyClass__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyClass__Group__2_in_rule__BodyClass__Group__15602);
            rule__BodyClass__Group__2();
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
    // $ANTLR end rule__BodyClass__Group__1


    // $ANTLR start rule__BodyClass__Group__1__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2761:1: rule__BodyClass__Group__1__Impl : ( '::' ) ;
    public final void rule__BodyClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2765:1: ( ( '::' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2766:1: ( '::' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2766:1: ( '::' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2767:1: '::'
            {
             before(grammarAccess.getBodyClassAccess().getColonColonKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__BodyClass__Group__1__Impl5630); 
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
    // $ANTLR end rule__BodyClass__Group__1__Impl


    // $ANTLR start rule__BodyClass__Group__2
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2780:1: rule__BodyClass__Group__2 : rule__BodyClass__Group__2__Impl ;
    public final void rule__BodyClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2784:1: ( rule__BodyClass__Group__2__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2785:2: rule__BodyClass__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BodyClass__Group__2__Impl_in_rule__BodyClass__Group__25661);
            rule__BodyClass__Group__2__Impl();
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
    // $ANTLR end rule__BodyClass__Group__2


    // $ANTLR start rule__BodyClass__Group__2__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2791:1: rule__BodyClass__Group__2__Impl : ( ( rule__BodyClass__PromiseTypeAssignment_2 )* ) ;
    public final void rule__BodyClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2795:1: ( ( ( rule__BodyClass__PromiseTypeAssignment_2 )* ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2796:1: ( ( rule__BodyClass__PromiseTypeAssignment_2 )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2796:1: ( ( rule__BodyClass__PromiseTypeAssignment_2 )* )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2797:1: ( rule__BodyClass__PromiseTypeAssignment_2 )*
            {
             before(grammarAccess.getBodyClassAccess().getPromiseTypeAssignment_2()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2798:1: ( rule__BodyClass__PromiseTypeAssignment_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    int LA23_2 = input.LA(2);

                    if ( (LA23_2==10) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2798:2: rule__BodyClass__PromiseTypeAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__BodyClass__PromiseTypeAssignment_2_in_rule__BodyClass__Group__2__Impl5688);
            	    rule__BodyClass__PromiseTypeAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // $ANTLR end rule__BodyClass__Group__2__Impl


    // $ANTLR start rule__BodyFunction__Group__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2814:1: rule__BodyFunction__Group__0 : rule__BodyFunction__Group__0__Impl rule__BodyFunction__Group__1 ;
    public final void rule__BodyFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2818:1: ( rule__BodyFunction__Group__0__Impl rule__BodyFunction__Group__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2819:2: rule__BodyFunction__Group__0__Impl rule__BodyFunction__Group__1
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group__0__Impl_in_rule__BodyFunction__Group__05725);
            rule__BodyFunction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group__1_in_rule__BodyFunction__Group__05728);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2826:1: rule__BodyFunction__Group__0__Impl : ( ( rule__BodyFunction__NameAssignment_0 ) ) ;
    public final void rule__BodyFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2830:1: ( ( ( rule__BodyFunction__NameAssignment_0 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2831:1: ( ( rule__BodyFunction__NameAssignment_0 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2831:1: ( ( rule__BodyFunction__NameAssignment_0 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2832:1: ( rule__BodyFunction__NameAssignment_0 )
            {
             before(grammarAccess.getBodyFunctionAccess().getNameAssignment_0()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2833:1: ( rule__BodyFunction__NameAssignment_0 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2833:2: rule__BodyFunction__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BodyFunction__NameAssignment_0_in_rule__BodyFunction__Group__0__Impl5755);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2843:1: rule__BodyFunction__Group__1 : rule__BodyFunction__Group__1__Impl rule__BodyFunction__Group__2 ;
    public final void rule__BodyFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2847:1: ( rule__BodyFunction__Group__1__Impl rule__BodyFunction__Group__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2848:2: rule__BodyFunction__Group__1__Impl rule__BodyFunction__Group__2
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group__1__Impl_in_rule__BodyFunction__Group__15785);
            rule__BodyFunction__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group__2_in_rule__BodyFunction__Group__15788);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2855:1: rule__BodyFunction__Group__1__Impl : ( '=>' ) ;
    public final void rule__BodyFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2859:1: ( ( '=>' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2860:1: ( '=>' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2860:1: ( '=>' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2861:1: '=>'
            {
             before(grammarAccess.getBodyFunctionAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,10,FOLLOW_10_in_rule__BodyFunction__Group__1__Impl5816); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2874:1: rule__BodyFunction__Group__2 : rule__BodyFunction__Group__2__Impl rule__BodyFunction__Group__3 ;
    public final void rule__BodyFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2878:1: ( rule__BodyFunction__Group__2__Impl rule__BodyFunction__Group__3 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2879:2: rule__BodyFunction__Group__2__Impl rule__BodyFunction__Group__3
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group__2__Impl_in_rule__BodyFunction__Group__25847);
            rule__BodyFunction__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group__3_in_rule__BodyFunction__Group__25850);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2886:1: rule__BodyFunction__Group__2__Impl : ( ( rule__BodyFunction__Alternatives_2 ) ) ;
    public final void rule__BodyFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2890:1: ( ( ( rule__BodyFunction__Alternatives_2 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2891:1: ( ( rule__BodyFunction__Alternatives_2 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2891:1: ( ( rule__BodyFunction__Alternatives_2 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2892:1: ( rule__BodyFunction__Alternatives_2 )
            {
             before(grammarAccess.getBodyFunctionAccess().getAlternatives_2()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2893:1: ( rule__BodyFunction__Alternatives_2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2893:2: rule__BodyFunction__Alternatives_2
            {
            pushFollow(FOLLOW_rule__BodyFunction__Alternatives_2_in_rule__BodyFunction__Group__2__Impl5877);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2903:1: rule__BodyFunction__Group__3 : rule__BodyFunction__Group__3__Impl ;
    public final void rule__BodyFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2907:1: ( rule__BodyFunction__Group__3__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2908:2: rule__BodyFunction__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group__3__Impl_in_rule__BodyFunction__Group__35907);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2914:1: rule__BodyFunction__Group__3__Impl : ( ';' ) ;
    public final void rule__BodyFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2918:1: ( ( ';' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2919:1: ( ';' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2919:1: ( ';' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2920:1: ';'
            {
             before(grammarAccess.getBodyFunctionAccess().getSemicolonKeyword_3()); 
            match(input,11,FOLLOW_11_in_rule__BodyFunction__Group__3__Impl5935); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2941:1: rule__BodyFunction__Group_2_1__0 : rule__BodyFunction__Group_2_1__0__Impl rule__BodyFunction__Group_2_1__1 ;
    public final void rule__BodyFunction__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2945:1: ( rule__BodyFunction__Group_2_1__0__Impl rule__BodyFunction__Group_2_1__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2946:2: rule__BodyFunction__Group_2_1__0__Impl rule__BodyFunction__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__0__Impl_in_rule__BodyFunction__Group_2_1__05974);
            rule__BodyFunction__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__1_in_rule__BodyFunction__Group_2_1__05977);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2953:1: rule__BodyFunction__Group_2_1__0__Impl : ( ( rule__BodyFunction__ListAssignment_2_1_0 ) ) ;
    public final void rule__BodyFunction__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2957:1: ( ( ( rule__BodyFunction__ListAssignment_2_1_0 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2958:1: ( ( rule__BodyFunction__ListAssignment_2_1_0 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2958:1: ( ( rule__BodyFunction__ListAssignment_2_1_0 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2959:1: ( rule__BodyFunction__ListAssignment_2_1_0 )
            {
             before(grammarAccess.getBodyFunctionAccess().getListAssignment_2_1_0()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2960:1: ( rule__BodyFunction__ListAssignment_2_1_0 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2960:2: rule__BodyFunction__ListAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__BodyFunction__ListAssignment_2_1_0_in_rule__BodyFunction__Group_2_1__0__Impl6004);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2970:1: rule__BodyFunction__Group_2_1__1 : rule__BodyFunction__Group_2_1__1__Impl rule__BodyFunction__Group_2_1__2 ;
    public final void rule__BodyFunction__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2974:1: ( rule__BodyFunction__Group_2_1__1__Impl rule__BodyFunction__Group_2_1__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2975:2: rule__BodyFunction__Group_2_1__1__Impl rule__BodyFunction__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__1__Impl_in_rule__BodyFunction__Group_2_1__16034);
            rule__BodyFunction__Group_2_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__2_in_rule__BodyFunction__Group_2_1__16037);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2982:1: rule__BodyFunction__Group_2_1__1__Impl : ( ( rule__BodyFunction__ValuesAssignment_2_1_1 ) ) ;
    public final void rule__BodyFunction__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2986:1: ( ( ( rule__BodyFunction__ValuesAssignment_2_1_1 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2987:1: ( ( rule__BodyFunction__ValuesAssignment_2_1_1 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2987:1: ( ( rule__BodyFunction__ValuesAssignment_2_1_1 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2988:1: ( rule__BodyFunction__ValuesAssignment_2_1_1 )
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_1_1()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2989:1: ( rule__BodyFunction__ValuesAssignment_2_1_1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2989:2: rule__BodyFunction__ValuesAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__BodyFunction__ValuesAssignment_2_1_1_in_rule__BodyFunction__Group_2_1__1__Impl6064);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2999:1: rule__BodyFunction__Group_2_1__2 : rule__BodyFunction__Group_2_1__2__Impl rule__BodyFunction__Group_2_1__3 ;
    public final void rule__BodyFunction__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3003:1: ( rule__BodyFunction__Group_2_1__2__Impl rule__BodyFunction__Group_2_1__3 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3004:2: rule__BodyFunction__Group_2_1__2__Impl rule__BodyFunction__Group_2_1__3
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__2__Impl_in_rule__BodyFunction__Group_2_1__26094);
            rule__BodyFunction__Group_2_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__3_in_rule__BodyFunction__Group_2_1__26097);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3011:1: rule__BodyFunction__Group_2_1__2__Impl : ( ( rule__BodyFunction__Group_2_1_2__0 )* ) ;
    public final void rule__BodyFunction__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3015:1: ( ( ( rule__BodyFunction__Group_2_1_2__0 )* ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3016:1: ( ( rule__BodyFunction__Group_2_1_2__0 )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3016:1: ( ( rule__BodyFunction__Group_2_1_2__0 )* )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3017:1: ( rule__BodyFunction__Group_2_1_2__0 )*
            {
             before(grammarAccess.getBodyFunctionAccess().getGroup_2_1_2()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3018:1: ( rule__BodyFunction__Group_2_1_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==12) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3018:2: rule__BodyFunction__Group_2_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__BodyFunction__Group_2_1_2__0_in_rule__BodyFunction__Group_2_1__2__Impl6124);
            	    rule__BodyFunction__Group_2_1_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3028:1: rule__BodyFunction__Group_2_1__3 : rule__BodyFunction__Group_2_1__3__Impl ;
    public final void rule__BodyFunction__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3032:1: ( rule__BodyFunction__Group_2_1__3__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3033:2: rule__BodyFunction__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__3__Impl_in_rule__BodyFunction__Group_2_1__36155);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3039:1: rule__BodyFunction__Group_2_1__3__Impl : ( '}' ) ;
    public final void rule__BodyFunction__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3043:1: ( ( '}' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3044:1: ( '}' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3044:1: ( '}' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3045:1: '}'
            {
             before(grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_1_3()); 
            match(input,19,FOLLOW_19_in_rule__BodyFunction__Group_2_1__3__Impl6183); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3066:1: rule__BodyFunction__Group_2_1_2__0 : rule__BodyFunction__Group_2_1_2__0__Impl rule__BodyFunction__Group_2_1_2__1 ;
    public final void rule__BodyFunction__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3070:1: ( rule__BodyFunction__Group_2_1_2__0__Impl rule__BodyFunction__Group_2_1_2__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3071:2: rule__BodyFunction__Group_2_1_2__0__Impl rule__BodyFunction__Group_2_1_2__1
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1_2__0__Impl_in_rule__BodyFunction__Group_2_1_2__06222);
            rule__BodyFunction__Group_2_1_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1_2__1_in_rule__BodyFunction__Group_2_1_2__06225);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3078:1: rule__BodyFunction__Group_2_1_2__0__Impl : ( ',' ) ;
    public final void rule__BodyFunction__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3082:1: ( ( ',' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3083:1: ( ',' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3083:1: ( ',' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3084:1: ','
            {
             before(grammarAccess.getBodyFunctionAccess().getCommaKeyword_2_1_2_0()); 
            match(input,12,FOLLOW_12_in_rule__BodyFunction__Group_2_1_2__0__Impl6253); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3097:1: rule__BodyFunction__Group_2_1_2__1 : rule__BodyFunction__Group_2_1_2__1__Impl ;
    public final void rule__BodyFunction__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3101:1: ( rule__BodyFunction__Group_2_1_2__1__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3102:2: rule__BodyFunction__Group_2_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1_2__1__Impl_in_rule__BodyFunction__Group_2_1_2__16284);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3108:1: rule__BodyFunction__Group_2_1_2__1__Impl : ( ( rule__BodyFunction__ValuesAssignment_2_1_2_1 ) ) ;
    public final void rule__BodyFunction__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3112:1: ( ( ( rule__BodyFunction__ValuesAssignment_2_1_2_1 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3113:1: ( ( rule__BodyFunction__ValuesAssignment_2_1_2_1 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3113:1: ( ( rule__BodyFunction__ValuesAssignment_2_1_2_1 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3114:1: ( rule__BodyFunction__ValuesAssignment_2_1_2_1 )
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_1_2_1()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3115:1: ( rule__BodyFunction__ValuesAssignment_2_1_2_1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3115:2: rule__BodyFunction__ValuesAssignment_2_1_2_1
            {
            pushFollow(FOLLOW_rule__BodyFunction__ValuesAssignment_2_1_2_1_in_rule__BodyFunction__Group_2_1_2__1__Impl6311);
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


    // $ANTLR start rule__BodyFunction__Group_2_3__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3129:1: rule__BodyFunction__Group_2_3__0 : rule__BodyFunction__Group_2_3__0__Impl rule__BodyFunction__Group_2_3__1 ;
    public final void rule__BodyFunction__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3133:1: ( rule__BodyFunction__Group_2_3__0__Impl rule__BodyFunction__Group_2_3__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3134:2: rule__BodyFunction__Group_2_3__0__Impl rule__BodyFunction__Group_2_3__1
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__0__Impl_in_rule__BodyFunction__Group_2_3__06345);
            rule__BodyFunction__Group_2_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__1_in_rule__BodyFunction__Group_2_3__06348);
            rule__BodyFunction__Group_2_3__1();
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
    // $ANTLR end rule__BodyFunction__Group_2_3__0


    // $ANTLR start rule__BodyFunction__Group_2_3__0__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3141:1: rule__BodyFunction__Group_2_3__0__Impl : ( '{' ) ;
    public final void rule__BodyFunction__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3145:1: ( ( '{' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3146:1: ( '{' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3146:1: ( '{' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3147:1: '{'
            {
             before(grammarAccess.getBodyFunctionAccess().getLeftCurlyBracketKeyword_2_3_0()); 
            match(input,18,FOLLOW_18_in_rule__BodyFunction__Group_2_3__0__Impl6376); 
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
    // $ANTLR end rule__BodyFunction__Group_2_3__0__Impl


    // $ANTLR start rule__BodyFunction__Group_2_3__1
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3160:1: rule__BodyFunction__Group_2_3__1 : rule__BodyFunction__Group_2_3__1__Impl rule__BodyFunction__Group_2_3__2 ;
    public final void rule__BodyFunction__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3164:1: ( rule__BodyFunction__Group_2_3__1__Impl rule__BodyFunction__Group_2_3__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3165:2: rule__BodyFunction__Group_2_3__1__Impl rule__BodyFunction__Group_2_3__2
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__1__Impl_in_rule__BodyFunction__Group_2_3__16407);
            rule__BodyFunction__Group_2_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__2_in_rule__BodyFunction__Group_2_3__16410);
            rule__BodyFunction__Group_2_3__2();
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
    // $ANTLR end rule__BodyFunction__Group_2_3__1


    // $ANTLR start rule__BodyFunction__Group_2_3__1__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3172:1: rule__BodyFunction__Group_2_3__1__Impl : ( '@' ) ;
    public final void rule__BodyFunction__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3176:1: ( ( '@' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3177:1: ( '@' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3177:1: ( '@' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3178:1: '@'
            {
             before(grammarAccess.getBodyFunctionAccess().getCommercialAtKeyword_2_3_1()); 
            match(input,22,FOLLOW_22_in_rule__BodyFunction__Group_2_3__1__Impl6438); 
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
    // $ANTLR end rule__BodyFunction__Group_2_3__1__Impl


    // $ANTLR start rule__BodyFunction__Group_2_3__2
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3191:1: rule__BodyFunction__Group_2_3__2 : rule__BodyFunction__Group_2_3__2__Impl rule__BodyFunction__Group_2_3__3 ;
    public final void rule__BodyFunction__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3195:1: ( rule__BodyFunction__Group_2_3__2__Impl rule__BodyFunction__Group_2_3__3 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3196:2: rule__BodyFunction__Group_2_3__2__Impl rule__BodyFunction__Group_2_3__3
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__2__Impl_in_rule__BodyFunction__Group_2_3__26469);
            rule__BodyFunction__Group_2_3__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__3_in_rule__BodyFunction__Group_2_3__26472);
            rule__BodyFunction__Group_2_3__3();
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
    // $ANTLR end rule__BodyFunction__Group_2_3__2


    // $ANTLR start rule__BodyFunction__Group_2_3__2__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3203:1: rule__BodyFunction__Group_2_3__2__Impl : ( '(' ) ;
    public final void rule__BodyFunction__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3207:1: ( ( '(' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3208:1: ( '(' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3208:1: ( '(' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3209:1: '('
            {
             before(grammarAccess.getBodyFunctionAccess().getLeftParenthesisKeyword_2_3_2()); 
            match(input,13,FOLLOW_13_in_rule__BodyFunction__Group_2_3__2__Impl6500); 
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
    // $ANTLR end rule__BodyFunction__Group_2_3__2__Impl


    // $ANTLR start rule__BodyFunction__Group_2_3__3
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3222:1: rule__BodyFunction__Group_2_3__3 : rule__BodyFunction__Group_2_3__3__Impl rule__BodyFunction__Group_2_3__4 ;
    public final void rule__BodyFunction__Group_2_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3226:1: ( rule__BodyFunction__Group_2_3__3__Impl rule__BodyFunction__Group_2_3__4 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3227:2: rule__BodyFunction__Group_2_3__3__Impl rule__BodyFunction__Group_2_3__4
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__3__Impl_in_rule__BodyFunction__Group_2_3__36531);
            rule__BodyFunction__Group_2_3__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__4_in_rule__BodyFunction__Group_2_3__36534);
            rule__BodyFunction__Group_2_3__4();
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
    // $ANTLR end rule__BodyFunction__Group_2_3__3


    // $ANTLR start rule__BodyFunction__Group_2_3__3__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3234:1: rule__BodyFunction__Group_2_3__3__Impl : ( RULE_ID ) ;
    public final void rule__BodyFunction__Group_2_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3238:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3239:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3239:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3240:1: RULE_ID
            {
             before(grammarAccess.getBodyFunctionAccess().getIDTerminalRuleCall_2_3_3()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BodyFunction__Group_2_3__3__Impl6561); 
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
    // $ANTLR end rule__BodyFunction__Group_2_3__3__Impl


    // $ANTLR start rule__BodyFunction__Group_2_3__4
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3251:1: rule__BodyFunction__Group_2_3__4 : rule__BodyFunction__Group_2_3__4__Impl rule__BodyFunction__Group_2_3__5 ;
    public final void rule__BodyFunction__Group_2_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3255:1: ( rule__BodyFunction__Group_2_3__4__Impl rule__BodyFunction__Group_2_3__5 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3256:2: rule__BodyFunction__Group_2_3__4__Impl rule__BodyFunction__Group_2_3__5
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__4__Impl_in_rule__BodyFunction__Group_2_3__46590);
            rule__BodyFunction__Group_2_3__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__5_in_rule__BodyFunction__Group_2_3__46593);
            rule__BodyFunction__Group_2_3__5();
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
    // $ANTLR end rule__BodyFunction__Group_2_3__4


    // $ANTLR start rule__BodyFunction__Group_2_3__4__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3263:1: rule__BodyFunction__Group_2_3__4__Impl : ( ')' ) ;
    public final void rule__BodyFunction__Group_2_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3267:1: ( ( ')' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3268:1: ( ')' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3268:1: ( ')' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3269:1: ')'
            {
             before(grammarAccess.getBodyFunctionAccess().getRightParenthesisKeyword_2_3_4()); 
            match(input,14,FOLLOW_14_in_rule__BodyFunction__Group_2_3__4__Impl6621); 
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
    // $ANTLR end rule__BodyFunction__Group_2_3__4__Impl


    // $ANTLR start rule__BodyFunction__Group_2_3__5
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3282:1: rule__BodyFunction__Group_2_3__5 : rule__BodyFunction__Group_2_3__5__Impl ;
    public final void rule__BodyFunction__Group_2_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3286:1: ( rule__BodyFunction__Group_2_3__5__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3287:2: rule__BodyFunction__Group_2_3__5__Impl
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__5__Impl_in_rule__BodyFunction__Group_2_3__56652);
            rule__BodyFunction__Group_2_3__5__Impl();
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
    // $ANTLR end rule__BodyFunction__Group_2_3__5


    // $ANTLR start rule__BodyFunction__Group_2_3__5__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3293:1: rule__BodyFunction__Group_2_3__5__Impl : ( '}' ) ;
    public final void rule__BodyFunction__Group_2_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3297:1: ( ( '}' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3298:1: ( '}' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3298:1: ( '}' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3299:1: '}'
            {
             before(grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_3_5()); 
            match(input,19,FOLLOW_19_in_rule__BodyFunction__Group_2_3__5__Impl6680); 
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
    // $ANTLR end rule__BodyFunction__Group_2_3__5__Impl


    // $ANTLR start rule__SimpleFunction__Group__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3324:1: rule__SimpleFunction__Group__0 : rule__SimpleFunction__Group__0__Impl rule__SimpleFunction__Group__1 ;
    public final void rule__SimpleFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3328:1: ( rule__SimpleFunction__Group__0__Impl rule__SimpleFunction__Group__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3329:2: rule__SimpleFunction__Group__0__Impl rule__SimpleFunction__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleFunction__Group__0__Impl_in_rule__SimpleFunction__Group__06723);
            rule__SimpleFunction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleFunction__Group__1_in_rule__SimpleFunction__Group__06726);
            rule__SimpleFunction__Group__1();
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
    // $ANTLR end rule__SimpleFunction__Group__0


    // $ANTLR start rule__SimpleFunction__Group__0__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3336:1: rule__SimpleFunction__Group__0__Impl : ( ( rule__SimpleFunction__IdAssignment_0 ) ) ;
    public final void rule__SimpleFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3340:1: ( ( ( rule__SimpleFunction__IdAssignment_0 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3341:1: ( ( rule__SimpleFunction__IdAssignment_0 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3341:1: ( ( rule__SimpleFunction__IdAssignment_0 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3342:1: ( rule__SimpleFunction__IdAssignment_0 )
            {
             before(grammarAccess.getSimpleFunctionAccess().getIdAssignment_0()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3343:1: ( rule__SimpleFunction__IdAssignment_0 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3343:2: rule__SimpleFunction__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__SimpleFunction__IdAssignment_0_in_rule__SimpleFunction__Group__0__Impl6753);
            rule__SimpleFunction__IdAssignment_0();
            _fsp--;


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
    // $ANTLR end rule__SimpleFunction__Group__0__Impl


    // $ANTLR start rule__SimpleFunction__Group__1
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3353:1: rule__SimpleFunction__Group__1 : rule__SimpleFunction__Group__1__Impl rule__SimpleFunction__Group__2 ;
    public final void rule__SimpleFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3357:1: ( rule__SimpleFunction__Group__1__Impl rule__SimpleFunction__Group__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3358:2: rule__SimpleFunction__Group__1__Impl rule__SimpleFunction__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleFunction__Group__1__Impl_in_rule__SimpleFunction__Group__16783);
            rule__SimpleFunction__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleFunction__Group__2_in_rule__SimpleFunction__Group__16786);
            rule__SimpleFunction__Group__2();
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
    // $ANTLR end rule__SimpleFunction__Group__1


    // $ANTLR start rule__SimpleFunction__Group__1__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3365:1: rule__SimpleFunction__Group__1__Impl : ( '(' ) ;
    public final void rule__SimpleFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3369:1: ( ( '(' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3370:1: ( '(' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3370:1: ( '(' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3371:1: '('
            {
             before(grammarAccess.getSimpleFunctionAccess().getLeftParenthesisKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__SimpleFunction__Group__1__Impl6814); 
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
    // $ANTLR end rule__SimpleFunction__Group__1__Impl


    // $ANTLR start rule__SimpleFunction__Group__2
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3384:1: rule__SimpleFunction__Group__2 : rule__SimpleFunction__Group__2__Impl rule__SimpleFunction__Group__3 ;
    public final void rule__SimpleFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3388:1: ( rule__SimpleFunction__Group__2__Impl rule__SimpleFunction__Group__3 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3389:2: rule__SimpleFunction__Group__2__Impl rule__SimpleFunction__Group__3
            {
            pushFollow(FOLLOW_rule__SimpleFunction__Group__2__Impl_in_rule__SimpleFunction__Group__26845);
            rule__SimpleFunction__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleFunction__Group__3_in_rule__SimpleFunction__Group__26848);
            rule__SimpleFunction__Group__3();
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
    // $ANTLR end rule__SimpleFunction__Group__2


    // $ANTLR start rule__SimpleFunction__Group__2__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3396:1: rule__SimpleFunction__Group__2__Impl : ( ( rule__SimpleFunction__ValuesAssignment_2 ) ) ;
    public final void rule__SimpleFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3400:1: ( ( ( rule__SimpleFunction__ValuesAssignment_2 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3401:1: ( ( rule__SimpleFunction__ValuesAssignment_2 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3401:1: ( ( rule__SimpleFunction__ValuesAssignment_2 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3402:1: ( rule__SimpleFunction__ValuesAssignment_2 )
            {
             before(grammarAccess.getSimpleFunctionAccess().getValuesAssignment_2()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3403:1: ( rule__SimpleFunction__ValuesAssignment_2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3403:2: rule__SimpleFunction__ValuesAssignment_2
            {
            pushFollow(FOLLOW_rule__SimpleFunction__ValuesAssignment_2_in_rule__SimpleFunction__Group__2__Impl6875);
            rule__SimpleFunction__ValuesAssignment_2();
            _fsp--;


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
    // $ANTLR end rule__SimpleFunction__Group__2__Impl


    // $ANTLR start rule__SimpleFunction__Group__3
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3413:1: rule__SimpleFunction__Group__3 : rule__SimpleFunction__Group__3__Impl rule__SimpleFunction__Group__4 ;
    public final void rule__SimpleFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3417:1: ( rule__SimpleFunction__Group__3__Impl rule__SimpleFunction__Group__4 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3418:2: rule__SimpleFunction__Group__3__Impl rule__SimpleFunction__Group__4
            {
            pushFollow(FOLLOW_rule__SimpleFunction__Group__3__Impl_in_rule__SimpleFunction__Group__36905);
            rule__SimpleFunction__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleFunction__Group__4_in_rule__SimpleFunction__Group__36908);
            rule__SimpleFunction__Group__4();
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
    // $ANTLR end rule__SimpleFunction__Group__3


    // $ANTLR start rule__SimpleFunction__Group__3__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3425:1: rule__SimpleFunction__Group__3__Impl : ( ( rule__SimpleFunction__Group_3__0 )* ) ;
    public final void rule__SimpleFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3429:1: ( ( ( rule__SimpleFunction__Group_3__0 )* ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3430:1: ( ( rule__SimpleFunction__Group_3__0 )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3430:1: ( ( rule__SimpleFunction__Group_3__0 )* )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3431:1: ( rule__SimpleFunction__Group_3__0 )*
            {
             before(grammarAccess.getSimpleFunctionAccess().getGroup_3()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3432:1: ( rule__SimpleFunction__Group_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==12) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3432:2: rule__SimpleFunction__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__SimpleFunction__Group_3__0_in_rule__SimpleFunction__Group__3__Impl6935);
            	    rule__SimpleFunction__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // $ANTLR end rule__SimpleFunction__Group__3__Impl


    // $ANTLR start rule__SimpleFunction__Group__4
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3442:1: rule__SimpleFunction__Group__4 : rule__SimpleFunction__Group__4__Impl ;
    public final void rule__SimpleFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3446:1: ( rule__SimpleFunction__Group__4__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3447:2: rule__SimpleFunction__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SimpleFunction__Group__4__Impl_in_rule__SimpleFunction__Group__46966);
            rule__SimpleFunction__Group__4__Impl();
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
    // $ANTLR end rule__SimpleFunction__Group__4


    // $ANTLR start rule__SimpleFunction__Group__4__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3453:1: rule__SimpleFunction__Group__4__Impl : ( ')' ) ;
    public final void rule__SimpleFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3457:1: ( ( ')' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3458:1: ( ')' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3458:1: ( ')' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3459:1: ')'
            {
             before(grammarAccess.getSimpleFunctionAccess().getRightParenthesisKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__SimpleFunction__Group__4__Impl6994); 
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
    // $ANTLR end rule__SimpleFunction__Group__4__Impl


    // $ANTLR start rule__SimpleFunction__Group_3__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3482:1: rule__SimpleFunction__Group_3__0 : rule__SimpleFunction__Group_3__0__Impl rule__SimpleFunction__Group_3__1 ;
    public final void rule__SimpleFunction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3486:1: ( rule__SimpleFunction__Group_3__0__Impl rule__SimpleFunction__Group_3__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3487:2: rule__SimpleFunction__Group_3__0__Impl rule__SimpleFunction__Group_3__1
            {
            pushFollow(FOLLOW_rule__SimpleFunction__Group_3__0__Impl_in_rule__SimpleFunction__Group_3__07035);
            rule__SimpleFunction__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleFunction__Group_3__1_in_rule__SimpleFunction__Group_3__07038);
            rule__SimpleFunction__Group_3__1();
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
    // $ANTLR end rule__SimpleFunction__Group_3__0


    // $ANTLR start rule__SimpleFunction__Group_3__0__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3494:1: rule__SimpleFunction__Group_3__0__Impl : ( ',' ) ;
    public final void rule__SimpleFunction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3498:1: ( ( ',' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3499:1: ( ',' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3499:1: ( ',' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3500:1: ','
            {
             before(grammarAccess.getSimpleFunctionAccess().getCommaKeyword_3_0()); 
            match(input,12,FOLLOW_12_in_rule__SimpleFunction__Group_3__0__Impl7066); 
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
    // $ANTLR end rule__SimpleFunction__Group_3__0__Impl


    // $ANTLR start rule__SimpleFunction__Group_3__1
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3513:1: rule__SimpleFunction__Group_3__1 : rule__SimpleFunction__Group_3__1__Impl ;
    public final void rule__SimpleFunction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3517:1: ( rule__SimpleFunction__Group_3__1__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3518:2: rule__SimpleFunction__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleFunction__Group_3__1__Impl_in_rule__SimpleFunction__Group_3__17097);
            rule__SimpleFunction__Group_3__1__Impl();
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
    // $ANTLR end rule__SimpleFunction__Group_3__1


    // $ANTLR start rule__SimpleFunction__Group_3__1__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3524:1: rule__SimpleFunction__Group_3__1__Impl : ( ( rule__SimpleFunction__ValuesAssignment_3_1 ) ) ;
    public final void rule__SimpleFunction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3528:1: ( ( ( rule__SimpleFunction__ValuesAssignment_3_1 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3529:1: ( ( rule__SimpleFunction__ValuesAssignment_3_1 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3529:1: ( ( rule__SimpleFunction__ValuesAssignment_3_1 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3530:1: ( rule__SimpleFunction__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getSimpleFunctionAccess().getValuesAssignment_3_1()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3531:1: ( rule__SimpleFunction__ValuesAssignment_3_1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3531:2: rule__SimpleFunction__ValuesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SimpleFunction__ValuesAssignment_3_1_in_rule__SimpleFunction__Group_3__1__Impl7124);
            rule__SimpleFunction__ValuesAssignment_3_1();
            _fsp--;


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
    // $ANTLR end rule__SimpleFunction__Group_3__1__Impl


    // $ANTLR start rule__SpecialFunction__Group__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3545:1: rule__SpecialFunction__Group__0 : rule__SpecialFunction__Group__0__Impl rule__SpecialFunction__Group__1 ;
    public final void rule__SpecialFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3549:1: ( rule__SpecialFunction__Group__0__Impl rule__SpecialFunction__Group__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3550:2: rule__SpecialFunction__Group__0__Impl rule__SpecialFunction__Group__1
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__0__Impl_in_rule__SpecialFunction__Group__07158);
            rule__SpecialFunction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group__1_in_rule__SpecialFunction__Group__07161);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3557:1: rule__SpecialFunction__Group__0__Impl : ( ( rule__SpecialFunction__IdAssignment_0 ) ) ;
    public final void rule__SpecialFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3561:1: ( ( ( rule__SpecialFunction__IdAssignment_0 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3562:1: ( ( rule__SpecialFunction__IdAssignment_0 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3562:1: ( ( rule__SpecialFunction__IdAssignment_0 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3563:1: ( rule__SpecialFunction__IdAssignment_0 )
            {
             before(grammarAccess.getSpecialFunctionAccess().getIdAssignment_0()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3564:1: ( rule__SpecialFunction__IdAssignment_0 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3564:2: rule__SpecialFunction__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__SpecialFunction__IdAssignment_0_in_rule__SpecialFunction__Group__0__Impl7188);
            rule__SpecialFunction__IdAssignment_0();
            _fsp--;


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
    // $ANTLR end rule__SpecialFunction__Group__0__Impl


    // $ANTLR start rule__SpecialFunction__Group__1
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3574:1: rule__SpecialFunction__Group__1 : rule__SpecialFunction__Group__1__Impl rule__SpecialFunction__Group__2 ;
    public final void rule__SpecialFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3578:1: ( rule__SpecialFunction__Group__1__Impl rule__SpecialFunction__Group__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3579:2: rule__SpecialFunction__Group__1__Impl rule__SpecialFunction__Group__2
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__1__Impl_in_rule__SpecialFunction__Group__17218);
            rule__SpecialFunction__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group__2_in_rule__SpecialFunction__Group__17221);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3586:1: rule__SpecialFunction__Group__1__Impl : ( '(' ) ;
    public final void rule__SpecialFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3590:1: ( ( '(' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3591:1: ( '(' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3591:1: ( '(' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3592:1: '('
            {
             before(grammarAccess.getSpecialFunctionAccess().getLeftParenthesisKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__SpecialFunction__Group__1__Impl7249); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3605:1: rule__SpecialFunction__Group__2 : rule__SpecialFunction__Group__2__Impl rule__SpecialFunction__Group__3 ;
    public final void rule__SpecialFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3609:1: ( rule__SpecialFunction__Group__2__Impl rule__SpecialFunction__Group__3 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3610:2: rule__SpecialFunction__Group__2__Impl rule__SpecialFunction__Group__3
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__2__Impl_in_rule__SpecialFunction__Group__27280);
            rule__SpecialFunction__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group__3_in_rule__SpecialFunction__Group__27283);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3617:1: rule__SpecialFunction__Group__2__Impl : ( ( rule__SpecialFunction__Alternatives_2 )* ) ;
    public final void rule__SpecialFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3621:1: ( ( ( rule__SpecialFunction__Alternatives_2 )* ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3622:1: ( ( rule__SpecialFunction__Alternatives_2 )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3622:1: ( ( rule__SpecialFunction__Alternatives_2 )* )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3623:1: ( rule__SpecialFunction__Alternatives_2 )*
            {
             before(grammarAccess.getSpecialFunctionAccess().getAlternatives_2()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3624:1: ( rule__SpecialFunction__Alternatives_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_INT)||LA26_0==12||(LA26_0>=24 && LA26_0<=25)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3624:2: rule__SpecialFunction__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__SpecialFunction__Alternatives_2_in_rule__SpecialFunction__Group__2__Impl7310);
            	    rule__SpecialFunction__Alternatives_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // $ANTLR end rule__SpecialFunction__Group__2__Impl


    // $ANTLR start rule__SpecialFunction__Group__3
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3634:1: rule__SpecialFunction__Group__3 : rule__SpecialFunction__Group__3__Impl ;
    public final void rule__SpecialFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3638:1: ( rule__SpecialFunction__Group__3__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3639:2: rule__SpecialFunction__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__3__Impl_in_rule__SpecialFunction__Group__37341);
            rule__SpecialFunction__Group__3__Impl();
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3645:1: rule__SpecialFunction__Group__3__Impl : ( ')' ) ;
    public final void rule__SpecialFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3649:1: ( ( ')' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3650:1: ( ')' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3650:1: ( ')' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3651:1: ')'
            {
             before(grammarAccess.getSpecialFunctionAccess().getRightParenthesisKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__SpecialFunction__Group__3__Impl7369); 
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
    // $ANTLR end rule__SpecialFunction__Group__3__Impl


    // $ANTLR start rule__SpecialFunction__Group_2_5__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3672:1: rule__SpecialFunction__Group_2_5__0 : rule__SpecialFunction__Group_2_5__0__Impl rule__SpecialFunction__Group_2_5__1 ;
    public final void rule__SpecialFunction__Group_2_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3676:1: ( rule__SpecialFunction__Group_2_5__0__Impl rule__SpecialFunction__Group_2_5__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3677:2: rule__SpecialFunction__Group_2_5__0__Impl rule__SpecialFunction__Group_2_5__1
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_5__0__Impl_in_rule__SpecialFunction__Group_2_5__07408);
            rule__SpecialFunction__Group_2_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_5__1_in_rule__SpecialFunction__Group_2_5__07411);
            rule__SpecialFunction__Group_2_5__1();
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
    // $ANTLR end rule__SpecialFunction__Group_2_5__0


    // $ANTLR start rule__SpecialFunction__Group_2_5__0__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3684:1: rule__SpecialFunction__Group_2_5__0__Impl : ( '$(' ) ;
    public final void rule__SpecialFunction__Group_2_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3688:1: ( ( '$(' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3689:1: ( '$(' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3689:1: ( '$(' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3690:1: '$('
            {
             before(grammarAccess.getSpecialFunctionAccess().getDollarSignLeftParenthesisKeyword_2_5_0()); 
            match(input,24,FOLLOW_24_in_rule__SpecialFunction__Group_2_5__0__Impl7439); 
             after(grammarAccess.getSpecialFunctionAccess().getDollarSignLeftParenthesisKeyword_2_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialFunction__Group_2_5__0__Impl


    // $ANTLR start rule__SpecialFunction__Group_2_5__1
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3703:1: rule__SpecialFunction__Group_2_5__1 : rule__SpecialFunction__Group_2_5__1__Impl rule__SpecialFunction__Group_2_5__2 ;
    public final void rule__SpecialFunction__Group_2_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3707:1: ( rule__SpecialFunction__Group_2_5__1__Impl rule__SpecialFunction__Group_2_5__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3708:2: rule__SpecialFunction__Group_2_5__1__Impl rule__SpecialFunction__Group_2_5__2
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_5__1__Impl_in_rule__SpecialFunction__Group_2_5__17470);
            rule__SpecialFunction__Group_2_5__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_5__2_in_rule__SpecialFunction__Group_2_5__17473);
            rule__SpecialFunction__Group_2_5__2();
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
    // $ANTLR end rule__SpecialFunction__Group_2_5__1


    // $ANTLR start rule__SpecialFunction__Group_2_5__1__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3715:1: rule__SpecialFunction__Group_2_5__1__Impl : ( RULE_ID ) ;
    public final void rule__SpecialFunction__Group_2_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3719:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3720:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3720:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3721:1: RULE_ID
            {
             before(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_5_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SpecialFunction__Group_2_5__1__Impl7500); 
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
    // $ANTLR end rule__SpecialFunction__Group_2_5__1__Impl


    // $ANTLR start rule__SpecialFunction__Group_2_5__2
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3732:1: rule__SpecialFunction__Group_2_5__2 : rule__SpecialFunction__Group_2_5__2__Impl ;
    public final void rule__SpecialFunction__Group_2_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3736:1: ( rule__SpecialFunction__Group_2_5__2__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3737:2: rule__SpecialFunction__Group_2_5__2__Impl
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_5__2__Impl_in_rule__SpecialFunction__Group_2_5__27529);
            rule__SpecialFunction__Group_2_5__2__Impl();
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
    // $ANTLR end rule__SpecialFunction__Group_2_5__2


    // $ANTLR start rule__SpecialFunction__Group_2_5__2__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3743:1: rule__SpecialFunction__Group_2_5__2__Impl : ( ')' ) ;
    public final void rule__SpecialFunction__Group_2_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3747:1: ( ( ')' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3748:1: ( ')' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3748:1: ( ')' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3749:1: ')'
            {
             before(grammarAccess.getSpecialFunctionAccess().getRightParenthesisKeyword_2_5_2()); 
            match(input,14,FOLLOW_14_in_rule__SpecialFunction__Group_2_5__2__Impl7557); 
             after(grammarAccess.getSpecialFunctionAccess().getRightParenthesisKeyword_2_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialFunction__Group_2_5__2__Impl


    // $ANTLR start rule__SpecialFunction__Group_2_6__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3768:1: rule__SpecialFunction__Group_2_6__0 : rule__SpecialFunction__Group_2_6__0__Impl rule__SpecialFunction__Group_2_6__1 ;
    public final void rule__SpecialFunction__Group_2_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3772:1: ( rule__SpecialFunction__Group_2_6__0__Impl rule__SpecialFunction__Group_2_6__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3773:2: rule__SpecialFunction__Group_2_6__0__Impl rule__SpecialFunction__Group_2_6__1
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_6__0__Impl_in_rule__SpecialFunction__Group_2_6__07594);
            rule__SpecialFunction__Group_2_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_6__1_in_rule__SpecialFunction__Group_2_6__07597);
            rule__SpecialFunction__Group_2_6__1();
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
    // $ANTLR end rule__SpecialFunction__Group_2_6__0


    // $ANTLR start rule__SpecialFunction__Group_2_6__0__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3780:1: rule__SpecialFunction__Group_2_6__0__Impl : ( '${' ) ;
    public final void rule__SpecialFunction__Group_2_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3784:1: ( ( '${' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3785:1: ( '${' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3785:1: ( '${' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3786:1: '${'
            {
             before(grammarAccess.getSpecialFunctionAccess().getDollarSignLeftCurlyBracketKeyword_2_6_0()); 
            match(input,25,FOLLOW_25_in_rule__SpecialFunction__Group_2_6__0__Impl7625); 
             after(grammarAccess.getSpecialFunctionAccess().getDollarSignLeftCurlyBracketKeyword_2_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialFunction__Group_2_6__0__Impl


    // $ANTLR start rule__SpecialFunction__Group_2_6__1
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3799:1: rule__SpecialFunction__Group_2_6__1 : rule__SpecialFunction__Group_2_6__1__Impl rule__SpecialFunction__Group_2_6__2 ;
    public final void rule__SpecialFunction__Group_2_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3803:1: ( rule__SpecialFunction__Group_2_6__1__Impl rule__SpecialFunction__Group_2_6__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3804:2: rule__SpecialFunction__Group_2_6__1__Impl rule__SpecialFunction__Group_2_6__2
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_6__1__Impl_in_rule__SpecialFunction__Group_2_6__17656);
            rule__SpecialFunction__Group_2_6__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_6__2_in_rule__SpecialFunction__Group_2_6__17659);
            rule__SpecialFunction__Group_2_6__2();
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
    // $ANTLR end rule__SpecialFunction__Group_2_6__1


    // $ANTLR start rule__SpecialFunction__Group_2_6__1__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3811:1: rule__SpecialFunction__Group_2_6__1__Impl : ( RULE_ID ) ;
    public final void rule__SpecialFunction__Group_2_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3815:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3816:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3816:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3817:1: RULE_ID
            {
             before(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_6_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SpecialFunction__Group_2_6__1__Impl7686); 
             after(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialFunction__Group_2_6__1__Impl


    // $ANTLR start rule__SpecialFunction__Group_2_6__2
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3828:1: rule__SpecialFunction__Group_2_6__2 : rule__SpecialFunction__Group_2_6__2__Impl ;
    public final void rule__SpecialFunction__Group_2_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3832:1: ( rule__SpecialFunction__Group_2_6__2__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3833:2: rule__SpecialFunction__Group_2_6__2__Impl
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_6__2__Impl_in_rule__SpecialFunction__Group_2_6__27715);
            rule__SpecialFunction__Group_2_6__2__Impl();
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
    // $ANTLR end rule__SpecialFunction__Group_2_6__2


    // $ANTLR start rule__SpecialFunction__Group_2_6__2__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3839:1: rule__SpecialFunction__Group_2_6__2__Impl : ( '}' ) ;
    public final void rule__SpecialFunction__Group_2_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3843:1: ( ( '}' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3844:1: ( '}' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3844:1: ( '}' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3845:1: '}'
            {
             before(grammarAccess.getSpecialFunctionAccess().getRightCurlyBracketKeyword_2_6_2()); 
            match(input,19,FOLLOW_19_in_rule__SpecialFunction__Group_2_6__2__Impl7743); 
             after(grammarAccess.getSpecialFunctionAccess().getRightCurlyBracketKeyword_2_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialFunction__Group_2_6__2__Impl


    // $ANTLR start rule__CfModel__ElementsAssignment
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3865:1: rule__CfModel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__CfModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3869:1: ( ( ruleAbstractElement ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3870:1: ( ruleAbstractElement )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3870:1: ( ruleAbstractElement )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3871:1: ruleAbstractElement
            {
             before(grammarAccess.getCfModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__CfModel__ElementsAssignment7785);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3880:1: rule__Bundle__ComponentAssignment_1 : ( ruleBundleComponent ) ;
    public final void rule__Bundle__ComponentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3884:1: ( ( ruleBundleComponent ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3885:1: ( ruleBundleComponent )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3885:1: ( ruleBundleComponent )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3886:1: ruleBundleComponent
            {
             before(grammarAccess.getBundleAccess().getComponentBundleComponentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBundleComponent_in_rule__Bundle__ComponentAssignment_17816);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3895:1: rule__Bundle__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Bundle__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3899:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3900:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3900:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3901:1: RULE_ID
            {
             before(grammarAccess.getBundleAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Bundle__NameAssignment_27847); 
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


    // $ANTLR start rule__Bundle__PromiseTypeAssignment_5
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3910:1: rule__Bundle__PromiseTypeAssignment_5 : ( ruleBundlePromiseType ) ;
    public final void rule__Bundle__PromiseTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3914:1: ( ( ruleBundlePromiseType ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3915:1: ( ruleBundlePromiseType )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3915:1: ( ruleBundlePromiseType )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3916:1: ruleBundlePromiseType
            {
             before(grammarAccess.getBundleAccess().getPromiseTypeBundlePromiseTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleBundlePromiseType_in_rule__Bundle__PromiseTypeAssignment_57878);
            ruleBundlePromiseType();
            _fsp--;

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
    // $ANTLR end rule__Bundle__PromiseTypeAssignment_5


    // $ANTLR start rule__BundlePromiseType__NameAssignment_0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3925:1: rule__BundlePromiseType__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BundlePromiseType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3929:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3930:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3930:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3931:1: RULE_ID
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BundlePromiseType__NameAssignment_07909); 
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
    // $ANTLR end rule__BundlePromiseType__NameAssignment_0


    // $ANTLR start rule__BundlePromiseType__PromisesAssignment_2
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3940:1: rule__BundlePromiseType__PromisesAssignment_2 : ( ruleBundlePromise ) ;
    public final void rule__BundlePromiseType__PromisesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3944:1: ( ( ruleBundlePromise ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3945:1: ( ruleBundlePromise )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3945:1: ( ruleBundlePromise )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3946:1: ruleBundlePromise
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getPromisesBundlePromiseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBundlePromise_in_rule__BundlePromiseType__PromisesAssignment_27940);
            ruleBundlePromise();
            _fsp--;

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
    // $ANTLR end rule__BundlePromiseType__PromisesAssignment_2


    // $ANTLR start rule__BundlePromiseType__ClassesAssignment_3
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3955:1: rule__BundlePromiseType__ClassesAssignment_3 : ( ruleBundleClass ) ;
    public final void rule__BundlePromiseType__ClassesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3959:1: ( ( ruleBundleClass ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3960:1: ( ruleBundleClass )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3960:1: ( ruleBundleClass )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3961:1: ruleBundleClass
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getClassesBundleClassParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBundleClass_in_rule__BundlePromiseType__ClassesAssignment_37971);
            ruleBundleClass();
            _fsp--;

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
    // $ANTLR end rule__BundlePromiseType__ClassesAssignment_3


    // $ANTLR start rule__BundleClass__NameAssignment_0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3970:1: rule__BundleClass__NameAssignment_0 : ( ruleCLASS_ID ) ;
    public final void rule__BundleClass__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3974:1: ( ( ruleCLASS_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3975:1: ( ruleCLASS_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3975:1: ( ruleCLASS_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3976:1: ruleCLASS_ID
            {
             before(grammarAccess.getBundleClassAccess().getNameCLASS_IDParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCLASS_ID_in_rule__BundleClass__NameAssignment_08002);
            ruleCLASS_ID();
            _fsp--;

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
    // $ANTLR end rule__BundleClass__NameAssignment_0


    // $ANTLR start rule__BundleClass__PromisesAssignment_2
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3985:1: rule__BundleClass__PromisesAssignment_2 : ( ruleBundlePromise ) ;
    public final void rule__BundleClass__PromisesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3989:1: ( ( ruleBundlePromise ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3990:1: ( ruleBundlePromise )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3990:1: ( ruleBundlePromise )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3991:1: ruleBundlePromise
            {
             before(grammarAccess.getBundleClassAccess().getPromisesBundlePromiseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBundlePromise_in_rule__BundleClass__PromisesAssignment_28033);
            ruleBundlePromise();
            _fsp--;

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
    // $ANTLR end rule__BundleClass__PromisesAssignment_2


    // $ANTLR start rule__BundlePromise__NameAssignment_0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4000:1: rule__BundlePromise__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BundlePromise__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4004:1: ( ( RULE_STRING ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4005:1: ( RULE_STRING )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4005:1: ( RULE_STRING )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4006:1: RULE_STRING
            {
             before(grammarAccess.getBundlePromiseAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BundlePromise__NameAssignment_08064); 
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
    // $ANTLR end rule__BundlePromise__NameAssignment_0


    // $ANTLR start rule__BundlePromise__ValuesAssignment_1_0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4015:1: rule__BundlePromise__ValuesAssignment_1_0 : ( rulePromiseValue ) ;
    public final void rule__BundlePromise__ValuesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4019:1: ( ( rulePromiseValue ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4020:1: ( rulePromiseValue )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4020:1: ( rulePromiseValue )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4021:1: rulePromiseValue
            {
             before(grammarAccess.getBundlePromiseAccess().getValuesPromiseValueParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_rulePromiseValue_in_rule__BundlePromise__ValuesAssignment_1_08095);
            rulePromiseValue();
            _fsp--;

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
    // $ANTLR end rule__BundlePromise__ValuesAssignment_1_0


    // $ANTLR start rule__BundlePromise__ValuesAssignment_1_1_1
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4030:1: rule__BundlePromise__ValuesAssignment_1_1_1 : ( rulePromiseValue ) ;
    public final void rule__BundlePromise__ValuesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4034:1: ( ( rulePromiseValue ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4035:1: ( rulePromiseValue )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4035:1: ( rulePromiseValue )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4036:1: rulePromiseValue
            {
             before(grammarAccess.getBundlePromiseAccess().getValuesPromiseValueParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_rulePromiseValue_in_rule__BundlePromise__ValuesAssignment_1_1_18126);
            rulePromiseValue();
            _fsp--;

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
    // $ANTLR end rule__BundlePromise__ValuesAssignment_1_1_1


    // $ANTLR start rule__PromiseValue__KeywordAssignment_0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4045:1: rule__PromiseValue__KeywordAssignment_0 : ( RULE_ID ) ;
    public final void rule__PromiseValue__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4049:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4050:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4050:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4051:1: RULE_ID
            {
             before(grammarAccess.getPromiseValueAccess().getKeywordIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PromiseValue__KeywordAssignment_08157); 
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
    // $ANTLR end rule__PromiseValue__KeywordAssignment_0


    // $ANTLR start rule__PromiseValue__ValuesAssignment_2_0_0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4060:1: rule__PromiseValue__ValuesAssignment_2_0_0 : ( RULE_STRING ) ;
    public final void rule__PromiseValue__ValuesAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4064:1: ( ( RULE_STRING ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4065:1: ( RULE_STRING )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4065:1: ( RULE_STRING )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4066:1: RULE_STRING
            {
             before(grammarAccess.getPromiseValueAccess().getValuesSTRINGTerminalRuleCall_2_0_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PromiseValue__ValuesAssignment_2_0_08188); 
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
    // $ANTLR end rule__PromiseValue__ValuesAssignment_2_0_0


    // $ANTLR start rule__PromiseValue__FunctionsAssignment_2_0_1
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4075:1: rule__PromiseValue__FunctionsAssignment_2_0_1 : ( ruleSimpleFunction ) ;
    public final void rule__PromiseValue__FunctionsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4079:1: ( ( ruleSimpleFunction ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4080:1: ( ruleSimpleFunction )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4080:1: ( ruleSimpleFunction )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4081:1: ruleSimpleFunction
            {
             before(grammarAccess.getPromiseValueAccess().getFunctionsSimpleFunctionParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_ruleSimpleFunction_in_rule__PromiseValue__FunctionsAssignment_2_0_18219);
            ruleSimpleFunction();
            _fsp--;

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
    // $ANTLR end rule__PromiseValue__FunctionsAssignment_2_0_1


    // $ANTLR start rule__PromiseValue__ValuesAssignment_2_1_1_0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4090:1: rule__PromiseValue__ValuesAssignment_2_1_1_0 : ( RULE_STRING ) ;
    public final void rule__PromiseValue__ValuesAssignment_2_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4094:1: ( ( RULE_STRING ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4095:1: ( RULE_STRING )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4095:1: ( RULE_STRING )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4096:1: RULE_STRING
            {
             before(grammarAccess.getPromiseValueAccess().getValuesSTRINGTerminalRuleCall_2_1_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PromiseValue__ValuesAssignment_2_1_1_08250); 
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
    // $ANTLR end rule__PromiseValue__ValuesAssignment_2_1_1_0


    // $ANTLR start rule__PromiseValue__FunctionsAssignment_2_1_1_1
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4105:1: rule__PromiseValue__FunctionsAssignment_2_1_1_1 : ( ruleSimpleFunction ) ;
    public final void rule__PromiseValue__FunctionsAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4109:1: ( ( ruleSimpleFunction ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4110:1: ( ruleSimpleFunction )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4110:1: ( ruleSimpleFunction )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4111:1: ruleSimpleFunction
            {
             before(grammarAccess.getPromiseValueAccess().getFunctionsSimpleFunctionParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleSimpleFunction_in_rule__PromiseValue__FunctionsAssignment_2_1_1_18281);
            ruleSimpleFunction();
            _fsp--;

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
    // $ANTLR end rule__PromiseValue__FunctionsAssignment_2_1_1_1


    // $ANTLR start rule__PromiseValue__ValuesAssignment_2_1_2_1_0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4120:1: rule__PromiseValue__ValuesAssignment_2_1_2_1_0 : ( RULE_STRING ) ;
    public final void rule__PromiseValue__ValuesAssignment_2_1_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4124:1: ( ( RULE_STRING ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4125:1: ( RULE_STRING )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4125:1: ( RULE_STRING )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4126:1: RULE_STRING
            {
             before(grammarAccess.getPromiseValueAccess().getValuesSTRINGTerminalRuleCall_2_1_2_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PromiseValue__ValuesAssignment_2_1_2_1_08312); 
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
    // $ANTLR end rule__PromiseValue__ValuesAssignment_2_1_2_1_0


    // $ANTLR start rule__PromiseValue__FunctionsAssignment_2_1_2_1_1
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4135:1: rule__PromiseValue__FunctionsAssignment_2_1_2_1_1 : ( ruleSimpleFunction ) ;
    public final void rule__PromiseValue__FunctionsAssignment_2_1_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4139:1: ( ( ruleSimpleFunction ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4140:1: ( ruleSimpleFunction )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4140:1: ( ruleSimpleFunction )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4141:1: ruleSimpleFunction
            {
             before(grammarAccess.getPromiseValueAccess().getFunctionsSimpleFunctionParserRuleCall_2_1_2_1_1_0()); 
            pushFollow(FOLLOW_ruleSimpleFunction_in_rule__PromiseValue__FunctionsAssignment_2_1_2_1_18343);
            ruleSimpleFunction();
            _fsp--;

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
    // $ANTLR end rule__PromiseValue__FunctionsAssignment_2_1_2_1_1


    // $ANTLR start rule__Body__ComponentAssignment_1
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4150:1: rule__Body__ComponentAssignment_1 : ( ruleBodyComponent ) ;
    public final void rule__Body__ComponentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4154:1: ( ( ruleBodyComponent ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4155:1: ( ruleBodyComponent )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4155:1: ( ruleBodyComponent )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4156:1: ruleBodyComponent
            {
             before(grammarAccess.getBodyAccess().getComponentBodyComponentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBodyComponent_in_rule__Body__ComponentAssignment_18374);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4165:1: rule__Body__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Body__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4169:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4170:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4170:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4171:1: RULE_ID
            {
             before(grammarAccess.getBodyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Body__NameAssignment_28405); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4180:1: rule__Body__VariablesAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Body__VariablesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4184:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4185:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4185:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4186:1: RULE_ID
            {
             before(grammarAccess.getBodyAccess().getVariablesIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Body__VariablesAssignment_3_18436); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4195:1: rule__Body__VariablesAssignment_3_2_1 : ( RULE_ID ) ;
    public final void rule__Body__VariablesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4199:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4200:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4200:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4201:1: RULE_ID
            {
             before(grammarAccess.getBodyAccess().getVariablesIDTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Body__VariablesAssignment_3_2_18467); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4210:1: rule__Body__PromiseTypeAssignment_5 : ( ruleBodyFunction ) ;
    public final void rule__Body__PromiseTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4214:1: ( ( ruleBodyFunction ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4215:1: ( ruleBodyFunction )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4215:1: ( ruleBodyFunction )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4216:1: ruleBodyFunction
            {
             before(grammarAccess.getBodyAccess().getPromiseTypeBodyFunctionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleBodyFunction_in_rule__Body__PromiseTypeAssignment_58498);
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


    // $ANTLR start rule__Body__ClassesAssignment_6
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4225:1: rule__Body__ClassesAssignment_6 : ( ruleBodyClass ) ;
    public final void rule__Body__ClassesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4229:1: ( ( ruleBodyClass ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4230:1: ( ruleBodyClass )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4230:1: ( ruleBodyClass )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4231:1: ruleBodyClass
            {
             before(grammarAccess.getBodyAccess().getClassesBodyClassParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleBodyClass_in_rule__Body__ClassesAssignment_68529);
            ruleBodyClass();
            _fsp--;

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
    // $ANTLR end rule__Body__ClassesAssignment_6


    // $ANTLR start rule__BodyClass__NameAssignment_0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4240:1: rule__BodyClass__NameAssignment_0 : ( ruleCLASS_ID ) ;
    public final void rule__BodyClass__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4244:1: ( ( ruleCLASS_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4245:1: ( ruleCLASS_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4245:1: ( ruleCLASS_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4246:1: ruleCLASS_ID
            {
             before(grammarAccess.getBodyClassAccess().getNameCLASS_IDParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCLASS_ID_in_rule__BodyClass__NameAssignment_08560);
            ruleCLASS_ID();
            _fsp--;

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
    // $ANTLR end rule__BodyClass__NameAssignment_0


    // $ANTLR start rule__BodyClass__PromiseTypeAssignment_2
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4255:1: rule__BodyClass__PromiseTypeAssignment_2 : ( ruleBodyFunction ) ;
    public final void rule__BodyClass__PromiseTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4259:1: ( ( ruleBodyFunction ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4260:1: ( ruleBodyFunction )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4260:1: ( ruleBodyFunction )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4261:1: ruleBodyFunction
            {
             before(grammarAccess.getBodyClassAccess().getPromiseTypeBodyFunctionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBodyFunction_in_rule__BodyClass__PromiseTypeAssignment_28591);
            ruleBodyFunction();
            _fsp--;

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
    // $ANTLR end rule__BodyClass__PromiseTypeAssignment_2


    // $ANTLR start rule__BodyFunction__NameAssignment_0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4270:1: rule__BodyFunction__NameAssignment_0 : ( ruleBodyPromiseType ) ;
    public final void rule__BodyFunction__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4274:1: ( ( ruleBodyPromiseType ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4275:1: ( ruleBodyPromiseType )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4275:1: ( ruleBodyPromiseType )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4276:1: ruleBodyPromiseType
            {
             before(grammarAccess.getBodyFunctionAccess().getNameBodyPromiseTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBodyPromiseType_in_rule__BodyFunction__NameAssignment_08622);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4285:1: rule__BodyFunction__ValuesAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__BodyFunction__ValuesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4289:1: ( ( RULE_STRING ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4290:1: ( RULE_STRING )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4290:1: ( RULE_STRING )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4291:1: RULE_STRING
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_08653); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4300:1: rule__BodyFunction__ListAssignment_2_1_0 : ( ( '{' ) ) ;
    public final void rule__BodyFunction__ListAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4304:1: ( ( ( '{' ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4305:1: ( ( '{' ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4305:1: ( ( '{' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4306:1: ( '{' )
            {
             before(grammarAccess.getBodyFunctionAccess().getListLeftCurlyBracketKeyword_2_1_0_0()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4307:1: ( '{' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4308:1: '{'
            {
             before(grammarAccess.getBodyFunctionAccess().getListLeftCurlyBracketKeyword_2_1_0_0()); 
            match(input,18,FOLLOW_18_in_rule__BodyFunction__ListAssignment_2_1_08689); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4323:1: rule__BodyFunction__ValuesAssignment_2_1_1 : ( RULE_STRING ) ;
    public final void rule__BodyFunction__ValuesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4327:1: ( ( RULE_STRING ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4328:1: ( RULE_STRING )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4328:1: ( RULE_STRING )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4329:1: RULE_STRING
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_1_18728); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4338:1: rule__BodyFunction__ValuesAssignment_2_1_2_1 : ( RULE_STRING ) ;
    public final void rule__BodyFunction__ValuesAssignment_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4342:1: ( ( RULE_STRING ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4343:1: ( RULE_STRING )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4343:1: ( RULE_STRING )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4344:1: RULE_STRING
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_1_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_1_2_18759); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4353:1: rule__BodyFunction__FunctionAssignment_2_2 : ( ruleSpecialFunction ) ;
    public final void rule__BodyFunction__FunctionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4357:1: ( ( ruleSpecialFunction ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4358:1: ( ruleSpecialFunction )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4358:1: ( ruleSpecialFunction )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4359:1: ruleSpecialFunction
            {
             before(grammarAccess.getBodyFunctionAccess().getFunctionSpecialFunctionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleSpecialFunction_in_rule__BodyFunction__FunctionAssignment_2_28790);
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


    // $ANTLR start rule__SimpleFunction__IdAssignment_0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4368:1: rule__SimpleFunction__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__SimpleFunction__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4372:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4373:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4373:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4374:1: RULE_ID
            {
             before(grammarAccess.getSimpleFunctionAccess().getIdIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleFunction__IdAssignment_08821); 
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
    // $ANTLR end rule__SimpleFunction__IdAssignment_0


    // $ANTLR start rule__SimpleFunction__ValuesAssignment_2
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4383:1: rule__SimpleFunction__ValuesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SimpleFunction__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4387:1: ( ( RULE_STRING ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4388:1: ( RULE_STRING )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4388:1: ( RULE_STRING )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4389:1: RULE_STRING
            {
             before(grammarAccess.getSimpleFunctionAccess().getValuesSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleFunction__ValuesAssignment_28852); 
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
    // $ANTLR end rule__SimpleFunction__ValuesAssignment_2


    // $ANTLR start rule__SimpleFunction__ValuesAssignment_3_1
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4398:1: rule__SimpleFunction__ValuesAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__SimpleFunction__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4402:1: ( ( RULE_STRING ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4403:1: ( RULE_STRING )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4403:1: ( RULE_STRING )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4404:1: RULE_STRING
            {
             before(grammarAccess.getSimpleFunctionAccess().getValuesSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleFunction__ValuesAssignment_3_18883); 
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
    // $ANTLR end rule__SimpleFunction__ValuesAssignment_3_1


    // $ANTLR start rule__SpecialFunction__IdAssignment_0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4413:1: rule__SpecialFunction__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__SpecialFunction__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4417:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4418:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4418:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4419:1: RULE_ID
            {
             before(grammarAccess.getSpecialFunctionAccess().getIdIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SpecialFunction__IdAssignment_08914); 
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
    // $ANTLR end rule__SpecialFunction__IdAssignment_0


    // $ANTLR start rule__SpecialFunction__FuncAssignment_2_7
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4428:1: rule__SpecialFunction__FuncAssignment_2_7 : ( ruleSpecialFunction ) ;
    public final void rule__SpecialFunction__FuncAssignment_2_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4432:1: ( ( ruleSpecialFunction ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4433:1: ( ruleSpecialFunction )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4433:1: ( ruleSpecialFunction )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4434:1: ruleSpecialFunction
            {
             before(grammarAccess.getSpecialFunctionAccess().getFuncSpecialFunctionParserRuleCall_2_7_0()); 
            pushFollow(FOLLOW_ruleSpecialFunction_in_rule__SpecialFunction__FuncAssignment_2_78945);
            ruleSpecialFunction();
            _fsp--;

             after(grammarAccess.getSpecialFunctionAccess().getFuncSpecialFunctionParserRuleCall_2_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SpecialFunction__FuncAssignment_2_7


    // $ANTLR start rule__BodyPromiseType__NameAssignment
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4443:1: rule__BodyPromiseType__NameAssignment : ( RULE_ID ) ;
    public final void rule__BodyPromiseType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4447:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4448:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4448:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4449:1: RULE_ID
            {
             before(grammarAccess.getBodyPromiseTypeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BodyPromiseType__NameAssignment8976); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4458:1: rule__BundleComponent__NameAssignment : ( RULE_ID ) ;
    public final void rule__BundleComponent__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4462:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4463:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4463:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4464:1: RULE_ID
            {
             before(grammarAccess.getBundleComponentAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BundleComponent__NameAssignment9007); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4473:1: rule__BodyComponent__NameAssignment : ( RULE_ID ) ;
    public final void rule__BodyComponent__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4477:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4478:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4478:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4479:1: RULE_ID
            {
             before(grammarAccess.getBodyComponentAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BodyComponent__NameAssignment9038); 
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
    public static final BitSet FOLLOW_rule__CfModel__ElementsAssignment_in_ruleCfModel94 = new BitSet(new long[]{0x0000000000820002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_entryRuleCLASS_ID122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCLASS_ID129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Alternatives_in_ruleCLASS_ID155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePLACEHOLDERB_in_entryRulePLACEHOLDERB182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePLACEHOLDERB189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PLACEHOLDERB__Alternatives_in_rulePLACEHOLDERB215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_ruleAbstractElement275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_entryRulePart301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePart308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Alternatives_in_rulePart334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundle_in_entryRuleBundle361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundle368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__0_in_ruleBundle394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundlePromiseType_in_entryRuleBundlePromiseType421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundlePromiseType428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__Group__0_in_ruleBundlePromiseType454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundleClass_in_entryRuleBundleClass481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundleClass488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundleClass__Group__0_in_ruleBundleClass514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundlePromise_in_entryRuleBundlePromise541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundlePromise548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group__0_in_ruleBundlePromise574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePromiseValue_in_entryRulePromiseValue601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePromiseValue608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group__0_in_rulePromiseValue634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__0_in_ruleBody694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyClass_in_entryRuleBodyClass721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyClass728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyClass__Group__0_in_ruleBodyClass754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_entryRuleBodyFunction781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyFunction788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__0_in_ruleBodyFunction814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_entryRuleSimpleFunction841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleFunction848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__0_in_ruleSimpleFunction874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_entryRuleSpecialFunction901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialFunction908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__0_in_ruleSpecialFunction934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyPromiseType_in_entryRuleBodyPromiseType961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyPromiseType968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyPromiseType__NameAssignment_in_ruleBodyPromiseType994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundleComponent_in_entryRuleBundleComponent1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundleComponent1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundleComponent__NameAssignment_in_ruleBundleComponent1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_entryRuleBodyComponent1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyComponent1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyComponent__NameAssignment_in_ruleBodyComponent1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CLASS_ID__Alternatives1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_1__0_in_rule__CLASS_ID__Alternatives1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2__0_in_rule__CLASS_ID__Alternatives1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_3__0_in_rule__CLASS_ID__Alternatives1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__PLACEHOLDERB__Alternatives1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PLACEHOLDERB__Alternatives1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PLACEHOLDERB__Alternatives1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__PLACEHOLDERB__Alternatives1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__PLACEHOLDERB__Alternatives1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__PLACEHOLDERB__Alternatives1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PLACEHOLDERB__Alternatives1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PLACEHOLDERB__Alternatives1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundle_in_rule__Part__Alternatives1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_rule__Part__Alternatives1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Alternatives_2_0_in_rule__PromiseValue__Alternatives_21451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1__0_in_rule__PromiseValue__Alternatives_21469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__0_in_rule__PromiseValue__Alternatives_21487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__ValuesAssignment_2_0_0_in_rule__PromiseValue__Alternatives_2_01520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__FunctionsAssignment_2_0_1_in_rule__PromiseValue__Alternatives_2_01538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__ValuesAssignment_2_1_1_0_in_rule__PromiseValue__Alternatives_2_1_11571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__FunctionsAssignment_2_1_1_1_in_rule__PromiseValue__Alternatives_2_1_11589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__ValuesAssignment_2_1_2_1_0_in_rule__PromiseValue__Alternatives_2_1_2_11622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__FunctionsAssignment_2_1_2_1_1_in_rule__PromiseValue__Alternatives_2_1_2_11640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__ValuesAssignment_2_0_in_rule__BodyFunction__Alternatives_21673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__0_in_rule__BodyFunction__Alternatives_21691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__FunctionAssignment_2_2_in_rule__BodyFunction__Alternatives_21709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__0_in_rule__BodyFunction__Alternatives_21727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__SpecialFunction__Alternatives_21760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SpecialFunction__Alternatives_21777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SpecialFunction__Alternatives_21794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SpecialFunction__Alternatives_21811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SpecialFunction__Alternatives_21829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_5__0_in_rule__SpecialFunction__Alternatives_21848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_6__0_in_rule__SpecialFunction__Alternatives_21866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__FuncAssignment_2_7_in_rule__SpecialFunction__Alternatives_21884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_1__0__Impl_in_rule__CLASS_ID__Group_1__01915 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_1__1_in_rule__CLASS_ID__Group_1__01918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CLASS_ID__Group_1__0__Impl1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_1__1__Impl_in_rule__CLASS_ID__Group_1__11974 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_1__2_in_rule__CLASS_ID__Group_1__11977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CLASS_ID__Group_1__1__Impl2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_1__2__Impl_in_rule__CLASS_ID__Group_1__22036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CLASS_ID__Group_1__2__Impl2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2__0__Impl_in_rule__CLASS_ID__Group_2__02098 = new BitSet(new long[]{0x0000000000012010L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2__1_in_rule__CLASS_ID__Group_2__02101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CLASS_ID__Group_2__0__Impl2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2__1__Impl_in_rule__CLASS_ID__Group_2__12160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_rule__CLASS_ID__Group_2__1__Impl2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_3__0__Impl_in_rule__CLASS_ID__Group_3__02220 = new BitSet(new long[]{0x0000000000012010L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_3__1_in_rule__CLASS_ID__Group_3__02223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CLASS_ID__Group_3__0__Impl2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_3__1__Impl_in_rule__CLASS_ID__Group_3__12282 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_3__2_in_rule__CLASS_ID__Group_3__12285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_rule__CLASS_ID__Group_3__1__Impl2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_3__2__Impl_in_rule__CLASS_ID__Group_3__22341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CLASS_ID__Group_3__2__Impl2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__0__Impl_in_rule__Bundle__Group__02406 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Bundle__Group__1_in_rule__Bundle__Group__02409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Bundle__Group__0__Impl2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__1__Impl_in_rule__Bundle__Group__12468 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Bundle__Group__2_in_rule__Bundle__Group__12471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__ComponentAssignment_1_in_rule__Bundle__Group__1__Impl2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__2__Impl_in_rule__Bundle__Group__22528 = new BitSet(new long[]{0x0000000000047C70L});
    public static final BitSet FOLLOW_rule__Bundle__Group__3_in_rule__Bundle__Group__22531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__NameAssignment_2_in_rule__Bundle__Group__2__Impl2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__3__Impl_in_rule__Bundle__Group__32588 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Bundle__Group__4_in_rule__Bundle__Group__32591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePLACEHOLDERB_in_rule__Bundle__Group__3__Impl2619 = new BitSet(new long[]{0x0000000000007C72L});
    public static final BitSet FOLLOW_rule__Bundle__Group__4__Impl_in_rule__Bundle__Group__42650 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_rule__Bundle__Group__5_in_rule__Bundle__Group__42653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Bundle__Group__4__Impl2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__5__Impl_in_rule__Bundle__Group__52712 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Bundle__Group__6_in_rule__Bundle__Group__52715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__PromiseTypeAssignment_5_in_rule__Bundle__Group__5__Impl2742 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Bundle__Group__6__Impl_in_rule__Bundle__Group__62773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Bundle__Group__6__Impl2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__Group__0__Impl_in_rule__BundlePromiseType__Group__02846 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__Group__1_in_rule__BundlePromiseType__Group__02849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__NameAssignment_0_in_rule__BundlePromiseType__Group__0__Impl2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__Group__1__Impl_in_rule__BundlePromiseType__Group__12906 = new BitSet(new long[]{0x0000000000012052L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__Group__2_in_rule__BundlePromiseType__Group__12909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BundlePromiseType__Group__1__Impl2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__Group__2__Impl_in_rule__BundlePromiseType__Group__22968 = new BitSet(new long[]{0x0000000000012012L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__Group__3_in_rule__BundlePromiseType__Group__22971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__PromisesAssignment_2_in_rule__BundlePromiseType__Group__2__Impl2998 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__Group__3__Impl_in_rule__BundlePromiseType__Group__33029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__ClassesAssignment_3_in_rule__BundlePromiseType__Group__3__Impl3056 = new BitSet(new long[]{0x0000000000012012L});
    public static final BitSet FOLLOW_rule__BundleClass__Group__0__Impl_in_rule__BundleClass__Group__03095 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__BundleClass__Group__1_in_rule__BundleClass__Group__03098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundleClass__NameAssignment_0_in_rule__BundleClass__Group__0__Impl3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundleClass__Group__1__Impl_in_rule__BundleClass__Group__13155 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BundleClass__Group__2_in_rule__BundleClass__Group__13158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BundleClass__Group__1__Impl3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundleClass__Group__2__Impl_in_rule__BundleClass__Group__23217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundleClass__PromisesAssignment_2_in_rule__BundleClass__Group__2__Impl3246 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__BundleClass__PromisesAssignment_2_in_rule__BundleClass__Group__2__Impl3258 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group__0__Impl_in_rule__BundlePromise__Group__03297 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group__1_in_rule__BundlePromise__Group__03300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__NameAssignment_0_in_rule__BundlePromise__Group__0__Impl3327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group__1__Impl_in_rule__BundlePromise__Group__13357 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group__2_in_rule__BundlePromise__Group__13360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group_1__0_in_rule__BundlePromise__Group__1__Impl3387 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group__2__Impl_in_rule__BundlePromise__Group__23418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BundlePromise__Group__2__Impl3446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group_1__0__Impl_in_rule__BundlePromise__Group_1__03483 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group_1__1_in_rule__BundlePromise__Group_1__03486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__ValuesAssignment_1_0_in_rule__BundlePromise__Group_1__0__Impl3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group_1__1__Impl_in_rule__BundlePromise__Group_1__13543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group_1_1__0_in_rule__BundlePromise__Group_1__1__Impl3570 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group_1_1__0__Impl_in_rule__BundlePromise__Group_1_1__03605 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group_1_1__1_in_rule__BundlePromise__Group_1_1__03608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BundlePromise__Group_1_1__0__Impl3636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group_1_1__1__Impl_in_rule__BundlePromise__Group_1_1__13667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__ValuesAssignment_1_1_1_in_rule__BundlePromise__Group_1_1__1__Impl3694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group__0__Impl_in_rule__PromiseValue__Group__03728 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group__1_in_rule__PromiseValue__Group__03731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__KeywordAssignment_0_in_rule__PromiseValue__Group__0__Impl3758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group__1__Impl_in_rule__PromiseValue__Group__13788 = new BitSet(new long[]{0x0000000000040050L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group__2_in_rule__PromiseValue__Group__13791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__PromiseValue__Group__1__Impl3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group__2__Impl_in_rule__PromiseValue__Group__23850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Alternatives_2_in_rule__PromiseValue__Group__2__Impl3877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1__0__Impl_in_rule__PromiseValue__Group_2_1__03913 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1__1_in_rule__PromiseValue__Group_2_1__03916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PromiseValue__Group_2_1__0__Impl3944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1__1__Impl_in_rule__PromiseValue__Group_2_1__13975 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1__2_in_rule__PromiseValue__Group_2_1__13978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Alternatives_2_1_1_in_rule__PromiseValue__Group_2_1__1__Impl4005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1__2__Impl_in_rule__PromiseValue__Group_2_1__24035 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1__3_in_rule__PromiseValue__Group_2_1__24038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1_2__0_in_rule__PromiseValue__Group_2_1__2__Impl4065 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1__3__Impl_in_rule__PromiseValue__Group_2_1__34096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PromiseValue__Group_2_1__3__Impl4124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1_2__0__Impl_in_rule__PromiseValue__Group_2_1_2__04163 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1_2__1_in_rule__PromiseValue__Group_2_1_2__04166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__PromiseValue__Group_2_1_2__0__Impl4194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1_2__1__Impl_in_rule__PromiseValue__Group_2_1_2__14225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Alternatives_2_1_2_1_in_rule__PromiseValue__Group_2_1_2__1__Impl4252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__0__Impl_in_rule__PromiseValue__Group_2_2__04286 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__1_in_rule__PromiseValue__Group_2_2__04289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PromiseValue__Group_2_2__0__Impl4317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__1__Impl_in_rule__PromiseValue__Group_2_2__14348 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__2_in_rule__PromiseValue__Group_2_2__14351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PromiseValue__Group_2_2__1__Impl4379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__2__Impl_in_rule__PromiseValue__Group_2_2__24410 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__3_in_rule__PromiseValue__Group_2_2__24413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PromiseValue__Group_2_2__2__Impl4441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__3__Impl_in_rule__PromiseValue__Group_2_2__34472 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__4_in_rule__PromiseValue__Group_2_2__34475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PromiseValue__Group_2_2__3__Impl4502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__4__Impl_in_rule__PromiseValue__Group_2_2__44531 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__5_in_rule__PromiseValue__Group_2_2__44534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PromiseValue__Group_2_2__4__Impl4562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__5__Impl_in_rule__PromiseValue__Group_2_2__54593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PromiseValue__Group_2_2__5__Impl4621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__0__Impl_in_rule__Body__Group__04664 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Body__Group__1_in_rule__Body__Group__04667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Body__Group__0__Impl4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__1__Impl_in_rule__Body__Group__14726 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Body__Group__2_in_rule__Body__Group__14729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__ComponentAssignment_1_in_rule__Body__Group__1__Impl4756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__2__Impl_in_rule__Body__Group__24786 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_rule__Body__Group__3_in_rule__Body__Group__24789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__NameAssignment_2_in_rule__Body__Group__2__Impl4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__3__Impl_in_rule__Body__Group__34846 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Body__Group__4_in_rule__Body__Group__34849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3__0_in_rule__Body__Group__3__Impl4876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__4__Impl_in_rule__Body__Group__44907 = new BitSet(new long[]{0x0000000000092010L});
    public static final BitSet FOLLOW_rule__Body__Group__5_in_rule__Body__Group__44910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Body__Group__4__Impl4938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__5__Impl_in_rule__Body__Group__54969 = new BitSet(new long[]{0x0000000000092010L});
    public static final BitSet FOLLOW_rule__Body__Group__6_in_rule__Body__Group__54972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__PromiseTypeAssignment_5_in_rule__Body__Group__5__Impl4999 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Body__Group__6__Impl_in_rule__Body__Group__65030 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Body__Group__7_in_rule__Body__Group__65033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__ClassesAssignment_6_in_rule__Body__Group__6__Impl5060 = new BitSet(new long[]{0x0000000000012012L});
    public static final BitSet FOLLOW_rule__Body__Group__7__Impl_in_rule__Body__Group__75091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Body__Group__7__Impl5119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3__0__Impl_in_rule__Body__Group_3__05166 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Body__Group_3__1_in_rule__Body__Group_3__05169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Body__Group_3__0__Impl5197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3__1__Impl_in_rule__Body__Group_3__15228 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_rule__Body__Group_3__2_in_rule__Body__Group_3__15231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__VariablesAssignment_3_1_in_rule__Body__Group_3__1__Impl5258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3__2__Impl_in_rule__Body__Group_3__25288 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Body__Group_3__3_in_rule__Body__Group_3__25291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3_2__0_in_rule__Body__Group_3__2__Impl5318 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Body__Group_3__3__Impl_in_rule__Body__Group_3__35349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Body__Group_3__3__Impl5377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3_2__0__Impl_in_rule__Body__Group_3_2__05416 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Body__Group_3_2__1_in_rule__Body__Group_3_2__05419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Body__Group_3_2__0__Impl5447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3_2__1__Impl_in_rule__Body__Group_3_2__15478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__VariablesAssignment_3_2_1_in_rule__Body__Group_3_2__1__Impl5505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyClass__Group__0__Impl_in_rule__BodyClass__Group__05539 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__BodyClass__Group__1_in_rule__BodyClass__Group__05542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyClass__NameAssignment_0_in_rule__BodyClass__Group__0__Impl5569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyClass__Group__1__Impl_in_rule__BodyClass__Group__15599 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__BodyClass__Group__2_in_rule__BodyClass__Group__15602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BodyClass__Group__1__Impl5630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyClass__Group__2__Impl_in_rule__BodyClass__Group__25661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyClass__PromiseTypeAssignment_2_in_rule__BodyClass__Group__2__Impl5688 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__0__Impl_in_rule__BodyFunction__Group__05725 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__1_in_rule__BodyFunction__Group__05728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__NameAssignment_0_in_rule__BodyFunction__Group__0__Impl5755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__1__Impl_in_rule__BodyFunction__Group__15785 = new BitSet(new long[]{0x0000000000040050L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__2_in_rule__BodyFunction__Group__15788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__BodyFunction__Group__1__Impl5816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__2__Impl_in_rule__BodyFunction__Group__25847 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__3_in_rule__BodyFunction__Group__25850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Alternatives_2_in_rule__BodyFunction__Group__2__Impl5877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__3__Impl_in_rule__BodyFunction__Group__35907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BodyFunction__Group__3__Impl5935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__0__Impl_in_rule__BodyFunction__Group_2_1__05974 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__1_in_rule__BodyFunction__Group_2_1__05977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__ListAssignment_2_1_0_in_rule__BodyFunction__Group_2_1__0__Impl6004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__1__Impl_in_rule__BodyFunction__Group_2_1__16034 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__2_in_rule__BodyFunction__Group_2_1__16037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__ValuesAssignment_2_1_1_in_rule__BodyFunction__Group_2_1__1__Impl6064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__2__Impl_in_rule__BodyFunction__Group_2_1__26094 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__3_in_rule__BodyFunction__Group_2_1__26097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1_2__0_in_rule__BodyFunction__Group_2_1__2__Impl6124 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__3__Impl_in_rule__BodyFunction__Group_2_1__36155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BodyFunction__Group_2_1__3__Impl6183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1_2__0__Impl_in_rule__BodyFunction__Group_2_1_2__06222 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1_2__1_in_rule__BodyFunction__Group_2_1_2__06225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BodyFunction__Group_2_1_2__0__Impl6253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1_2__1__Impl_in_rule__BodyFunction__Group_2_1_2__16284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__ValuesAssignment_2_1_2_1_in_rule__BodyFunction__Group_2_1_2__1__Impl6311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__0__Impl_in_rule__BodyFunction__Group_2_3__06345 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__1_in_rule__BodyFunction__Group_2_3__06348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BodyFunction__Group_2_3__0__Impl6376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__1__Impl_in_rule__BodyFunction__Group_2_3__16407 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__2_in_rule__BodyFunction__Group_2_3__16410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BodyFunction__Group_2_3__1__Impl6438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__2__Impl_in_rule__BodyFunction__Group_2_3__26469 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__3_in_rule__BodyFunction__Group_2_3__26472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BodyFunction__Group_2_3__2__Impl6500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__3__Impl_in_rule__BodyFunction__Group_2_3__36531 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__4_in_rule__BodyFunction__Group_2_3__36534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BodyFunction__Group_2_3__3__Impl6561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__4__Impl_in_rule__BodyFunction__Group_2_3__46590 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__5_in_rule__BodyFunction__Group_2_3__46593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BodyFunction__Group_2_3__4__Impl6621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__5__Impl_in_rule__BodyFunction__Group_2_3__56652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BodyFunction__Group_2_3__5__Impl6680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__0__Impl_in_rule__SimpleFunction__Group__06723 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__1_in_rule__SimpleFunction__Group__06726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__IdAssignment_0_in_rule__SimpleFunction__Group__0__Impl6753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__1__Impl_in_rule__SimpleFunction__Group__16783 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__2_in_rule__SimpleFunction__Group__16786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SimpleFunction__Group__1__Impl6814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__2__Impl_in_rule__SimpleFunction__Group__26845 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__3_in_rule__SimpleFunction__Group__26848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__ValuesAssignment_2_in_rule__SimpleFunction__Group__2__Impl6875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__3__Impl_in_rule__SimpleFunction__Group__36905 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__4_in_rule__SimpleFunction__Group__36908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group_3__0_in_rule__SimpleFunction__Group__3__Impl6935 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__4__Impl_in_rule__SimpleFunction__Group__46966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SimpleFunction__Group__4__Impl6994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group_3__0__Impl_in_rule__SimpleFunction__Group_3__07035 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group_3__1_in_rule__SimpleFunction__Group_3__07038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SimpleFunction__Group_3__0__Impl7066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group_3__1__Impl_in_rule__SimpleFunction__Group_3__17097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__ValuesAssignment_3_1_in_rule__SimpleFunction__Group_3__1__Impl7124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__0__Impl_in_rule__SpecialFunction__Group__07158 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__1_in_rule__SpecialFunction__Group__07161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__IdAssignment_0_in_rule__SpecialFunction__Group__0__Impl7188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__1__Impl_in_rule__SpecialFunction__Group__17218 = new BitSet(new long[]{0x00000000030050F0L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__2_in_rule__SpecialFunction__Group__17221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SpecialFunction__Group__1__Impl7249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__2__Impl_in_rule__SpecialFunction__Group__27280 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__3_in_rule__SpecialFunction__Group__27283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Alternatives_2_in_rule__SpecialFunction__Group__2__Impl7310 = new BitSet(new long[]{0x00000000030010F2L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__3__Impl_in_rule__SpecialFunction__Group__37341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SpecialFunction__Group__3__Impl7369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_5__0__Impl_in_rule__SpecialFunction__Group_2_5__07408 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_5__1_in_rule__SpecialFunction__Group_2_5__07411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SpecialFunction__Group_2_5__0__Impl7439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_5__1__Impl_in_rule__SpecialFunction__Group_2_5__17470 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_5__2_in_rule__SpecialFunction__Group_2_5__17473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SpecialFunction__Group_2_5__1__Impl7500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_5__2__Impl_in_rule__SpecialFunction__Group_2_5__27529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SpecialFunction__Group_2_5__2__Impl7557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_6__0__Impl_in_rule__SpecialFunction__Group_2_6__07594 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_6__1_in_rule__SpecialFunction__Group_2_6__07597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SpecialFunction__Group_2_6__0__Impl7625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_6__1__Impl_in_rule__SpecialFunction__Group_2_6__17656 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_6__2_in_rule__SpecialFunction__Group_2_6__17659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SpecialFunction__Group_2_6__1__Impl7686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_6__2__Impl_in_rule__SpecialFunction__Group_2_6__27715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SpecialFunction__Group_2_6__2__Impl7743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__CfModel__ElementsAssignment7785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundleComponent_in_rule__Bundle__ComponentAssignment_17816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Bundle__NameAssignment_27847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundlePromiseType_in_rule__Bundle__PromiseTypeAssignment_57878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BundlePromiseType__NameAssignment_07909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundlePromise_in_rule__BundlePromiseType__PromisesAssignment_27940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundleClass_in_rule__BundlePromiseType__ClassesAssignment_37971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_rule__BundleClass__NameAssignment_08002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundlePromise_in_rule__BundleClass__PromisesAssignment_28033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BundlePromise__NameAssignment_08064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePromiseValue_in_rule__BundlePromise__ValuesAssignment_1_08095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePromiseValue_in_rule__BundlePromise__ValuesAssignment_1_1_18126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PromiseValue__KeywordAssignment_08157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PromiseValue__ValuesAssignment_2_0_08188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_rule__PromiseValue__FunctionsAssignment_2_0_18219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PromiseValue__ValuesAssignment_2_1_1_08250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_rule__PromiseValue__FunctionsAssignment_2_1_1_18281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PromiseValue__ValuesAssignment_2_1_2_1_08312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_rule__PromiseValue__FunctionsAssignment_2_1_2_1_18343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_rule__Body__ComponentAssignment_18374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Body__NameAssignment_28405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Body__VariablesAssignment_3_18436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Body__VariablesAssignment_3_2_18467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_rule__Body__PromiseTypeAssignment_58498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyClass_in_rule__Body__ClassesAssignment_68529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_rule__BodyClass__NameAssignment_08560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_rule__BodyClass__PromiseTypeAssignment_28591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyPromiseType_in_rule__BodyFunction__NameAssignment_08622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_08653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BodyFunction__ListAssignment_2_1_08689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_1_18728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_1_2_18759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_rule__BodyFunction__FunctionAssignment_2_28790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleFunction__IdAssignment_08821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleFunction__ValuesAssignment_28852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleFunction__ValuesAssignment_3_18883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SpecialFunction__IdAssignment_08914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_rule__SpecialFunction__FuncAssignment_2_78945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BodyPromiseType__NameAssignment8976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BundleComponent__NameAssignment9007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BodyComponent__NameAssignment9038 = new BitSet(new long[]{0x0000000000000002L});

}