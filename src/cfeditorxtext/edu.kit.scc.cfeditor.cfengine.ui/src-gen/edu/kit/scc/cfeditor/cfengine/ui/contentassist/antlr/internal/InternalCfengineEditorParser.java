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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANY_OTHER", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "'=>'", "';'", "','", "'('", "')'", "'.'", "'!'", "'bundle'", "'{'", "'}'", "':'", "'::'", "'@'", "'body'", "'$('", "'${'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=4;
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:565:1: rule__CLASS_ID__Alternatives : ( ( ( rule__CLASS_ID__Group_0__0 ) ) | ( ( rule__CLASS_ID__Group_1__0 ) ) | ( ( rule__CLASS_ID__Group_2__0 ) ) );
    public final void rule__CLASS_ID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:569:1: ( ( ( rule__CLASS_ID__Group_0__0 ) ) | ( ( rule__CLASS_ID__Group_1__0 ) ) | ( ( rule__CLASS_ID__Group_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("565:1: rule__CLASS_ID__Alternatives : ( ( ( rule__CLASS_ID__Group_0__0 ) ) | ( ( rule__CLASS_ID__Group_1__0 ) ) | ( ( rule__CLASS_ID__Group_2__0 ) ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:570:1: ( ( rule__CLASS_ID__Group_0__0 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:570:1: ( ( rule__CLASS_ID__Group_0__0 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:571:1: ( rule__CLASS_ID__Group_0__0 )
                    {
                     before(grammarAccess.getCLASS_IDAccess().getGroup_0()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:572:1: ( rule__CLASS_ID__Group_0__0 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:572:2: rule__CLASS_ID__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__CLASS_ID__Group_0__0_in_rule__CLASS_ID__Alternatives1150);
                    rule__CLASS_ID__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getCLASS_IDAccess().getGroup_0()); 

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
                    pushFollow(FOLLOW_rule__CLASS_ID__Group_1__0_in_rule__CLASS_ID__Alternatives1168);
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
                    pushFollow(FOLLOW_rule__CLASS_ID__Group_2__0_in_rule__CLASS_ID__Alternatives1186);
                    rule__CLASS_ID__Group_2__0();
                    _fsp--;


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
    // $ANTLR end rule__CLASS_ID__Alternatives


    // $ANTLR start rule__PLACEHOLDERB__Alternatives
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:593:1: rule__PLACEHOLDERB__Alternatives : ( ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( RULE_STRING ) | ( '=>' ) | ( ';' ) | ( ',' ) | ( '(' ) | ( ')' ) );
    public final void rule__PLACEHOLDERB__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:597:1: ( ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( RULE_STRING ) | ( '=>' ) | ( ';' ) | ( ',' ) | ( '(' ) | ( ')' ) )
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
                    new NoViableAltException("593:1: rule__PLACEHOLDERB__Alternatives : ( ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( RULE_STRING ) | ( '=>' ) | ( ';' ) | ( ',' ) | ( '(' ) | ( ')' ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:598:1: ( RULE_ANY_OTHER )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:598:1: ( RULE_ANY_OTHER )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:599:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getPLACEHOLDERBAccess().getANY_OTHERTerminalRuleCall_0()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__PLACEHOLDERB__Alternatives1219); 
                     after(grammarAccess.getPLACEHOLDERBAccess().getANY_OTHERTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:604:6: ( RULE_ID )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:604:6: ( RULE_ID )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:605:1: RULE_ID
                    {
                     before(grammarAccess.getPLACEHOLDERBAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PLACEHOLDERB__Alternatives1236); 
                     after(grammarAccess.getPLACEHOLDERBAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:610:6: ( RULE_STRING )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:610:6: ( RULE_STRING )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:611:1: RULE_STRING
                    {
                     before(grammarAccess.getPLACEHOLDERBAccess().getSTRINGTerminalRuleCall_2()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PLACEHOLDERB__Alternatives1253); 
                     after(grammarAccess.getPLACEHOLDERBAccess().getSTRINGTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:616:6: ( '=>' )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:616:6: ( '=>' )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:617:1: '=>'
                    {
                     before(grammarAccess.getPLACEHOLDERBAccess().getEqualsSignGreaterThanSignKeyword_3()); 
                    match(input,10,FOLLOW_10_in_rule__PLACEHOLDERB__Alternatives1271); 
                     after(grammarAccess.getPLACEHOLDERBAccess().getEqualsSignGreaterThanSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:624:6: ( ';' )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:624:6: ( ';' )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:625:1: ';'
                    {
                     before(grammarAccess.getPLACEHOLDERBAccess().getSemicolonKeyword_4()); 
                    match(input,11,FOLLOW_11_in_rule__PLACEHOLDERB__Alternatives1291); 
                     after(grammarAccess.getPLACEHOLDERBAccess().getSemicolonKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:632:6: ( ',' )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:632:6: ( ',' )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:633:1: ','
                    {
                     before(grammarAccess.getPLACEHOLDERBAccess().getCommaKeyword_5()); 
                    match(input,12,FOLLOW_12_in_rule__PLACEHOLDERB__Alternatives1311); 
                     after(grammarAccess.getPLACEHOLDERBAccess().getCommaKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:640:6: ( '(' )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:640:6: ( '(' )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:641:1: '('
                    {
                     before(grammarAccess.getPLACEHOLDERBAccess().getLeftParenthesisKeyword_6()); 
                    match(input,13,FOLLOW_13_in_rule__PLACEHOLDERB__Alternatives1331); 
                     after(grammarAccess.getPLACEHOLDERBAccess().getLeftParenthesisKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:648:6: ( ')' )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:648:6: ( ')' )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:649:1: ')'
                    {
                     before(grammarAccess.getPLACEHOLDERBAccess().getRightParenthesisKeyword_7()); 
                    match(input,14,FOLLOW_14_in_rule__PLACEHOLDERB__Alternatives1351); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:661:1: rule__Part__Alternatives : ( ( ruleBundle ) | ( ruleBody ) );
    public final void rule__Part__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:665:1: ( ( ruleBundle ) | ( ruleBody ) )
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
                    new NoViableAltException("661:1: rule__Part__Alternatives : ( ( ruleBundle ) | ( ruleBody ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:666:1: ( ruleBundle )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:666:1: ( ruleBundle )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:667:1: ruleBundle
                    {
                     before(grammarAccess.getPartAccess().getBundleParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBundle_in_rule__Part__Alternatives1385);
                    ruleBundle();
                    _fsp--;

                     after(grammarAccess.getPartAccess().getBundleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:672:6: ( ruleBody )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:672:6: ( ruleBody )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:673:1: ruleBody
                    {
                     before(grammarAccess.getPartAccess().getBodyParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBody_in_rule__Part__Alternatives1402);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:683:1: rule__PromiseValue__Alternatives_2 : ( ( ( rule__PromiseValue__Alternatives_2_0 ) ) | ( ( rule__PromiseValue__Group_2_1__0 ) ) | ( ( rule__PromiseValue__Group_2_2__0 ) ) );
    public final void rule__PromiseValue__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:687:1: ( ( ( rule__PromiseValue__Alternatives_2_0 ) ) | ( ( rule__PromiseValue__Group_2_1__0 ) ) | ( ( rule__PromiseValue__Group_2_2__0 ) ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING)) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==22) ) {
                    alt5=3;
                }
                else if ( ((LA5_2>=RULE_ID && LA5_2<=RULE_STRING)) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("683:1: rule__PromiseValue__Alternatives_2 : ( ( ( rule__PromiseValue__Alternatives_2_0 ) ) | ( ( rule__PromiseValue__Group_2_1__0 ) ) | ( ( rule__PromiseValue__Group_2_2__0 ) ) );", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("683:1: rule__PromiseValue__Alternatives_2 : ( ( ( rule__PromiseValue__Alternatives_2_0 ) ) | ( ( rule__PromiseValue__Group_2_1__0 ) ) | ( ( rule__PromiseValue__Group_2_2__0 ) ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:688:1: ( ( rule__PromiseValue__Alternatives_2_0 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:688:1: ( ( rule__PromiseValue__Alternatives_2_0 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:689:1: ( rule__PromiseValue__Alternatives_2_0 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getAlternatives_2_0()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:690:1: ( rule__PromiseValue__Alternatives_2_0 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:690:2: rule__PromiseValue__Alternatives_2_0
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__Alternatives_2_0_in_rule__PromiseValue__Alternatives_21434);
                    rule__PromiseValue__Alternatives_2_0();
                    _fsp--;


                    }

                     after(grammarAccess.getPromiseValueAccess().getAlternatives_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:694:6: ( ( rule__PromiseValue__Group_2_1__0 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:694:6: ( ( rule__PromiseValue__Group_2_1__0 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:695:1: ( rule__PromiseValue__Group_2_1__0 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getGroup_2_1()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:696:1: ( rule__PromiseValue__Group_2_1__0 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:696:2: rule__PromiseValue__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__Group_2_1__0_in_rule__PromiseValue__Alternatives_21452);
                    rule__PromiseValue__Group_2_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getPromiseValueAccess().getGroup_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:700:6: ( ( rule__PromiseValue__Group_2_2__0 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:700:6: ( ( rule__PromiseValue__Group_2_2__0 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:701:1: ( rule__PromiseValue__Group_2_2__0 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getGroup_2_2()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:702:1: ( rule__PromiseValue__Group_2_2__0 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:702:2: rule__PromiseValue__Group_2_2__0
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__0_in_rule__PromiseValue__Alternatives_21470);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:711:1: rule__PromiseValue__Alternatives_2_0 : ( ( ( rule__PromiseValue__ValuesAssignment_2_0_0 ) ) | ( ( rule__PromiseValue__FunctionsAssignment_2_0_1 ) ) );
    public final void rule__PromiseValue__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:715:1: ( ( ( rule__PromiseValue__ValuesAssignment_2_0_0 ) ) | ( ( rule__PromiseValue__FunctionsAssignment_2_0_1 ) ) )
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
                    new NoViableAltException("711:1: rule__PromiseValue__Alternatives_2_0 : ( ( ( rule__PromiseValue__ValuesAssignment_2_0_0 ) ) | ( ( rule__PromiseValue__FunctionsAssignment_2_0_1 ) ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:716:1: ( ( rule__PromiseValue__ValuesAssignment_2_0_0 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:716:1: ( ( rule__PromiseValue__ValuesAssignment_2_0_0 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:717:1: ( rule__PromiseValue__ValuesAssignment_2_0_0 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getValuesAssignment_2_0_0()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:718:1: ( rule__PromiseValue__ValuesAssignment_2_0_0 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:718:2: rule__PromiseValue__ValuesAssignment_2_0_0
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__ValuesAssignment_2_0_0_in_rule__PromiseValue__Alternatives_2_01503);
                    rule__PromiseValue__ValuesAssignment_2_0_0();
                    _fsp--;


                    }

                     after(grammarAccess.getPromiseValueAccess().getValuesAssignment_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:722:6: ( ( rule__PromiseValue__FunctionsAssignment_2_0_1 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:722:6: ( ( rule__PromiseValue__FunctionsAssignment_2_0_1 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:723:1: ( rule__PromiseValue__FunctionsAssignment_2_0_1 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getFunctionsAssignment_2_0_1()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:724:1: ( rule__PromiseValue__FunctionsAssignment_2_0_1 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:724:2: rule__PromiseValue__FunctionsAssignment_2_0_1
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__FunctionsAssignment_2_0_1_in_rule__PromiseValue__Alternatives_2_01521);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:733:1: rule__PromiseValue__Alternatives_2_1_1 : ( ( ( rule__PromiseValue__ValuesAssignment_2_1_1_0 ) ) | ( ( rule__PromiseValue__FunctionsAssignment_2_1_1_1 ) ) );
    public final void rule__PromiseValue__Alternatives_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:737:1: ( ( ( rule__PromiseValue__ValuesAssignment_2_1_1_0 ) ) | ( ( rule__PromiseValue__FunctionsAssignment_2_1_1_1 ) ) )
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
                    new NoViableAltException("733:1: rule__PromiseValue__Alternatives_2_1_1 : ( ( ( rule__PromiseValue__ValuesAssignment_2_1_1_0 ) ) | ( ( rule__PromiseValue__FunctionsAssignment_2_1_1_1 ) ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:738:1: ( ( rule__PromiseValue__ValuesAssignment_2_1_1_0 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:738:1: ( ( rule__PromiseValue__ValuesAssignment_2_1_1_0 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:739:1: ( rule__PromiseValue__ValuesAssignment_2_1_1_0 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getValuesAssignment_2_1_1_0()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:740:1: ( rule__PromiseValue__ValuesAssignment_2_1_1_0 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:740:2: rule__PromiseValue__ValuesAssignment_2_1_1_0
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__ValuesAssignment_2_1_1_0_in_rule__PromiseValue__Alternatives_2_1_11554);
                    rule__PromiseValue__ValuesAssignment_2_1_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getPromiseValueAccess().getValuesAssignment_2_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:744:6: ( ( rule__PromiseValue__FunctionsAssignment_2_1_1_1 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:744:6: ( ( rule__PromiseValue__FunctionsAssignment_2_1_1_1 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:745:1: ( rule__PromiseValue__FunctionsAssignment_2_1_1_1 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getFunctionsAssignment_2_1_1_1()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:746:1: ( rule__PromiseValue__FunctionsAssignment_2_1_1_1 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:746:2: rule__PromiseValue__FunctionsAssignment_2_1_1_1
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__FunctionsAssignment_2_1_1_1_in_rule__PromiseValue__Alternatives_2_1_11572);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:755:1: rule__PromiseValue__Alternatives_2_1_2_1 : ( ( ( rule__PromiseValue__ValuesAssignment_2_1_2_1_0 ) ) | ( ( rule__PromiseValue__FunctionsAssignment_2_1_2_1_1 ) ) );
    public final void rule__PromiseValue__Alternatives_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:759:1: ( ( ( rule__PromiseValue__ValuesAssignment_2_1_2_1_0 ) ) | ( ( rule__PromiseValue__FunctionsAssignment_2_1_2_1_1 ) ) )
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
                    new NoViableAltException("755:1: rule__PromiseValue__Alternatives_2_1_2_1 : ( ( ( rule__PromiseValue__ValuesAssignment_2_1_2_1_0 ) ) | ( ( rule__PromiseValue__FunctionsAssignment_2_1_2_1_1 ) ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:760:1: ( ( rule__PromiseValue__ValuesAssignment_2_1_2_1_0 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:760:1: ( ( rule__PromiseValue__ValuesAssignment_2_1_2_1_0 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:761:1: ( rule__PromiseValue__ValuesAssignment_2_1_2_1_0 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getValuesAssignment_2_1_2_1_0()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:762:1: ( rule__PromiseValue__ValuesAssignment_2_1_2_1_0 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:762:2: rule__PromiseValue__ValuesAssignment_2_1_2_1_0
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__ValuesAssignment_2_1_2_1_0_in_rule__PromiseValue__Alternatives_2_1_2_11605);
                    rule__PromiseValue__ValuesAssignment_2_1_2_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getPromiseValueAccess().getValuesAssignment_2_1_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:766:6: ( ( rule__PromiseValue__FunctionsAssignment_2_1_2_1_1 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:766:6: ( ( rule__PromiseValue__FunctionsAssignment_2_1_2_1_1 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:767:1: ( rule__PromiseValue__FunctionsAssignment_2_1_2_1_1 )
                    {
                     before(grammarAccess.getPromiseValueAccess().getFunctionsAssignment_2_1_2_1_1()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:768:1: ( rule__PromiseValue__FunctionsAssignment_2_1_2_1_1 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:768:2: rule__PromiseValue__FunctionsAssignment_2_1_2_1_1
                    {
                    pushFollow(FOLLOW_rule__PromiseValue__FunctionsAssignment_2_1_2_1_1_in_rule__PromiseValue__Alternatives_2_1_2_11623);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:777:1: rule__BodyFunction__Alternatives_2 : ( ( ( rule__BodyFunction__ValuesAssignment_2_0 ) ) | ( ( rule__BodyFunction__Group_2_1__0 ) ) | ( ( rule__BodyFunction__FunctionAssignment_2_2 ) ) | ( ( rule__BodyFunction__Group_2_3__0 ) ) );
    public final void rule__BodyFunction__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:781:1: ( ( ( rule__BodyFunction__ValuesAssignment_2_0 ) ) | ( ( rule__BodyFunction__Group_2_1__0 ) ) | ( ( rule__BodyFunction__FunctionAssignment_2_2 ) ) | ( ( rule__BodyFunction__Group_2_3__0 ) ) )
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

                if ( (LA9_2==RULE_STRING) ) {
                    alt9=2;
                }
                else if ( (LA9_2==22) ) {
                    alt9=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("777:1: rule__BodyFunction__Alternatives_2 : ( ( ( rule__BodyFunction__ValuesAssignment_2_0 ) ) | ( ( rule__BodyFunction__Group_2_1__0 ) ) | ( ( rule__BodyFunction__FunctionAssignment_2_2 ) ) | ( ( rule__BodyFunction__Group_2_3__0 ) ) );", 9, 2, input);

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
                    new NoViableAltException("777:1: rule__BodyFunction__Alternatives_2 : ( ( ( rule__BodyFunction__ValuesAssignment_2_0 ) ) | ( ( rule__BodyFunction__Group_2_1__0 ) ) | ( ( rule__BodyFunction__FunctionAssignment_2_2 ) ) | ( ( rule__BodyFunction__Group_2_3__0 ) ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:782:1: ( ( rule__BodyFunction__ValuesAssignment_2_0 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:782:1: ( ( rule__BodyFunction__ValuesAssignment_2_0 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:783:1: ( rule__BodyFunction__ValuesAssignment_2_0 )
                    {
                     before(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_0()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:784:1: ( rule__BodyFunction__ValuesAssignment_2_0 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:784:2: rule__BodyFunction__ValuesAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__BodyFunction__ValuesAssignment_2_0_in_rule__BodyFunction__Alternatives_21656);
                    rule__BodyFunction__ValuesAssignment_2_0();
                    _fsp--;


                    }

                     after(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:788:6: ( ( rule__BodyFunction__Group_2_1__0 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:788:6: ( ( rule__BodyFunction__Group_2_1__0 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:789:1: ( rule__BodyFunction__Group_2_1__0 )
                    {
                     before(grammarAccess.getBodyFunctionAccess().getGroup_2_1()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:790:1: ( rule__BodyFunction__Group_2_1__0 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:790:2: rule__BodyFunction__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__0_in_rule__BodyFunction__Alternatives_21674);
                    rule__BodyFunction__Group_2_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBodyFunctionAccess().getGroup_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:794:6: ( ( rule__BodyFunction__FunctionAssignment_2_2 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:794:6: ( ( rule__BodyFunction__FunctionAssignment_2_2 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:795:1: ( rule__BodyFunction__FunctionAssignment_2_2 )
                    {
                     before(grammarAccess.getBodyFunctionAccess().getFunctionAssignment_2_2()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:796:1: ( rule__BodyFunction__FunctionAssignment_2_2 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:796:2: rule__BodyFunction__FunctionAssignment_2_2
                    {
                    pushFollow(FOLLOW_rule__BodyFunction__FunctionAssignment_2_2_in_rule__BodyFunction__Alternatives_21692);
                    rule__BodyFunction__FunctionAssignment_2_2();
                    _fsp--;


                    }

                     after(grammarAccess.getBodyFunctionAccess().getFunctionAssignment_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:800:6: ( ( rule__BodyFunction__Group_2_3__0 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:800:6: ( ( rule__BodyFunction__Group_2_3__0 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:801:1: ( rule__BodyFunction__Group_2_3__0 )
                    {
                     before(grammarAccess.getBodyFunctionAccess().getGroup_2_3()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:802:1: ( rule__BodyFunction__Group_2_3__0 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:802:2: rule__BodyFunction__Group_2_3__0
                    {
                    pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__0_in_rule__BodyFunction__Alternatives_21710);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:811:1: rule__SpecialFunction__Alternatives_2 : ( ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( ',' ) | ( ( rule__SpecialFunction__Group_2_5__0 ) ) | ( ( rule__SpecialFunction__Group_2_6__0 ) ) | ( ( rule__SpecialFunction__FuncAssignment_2_7 ) ) );
    public final void rule__SpecialFunction__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:815:1: ( ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( ',' ) | ( ( rule__SpecialFunction__Group_2_5__0 ) ) | ( ( rule__SpecialFunction__Group_2_6__0 ) ) | ( ( rule__SpecialFunction__FuncAssignment_2_7 ) ) )
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

                if ( ((LA10_2>=RULE_ANY_OTHER && LA10_2<=RULE_INT)||LA10_2==12||LA10_2==14||(LA10_2>=24 && LA10_2<=25)) ) {
                    alt10=2;
                }
                else if ( (LA10_2==13) ) {
                    alt10=8;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("811:1: rule__SpecialFunction__Alternatives_2 : ( ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( ',' ) | ( ( rule__SpecialFunction__Group_2_5__0 ) ) | ( ( rule__SpecialFunction__Group_2_6__0 ) ) | ( ( rule__SpecialFunction__FuncAssignment_2_7 ) ) );", 10, 2, input);

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
                    new NoViableAltException("811:1: rule__SpecialFunction__Alternatives_2 : ( ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( ',' ) | ( ( rule__SpecialFunction__Group_2_5__0 ) ) | ( ( rule__SpecialFunction__Group_2_6__0 ) ) | ( ( rule__SpecialFunction__FuncAssignment_2_7 ) ) );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:816:1: ( RULE_ANY_OTHER )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:816:1: ( RULE_ANY_OTHER )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:817:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getANY_OTHERTerminalRuleCall_2_0()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__SpecialFunction__Alternatives_21743); 
                     after(grammarAccess.getSpecialFunctionAccess().getANY_OTHERTerminalRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:822:6: ( RULE_ID )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:822:6: ( RULE_ID )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:823:1: RULE_ID
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SpecialFunction__Alternatives_21760); 
                     after(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:828:6: ( RULE_STRING )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:828:6: ( RULE_STRING )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:829:1: RULE_STRING
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getSTRINGTerminalRuleCall_2_2()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SpecialFunction__Alternatives_21777); 
                     after(grammarAccess.getSpecialFunctionAccess().getSTRINGTerminalRuleCall_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:834:6: ( RULE_INT )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:834:6: ( RULE_INT )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:835:1: RULE_INT
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getINTTerminalRuleCall_2_3()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SpecialFunction__Alternatives_21794); 
                     after(grammarAccess.getSpecialFunctionAccess().getINTTerminalRuleCall_2_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:840:6: ( ',' )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:840:6: ( ',' )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:841:1: ','
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getCommaKeyword_2_4()); 
                    match(input,12,FOLLOW_12_in_rule__SpecialFunction__Alternatives_21812); 
                     after(grammarAccess.getSpecialFunctionAccess().getCommaKeyword_2_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:848:6: ( ( rule__SpecialFunction__Group_2_5__0 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:848:6: ( ( rule__SpecialFunction__Group_2_5__0 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:849:1: ( rule__SpecialFunction__Group_2_5__0 )
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getGroup_2_5()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:850:1: ( rule__SpecialFunction__Group_2_5__0 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:850:2: rule__SpecialFunction__Group_2_5__0
                    {
                    pushFollow(FOLLOW_rule__SpecialFunction__Group_2_5__0_in_rule__SpecialFunction__Alternatives_21831);
                    rule__SpecialFunction__Group_2_5__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSpecialFunctionAccess().getGroup_2_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:854:6: ( ( rule__SpecialFunction__Group_2_6__0 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:854:6: ( ( rule__SpecialFunction__Group_2_6__0 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:855:1: ( rule__SpecialFunction__Group_2_6__0 )
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getGroup_2_6()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:856:1: ( rule__SpecialFunction__Group_2_6__0 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:856:2: rule__SpecialFunction__Group_2_6__0
                    {
                    pushFollow(FOLLOW_rule__SpecialFunction__Group_2_6__0_in_rule__SpecialFunction__Alternatives_21849);
                    rule__SpecialFunction__Group_2_6__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSpecialFunctionAccess().getGroup_2_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:860:6: ( ( rule__SpecialFunction__FuncAssignment_2_7 ) )
                    {
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:860:6: ( ( rule__SpecialFunction__FuncAssignment_2_7 ) )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:861:1: ( rule__SpecialFunction__FuncAssignment_2_7 )
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getFuncAssignment_2_7()); 
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:862:1: ( rule__SpecialFunction__FuncAssignment_2_7 )
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:862:2: rule__SpecialFunction__FuncAssignment_2_7
                    {
                    pushFollow(FOLLOW_rule__SpecialFunction__FuncAssignment_2_7_in_rule__SpecialFunction__Alternatives_21867);
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


    // $ANTLR start rule__CLASS_ID__Group_0__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:873:1: rule__CLASS_ID__Group_0__0 : rule__CLASS_ID__Group_0__0__Impl rule__CLASS_ID__Group_0__1 ;
    public final void rule__CLASS_ID__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:877:1: ( rule__CLASS_ID__Group_0__0__Impl rule__CLASS_ID__Group_0__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:878:2: rule__CLASS_ID__Group_0__0__Impl rule__CLASS_ID__Group_0__1
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_0__0__Impl_in_rule__CLASS_ID__Group_0__01898);
            rule__CLASS_ID__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CLASS_ID__Group_0__1_in_rule__CLASS_ID__Group_0__01901);
            rule__CLASS_ID__Group_0__1();
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
    // $ANTLR end rule__CLASS_ID__Group_0__0


    // $ANTLR start rule__CLASS_ID__Group_0__0__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:885:1: rule__CLASS_ID__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__CLASS_ID__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:889:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:890:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:890:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:891:1: RULE_ID
            {
             before(grammarAccess.getCLASS_IDAccess().getIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CLASS_ID__Group_0__0__Impl1928); 
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
    // $ANTLR end rule__CLASS_ID__Group_0__0__Impl


    // $ANTLR start rule__CLASS_ID__Group_0__1
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:902:1: rule__CLASS_ID__Group_0__1 : rule__CLASS_ID__Group_0__1__Impl ;
    public final void rule__CLASS_ID__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:906:1: ( rule__CLASS_ID__Group_0__1__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:907:2: rule__CLASS_ID__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_0__1__Impl_in_rule__CLASS_ID__Group_0__11957);
            rule__CLASS_ID__Group_0__1__Impl();
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
    // $ANTLR end rule__CLASS_ID__Group_0__1


    // $ANTLR start rule__CLASS_ID__Group_0__1__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:913:1: rule__CLASS_ID__Group_0__1__Impl : ( ( rule__CLASS_ID__Group_0_1__0 )? ) ;
    public final void rule__CLASS_ID__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:917:1: ( ( ( rule__CLASS_ID__Group_0_1__0 )? ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:918:1: ( ( rule__CLASS_ID__Group_0_1__0 )? )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:918:1: ( ( rule__CLASS_ID__Group_0_1__0 )? )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:919:1: ( rule__CLASS_ID__Group_0_1__0 )?
            {
             before(grammarAccess.getCLASS_IDAccess().getGroup_0_1()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:920:1: ( rule__CLASS_ID__Group_0_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:920:2: rule__CLASS_ID__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__CLASS_ID__Group_0_1__0_in_rule__CLASS_ID__Group_0__1__Impl1984);
                    rule__CLASS_ID__Group_0_1__0();
                    _fsp--;


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
    // $ANTLR end rule__CLASS_ID__Group_0__1__Impl


    // $ANTLR start rule__CLASS_ID__Group_0_1__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:934:1: rule__CLASS_ID__Group_0_1__0 : rule__CLASS_ID__Group_0_1__0__Impl rule__CLASS_ID__Group_0_1__1 ;
    public final void rule__CLASS_ID__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:938:1: ( rule__CLASS_ID__Group_0_1__0__Impl rule__CLASS_ID__Group_0_1__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:939:2: rule__CLASS_ID__Group_0_1__0__Impl rule__CLASS_ID__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_0_1__0__Impl_in_rule__CLASS_ID__Group_0_1__02019);
            rule__CLASS_ID__Group_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CLASS_ID__Group_0_1__1_in_rule__CLASS_ID__Group_0_1__02022);
            rule__CLASS_ID__Group_0_1__1();
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
    // $ANTLR end rule__CLASS_ID__Group_0_1__0


    // $ANTLR start rule__CLASS_ID__Group_0_1__0__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:946:1: rule__CLASS_ID__Group_0_1__0__Impl : ( '.' ) ;
    public final void rule__CLASS_ID__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:950:1: ( ( '.' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:951:1: ( '.' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:951:1: ( '.' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:952:1: '.'
            {
             before(grammarAccess.getCLASS_IDAccess().getFullStopKeyword_0_1_0()); 
            match(input,15,FOLLOW_15_in_rule__CLASS_ID__Group_0_1__0__Impl2050); 
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
    // $ANTLR end rule__CLASS_ID__Group_0_1__0__Impl


    // $ANTLR start rule__CLASS_ID__Group_0_1__1
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:965:1: rule__CLASS_ID__Group_0_1__1 : rule__CLASS_ID__Group_0_1__1__Impl ;
    public final void rule__CLASS_ID__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:969:1: ( rule__CLASS_ID__Group_0_1__1__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:970:2: rule__CLASS_ID__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_0_1__1__Impl_in_rule__CLASS_ID__Group_0_1__12081);
            rule__CLASS_ID__Group_0_1__1__Impl();
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
    // $ANTLR end rule__CLASS_ID__Group_0_1__1


    // $ANTLR start rule__CLASS_ID__Group_0_1__1__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:976:1: rule__CLASS_ID__Group_0_1__1__Impl : ( ruleCLASS_ID ) ;
    public final void rule__CLASS_ID__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:980:1: ( ( ruleCLASS_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:981:1: ( ruleCLASS_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:981:1: ( ruleCLASS_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:982:1: ruleCLASS_ID
            {
             before(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_0_1_1()); 
            pushFollow(FOLLOW_ruleCLASS_ID_in_rule__CLASS_ID__Group_0_1__1__Impl2108);
            ruleCLASS_ID();
            _fsp--;

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
    // $ANTLR end rule__CLASS_ID__Group_0_1__1__Impl


    // $ANTLR start rule__CLASS_ID__Group_1__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:997:1: rule__CLASS_ID__Group_1__0 : rule__CLASS_ID__Group_1__0__Impl rule__CLASS_ID__Group_1__1 ;
    public final void rule__CLASS_ID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1001:1: ( rule__CLASS_ID__Group_1__0__Impl rule__CLASS_ID__Group_1__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1002:2: rule__CLASS_ID__Group_1__0__Impl rule__CLASS_ID__Group_1__1
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_1__0__Impl_in_rule__CLASS_ID__Group_1__02141);
            rule__CLASS_ID__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CLASS_ID__Group_1__1_in_rule__CLASS_ID__Group_1__02144);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1009:1: rule__CLASS_ID__Group_1__0__Impl : ( '!' ) ;
    public final void rule__CLASS_ID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1013:1: ( ( '!' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1014:1: ( '!' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1014:1: ( '!' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1015:1: '!'
            {
             before(grammarAccess.getCLASS_IDAccess().getExclamationMarkKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__CLASS_ID__Group_1__0__Impl2172); 
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
    // $ANTLR end rule__CLASS_ID__Group_1__0__Impl


    // $ANTLR start rule__CLASS_ID__Group_1__1
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1028:1: rule__CLASS_ID__Group_1__1 : rule__CLASS_ID__Group_1__1__Impl ;
    public final void rule__CLASS_ID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1032:1: ( rule__CLASS_ID__Group_1__1__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1033:2: rule__CLASS_ID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_1__1__Impl_in_rule__CLASS_ID__Group_1__12203);
            rule__CLASS_ID__Group_1__1__Impl();
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1039:1: rule__CLASS_ID__Group_1__1__Impl : ( ruleCLASS_ID ) ;
    public final void rule__CLASS_ID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1043:1: ( ( ruleCLASS_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1044:1: ( ruleCLASS_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1044:1: ( ruleCLASS_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1045:1: ruleCLASS_ID
            {
             before(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleCLASS_ID_in_rule__CLASS_ID__Group_1__1__Impl2230);
            ruleCLASS_ID();
            _fsp--;

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
    // $ANTLR end rule__CLASS_ID__Group_1__1__Impl


    // $ANTLR start rule__CLASS_ID__Group_2__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1060:1: rule__CLASS_ID__Group_2__0 : rule__CLASS_ID__Group_2__0__Impl rule__CLASS_ID__Group_2__1 ;
    public final void rule__CLASS_ID__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1064:1: ( rule__CLASS_ID__Group_2__0__Impl rule__CLASS_ID__Group_2__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1065:2: rule__CLASS_ID__Group_2__0__Impl rule__CLASS_ID__Group_2__1
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_2__0__Impl_in_rule__CLASS_ID__Group_2__02263);
            rule__CLASS_ID__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CLASS_ID__Group_2__1_in_rule__CLASS_ID__Group_2__02266);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1072:1: rule__CLASS_ID__Group_2__0__Impl : ( '(' ) ;
    public final void rule__CLASS_ID__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1076:1: ( ( '(' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1077:1: ( '(' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1077:1: ( '(' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1078:1: '('
            {
             before(grammarAccess.getCLASS_IDAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,13,FOLLOW_13_in_rule__CLASS_ID__Group_2__0__Impl2294); 
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
    // $ANTLR end rule__CLASS_ID__Group_2__0__Impl


    // $ANTLR start rule__CLASS_ID__Group_2__1
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1091:1: rule__CLASS_ID__Group_2__1 : rule__CLASS_ID__Group_2__1__Impl rule__CLASS_ID__Group_2__2 ;
    public final void rule__CLASS_ID__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1095:1: ( rule__CLASS_ID__Group_2__1__Impl rule__CLASS_ID__Group_2__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1096:2: rule__CLASS_ID__Group_2__1__Impl rule__CLASS_ID__Group_2__2
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_2__1__Impl_in_rule__CLASS_ID__Group_2__12325);
            rule__CLASS_ID__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CLASS_ID__Group_2__2_in_rule__CLASS_ID__Group_2__12328);
            rule__CLASS_ID__Group_2__2();
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1103:1: rule__CLASS_ID__Group_2__1__Impl : ( ruleCLASS_ID ) ;
    public final void rule__CLASS_ID__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1107:1: ( ( ruleCLASS_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1108:1: ( ruleCLASS_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1108:1: ( ruleCLASS_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1109:1: ruleCLASS_ID
            {
             before(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleCLASS_ID_in_rule__CLASS_ID__Group_2__1__Impl2355);
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


    // $ANTLR start rule__CLASS_ID__Group_2__2
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1120:1: rule__CLASS_ID__Group_2__2 : rule__CLASS_ID__Group_2__2__Impl rule__CLASS_ID__Group_2__3 ;
    public final void rule__CLASS_ID__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1124:1: ( rule__CLASS_ID__Group_2__2__Impl rule__CLASS_ID__Group_2__3 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1125:2: rule__CLASS_ID__Group_2__2__Impl rule__CLASS_ID__Group_2__3
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_2__2__Impl_in_rule__CLASS_ID__Group_2__22384);
            rule__CLASS_ID__Group_2__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CLASS_ID__Group_2__3_in_rule__CLASS_ID__Group_2__22387);
            rule__CLASS_ID__Group_2__3();
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
    // $ANTLR end rule__CLASS_ID__Group_2__2


    // $ANTLR start rule__CLASS_ID__Group_2__2__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1132:1: rule__CLASS_ID__Group_2__2__Impl : ( ')' ) ;
    public final void rule__CLASS_ID__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1136:1: ( ( ')' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1137:1: ( ')' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1137:1: ( ')' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1138:1: ')'
            {
             before(grammarAccess.getCLASS_IDAccess().getRightParenthesisKeyword_2_2()); 
            match(input,14,FOLLOW_14_in_rule__CLASS_ID__Group_2__2__Impl2415); 
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
    // $ANTLR end rule__CLASS_ID__Group_2__2__Impl


    // $ANTLR start rule__CLASS_ID__Group_2__3
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1151:1: rule__CLASS_ID__Group_2__3 : rule__CLASS_ID__Group_2__3__Impl ;
    public final void rule__CLASS_ID__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1155:1: ( rule__CLASS_ID__Group_2__3__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1156:2: rule__CLASS_ID__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_2__3__Impl_in_rule__CLASS_ID__Group_2__32446);
            rule__CLASS_ID__Group_2__3__Impl();
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
    // $ANTLR end rule__CLASS_ID__Group_2__3


    // $ANTLR start rule__CLASS_ID__Group_2__3__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1162:1: rule__CLASS_ID__Group_2__3__Impl : ( ( rule__CLASS_ID__Group_2_3__0 )? ) ;
    public final void rule__CLASS_ID__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1166:1: ( ( ( rule__CLASS_ID__Group_2_3__0 )? ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1167:1: ( ( rule__CLASS_ID__Group_2_3__0 )? )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1167:1: ( ( rule__CLASS_ID__Group_2_3__0 )? )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1168:1: ( rule__CLASS_ID__Group_2_3__0 )?
            {
             before(grammarAccess.getCLASS_IDAccess().getGroup_2_3()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1169:1: ( rule__CLASS_ID__Group_2_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1169:2: rule__CLASS_ID__Group_2_3__0
                    {
                    pushFollow(FOLLOW_rule__CLASS_ID__Group_2_3__0_in_rule__CLASS_ID__Group_2__3__Impl2473);
                    rule__CLASS_ID__Group_2_3__0();
                    _fsp--;


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
    // $ANTLR end rule__CLASS_ID__Group_2__3__Impl


    // $ANTLR start rule__CLASS_ID__Group_2_3__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1187:1: rule__CLASS_ID__Group_2_3__0 : rule__CLASS_ID__Group_2_3__0__Impl rule__CLASS_ID__Group_2_3__1 ;
    public final void rule__CLASS_ID__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1191:1: ( rule__CLASS_ID__Group_2_3__0__Impl rule__CLASS_ID__Group_2_3__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1192:2: rule__CLASS_ID__Group_2_3__0__Impl rule__CLASS_ID__Group_2_3__1
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_2_3__0__Impl_in_rule__CLASS_ID__Group_2_3__02512);
            rule__CLASS_ID__Group_2_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__CLASS_ID__Group_2_3__1_in_rule__CLASS_ID__Group_2_3__02515);
            rule__CLASS_ID__Group_2_3__1();
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
    // $ANTLR end rule__CLASS_ID__Group_2_3__0


    // $ANTLR start rule__CLASS_ID__Group_2_3__0__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1199:1: rule__CLASS_ID__Group_2_3__0__Impl : ( '.' ) ;
    public final void rule__CLASS_ID__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1203:1: ( ( '.' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1204:1: ( '.' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1204:1: ( '.' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1205:1: '.'
            {
             before(grammarAccess.getCLASS_IDAccess().getFullStopKeyword_2_3_0()); 
            match(input,15,FOLLOW_15_in_rule__CLASS_ID__Group_2_3__0__Impl2543); 
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
    // $ANTLR end rule__CLASS_ID__Group_2_3__0__Impl


    // $ANTLR start rule__CLASS_ID__Group_2_3__1
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1218:1: rule__CLASS_ID__Group_2_3__1 : rule__CLASS_ID__Group_2_3__1__Impl ;
    public final void rule__CLASS_ID__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1222:1: ( rule__CLASS_ID__Group_2_3__1__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1223:2: rule__CLASS_ID__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Group_2_3__1__Impl_in_rule__CLASS_ID__Group_2_3__12574);
            rule__CLASS_ID__Group_2_3__1__Impl();
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
    // $ANTLR end rule__CLASS_ID__Group_2_3__1


    // $ANTLR start rule__CLASS_ID__Group_2_3__1__Impl
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1229:1: rule__CLASS_ID__Group_2_3__1__Impl : ( ruleCLASS_ID ) ;
    public final void rule__CLASS_ID__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1233:1: ( ( ruleCLASS_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1234:1: ( ruleCLASS_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1234:1: ( ruleCLASS_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1235:1: ruleCLASS_ID
            {
             before(grammarAccess.getCLASS_IDAccess().getCLASS_IDParserRuleCall_2_3_1()); 
            pushFollow(FOLLOW_ruleCLASS_ID_in_rule__CLASS_ID__Group_2_3__1__Impl2601);
            ruleCLASS_ID();
            _fsp--;

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
    // $ANTLR end rule__CLASS_ID__Group_2_3__1__Impl


    // $ANTLR start rule__Bundle__Group__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1250:1: rule__Bundle__Group__0 : rule__Bundle__Group__0__Impl rule__Bundle__Group__1 ;
    public final void rule__Bundle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1254:1: ( rule__Bundle__Group__0__Impl rule__Bundle__Group__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1255:2: rule__Bundle__Group__0__Impl rule__Bundle__Group__1
            {
            pushFollow(FOLLOW_rule__Bundle__Group__0__Impl_in_rule__Bundle__Group__02634);
            rule__Bundle__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__1_in_rule__Bundle__Group__02637);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1262:1: rule__Bundle__Group__0__Impl : ( 'bundle' ) ;
    public final void rule__Bundle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1266:1: ( ( 'bundle' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1267:1: ( 'bundle' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1267:1: ( 'bundle' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1268:1: 'bundle'
            {
             before(grammarAccess.getBundleAccess().getBundleKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Bundle__Group__0__Impl2665); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1281:1: rule__Bundle__Group__1 : rule__Bundle__Group__1__Impl rule__Bundle__Group__2 ;
    public final void rule__Bundle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1285:1: ( rule__Bundle__Group__1__Impl rule__Bundle__Group__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1286:2: rule__Bundle__Group__1__Impl rule__Bundle__Group__2
            {
            pushFollow(FOLLOW_rule__Bundle__Group__1__Impl_in_rule__Bundle__Group__12696);
            rule__Bundle__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__2_in_rule__Bundle__Group__12699);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1293:1: rule__Bundle__Group__1__Impl : ( ( rule__Bundle__ComponentAssignment_1 ) ) ;
    public final void rule__Bundle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1297:1: ( ( ( rule__Bundle__ComponentAssignment_1 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1298:1: ( ( rule__Bundle__ComponentAssignment_1 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1298:1: ( ( rule__Bundle__ComponentAssignment_1 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1299:1: ( rule__Bundle__ComponentAssignment_1 )
            {
             before(grammarAccess.getBundleAccess().getComponentAssignment_1()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1300:1: ( rule__Bundle__ComponentAssignment_1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1300:2: rule__Bundle__ComponentAssignment_1
            {
            pushFollow(FOLLOW_rule__Bundle__ComponentAssignment_1_in_rule__Bundle__Group__1__Impl2726);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1310:1: rule__Bundle__Group__2 : rule__Bundle__Group__2__Impl rule__Bundle__Group__3 ;
    public final void rule__Bundle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1314:1: ( rule__Bundle__Group__2__Impl rule__Bundle__Group__3 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1315:2: rule__Bundle__Group__2__Impl rule__Bundle__Group__3
            {
            pushFollow(FOLLOW_rule__Bundle__Group__2__Impl_in_rule__Bundle__Group__22756);
            rule__Bundle__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__3_in_rule__Bundle__Group__22759);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1322:1: rule__Bundle__Group__2__Impl : ( ( rule__Bundle__NameAssignment_2 ) ) ;
    public final void rule__Bundle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1326:1: ( ( ( rule__Bundle__NameAssignment_2 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1327:1: ( ( rule__Bundle__NameAssignment_2 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1327:1: ( ( rule__Bundle__NameAssignment_2 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1328:1: ( rule__Bundle__NameAssignment_2 )
            {
             before(grammarAccess.getBundleAccess().getNameAssignment_2()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1329:1: ( rule__Bundle__NameAssignment_2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1329:2: rule__Bundle__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Bundle__NameAssignment_2_in_rule__Bundle__Group__2__Impl2786);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1339:1: rule__Bundle__Group__3 : rule__Bundle__Group__3__Impl rule__Bundle__Group__4 ;
    public final void rule__Bundle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1343:1: ( rule__Bundle__Group__3__Impl rule__Bundle__Group__4 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1344:2: rule__Bundle__Group__3__Impl rule__Bundle__Group__4
            {
            pushFollow(FOLLOW_rule__Bundle__Group__3__Impl_in_rule__Bundle__Group__32816);
            rule__Bundle__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__4_in_rule__Bundle__Group__32819);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1351:1: rule__Bundle__Group__3__Impl : ( ( rulePLACEHOLDERB )* ) ;
    public final void rule__Bundle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1355:1: ( ( ( rulePLACEHOLDERB )* ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1356:1: ( ( rulePLACEHOLDERB )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1356:1: ( ( rulePLACEHOLDERB )* )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1357:1: ( rulePLACEHOLDERB )*
            {
             before(grammarAccess.getBundleAccess().getPLACEHOLDERBParserRuleCall_3()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1358:1: ( rulePLACEHOLDERB )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ANY_OTHER && LA13_0<=RULE_STRING)||(LA13_0>=10 && LA13_0<=14)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1358:3: rulePLACEHOLDERB
            	    {
            	    pushFollow(FOLLOW_rulePLACEHOLDERB_in_rule__Bundle__Group__3__Impl2847);
            	    rulePLACEHOLDERB();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1368:1: rule__Bundle__Group__4 : rule__Bundle__Group__4__Impl rule__Bundle__Group__5 ;
    public final void rule__Bundle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1372:1: ( rule__Bundle__Group__4__Impl rule__Bundle__Group__5 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1373:2: rule__Bundle__Group__4__Impl rule__Bundle__Group__5
            {
            pushFollow(FOLLOW_rule__Bundle__Group__4__Impl_in_rule__Bundle__Group__42878);
            rule__Bundle__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__5_in_rule__Bundle__Group__42881);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1380:1: rule__Bundle__Group__4__Impl : ( '{' ) ;
    public final void rule__Bundle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1384:1: ( ( '{' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1385:1: ( '{' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1385:1: ( '{' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1386:1: '{'
            {
             before(grammarAccess.getBundleAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Bundle__Group__4__Impl2909); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1399:1: rule__Bundle__Group__5 : rule__Bundle__Group__5__Impl rule__Bundle__Group__6 ;
    public final void rule__Bundle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1403:1: ( rule__Bundle__Group__5__Impl rule__Bundle__Group__6 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1404:2: rule__Bundle__Group__5__Impl rule__Bundle__Group__6
            {
            pushFollow(FOLLOW_rule__Bundle__Group__5__Impl_in_rule__Bundle__Group__52940);
            rule__Bundle__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__6_in_rule__Bundle__Group__52943);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1411:1: rule__Bundle__Group__5__Impl : ( ( rule__Bundle__PromiseTypeAssignment_5 )* ) ;
    public final void rule__Bundle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1415:1: ( ( ( rule__Bundle__PromiseTypeAssignment_5 )* ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1416:1: ( ( rule__Bundle__PromiseTypeAssignment_5 )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1416:1: ( ( rule__Bundle__PromiseTypeAssignment_5 )* )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1417:1: ( rule__Bundle__PromiseTypeAssignment_5 )*
            {
             before(grammarAccess.getBundleAccess().getPromiseTypeAssignment_5()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1418:1: ( rule__Bundle__PromiseTypeAssignment_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1418:2: rule__Bundle__PromiseTypeAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Bundle__PromiseTypeAssignment_5_in_rule__Bundle__Group__5__Impl2970);
            	    rule__Bundle__PromiseTypeAssignment_5();
            	    _fsp--;


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
    // $ANTLR end rule__Bundle__Group__5__Impl


    // $ANTLR start rule__Bundle__Group__6
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1428:1: rule__Bundle__Group__6 : rule__Bundle__Group__6__Impl ;
    public final void rule__Bundle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1432:1: ( rule__Bundle__Group__6__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1433:2: rule__Bundle__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Bundle__Group__6__Impl_in_rule__Bundle__Group__63001);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1439:1: rule__Bundle__Group__6__Impl : ( '}' ) ;
    public final void rule__Bundle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1443:1: ( ( '}' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1444:1: ( '}' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1444:1: ( '}' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1445:1: '}'
            {
             before(grammarAccess.getBundleAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_19_in_rule__Bundle__Group__6__Impl3029); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1472:1: rule__BundlePromiseType__Group__0 : rule__BundlePromiseType__Group__0__Impl rule__BundlePromiseType__Group__1 ;
    public final void rule__BundlePromiseType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1476:1: ( rule__BundlePromiseType__Group__0__Impl rule__BundlePromiseType__Group__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1477:2: rule__BundlePromiseType__Group__0__Impl rule__BundlePromiseType__Group__1
            {
            pushFollow(FOLLOW_rule__BundlePromiseType__Group__0__Impl_in_rule__BundlePromiseType__Group__03074);
            rule__BundlePromiseType__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BundlePromiseType__Group__1_in_rule__BundlePromiseType__Group__03077);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1484:1: rule__BundlePromiseType__Group__0__Impl : ( ( rule__BundlePromiseType__NameAssignment_0 ) ) ;
    public final void rule__BundlePromiseType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1488:1: ( ( ( rule__BundlePromiseType__NameAssignment_0 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1489:1: ( ( rule__BundlePromiseType__NameAssignment_0 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1489:1: ( ( rule__BundlePromiseType__NameAssignment_0 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1490:1: ( rule__BundlePromiseType__NameAssignment_0 )
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getNameAssignment_0()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1491:1: ( rule__BundlePromiseType__NameAssignment_0 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1491:2: rule__BundlePromiseType__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BundlePromiseType__NameAssignment_0_in_rule__BundlePromiseType__Group__0__Impl3104);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1501:1: rule__BundlePromiseType__Group__1 : rule__BundlePromiseType__Group__1__Impl rule__BundlePromiseType__Group__2 ;
    public final void rule__BundlePromiseType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1505:1: ( rule__BundlePromiseType__Group__1__Impl rule__BundlePromiseType__Group__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1506:2: rule__BundlePromiseType__Group__1__Impl rule__BundlePromiseType__Group__2
            {
            pushFollow(FOLLOW_rule__BundlePromiseType__Group__1__Impl_in_rule__BundlePromiseType__Group__13134);
            rule__BundlePromiseType__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BundlePromiseType__Group__2_in_rule__BundlePromiseType__Group__13137);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1513:1: rule__BundlePromiseType__Group__1__Impl : ( ':' ) ;
    public final void rule__BundlePromiseType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1517:1: ( ( ':' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1518:1: ( ':' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1518:1: ( ':' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1519:1: ':'
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getColonKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__BundlePromiseType__Group__1__Impl3165); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1532:1: rule__BundlePromiseType__Group__2 : rule__BundlePromiseType__Group__2__Impl rule__BundlePromiseType__Group__3 ;
    public final void rule__BundlePromiseType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1536:1: ( rule__BundlePromiseType__Group__2__Impl rule__BundlePromiseType__Group__3 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1537:2: rule__BundlePromiseType__Group__2__Impl rule__BundlePromiseType__Group__3
            {
            pushFollow(FOLLOW_rule__BundlePromiseType__Group__2__Impl_in_rule__BundlePromiseType__Group__23196);
            rule__BundlePromiseType__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BundlePromiseType__Group__3_in_rule__BundlePromiseType__Group__23199);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1544:1: rule__BundlePromiseType__Group__2__Impl : ( ( rule__BundlePromiseType__PromisesAssignment_2 )* ) ;
    public final void rule__BundlePromiseType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1548:1: ( ( ( rule__BundlePromiseType__PromisesAssignment_2 )* ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1549:1: ( ( rule__BundlePromiseType__PromisesAssignment_2 )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1549:1: ( ( rule__BundlePromiseType__PromisesAssignment_2 )* )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1550:1: ( rule__BundlePromiseType__PromisesAssignment_2 )*
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getPromisesAssignment_2()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1551:1: ( rule__BundlePromiseType__PromisesAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_STRING) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1551:2: rule__BundlePromiseType__PromisesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__BundlePromiseType__PromisesAssignment_2_in_rule__BundlePromiseType__Group__2__Impl3226);
            	    rule__BundlePromiseType__PromisesAssignment_2();
            	    _fsp--;


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
    // $ANTLR end rule__BundlePromiseType__Group__2__Impl


    // $ANTLR start rule__BundlePromiseType__Group__3
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1561:1: rule__BundlePromiseType__Group__3 : rule__BundlePromiseType__Group__3__Impl ;
    public final void rule__BundlePromiseType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1565:1: ( rule__BundlePromiseType__Group__3__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1566:2: rule__BundlePromiseType__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BundlePromiseType__Group__3__Impl_in_rule__BundlePromiseType__Group__33257);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1572:1: rule__BundlePromiseType__Group__3__Impl : ( ( rule__BundlePromiseType__ClassesAssignment_3 )* ) ;
    public final void rule__BundlePromiseType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1576:1: ( ( ( rule__BundlePromiseType__ClassesAssignment_3 )* ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1577:1: ( ( rule__BundlePromiseType__ClassesAssignment_3 )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1577:1: ( ( rule__BundlePromiseType__ClassesAssignment_3 )* )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1578:1: ( rule__BundlePromiseType__ClassesAssignment_3 )*
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getClassesAssignment_3()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1579:1: ( rule__BundlePromiseType__ClassesAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    int LA16_2 = input.LA(2);

                    if ( (LA16_2==15||LA16_2==21) ) {
                        alt16=1;
                    }


                }
                else if ( (LA16_0==13||LA16_0==16) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1579:2: rule__BundlePromiseType__ClassesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__BundlePromiseType__ClassesAssignment_3_in_rule__BundlePromiseType__Group__3__Impl3284);
            	    rule__BundlePromiseType__ClassesAssignment_3();
            	    _fsp--;


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
    // $ANTLR end rule__BundlePromiseType__Group__3__Impl


    // $ANTLR start rule__BundleClass__Group__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1597:1: rule__BundleClass__Group__0 : rule__BundleClass__Group__0__Impl rule__BundleClass__Group__1 ;
    public final void rule__BundleClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1601:1: ( rule__BundleClass__Group__0__Impl rule__BundleClass__Group__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1602:2: rule__BundleClass__Group__0__Impl rule__BundleClass__Group__1
            {
            pushFollow(FOLLOW_rule__BundleClass__Group__0__Impl_in_rule__BundleClass__Group__03323);
            rule__BundleClass__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BundleClass__Group__1_in_rule__BundleClass__Group__03326);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1609:1: rule__BundleClass__Group__0__Impl : ( ( rule__BundleClass__NameAssignment_0 ) ) ;
    public final void rule__BundleClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1613:1: ( ( ( rule__BundleClass__NameAssignment_0 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1614:1: ( ( rule__BundleClass__NameAssignment_0 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1614:1: ( ( rule__BundleClass__NameAssignment_0 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1615:1: ( rule__BundleClass__NameAssignment_0 )
            {
             before(grammarAccess.getBundleClassAccess().getNameAssignment_0()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1616:1: ( rule__BundleClass__NameAssignment_0 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1616:2: rule__BundleClass__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BundleClass__NameAssignment_0_in_rule__BundleClass__Group__0__Impl3353);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1626:1: rule__BundleClass__Group__1 : rule__BundleClass__Group__1__Impl rule__BundleClass__Group__2 ;
    public final void rule__BundleClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1630:1: ( rule__BundleClass__Group__1__Impl rule__BundleClass__Group__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1631:2: rule__BundleClass__Group__1__Impl rule__BundleClass__Group__2
            {
            pushFollow(FOLLOW_rule__BundleClass__Group__1__Impl_in_rule__BundleClass__Group__13383);
            rule__BundleClass__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BundleClass__Group__2_in_rule__BundleClass__Group__13386);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1638:1: rule__BundleClass__Group__1__Impl : ( '::' ) ;
    public final void rule__BundleClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1642:1: ( ( '::' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1643:1: ( '::' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1643:1: ( '::' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1644:1: '::'
            {
             before(grammarAccess.getBundleClassAccess().getColonColonKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__BundleClass__Group__1__Impl3414); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1657:1: rule__BundleClass__Group__2 : rule__BundleClass__Group__2__Impl ;
    public final void rule__BundleClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1661:1: ( rule__BundleClass__Group__2__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1662:2: rule__BundleClass__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BundleClass__Group__2__Impl_in_rule__BundleClass__Group__23445);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1668:1: rule__BundleClass__Group__2__Impl : ( ( ( rule__BundleClass__PromisesAssignment_2 ) ) ( ( rule__BundleClass__PromisesAssignment_2 )* ) ) ;
    public final void rule__BundleClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1672:1: ( ( ( ( rule__BundleClass__PromisesAssignment_2 ) ) ( ( rule__BundleClass__PromisesAssignment_2 )* ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1673:1: ( ( ( rule__BundleClass__PromisesAssignment_2 ) ) ( ( rule__BundleClass__PromisesAssignment_2 )* ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1673:1: ( ( ( rule__BundleClass__PromisesAssignment_2 ) ) ( ( rule__BundleClass__PromisesAssignment_2 )* ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1674:1: ( ( rule__BundleClass__PromisesAssignment_2 ) ) ( ( rule__BundleClass__PromisesAssignment_2 )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1674:1: ( ( rule__BundleClass__PromisesAssignment_2 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1675:1: ( rule__BundleClass__PromisesAssignment_2 )
            {
             before(grammarAccess.getBundleClassAccess().getPromisesAssignment_2()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1676:1: ( rule__BundleClass__PromisesAssignment_2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1676:2: rule__BundleClass__PromisesAssignment_2
            {
            pushFollow(FOLLOW_rule__BundleClass__PromisesAssignment_2_in_rule__BundleClass__Group__2__Impl3474);
            rule__BundleClass__PromisesAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getBundleClassAccess().getPromisesAssignment_2()); 

            }

            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1679:1: ( ( rule__BundleClass__PromisesAssignment_2 )* )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1680:1: ( rule__BundleClass__PromisesAssignment_2 )*
            {
             before(grammarAccess.getBundleClassAccess().getPromisesAssignment_2()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1681:1: ( rule__BundleClass__PromisesAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_STRING) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1681:2: rule__BundleClass__PromisesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__BundleClass__PromisesAssignment_2_in_rule__BundleClass__Group__2__Impl3486);
            	    rule__BundleClass__PromisesAssignment_2();
            	    _fsp--;


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
    // $ANTLR end rule__BundleClass__Group__2__Impl


    // $ANTLR start rule__BundlePromise__Group__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1698:1: rule__BundlePromise__Group__0 : rule__BundlePromise__Group__0__Impl rule__BundlePromise__Group__1 ;
    public final void rule__BundlePromise__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1702:1: ( rule__BundlePromise__Group__0__Impl rule__BundlePromise__Group__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1703:2: rule__BundlePromise__Group__0__Impl rule__BundlePromise__Group__1
            {
            pushFollow(FOLLOW_rule__BundlePromise__Group__0__Impl_in_rule__BundlePromise__Group__03525);
            rule__BundlePromise__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BundlePromise__Group__1_in_rule__BundlePromise__Group__03528);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1710:1: rule__BundlePromise__Group__0__Impl : ( ( rule__BundlePromise__NameAssignment_0 ) ) ;
    public final void rule__BundlePromise__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1714:1: ( ( ( rule__BundlePromise__NameAssignment_0 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1715:1: ( ( rule__BundlePromise__NameAssignment_0 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1715:1: ( ( rule__BundlePromise__NameAssignment_0 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1716:1: ( rule__BundlePromise__NameAssignment_0 )
            {
             before(grammarAccess.getBundlePromiseAccess().getNameAssignment_0()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1717:1: ( rule__BundlePromise__NameAssignment_0 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1717:2: rule__BundlePromise__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BundlePromise__NameAssignment_0_in_rule__BundlePromise__Group__0__Impl3555);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1727:1: rule__BundlePromise__Group__1 : rule__BundlePromise__Group__1__Impl rule__BundlePromise__Group__2 ;
    public final void rule__BundlePromise__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1731:1: ( rule__BundlePromise__Group__1__Impl rule__BundlePromise__Group__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1732:2: rule__BundlePromise__Group__1__Impl rule__BundlePromise__Group__2
            {
            pushFollow(FOLLOW_rule__BundlePromise__Group__1__Impl_in_rule__BundlePromise__Group__13585);
            rule__BundlePromise__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BundlePromise__Group__2_in_rule__BundlePromise__Group__13588);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1739:1: rule__BundlePromise__Group__1__Impl : ( ( rule__BundlePromise__Group_1__0 )* ) ;
    public final void rule__BundlePromise__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1743:1: ( ( ( rule__BundlePromise__Group_1__0 )* ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1744:1: ( ( rule__BundlePromise__Group_1__0 )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1744:1: ( ( rule__BundlePromise__Group_1__0 )* )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1745:1: ( rule__BundlePromise__Group_1__0 )*
            {
             before(grammarAccess.getBundlePromiseAccess().getGroup_1()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1746:1: ( rule__BundlePromise__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1746:2: rule__BundlePromise__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__BundlePromise__Group_1__0_in_rule__BundlePromise__Group__1__Impl3615);
            	    rule__BundlePromise__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1756:1: rule__BundlePromise__Group__2 : rule__BundlePromise__Group__2__Impl ;
    public final void rule__BundlePromise__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1760:1: ( rule__BundlePromise__Group__2__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1761:2: rule__BundlePromise__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BundlePromise__Group__2__Impl_in_rule__BundlePromise__Group__23646);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1767:1: rule__BundlePromise__Group__2__Impl : ( ';' ) ;
    public final void rule__BundlePromise__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1771:1: ( ( ';' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1772:1: ( ';' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1772:1: ( ';' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1773:1: ';'
            {
             before(grammarAccess.getBundlePromiseAccess().getSemicolonKeyword_2()); 
            match(input,11,FOLLOW_11_in_rule__BundlePromise__Group__2__Impl3674); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1792:1: rule__BundlePromise__Group_1__0 : rule__BundlePromise__Group_1__0__Impl rule__BundlePromise__Group_1__1 ;
    public final void rule__BundlePromise__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1796:1: ( rule__BundlePromise__Group_1__0__Impl rule__BundlePromise__Group_1__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1797:2: rule__BundlePromise__Group_1__0__Impl rule__BundlePromise__Group_1__1
            {
            pushFollow(FOLLOW_rule__BundlePromise__Group_1__0__Impl_in_rule__BundlePromise__Group_1__03711);
            rule__BundlePromise__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BundlePromise__Group_1__1_in_rule__BundlePromise__Group_1__03714);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1804:1: rule__BundlePromise__Group_1__0__Impl : ( ( rule__BundlePromise__ValuesAssignment_1_0 ) ) ;
    public final void rule__BundlePromise__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1808:1: ( ( ( rule__BundlePromise__ValuesAssignment_1_0 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1809:1: ( ( rule__BundlePromise__ValuesAssignment_1_0 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1809:1: ( ( rule__BundlePromise__ValuesAssignment_1_0 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1810:1: ( rule__BundlePromise__ValuesAssignment_1_0 )
            {
             before(grammarAccess.getBundlePromiseAccess().getValuesAssignment_1_0()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1811:1: ( rule__BundlePromise__ValuesAssignment_1_0 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1811:2: rule__BundlePromise__ValuesAssignment_1_0
            {
            pushFollow(FOLLOW_rule__BundlePromise__ValuesAssignment_1_0_in_rule__BundlePromise__Group_1__0__Impl3741);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1821:1: rule__BundlePromise__Group_1__1 : rule__BundlePromise__Group_1__1__Impl ;
    public final void rule__BundlePromise__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1825:1: ( rule__BundlePromise__Group_1__1__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1826:2: rule__BundlePromise__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BundlePromise__Group_1__1__Impl_in_rule__BundlePromise__Group_1__13771);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1832:1: rule__BundlePromise__Group_1__1__Impl : ( ( rule__BundlePromise__Group_1_1__0 )* ) ;
    public final void rule__BundlePromise__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1836:1: ( ( ( rule__BundlePromise__Group_1_1__0 )* ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1837:1: ( ( rule__BundlePromise__Group_1_1__0 )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1837:1: ( ( rule__BundlePromise__Group_1_1__0 )* )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1838:1: ( rule__BundlePromise__Group_1_1__0 )*
            {
             before(grammarAccess.getBundlePromiseAccess().getGroup_1_1()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1839:1: ( rule__BundlePromise__Group_1_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==12) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1839:2: rule__BundlePromise__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__BundlePromise__Group_1_1__0_in_rule__BundlePromise__Group_1__1__Impl3798);
            	    rule__BundlePromise__Group_1_1__0();
            	    _fsp--;


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
    // $ANTLR end rule__BundlePromise__Group_1__1__Impl


    // $ANTLR start rule__BundlePromise__Group_1_1__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1853:1: rule__BundlePromise__Group_1_1__0 : rule__BundlePromise__Group_1_1__0__Impl rule__BundlePromise__Group_1_1__1 ;
    public final void rule__BundlePromise__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1857:1: ( rule__BundlePromise__Group_1_1__0__Impl rule__BundlePromise__Group_1_1__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1858:2: rule__BundlePromise__Group_1_1__0__Impl rule__BundlePromise__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__BundlePromise__Group_1_1__0__Impl_in_rule__BundlePromise__Group_1_1__03833);
            rule__BundlePromise__Group_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BundlePromise__Group_1_1__1_in_rule__BundlePromise__Group_1_1__03836);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1865:1: rule__BundlePromise__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__BundlePromise__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1869:1: ( ( ',' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1870:1: ( ',' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1870:1: ( ',' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1871:1: ','
            {
             before(grammarAccess.getBundlePromiseAccess().getCommaKeyword_1_1_0()); 
            match(input,12,FOLLOW_12_in_rule__BundlePromise__Group_1_1__0__Impl3864); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1884:1: rule__BundlePromise__Group_1_1__1 : rule__BundlePromise__Group_1_1__1__Impl ;
    public final void rule__BundlePromise__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1888:1: ( rule__BundlePromise__Group_1_1__1__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1889:2: rule__BundlePromise__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__BundlePromise__Group_1_1__1__Impl_in_rule__BundlePromise__Group_1_1__13895);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1895:1: rule__BundlePromise__Group_1_1__1__Impl : ( ( rule__BundlePromise__ValuesAssignment_1_1_1 ) ) ;
    public final void rule__BundlePromise__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1899:1: ( ( ( rule__BundlePromise__ValuesAssignment_1_1_1 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1900:1: ( ( rule__BundlePromise__ValuesAssignment_1_1_1 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1900:1: ( ( rule__BundlePromise__ValuesAssignment_1_1_1 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1901:1: ( rule__BundlePromise__ValuesAssignment_1_1_1 )
            {
             before(grammarAccess.getBundlePromiseAccess().getValuesAssignment_1_1_1()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1902:1: ( rule__BundlePromise__ValuesAssignment_1_1_1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1902:2: rule__BundlePromise__ValuesAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__BundlePromise__ValuesAssignment_1_1_1_in_rule__BundlePromise__Group_1_1__1__Impl3922);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1916:1: rule__PromiseValue__Group__0 : rule__PromiseValue__Group__0__Impl rule__PromiseValue__Group__1 ;
    public final void rule__PromiseValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1920:1: ( rule__PromiseValue__Group__0__Impl rule__PromiseValue__Group__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1921:2: rule__PromiseValue__Group__0__Impl rule__PromiseValue__Group__1
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group__0__Impl_in_rule__PromiseValue__Group__03956);
            rule__PromiseValue__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group__1_in_rule__PromiseValue__Group__03959);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1928:1: rule__PromiseValue__Group__0__Impl : ( ( rule__PromiseValue__KeywordAssignment_0 ) ) ;
    public final void rule__PromiseValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1932:1: ( ( ( rule__PromiseValue__KeywordAssignment_0 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1933:1: ( ( rule__PromiseValue__KeywordAssignment_0 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1933:1: ( ( rule__PromiseValue__KeywordAssignment_0 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1934:1: ( rule__PromiseValue__KeywordAssignment_0 )
            {
             before(grammarAccess.getPromiseValueAccess().getKeywordAssignment_0()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1935:1: ( rule__PromiseValue__KeywordAssignment_0 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1935:2: rule__PromiseValue__KeywordAssignment_0
            {
            pushFollow(FOLLOW_rule__PromiseValue__KeywordAssignment_0_in_rule__PromiseValue__Group__0__Impl3986);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1945:1: rule__PromiseValue__Group__1 : rule__PromiseValue__Group__1__Impl rule__PromiseValue__Group__2 ;
    public final void rule__PromiseValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1949:1: ( rule__PromiseValue__Group__1__Impl rule__PromiseValue__Group__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1950:2: rule__PromiseValue__Group__1__Impl rule__PromiseValue__Group__2
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group__1__Impl_in_rule__PromiseValue__Group__14016);
            rule__PromiseValue__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group__2_in_rule__PromiseValue__Group__14019);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1957:1: rule__PromiseValue__Group__1__Impl : ( '=>' ) ;
    public final void rule__PromiseValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1961:1: ( ( '=>' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1962:1: ( '=>' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1962:1: ( '=>' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1963:1: '=>'
            {
             before(grammarAccess.getPromiseValueAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,10,FOLLOW_10_in_rule__PromiseValue__Group__1__Impl4047); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1976:1: rule__PromiseValue__Group__2 : rule__PromiseValue__Group__2__Impl ;
    public final void rule__PromiseValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1980:1: ( rule__PromiseValue__Group__2__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1981:2: rule__PromiseValue__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group__2__Impl_in_rule__PromiseValue__Group__24078);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1987:1: rule__PromiseValue__Group__2__Impl : ( ( rule__PromiseValue__Alternatives_2 ) ) ;
    public final void rule__PromiseValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1991:1: ( ( ( rule__PromiseValue__Alternatives_2 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1992:1: ( ( rule__PromiseValue__Alternatives_2 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1992:1: ( ( rule__PromiseValue__Alternatives_2 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1993:1: ( rule__PromiseValue__Alternatives_2 )
            {
             before(grammarAccess.getPromiseValueAccess().getAlternatives_2()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1994:1: ( rule__PromiseValue__Alternatives_2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:1994:2: rule__PromiseValue__Alternatives_2
            {
            pushFollow(FOLLOW_rule__PromiseValue__Alternatives_2_in_rule__PromiseValue__Group__2__Impl4105);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2010:1: rule__PromiseValue__Group_2_1__0 : rule__PromiseValue__Group_2_1__0__Impl rule__PromiseValue__Group_2_1__1 ;
    public final void rule__PromiseValue__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2014:1: ( rule__PromiseValue__Group_2_1__0__Impl rule__PromiseValue__Group_2_1__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2015:2: rule__PromiseValue__Group_2_1__0__Impl rule__PromiseValue__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1__0__Impl_in_rule__PromiseValue__Group_2_1__04141);
            rule__PromiseValue__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1__1_in_rule__PromiseValue__Group_2_1__04144);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2022:1: rule__PromiseValue__Group_2_1__0__Impl : ( '{' ) ;
    public final void rule__PromiseValue__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2026:1: ( ( '{' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2027:1: ( '{' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2027:1: ( '{' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2028:1: '{'
            {
             before(grammarAccess.getPromiseValueAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            match(input,18,FOLLOW_18_in_rule__PromiseValue__Group_2_1__0__Impl4172); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2041:1: rule__PromiseValue__Group_2_1__1 : rule__PromiseValue__Group_2_1__1__Impl rule__PromiseValue__Group_2_1__2 ;
    public final void rule__PromiseValue__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2045:1: ( rule__PromiseValue__Group_2_1__1__Impl rule__PromiseValue__Group_2_1__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2046:2: rule__PromiseValue__Group_2_1__1__Impl rule__PromiseValue__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1__1__Impl_in_rule__PromiseValue__Group_2_1__14203);
            rule__PromiseValue__Group_2_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1__2_in_rule__PromiseValue__Group_2_1__14206);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2053:1: rule__PromiseValue__Group_2_1__1__Impl : ( ( rule__PromiseValue__Alternatives_2_1_1 ) ) ;
    public final void rule__PromiseValue__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2057:1: ( ( ( rule__PromiseValue__Alternatives_2_1_1 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2058:1: ( ( rule__PromiseValue__Alternatives_2_1_1 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2058:1: ( ( rule__PromiseValue__Alternatives_2_1_1 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2059:1: ( rule__PromiseValue__Alternatives_2_1_1 )
            {
             before(grammarAccess.getPromiseValueAccess().getAlternatives_2_1_1()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2060:1: ( rule__PromiseValue__Alternatives_2_1_1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2060:2: rule__PromiseValue__Alternatives_2_1_1
            {
            pushFollow(FOLLOW_rule__PromiseValue__Alternatives_2_1_1_in_rule__PromiseValue__Group_2_1__1__Impl4233);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2070:1: rule__PromiseValue__Group_2_1__2 : rule__PromiseValue__Group_2_1__2__Impl rule__PromiseValue__Group_2_1__3 ;
    public final void rule__PromiseValue__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2074:1: ( rule__PromiseValue__Group_2_1__2__Impl rule__PromiseValue__Group_2_1__3 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2075:2: rule__PromiseValue__Group_2_1__2__Impl rule__PromiseValue__Group_2_1__3
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1__2__Impl_in_rule__PromiseValue__Group_2_1__24263);
            rule__PromiseValue__Group_2_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1__3_in_rule__PromiseValue__Group_2_1__24266);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2082:1: rule__PromiseValue__Group_2_1__2__Impl : ( ( rule__PromiseValue__Group_2_1_2__0 )* ) ;
    public final void rule__PromiseValue__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2086:1: ( ( ( rule__PromiseValue__Group_2_1_2__0 )* ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2087:1: ( ( rule__PromiseValue__Group_2_1_2__0 )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2087:1: ( ( rule__PromiseValue__Group_2_1_2__0 )* )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2088:1: ( rule__PromiseValue__Group_2_1_2__0 )*
            {
             before(grammarAccess.getPromiseValueAccess().getGroup_2_1_2()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2089:1: ( rule__PromiseValue__Group_2_1_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==12) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2089:2: rule__PromiseValue__Group_2_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__PromiseValue__Group_2_1_2__0_in_rule__PromiseValue__Group_2_1__2__Impl4293);
            	    rule__PromiseValue__Group_2_1_2__0();
            	    _fsp--;


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
    // $ANTLR end rule__PromiseValue__Group_2_1__2__Impl


    // $ANTLR start rule__PromiseValue__Group_2_1__3
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2099:1: rule__PromiseValue__Group_2_1__3 : rule__PromiseValue__Group_2_1__3__Impl ;
    public final void rule__PromiseValue__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2103:1: ( rule__PromiseValue__Group_2_1__3__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2104:2: rule__PromiseValue__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1__3__Impl_in_rule__PromiseValue__Group_2_1__34324);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2110:1: rule__PromiseValue__Group_2_1__3__Impl : ( '}' ) ;
    public final void rule__PromiseValue__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2114:1: ( ( '}' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2115:1: ( '}' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2115:1: ( '}' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2116:1: '}'
            {
             before(grammarAccess.getPromiseValueAccess().getRightCurlyBracketKeyword_2_1_3()); 
            match(input,19,FOLLOW_19_in_rule__PromiseValue__Group_2_1__3__Impl4352); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2137:1: rule__PromiseValue__Group_2_1_2__0 : rule__PromiseValue__Group_2_1_2__0__Impl rule__PromiseValue__Group_2_1_2__1 ;
    public final void rule__PromiseValue__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2141:1: ( rule__PromiseValue__Group_2_1_2__0__Impl rule__PromiseValue__Group_2_1_2__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2142:2: rule__PromiseValue__Group_2_1_2__0__Impl rule__PromiseValue__Group_2_1_2__1
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1_2__0__Impl_in_rule__PromiseValue__Group_2_1_2__04391);
            rule__PromiseValue__Group_2_1_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1_2__1_in_rule__PromiseValue__Group_2_1_2__04394);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2149:1: rule__PromiseValue__Group_2_1_2__0__Impl : ( ',' ) ;
    public final void rule__PromiseValue__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2153:1: ( ( ',' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2154:1: ( ',' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2154:1: ( ',' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2155:1: ','
            {
             before(grammarAccess.getPromiseValueAccess().getCommaKeyword_2_1_2_0()); 
            match(input,12,FOLLOW_12_in_rule__PromiseValue__Group_2_1_2__0__Impl4422); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2168:1: rule__PromiseValue__Group_2_1_2__1 : rule__PromiseValue__Group_2_1_2__1__Impl ;
    public final void rule__PromiseValue__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2172:1: ( rule__PromiseValue__Group_2_1_2__1__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2173:2: rule__PromiseValue__Group_2_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_1_2__1__Impl_in_rule__PromiseValue__Group_2_1_2__14453);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2179:1: rule__PromiseValue__Group_2_1_2__1__Impl : ( ( rule__PromiseValue__Alternatives_2_1_2_1 ) ) ;
    public final void rule__PromiseValue__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2183:1: ( ( ( rule__PromiseValue__Alternatives_2_1_2_1 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2184:1: ( ( rule__PromiseValue__Alternatives_2_1_2_1 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2184:1: ( ( rule__PromiseValue__Alternatives_2_1_2_1 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2185:1: ( rule__PromiseValue__Alternatives_2_1_2_1 )
            {
             before(grammarAccess.getPromiseValueAccess().getAlternatives_2_1_2_1()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2186:1: ( rule__PromiseValue__Alternatives_2_1_2_1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2186:2: rule__PromiseValue__Alternatives_2_1_2_1
            {
            pushFollow(FOLLOW_rule__PromiseValue__Alternatives_2_1_2_1_in_rule__PromiseValue__Group_2_1_2__1__Impl4480);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2200:1: rule__PromiseValue__Group_2_2__0 : rule__PromiseValue__Group_2_2__0__Impl rule__PromiseValue__Group_2_2__1 ;
    public final void rule__PromiseValue__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2204:1: ( rule__PromiseValue__Group_2_2__0__Impl rule__PromiseValue__Group_2_2__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2205:2: rule__PromiseValue__Group_2_2__0__Impl rule__PromiseValue__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__0__Impl_in_rule__PromiseValue__Group_2_2__04514);
            rule__PromiseValue__Group_2_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__1_in_rule__PromiseValue__Group_2_2__04517);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2212:1: rule__PromiseValue__Group_2_2__0__Impl : ( '{' ) ;
    public final void rule__PromiseValue__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2216:1: ( ( '{' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2217:1: ( '{' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2217:1: ( '{' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2218:1: '{'
            {
             before(grammarAccess.getPromiseValueAccess().getLeftCurlyBracketKeyword_2_2_0()); 
            match(input,18,FOLLOW_18_in_rule__PromiseValue__Group_2_2__0__Impl4545); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2231:1: rule__PromiseValue__Group_2_2__1 : rule__PromiseValue__Group_2_2__1__Impl rule__PromiseValue__Group_2_2__2 ;
    public final void rule__PromiseValue__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2235:1: ( rule__PromiseValue__Group_2_2__1__Impl rule__PromiseValue__Group_2_2__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2236:2: rule__PromiseValue__Group_2_2__1__Impl rule__PromiseValue__Group_2_2__2
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__1__Impl_in_rule__PromiseValue__Group_2_2__14576);
            rule__PromiseValue__Group_2_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__2_in_rule__PromiseValue__Group_2_2__14579);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2243:1: rule__PromiseValue__Group_2_2__1__Impl : ( '@' ) ;
    public final void rule__PromiseValue__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2247:1: ( ( '@' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2248:1: ( '@' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2248:1: ( '@' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2249:1: '@'
            {
             before(grammarAccess.getPromiseValueAccess().getCommercialAtKeyword_2_2_1()); 
            match(input,22,FOLLOW_22_in_rule__PromiseValue__Group_2_2__1__Impl4607); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2262:1: rule__PromiseValue__Group_2_2__2 : rule__PromiseValue__Group_2_2__2__Impl rule__PromiseValue__Group_2_2__3 ;
    public final void rule__PromiseValue__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2266:1: ( rule__PromiseValue__Group_2_2__2__Impl rule__PromiseValue__Group_2_2__3 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2267:2: rule__PromiseValue__Group_2_2__2__Impl rule__PromiseValue__Group_2_2__3
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__2__Impl_in_rule__PromiseValue__Group_2_2__24638);
            rule__PromiseValue__Group_2_2__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__3_in_rule__PromiseValue__Group_2_2__24641);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2274:1: rule__PromiseValue__Group_2_2__2__Impl : ( '(' ) ;
    public final void rule__PromiseValue__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2278:1: ( ( '(' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2279:1: ( '(' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2279:1: ( '(' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2280:1: '('
            {
             before(grammarAccess.getPromiseValueAccess().getLeftParenthesisKeyword_2_2_2()); 
            match(input,13,FOLLOW_13_in_rule__PromiseValue__Group_2_2__2__Impl4669); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2293:1: rule__PromiseValue__Group_2_2__3 : rule__PromiseValue__Group_2_2__3__Impl rule__PromiseValue__Group_2_2__4 ;
    public final void rule__PromiseValue__Group_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2297:1: ( rule__PromiseValue__Group_2_2__3__Impl rule__PromiseValue__Group_2_2__4 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2298:2: rule__PromiseValue__Group_2_2__3__Impl rule__PromiseValue__Group_2_2__4
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__3__Impl_in_rule__PromiseValue__Group_2_2__34700);
            rule__PromiseValue__Group_2_2__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__4_in_rule__PromiseValue__Group_2_2__34703);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2305:1: rule__PromiseValue__Group_2_2__3__Impl : ( RULE_ID ) ;
    public final void rule__PromiseValue__Group_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2309:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2310:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2310:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2311:1: RULE_ID
            {
             before(grammarAccess.getPromiseValueAccess().getIDTerminalRuleCall_2_2_3()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PromiseValue__Group_2_2__3__Impl4730); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2322:1: rule__PromiseValue__Group_2_2__4 : rule__PromiseValue__Group_2_2__4__Impl rule__PromiseValue__Group_2_2__5 ;
    public final void rule__PromiseValue__Group_2_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2326:1: ( rule__PromiseValue__Group_2_2__4__Impl rule__PromiseValue__Group_2_2__5 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2327:2: rule__PromiseValue__Group_2_2__4__Impl rule__PromiseValue__Group_2_2__5
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__4__Impl_in_rule__PromiseValue__Group_2_2__44759);
            rule__PromiseValue__Group_2_2__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__5_in_rule__PromiseValue__Group_2_2__44762);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2334:1: rule__PromiseValue__Group_2_2__4__Impl : ( ')' ) ;
    public final void rule__PromiseValue__Group_2_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2338:1: ( ( ')' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2339:1: ( ')' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2339:1: ( ')' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2340:1: ')'
            {
             before(grammarAccess.getPromiseValueAccess().getRightParenthesisKeyword_2_2_4()); 
            match(input,14,FOLLOW_14_in_rule__PromiseValue__Group_2_2__4__Impl4790); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2353:1: rule__PromiseValue__Group_2_2__5 : rule__PromiseValue__Group_2_2__5__Impl ;
    public final void rule__PromiseValue__Group_2_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2357:1: ( rule__PromiseValue__Group_2_2__5__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2358:2: rule__PromiseValue__Group_2_2__5__Impl
            {
            pushFollow(FOLLOW_rule__PromiseValue__Group_2_2__5__Impl_in_rule__PromiseValue__Group_2_2__54821);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2364:1: rule__PromiseValue__Group_2_2__5__Impl : ( '}' ) ;
    public final void rule__PromiseValue__Group_2_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2368:1: ( ( '}' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2369:1: ( '}' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2369:1: ( '}' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2370:1: '}'
            {
             before(grammarAccess.getPromiseValueAccess().getRightCurlyBracketKeyword_2_2_5()); 
            match(input,19,FOLLOW_19_in_rule__PromiseValue__Group_2_2__5__Impl4849); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2395:1: rule__Body__Group__0 : rule__Body__Group__0__Impl rule__Body__Group__1 ;
    public final void rule__Body__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2399:1: ( rule__Body__Group__0__Impl rule__Body__Group__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2400:2: rule__Body__Group__0__Impl rule__Body__Group__1
            {
            pushFollow(FOLLOW_rule__Body__Group__0__Impl_in_rule__Body__Group__04892);
            rule__Body__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__1_in_rule__Body__Group__04895);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2407:1: rule__Body__Group__0__Impl : ( 'body' ) ;
    public final void rule__Body__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2411:1: ( ( 'body' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2412:1: ( 'body' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2412:1: ( 'body' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2413:1: 'body'
            {
             before(grammarAccess.getBodyAccess().getBodyKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Body__Group__0__Impl4923); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2426:1: rule__Body__Group__1 : rule__Body__Group__1__Impl rule__Body__Group__2 ;
    public final void rule__Body__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2430:1: ( rule__Body__Group__1__Impl rule__Body__Group__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2431:2: rule__Body__Group__1__Impl rule__Body__Group__2
            {
            pushFollow(FOLLOW_rule__Body__Group__1__Impl_in_rule__Body__Group__14954);
            rule__Body__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__2_in_rule__Body__Group__14957);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2438:1: rule__Body__Group__1__Impl : ( ( rule__Body__ComponentAssignment_1 ) ) ;
    public final void rule__Body__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2442:1: ( ( ( rule__Body__ComponentAssignment_1 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2443:1: ( ( rule__Body__ComponentAssignment_1 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2443:1: ( ( rule__Body__ComponentAssignment_1 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2444:1: ( rule__Body__ComponentAssignment_1 )
            {
             before(grammarAccess.getBodyAccess().getComponentAssignment_1()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2445:1: ( rule__Body__ComponentAssignment_1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2445:2: rule__Body__ComponentAssignment_1
            {
            pushFollow(FOLLOW_rule__Body__ComponentAssignment_1_in_rule__Body__Group__1__Impl4984);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2455:1: rule__Body__Group__2 : rule__Body__Group__2__Impl rule__Body__Group__3 ;
    public final void rule__Body__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2459:1: ( rule__Body__Group__2__Impl rule__Body__Group__3 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2460:2: rule__Body__Group__2__Impl rule__Body__Group__3
            {
            pushFollow(FOLLOW_rule__Body__Group__2__Impl_in_rule__Body__Group__25014);
            rule__Body__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__3_in_rule__Body__Group__25017);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2467:1: rule__Body__Group__2__Impl : ( ( rule__Body__NameAssignment_2 ) ) ;
    public final void rule__Body__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2471:1: ( ( ( rule__Body__NameAssignment_2 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2472:1: ( ( rule__Body__NameAssignment_2 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2472:1: ( ( rule__Body__NameAssignment_2 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2473:1: ( rule__Body__NameAssignment_2 )
            {
             before(grammarAccess.getBodyAccess().getNameAssignment_2()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2474:1: ( rule__Body__NameAssignment_2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2474:2: rule__Body__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Body__NameAssignment_2_in_rule__Body__Group__2__Impl5044);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2484:1: rule__Body__Group__3 : rule__Body__Group__3__Impl rule__Body__Group__4 ;
    public final void rule__Body__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2488:1: ( rule__Body__Group__3__Impl rule__Body__Group__4 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2489:2: rule__Body__Group__3__Impl rule__Body__Group__4
            {
            pushFollow(FOLLOW_rule__Body__Group__3__Impl_in_rule__Body__Group__35074);
            rule__Body__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__4_in_rule__Body__Group__35077);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2496:1: rule__Body__Group__3__Impl : ( ( rule__Body__Group_3__0 )? ) ;
    public final void rule__Body__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2500:1: ( ( ( rule__Body__Group_3__0 )? ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2501:1: ( ( rule__Body__Group_3__0 )? )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2501:1: ( ( rule__Body__Group_3__0 )? )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2502:1: ( rule__Body__Group_3__0 )?
            {
             before(grammarAccess.getBodyAccess().getGroup_3()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2503:1: ( rule__Body__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==13) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2503:2: rule__Body__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Body__Group_3__0_in_rule__Body__Group__3__Impl5104);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2513:1: rule__Body__Group__4 : rule__Body__Group__4__Impl rule__Body__Group__5 ;
    public final void rule__Body__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2517:1: ( rule__Body__Group__4__Impl rule__Body__Group__5 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2518:2: rule__Body__Group__4__Impl rule__Body__Group__5
            {
            pushFollow(FOLLOW_rule__Body__Group__4__Impl_in_rule__Body__Group__45135);
            rule__Body__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__5_in_rule__Body__Group__45138);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2525:1: rule__Body__Group__4__Impl : ( '{' ) ;
    public final void rule__Body__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2529:1: ( ( '{' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2530:1: ( '{' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2530:1: ( '{' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2531:1: '{'
            {
             before(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_18_in_rule__Body__Group__4__Impl5166); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2544:1: rule__Body__Group__5 : rule__Body__Group__5__Impl rule__Body__Group__6 ;
    public final void rule__Body__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2548:1: ( rule__Body__Group__5__Impl rule__Body__Group__6 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2549:2: rule__Body__Group__5__Impl rule__Body__Group__6
            {
            pushFollow(FOLLOW_rule__Body__Group__5__Impl_in_rule__Body__Group__55197);
            rule__Body__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__6_in_rule__Body__Group__55200);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2556:1: rule__Body__Group__5__Impl : ( ( rule__Body__PromiseTypeAssignment_5 )* ) ;
    public final void rule__Body__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2560:1: ( ( ( rule__Body__PromiseTypeAssignment_5 )* ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2561:1: ( ( rule__Body__PromiseTypeAssignment_5 )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2561:1: ( ( rule__Body__PromiseTypeAssignment_5 )* )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2562:1: ( rule__Body__PromiseTypeAssignment_5 )*
            {
             before(grammarAccess.getBodyAccess().getPromiseTypeAssignment_5()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2563:1: ( rule__Body__PromiseTypeAssignment_5 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==10) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2563:2: rule__Body__PromiseTypeAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Body__PromiseTypeAssignment_5_in_rule__Body__Group__5__Impl5227);
            	    rule__Body__PromiseTypeAssignment_5();
            	    _fsp--;


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
    // $ANTLR end rule__Body__Group__5__Impl


    // $ANTLR start rule__Body__Group__6
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2573:1: rule__Body__Group__6 : rule__Body__Group__6__Impl rule__Body__Group__7 ;
    public final void rule__Body__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2577:1: ( rule__Body__Group__6__Impl rule__Body__Group__7 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2578:2: rule__Body__Group__6__Impl rule__Body__Group__7
            {
            pushFollow(FOLLOW_rule__Body__Group__6__Impl_in_rule__Body__Group__65258);
            rule__Body__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__7_in_rule__Body__Group__65261);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2585:1: rule__Body__Group__6__Impl : ( ( rule__Body__ClassesAssignment_6 )* ) ;
    public final void rule__Body__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2589:1: ( ( ( rule__Body__ClassesAssignment_6 )* ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2590:1: ( ( rule__Body__ClassesAssignment_6 )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2590:1: ( ( rule__Body__ClassesAssignment_6 )* )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2591:1: ( rule__Body__ClassesAssignment_6 )*
            {
             before(grammarAccess.getBodyAccess().getClassesAssignment_6()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2592:1: ( rule__Body__ClassesAssignment_6 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||LA23_0==13||LA23_0==16) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2592:2: rule__Body__ClassesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Body__ClassesAssignment_6_in_rule__Body__Group__6__Impl5288);
            	    rule__Body__ClassesAssignment_6();
            	    _fsp--;


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
    // $ANTLR end rule__Body__Group__6__Impl


    // $ANTLR start rule__Body__Group__7
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2602:1: rule__Body__Group__7 : rule__Body__Group__7__Impl ;
    public final void rule__Body__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2606:1: ( rule__Body__Group__7__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2607:2: rule__Body__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group__7__Impl_in_rule__Body__Group__75319);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2613:1: rule__Body__Group__7__Impl : ( '}' ) ;
    public final void rule__Body__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2617:1: ( ( '}' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2618:1: ( '}' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2618:1: ( '}' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2619:1: '}'
            {
             before(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_19_in_rule__Body__Group__7__Impl5347); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2648:1: rule__Body__Group_3__0 : rule__Body__Group_3__0__Impl rule__Body__Group_3__1 ;
    public final void rule__Body__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2652:1: ( rule__Body__Group_3__0__Impl rule__Body__Group_3__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2653:2: rule__Body__Group_3__0__Impl rule__Body__Group_3__1
            {
            pushFollow(FOLLOW_rule__Body__Group_3__0__Impl_in_rule__Body__Group_3__05394);
            rule__Body__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group_3__1_in_rule__Body__Group_3__05397);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2660:1: rule__Body__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Body__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2664:1: ( ( '(' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2665:1: ( '(' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2665:1: ( '(' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2666:1: '('
            {
             before(grammarAccess.getBodyAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,13,FOLLOW_13_in_rule__Body__Group_3__0__Impl5425); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2679:1: rule__Body__Group_3__1 : rule__Body__Group_3__1__Impl rule__Body__Group_3__2 ;
    public final void rule__Body__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2683:1: ( rule__Body__Group_3__1__Impl rule__Body__Group_3__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2684:2: rule__Body__Group_3__1__Impl rule__Body__Group_3__2
            {
            pushFollow(FOLLOW_rule__Body__Group_3__1__Impl_in_rule__Body__Group_3__15456);
            rule__Body__Group_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group_3__2_in_rule__Body__Group_3__15459);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2691:1: rule__Body__Group_3__1__Impl : ( ( rule__Body__VariablesAssignment_3_1 ) ) ;
    public final void rule__Body__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2695:1: ( ( ( rule__Body__VariablesAssignment_3_1 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2696:1: ( ( rule__Body__VariablesAssignment_3_1 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2696:1: ( ( rule__Body__VariablesAssignment_3_1 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2697:1: ( rule__Body__VariablesAssignment_3_1 )
            {
             before(grammarAccess.getBodyAccess().getVariablesAssignment_3_1()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2698:1: ( rule__Body__VariablesAssignment_3_1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2698:2: rule__Body__VariablesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Body__VariablesAssignment_3_1_in_rule__Body__Group_3__1__Impl5486);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2708:1: rule__Body__Group_3__2 : rule__Body__Group_3__2__Impl rule__Body__Group_3__3 ;
    public final void rule__Body__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2712:1: ( rule__Body__Group_3__2__Impl rule__Body__Group_3__3 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2713:2: rule__Body__Group_3__2__Impl rule__Body__Group_3__3
            {
            pushFollow(FOLLOW_rule__Body__Group_3__2__Impl_in_rule__Body__Group_3__25516);
            rule__Body__Group_3__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group_3__3_in_rule__Body__Group_3__25519);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2720:1: rule__Body__Group_3__2__Impl : ( ( rule__Body__Group_3_2__0 )* ) ;
    public final void rule__Body__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2724:1: ( ( ( rule__Body__Group_3_2__0 )* ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2725:1: ( ( rule__Body__Group_3_2__0 )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2725:1: ( ( rule__Body__Group_3_2__0 )* )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2726:1: ( rule__Body__Group_3_2__0 )*
            {
             before(grammarAccess.getBodyAccess().getGroup_3_2()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2727:1: ( rule__Body__Group_3_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==12) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2727:2: rule__Body__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Body__Group_3_2__0_in_rule__Body__Group_3__2__Impl5546);
            	    rule__Body__Group_3_2__0();
            	    _fsp--;


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
    // $ANTLR end rule__Body__Group_3__2__Impl


    // $ANTLR start rule__Body__Group_3__3
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2737:1: rule__Body__Group_3__3 : rule__Body__Group_3__3__Impl ;
    public final void rule__Body__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2741:1: ( rule__Body__Group_3__3__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2742:2: rule__Body__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group_3__3__Impl_in_rule__Body__Group_3__35577);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2748:1: rule__Body__Group_3__3__Impl : ( ')' ) ;
    public final void rule__Body__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2752:1: ( ( ')' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2753:1: ( ')' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2753:1: ( ')' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2754:1: ')'
            {
             before(grammarAccess.getBodyAccess().getRightParenthesisKeyword_3_3()); 
            match(input,14,FOLLOW_14_in_rule__Body__Group_3__3__Impl5605); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2775:1: rule__Body__Group_3_2__0 : rule__Body__Group_3_2__0__Impl rule__Body__Group_3_2__1 ;
    public final void rule__Body__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2779:1: ( rule__Body__Group_3_2__0__Impl rule__Body__Group_3_2__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2780:2: rule__Body__Group_3_2__0__Impl rule__Body__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Body__Group_3_2__0__Impl_in_rule__Body__Group_3_2__05644);
            rule__Body__Group_3_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group_3_2__1_in_rule__Body__Group_3_2__05647);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2787:1: rule__Body__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Body__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2791:1: ( ( ',' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2792:1: ( ',' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2792:1: ( ',' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2793:1: ','
            {
             before(grammarAccess.getBodyAccess().getCommaKeyword_3_2_0()); 
            match(input,12,FOLLOW_12_in_rule__Body__Group_3_2__0__Impl5675); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2806:1: rule__Body__Group_3_2__1 : rule__Body__Group_3_2__1__Impl ;
    public final void rule__Body__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2810:1: ( rule__Body__Group_3_2__1__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2811:2: rule__Body__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group_3_2__1__Impl_in_rule__Body__Group_3_2__15706);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2817:1: rule__Body__Group_3_2__1__Impl : ( ( rule__Body__VariablesAssignment_3_2_1 ) ) ;
    public final void rule__Body__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2821:1: ( ( ( rule__Body__VariablesAssignment_3_2_1 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2822:1: ( ( rule__Body__VariablesAssignment_3_2_1 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2822:1: ( ( rule__Body__VariablesAssignment_3_2_1 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2823:1: ( rule__Body__VariablesAssignment_3_2_1 )
            {
             before(grammarAccess.getBodyAccess().getVariablesAssignment_3_2_1()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2824:1: ( rule__Body__VariablesAssignment_3_2_1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2824:2: rule__Body__VariablesAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Body__VariablesAssignment_3_2_1_in_rule__Body__Group_3_2__1__Impl5733);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2838:1: rule__BodyClass__Group__0 : rule__BodyClass__Group__0__Impl rule__BodyClass__Group__1 ;
    public final void rule__BodyClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2842:1: ( rule__BodyClass__Group__0__Impl rule__BodyClass__Group__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2843:2: rule__BodyClass__Group__0__Impl rule__BodyClass__Group__1
            {
            pushFollow(FOLLOW_rule__BodyClass__Group__0__Impl_in_rule__BodyClass__Group__05767);
            rule__BodyClass__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyClass__Group__1_in_rule__BodyClass__Group__05770);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2850:1: rule__BodyClass__Group__0__Impl : ( ( rule__BodyClass__NameAssignment_0 ) ) ;
    public final void rule__BodyClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2854:1: ( ( ( rule__BodyClass__NameAssignment_0 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2855:1: ( ( rule__BodyClass__NameAssignment_0 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2855:1: ( ( rule__BodyClass__NameAssignment_0 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2856:1: ( rule__BodyClass__NameAssignment_0 )
            {
             before(grammarAccess.getBodyClassAccess().getNameAssignment_0()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2857:1: ( rule__BodyClass__NameAssignment_0 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2857:2: rule__BodyClass__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BodyClass__NameAssignment_0_in_rule__BodyClass__Group__0__Impl5797);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2867:1: rule__BodyClass__Group__1 : rule__BodyClass__Group__1__Impl rule__BodyClass__Group__2 ;
    public final void rule__BodyClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2871:1: ( rule__BodyClass__Group__1__Impl rule__BodyClass__Group__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2872:2: rule__BodyClass__Group__1__Impl rule__BodyClass__Group__2
            {
            pushFollow(FOLLOW_rule__BodyClass__Group__1__Impl_in_rule__BodyClass__Group__15827);
            rule__BodyClass__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyClass__Group__2_in_rule__BodyClass__Group__15830);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2879:1: rule__BodyClass__Group__1__Impl : ( '::' ) ;
    public final void rule__BodyClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2883:1: ( ( '::' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2884:1: ( '::' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2884:1: ( '::' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2885:1: '::'
            {
             before(grammarAccess.getBodyClassAccess().getColonColonKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__BodyClass__Group__1__Impl5858); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2898:1: rule__BodyClass__Group__2 : rule__BodyClass__Group__2__Impl ;
    public final void rule__BodyClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2902:1: ( rule__BodyClass__Group__2__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2903:2: rule__BodyClass__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BodyClass__Group__2__Impl_in_rule__BodyClass__Group__25889);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2909:1: rule__BodyClass__Group__2__Impl : ( ( rule__BodyClass__PromiseTypeAssignment_2 )* ) ;
    public final void rule__BodyClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2913:1: ( ( ( rule__BodyClass__PromiseTypeAssignment_2 )* ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2914:1: ( ( rule__BodyClass__PromiseTypeAssignment_2 )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2914:1: ( ( rule__BodyClass__PromiseTypeAssignment_2 )* )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2915:1: ( rule__BodyClass__PromiseTypeAssignment_2 )*
            {
             before(grammarAccess.getBodyClassAccess().getPromiseTypeAssignment_2()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2916:1: ( rule__BodyClass__PromiseTypeAssignment_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    int LA25_2 = input.LA(2);

                    if ( (LA25_2==10) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2916:2: rule__BodyClass__PromiseTypeAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__BodyClass__PromiseTypeAssignment_2_in_rule__BodyClass__Group__2__Impl5916);
            	    rule__BodyClass__PromiseTypeAssignment_2();
            	    _fsp--;


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
    // $ANTLR end rule__BodyClass__Group__2__Impl


    // $ANTLR start rule__BodyFunction__Group__0
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2932:1: rule__BodyFunction__Group__0 : rule__BodyFunction__Group__0__Impl rule__BodyFunction__Group__1 ;
    public final void rule__BodyFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2936:1: ( rule__BodyFunction__Group__0__Impl rule__BodyFunction__Group__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2937:2: rule__BodyFunction__Group__0__Impl rule__BodyFunction__Group__1
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group__0__Impl_in_rule__BodyFunction__Group__05953);
            rule__BodyFunction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group__1_in_rule__BodyFunction__Group__05956);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2944:1: rule__BodyFunction__Group__0__Impl : ( ( rule__BodyFunction__NameAssignment_0 ) ) ;
    public final void rule__BodyFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2948:1: ( ( ( rule__BodyFunction__NameAssignment_0 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2949:1: ( ( rule__BodyFunction__NameAssignment_0 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2949:1: ( ( rule__BodyFunction__NameAssignment_0 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2950:1: ( rule__BodyFunction__NameAssignment_0 )
            {
             before(grammarAccess.getBodyFunctionAccess().getNameAssignment_0()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2951:1: ( rule__BodyFunction__NameAssignment_0 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2951:2: rule__BodyFunction__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BodyFunction__NameAssignment_0_in_rule__BodyFunction__Group__0__Impl5983);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2961:1: rule__BodyFunction__Group__1 : rule__BodyFunction__Group__1__Impl rule__BodyFunction__Group__2 ;
    public final void rule__BodyFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2965:1: ( rule__BodyFunction__Group__1__Impl rule__BodyFunction__Group__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2966:2: rule__BodyFunction__Group__1__Impl rule__BodyFunction__Group__2
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group__1__Impl_in_rule__BodyFunction__Group__16013);
            rule__BodyFunction__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group__2_in_rule__BodyFunction__Group__16016);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2973:1: rule__BodyFunction__Group__1__Impl : ( '=>' ) ;
    public final void rule__BodyFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2977:1: ( ( '=>' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2978:1: ( '=>' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2978:1: ( '=>' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2979:1: '=>'
            {
             before(grammarAccess.getBodyFunctionAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,10,FOLLOW_10_in_rule__BodyFunction__Group__1__Impl6044); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2992:1: rule__BodyFunction__Group__2 : rule__BodyFunction__Group__2__Impl rule__BodyFunction__Group__3 ;
    public final void rule__BodyFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2996:1: ( rule__BodyFunction__Group__2__Impl rule__BodyFunction__Group__3 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:2997:2: rule__BodyFunction__Group__2__Impl rule__BodyFunction__Group__3
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group__2__Impl_in_rule__BodyFunction__Group__26075);
            rule__BodyFunction__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group__3_in_rule__BodyFunction__Group__26078);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3004:1: rule__BodyFunction__Group__2__Impl : ( ( rule__BodyFunction__Alternatives_2 ) ) ;
    public final void rule__BodyFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3008:1: ( ( ( rule__BodyFunction__Alternatives_2 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3009:1: ( ( rule__BodyFunction__Alternatives_2 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3009:1: ( ( rule__BodyFunction__Alternatives_2 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3010:1: ( rule__BodyFunction__Alternatives_2 )
            {
             before(grammarAccess.getBodyFunctionAccess().getAlternatives_2()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3011:1: ( rule__BodyFunction__Alternatives_2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3011:2: rule__BodyFunction__Alternatives_2
            {
            pushFollow(FOLLOW_rule__BodyFunction__Alternatives_2_in_rule__BodyFunction__Group__2__Impl6105);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3021:1: rule__BodyFunction__Group__3 : rule__BodyFunction__Group__3__Impl ;
    public final void rule__BodyFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3025:1: ( rule__BodyFunction__Group__3__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3026:2: rule__BodyFunction__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group__3__Impl_in_rule__BodyFunction__Group__36135);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3032:1: rule__BodyFunction__Group__3__Impl : ( ';' ) ;
    public final void rule__BodyFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3036:1: ( ( ';' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3037:1: ( ';' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3037:1: ( ';' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3038:1: ';'
            {
             before(grammarAccess.getBodyFunctionAccess().getSemicolonKeyword_3()); 
            match(input,11,FOLLOW_11_in_rule__BodyFunction__Group__3__Impl6163); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3059:1: rule__BodyFunction__Group_2_1__0 : rule__BodyFunction__Group_2_1__0__Impl rule__BodyFunction__Group_2_1__1 ;
    public final void rule__BodyFunction__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3063:1: ( rule__BodyFunction__Group_2_1__0__Impl rule__BodyFunction__Group_2_1__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3064:2: rule__BodyFunction__Group_2_1__0__Impl rule__BodyFunction__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__0__Impl_in_rule__BodyFunction__Group_2_1__06202);
            rule__BodyFunction__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__1_in_rule__BodyFunction__Group_2_1__06205);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3071:1: rule__BodyFunction__Group_2_1__0__Impl : ( ( rule__BodyFunction__ListAssignment_2_1_0 ) ) ;
    public final void rule__BodyFunction__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3075:1: ( ( ( rule__BodyFunction__ListAssignment_2_1_0 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3076:1: ( ( rule__BodyFunction__ListAssignment_2_1_0 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3076:1: ( ( rule__BodyFunction__ListAssignment_2_1_0 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3077:1: ( rule__BodyFunction__ListAssignment_2_1_0 )
            {
             before(grammarAccess.getBodyFunctionAccess().getListAssignment_2_1_0()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3078:1: ( rule__BodyFunction__ListAssignment_2_1_0 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3078:2: rule__BodyFunction__ListAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__BodyFunction__ListAssignment_2_1_0_in_rule__BodyFunction__Group_2_1__0__Impl6232);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3088:1: rule__BodyFunction__Group_2_1__1 : rule__BodyFunction__Group_2_1__1__Impl rule__BodyFunction__Group_2_1__2 ;
    public final void rule__BodyFunction__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3092:1: ( rule__BodyFunction__Group_2_1__1__Impl rule__BodyFunction__Group_2_1__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3093:2: rule__BodyFunction__Group_2_1__1__Impl rule__BodyFunction__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__1__Impl_in_rule__BodyFunction__Group_2_1__16262);
            rule__BodyFunction__Group_2_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__2_in_rule__BodyFunction__Group_2_1__16265);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3100:1: rule__BodyFunction__Group_2_1__1__Impl : ( ( rule__BodyFunction__ValuesAssignment_2_1_1 ) ) ;
    public final void rule__BodyFunction__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3104:1: ( ( ( rule__BodyFunction__ValuesAssignment_2_1_1 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3105:1: ( ( rule__BodyFunction__ValuesAssignment_2_1_1 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3105:1: ( ( rule__BodyFunction__ValuesAssignment_2_1_1 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3106:1: ( rule__BodyFunction__ValuesAssignment_2_1_1 )
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_1_1()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3107:1: ( rule__BodyFunction__ValuesAssignment_2_1_1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3107:2: rule__BodyFunction__ValuesAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__BodyFunction__ValuesAssignment_2_1_1_in_rule__BodyFunction__Group_2_1__1__Impl6292);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3117:1: rule__BodyFunction__Group_2_1__2 : rule__BodyFunction__Group_2_1__2__Impl rule__BodyFunction__Group_2_1__3 ;
    public final void rule__BodyFunction__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3121:1: ( rule__BodyFunction__Group_2_1__2__Impl rule__BodyFunction__Group_2_1__3 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3122:2: rule__BodyFunction__Group_2_1__2__Impl rule__BodyFunction__Group_2_1__3
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__2__Impl_in_rule__BodyFunction__Group_2_1__26322);
            rule__BodyFunction__Group_2_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__3_in_rule__BodyFunction__Group_2_1__26325);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3129:1: rule__BodyFunction__Group_2_1__2__Impl : ( ( rule__BodyFunction__Group_2_1_2__0 )* ) ;
    public final void rule__BodyFunction__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3133:1: ( ( ( rule__BodyFunction__Group_2_1_2__0 )* ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3134:1: ( ( rule__BodyFunction__Group_2_1_2__0 )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3134:1: ( ( rule__BodyFunction__Group_2_1_2__0 )* )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3135:1: ( rule__BodyFunction__Group_2_1_2__0 )*
            {
             before(grammarAccess.getBodyFunctionAccess().getGroup_2_1_2()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3136:1: ( rule__BodyFunction__Group_2_1_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==12) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3136:2: rule__BodyFunction__Group_2_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__BodyFunction__Group_2_1_2__0_in_rule__BodyFunction__Group_2_1__2__Impl6352);
            	    rule__BodyFunction__Group_2_1_2__0();
            	    _fsp--;


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
    // $ANTLR end rule__BodyFunction__Group_2_1__2__Impl


    // $ANTLR start rule__BodyFunction__Group_2_1__3
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3146:1: rule__BodyFunction__Group_2_1__3 : rule__BodyFunction__Group_2_1__3__Impl ;
    public final void rule__BodyFunction__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3150:1: ( rule__BodyFunction__Group_2_1__3__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3151:2: rule__BodyFunction__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__3__Impl_in_rule__BodyFunction__Group_2_1__36383);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3157:1: rule__BodyFunction__Group_2_1__3__Impl : ( '}' ) ;
    public final void rule__BodyFunction__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3161:1: ( ( '}' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3162:1: ( '}' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3162:1: ( '}' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3163:1: '}'
            {
             before(grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_1_3()); 
            match(input,19,FOLLOW_19_in_rule__BodyFunction__Group_2_1__3__Impl6411); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3184:1: rule__BodyFunction__Group_2_1_2__0 : rule__BodyFunction__Group_2_1_2__0__Impl rule__BodyFunction__Group_2_1_2__1 ;
    public final void rule__BodyFunction__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3188:1: ( rule__BodyFunction__Group_2_1_2__0__Impl rule__BodyFunction__Group_2_1_2__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3189:2: rule__BodyFunction__Group_2_1_2__0__Impl rule__BodyFunction__Group_2_1_2__1
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1_2__0__Impl_in_rule__BodyFunction__Group_2_1_2__06450);
            rule__BodyFunction__Group_2_1_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1_2__1_in_rule__BodyFunction__Group_2_1_2__06453);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3196:1: rule__BodyFunction__Group_2_1_2__0__Impl : ( ',' ) ;
    public final void rule__BodyFunction__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3200:1: ( ( ',' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3201:1: ( ',' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3201:1: ( ',' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3202:1: ','
            {
             before(grammarAccess.getBodyFunctionAccess().getCommaKeyword_2_1_2_0()); 
            match(input,12,FOLLOW_12_in_rule__BodyFunction__Group_2_1_2__0__Impl6481); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3215:1: rule__BodyFunction__Group_2_1_2__1 : rule__BodyFunction__Group_2_1_2__1__Impl ;
    public final void rule__BodyFunction__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3219:1: ( rule__BodyFunction__Group_2_1_2__1__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3220:2: rule__BodyFunction__Group_2_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1_2__1__Impl_in_rule__BodyFunction__Group_2_1_2__16512);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3226:1: rule__BodyFunction__Group_2_1_2__1__Impl : ( ( rule__BodyFunction__ValuesAssignment_2_1_2_1 ) ) ;
    public final void rule__BodyFunction__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3230:1: ( ( ( rule__BodyFunction__ValuesAssignment_2_1_2_1 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3231:1: ( ( rule__BodyFunction__ValuesAssignment_2_1_2_1 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3231:1: ( ( rule__BodyFunction__ValuesAssignment_2_1_2_1 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3232:1: ( rule__BodyFunction__ValuesAssignment_2_1_2_1 )
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_1_2_1()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3233:1: ( rule__BodyFunction__ValuesAssignment_2_1_2_1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3233:2: rule__BodyFunction__ValuesAssignment_2_1_2_1
            {
            pushFollow(FOLLOW_rule__BodyFunction__ValuesAssignment_2_1_2_1_in_rule__BodyFunction__Group_2_1_2__1__Impl6539);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3247:1: rule__BodyFunction__Group_2_3__0 : rule__BodyFunction__Group_2_3__0__Impl rule__BodyFunction__Group_2_3__1 ;
    public final void rule__BodyFunction__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3251:1: ( rule__BodyFunction__Group_2_3__0__Impl rule__BodyFunction__Group_2_3__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3252:2: rule__BodyFunction__Group_2_3__0__Impl rule__BodyFunction__Group_2_3__1
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__0__Impl_in_rule__BodyFunction__Group_2_3__06573);
            rule__BodyFunction__Group_2_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__1_in_rule__BodyFunction__Group_2_3__06576);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3259:1: rule__BodyFunction__Group_2_3__0__Impl : ( '{' ) ;
    public final void rule__BodyFunction__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3263:1: ( ( '{' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3264:1: ( '{' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3264:1: ( '{' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3265:1: '{'
            {
             before(grammarAccess.getBodyFunctionAccess().getLeftCurlyBracketKeyword_2_3_0()); 
            match(input,18,FOLLOW_18_in_rule__BodyFunction__Group_2_3__0__Impl6604); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3278:1: rule__BodyFunction__Group_2_3__1 : rule__BodyFunction__Group_2_3__1__Impl rule__BodyFunction__Group_2_3__2 ;
    public final void rule__BodyFunction__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3282:1: ( rule__BodyFunction__Group_2_3__1__Impl rule__BodyFunction__Group_2_3__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3283:2: rule__BodyFunction__Group_2_3__1__Impl rule__BodyFunction__Group_2_3__2
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__1__Impl_in_rule__BodyFunction__Group_2_3__16635);
            rule__BodyFunction__Group_2_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__2_in_rule__BodyFunction__Group_2_3__16638);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3290:1: rule__BodyFunction__Group_2_3__1__Impl : ( '@' ) ;
    public final void rule__BodyFunction__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3294:1: ( ( '@' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3295:1: ( '@' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3295:1: ( '@' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3296:1: '@'
            {
             before(grammarAccess.getBodyFunctionAccess().getCommercialAtKeyword_2_3_1()); 
            match(input,22,FOLLOW_22_in_rule__BodyFunction__Group_2_3__1__Impl6666); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3309:1: rule__BodyFunction__Group_2_3__2 : rule__BodyFunction__Group_2_3__2__Impl rule__BodyFunction__Group_2_3__3 ;
    public final void rule__BodyFunction__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3313:1: ( rule__BodyFunction__Group_2_3__2__Impl rule__BodyFunction__Group_2_3__3 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3314:2: rule__BodyFunction__Group_2_3__2__Impl rule__BodyFunction__Group_2_3__3
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__2__Impl_in_rule__BodyFunction__Group_2_3__26697);
            rule__BodyFunction__Group_2_3__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__3_in_rule__BodyFunction__Group_2_3__26700);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3321:1: rule__BodyFunction__Group_2_3__2__Impl : ( '(' ) ;
    public final void rule__BodyFunction__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3325:1: ( ( '(' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3326:1: ( '(' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3326:1: ( '(' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3327:1: '('
            {
             before(grammarAccess.getBodyFunctionAccess().getLeftParenthesisKeyword_2_3_2()); 
            match(input,13,FOLLOW_13_in_rule__BodyFunction__Group_2_3__2__Impl6728); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3340:1: rule__BodyFunction__Group_2_3__3 : rule__BodyFunction__Group_2_3__3__Impl rule__BodyFunction__Group_2_3__4 ;
    public final void rule__BodyFunction__Group_2_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3344:1: ( rule__BodyFunction__Group_2_3__3__Impl rule__BodyFunction__Group_2_3__4 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3345:2: rule__BodyFunction__Group_2_3__3__Impl rule__BodyFunction__Group_2_3__4
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__3__Impl_in_rule__BodyFunction__Group_2_3__36759);
            rule__BodyFunction__Group_2_3__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__4_in_rule__BodyFunction__Group_2_3__36762);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3352:1: rule__BodyFunction__Group_2_3__3__Impl : ( RULE_ID ) ;
    public final void rule__BodyFunction__Group_2_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3356:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3357:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3357:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3358:1: RULE_ID
            {
             before(grammarAccess.getBodyFunctionAccess().getIDTerminalRuleCall_2_3_3()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BodyFunction__Group_2_3__3__Impl6789); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3369:1: rule__BodyFunction__Group_2_3__4 : rule__BodyFunction__Group_2_3__4__Impl rule__BodyFunction__Group_2_3__5 ;
    public final void rule__BodyFunction__Group_2_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3373:1: ( rule__BodyFunction__Group_2_3__4__Impl rule__BodyFunction__Group_2_3__5 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3374:2: rule__BodyFunction__Group_2_3__4__Impl rule__BodyFunction__Group_2_3__5
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__4__Impl_in_rule__BodyFunction__Group_2_3__46818);
            rule__BodyFunction__Group_2_3__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__5_in_rule__BodyFunction__Group_2_3__46821);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3381:1: rule__BodyFunction__Group_2_3__4__Impl : ( ')' ) ;
    public final void rule__BodyFunction__Group_2_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3385:1: ( ( ')' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3386:1: ( ')' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3386:1: ( ')' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3387:1: ')'
            {
             before(grammarAccess.getBodyFunctionAccess().getRightParenthesisKeyword_2_3_4()); 
            match(input,14,FOLLOW_14_in_rule__BodyFunction__Group_2_3__4__Impl6849); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3400:1: rule__BodyFunction__Group_2_3__5 : rule__BodyFunction__Group_2_3__5__Impl ;
    public final void rule__BodyFunction__Group_2_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3404:1: ( rule__BodyFunction__Group_2_3__5__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3405:2: rule__BodyFunction__Group_2_3__5__Impl
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__5__Impl_in_rule__BodyFunction__Group_2_3__56880);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3411:1: rule__BodyFunction__Group_2_3__5__Impl : ( '}' ) ;
    public final void rule__BodyFunction__Group_2_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3415:1: ( ( '}' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3416:1: ( '}' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3416:1: ( '}' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3417:1: '}'
            {
             before(grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_3_5()); 
            match(input,19,FOLLOW_19_in_rule__BodyFunction__Group_2_3__5__Impl6908); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3442:1: rule__SimpleFunction__Group__0 : rule__SimpleFunction__Group__0__Impl rule__SimpleFunction__Group__1 ;
    public final void rule__SimpleFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3446:1: ( rule__SimpleFunction__Group__0__Impl rule__SimpleFunction__Group__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3447:2: rule__SimpleFunction__Group__0__Impl rule__SimpleFunction__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleFunction__Group__0__Impl_in_rule__SimpleFunction__Group__06951);
            rule__SimpleFunction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleFunction__Group__1_in_rule__SimpleFunction__Group__06954);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3454:1: rule__SimpleFunction__Group__0__Impl : ( ( rule__SimpleFunction__IdAssignment_0 ) ) ;
    public final void rule__SimpleFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3458:1: ( ( ( rule__SimpleFunction__IdAssignment_0 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3459:1: ( ( rule__SimpleFunction__IdAssignment_0 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3459:1: ( ( rule__SimpleFunction__IdAssignment_0 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3460:1: ( rule__SimpleFunction__IdAssignment_0 )
            {
             before(grammarAccess.getSimpleFunctionAccess().getIdAssignment_0()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3461:1: ( rule__SimpleFunction__IdAssignment_0 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3461:2: rule__SimpleFunction__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__SimpleFunction__IdAssignment_0_in_rule__SimpleFunction__Group__0__Impl6981);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3471:1: rule__SimpleFunction__Group__1 : rule__SimpleFunction__Group__1__Impl rule__SimpleFunction__Group__2 ;
    public final void rule__SimpleFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3475:1: ( rule__SimpleFunction__Group__1__Impl rule__SimpleFunction__Group__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3476:2: rule__SimpleFunction__Group__1__Impl rule__SimpleFunction__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleFunction__Group__1__Impl_in_rule__SimpleFunction__Group__17011);
            rule__SimpleFunction__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleFunction__Group__2_in_rule__SimpleFunction__Group__17014);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3483:1: rule__SimpleFunction__Group__1__Impl : ( '(' ) ;
    public final void rule__SimpleFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3487:1: ( ( '(' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3488:1: ( '(' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3488:1: ( '(' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3489:1: '('
            {
             before(grammarAccess.getSimpleFunctionAccess().getLeftParenthesisKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__SimpleFunction__Group__1__Impl7042); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3502:1: rule__SimpleFunction__Group__2 : rule__SimpleFunction__Group__2__Impl rule__SimpleFunction__Group__3 ;
    public final void rule__SimpleFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3506:1: ( rule__SimpleFunction__Group__2__Impl rule__SimpleFunction__Group__3 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3507:2: rule__SimpleFunction__Group__2__Impl rule__SimpleFunction__Group__3
            {
            pushFollow(FOLLOW_rule__SimpleFunction__Group__2__Impl_in_rule__SimpleFunction__Group__27073);
            rule__SimpleFunction__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleFunction__Group__3_in_rule__SimpleFunction__Group__27076);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3514:1: rule__SimpleFunction__Group__2__Impl : ( ( rule__SimpleFunction__ValuesAssignment_2 ) ) ;
    public final void rule__SimpleFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3518:1: ( ( ( rule__SimpleFunction__ValuesAssignment_2 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3519:1: ( ( rule__SimpleFunction__ValuesAssignment_2 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3519:1: ( ( rule__SimpleFunction__ValuesAssignment_2 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3520:1: ( rule__SimpleFunction__ValuesAssignment_2 )
            {
             before(grammarAccess.getSimpleFunctionAccess().getValuesAssignment_2()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3521:1: ( rule__SimpleFunction__ValuesAssignment_2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3521:2: rule__SimpleFunction__ValuesAssignment_2
            {
            pushFollow(FOLLOW_rule__SimpleFunction__ValuesAssignment_2_in_rule__SimpleFunction__Group__2__Impl7103);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3531:1: rule__SimpleFunction__Group__3 : rule__SimpleFunction__Group__3__Impl rule__SimpleFunction__Group__4 ;
    public final void rule__SimpleFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3535:1: ( rule__SimpleFunction__Group__3__Impl rule__SimpleFunction__Group__4 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3536:2: rule__SimpleFunction__Group__3__Impl rule__SimpleFunction__Group__4
            {
            pushFollow(FOLLOW_rule__SimpleFunction__Group__3__Impl_in_rule__SimpleFunction__Group__37133);
            rule__SimpleFunction__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleFunction__Group__4_in_rule__SimpleFunction__Group__37136);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3543:1: rule__SimpleFunction__Group__3__Impl : ( ( rule__SimpleFunction__Group_3__0 )* ) ;
    public final void rule__SimpleFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3547:1: ( ( ( rule__SimpleFunction__Group_3__0 )* ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3548:1: ( ( rule__SimpleFunction__Group_3__0 )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3548:1: ( ( rule__SimpleFunction__Group_3__0 )* )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3549:1: ( rule__SimpleFunction__Group_3__0 )*
            {
             before(grammarAccess.getSimpleFunctionAccess().getGroup_3()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3550:1: ( rule__SimpleFunction__Group_3__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==12) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3550:2: rule__SimpleFunction__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__SimpleFunction__Group_3__0_in_rule__SimpleFunction__Group__3__Impl7163);
            	    rule__SimpleFunction__Group_3__0();
            	    _fsp--;


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
    // $ANTLR end rule__SimpleFunction__Group__3__Impl


    // $ANTLR start rule__SimpleFunction__Group__4
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3560:1: rule__SimpleFunction__Group__4 : rule__SimpleFunction__Group__4__Impl ;
    public final void rule__SimpleFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3564:1: ( rule__SimpleFunction__Group__4__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3565:2: rule__SimpleFunction__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SimpleFunction__Group__4__Impl_in_rule__SimpleFunction__Group__47194);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3571:1: rule__SimpleFunction__Group__4__Impl : ( ')' ) ;
    public final void rule__SimpleFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3575:1: ( ( ')' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3576:1: ( ')' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3576:1: ( ')' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3577:1: ')'
            {
             before(grammarAccess.getSimpleFunctionAccess().getRightParenthesisKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__SimpleFunction__Group__4__Impl7222); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3600:1: rule__SimpleFunction__Group_3__0 : rule__SimpleFunction__Group_3__0__Impl rule__SimpleFunction__Group_3__1 ;
    public final void rule__SimpleFunction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3604:1: ( rule__SimpleFunction__Group_3__0__Impl rule__SimpleFunction__Group_3__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3605:2: rule__SimpleFunction__Group_3__0__Impl rule__SimpleFunction__Group_3__1
            {
            pushFollow(FOLLOW_rule__SimpleFunction__Group_3__0__Impl_in_rule__SimpleFunction__Group_3__07263);
            rule__SimpleFunction__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SimpleFunction__Group_3__1_in_rule__SimpleFunction__Group_3__07266);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3612:1: rule__SimpleFunction__Group_3__0__Impl : ( ',' ) ;
    public final void rule__SimpleFunction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3616:1: ( ( ',' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3617:1: ( ',' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3617:1: ( ',' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3618:1: ','
            {
             before(grammarAccess.getSimpleFunctionAccess().getCommaKeyword_3_0()); 
            match(input,12,FOLLOW_12_in_rule__SimpleFunction__Group_3__0__Impl7294); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3631:1: rule__SimpleFunction__Group_3__1 : rule__SimpleFunction__Group_3__1__Impl ;
    public final void rule__SimpleFunction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3635:1: ( rule__SimpleFunction__Group_3__1__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3636:2: rule__SimpleFunction__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleFunction__Group_3__1__Impl_in_rule__SimpleFunction__Group_3__17325);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3642:1: rule__SimpleFunction__Group_3__1__Impl : ( ( rule__SimpleFunction__ValuesAssignment_3_1 ) ) ;
    public final void rule__SimpleFunction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3646:1: ( ( ( rule__SimpleFunction__ValuesAssignment_3_1 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3647:1: ( ( rule__SimpleFunction__ValuesAssignment_3_1 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3647:1: ( ( rule__SimpleFunction__ValuesAssignment_3_1 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3648:1: ( rule__SimpleFunction__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getSimpleFunctionAccess().getValuesAssignment_3_1()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3649:1: ( rule__SimpleFunction__ValuesAssignment_3_1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3649:2: rule__SimpleFunction__ValuesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SimpleFunction__ValuesAssignment_3_1_in_rule__SimpleFunction__Group_3__1__Impl7352);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3663:1: rule__SpecialFunction__Group__0 : rule__SpecialFunction__Group__0__Impl rule__SpecialFunction__Group__1 ;
    public final void rule__SpecialFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3667:1: ( rule__SpecialFunction__Group__0__Impl rule__SpecialFunction__Group__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3668:2: rule__SpecialFunction__Group__0__Impl rule__SpecialFunction__Group__1
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__0__Impl_in_rule__SpecialFunction__Group__07386);
            rule__SpecialFunction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group__1_in_rule__SpecialFunction__Group__07389);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3675:1: rule__SpecialFunction__Group__0__Impl : ( ( rule__SpecialFunction__IdAssignment_0 ) ) ;
    public final void rule__SpecialFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3679:1: ( ( ( rule__SpecialFunction__IdAssignment_0 ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3680:1: ( ( rule__SpecialFunction__IdAssignment_0 ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3680:1: ( ( rule__SpecialFunction__IdAssignment_0 ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3681:1: ( rule__SpecialFunction__IdAssignment_0 )
            {
             before(grammarAccess.getSpecialFunctionAccess().getIdAssignment_0()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3682:1: ( rule__SpecialFunction__IdAssignment_0 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3682:2: rule__SpecialFunction__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__SpecialFunction__IdAssignment_0_in_rule__SpecialFunction__Group__0__Impl7416);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3692:1: rule__SpecialFunction__Group__1 : rule__SpecialFunction__Group__1__Impl rule__SpecialFunction__Group__2 ;
    public final void rule__SpecialFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3696:1: ( rule__SpecialFunction__Group__1__Impl rule__SpecialFunction__Group__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3697:2: rule__SpecialFunction__Group__1__Impl rule__SpecialFunction__Group__2
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__1__Impl_in_rule__SpecialFunction__Group__17446);
            rule__SpecialFunction__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group__2_in_rule__SpecialFunction__Group__17449);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3704:1: rule__SpecialFunction__Group__1__Impl : ( '(' ) ;
    public final void rule__SpecialFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3708:1: ( ( '(' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3709:1: ( '(' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3709:1: ( '(' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3710:1: '('
            {
             before(grammarAccess.getSpecialFunctionAccess().getLeftParenthesisKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__SpecialFunction__Group__1__Impl7477); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3723:1: rule__SpecialFunction__Group__2 : rule__SpecialFunction__Group__2__Impl rule__SpecialFunction__Group__3 ;
    public final void rule__SpecialFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3727:1: ( rule__SpecialFunction__Group__2__Impl rule__SpecialFunction__Group__3 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3728:2: rule__SpecialFunction__Group__2__Impl rule__SpecialFunction__Group__3
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__2__Impl_in_rule__SpecialFunction__Group__27508);
            rule__SpecialFunction__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group__3_in_rule__SpecialFunction__Group__27511);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3735:1: rule__SpecialFunction__Group__2__Impl : ( ( rule__SpecialFunction__Alternatives_2 )* ) ;
    public final void rule__SpecialFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3739:1: ( ( ( rule__SpecialFunction__Alternatives_2 )* ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3740:1: ( ( rule__SpecialFunction__Alternatives_2 )* )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3740:1: ( ( rule__SpecialFunction__Alternatives_2 )* )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3741:1: ( rule__SpecialFunction__Alternatives_2 )*
            {
             before(grammarAccess.getSpecialFunctionAccess().getAlternatives_2()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3742:1: ( rule__SpecialFunction__Alternatives_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_ANY_OTHER && LA28_0<=RULE_INT)||LA28_0==12||(LA28_0>=24 && LA28_0<=25)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3742:2: rule__SpecialFunction__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__SpecialFunction__Alternatives_2_in_rule__SpecialFunction__Group__2__Impl7538);
            	    rule__SpecialFunction__Alternatives_2();
            	    _fsp--;


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
    // $ANTLR end rule__SpecialFunction__Group__2__Impl


    // $ANTLR start rule__SpecialFunction__Group__3
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3752:1: rule__SpecialFunction__Group__3 : rule__SpecialFunction__Group__3__Impl ;
    public final void rule__SpecialFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3756:1: ( rule__SpecialFunction__Group__3__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3757:2: rule__SpecialFunction__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__3__Impl_in_rule__SpecialFunction__Group__37569);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3763:1: rule__SpecialFunction__Group__3__Impl : ( ')' ) ;
    public final void rule__SpecialFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3767:1: ( ( ')' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3768:1: ( ')' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3768:1: ( ')' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3769:1: ')'
            {
             before(grammarAccess.getSpecialFunctionAccess().getRightParenthesisKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__SpecialFunction__Group__3__Impl7597); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3790:1: rule__SpecialFunction__Group_2_5__0 : rule__SpecialFunction__Group_2_5__0__Impl rule__SpecialFunction__Group_2_5__1 ;
    public final void rule__SpecialFunction__Group_2_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3794:1: ( rule__SpecialFunction__Group_2_5__0__Impl rule__SpecialFunction__Group_2_5__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3795:2: rule__SpecialFunction__Group_2_5__0__Impl rule__SpecialFunction__Group_2_5__1
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_5__0__Impl_in_rule__SpecialFunction__Group_2_5__07636);
            rule__SpecialFunction__Group_2_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_5__1_in_rule__SpecialFunction__Group_2_5__07639);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3802:1: rule__SpecialFunction__Group_2_5__0__Impl : ( '$(' ) ;
    public final void rule__SpecialFunction__Group_2_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3806:1: ( ( '$(' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3807:1: ( '$(' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3807:1: ( '$(' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3808:1: '$('
            {
             before(grammarAccess.getSpecialFunctionAccess().getDollarSignLeftParenthesisKeyword_2_5_0()); 
            match(input,24,FOLLOW_24_in_rule__SpecialFunction__Group_2_5__0__Impl7667); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3821:1: rule__SpecialFunction__Group_2_5__1 : rule__SpecialFunction__Group_2_5__1__Impl rule__SpecialFunction__Group_2_5__2 ;
    public final void rule__SpecialFunction__Group_2_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3825:1: ( rule__SpecialFunction__Group_2_5__1__Impl rule__SpecialFunction__Group_2_5__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3826:2: rule__SpecialFunction__Group_2_5__1__Impl rule__SpecialFunction__Group_2_5__2
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_5__1__Impl_in_rule__SpecialFunction__Group_2_5__17698);
            rule__SpecialFunction__Group_2_5__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_5__2_in_rule__SpecialFunction__Group_2_5__17701);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3833:1: rule__SpecialFunction__Group_2_5__1__Impl : ( RULE_ID ) ;
    public final void rule__SpecialFunction__Group_2_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3837:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3838:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3838:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3839:1: RULE_ID
            {
             before(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_5_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SpecialFunction__Group_2_5__1__Impl7728); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3850:1: rule__SpecialFunction__Group_2_5__2 : rule__SpecialFunction__Group_2_5__2__Impl ;
    public final void rule__SpecialFunction__Group_2_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3854:1: ( rule__SpecialFunction__Group_2_5__2__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3855:2: rule__SpecialFunction__Group_2_5__2__Impl
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_5__2__Impl_in_rule__SpecialFunction__Group_2_5__27757);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3861:1: rule__SpecialFunction__Group_2_5__2__Impl : ( ')' ) ;
    public final void rule__SpecialFunction__Group_2_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3865:1: ( ( ')' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3866:1: ( ')' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3866:1: ( ')' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3867:1: ')'
            {
             before(grammarAccess.getSpecialFunctionAccess().getRightParenthesisKeyword_2_5_2()); 
            match(input,14,FOLLOW_14_in_rule__SpecialFunction__Group_2_5__2__Impl7785); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3886:1: rule__SpecialFunction__Group_2_6__0 : rule__SpecialFunction__Group_2_6__0__Impl rule__SpecialFunction__Group_2_6__1 ;
    public final void rule__SpecialFunction__Group_2_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3890:1: ( rule__SpecialFunction__Group_2_6__0__Impl rule__SpecialFunction__Group_2_6__1 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3891:2: rule__SpecialFunction__Group_2_6__0__Impl rule__SpecialFunction__Group_2_6__1
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_6__0__Impl_in_rule__SpecialFunction__Group_2_6__07822);
            rule__SpecialFunction__Group_2_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_6__1_in_rule__SpecialFunction__Group_2_6__07825);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3898:1: rule__SpecialFunction__Group_2_6__0__Impl : ( '${' ) ;
    public final void rule__SpecialFunction__Group_2_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3902:1: ( ( '${' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3903:1: ( '${' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3903:1: ( '${' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3904:1: '${'
            {
             before(grammarAccess.getSpecialFunctionAccess().getDollarSignLeftCurlyBracketKeyword_2_6_0()); 
            match(input,25,FOLLOW_25_in_rule__SpecialFunction__Group_2_6__0__Impl7853); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3917:1: rule__SpecialFunction__Group_2_6__1 : rule__SpecialFunction__Group_2_6__1__Impl rule__SpecialFunction__Group_2_6__2 ;
    public final void rule__SpecialFunction__Group_2_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3921:1: ( rule__SpecialFunction__Group_2_6__1__Impl rule__SpecialFunction__Group_2_6__2 )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3922:2: rule__SpecialFunction__Group_2_6__1__Impl rule__SpecialFunction__Group_2_6__2
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_6__1__Impl_in_rule__SpecialFunction__Group_2_6__17884);
            rule__SpecialFunction__Group_2_6__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_6__2_in_rule__SpecialFunction__Group_2_6__17887);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3929:1: rule__SpecialFunction__Group_2_6__1__Impl : ( RULE_ID ) ;
    public final void rule__SpecialFunction__Group_2_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3933:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3934:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3934:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3935:1: RULE_ID
            {
             before(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_6_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SpecialFunction__Group_2_6__1__Impl7914); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3946:1: rule__SpecialFunction__Group_2_6__2 : rule__SpecialFunction__Group_2_6__2__Impl ;
    public final void rule__SpecialFunction__Group_2_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3950:1: ( rule__SpecialFunction__Group_2_6__2__Impl )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3951:2: rule__SpecialFunction__Group_2_6__2__Impl
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_6__2__Impl_in_rule__SpecialFunction__Group_2_6__27943);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3957:1: rule__SpecialFunction__Group_2_6__2__Impl : ( '}' ) ;
    public final void rule__SpecialFunction__Group_2_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3961:1: ( ( '}' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3962:1: ( '}' )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3962:1: ( '}' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3963:1: '}'
            {
             before(grammarAccess.getSpecialFunctionAccess().getRightCurlyBracketKeyword_2_6_2()); 
            match(input,19,FOLLOW_19_in_rule__SpecialFunction__Group_2_6__2__Impl7971); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3983:1: rule__CfModel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__CfModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3987:1: ( ( ruleAbstractElement ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3988:1: ( ruleAbstractElement )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3988:1: ( ruleAbstractElement )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3989:1: ruleAbstractElement
            {
             before(grammarAccess.getCfModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__CfModel__ElementsAssignment8013);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:3998:1: rule__Bundle__ComponentAssignment_1 : ( ruleBundleComponent ) ;
    public final void rule__Bundle__ComponentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4002:1: ( ( ruleBundleComponent ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4003:1: ( ruleBundleComponent )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4003:1: ( ruleBundleComponent )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4004:1: ruleBundleComponent
            {
             before(grammarAccess.getBundleAccess().getComponentBundleComponentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBundleComponent_in_rule__Bundle__ComponentAssignment_18044);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4013:1: rule__Bundle__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Bundle__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4017:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4018:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4018:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4019:1: RULE_ID
            {
             before(grammarAccess.getBundleAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Bundle__NameAssignment_28075); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4028:1: rule__Bundle__PromiseTypeAssignment_5 : ( ruleBundlePromiseType ) ;
    public final void rule__Bundle__PromiseTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4032:1: ( ( ruleBundlePromiseType ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4033:1: ( ruleBundlePromiseType )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4033:1: ( ruleBundlePromiseType )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4034:1: ruleBundlePromiseType
            {
             before(grammarAccess.getBundleAccess().getPromiseTypeBundlePromiseTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleBundlePromiseType_in_rule__Bundle__PromiseTypeAssignment_58106);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4043:1: rule__BundlePromiseType__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BundlePromiseType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4047:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4048:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4048:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4049:1: RULE_ID
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BundlePromiseType__NameAssignment_08137); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4058:1: rule__BundlePromiseType__PromisesAssignment_2 : ( ruleBundlePromise ) ;
    public final void rule__BundlePromiseType__PromisesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4062:1: ( ( ruleBundlePromise ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4063:1: ( ruleBundlePromise )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4063:1: ( ruleBundlePromise )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4064:1: ruleBundlePromise
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getPromisesBundlePromiseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBundlePromise_in_rule__BundlePromiseType__PromisesAssignment_28168);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4073:1: rule__BundlePromiseType__ClassesAssignment_3 : ( ruleBundleClass ) ;
    public final void rule__BundlePromiseType__ClassesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4077:1: ( ( ruleBundleClass ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4078:1: ( ruleBundleClass )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4078:1: ( ruleBundleClass )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4079:1: ruleBundleClass
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getClassesBundleClassParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBundleClass_in_rule__BundlePromiseType__ClassesAssignment_38199);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4088:1: rule__BundleClass__NameAssignment_0 : ( ruleCLASS_ID ) ;
    public final void rule__BundleClass__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4092:1: ( ( ruleCLASS_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4093:1: ( ruleCLASS_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4093:1: ( ruleCLASS_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4094:1: ruleCLASS_ID
            {
             before(grammarAccess.getBundleClassAccess().getNameCLASS_IDParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCLASS_ID_in_rule__BundleClass__NameAssignment_08230);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4103:1: rule__BundleClass__PromisesAssignment_2 : ( ruleBundlePromise ) ;
    public final void rule__BundleClass__PromisesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4107:1: ( ( ruleBundlePromise ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4108:1: ( ruleBundlePromise )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4108:1: ( ruleBundlePromise )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4109:1: ruleBundlePromise
            {
             before(grammarAccess.getBundleClassAccess().getPromisesBundlePromiseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBundlePromise_in_rule__BundleClass__PromisesAssignment_28261);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4118:1: rule__BundlePromise__NameAssignment_0 : ( RULE_STRING ) ;
    public final void rule__BundlePromise__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4122:1: ( ( RULE_STRING ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4123:1: ( RULE_STRING )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4123:1: ( RULE_STRING )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4124:1: RULE_STRING
            {
             before(grammarAccess.getBundlePromiseAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BundlePromise__NameAssignment_08292); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4133:1: rule__BundlePromise__ValuesAssignment_1_0 : ( rulePromiseValue ) ;
    public final void rule__BundlePromise__ValuesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4137:1: ( ( rulePromiseValue ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4138:1: ( rulePromiseValue )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4138:1: ( rulePromiseValue )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4139:1: rulePromiseValue
            {
             before(grammarAccess.getBundlePromiseAccess().getValuesPromiseValueParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_rulePromiseValue_in_rule__BundlePromise__ValuesAssignment_1_08323);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4148:1: rule__BundlePromise__ValuesAssignment_1_1_1 : ( rulePromiseValue ) ;
    public final void rule__BundlePromise__ValuesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4152:1: ( ( rulePromiseValue ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4153:1: ( rulePromiseValue )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4153:1: ( rulePromiseValue )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4154:1: rulePromiseValue
            {
             before(grammarAccess.getBundlePromiseAccess().getValuesPromiseValueParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_rulePromiseValue_in_rule__BundlePromise__ValuesAssignment_1_1_18354);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4163:1: rule__PromiseValue__KeywordAssignment_0 : ( RULE_ID ) ;
    public final void rule__PromiseValue__KeywordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4167:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4168:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4168:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4169:1: RULE_ID
            {
             before(grammarAccess.getPromiseValueAccess().getKeywordIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PromiseValue__KeywordAssignment_08385); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4178:1: rule__PromiseValue__ValuesAssignment_2_0_0 : ( RULE_STRING ) ;
    public final void rule__PromiseValue__ValuesAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4182:1: ( ( RULE_STRING ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4183:1: ( RULE_STRING )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4183:1: ( RULE_STRING )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4184:1: RULE_STRING
            {
             before(grammarAccess.getPromiseValueAccess().getValuesSTRINGTerminalRuleCall_2_0_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PromiseValue__ValuesAssignment_2_0_08416); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4193:1: rule__PromiseValue__FunctionsAssignment_2_0_1 : ( ruleSimpleFunction ) ;
    public final void rule__PromiseValue__FunctionsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4197:1: ( ( ruleSimpleFunction ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4198:1: ( ruleSimpleFunction )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4198:1: ( ruleSimpleFunction )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4199:1: ruleSimpleFunction
            {
             before(grammarAccess.getPromiseValueAccess().getFunctionsSimpleFunctionParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_ruleSimpleFunction_in_rule__PromiseValue__FunctionsAssignment_2_0_18447);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4208:1: rule__PromiseValue__ValuesAssignment_2_1_1_0 : ( RULE_STRING ) ;
    public final void rule__PromiseValue__ValuesAssignment_2_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4212:1: ( ( RULE_STRING ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4213:1: ( RULE_STRING )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4213:1: ( RULE_STRING )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4214:1: RULE_STRING
            {
             before(grammarAccess.getPromiseValueAccess().getValuesSTRINGTerminalRuleCall_2_1_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PromiseValue__ValuesAssignment_2_1_1_08478); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4223:1: rule__PromiseValue__FunctionsAssignment_2_1_1_1 : ( ruleSimpleFunction ) ;
    public final void rule__PromiseValue__FunctionsAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4227:1: ( ( ruleSimpleFunction ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4228:1: ( ruleSimpleFunction )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4228:1: ( ruleSimpleFunction )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4229:1: ruleSimpleFunction
            {
             before(grammarAccess.getPromiseValueAccess().getFunctionsSimpleFunctionParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_ruleSimpleFunction_in_rule__PromiseValue__FunctionsAssignment_2_1_1_18509);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4238:1: rule__PromiseValue__ValuesAssignment_2_1_2_1_0 : ( RULE_STRING ) ;
    public final void rule__PromiseValue__ValuesAssignment_2_1_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4242:1: ( ( RULE_STRING ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4243:1: ( RULE_STRING )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4243:1: ( RULE_STRING )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4244:1: RULE_STRING
            {
             before(grammarAccess.getPromiseValueAccess().getValuesSTRINGTerminalRuleCall_2_1_2_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PromiseValue__ValuesAssignment_2_1_2_1_08540); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4253:1: rule__PromiseValue__FunctionsAssignment_2_1_2_1_1 : ( ruleSimpleFunction ) ;
    public final void rule__PromiseValue__FunctionsAssignment_2_1_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4257:1: ( ( ruleSimpleFunction ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4258:1: ( ruleSimpleFunction )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4258:1: ( ruleSimpleFunction )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4259:1: ruleSimpleFunction
            {
             before(grammarAccess.getPromiseValueAccess().getFunctionsSimpleFunctionParserRuleCall_2_1_2_1_1_0()); 
            pushFollow(FOLLOW_ruleSimpleFunction_in_rule__PromiseValue__FunctionsAssignment_2_1_2_1_18571);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4268:1: rule__Body__ComponentAssignment_1 : ( ruleBodyComponent ) ;
    public final void rule__Body__ComponentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4272:1: ( ( ruleBodyComponent ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4273:1: ( ruleBodyComponent )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4273:1: ( ruleBodyComponent )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4274:1: ruleBodyComponent
            {
             before(grammarAccess.getBodyAccess().getComponentBodyComponentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBodyComponent_in_rule__Body__ComponentAssignment_18602);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4283:1: rule__Body__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Body__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4287:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4288:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4288:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4289:1: RULE_ID
            {
             before(grammarAccess.getBodyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Body__NameAssignment_28633); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4298:1: rule__Body__VariablesAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Body__VariablesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4302:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4303:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4303:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4304:1: RULE_ID
            {
             before(grammarAccess.getBodyAccess().getVariablesIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Body__VariablesAssignment_3_18664); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4313:1: rule__Body__VariablesAssignment_3_2_1 : ( RULE_ID ) ;
    public final void rule__Body__VariablesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4317:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4318:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4318:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4319:1: RULE_ID
            {
             before(grammarAccess.getBodyAccess().getVariablesIDTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Body__VariablesAssignment_3_2_18695); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4328:1: rule__Body__PromiseTypeAssignment_5 : ( ruleBodyFunction ) ;
    public final void rule__Body__PromiseTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4332:1: ( ( ruleBodyFunction ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4333:1: ( ruleBodyFunction )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4333:1: ( ruleBodyFunction )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4334:1: ruleBodyFunction
            {
             before(grammarAccess.getBodyAccess().getPromiseTypeBodyFunctionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleBodyFunction_in_rule__Body__PromiseTypeAssignment_58726);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4343:1: rule__Body__ClassesAssignment_6 : ( ruleBodyClass ) ;
    public final void rule__Body__ClassesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4347:1: ( ( ruleBodyClass ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4348:1: ( ruleBodyClass )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4348:1: ( ruleBodyClass )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4349:1: ruleBodyClass
            {
             before(grammarAccess.getBodyAccess().getClassesBodyClassParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleBodyClass_in_rule__Body__ClassesAssignment_68757);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4358:1: rule__BodyClass__NameAssignment_0 : ( ruleCLASS_ID ) ;
    public final void rule__BodyClass__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4362:1: ( ( ruleCLASS_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4363:1: ( ruleCLASS_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4363:1: ( ruleCLASS_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4364:1: ruleCLASS_ID
            {
             before(grammarAccess.getBodyClassAccess().getNameCLASS_IDParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCLASS_ID_in_rule__BodyClass__NameAssignment_08788);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4373:1: rule__BodyClass__PromiseTypeAssignment_2 : ( ruleBodyFunction ) ;
    public final void rule__BodyClass__PromiseTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4377:1: ( ( ruleBodyFunction ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4378:1: ( ruleBodyFunction )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4378:1: ( ruleBodyFunction )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4379:1: ruleBodyFunction
            {
             before(grammarAccess.getBodyClassAccess().getPromiseTypeBodyFunctionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBodyFunction_in_rule__BodyClass__PromiseTypeAssignment_28819);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4388:1: rule__BodyFunction__NameAssignment_0 : ( ruleBodyPromiseType ) ;
    public final void rule__BodyFunction__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4392:1: ( ( ruleBodyPromiseType ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4393:1: ( ruleBodyPromiseType )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4393:1: ( ruleBodyPromiseType )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4394:1: ruleBodyPromiseType
            {
             before(grammarAccess.getBodyFunctionAccess().getNameBodyPromiseTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBodyPromiseType_in_rule__BodyFunction__NameAssignment_08850);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4403:1: rule__BodyFunction__ValuesAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__BodyFunction__ValuesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4407:1: ( ( RULE_STRING ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4408:1: ( RULE_STRING )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4408:1: ( RULE_STRING )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4409:1: RULE_STRING
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_08881); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4418:1: rule__BodyFunction__ListAssignment_2_1_0 : ( ( '{' ) ) ;
    public final void rule__BodyFunction__ListAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4422:1: ( ( ( '{' ) ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4423:1: ( ( '{' ) )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4423:1: ( ( '{' ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4424:1: ( '{' )
            {
             before(grammarAccess.getBodyFunctionAccess().getListLeftCurlyBracketKeyword_2_1_0_0()); 
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4425:1: ( '{' )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4426:1: '{'
            {
             before(grammarAccess.getBodyFunctionAccess().getListLeftCurlyBracketKeyword_2_1_0_0()); 
            match(input,18,FOLLOW_18_in_rule__BodyFunction__ListAssignment_2_1_08917); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4441:1: rule__BodyFunction__ValuesAssignment_2_1_1 : ( RULE_STRING ) ;
    public final void rule__BodyFunction__ValuesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4445:1: ( ( RULE_STRING ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4446:1: ( RULE_STRING )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4446:1: ( RULE_STRING )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4447:1: RULE_STRING
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_1_18956); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4456:1: rule__BodyFunction__ValuesAssignment_2_1_2_1 : ( RULE_STRING ) ;
    public final void rule__BodyFunction__ValuesAssignment_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4460:1: ( ( RULE_STRING ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4461:1: ( RULE_STRING )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4461:1: ( RULE_STRING )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4462:1: RULE_STRING
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_1_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_1_2_18987); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4471:1: rule__BodyFunction__FunctionAssignment_2_2 : ( ruleSpecialFunction ) ;
    public final void rule__BodyFunction__FunctionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4475:1: ( ( ruleSpecialFunction ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4476:1: ( ruleSpecialFunction )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4476:1: ( ruleSpecialFunction )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4477:1: ruleSpecialFunction
            {
             before(grammarAccess.getBodyFunctionAccess().getFunctionSpecialFunctionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleSpecialFunction_in_rule__BodyFunction__FunctionAssignment_2_29018);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4486:1: rule__SimpleFunction__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__SimpleFunction__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4490:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4491:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4491:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4492:1: RULE_ID
            {
             before(grammarAccess.getSimpleFunctionAccess().getIdIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleFunction__IdAssignment_09049); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4501:1: rule__SimpleFunction__ValuesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SimpleFunction__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4505:1: ( ( RULE_STRING ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4506:1: ( RULE_STRING )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4506:1: ( RULE_STRING )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4507:1: RULE_STRING
            {
             before(grammarAccess.getSimpleFunctionAccess().getValuesSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleFunction__ValuesAssignment_29080); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4516:1: rule__SimpleFunction__ValuesAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__SimpleFunction__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4520:1: ( ( RULE_STRING ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4521:1: ( RULE_STRING )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4521:1: ( RULE_STRING )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4522:1: RULE_STRING
            {
             before(grammarAccess.getSimpleFunctionAccess().getValuesSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SimpleFunction__ValuesAssignment_3_19111); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4531:1: rule__SpecialFunction__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__SpecialFunction__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4535:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4536:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4536:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4537:1: RULE_ID
            {
             before(grammarAccess.getSpecialFunctionAccess().getIdIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SpecialFunction__IdAssignment_09142); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4546:1: rule__SpecialFunction__FuncAssignment_2_7 : ( ruleSpecialFunction ) ;
    public final void rule__SpecialFunction__FuncAssignment_2_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4550:1: ( ( ruleSpecialFunction ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4551:1: ( ruleSpecialFunction )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4551:1: ( ruleSpecialFunction )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4552:1: ruleSpecialFunction
            {
             before(grammarAccess.getSpecialFunctionAccess().getFuncSpecialFunctionParserRuleCall_2_7_0()); 
            pushFollow(FOLLOW_ruleSpecialFunction_in_rule__SpecialFunction__FuncAssignment_2_79173);
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4561:1: rule__BodyPromiseType__NameAssignment : ( RULE_ID ) ;
    public final void rule__BodyPromiseType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4565:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4566:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4566:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4567:1: RULE_ID
            {
             before(grammarAccess.getBodyPromiseTypeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BodyPromiseType__NameAssignment9204); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4576:1: rule__BundleComponent__NameAssignment : ( RULE_ID ) ;
    public final void rule__BundleComponent__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4580:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4581:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4581:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4582:1: RULE_ID
            {
             before(grammarAccess.getBundleComponentAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BundleComponent__NameAssignment9235); 
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
    // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4591:1: rule__BodyComponent__NameAssignment : ( RULE_ID ) ;
    public final void rule__BodyComponent__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4595:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4596:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4596:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g:4597:1: RULE_ID
            {
             before(grammarAccess.getBodyComponentAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BodyComponent__NameAssignment9266); 
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
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_0__0_in_rule__CLASS_ID__Alternatives1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_1__0_in_rule__CLASS_ID__Alternatives1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2__0_in_rule__CLASS_ID__Alternatives1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__PLACEHOLDERB__Alternatives1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PLACEHOLDERB__Alternatives1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PLACEHOLDERB__Alternatives1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__PLACEHOLDERB__Alternatives1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__PLACEHOLDERB__Alternatives1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__PLACEHOLDERB__Alternatives1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PLACEHOLDERB__Alternatives1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PLACEHOLDERB__Alternatives1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundle_in_rule__Part__Alternatives1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_rule__Part__Alternatives1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Alternatives_2_0_in_rule__PromiseValue__Alternatives_21434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1__0_in_rule__PromiseValue__Alternatives_21452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__0_in_rule__PromiseValue__Alternatives_21470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__ValuesAssignment_2_0_0_in_rule__PromiseValue__Alternatives_2_01503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__FunctionsAssignment_2_0_1_in_rule__PromiseValue__Alternatives_2_01521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__ValuesAssignment_2_1_1_0_in_rule__PromiseValue__Alternatives_2_1_11554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__FunctionsAssignment_2_1_1_1_in_rule__PromiseValue__Alternatives_2_1_11572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__ValuesAssignment_2_1_2_1_0_in_rule__PromiseValue__Alternatives_2_1_2_11605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__FunctionsAssignment_2_1_2_1_1_in_rule__PromiseValue__Alternatives_2_1_2_11623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__ValuesAssignment_2_0_in_rule__BodyFunction__Alternatives_21656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__0_in_rule__BodyFunction__Alternatives_21674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__FunctionAssignment_2_2_in_rule__BodyFunction__Alternatives_21692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__0_in_rule__BodyFunction__Alternatives_21710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__SpecialFunction__Alternatives_21743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SpecialFunction__Alternatives_21760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SpecialFunction__Alternatives_21777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SpecialFunction__Alternatives_21794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SpecialFunction__Alternatives_21812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_5__0_in_rule__SpecialFunction__Alternatives_21831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_6__0_in_rule__SpecialFunction__Alternatives_21849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__FuncAssignment_2_7_in_rule__SpecialFunction__Alternatives_21867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_0__0__Impl_in_rule__CLASS_ID__Group_0__01898 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_0__1_in_rule__CLASS_ID__Group_0__01901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CLASS_ID__Group_0__0__Impl1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_0__1__Impl_in_rule__CLASS_ID__Group_0__11957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_0_1__0_in_rule__CLASS_ID__Group_0__1__Impl1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_0_1__0__Impl_in_rule__CLASS_ID__Group_0_1__02019 = new BitSet(new long[]{0x0000000000012020L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_0_1__1_in_rule__CLASS_ID__Group_0_1__02022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CLASS_ID__Group_0_1__0__Impl2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_0_1__1__Impl_in_rule__CLASS_ID__Group_0_1__12081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_rule__CLASS_ID__Group_0_1__1__Impl2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_1__0__Impl_in_rule__CLASS_ID__Group_1__02141 = new BitSet(new long[]{0x0000000000012020L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_1__1_in_rule__CLASS_ID__Group_1__02144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CLASS_ID__Group_1__0__Impl2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_1__1__Impl_in_rule__CLASS_ID__Group_1__12203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_rule__CLASS_ID__Group_1__1__Impl2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2__0__Impl_in_rule__CLASS_ID__Group_2__02263 = new BitSet(new long[]{0x0000000000012020L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2__1_in_rule__CLASS_ID__Group_2__02266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CLASS_ID__Group_2__0__Impl2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2__1__Impl_in_rule__CLASS_ID__Group_2__12325 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2__2_in_rule__CLASS_ID__Group_2__12328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_rule__CLASS_ID__Group_2__1__Impl2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2__2__Impl_in_rule__CLASS_ID__Group_2__22384 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2__3_in_rule__CLASS_ID__Group_2__22387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CLASS_ID__Group_2__2__Impl2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2__3__Impl_in_rule__CLASS_ID__Group_2__32446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2_3__0_in_rule__CLASS_ID__Group_2__3__Impl2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2_3__0__Impl_in_rule__CLASS_ID__Group_2_3__02512 = new BitSet(new long[]{0x0000000000012020L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2_3__1_in_rule__CLASS_ID__Group_2_3__02515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__CLASS_ID__Group_2_3__0__Impl2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Group_2_3__1__Impl_in_rule__CLASS_ID__Group_2_3__12574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_rule__CLASS_ID__Group_2_3__1__Impl2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__0__Impl_in_rule__Bundle__Group__02634 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Bundle__Group__1_in_rule__Bundle__Group__02637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Bundle__Group__0__Impl2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__1__Impl_in_rule__Bundle__Group__12696 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Bundle__Group__2_in_rule__Bundle__Group__12699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__ComponentAssignment_1_in_rule__Bundle__Group__1__Impl2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__2__Impl_in_rule__Bundle__Group__22756 = new BitSet(new long[]{0x0000000000047C70L});
    public static final BitSet FOLLOW_rule__Bundle__Group__3_in_rule__Bundle__Group__22759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__NameAssignment_2_in_rule__Bundle__Group__2__Impl2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__3__Impl_in_rule__Bundle__Group__32816 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Bundle__Group__4_in_rule__Bundle__Group__32819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePLACEHOLDERB_in_rule__Bundle__Group__3__Impl2847 = new BitSet(new long[]{0x0000000000007C72L});
    public static final BitSet FOLLOW_rule__Bundle__Group__4__Impl_in_rule__Bundle__Group__42878 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_rule__Bundle__Group__5_in_rule__Bundle__Group__42881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Bundle__Group__4__Impl2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__5__Impl_in_rule__Bundle__Group__52940 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Bundle__Group__6_in_rule__Bundle__Group__52943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__PromiseTypeAssignment_5_in_rule__Bundle__Group__5__Impl2970 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Bundle__Group__6__Impl_in_rule__Bundle__Group__63001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Bundle__Group__6__Impl3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__Group__0__Impl_in_rule__BundlePromiseType__Group__03074 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__Group__1_in_rule__BundlePromiseType__Group__03077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__NameAssignment_0_in_rule__BundlePromiseType__Group__0__Impl3104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__Group__1__Impl_in_rule__BundlePromiseType__Group__13134 = new BitSet(new long[]{0x0000000000012062L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__Group__2_in_rule__BundlePromiseType__Group__13137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BundlePromiseType__Group__1__Impl3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__Group__2__Impl_in_rule__BundlePromiseType__Group__23196 = new BitSet(new long[]{0x0000000000012022L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__Group__3_in_rule__BundlePromiseType__Group__23199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__PromisesAssignment_2_in_rule__BundlePromiseType__Group__2__Impl3226 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__Group__3__Impl_in_rule__BundlePromiseType__Group__33257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__ClassesAssignment_3_in_rule__BundlePromiseType__Group__3__Impl3284 = new BitSet(new long[]{0x0000000000012022L});
    public static final BitSet FOLLOW_rule__BundleClass__Group__0__Impl_in_rule__BundleClass__Group__03323 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__BundleClass__Group__1_in_rule__BundleClass__Group__03326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundleClass__NameAssignment_0_in_rule__BundleClass__Group__0__Impl3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundleClass__Group__1__Impl_in_rule__BundleClass__Group__13383 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BundleClass__Group__2_in_rule__BundleClass__Group__13386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BundleClass__Group__1__Impl3414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundleClass__Group__2__Impl_in_rule__BundleClass__Group__23445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundleClass__PromisesAssignment_2_in_rule__BundleClass__Group__2__Impl3474 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__BundleClass__PromisesAssignment_2_in_rule__BundleClass__Group__2__Impl3486 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group__0__Impl_in_rule__BundlePromise__Group__03525 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group__1_in_rule__BundlePromise__Group__03528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__NameAssignment_0_in_rule__BundlePromise__Group__0__Impl3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group__1__Impl_in_rule__BundlePromise__Group__13585 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group__2_in_rule__BundlePromise__Group__13588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group_1__0_in_rule__BundlePromise__Group__1__Impl3615 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group__2__Impl_in_rule__BundlePromise__Group__23646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BundlePromise__Group__2__Impl3674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group_1__0__Impl_in_rule__BundlePromise__Group_1__03711 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group_1__1_in_rule__BundlePromise__Group_1__03714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__ValuesAssignment_1_0_in_rule__BundlePromise__Group_1__0__Impl3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group_1__1__Impl_in_rule__BundlePromise__Group_1__13771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group_1_1__0_in_rule__BundlePromise__Group_1__1__Impl3798 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group_1_1__0__Impl_in_rule__BundlePromise__Group_1_1__03833 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group_1_1__1_in_rule__BundlePromise__Group_1_1__03836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BundlePromise__Group_1_1__0__Impl3864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__Group_1_1__1__Impl_in_rule__BundlePromise__Group_1_1__13895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromise__ValuesAssignment_1_1_1_in_rule__BundlePromise__Group_1_1__1__Impl3922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group__0__Impl_in_rule__PromiseValue__Group__03956 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group__1_in_rule__PromiseValue__Group__03959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__KeywordAssignment_0_in_rule__PromiseValue__Group__0__Impl3986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group__1__Impl_in_rule__PromiseValue__Group__14016 = new BitSet(new long[]{0x0000000000040060L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group__2_in_rule__PromiseValue__Group__14019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__PromiseValue__Group__1__Impl4047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group__2__Impl_in_rule__PromiseValue__Group__24078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Alternatives_2_in_rule__PromiseValue__Group__2__Impl4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1__0__Impl_in_rule__PromiseValue__Group_2_1__04141 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1__1_in_rule__PromiseValue__Group_2_1__04144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PromiseValue__Group_2_1__0__Impl4172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1__1__Impl_in_rule__PromiseValue__Group_2_1__14203 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1__2_in_rule__PromiseValue__Group_2_1__14206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Alternatives_2_1_1_in_rule__PromiseValue__Group_2_1__1__Impl4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1__2__Impl_in_rule__PromiseValue__Group_2_1__24263 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1__3_in_rule__PromiseValue__Group_2_1__24266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1_2__0_in_rule__PromiseValue__Group_2_1__2__Impl4293 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1__3__Impl_in_rule__PromiseValue__Group_2_1__34324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PromiseValue__Group_2_1__3__Impl4352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1_2__0__Impl_in_rule__PromiseValue__Group_2_1_2__04391 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1_2__1_in_rule__PromiseValue__Group_2_1_2__04394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__PromiseValue__Group_2_1_2__0__Impl4422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_1_2__1__Impl_in_rule__PromiseValue__Group_2_1_2__14453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Alternatives_2_1_2_1_in_rule__PromiseValue__Group_2_1_2__1__Impl4480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__0__Impl_in_rule__PromiseValue__Group_2_2__04514 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__1_in_rule__PromiseValue__Group_2_2__04517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PromiseValue__Group_2_2__0__Impl4545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__1__Impl_in_rule__PromiseValue__Group_2_2__14576 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__2_in_rule__PromiseValue__Group_2_2__14579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PromiseValue__Group_2_2__1__Impl4607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__2__Impl_in_rule__PromiseValue__Group_2_2__24638 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__3_in_rule__PromiseValue__Group_2_2__24641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PromiseValue__Group_2_2__2__Impl4669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__3__Impl_in_rule__PromiseValue__Group_2_2__34700 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__4_in_rule__PromiseValue__Group_2_2__34703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PromiseValue__Group_2_2__3__Impl4730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__4__Impl_in_rule__PromiseValue__Group_2_2__44759 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__5_in_rule__PromiseValue__Group_2_2__44762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PromiseValue__Group_2_2__4__Impl4790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PromiseValue__Group_2_2__5__Impl_in_rule__PromiseValue__Group_2_2__54821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PromiseValue__Group_2_2__5__Impl4849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__0__Impl_in_rule__Body__Group__04892 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Body__Group__1_in_rule__Body__Group__04895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Body__Group__0__Impl4923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__1__Impl_in_rule__Body__Group__14954 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Body__Group__2_in_rule__Body__Group__14957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__ComponentAssignment_1_in_rule__Body__Group__1__Impl4984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__2__Impl_in_rule__Body__Group__25014 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_rule__Body__Group__3_in_rule__Body__Group__25017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__NameAssignment_2_in_rule__Body__Group__2__Impl5044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__3__Impl_in_rule__Body__Group__35074 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Body__Group__4_in_rule__Body__Group__35077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3__0_in_rule__Body__Group__3__Impl5104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__4__Impl_in_rule__Body__Group__45135 = new BitSet(new long[]{0x0000000000092020L});
    public static final BitSet FOLLOW_rule__Body__Group__5_in_rule__Body__Group__45138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Body__Group__4__Impl5166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__5__Impl_in_rule__Body__Group__55197 = new BitSet(new long[]{0x0000000000092020L});
    public static final BitSet FOLLOW_rule__Body__Group__6_in_rule__Body__Group__55200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__PromiseTypeAssignment_5_in_rule__Body__Group__5__Impl5227 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Body__Group__6__Impl_in_rule__Body__Group__65258 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Body__Group__7_in_rule__Body__Group__65261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__ClassesAssignment_6_in_rule__Body__Group__6__Impl5288 = new BitSet(new long[]{0x0000000000012022L});
    public static final BitSet FOLLOW_rule__Body__Group__7__Impl_in_rule__Body__Group__75319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Body__Group__7__Impl5347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3__0__Impl_in_rule__Body__Group_3__05394 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Body__Group_3__1_in_rule__Body__Group_3__05397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Body__Group_3__0__Impl5425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3__1__Impl_in_rule__Body__Group_3__15456 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_rule__Body__Group_3__2_in_rule__Body__Group_3__15459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__VariablesAssignment_3_1_in_rule__Body__Group_3__1__Impl5486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3__2__Impl_in_rule__Body__Group_3__25516 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Body__Group_3__3_in_rule__Body__Group_3__25519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3_2__0_in_rule__Body__Group_3__2__Impl5546 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Body__Group_3__3__Impl_in_rule__Body__Group_3__35577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Body__Group_3__3__Impl5605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3_2__0__Impl_in_rule__Body__Group_3_2__05644 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Body__Group_3_2__1_in_rule__Body__Group_3_2__05647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Body__Group_3_2__0__Impl5675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3_2__1__Impl_in_rule__Body__Group_3_2__15706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__VariablesAssignment_3_2_1_in_rule__Body__Group_3_2__1__Impl5733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyClass__Group__0__Impl_in_rule__BodyClass__Group__05767 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__BodyClass__Group__1_in_rule__BodyClass__Group__05770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyClass__NameAssignment_0_in_rule__BodyClass__Group__0__Impl5797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyClass__Group__1__Impl_in_rule__BodyClass__Group__15827 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__BodyClass__Group__2_in_rule__BodyClass__Group__15830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BodyClass__Group__1__Impl5858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyClass__Group__2__Impl_in_rule__BodyClass__Group__25889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyClass__PromiseTypeAssignment_2_in_rule__BodyClass__Group__2__Impl5916 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__0__Impl_in_rule__BodyFunction__Group__05953 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__1_in_rule__BodyFunction__Group__05956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__NameAssignment_0_in_rule__BodyFunction__Group__0__Impl5983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__1__Impl_in_rule__BodyFunction__Group__16013 = new BitSet(new long[]{0x0000000000040060L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__2_in_rule__BodyFunction__Group__16016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__BodyFunction__Group__1__Impl6044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__2__Impl_in_rule__BodyFunction__Group__26075 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__3_in_rule__BodyFunction__Group__26078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Alternatives_2_in_rule__BodyFunction__Group__2__Impl6105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__3__Impl_in_rule__BodyFunction__Group__36135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BodyFunction__Group__3__Impl6163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__0__Impl_in_rule__BodyFunction__Group_2_1__06202 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__1_in_rule__BodyFunction__Group_2_1__06205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__ListAssignment_2_1_0_in_rule__BodyFunction__Group_2_1__0__Impl6232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__1__Impl_in_rule__BodyFunction__Group_2_1__16262 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__2_in_rule__BodyFunction__Group_2_1__16265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__ValuesAssignment_2_1_1_in_rule__BodyFunction__Group_2_1__1__Impl6292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__2__Impl_in_rule__BodyFunction__Group_2_1__26322 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__3_in_rule__BodyFunction__Group_2_1__26325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1_2__0_in_rule__BodyFunction__Group_2_1__2__Impl6352 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__3__Impl_in_rule__BodyFunction__Group_2_1__36383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BodyFunction__Group_2_1__3__Impl6411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1_2__0__Impl_in_rule__BodyFunction__Group_2_1_2__06450 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1_2__1_in_rule__BodyFunction__Group_2_1_2__06453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BodyFunction__Group_2_1_2__0__Impl6481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1_2__1__Impl_in_rule__BodyFunction__Group_2_1_2__16512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__ValuesAssignment_2_1_2_1_in_rule__BodyFunction__Group_2_1_2__1__Impl6539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__0__Impl_in_rule__BodyFunction__Group_2_3__06573 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__1_in_rule__BodyFunction__Group_2_3__06576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BodyFunction__Group_2_3__0__Impl6604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__1__Impl_in_rule__BodyFunction__Group_2_3__16635 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__2_in_rule__BodyFunction__Group_2_3__16638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BodyFunction__Group_2_3__1__Impl6666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__2__Impl_in_rule__BodyFunction__Group_2_3__26697 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__3_in_rule__BodyFunction__Group_2_3__26700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BodyFunction__Group_2_3__2__Impl6728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__3__Impl_in_rule__BodyFunction__Group_2_3__36759 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__4_in_rule__BodyFunction__Group_2_3__36762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BodyFunction__Group_2_3__3__Impl6789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__4__Impl_in_rule__BodyFunction__Group_2_3__46818 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__5_in_rule__BodyFunction__Group_2_3__46821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BodyFunction__Group_2_3__4__Impl6849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__5__Impl_in_rule__BodyFunction__Group_2_3__56880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BodyFunction__Group_2_3__5__Impl6908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__0__Impl_in_rule__SimpleFunction__Group__06951 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__1_in_rule__SimpleFunction__Group__06954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__IdAssignment_0_in_rule__SimpleFunction__Group__0__Impl6981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__1__Impl_in_rule__SimpleFunction__Group__17011 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__2_in_rule__SimpleFunction__Group__17014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SimpleFunction__Group__1__Impl7042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__2__Impl_in_rule__SimpleFunction__Group__27073 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__3_in_rule__SimpleFunction__Group__27076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__ValuesAssignment_2_in_rule__SimpleFunction__Group__2__Impl7103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__3__Impl_in_rule__SimpleFunction__Group__37133 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__4_in_rule__SimpleFunction__Group__37136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group_3__0_in_rule__SimpleFunction__Group__3__Impl7163 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group__4__Impl_in_rule__SimpleFunction__Group__47194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SimpleFunction__Group__4__Impl7222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group_3__0__Impl_in_rule__SimpleFunction__Group_3__07263 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group_3__1_in_rule__SimpleFunction__Group_3__07266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__SimpleFunction__Group_3__0__Impl7294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__Group_3__1__Impl_in_rule__SimpleFunction__Group_3__17325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleFunction__ValuesAssignment_3_1_in_rule__SimpleFunction__Group_3__1__Impl7352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__0__Impl_in_rule__SpecialFunction__Group__07386 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__1_in_rule__SpecialFunction__Group__07389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__IdAssignment_0_in_rule__SpecialFunction__Group__0__Impl7416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__1__Impl_in_rule__SpecialFunction__Group__17446 = new BitSet(new long[]{0x00000000030050F0L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__2_in_rule__SpecialFunction__Group__17449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SpecialFunction__Group__1__Impl7477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__2__Impl_in_rule__SpecialFunction__Group__27508 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__3_in_rule__SpecialFunction__Group__27511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Alternatives_2_in_rule__SpecialFunction__Group__2__Impl7538 = new BitSet(new long[]{0x00000000030010F2L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__3__Impl_in_rule__SpecialFunction__Group__37569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SpecialFunction__Group__3__Impl7597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_5__0__Impl_in_rule__SpecialFunction__Group_2_5__07636 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_5__1_in_rule__SpecialFunction__Group_2_5__07639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SpecialFunction__Group_2_5__0__Impl7667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_5__1__Impl_in_rule__SpecialFunction__Group_2_5__17698 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_5__2_in_rule__SpecialFunction__Group_2_5__17701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SpecialFunction__Group_2_5__1__Impl7728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_5__2__Impl_in_rule__SpecialFunction__Group_2_5__27757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SpecialFunction__Group_2_5__2__Impl7785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_6__0__Impl_in_rule__SpecialFunction__Group_2_6__07822 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_6__1_in_rule__SpecialFunction__Group_2_6__07825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SpecialFunction__Group_2_6__0__Impl7853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_6__1__Impl_in_rule__SpecialFunction__Group_2_6__17884 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_6__2_in_rule__SpecialFunction__Group_2_6__17887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SpecialFunction__Group_2_6__1__Impl7914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_6__2__Impl_in_rule__SpecialFunction__Group_2_6__27943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SpecialFunction__Group_2_6__2__Impl7971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__CfModel__ElementsAssignment8013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundleComponent_in_rule__Bundle__ComponentAssignment_18044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Bundle__NameAssignment_28075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundlePromiseType_in_rule__Bundle__PromiseTypeAssignment_58106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BundlePromiseType__NameAssignment_08137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundlePromise_in_rule__BundlePromiseType__PromisesAssignment_28168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundleClass_in_rule__BundlePromiseType__ClassesAssignment_38199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_rule__BundleClass__NameAssignment_08230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundlePromise_in_rule__BundleClass__PromisesAssignment_28261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BundlePromise__NameAssignment_08292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePromiseValue_in_rule__BundlePromise__ValuesAssignment_1_08323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePromiseValue_in_rule__BundlePromise__ValuesAssignment_1_1_18354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PromiseValue__KeywordAssignment_08385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PromiseValue__ValuesAssignment_2_0_08416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_rule__PromiseValue__FunctionsAssignment_2_0_18447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PromiseValue__ValuesAssignment_2_1_1_08478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_rule__PromiseValue__FunctionsAssignment_2_1_1_18509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PromiseValue__ValuesAssignment_2_1_2_1_08540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleFunction_in_rule__PromiseValue__FunctionsAssignment_2_1_2_1_18571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_rule__Body__ComponentAssignment_18602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Body__NameAssignment_28633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Body__VariablesAssignment_3_18664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Body__VariablesAssignment_3_2_18695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_rule__Body__PromiseTypeAssignment_58726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyClass_in_rule__Body__ClassesAssignment_68757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_rule__BodyClass__NameAssignment_08788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_rule__BodyClass__PromiseTypeAssignment_28819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyPromiseType_in_rule__BodyFunction__NameAssignment_08850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_08881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BodyFunction__ListAssignment_2_1_08917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_1_18956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_1_2_18987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_rule__BodyFunction__FunctionAssignment_2_29018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleFunction__IdAssignment_09049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleFunction__ValuesAssignment_29080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SimpleFunction__ValuesAssignment_3_19111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SpecialFunction__IdAssignment_09142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_rule__SpecialFunction__FuncAssignment_2_79173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BodyPromiseType__NameAssignment9204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BundleComponent__NameAssignment9235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BodyComponent__NameAssignment9266 = new BitSet(new long[]{0x0000000000000002L});

}