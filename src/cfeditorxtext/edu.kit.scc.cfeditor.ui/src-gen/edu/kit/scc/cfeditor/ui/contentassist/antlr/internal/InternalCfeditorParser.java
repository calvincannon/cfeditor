package edu.kit.scc.cfeditor.ui.contentassist.antlr.internal; 

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
import edu.kit.scc.cfeditor.services.CfeditorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCfeditorParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ANY_OTHER", "RULE_STRING", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "'('", "')'", "'|'", "'!'", "'.'", "'=>'", "';'", "','", "'bundle'", "'{'", "'}'", "':'", "'@'", "'body'", "'$('", "'${'", "'::'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=5;
    public static final int RULE_INT=7;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;

        public InternalCfeditorParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g"; }


     
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:61:1: entryRuleCfModel : ruleCfModel EOF ;
    public final void entryRuleCfModel() throws RecognitionException {
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:62:1: ( ruleCfModel EOF )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:63:1: ruleCfModel EOF
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:70:1: ruleCfModel : ( ( rule__CfModel__ElementsAssignment )* ) ;
    public final void ruleCfModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:74:2: ( ( ( rule__CfModel__ElementsAssignment )* ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:75:1: ( ( rule__CfModel__ElementsAssignment )* )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:75:1: ( ( rule__CfModel__ElementsAssignment )* )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:76:1: ( rule__CfModel__ElementsAssignment )*
            {
             before(grammarAccess.getCfModelAccess().getElementsAssignment()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:77:1: ( rule__CfModel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18||LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:77:2: rule__CfModel__ElementsAssignment
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:89:1: entryRuleCLASS_ID : ruleCLASS_ID EOF ;
    public final void entryRuleCLASS_ID() throws RecognitionException {
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:90:1: ( ruleCLASS_ID EOF )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:91:1: ruleCLASS_ID EOF
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:98:1: ruleCLASS_ID : ( ( ( rule__CLASS_ID__Alternatives ) ) ( ( rule__CLASS_ID__Alternatives )* ) ) ;
    public final void ruleCLASS_ID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:102:2: ( ( ( ( rule__CLASS_ID__Alternatives ) ) ( ( rule__CLASS_ID__Alternatives )* ) ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:103:1: ( ( ( rule__CLASS_ID__Alternatives ) ) ( ( rule__CLASS_ID__Alternatives )* ) )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:103:1: ( ( ( rule__CLASS_ID__Alternatives ) ) ( ( rule__CLASS_ID__Alternatives )* ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:104:1: ( ( rule__CLASS_ID__Alternatives ) ) ( ( rule__CLASS_ID__Alternatives )* )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:104:1: ( ( rule__CLASS_ID__Alternatives ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:105:1: ( rule__CLASS_ID__Alternatives )
            {
             before(grammarAccess.getCLASS_IDAccess().getAlternatives()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:106:1: ( rule__CLASS_ID__Alternatives )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:106:2: rule__CLASS_ID__Alternatives
            {
            pushFollow(FOLLOW_rule__CLASS_ID__Alternatives_in_ruleCLASS_ID157);
            rule__CLASS_ID__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getCLASS_IDAccess().getAlternatives()); 

            }

            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:109:1: ( ( rule__CLASS_ID__Alternatives )* )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:110:1: ( rule__CLASS_ID__Alternatives )*
            {
             before(grammarAccess.getCLASS_IDAccess().getAlternatives()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:111:1: ( rule__CLASS_ID__Alternatives )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||(LA2_0>=10 && LA2_0<=14)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:111:2: rule__CLASS_ID__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__CLASS_ID__Alternatives_in_ruleCLASS_ID169);
            	    rule__CLASS_ID__Alternatives();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getCLASS_IDAccess().getAlternatives()); 

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
    // $ANTLR end ruleCLASS_ID


    // $ANTLR start entryRulePLACEHOLDERB
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:126:1: entryRulePLACEHOLDERB : rulePLACEHOLDERB EOF ;
    public final void entryRulePLACEHOLDERB() throws RecognitionException {
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:127:1: ( rulePLACEHOLDERB EOF )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:128:1: rulePLACEHOLDERB EOF
            {
             before(grammarAccess.getPLACEHOLDERBRule()); 
            pushFollow(FOLLOW_rulePLACEHOLDERB_in_entryRulePLACEHOLDERB201);
            rulePLACEHOLDERB();
            _fsp--;

             after(grammarAccess.getPLACEHOLDERBRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePLACEHOLDERB208); 

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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:135:1: rulePLACEHOLDERB : ( ( rule__PLACEHOLDERB__Alternatives ) ) ;
    public final void rulePLACEHOLDERB() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:139:2: ( ( ( rule__PLACEHOLDERB__Alternatives ) ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:140:1: ( ( rule__PLACEHOLDERB__Alternatives ) )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:140:1: ( ( rule__PLACEHOLDERB__Alternatives ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:141:1: ( rule__PLACEHOLDERB__Alternatives )
            {
             before(grammarAccess.getPLACEHOLDERBAccess().getAlternatives()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:142:1: ( rule__PLACEHOLDERB__Alternatives )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:142:2: rule__PLACEHOLDERB__Alternatives
            {
            pushFollow(FOLLOW_rule__PLACEHOLDERB__Alternatives_in_rulePLACEHOLDERB234);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:154:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:155:1: ( ruleAbstractElement EOF )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:156:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement261);
            ruleAbstractElement();
            _fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement268); 

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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:163:1: ruleAbstractElement : ( rulePart ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:167:2: ( ( rulePart ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:168:1: ( rulePart )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:168:1: ( rulePart )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:169:1: rulePart
            {
             before(grammarAccess.getAbstractElementAccess().getPartParserRuleCall()); 
            pushFollow(FOLLOW_rulePart_in_ruleAbstractElement294);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:182:1: entryRulePart : rulePart EOF ;
    public final void entryRulePart() throws RecognitionException {
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:183:1: ( rulePart EOF )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:184:1: rulePart EOF
            {
             before(grammarAccess.getPartRule()); 
            pushFollow(FOLLOW_rulePart_in_entryRulePart320);
            rulePart();
            _fsp--;

             after(grammarAccess.getPartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePart327); 

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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:191:1: rulePart : ( ( rule__Part__Alternatives ) ) ;
    public final void rulePart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:195:2: ( ( ( rule__Part__Alternatives ) ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:196:1: ( ( rule__Part__Alternatives ) )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:196:1: ( ( rule__Part__Alternatives ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:197:1: ( rule__Part__Alternatives )
            {
             before(grammarAccess.getPartAccess().getAlternatives()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:198:1: ( rule__Part__Alternatives )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:198:2: rule__Part__Alternatives
            {
            pushFollow(FOLLOW_rule__Part__Alternatives_in_rulePart353);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:210:1: entryRuleBundle : ruleBundle EOF ;
    public final void entryRuleBundle() throws RecognitionException {
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:211:1: ( ruleBundle EOF )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:212:1: ruleBundle EOF
            {
             before(grammarAccess.getBundleRule()); 
            pushFollow(FOLLOW_ruleBundle_in_entryRuleBundle380);
            ruleBundle();
            _fsp--;

             after(grammarAccess.getBundleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundle387); 

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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:219:1: ruleBundle : ( ( rule__Bundle__Group__0 ) ) ;
    public final void ruleBundle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:223:2: ( ( ( rule__Bundle__Group__0 ) ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:224:1: ( ( rule__Bundle__Group__0 ) )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:224:1: ( ( rule__Bundle__Group__0 ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:225:1: ( rule__Bundle__Group__0 )
            {
             before(grammarAccess.getBundleAccess().getGroup()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:226:1: ( rule__Bundle__Group__0 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:226:2: rule__Bundle__Group__0
            {
            pushFollow(FOLLOW_rule__Bundle__Group__0_in_ruleBundle413);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:238:1: entryRuleBody : ruleBody EOF ;
    public final void entryRuleBody() throws RecognitionException {
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:239:1: ( ruleBody EOF )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:240:1: ruleBody EOF
            {
             before(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody440);
            ruleBody();
            _fsp--;

             after(grammarAccess.getBodyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody447); 

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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:247:1: ruleBody : ( ( rule__Body__Group__0 ) ) ;
    public final void ruleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:251:2: ( ( ( rule__Body__Group__0 ) ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:252:1: ( ( rule__Body__Group__0 ) )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:252:1: ( ( rule__Body__Group__0 ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:253:1: ( rule__Body__Group__0 )
            {
             before(grammarAccess.getBodyAccess().getGroup()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:254:1: ( rule__Body__Group__0 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:254:2: rule__Body__Group__0
            {
            pushFollow(FOLLOW_rule__Body__Group__0_in_ruleBody473);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:266:1: entryRuleBodyFunction : ruleBodyFunction EOF ;
    public final void entryRuleBodyFunction() throws RecognitionException {
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:267:1: ( ruleBodyFunction EOF )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:268:1: ruleBodyFunction EOF
            {
             before(grammarAccess.getBodyFunctionRule()); 
            pushFollow(FOLLOW_ruleBodyFunction_in_entryRuleBodyFunction500);
            ruleBodyFunction();
            _fsp--;

             after(grammarAccess.getBodyFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyFunction507); 

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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:275:1: ruleBodyFunction : ( ( rule__BodyFunction__Group__0 ) ) ;
    public final void ruleBodyFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:279:2: ( ( ( rule__BodyFunction__Group__0 ) ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:280:1: ( ( rule__BodyFunction__Group__0 ) )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:280:1: ( ( rule__BodyFunction__Group__0 ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:281:1: ( rule__BodyFunction__Group__0 )
            {
             before(grammarAccess.getBodyFunctionAccess().getGroup()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:282:1: ( rule__BodyFunction__Group__0 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:282:2: rule__BodyFunction__Group__0
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group__0_in_ruleBodyFunction533);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:294:1: entryRuleSpecialFunction : ruleSpecialFunction EOF ;
    public final void entryRuleSpecialFunction() throws RecognitionException {
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:295:1: ( ruleSpecialFunction EOF )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:296:1: ruleSpecialFunction EOF
            {
             before(grammarAccess.getSpecialFunctionRule()); 
            pushFollow(FOLLOW_ruleSpecialFunction_in_entryRuleSpecialFunction560);
            ruleSpecialFunction();
            _fsp--;

             after(grammarAccess.getSpecialFunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecialFunction567); 

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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:303:1: ruleSpecialFunction : ( ( rule__SpecialFunction__Group__0 ) ) ;
    public final void ruleSpecialFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:307:2: ( ( ( rule__SpecialFunction__Group__0 ) ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:308:1: ( ( rule__SpecialFunction__Group__0 ) )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:308:1: ( ( rule__SpecialFunction__Group__0 ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:309:1: ( rule__SpecialFunction__Group__0 )
            {
             before(grammarAccess.getSpecialFunctionAccess().getGroup()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:310:1: ( rule__SpecialFunction__Group__0 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:310:2: rule__SpecialFunction__Group__0
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__0_in_ruleSpecialFunction593);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:322:1: entryRuleBundlePromiseType : ruleBundlePromiseType EOF ;
    public final void entryRuleBundlePromiseType() throws RecognitionException {
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:323:1: ( ruleBundlePromiseType EOF )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:324:1: ruleBundlePromiseType EOF
            {
             before(grammarAccess.getBundlePromiseTypeRule()); 
            pushFollow(FOLLOW_ruleBundlePromiseType_in_entryRuleBundlePromiseType620);
            ruleBundlePromiseType();
            _fsp--;

             after(grammarAccess.getBundlePromiseTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundlePromiseType627); 

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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:331:1: ruleBundlePromiseType : ( ( rule__BundlePromiseType__NameAssignment ) ) ;
    public final void ruleBundlePromiseType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:335:2: ( ( ( rule__BundlePromiseType__NameAssignment ) ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:336:1: ( ( rule__BundlePromiseType__NameAssignment ) )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:336:1: ( ( rule__BundlePromiseType__NameAssignment ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:337:1: ( rule__BundlePromiseType__NameAssignment )
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getNameAssignment()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:338:1: ( rule__BundlePromiseType__NameAssignment )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:338:2: rule__BundlePromiseType__NameAssignment
            {
            pushFollow(FOLLOW_rule__BundlePromiseType__NameAssignment_in_ruleBundlePromiseType653);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:350:1: entryRuleBodyPromiseType : ruleBodyPromiseType EOF ;
    public final void entryRuleBodyPromiseType() throws RecognitionException {
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:351:1: ( ruleBodyPromiseType EOF )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:352:1: ruleBodyPromiseType EOF
            {
             before(grammarAccess.getBodyPromiseTypeRule()); 
            pushFollow(FOLLOW_ruleBodyPromiseType_in_entryRuleBodyPromiseType680);
            ruleBodyPromiseType();
            _fsp--;

             after(grammarAccess.getBodyPromiseTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyPromiseType687); 

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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:359:1: ruleBodyPromiseType : ( ( rule__BodyPromiseType__NameAssignment ) ) ;
    public final void ruleBodyPromiseType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:363:2: ( ( ( rule__BodyPromiseType__NameAssignment ) ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:364:1: ( ( rule__BodyPromiseType__NameAssignment ) )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:364:1: ( ( rule__BodyPromiseType__NameAssignment ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:365:1: ( rule__BodyPromiseType__NameAssignment )
            {
             before(grammarAccess.getBodyPromiseTypeAccess().getNameAssignment()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:366:1: ( rule__BodyPromiseType__NameAssignment )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:366:2: rule__BodyPromiseType__NameAssignment
            {
            pushFollow(FOLLOW_rule__BodyPromiseType__NameAssignment_in_ruleBodyPromiseType713);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:378:1: entryRuleBundleComponent : ruleBundleComponent EOF ;
    public final void entryRuleBundleComponent() throws RecognitionException {
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:379:1: ( ruleBundleComponent EOF )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:380:1: ruleBundleComponent EOF
            {
             before(grammarAccess.getBundleComponentRule()); 
            pushFollow(FOLLOW_ruleBundleComponent_in_entryRuleBundleComponent740);
            ruleBundleComponent();
            _fsp--;

             after(grammarAccess.getBundleComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBundleComponent747); 

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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:387:1: ruleBundleComponent : ( ( rule__BundleComponent__NameAssignment ) ) ;
    public final void ruleBundleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:391:2: ( ( ( rule__BundleComponent__NameAssignment ) ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:392:1: ( ( rule__BundleComponent__NameAssignment ) )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:392:1: ( ( rule__BundleComponent__NameAssignment ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:393:1: ( rule__BundleComponent__NameAssignment )
            {
             before(grammarAccess.getBundleComponentAccess().getNameAssignment()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:394:1: ( rule__BundleComponent__NameAssignment )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:394:2: rule__BundleComponent__NameAssignment
            {
            pushFollow(FOLLOW_rule__BundleComponent__NameAssignment_in_ruleBundleComponent773);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:406:1: entryRuleBodyComponent : ruleBodyComponent EOF ;
    public final void entryRuleBodyComponent() throws RecognitionException {
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:407:1: ( ruleBodyComponent EOF )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:408:1: ruleBodyComponent EOF
            {
             before(grammarAccess.getBodyComponentRule()); 
            pushFollow(FOLLOW_ruleBodyComponent_in_entryRuleBodyComponent800);
            ruleBodyComponent();
            _fsp--;

             after(grammarAccess.getBodyComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyComponent807); 

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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:415:1: ruleBodyComponent : ( ( rule__BodyComponent__NameAssignment ) ) ;
    public final void ruleBodyComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:419:2: ( ( ( rule__BodyComponent__NameAssignment ) ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:420:1: ( ( rule__BodyComponent__NameAssignment ) )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:420:1: ( ( rule__BodyComponent__NameAssignment ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:421:1: ( rule__BodyComponent__NameAssignment )
            {
             before(grammarAccess.getBodyComponentAccess().getNameAssignment()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:422:1: ( rule__BodyComponent__NameAssignment )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:422:2: rule__BodyComponent__NameAssignment
            {
            pushFollow(FOLLOW_rule__BodyComponent__NameAssignment_in_ruleBodyComponent833);
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


    // $ANTLR start entryRuleBodyClass
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:434:1: entryRuleBodyClass : ruleBodyClass EOF ;
    public final void entryRuleBodyClass() throws RecognitionException {
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:435:1: ( ruleBodyClass EOF )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:436:1: ruleBodyClass EOF
            {
             before(grammarAccess.getBodyClassRule()); 
            pushFollow(FOLLOW_ruleBodyClass_in_entryRuleBodyClass860);
            ruleBodyClass();
            _fsp--;

             after(grammarAccess.getBodyClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBodyClass867); 

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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:443:1: ruleBodyClass : ( ( rule__BodyClass__Group__0 ) ) ;
    public final void ruleBodyClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:447:2: ( ( ( rule__BodyClass__Group__0 ) ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:448:1: ( ( rule__BodyClass__Group__0 ) )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:448:1: ( ( rule__BodyClass__Group__0 ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:449:1: ( rule__BodyClass__Group__0 )
            {
             before(grammarAccess.getBodyClassAccess().getGroup()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:450:1: ( rule__BodyClass__Group__0 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:450:2: rule__BodyClass__Group__0
            {
            pushFollow(FOLLOW_rule__BodyClass__Group__0_in_ruleBodyClass893);
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


    // $ANTLR start rule__CLASS_ID__Alternatives
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:462:1: rule__CLASS_ID__Alternatives : ( ( RULE_ID ) | ( '(' ) | ( ')' ) | ( '|' ) | ( '!' ) | ( '.' ) );
    public final void rule__CLASS_ID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:466:1: ( ( RULE_ID ) | ( '(' ) | ( ')' ) | ( '|' ) | ( '!' ) | ( '.' ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 10:
                {
                alt3=2;
                }
                break;
            case 11:
                {
                alt3=3;
                }
                break;
            case 12:
                {
                alt3=4;
                }
                break;
            case 13:
                {
                alt3=5;
                }
                break;
            case 14:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("462:1: rule__CLASS_ID__Alternatives : ( ( RULE_ID ) | ( '(' ) | ( ')' ) | ( '|' ) | ( '!' ) | ( '.' ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:467:1: ( RULE_ID )
                    {
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:467:1: ( RULE_ID )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:468:1: RULE_ID
                    {
                     before(grammarAccess.getCLASS_IDAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CLASS_ID__Alternatives929); 
                     after(grammarAccess.getCLASS_IDAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:473:6: ( '(' )
                    {
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:473:6: ( '(' )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:474:1: '('
                    {
                     before(grammarAccess.getCLASS_IDAccess().getLeftParenthesisKeyword_1()); 
                    match(input,10,FOLLOW_10_in_rule__CLASS_ID__Alternatives947); 
                     after(grammarAccess.getCLASS_IDAccess().getLeftParenthesisKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:481:6: ( ')' )
                    {
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:481:6: ( ')' )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:482:1: ')'
                    {
                     before(grammarAccess.getCLASS_IDAccess().getRightParenthesisKeyword_2()); 
                    match(input,11,FOLLOW_11_in_rule__CLASS_ID__Alternatives967); 
                     after(grammarAccess.getCLASS_IDAccess().getRightParenthesisKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:489:6: ( '|' )
                    {
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:489:6: ( '|' )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:490:1: '|'
                    {
                     before(grammarAccess.getCLASS_IDAccess().getVerticalLineKeyword_3()); 
                    match(input,12,FOLLOW_12_in_rule__CLASS_ID__Alternatives987); 
                     after(grammarAccess.getCLASS_IDAccess().getVerticalLineKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:497:6: ( '!' )
                    {
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:497:6: ( '!' )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:498:1: '!'
                    {
                     before(grammarAccess.getCLASS_IDAccess().getExclamationMarkKeyword_4()); 
                    match(input,13,FOLLOW_13_in_rule__CLASS_ID__Alternatives1007); 
                     after(grammarAccess.getCLASS_IDAccess().getExclamationMarkKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:505:6: ( '.' )
                    {
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:505:6: ( '.' )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:506:1: '.'
                    {
                     before(grammarAccess.getCLASS_IDAccess().getFullStopKeyword_5()); 
                    match(input,14,FOLLOW_14_in_rule__CLASS_ID__Alternatives1027); 
                     after(grammarAccess.getCLASS_IDAccess().getFullStopKeyword_5()); 

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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:519:1: rule__PLACEHOLDERB__Alternatives : ( ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( RULE_STRING ) | ( '=>' ) | ( ';' ) | ( ',' ) | ( '(' ) | ( ')' ) );
    public final void rule__PLACEHOLDERB__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:523:1: ( ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( RULE_STRING ) | ( '=>' ) | ( ';' ) | ( ',' ) | ( '(' ) | ( ')' ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case RULE_ANY_OTHER:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case RULE_STRING:
                {
                alt4=3;
                }
                break;
            case 15:
                {
                alt4=4;
                }
                break;
            case 16:
                {
                alt4=5;
                }
                break;
            case 17:
                {
                alt4=6;
                }
                break;
            case 10:
                {
                alt4=7;
                }
                break;
            case 11:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("519:1: rule__PLACEHOLDERB__Alternatives : ( ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( RULE_STRING ) | ( '=>' ) | ( ';' ) | ( ',' ) | ( '(' ) | ( ')' ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:524:1: ( RULE_ANY_OTHER )
                    {
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:524:1: ( RULE_ANY_OTHER )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:525:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getPLACEHOLDERBAccess().getANY_OTHERTerminalRuleCall_0()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__PLACEHOLDERB__Alternatives1062); 
                     after(grammarAccess.getPLACEHOLDERBAccess().getANY_OTHERTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:530:6: ( RULE_ID )
                    {
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:530:6: ( RULE_ID )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:531:1: RULE_ID
                    {
                     before(grammarAccess.getPLACEHOLDERBAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PLACEHOLDERB__Alternatives1079); 
                     after(grammarAccess.getPLACEHOLDERBAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:536:6: ( RULE_STRING )
                    {
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:536:6: ( RULE_STRING )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:537:1: RULE_STRING
                    {
                     before(grammarAccess.getPLACEHOLDERBAccess().getSTRINGTerminalRuleCall_2()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PLACEHOLDERB__Alternatives1096); 
                     after(grammarAccess.getPLACEHOLDERBAccess().getSTRINGTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:542:6: ( '=>' )
                    {
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:542:6: ( '=>' )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:543:1: '=>'
                    {
                     before(grammarAccess.getPLACEHOLDERBAccess().getEqualsSignGreaterThanSignKeyword_3()); 
                    match(input,15,FOLLOW_15_in_rule__PLACEHOLDERB__Alternatives1114); 
                     after(grammarAccess.getPLACEHOLDERBAccess().getEqualsSignGreaterThanSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:550:6: ( ';' )
                    {
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:550:6: ( ';' )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:551:1: ';'
                    {
                     before(grammarAccess.getPLACEHOLDERBAccess().getSemicolonKeyword_4()); 
                    match(input,16,FOLLOW_16_in_rule__PLACEHOLDERB__Alternatives1134); 
                     after(grammarAccess.getPLACEHOLDERBAccess().getSemicolonKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:558:6: ( ',' )
                    {
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:558:6: ( ',' )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:559:1: ','
                    {
                     before(grammarAccess.getPLACEHOLDERBAccess().getCommaKeyword_5()); 
                    match(input,17,FOLLOW_17_in_rule__PLACEHOLDERB__Alternatives1154); 
                     after(grammarAccess.getPLACEHOLDERBAccess().getCommaKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:566:6: ( '(' )
                    {
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:566:6: ( '(' )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:567:1: '('
                    {
                     before(grammarAccess.getPLACEHOLDERBAccess().getLeftParenthesisKeyword_6()); 
                    match(input,10,FOLLOW_10_in_rule__PLACEHOLDERB__Alternatives1174); 
                     after(grammarAccess.getPLACEHOLDERBAccess().getLeftParenthesisKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:574:6: ( ')' )
                    {
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:574:6: ( ')' )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:575:1: ')'
                    {
                     before(grammarAccess.getPLACEHOLDERBAccess().getRightParenthesisKeyword_7()); 
                    match(input,11,FOLLOW_11_in_rule__PLACEHOLDERB__Alternatives1194); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:587:1: rule__Part__Alternatives : ( ( ruleBundle ) | ( ruleBody ) );
    public final void rule__Part__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:591:1: ( ( ruleBundle ) | ( ruleBody ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==23) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("587:1: rule__Part__Alternatives : ( ( ruleBundle ) | ( ruleBody ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:592:1: ( ruleBundle )
                    {
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:592:1: ( ruleBundle )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:593:1: ruleBundle
                    {
                     before(grammarAccess.getPartAccess().getBundleParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBundle_in_rule__Part__Alternatives1228);
                    ruleBundle();
                    _fsp--;

                     after(grammarAccess.getPartAccess().getBundleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:598:6: ( ruleBody )
                    {
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:598:6: ( ruleBody )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:599:1: ruleBody
                    {
                     before(grammarAccess.getPartAccess().getBodyParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBody_in_rule__Part__Alternatives1245);
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


    // $ANTLR start rule__Bundle__Alternatives_5_2
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:609:1: rule__Bundle__Alternatives_5_2 : ( ( rulePLACEHOLDERB ) | ( ( rule__Bundle__Group_5_2_1__0 ) ) );
    public final void rule__Bundle__Alternatives_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:613:1: ( ( rulePLACEHOLDERB ) | ( ( rule__Bundle__Group_5_2_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_STRING)||(LA6_0>=10 && LA6_0<=11)||(LA6_0>=15 && LA6_0<=17)) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("609:1: rule__Bundle__Alternatives_5_2 : ( ( rulePLACEHOLDERB ) | ( ( rule__Bundle__Group_5_2_1__0 ) ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:614:1: ( rulePLACEHOLDERB )
                    {
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:614:1: ( rulePLACEHOLDERB )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:615:1: rulePLACEHOLDERB
                    {
                     before(grammarAccess.getBundleAccess().getPLACEHOLDERBParserRuleCall_5_2_0()); 
                    pushFollow(FOLLOW_rulePLACEHOLDERB_in_rule__Bundle__Alternatives_5_21277);
                    rulePLACEHOLDERB();
                    _fsp--;

                     after(grammarAccess.getBundleAccess().getPLACEHOLDERBParserRuleCall_5_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:620:6: ( ( rule__Bundle__Group_5_2_1__0 ) )
                    {
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:620:6: ( ( rule__Bundle__Group_5_2_1__0 ) )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:621:1: ( rule__Bundle__Group_5_2_1__0 )
                    {
                     before(grammarAccess.getBundleAccess().getGroup_5_2_1()); 
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:622:1: ( rule__Bundle__Group_5_2_1__0 )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:622:2: rule__Bundle__Group_5_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Bundle__Group_5_2_1__0_in_rule__Bundle__Alternatives_5_21294);
                    rule__Bundle__Group_5_2_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBundleAccess().getGroup_5_2_1()); 

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
    // $ANTLR end rule__Bundle__Alternatives_5_2


    // $ANTLR start rule__BodyFunction__Alternatives_2
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:631:1: rule__BodyFunction__Alternatives_2 : ( ( ( rule__BodyFunction__ValuesAssignment_2_0 ) ) | ( ( rule__BodyFunction__Group_2_1__0 ) ) | ( ( rule__BodyFunction__FunctionAssignment_2_2 ) ) | ( ( rule__BodyFunction__Group_2_3__0 ) ) );
    public final void rule__BodyFunction__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:635:1: ( ( ( rule__BodyFunction__ValuesAssignment_2_0 ) ) | ( ( rule__BodyFunction__Group_2_1__0 ) ) | ( ( rule__BodyFunction__FunctionAssignment_2_2 ) ) | ( ( rule__BodyFunction__Group_2_3__0 ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt7=1;
                }
                break;
            case 19:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==RULE_STRING) ) {
                    alt7=2;
                }
                else if ( (LA7_2==22) ) {
                    alt7=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("631:1: rule__BodyFunction__Alternatives_2 : ( ( ( rule__BodyFunction__ValuesAssignment_2_0 ) ) | ( ( rule__BodyFunction__Group_2_1__0 ) ) | ( ( rule__BodyFunction__FunctionAssignment_2_2 ) ) | ( ( rule__BodyFunction__Group_2_3__0 ) ) );", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("631:1: rule__BodyFunction__Alternatives_2 : ( ( ( rule__BodyFunction__ValuesAssignment_2_0 ) ) | ( ( rule__BodyFunction__Group_2_1__0 ) ) | ( ( rule__BodyFunction__FunctionAssignment_2_2 ) ) | ( ( rule__BodyFunction__Group_2_3__0 ) ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:636:1: ( ( rule__BodyFunction__ValuesAssignment_2_0 ) )
                    {
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:636:1: ( ( rule__BodyFunction__ValuesAssignment_2_0 ) )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:637:1: ( rule__BodyFunction__ValuesAssignment_2_0 )
                    {
                     before(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_0()); 
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:638:1: ( rule__BodyFunction__ValuesAssignment_2_0 )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:638:2: rule__BodyFunction__ValuesAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__BodyFunction__ValuesAssignment_2_0_in_rule__BodyFunction__Alternatives_21327);
                    rule__BodyFunction__ValuesAssignment_2_0();
                    _fsp--;


                    }

                     after(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:642:6: ( ( rule__BodyFunction__Group_2_1__0 ) )
                    {
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:642:6: ( ( rule__BodyFunction__Group_2_1__0 ) )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:643:1: ( rule__BodyFunction__Group_2_1__0 )
                    {
                     before(grammarAccess.getBodyFunctionAccess().getGroup_2_1()); 
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:644:1: ( rule__BodyFunction__Group_2_1__0 )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:644:2: rule__BodyFunction__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__0_in_rule__BodyFunction__Alternatives_21345);
                    rule__BodyFunction__Group_2_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getBodyFunctionAccess().getGroup_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:648:6: ( ( rule__BodyFunction__FunctionAssignment_2_2 ) )
                    {
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:648:6: ( ( rule__BodyFunction__FunctionAssignment_2_2 ) )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:649:1: ( rule__BodyFunction__FunctionAssignment_2_2 )
                    {
                     before(grammarAccess.getBodyFunctionAccess().getFunctionAssignment_2_2()); 
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:650:1: ( rule__BodyFunction__FunctionAssignment_2_2 )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:650:2: rule__BodyFunction__FunctionAssignment_2_2
                    {
                    pushFollow(FOLLOW_rule__BodyFunction__FunctionAssignment_2_2_in_rule__BodyFunction__Alternatives_21363);
                    rule__BodyFunction__FunctionAssignment_2_2();
                    _fsp--;


                    }

                     after(grammarAccess.getBodyFunctionAccess().getFunctionAssignment_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:654:6: ( ( rule__BodyFunction__Group_2_3__0 ) )
                    {
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:654:6: ( ( rule__BodyFunction__Group_2_3__0 ) )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:655:1: ( rule__BodyFunction__Group_2_3__0 )
                    {
                     before(grammarAccess.getBodyFunctionAccess().getGroup_2_3()); 
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:656:1: ( rule__BodyFunction__Group_2_3__0 )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:656:2: rule__BodyFunction__Group_2_3__0
                    {
                    pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__0_in_rule__BodyFunction__Alternatives_21381);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:665:1: rule__SpecialFunction__Alternatives_2 : ( ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( ',' ) | ( ( rule__SpecialFunction__Group_2_5__0 ) ) | ( ( rule__SpecialFunction__Group_2_6__0 ) ) | ( ( rule__SpecialFunction__FuncAssignment_2_7 ) ) );
    public final void rule__SpecialFunction__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:669:1: ( ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( ',' ) | ( ( rule__SpecialFunction__Group_2_5__0 ) ) | ( ( rule__SpecialFunction__Group_2_6__0 ) ) | ( ( rule__SpecialFunction__FuncAssignment_2_7 ) ) )
            int alt8=8;
            switch ( input.LA(1) ) {
            case RULE_ANY_OTHER:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                int LA8_2 = input.LA(2);

                if ( ((LA8_2>=RULE_ID && LA8_2<=RULE_INT)||LA8_2==11||LA8_2==17||(LA8_2>=24 && LA8_2<=25)) ) {
                    alt8=2;
                }
                else if ( (LA8_2==10) ) {
                    alt8=8;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("665:1: rule__SpecialFunction__Alternatives_2 : ( ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( ',' ) | ( ( rule__SpecialFunction__Group_2_5__0 ) ) | ( ( rule__SpecialFunction__Group_2_6__0 ) ) | ( ( rule__SpecialFunction__FuncAssignment_2_7 ) ) );", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt8=3;
                }
                break;
            case RULE_INT:
                {
                alt8=4;
                }
                break;
            case 17:
                {
                alt8=5;
                }
                break;
            case 24:
                {
                alt8=6;
                }
                break;
            case 25:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("665:1: rule__SpecialFunction__Alternatives_2 : ( ( RULE_ANY_OTHER ) | ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( ',' ) | ( ( rule__SpecialFunction__Group_2_5__0 ) ) | ( ( rule__SpecialFunction__Group_2_6__0 ) ) | ( ( rule__SpecialFunction__FuncAssignment_2_7 ) ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:670:1: ( RULE_ANY_OTHER )
                    {
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:670:1: ( RULE_ANY_OTHER )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:671:1: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getANY_OTHERTerminalRuleCall_2_0()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__SpecialFunction__Alternatives_21414); 
                     after(grammarAccess.getSpecialFunctionAccess().getANY_OTHERTerminalRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:676:6: ( RULE_ID )
                    {
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:676:6: ( RULE_ID )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:677:1: RULE_ID
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SpecialFunction__Alternatives_21431); 
                     after(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:682:6: ( RULE_STRING )
                    {
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:682:6: ( RULE_STRING )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:683:1: RULE_STRING
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getSTRINGTerminalRuleCall_2_2()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SpecialFunction__Alternatives_21448); 
                     after(grammarAccess.getSpecialFunctionAccess().getSTRINGTerminalRuleCall_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:688:6: ( RULE_INT )
                    {
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:688:6: ( RULE_INT )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:689:1: RULE_INT
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getINTTerminalRuleCall_2_3()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SpecialFunction__Alternatives_21465); 
                     after(grammarAccess.getSpecialFunctionAccess().getINTTerminalRuleCall_2_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:694:6: ( ',' )
                    {
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:694:6: ( ',' )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:695:1: ','
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getCommaKeyword_2_4()); 
                    match(input,17,FOLLOW_17_in_rule__SpecialFunction__Alternatives_21483); 
                     after(grammarAccess.getSpecialFunctionAccess().getCommaKeyword_2_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:702:6: ( ( rule__SpecialFunction__Group_2_5__0 ) )
                    {
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:702:6: ( ( rule__SpecialFunction__Group_2_5__0 ) )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:703:1: ( rule__SpecialFunction__Group_2_5__0 )
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getGroup_2_5()); 
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:704:1: ( rule__SpecialFunction__Group_2_5__0 )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:704:2: rule__SpecialFunction__Group_2_5__0
                    {
                    pushFollow(FOLLOW_rule__SpecialFunction__Group_2_5__0_in_rule__SpecialFunction__Alternatives_21502);
                    rule__SpecialFunction__Group_2_5__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSpecialFunctionAccess().getGroup_2_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:708:6: ( ( rule__SpecialFunction__Group_2_6__0 ) )
                    {
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:708:6: ( ( rule__SpecialFunction__Group_2_6__0 ) )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:709:1: ( rule__SpecialFunction__Group_2_6__0 )
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getGroup_2_6()); 
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:710:1: ( rule__SpecialFunction__Group_2_6__0 )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:710:2: rule__SpecialFunction__Group_2_6__0
                    {
                    pushFollow(FOLLOW_rule__SpecialFunction__Group_2_6__0_in_rule__SpecialFunction__Alternatives_21520);
                    rule__SpecialFunction__Group_2_6__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSpecialFunctionAccess().getGroup_2_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:714:6: ( ( rule__SpecialFunction__FuncAssignment_2_7 ) )
                    {
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:714:6: ( ( rule__SpecialFunction__FuncAssignment_2_7 ) )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:715:1: ( rule__SpecialFunction__FuncAssignment_2_7 )
                    {
                     before(grammarAccess.getSpecialFunctionAccess().getFuncAssignment_2_7()); 
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:716:1: ( rule__SpecialFunction__FuncAssignment_2_7 )
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:716:2: rule__SpecialFunction__FuncAssignment_2_7
                    {
                    pushFollow(FOLLOW_rule__SpecialFunction__FuncAssignment_2_7_in_rule__SpecialFunction__Alternatives_21538);
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


    // $ANTLR start rule__Bundle__Group__0
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:727:1: rule__Bundle__Group__0 : rule__Bundle__Group__0__Impl rule__Bundle__Group__1 ;
    public final void rule__Bundle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:731:1: ( rule__Bundle__Group__0__Impl rule__Bundle__Group__1 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:732:2: rule__Bundle__Group__0__Impl rule__Bundle__Group__1
            {
            pushFollow(FOLLOW_rule__Bundle__Group__0__Impl_in_rule__Bundle__Group__01569);
            rule__Bundle__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__1_in_rule__Bundle__Group__01572);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:739:1: rule__Bundle__Group__0__Impl : ( 'bundle' ) ;
    public final void rule__Bundle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:743:1: ( ( 'bundle' ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:744:1: ( 'bundle' )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:744:1: ( 'bundle' )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:745:1: 'bundle'
            {
             before(grammarAccess.getBundleAccess().getBundleKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Bundle__Group__0__Impl1600); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:758:1: rule__Bundle__Group__1 : rule__Bundle__Group__1__Impl rule__Bundle__Group__2 ;
    public final void rule__Bundle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:762:1: ( rule__Bundle__Group__1__Impl rule__Bundle__Group__2 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:763:2: rule__Bundle__Group__1__Impl rule__Bundle__Group__2
            {
            pushFollow(FOLLOW_rule__Bundle__Group__1__Impl_in_rule__Bundle__Group__11631);
            rule__Bundle__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__2_in_rule__Bundle__Group__11634);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:770:1: rule__Bundle__Group__1__Impl : ( ( rule__Bundle__ComponentAssignment_1 ) ) ;
    public final void rule__Bundle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:774:1: ( ( ( rule__Bundle__ComponentAssignment_1 ) ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:775:1: ( ( rule__Bundle__ComponentAssignment_1 ) )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:775:1: ( ( rule__Bundle__ComponentAssignment_1 ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:776:1: ( rule__Bundle__ComponentAssignment_1 )
            {
             before(grammarAccess.getBundleAccess().getComponentAssignment_1()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:777:1: ( rule__Bundle__ComponentAssignment_1 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:777:2: rule__Bundle__ComponentAssignment_1
            {
            pushFollow(FOLLOW_rule__Bundle__ComponentAssignment_1_in_rule__Bundle__Group__1__Impl1661);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:787:1: rule__Bundle__Group__2 : rule__Bundle__Group__2__Impl rule__Bundle__Group__3 ;
    public final void rule__Bundle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:791:1: ( rule__Bundle__Group__2__Impl rule__Bundle__Group__3 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:792:2: rule__Bundle__Group__2__Impl rule__Bundle__Group__3
            {
            pushFollow(FOLLOW_rule__Bundle__Group__2__Impl_in_rule__Bundle__Group__21691);
            rule__Bundle__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__3_in_rule__Bundle__Group__21694);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:799:1: rule__Bundle__Group__2__Impl : ( ( rule__Bundle__NameAssignment_2 ) ) ;
    public final void rule__Bundle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:803:1: ( ( ( rule__Bundle__NameAssignment_2 ) ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:804:1: ( ( rule__Bundle__NameAssignment_2 ) )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:804:1: ( ( rule__Bundle__NameAssignment_2 ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:805:1: ( rule__Bundle__NameAssignment_2 )
            {
             before(grammarAccess.getBundleAccess().getNameAssignment_2()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:806:1: ( rule__Bundle__NameAssignment_2 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:806:2: rule__Bundle__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Bundle__NameAssignment_2_in_rule__Bundle__Group__2__Impl1721);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:816:1: rule__Bundle__Group__3 : rule__Bundle__Group__3__Impl rule__Bundle__Group__4 ;
    public final void rule__Bundle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:820:1: ( rule__Bundle__Group__3__Impl rule__Bundle__Group__4 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:821:2: rule__Bundle__Group__3__Impl rule__Bundle__Group__4
            {
            pushFollow(FOLLOW_rule__Bundle__Group__3__Impl_in_rule__Bundle__Group__31751);
            rule__Bundle__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__4_in_rule__Bundle__Group__31754);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:828:1: rule__Bundle__Group__3__Impl : ( ( rulePLACEHOLDERB )* ) ;
    public final void rule__Bundle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:832:1: ( ( ( rulePLACEHOLDERB )* ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:833:1: ( ( rulePLACEHOLDERB )* )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:833:1: ( ( rulePLACEHOLDERB )* )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:834:1: ( rulePLACEHOLDERB )*
            {
             before(grammarAccess.getBundleAccess().getPLACEHOLDERBParserRuleCall_3()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:835:1: ( rulePLACEHOLDERB )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)||(LA9_0>=10 && LA9_0<=11)||(LA9_0>=15 && LA9_0<=17)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:835:3: rulePLACEHOLDERB
            	    {
            	    pushFollow(FOLLOW_rulePLACEHOLDERB_in_rule__Bundle__Group__3__Impl1782);
            	    rulePLACEHOLDERB();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:845:1: rule__Bundle__Group__4 : rule__Bundle__Group__4__Impl rule__Bundle__Group__5 ;
    public final void rule__Bundle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:849:1: ( rule__Bundle__Group__4__Impl rule__Bundle__Group__5 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:850:2: rule__Bundle__Group__4__Impl rule__Bundle__Group__5
            {
            pushFollow(FOLLOW_rule__Bundle__Group__4__Impl_in_rule__Bundle__Group__41813);
            rule__Bundle__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__5_in_rule__Bundle__Group__41816);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:857:1: rule__Bundle__Group__4__Impl : ( '{' ) ;
    public final void rule__Bundle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:861:1: ( ( '{' ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:862:1: ( '{' )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:862:1: ( '{' )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:863:1: '{'
            {
             before(grammarAccess.getBundleAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Bundle__Group__4__Impl1844); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:876:1: rule__Bundle__Group__5 : rule__Bundle__Group__5__Impl rule__Bundle__Group__6 ;
    public final void rule__Bundle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:880:1: ( rule__Bundle__Group__5__Impl rule__Bundle__Group__6 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:881:2: rule__Bundle__Group__5__Impl rule__Bundle__Group__6
            {
            pushFollow(FOLLOW_rule__Bundle__Group__5__Impl_in_rule__Bundle__Group__51875);
            rule__Bundle__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group__6_in_rule__Bundle__Group__51878);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:888:1: rule__Bundle__Group__5__Impl : ( ( rule__Bundle__Group_5__0 )* ) ;
    public final void rule__Bundle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:892:1: ( ( ( rule__Bundle__Group_5__0 )* ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:893:1: ( ( rule__Bundle__Group_5__0 )* )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:893:1: ( ( rule__Bundle__Group_5__0 )* )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:894:1: ( rule__Bundle__Group_5__0 )*
            {
             before(grammarAccess.getBundleAccess().getGroup_5()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:895:1: ( rule__Bundle__Group_5__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:895:2: rule__Bundle__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Bundle__Group_5__0_in_rule__Bundle__Group__5__Impl1905);
            	    rule__Bundle__Group_5__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:905:1: rule__Bundle__Group__6 : rule__Bundle__Group__6__Impl ;
    public final void rule__Bundle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:909:1: ( rule__Bundle__Group__6__Impl )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:910:2: rule__Bundle__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Bundle__Group__6__Impl_in_rule__Bundle__Group__61936);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:916:1: rule__Bundle__Group__6__Impl : ( '}' ) ;
    public final void rule__Bundle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:920:1: ( ( '}' ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:921:1: ( '}' )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:921:1: ( '}' )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:922:1: '}'
            {
             before(grammarAccess.getBundleAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_20_in_rule__Bundle__Group__6__Impl1964); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:949:1: rule__Bundle__Group_5__0 : rule__Bundle__Group_5__0__Impl rule__Bundle__Group_5__1 ;
    public final void rule__Bundle__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:953:1: ( rule__Bundle__Group_5__0__Impl rule__Bundle__Group_5__1 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:954:2: rule__Bundle__Group_5__0__Impl rule__Bundle__Group_5__1
            {
            pushFollow(FOLLOW_rule__Bundle__Group_5__0__Impl_in_rule__Bundle__Group_5__02009);
            rule__Bundle__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group_5__1_in_rule__Bundle__Group_5__02012);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:961:1: rule__Bundle__Group_5__0__Impl : ( ( rule__Bundle__PromiseTypeAssignment_5_0 ) ) ;
    public final void rule__Bundle__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:965:1: ( ( ( rule__Bundle__PromiseTypeAssignment_5_0 ) ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:966:1: ( ( rule__Bundle__PromiseTypeAssignment_5_0 ) )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:966:1: ( ( rule__Bundle__PromiseTypeAssignment_5_0 ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:967:1: ( rule__Bundle__PromiseTypeAssignment_5_0 )
            {
             before(grammarAccess.getBundleAccess().getPromiseTypeAssignment_5_0()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:968:1: ( rule__Bundle__PromiseTypeAssignment_5_0 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:968:2: rule__Bundle__PromiseTypeAssignment_5_0
            {
            pushFollow(FOLLOW_rule__Bundle__PromiseTypeAssignment_5_0_in_rule__Bundle__Group_5__0__Impl2039);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:978:1: rule__Bundle__Group_5__1 : rule__Bundle__Group_5__1__Impl rule__Bundle__Group_5__2 ;
    public final void rule__Bundle__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:982:1: ( rule__Bundle__Group_5__1__Impl rule__Bundle__Group_5__2 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:983:2: rule__Bundle__Group_5__1__Impl rule__Bundle__Group_5__2
            {
            pushFollow(FOLLOW_rule__Bundle__Group_5__1__Impl_in_rule__Bundle__Group_5__12069);
            rule__Bundle__Group_5__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group_5__2_in_rule__Bundle__Group_5__12072);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:990:1: rule__Bundle__Group_5__1__Impl : ( ':' ) ;
    public final void rule__Bundle__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:994:1: ( ( ':' ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:995:1: ( ':' )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:995:1: ( ':' )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:996:1: ':'
            {
             before(grammarAccess.getBundleAccess().getColonKeyword_5_1()); 
            match(input,21,FOLLOW_21_in_rule__Bundle__Group_5__1__Impl2100); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1009:1: rule__Bundle__Group_5__2 : rule__Bundle__Group_5__2__Impl ;
    public final void rule__Bundle__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1013:1: ( rule__Bundle__Group_5__2__Impl )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1014:2: rule__Bundle__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Bundle__Group_5__2__Impl_in_rule__Bundle__Group_5__22131);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1020:1: rule__Bundle__Group_5__2__Impl : ( ( rule__Bundle__Alternatives_5_2 )* ) ;
    public final void rule__Bundle__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1024:1: ( ( ( rule__Bundle__Alternatives_5_2 )* ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1025:1: ( ( rule__Bundle__Alternatives_5_2 )* )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1025:1: ( ( rule__Bundle__Alternatives_5_2 )* )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1026:1: ( rule__Bundle__Alternatives_5_2 )*
            {
             before(grammarAccess.getBundleAccess().getAlternatives_5_2()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1027:1: ( rule__Bundle__Alternatives_5_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    int LA11_2 = input.LA(2);

                    if ( ((LA11_2>=RULE_ID && LA11_2<=RULE_STRING)||(LA11_2>=10 && LA11_2<=11)||(LA11_2>=15 && LA11_2<=17)||(LA11_2>=19 && LA11_2<=20)) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>=RULE_ANY_OTHER && LA11_0<=RULE_STRING)||(LA11_0>=10 && LA11_0<=11)||(LA11_0>=15 && LA11_0<=17)||LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1027:2: rule__Bundle__Alternatives_5_2
            	    {
            	    pushFollow(FOLLOW_rule__Bundle__Alternatives_5_2_in_rule__Bundle__Group_5__2__Impl2158);
            	    rule__Bundle__Alternatives_5_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getBundleAccess().getAlternatives_5_2()); 

            }


            }

        }
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


    // $ANTLR start rule__Bundle__Group_5_2_1__0
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1043:1: rule__Bundle__Group_5_2_1__0 : rule__Bundle__Group_5_2_1__0__Impl rule__Bundle__Group_5_2_1__1 ;
    public final void rule__Bundle__Group_5_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1047:1: ( rule__Bundle__Group_5_2_1__0__Impl rule__Bundle__Group_5_2_1__1 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1048:2: rule__Bundle__Group_5_2_1__0__Impl rule__Bundle__Group_5_2_1__1
            {
            pushFollow(FOLLOW_rule__Bundle__Group_5_2_1__0__Impl_in_rule__Bundle__Group_5_2_1__02195);
            rule__Bundle__Group_5_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group_5_2_1__1_in_rule__Bundle__Group_5_2_1__02198);
            rule__Bundle__Group_5_2_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Bundle__Group_5_2_1__0


    // $ANTLR start rule__Bundle__Group_5_2_1__0__Impl
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1055:1: rule__Bundle__Group_5_2_1__0__Impl : ( '{' ) ;
    public final void rule__Bundle__Group_5_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1059:1: ( ( '{' ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1060:1: ( '{' )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1060:1: ( '{' )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1061:1: '{'
            {
             before(grammarAccess.getBundleAccess().getLeftCurlyBracketKeyword_5_2_1_0()); 
            match(input,19,FOLLOW_19_in_rule__Bundle__Group_5_2_1__0__Impl2226); 
             after(grammarAccess.getBundleAccess().getLeftCurlyBracketKeyword_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Bundle__Group_5_2_1__0__Impl


    // $ANTLR start rule__Bundle__Group_5_2_1__1
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1074:1: rule__Bundle__Group_5_2_1__1 : rule__Bundle__Group_5_2_1__1__Impl rule__Bundle__Group_5_2_1__2 ;
    public final void rule__Bundle__Group_5_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1078:1: ( rule__Bundle__Group_5_2_1__1__Impl rule__Bundle__Group_5_2_1__2 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1079:2: rule__Bundle__Group_5_2_1__1__Impl rule__Bundle__Group_5_2_1__2
            {
            pushFollow(FOLLOW_rule__Bundle__Group_5_2_1__1__Impl_in_rule__Bundle__Group_5_2_1__12257);
            rule__Bundle__Group_5_2_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group_5_2_1__2_in_rule__Bundle__Group_5_2_1__12260);
            rule__Bundle__Group_5_2_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Bundle__Group_5_2_1__1


    // $ANTLR start rule__Bundle__Group_5_2_1__1__Impl
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1086:1: rule__Bundle__Group_5_2_1__1__Impl : ( '@' ) ;
    public final void rule__Bundle__Group_5_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1090:1: ( ( '@' ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1091:1: ( '@' )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1091:1: ( '@' )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1092:1: '@'
            {
             before(grammarAccess.getBundleAccess().getCommercialAtKeyword_5_2_1_1()); 
            match(input,22,FOLLOW_22_in_rule__Bundle__Group_5_2_1__1__Impl2288); 
             after(grammarAccess.getBundleAccess().getCommercialAtKeyword_5_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Bundle__Group_5_2_1__1__Impl


    // $ANTLR start rule__Bundle__Group_5_2_1__2
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1105:1: rule__Bundle__Group_5_2_1__2 : rule__Bundle__Group_5_2_1__2__Impl rule__Bundle__Group_5_2_1__3 ;
    public final void rule__Bundle__Group_5_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1109:1: ( rule__Bundle__Group_5_2_1__2__Impl rule__Bundle__Group_5_2_1__3 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1110:2: rule__Bundle__Group_5_2_1__2__Impl rule__Bundle__Group_5_2_1__3
            {
            pushFollow(FOLLOW_rule__Bundle__Group_5_2_1__2__Impl_in_rule__Bundle__Group_5_2_1__22319);
            rule__Bundle__Group_5_2_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Bundle__Group_5_2_1__3_in_rule__Bundle__Group_5_2_1__22322);
            rule__Bundle__Group_5_2_1__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Bundle__Group_5_2_1__2


    // $ANTLR start rule__Bundle__Group_5_2_1__2__Impl
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1117:1: rule__Bundle__Group_5_2_1__2__Impl : ( ( rulePLACEHOLDERB )* ) ;
    public final void rule__Bundle__Group_5_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1121:1: ( ( ( rulePLACEHOLDERB )* ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1122:1: ( ( rulePLACEHOLDERB )* )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1122:1: ( ( rulePLACEHOLDERB )* )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1123:1: ( rulePLACEHOLDERB )*
            {
             before(grammarAccess.getBundleAccess().getPLACEHOLDERBParserRuleCall_5_2_1_2()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1124:1: ( rulePLACEHOLDERB )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_STRING)||(LA12_0>=10 && LA12_0<=11)||(LA12_0>=15 && LA12_0<=17)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1124:3: rulePLACEHOLDERB
            	    {
            	    pushFollow(FOLLOW_rulePLACEHOLDERB_in_rule__Bundle__Group_5_2_1__2__Impl2350);
            	    rulePLACEHOLDERB();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getBundleAccess().getPLACEHOLDERBParserRuleCall_5_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Bundle__Group_5_2_1__2__Impl


    // $ANTLR start rule__Bundle__Group_5_2_1__3
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1134:1: rule__Bundle__Group_5_2_1__3 : rule__Bundle__Group_5_2_1__3__Impl ;
    public final void rule__Bundle__Group_5_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1138:1: ( rule__Bundle__Group_5_2_1__3__Impl )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1139:2: rule__Bundle__Group_5_2_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Bundle__Group_5_2_1__3__Impl_in_rule__Bundle__Group_5_2_1__32381);
            rule__Bundle__Group_5_2_1__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Bundle__Group_5_2_1__3


    // $ANTLR start rule__Bundle__Group_5_2_1__3__Impl
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1145:1: rule__Bundle__Group_5_2_1__3__Impl : ( '}' ) ;
    public final void rule__Bundle__Group_5_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1149:1: ( ( '}' ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1150:1: ( '}' )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1150:1: ( '}' )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1151:1: '}'
            {
             before(grammarAccess.getBundleAccess().getRightCurlyBracketKeyword_5_2_1_3()); 
            match(input,20,FOLLOW_20_in_rule__Bundle__Group_5_2_1__3__Impl2409); 
             after(grammarAccess.getBundleAccess().getRightCurlyBracketKeyword_5_2_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Bundle__Group_5_2_1__3__Impl


    // $ANTLR start rule__Body__Group__0
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1172:1: rule__Body__Group__0 : rule__Body__Group__0__Impl rule__Body__Group__1 ;
    public final void rule__Body__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1176:1: ( rule__Body__Group__0__Impl rule__Body__Group__1 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1177:2: rule__Body__Group__0__Impl rule__Body__Group__1
            {
            pushFollow(FOLLOW_rule__Body__Group__0__Impl_in_rule__Body__Group__02448);
            rule__Body__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__1_in_rule__Body__Group__02451);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1184:1: rule__Body__Group__0__Impl : ( 'body' ) ;
    public final void rule__Body__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1188:1: ( ( 'body' ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1189:1: ( 'body' )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1189:1: ( 'body' )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1190:1: 'body'
            {
             before(grammarAccess.getBodyAccess().getBodyKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Body__Group__0__Impl2479); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1203:1: rule__Body__Group__1 : rule__Body__Group__1__Impl rule__Body__Group__2 ;
    public final void rule__Body__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1207:1: ( rule__Body__Group__1__Impl rule__Body__Group__2 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1208:2: rule__Body__Group__1__Impl rule__Body__Group__2
            {
            pushFollow(FOLLOW_rule__Body__Group__1__Impl_in_rule__Body__Group__12510);
            rule__Body__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__2_in_rule__Body__Group__12513);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1215:1: rule__Body__Group__1__Impl : ( ( rule__Body__ComponentAssignment_1 ) ) ;
    public final void rule__Body__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1219:1: ( ( ( rule__Body__ComponentAssignment_1 ) ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1220:1: ( ( rule__Body__ComponentAssignment_1 ) )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1220:1: ( ( rule__Body__ComponentAssignment_1 ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1221:1: ( rule__Body__ComponentAssignment_1 )
            {
             before(grammarAccess.getBodyAccess().getComponentAssignment_1()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1222:1: ( rule__Body__ComponentAssignment_1 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1222:2: rule__Body__ComponentAssignment_1
            {
            pushFollow(FOLLOW_rule__Body__ComponentAssignment_1_in_rule__Body__Group__1__Impl2540);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1232:1: rule__Body__Group__2 : rule__Body__Group__2__Impl rule__Body__Group__3 ;
    public final void rule__Body__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1236:1: ( rule__Body__Group__2__Impl rule__Body__Group__3 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1237:2: rule__Body__Group__2__Impl rule__Body__Group__3
            {
            pushFollow(FOLLOW_rule__Body__Group__2__Impl_in_rule__Body__Group__22570);
            rule__Body__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__3_in_rule__Body__Group__22573);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1244:1: rule__Body__Group__2__Impl : ( ( rule__Body__NameAssignment_2 ) ) ;
    public final void rule__Body__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1248:1: ( ( ( rule__Body__NameAssignment_2 ) ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1249:1: ( ( rule__Body__NameAssignment_2 ) )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1249:1: ( ( rule__Body__NameAssignment_2 ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1250:1: ( rule__Body__NameAssignment_2 )
            {
             before(grammarAccess.getBodyAccess().getNameAssignment_2()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1251:1: ( rule__Body__NameAssignment_2 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1251:2: rule__Body__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Body__NameAssignment_2_in_rule__Body__Group__2__Impl2600);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1261:1: rule__Body__Group__3 : rule__Body__Group__3__Impl rule__Body__Group__4 ;
    public final void rule__Body__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1265:1: ( rule__Body__Group__3__Impl rule__Body__Group__4 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1266:2: rule__Body__Group__3__Impl rule__Body__Group__4
            {
            pushFollow(FOLLOW_rule__Body__Group__3__Impl_in_rule__Body__Group__32630);
            rule__Body__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__4_in_rule__Body__Group__32633);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1273:1: rule__Body__Group__3__Impl : ( ( rule__Body__Group_3__0 )? ) ;
    public final void rule__Body__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1277:1: ( ( ( rule__Body__Group_3__0 )? ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1278:1: ( ( rule__Body__Group_3__0 )? )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1278:1: ( ( rule__Body__Group_3__0 )? )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1279:1: ( rule__Body__Group_3__0 )?
            {
             before(grammarAccess.getBodyAccess().getGroup_3()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1280:1: ( rule__Body__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==10) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1280:2: rule__Body__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Body__Group_3__0_in_rule__Body__Group__3__Impl2660);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1290:1: rule__Body__Group__4 : rule__Body__Group__4__Impl rule__Body__Group__5 ;
    public final void rule__Body__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1294:1: ( rule__Body__Group__4__Impl rule__Body__Group__5 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1295:2: rule__Body__Group__4__Impl rule__Body__Group__5
            {
            pushFollow(FOLLOW_rule__Body__Group__4__Impl_in_rule__Body__Group__42691);
            rule__Body__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__5_in_rule__Body__Group__42694);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1302:1: rule__Body__Group__4__Impl : ( '{' ) ;
    public final void rule__Body__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1306:1: ( ( '{' ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1307:1: ( '{' )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1307:1: ( '{' )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1308:1: '{'
            {
             before(grammarAccess.getBodyAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_19_in_rule__Body__Group__4__Impl2722); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1321:1: rule__Body__Group__5 : rule__Body__Group__5__Impl rule__Body__Group__6 ;
    public final void rule__Body__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1325:1: ( rule__Body__Group__5__Impl rule__Body__Group__6 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1326:2: rule__Body__Group__5__Impl rule__Body__Group__6
            {
            pushFollow(FOLLOW_rule__Body__Group__5__Impl_in_rule__Body__Group__52753);
            rule__Body__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__6_in_rule__Body__Group__52756);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1333:1: rule__Body__Group__5__Impl : ( ( rule__Body__PromiseTypeAssignment_5 )* ) ;
    public final void rule__Body__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1337:1: ( ( ( rule__Body__PromiseTypeAssignment_5 )* ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1338:1: ( ( rule__Body__PromiseTypeAssignment_5 )* )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1338:1: ( ( rule__Body__PromiseTypeAssignment_5 )* )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1339:1: ( rule__Body__PromiseTypeAssignment_5 )*
            {
             before(grammarAccess.getBodyAccess().getPromiseTypeAssignment_5()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1340:1: ( rule__Body__PromiseTypeAssignment_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==15) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1340:2: rule__Body__PromiseTypeAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Body__PromiseTypeAssignment_5_in_rule__Body__Group__5__Impl2783);
            	    rule__Body__PromiseTypeAssignment_5();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1350:1: rule__Body__Group__6 : rule__Body__Group__6__Impl rule__Body__Group__7 ;
    public final void rule__Body__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1354:1: ( rule__Body__Group__6__Impl rule__Body__Group__7 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1355:2: rule__Body__Group__6__Impl rule__Body__Group__7
            {
            pushFollow(FOLLOW_rule__Body__Group__6__Impl_in_rule__Body__Group__62814);
            rule__Body__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group__7_in_rule__Body__Group__62817);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1362:1: rule__Body__Group__6__Impl : ( ( rule__Body__ClassesAssignment_6 )* ) ;
    public final void rule__Body__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1366:1: ( ( ( rule__Body__ClassesAssignment_6 )* ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1367:1: ( ( rule__Body__ClassesAssignment_6 )* )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1367:1: ( ( rule__Body__ClassesAssignment_6 )* )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1368:1: ( rule__Body__ClassesAssignment_6 )*
            {
             before(grammarAccess.getBodyAccess().getClassesAssignment_6()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1369:1: ( rule__Body__ClassesAssignment_6 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||(LA15_0>=10 && LA15_0<=14)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1369:2: rule__Body__ClassesAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Body__ClassesAssignment_6_in_rule__Body__Group__6__Impl2844);
            	    rule__Body__ClassesAssignment_6();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1379:1: rule__Body__Group__7 : rule__Body__Group__7__Impl ;
    public final void rule__Body__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1383:1: ( rule__Body__Group__7__Impl )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1384:2: rule__Body__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group__7__Impl_in_rule__Body__Group__72875);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1390:1: rule__Body__Group__7__Impl : ( '}' ) ;
    public final void rule__Body__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1394:1: ( ( '}' ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1395:1: ( '}' )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1395:1: ( '}' )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1396:1: '}'
            {
             before(grammarAccess.getBodyAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FOLLOW_20_in_rule__Body__Group__7__Impl2903); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1425:1: rule__Body__Group_3__0 : rule__Body__Group_3__0__Impl rule__Body__Group_3__1 ;
    public final void rule__Body__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1429:1: ( rule__Body__Group_3__0__Impl rule__Body__Group_3__1 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1430:2: rule__Body__Group_3__0__Impl rule__Body__Group_3__1
            {
            pushFollow(FOLLOW_rule__Body__Group_3__0__Impl_in_rule__Body__Group_3__02950);
            rule__Body__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group_3__1_in_rule__Body__Group_3__02953);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1437:1: rule__Body__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Body__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1441:1: ( ( '(' ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1442:1: ( '(' )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1442:1: ( '(' )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1443:1: '('
            {
             before(grammarAccess.getBodyAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,10,FOLLOW_10_in_rule__Body__Group_3__0__Impl2981); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1456:1: rule__Body__Group_3__1 : rule__Body__Group_3__1__Impl rule__Body__Group_3__2 ;
    public final void rule__Body__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1460:1: ( rule__Body__Group_3__1__Impl rule__Body__Group_3__2 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1461:2: rule__Body__Group_3__1__Impl rule__Body__Group_3__2
            {
            pushFollow(FOLLOW_rule__Body__Group_3__1__Impl_in_rule__Body__Group_3__13012);
            rule__Body__Group_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group_3__2_in_rule__Body__Group_3__13015);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1468:1: rule__Body__Group_3__1__Impl : ( ( rule__Body__VariablesAssignment_3_1 ) ) ;
    public final void rule__Body__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1472:1: ( ( ( rule__Body__VariablesAssignment_3_1 ) ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1473:1: ( ( rule__Body__VariablesAssignment_3_1 ) )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1473:1: ( ( rule__Body__VariablesAssignment_3_1 ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1474:1: ( rule__Body__VariablesAssignment_3_1 )
            {
             before(grammarAccess.getBodyAccess().getVariablesAssignment_3_1()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1475:1: ( rule__Body__VariablesAssignment_3_1 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1475:2: rule__Body__VariablesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Body__VariablesAssignment_3_1_in_rule__Body__Group_3__1__Impl3042);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1485:1: rule__Body__Group_3__2 : rule__Body__Group_3__2__Impl rule__Body__Group_3__3 ;
    public final void rule__Body__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1489:1: ( rule__Body__Group_3__2__Impl rule__Body__Group_3__3 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1490:2: rule__Body__Group_3__2__Impl rule__Body__Group_3__3
            {
            pushFollow(FOLLOW_rule__Body__Group_3__2__Impl_in_rule__Body__Group_3__23072);
            rule__Body__Group_3__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group_3__3_in_rule__Body__Group_3__23075);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1497:1: rule__Body__Group_3__2__Impl : ( ( rule__Body__Group_3_2__0 )* ) ;
    public final void rule__Body__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1501:1: ( ( ( rule__Body__Group_3_2__0 )* ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1502:1: ( ( rule__Body__Group_3_2__0 )* )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1502:1: ( ( rule__Body__Group_3_2__0 )* )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1503:1: ( rule__Body__Group_3_2__0 )*
            {
             before(grammarAccess.getBodyAccess().getGroup_3_2()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1504:1: ( rule__Body__Group_3_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1504:2: rule__Body__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Body__Group_3_2__0_in_rule__Body__Group_3__2__Impl3102);
            	    rule__Body__Group_3_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1514:1: rule__Body__Group_3__3 : rule__Body__Group_3__3__Impl ;
    public final void rule__Body__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1518:1: ( rule__Body__Group_3__3__Impl )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1519:2: rule__Body__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group_3__3__Impl_in_rule__Body__Group_3__33133);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1525:1: rule__Body__Group_3__3__Impl : ( ')' ) ;
    public final void rule__Body__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1529:1: ( ( ')' ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1530:1: ( ')' )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1530:1: ( ')' )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1531:1: ')'
            {
             before(grammarAccess.getBodyAccess().getRightParenthesisKeyword_3_3()); 
            match(input,11,FOLLOW_11_in_rule__Body__Group_3__3__Impl3161); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1552:1: rule__Body__Group_3_2__0 : rule__Body__Group_3_2__0__Impl rule__Body__Group_3_2__1 ;
    public final void rule__Body__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1556:1: ( rule__Body__Group_3_2__0__Impl rule__Body__Group_3_2__1 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1557:2: rule__Body__Group_3_2__0__Impl rule__Body__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Body__Group_3_2__0__Impl_in_rule__Body__Group_3_2__03200);
            rule__Body__Group_3_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Body__Group_3_2__1_in_rule__Body__Group_3_2__03203);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1564:1: rule__Body__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Body__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1568:1: ( ( ',' ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1569:1: ( ',' )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1569:1: ( ',' )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1570:1: ','
            {
             before(grammarAccess.getBodyAccess().getCommaKeyword_3_2_0()); 
            match(input,17,FOLLOW_17_in_rule__Body__Group_3_2__0__Impl3231); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1583:1: rule__Body__Group_3_2__1 : rule__Body__Group_3_2__1__Impl ;
    public final void rule__Body__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1587:1: ( rule__Body__Group_3_2__1__Impl )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1588:2: rule__Body__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Body__Group_3_2__1__Impl_in_rule__Body__Group_3_2__13262);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1594:1: rule__Body__Group_3_2__1__Impl : ( ( rule__Body__VariablesAssignment_3_2_1 ) ) ;
    public final void rule__Body__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1598:1: ( ( ( rule__Body__VariablesAssignment_3_2_1 ) ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1599:1: ( ( rule__Body__VariablesAssignment_3_2_1 ) )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1599:1: ( ( rule__Body__VariablesAssignment_3_2_1 ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1600:1: ( rule__Body__VariablesAssignment_3_2_1 )
            {
             before(grammarAccess.getBodyAccess().getVariablesAssignment_3_2_1()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1601:1: ( rule__Body__VariablesAssignment_3_2_1 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1601:2: rule__Body__VariablesAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Body__VariablesAssignment_3_2_1_in_rule__Body__Group_3_2__1__Impl3289);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1615:1: rule__BodyFunction__Group__0 : rule__BodyFunction__Group__0__Impl rule__BodyFunction__Group__1 ;
    public final void rule__BodyFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1619:1: ( rule__BodyFunction__Group__0__Impl rule__BodyFunction__Group__1 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1620:2: rule__BodyFunction__Group__0__Impl rule__BodyFunction__Group__1
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group__0__Impl_in_rule__BodyFunction__Group__03323);
            rule__BodyFunction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group__1_in_rule__BodyFunction__Group__03326);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1627:1: rule__BodyFunction__Group__0__Impl : ( ( rule__BodyFunction__NameAssignment_0 ) ) ;
    public final void rule__BodyFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1631:1: ( ( ( rule__BodyFunction__NameAssignment_0 ) ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1632:1: ( ( rule__BodyFunction__NameAssignment_0 ) )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1632:1: ( ( rule__BodyFunction__NameAssignment_0 ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1633:1: ( rule__BodyFunction__NameAssignment_0 )
            {
             before(grammarAccess.getBodyFunctionAccess().getNameAssignment_0()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1634:1: ( rule__BodyFunction__NameAssignment_0 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1634:2: rule__BodyFunction__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BodyFunction__NameAssignment_0_in_rule__BodyFunction__Group__0__Impl3353);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1644:1: rule__BodyFunction__Group__1 : rule__BodyFunction__Group__1__Impl rule__BodyFunction__Group__2 ;
    public final void rule__BodyFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1648:1: ( rule__BodyFunction__Group__1__Impl rule__BodyFunction__Group__2 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1649:2: rule__BodyFunction__Group__1__Impl rule__BodyFunction__Group__2
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group__1__Impl_in_rule__BodyFunction__Group__13383);
            rule__BodyFunction__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group__2_in_rule__BodyFunction__Group__13386);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1656:1: rule__BodyFunction__Group__1__Impl : ( '=>' ) ;
    public final void rule__BodyFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1660:1: ( ( '=>' ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1661:1: ( '=>' )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1661:1: ( '=>' )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1662:1: '=>'
            {
             before(grammarAccess.getBodyFunctionAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__BodyFunction__Group__1__Impl3414); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1675:1: rule__BodyFunction__Group__2 : rule__BodyFunction__Group__2__Impl rule__BodyFunction__Group__3 ;
    public final void rule__BodyFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1679:1: ( rule__BodyFunction__Group__2__Impl rule__BodyFunction__Group__3 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1680:2: rule__BodyFunction__Group__2__Impl rule__BodyFunction__Group__3
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group__2__Impl_in_rule__BodyFunction__Group__23445);
            rule__BodyFunction__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group__3_in_rule__BodyFunction__Group__23448);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1687:1: rule__BodyFunction__Group__2__Impl : ( ( rule__BodyFunction__Alternatives_2 ) ) ;
    public final void rule__BodyFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1691:1: ( ( ( rule__BodyFunction__Alternatives_2 ) ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1692:1: ( ( rule__BodyFunction__Alternatives_2 ) )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1692:1: ( ( rule__BodyFunction__Alternatives_2 ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1693:1: ( rule__BodyFunction__Alternatives_2 )
            {
             before(grammarAccess.getBodyFunctionAccess().getAlternatives_2()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1694:1: ( rule__BodyFunction__Alternatives_2 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1694:2: rule__BodyFunction__Alternatives_2
            {
            pushFollow(FOLLOW_rule__BodyFunction__Alternatives_2_in_rule__BodyFunction__Group__2__Impl3475);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1704:1: rule__BodyFunction__Group__3 : rule__BodyFunction__Group__3__Impl ;
    public final void rule__BodyFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1708:1: ( rule__BodyFunction__Group__3__Impl )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1709:2: rule__BodyFunction__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group__3__Impl_in_rule__BodyFunction__Group__33505);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1715:1: rule__BodyFunction__Group__3__Impl : ( ';' ) ;
    public final void rule__BodyFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1719:1: ( ( ';' ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1720:1: ( ';' )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1720:1: ( ';' )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1721:1: ';'
            {
             before(grammarAccess.getBodyFunctionAccess().getSemicolonKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__BodyFunction__Group__3__Impl3533); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1742:1: rule__BodyFunction__Group_2_1__0 : rule__BodyFunction__Group_2_1__0__Impl rule__BodyFunction__Group_2_1__1 ;
    public final void rule__BodyFunction__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1746:1: ( rule__BodyFunction__Group_2_1__0__Impl rule__BodyFunction__Group_2_1__1 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1747:2: rule__BodyFunction__Group_2_1__0__Impl rule__BodyFunction__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__0__Impl_in_rule__BodyFunction__Group_2_1__03572);
            rule__BodyFunction__Group_2_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__1_in_rule__BodyFunction__Group_2_1__03575);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1754:1: rule__BodyFunction__Group_2_1__0__Impl : ( ( rule__BodyFunction__ListAssignment_2_1_0 ) ) ;
    public final void rule__BodyFunction__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1758:1: ( ( ( rule__BodyFunction__ListAssignment_2_1_0 ) ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1759:1: ( ( rule__BodyFunction__ListAssignment_2_1_0 ) )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1759:1: ( ( rule__BodyFunction__ListAssignment_2_1_0 ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1760:1: ( rule__BodyFunction__ListAssignment_2_1_0 )
            {
             before(grammarAccess.getBodyFunctionAccess().getListAssignment_2_1_0()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1761:1: ( rule__BodyFunction__ListAssignment_2_1_0 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1761:2: rule__BodyFunction__ListAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__BodyFunction__ListAssignment_2_1_0_in_rule__BodyFunction__Group_2_1__0__Impl3602);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1771:1: rule__BodyFunction__Group_2_1__1 : rule__BodyFunction__Group_2_1__1__Impl rule__BodyFunction__Group_2_1__2 ;
    public final void rule__BodyFunction__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1775:1: ( rule__BodyFunction__Group_2_1__1__Impl rule__BodyFunction__Group_2_1__2 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1776:2: rule__BodyFunction__Group_2_1__1__Impl rule__BodyFunction__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__1__Impl_in_rule__BodyFunction__Group_2_1__13632);
            rule__BodyFunction__Group_2_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__2_in_rule__BodyFunction__Group_2_1__13635);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1783:1: rule__BodyFunction__Group_2_1__1__Impl : ( ( rule__BodyFunction__ValuesAssignment_2_1_1 ) ) ;
    public final void rule__BodyFunction__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1787:1: ( ( ( rule__BodyFunction__ValuesAssignment_2_1_1 ) ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1788:1: ( ( rule__BodyFunction__ValuesAssignment_2_1_1 ) )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1788:1: ( ( rule__BodyFunction__ValuesAssignment_2_1_1 ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1789:1: ( rule__BodyFunction__ValuesAssignment_2_1_1 )
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_1_1()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1790:1: ( rule__BodyFunction__ValuesAssignment_2_1_1 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1790:2: rule__BodyFunction__ValuesAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__BodyFunction__ValuesAssignment_2_1_1_in_rule__BodyFunction__Group_2_1__1__Impl3662);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1800:1: rule__BodyFunction__Group_2_1__2 : rule__BodyFunction__Group_2_1__2__Impl rule__BodyFunction__Group_2_1__3 ;
    public final void rule__BodyFunction__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1804:1: ( rule__BodyFunction__Group_2_1__2__Impl rule__BodyFunction__Group_2_1__3 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1805:2: rule__BodyFunction__Group_2_1__2__Impl rule__BodyFunction__Group_2_1__3
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__2__Impl_in_rule__BodyFunction__Group_2_1__23692);
            rule__BodyFunction__Group_2_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__3_in_rule__BodyFunction__Group_2_1__23695);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1812:1: rule__BodyFunction__Group_2_1__2__Impl : ( ( rule__BodyFunction__Group_2_1_2__0 )* ) ;
    public final void rule__BodyFunction__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1816:1: ( ( ( rule__BodyFunction__Group_2_1_2__0 )* ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1817:1: ( ( rule__BodyFunction__Group_2_1_2__0 )* )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1817:1: ( ( rule__BodyFunction__Group_2_1_2__0 )* )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1818:1: ( rule__BodyFunction__Group_2_1_2__0 )*
            {
             before(grammarAccess.getBodyFunctionAccess().getGroup_2_1_2()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1819:1: ( rule__BodyFunction__Group_2_1_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==17) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1819:2: rule__BodyFunction__Group_2_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__BodyFunction__Group_2_1_2__0_in_rule__BodyFunction__Group_2_1__2__Impl3722);
            	    rule__BodyFunction__Group_2_1_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1829:1: rule__BodyFunction__Group_2_1__3 : rule__BodyFunction__Group_2_1__3__Impl ;
    public final void rule__BodyFunction__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1833:1: ( rule__BodyFunction__Group_2_1__3__Impl )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1834:2: rule__BodyFunction__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1__3__Impl_in_rule__BodyFunction__Group_2_1__33753);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1840:1: rule__BodyFunction__Group_2_1__3__Impl : ( '}' ) ;
    public final void rule__BodyFunction__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1844:1: ( ( '}' ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1845:1: ( '}' )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1845:1: ( '}' )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1846:1: '}'
            {
             before(grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_1_3()); 
            match(input,20,FOLLOW_20_in_rule__BodyFunction__Group_2_1__3__Impl3781); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1867:1: rule__BodyFunction__Group_2_1_2__0 : rule__BodyFunction__Group_2_1_2__0__Impl rule__BodyFunction__Group_2_1_2__1 ;
    public final void rule__BodyFunction__Group_2_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1871:1: ( rule__BodyFunction__Group_2_1_2__0__Impl rule__BodyFunction__Group_2_1_2__1 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1872:2: rule__BodyFunction__Group_2_1_2__0__Impl rule__BodyFunction__Group_2_1_2__1
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1_2__0__Impl_in_rule__BodyFunction__Group_2_1_2__03820);
            rule__BodyFunction__Group_2_1_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1_2__1_in_rule__BodyFunction__Group_2_1_2__03823);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1879:1: rule__BodyFunction__Group_2_1_2__0__Impl : ( ',' ) ;
    public final void rule__BodyFunction__Group_2_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1883:1: ( ( ',' ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1884:1: ( ',' )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1884:1: ( ',' )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1885:1: ','
            {
             before(grammarAccess.getBodyFunctionAccess().getCommaKeyword_2_1_2_0()); 
            match(input,17,FOLLOW_17_in_rule__BodyFunction__Group_2_1_2__0__Impl3851); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1898:1: rule__BodyFunction__Group_2_1_2__1 : rule__BodyFunction__Group_2_1_2__1__Impl ;
    public final void rule__BodyFunction__Group_2_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1902:1: ( rule__BodyFunction__Group_2_1_2__1__Impl )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1903:2: rule__BodyFunction__Group_2_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_1_2__1__Impl_in_rule__BodyFunction__Group_2_1_2__13882);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1909:1: rule__BodyFunction__Group_2_1_2__1__Impl : ( ( rule__BodyFunction__ValuesAssignment_2_1_2_1 ) ) ;
    public final void rule__BodyFunction__Group_2_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1913:1: ( ( ( rule__BodyFunction__ValuesAssignment_2_1_2_1 ) ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1914:1: ( ( rule__BodyFunction__ValuesAssignment_2_1_2_1 ) )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1914:1: ( ( rule__BodyFunction__ValuesAssignment_2_1_2_1 ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1915:1: ( rule__BodyFunction__ValuesAssignment_2_1_2_1 )
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesAssignment_2_1_2_1()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1916:1: ( rule__BodyFunction__ValuesAssignment_2_1_2_1 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1916:2: rule__BodyFunction__ValuesAssignment_2_1_2_1
            {
            pushFollow(FOLLOW_rule__BodyFunction__ValuesAssignment_2_1_2_1_in_rule__BodyFunction__Group_2_1_2__1__Impl3909);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1930:1: rule__BodyFunction__Group_2_3__0 : rule__BodyFunction__Group_2_3__0__Impl rule__BodyFunction__Group_2_3__1 ;
    public final void rule__BodyFunction__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1934:1: ( rule__BodyFunction__Group_2_3__0__Impl rule__BodyFunction__Group_2_3__1 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1935:2: rule__BodyFunction__Group_2_3__0__Impl rule__BodyFunction__Group_2_3__1
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__0__Impl_in_rule__BodyFunction__Group_2_3__03943);
            rule__BodyFunction__Group_2_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__1_in_rule__BodyFunction__Group_2_3__03946);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1942:1: rule__BodyFunction__Group_2_3__0__Impl : ( '{' ) ;
    public final void rule__BodyFunction__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1946:1: ( ( '{' ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1947:1: ( '{' )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1947:1: ( '{' )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1948:1: '{'
            {
             before(grammarAccess.getBodyFunctionAccess().getLeftCurlyBracketKeyword_2_3_0()); 
            match(input,19,FOLLOW_19_in_rule__BodyFunction__Group_2_3__0__Impl3974); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1961:1: rule__BodyFunction__Group_2_3__1 : rule__BodyFunction__Group_2_3__1__Impl rule__BodyFunction__Group_2_3__2 ;
    public final void rule__BodyFunction__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1965:1: ( rule__BodyFunction__Group_2_3__1__Impl rule__BodyFunction__Group_2_3__2 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1966:2: rule__BodyFunction__Group_2_3__1__Impl rule__BodyFunction__Group_2_3__2
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__1__Impl_in_rule__BodyFunction__Group_2_3__14005);
            rule__BodyFunction__Group_2_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__2_in_rule__BodyFunction__Group_2_3__14008);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1973:1: rule__BodyFunction__Group_2_3__1__Impl : ( '@' ) ;
    public final void rule__BodyFunction__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1977:1: ( ( '@' ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1978:1: ( '@' )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1978:1: ( '@' )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1979:1: '@'
            {
             before(grammarAccess.getBodyFunctionAccess().getCommercialAtKeyword_2_3_1()); 
            match(input,22,FOLLOW_22_in_rule__BodyFunction__Group_2_3__1__Impl4036); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1992:1: rule__BodyFunction__Group_2_3__2 : rule__BodyFunction__Group_2_3__2__Impl rule__BodyFunction__Group_2_3__3 ;
    public final void rule__BodyFunction__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1996:1: ( rule__BodyFunction__Group_2_3__2__Impl rule__BodyFunction__Group_2_3__3 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:1997:2: rule__BodyFunction__Group_2_3__2__Impl rule__BodyFunction__Group_2_3__3
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__2__Impl_in_rule__BodyFunction__Group_2_3__24067);
            rule__BodyFunction__Group_2_3__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__3_in_rule__BodyFunction__Group_2_3__24070);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2004:1: rule__BodyFunction__Group_2_3__2__Impl : ( ( rulePLACEHOLDERB )* ) ;
    public final void rule__BodyFunction__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2008:1: ( ( ( rulePLACEHOLDERB )* ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2009:1: ( ( rulePLACEHOLDERB )* )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2009:1: ( ( rulePLACEHOLDERB )* )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2010:1: ( rulePLACEHOLDERB )*
            {
             before(grammarAccess.getBodyFunctionAccess().getPLACEHOLDERBParserRuleCall_2_3_2()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2011:1: ( rulePLACEHOLDERB )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_STRING)||(LA18_0>=10 && LA18_0<=11)||(LA18_0>=15 && LA18_0<=17)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2011:3: rulePLACEHOLDERB
            	    {
            	    pushFollow(FOLLOW_rulePLACEHOLDERB_in_rule__BodyFunction__Group_2_3__2__Impl4098);
            	    rulePLACEHOLDERB();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getBodyFunctionAccess().getPLACEHOLDERBParserRuleCall_2_3_2()); 

            }


            }

        }
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2021:1: rule__BodyFunction__Group_2_3__3 : rule__BodyFunction__Group_2_3__3__Impl ;
    public final void rule__BodyFunction__Group_2_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2025:1: ( rule__BodyFunction__Group_2_3__3__Impl )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2026:2: rule__BodyFunction__Group_2_3__3__Impl
            {
            pushFollow(FOLLOW_rule__BodyFunction__Group_2_3__3__Impl_in_rule__BodyFunction__Group_2_3__34129);
            rule__BodyFunction__Group_2_3__3__Impl();
            _fsp--;


            }

        }
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2032:1: rule__BodyFunction__Group_2_3__3__Impl : ( '}' ) ;
    public final void rule__BodyFunction__Group_2_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2036:1: ( ( '}' ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2037:1: ( '}' )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2037:1: ( '}' )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2038:1: '}'
            {
             before(grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_3_3()); 
            match(input,20,FOLLOW_20_in_rule__BodyFunction__Group_2_3__3__Impl4157); 
             after(grammarAccess.getBodyFunctionAccess().getRightCurlyBracketKeyword_2_3_3()); 

            }


            }

        }
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


    // $ANTLR start rule__SpecialFunction__Group__0
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2059:1: rule__SpecialFunction__Group__0 : rule__SpecialFunction__Group__0__Impl rule__SpecialFunction__Group__1 ;
    public final void rule__SpecialFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2063:1: ( rule__SpecialFunction__Group__0__Impl rule__SpecialFunction__Group__1 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2064:2: rule__SpecialFunction__Group__0__Impl rule__SpecialFunction__Group__1
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__0__Impl_in_rule__SpecialFunction__Group__04196);
            rule__SpecialFunction__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group__1_in_rule__SpecialFunction__Group__04199);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2071:1: rule__SpecialFunction__Group__0__Impl : ( ( rule__SpecialFunction__NameAssignment_0 ) ) ;
    public final void rule__SpecialFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2075:1: ( ( ( rule__SpecialFunction__NameAssignment_0 ) ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2076:1: ( ( rule__SpecialFunction__NameAssignment_0 ) )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2076:1: ( ( rule__SpecialFunction__NameAssignment_0 ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2077:1: ( rule__SpecialFunction__NameAssignment_0 )
            {
             before(grammarAccess.getSpecialFunctionAccess().getNameAssignment_0()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2078:1: ( rule__SpecialFunction__NameAssignment_0 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2078:2: rule__SpecialFunction__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SpecialFunction__NameAssignment_0_in_rule__SpecialFunction__Group__0__Impl4226);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2088:1: rule__SpecialFunction__Group__1 : rule__SpecialFunction__Group__1__Impl rule__SpecialFunction__Group__2 ;
    public final void rule__SpecialFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2092:1: ( rule__SpecialFunction__Group__1__Impl rule__SpecialFunction__Group__2 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2093:2: rule__SpecialFunction__Group__1__Impl rule__SpecialFunction__Group__2
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__1__Impl_in_rule__SpecialFunction__Group__14256);
            rule__SpecialFunction__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group__2_in_rule__SpecialFunction__Group__14259);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2100:1: rule__SpecialFunction__Group__1__Impl : ( '(' ) ;
    public final void rule__SpecialFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2104:1: ( ( '(' ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2105:1: ( '(' )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2105:1: ( '(' )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2106:1: '('
            {
             before(grammarAccess.getSpecialFunctionAccess().getLeftParenthesisKeyword_1()); 
            match(input,10,FOLLOW_10_in_rule__SpecialFunction__Group__1__Impl4287); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2119:1: rule__SpecialFunction__Group__2 : rule__SpecialFunction__Group__2__Impl rule__SpecialFunction__Group__3 ;
    public final void rule__SpecialFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2123:1: ( rule__SpecialFunction__Group__2__Impl rule__SpecialFunction__Group__3 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2124:2: rule__SpecialFunction__Group__2__Impl rule__SpecialFunction__Group__3
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__2__Impl_in_rule__SpecialFunction__Group__24318);
            rule__SpecialFunction__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group__3_in_rule__SpecialFunction__Group__24321);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2131:1: rule__SpecialFunction__Group__2__Impl : ( ( rule__SpecialFunction__Alternatives_2 )* ) ;
    public final void rule__SpecialFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2135:1: ( ( ( rule__SpecialFunction__Alternatives_2 )* ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2136:1: ( ( rule__SpecialFunction__Alternatives_2 )* )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2136:1: ( ( rule__SpecialFunction__Alternatives_2 )* )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2137:1: ( rule__SpecialFunction__Alternatives_2 )*
            {
             before(grammarAccess.getSpecialFunctionAccess().getAlternatives_2()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2138:1: ( rule__SpecialFunction__Alternatives_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_INT)||LA19_0==17||(LA19_0>=24 && LA19_0<=25)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2138:2: rule__SpecialFunction__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__SpecialFunction__Alternatives_2_in_rule__SpecialFunction__Group__2__Impl4348);
            	    rule__SpecialFunction__Alternatives_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2148:1: rule__SpecialFunction__Group__3 : rule__SpecialFunction__Group__3__Impl ;
    public final void rule__SpecialFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2152:1: ( rule__SpecialFunction__Group__3__Impl )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2153:2: rule__SpecialFunction__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group__3__Impl_in_rule__SpecialFunction__Group__34379);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2159:1: rule__SpecialFunction__Group__3__Impl : ( ')' ) ;
    public final void rule__SpecialFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2163:1: ( ( ')' ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2164:1: ( ')' )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2164:1: ( ')' )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2165:1: ')'
            {
             before(grammarAccess.getSpecialFunctionAccess().getRightParenthesisKeyword_3()); 
            match(input,11,FOLLOW_11_in_rule__SpecialFunction__Group__3__Impl4407); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2186:1: rule__SpecialFunction__Group_2_5__0 : rule__SpecialFunction__Group_2_5__0__Impl rule__SpecialFunction__Group_2_5__1 ;
    public final void rule__SpecialFunction__Group_2_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2190:1: ( rule__SpecialFunction__Group_2_5__0__Impl rule__SpecialFunction__Group_2_5__1 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2191:2: rule__SpecialFunction__Group_2_5__0__Impl rule__SpecialFunction__Group_2_5__1
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_5__0__Impl_in_rule__SpecialFunction__Group_2_5__04446);
            rule__SpecialFunction__Group_2_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_5__1_in_rule__SpecialFunction__Group_2_5__04449);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2198:1: rule__SpecialFunction__Group_2_5__0__Impl : ( '$(' ) ;
    public final void rule__SpecialFunction__Group_2_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2202:1: ( ( '$(' ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2203:1: ( '$(' )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2203:1: ( '$(' )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2204:1: '$('
            {
             before(grammarAccess.getSpecialFunctionAccess().getDollarSignLeftParenthesisKeyword_2_5_0()); 
            match(input,24,FOLLOW_24_in_rule__SpecialFunction__Group_2_5__0__Impl4477); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2217:1: rule__SpecialFunction__Group_2_5__1 : rule__SpecialFunction__Group_2_5__1__Impl rule__SpecialFunction__Group_2_5__2 ;
    public final void rule__SpecialFunction__Group_2_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2221:1: ( rule__SpecialFunction__Group_2_5__1__Impl rule__SpecialFunction__Group_2_5__2 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2222:2: rule__SpecialFunction__Group_2_5__1__Impl rule__SpecialFunction__Group_2_5__2
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_5__1__Impl_in_rule__SpecialFunction__Group_2_5__14508);
            rule__SpecialFunction__Group_2_5__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_5__2_in_rule__SpecialFunction__Group_2_5__14511);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2229:1: rule__SpecialFunction__Group_2_5__1__Impl : ( RULE_ID ) ;
    public final void rule__SpecialFunction__Group_2_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2233:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2234:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2234:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2235:1: RULE_ID
            {
             before(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_5_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SpecialFunction__Group_2_5__1__Impl4538); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2246:1: rule__SpecialFunction__Group_2_5__2 : rule__SpecialFunction__Group_2_5__2__Impl ;
    public final void rule__SpecialFunction__Group_2_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2250:1: ( rule__SpecialFunction__Group_2_5__2__Impl )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2251:2: rule__SpecialFunction__Group_2_5__2__Impl
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_5__2__Impl_in_rule__SpecialFunction__Group_2_5__24567);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2257:1: rule__SpecialFunction__Group_2_5__2__Impl : ( ')' ) ;
    public final void rule__SpecialFunction__Group_2_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2261:1: ( ( ')' ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2262:1: ( ')' )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2262:1: ( ')' )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2263:1: ')'
            {
             before(grammarAccess.getSpecialFunctionAccess().getRightParenthesisKeyword_2_5_2()); 
            match(input,11,FOLLOW_11_in_rule__SpecialFunction__Group_2_5__2__Impl4595); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2282:1: rule__SpecialFunction__Group_2_6__0 : rule__SpecialFunction__Group_2_6__0__Impl rule__SpecialFunction__Group_2_6__1 ;
    public final void rule__SpecialFunction__Group_2_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2286:1: ( rule__SpecialFunction__Group_2_6__0__Impl rule__SpecialFunction__Group_2_6__1 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2287:2: rule__SpecialFunction__Group_2_6__0__Impl rule__SpecialFunction__Group_2_6__1
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_6__0__Impl_in_rule__SpecialFunction__Group_2_6__04632);
            rule__SpecialFunction__Group_2_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_6__1_in_rule__SpecialFunction__Group_2_6__04635);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2294:1: rule__SpecialFunction__Group_2_6__0__Impl : ( '${' ) ;
    public final void rule__SpecialFunction__Group_2_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2298:1: ( ( '${' ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2299:1: ( '${' )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2299:1: ( '${' )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2300:1: '${'
            {
             before(grammarAccess.getSpecialFunctionAccess().getDollarSignLeftCurlyBracketKeyword_2_6_0()); 
            match(input,25,FOLLOW_25_in_rule__SpecialFunction__Group_2_6__0__Impl4663); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2313:1: rule__SpecialFunction__Group_2_6__1 : rule__SpecialFunction__Group_2_6__1__Impl rule__SpecialFunction__Group_2_6__2 ;
    public final void rule__SpecialFunction__Group_2_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2317:1: ( rule__SpecialFunction__Group_2_6__1__Impl rule__SpecialFunction__Group_2_6__2 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2318:2: rule__SpecialFunction__Group_2_6__1__Impl rule__SpecialFunction__Group_2_6__2
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_6__1__Impl_in_rule__SpecialFunction__Group_2_6__14694);
            rule__SpecialFunction__Group_2_6__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_6__2_in_rule__SpecialFunction__Group_2_6__14697);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2325:1: rule__SpecialFunction__Group_2_6__1__Impl : ( RULE_ID ) ;
    public final void rule__SpecialFunction__Group_2_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2329:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2330:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2330:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2331:1: RULE_ID
            {
             before(grammarAccess.getSpecialFunctionAccess().getIDTerminalRuleCall_2_6_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SpecialFunction__Group_2_6__1__Impl4724); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2342:1: rule__SpecialFunction__Group_2_6__2 : rule__SpecialFunction__Group_2_6__2__Impl ;
    public final void rule__SpecialFunction__Group_2_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2346:1: ( rule__SpecialFunction__Group_2_6__2__Impl )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2347:2: rule__SpecialFunction__Group_2_6__2__Impl
            {
            pushFollow(FOLLOW_rule__SpecialFunction__Group_2_6__2__Impl_in_rule__SpecialFunction__Group_2_6__24753);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2353:1: rule__SpecialFunction__Group_2_6__2__Impl : ( '}' ) ;
    public final void rule__SpecialFunction__Group_2_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2357:1: ( ( '}' ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2358:1: ( '}' )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2358:1: ( '}' )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2359:1: '}'
            {
             before(grammarAccess.getSpecialFunctionAccess().getRightCurlyBracketKeyword_2_6_2()); 
            match(input,20,FOLLOW_20_in_rule__SpecialFunction__Group_2_6__2__Impl4781); 
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


    // $ANTLR start rule__BodyClass__Group__0
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2378:1: rule__BodyClass__Group__0 : rule__BodyClass__Group__0__Impl rule__BodyClass__Group__1 ;
    public final void rule__BodyClass__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2382:1: ( rule__BodyClass__Group__0__Impl rule__BodyClass__Group__1 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2383:2: rule__BodyClass__Group__0__Impl rule__BodyClass__Group__1
            {
            pushFollow(FOLLOW_rule__BodyClass__Group__0__Impl_in_rule__BodyClass__Group__04818);
            rule__BodyClass__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyClass__Group__1_in_rule__BodyClass__Group__04821);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2390:1: rule__BodyClass__Group__0__Impl : ( ( rule__BodyClass__NameAssignment_0 ) ) ;
    public final void rule__BodyClass__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2394:1: ( ( ( rule__BodyClass__NameAssignment_0 ) ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2395:1: ( ( rule__BodyClass__NameAssignment_0 ) )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2395:1: ( ( rule__BodyClass__NameAssignment_0 ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2396:1: ( rule__BodyClass__NameAssignment_0 )
            {
             before(grammarAccess.getBodyClassAccess().getNameAssignment_0()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2397:1: ( rule__BodyClass__NameAssignment_0 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2397:2: rule__BodyClass__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__BodyClass__NameAssignment_0_in_rule__BodyClass__Group__0__Impl4848);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2407:1: rule__BodyClass__Group__1 : rule__BodyClass__Group__1__Impl rule__BodyClass__Group__2 ;
    public final void rule__BodyClass__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2411:1: ( rule__BodyClass__Group__1__Impl rule__BodyClass__Group__2 )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2412:2: rule__BodyClass__Group__1__Impl rule__BodyClass__Group__2
            {
            pushFollow(FOLLOW_rule__BodyClass__Group__1__Impl_in_rule__BodyClass__Group__14878);
            rule__BodyClass__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BodyClass__Group__2_in_rule__BodyClass__Group__14881);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2419:1: rule__BodyClass__Group__1__Impl : ( '::' ) ;
    public final void rule__BodyClass__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2423:1: ( ( '::' ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2424:1: ( '::' )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2424:1: ( '::' )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2425:1: '::'
            {
             before(grammarAccess.getBodyClassAccess().getColonColonKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__BodyClass__Group__1__Impl4909); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2438:1: rule__BodyClass__Group__2 : rule__BodyClass__Group__2__Impl ;
    public final void rule__BodyClass__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2442:1: ( rule__BodyClass__Group__2__Impl )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2443:2: rule__BodyClass__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BodyClass__Group__2__Impl_in_rule__BodyClass__Group__24940);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2449:1: rule__BodyClass__Group__2__Impl : ( ( rule__BodyClass__PromiseTypeAssignment_2 )* ) ;
    public final void rule__BodyClass__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2453:1: ( ( ( rule__BodyClass__PromiseTypeAssignment_2 )* ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2454:1: ( ( rule__BodyClass__PromiseTypeAssignment_2 )* )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2454:1: ( ( rule__BodyClass__PromiseTypeAssignment_2 )* )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2455:1: ( rule__BodyClass__PromiseTypeAssignment_2 )*
            {
             before(grammarAccess.getBodyClassAccess().getPromiseTypeAssignment_2()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2456:1: ( rule__BodyClass__PromiseTypeAssignment_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    int LA20_2 = input.LA(2);

                    if ( (LA20_2==15) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2456:2: rule__BodyClass__PromiseTypeAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__BodyClass__PromiseTypeAssignment_2_in_rule__BodyClass__Group__2__Impl4967);
            	    rule__BodyClass__PromiseTypeAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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


    // $ANTLR start rule__CfModel__ElementsAssignment
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2473:1: rule__CfModel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__CfModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2477:1: ( ( ruleAbstractElement ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2478:1: ( ruleAbstractElement )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2478:1: ( ruleAbstractElement )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2479:1: ruleAbstractElement
            {
             before(grammarAccess.getCfModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_rule__CfModel__ElementsAssignment5009);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2488:1: rule__Bundle__ComponentAssignment_1 : ( ruleBundleComponent ) ;
    public final void rule__Bundle__ComponentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2492:1: ( ( ruleBundleComponent ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2493:1: ( ruleBundleComponent )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2493:1: ( ruleBundleComponent )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2494:1: ruleBundleComponent
            {
             before(grammarAccess.getBundleAccess().getComponentBundleComponentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBundleComponent_in_rule__Bundle__ComponentAssignment_15040);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2503:1: rule__Bundle__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Bundle__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2507:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2508:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2508:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2509:1: RULE_ID
            {
             before(grammarAccess.getBundleAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Bundle__NameAssignment_25071); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2518:1: rule__Bundle__PromiseTypeAssignment_5_0 : ( ruleBundlePromiseType ) ;
    public final void rule__Bundle__PromiseTypeAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2522:1: ( ( ruleBundlePromiseType ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2523:1: ( ruleBundlePromiseType )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2523:1: ( ruleBundlePromiseType )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2524:1: ruleBundlePromiseType
            {
             before(grammarAccess.getBundleAccess().getPromiseTypeBundlePromiseTypeParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleBundlePromiseType_in_rule__Bundle__PromiseTypeAssignment_5_05102);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2533:1: rule__Body__ComponentAssignment_1 : ( ruleBodyComponent ) ;
    public final void rule__Body__ComponentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2537:1: ( ( ruleBodyComponent ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2538:1: ( ruleBodyComponent )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2538:1: ( ruleBodyComponent )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2539:1: ruleBodyComponent
            {
             before(grammarAccess.getBodyAccess().getComponentBodyComponentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBodyComponent_in_rule__Body__ComponentAssignment_15133);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2548:1: rule__Body__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Body__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2552:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2553:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2553:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2554:1: RULE_ID
            {
             before(grammarAccess.getBodyAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Body__NameAssignment_25164); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2563:1: rule__Body__VariablesAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Body__VariablesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2567:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2568:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2568:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2569:1: RULE_ID
            {
             before(grammarAccess.getBodyAccess().getVariablesIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Body__VariablesAssignment_3_15195); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2578:1: rule__Body__VariablesAssignment_3_2_1 : ( RULE_ID ) ;
    public final void rule__Body__VariablesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2582:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2583:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2583:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2584:1: RULE_ID
            {
             before(grammarAccess.getBodyAccess().getVariablesIDTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Body__VariablesAssignment_3_2_15226); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2593:1: rule__Body__PromiseTypeAssignment_5 : ( ruleBodyFunction ) ;
    public final void rule__Body__PromiseTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2597:1: ( ( ruleBodyFunction ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2598:1: ( ruleBodyFunction )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2598:1: ( ruleBodyFunction )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2599:1: ruleBodyFunction
            {
             before(grammarAccess.getBodyAccess().getPromiseTypeBodyFunctionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleBodyFunction_in_rule__Body__PromiseTypeAssignment_55257);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2608:1: rule__Body__ClassesAssignment_6 : ( ruleBodyClass ) ;
    public final void rule__Body__ClassesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2612:1: ( ( ruleBodyClass ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2613:1: ( ruleBodyClass )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2613:1: ( ruleBodyClass )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2614:1: ruleBodyClass
            {
             before(grammarAccess.getBodyAccess().getClassesBodyClassParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleBodyClass_in_rule__Body__ClassesAssignment_65288);
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


    // $ANTLR start rule__BodyFunction__NameAssignment_0
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2623:1: rule__BodyFunction__NameAssignment_0 : ( ruleBodyPromiseType ) ;
    public final void rule__BodyFunction__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2627:1: ( ( ruleBodyPromiseType ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2628:1: ( ruleBodyPromiseType )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2628:1: ( ruleBodyPromiseType )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2629:1: ruleBodyPromiseType
            {
             before(grammarAccess.getBodyFunctionAccess().getNameBodyPromiseTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBodyPromiseType_in_rule__BodyFunction__NameAssignment_05319);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2638:1: rule__BodyFunction__ValuesAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__BodyFunction__ValuesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2642:1: ( ( RULE_STRING ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2643:1: ( RULE_STRING )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2643:1: ( RULE_STRING )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2644:1: RULE_STRING
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_05350); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2653:1: rule__BodyFunction__ListAssignment_2_1_0 : ( ( '{' ) ) ;
    public final void rule__BodyFunction__ListAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2657:1: ( ( ( '{' ) ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2658:1: ( ( '{' ) )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2658:1: ( ( '{' ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2659:1: ( '{' )
            {
             before(grammarAccess.getBodyFunctionAccess().getListLeftCurlyBracketKeyword_2_1_0_0()); 
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2660:1: ( '{' )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2661:1: '{'
            {
             before(grammarAccess.getBodyFunctionAccess().getListLeftCurlyBracketKeyword_2_1_0_0()); 
            match(input,19,FOLLOW_19_in_rule__BodyFunction__ListAssignment_2_1_05386); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2676:1: rule__BodyFunction__ValuesAssignment_2_1_1 : ( RULE_STRING ) ;
    public final void rule__BodyFunction__ValuesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2680:1: ( ( RULE_STRING ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2681:1: ( RULE_STRING )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2681:1: ( RULE_STRING )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2682:1: RULE_STRING
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_1_15425); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2691:1: rule__BodyFunction__ValuesAssignment_2_1_2_1 : ( RULE_STRING ) ;
    public final void rule__BodyFunction__ValuesAssignment_2_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2695:1: ( ( RULE_STRING ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2696:1: ( RULE_STRING )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2696:1: ( RULE_STRING )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2697:1: RULE_STRING
            {
             before(grammarAccess.getBodyFunctionAccess().getValuesSTRINGTerminalRuleCall_2_1_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_1_2_15456); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2706:1: rule__BodyFunction__FunctionAssignment_2_2 : ( ruleSpecialFunction ) ;
    public final void rule__BodyFunction__FunctionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2710:1: ( ( ruleSpecialFunction ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2711:1: ( ruleSpecialFunction )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2711:1: ( ruleSpecialFunction )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2712:1: ruleSpecialFunction
            {
             before(grammarAccess.getBodyFunctionAccess().getFunctionSpecialFunctionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleSpecialFunction_in_rule__BodyFunction__FunctionAssignment_2_25487);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2721:1: rule__SpecialFunction__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SpecialFunction__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2725:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2726:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2726:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2727:1: RULE_ID
            {
             before(grammarAccess.getSpecialFunctionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SpecialFunction__NameAssignment_05518); 
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


    // $ANTLR start rule__SpecialFunction__FuncAssignment_2_7
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2736:1: rule__SpecialFunction__FuncAssignment_2_7 : ( ruleSpecialFunction ) ;
    public final void rule__SpecialFunction__FuncAssignment_2_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2740:1: ( ( ruleSpecialFunction ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2741:1: ( ruleSpecialFunction )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2741:1: ( ruleSpecialFunction )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2742:1: ruleSpecialFunction
            {
             before(grammarAccess.getSpecialFunctionAccess().getFuncSpecialFunctionParserRuleCall_2_7_0()); 
            pushFollow(FOLLOW_ruleSpecialFunction_in_rule__SpecialFunction__FuncAssignment_2_75549);
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


    // $ANTLR start rule__BundlePromiseType__NameAssignment
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2751:1: rule__BundlePromiseType__NameAssignment : ( RULE_ID ) ;
    public final void rule__BundlePromiseType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2755:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2756:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2756:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2757:1: RULE_ID
            {
             before(grammarAccess.getBundlePromiseTypeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BundlePromiseType__NameAssignment5580); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2766:1: rule__BodyPromiseType__NameAssignment : ( RULE_ID ) ;
    public final void rule__BodyPromiseType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2770:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2771:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2771:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2772:1: RULE_ID
            {
             before(grammarAccess.getBodyPromiseTypeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BodyPromiseType__NameAssignment5611); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2781:1: rule__BundleComponent__NameAssignment : ( RULE_ID ) ;
    public final void rule__BundleComponent__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2785:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2786:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2786:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2787:1: RULE_ID
            {
             before(grammarAccess.getBundleComponentAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BundleComponent__NameAssignment5642); 
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2796:1: rule__BodyComponent__NameAssignment : ( RULE_ID ) ;
    public final void rule__BodyComponent__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2800:1: ( ( RULE_ID ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2801:1: ( RULE_ID )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2801:1: ( RULE_ID )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2802:1: RULE_ID
            {
             before(grammarAccess.getBodyComponentAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BodyComponent__NameAssignment5673); 
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


    // $ANTLR start rule__BodyClass__NameAssignment_0
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2811:1: rule__BodyClass__NameAssignment_0 : ( ruleCLASS_ID ) ;
    public final void rule__BodyClass__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2815:1: ( ( ruleCLASS_ID ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2816:1: ( ruleCLASS_ID )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2816:1: ( ruleCLASS_ID )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2817:1: ruleCLASS_ID
            {
             before(grammarAccess.getBodyClassAccess().getNameCLASS_IDParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCLASS_ID_in_rule__BodyClass__NameAssignment_05704);
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
    // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2826:1: rule__BodyClass__PromiseTypeAssignment_2 : ( ruleBodyFunction ) ;
    public final void rule__BodyClass__PromiseTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2830:1: ( ( ruleBodyFunction ) )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2831:1: ( ruleBodyFunction )
            {
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2831:1: ( ruleBodyFunction )
            // ../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g:2832:1: ruleBodyFunction
            {
             before(grammarAccess.getBodyClassAccess().getPromiseTypeBodyFunctionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBodyFunction_in_rule__BodyClass__PromiseTypeAssignment_25735);
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


 

    public static final BitSet FOLLOW_ruleCfModel_in_entryRuleCfModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCfModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CfModel__ElementsAssignment_in_ruleCfModel94 = new BitSet(new long[]{0x0000000000840002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_entryRuleCLASS_ID122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCLASS_ID129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Alternatives_in_ruleCLASS_ID157 = new BitSet(new long[]{0x0000000000007C12L});
    public static final BitSet FOLLOW_rule__CLASS_ID__Alternatives_in_ruleCLASS_ID169 = new BitSet(new long[]{0x0000000000007C12L});
    public static final BitSet FOLLOW_rulePLACEHOLDERB_in_entryRulePLACEHOLDERB201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePLACEHOLDERB208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PLACEHOLDERB__Alternatives_in_rulePLACEHOLDERB234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_ruleAbstractElement294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePart_in_entryRulePart320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePart327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Part__Alternatives_in_rulePart353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundle_in_entryRuleBundle380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundle387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__0_in_ruleBundle413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__0_in_ruleBody473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_entryRuleBodyFunction500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyFunction507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__0_in_ruleBodyFunction533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_entryRuleSpecialFunction560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecialFunction567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__0_in_ruleSpecialFunction593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundlePromiseType_in_entryRuleBundlePromiseType620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundlePromiseType627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundlePromiseType__NameAssignment_in_ruleBundlePromiseType653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyPromiseType_in_entryRuleBodyPromiseType680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyPromiseType687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyPromiseType__NameAssignment_in_ruleBodyPromiseType713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundleComponent_in_entryRuleBundleComponent740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBundleComponent747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BundleComponent__NameAssignment_in_ruleBundleComponent773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_entryRuleBodyComponent800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyComponent807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyComponent__NameAssignment_in_ruleBodyComponent833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyClass_in_entryRuleBodyClass860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBodyClass867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyClass__Group__0_in_ruleBodyClass893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CLASS_ID__Alternatives929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__CLASS_ID__Alternatives947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__CLASS_ID__Alternatives967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__CLASS_ID__Alternatives987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__CLASS_ID__Alternatives1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__CLASS_ID__Alternatives1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__PLACEHOLDERB__Alternatives1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PLACEHOLDERB__Alternatives1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PLACEHOLDERB__Alternatives1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PLACEHOLDERB__Alternatives1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PLACEHOLDERB__Alternatives1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PLACEHOLDERB__Alternatives1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__PLACEHOLDERB__Alternatives1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__PLACEHOLDERB__Alternatives1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundle_in_rule__Part__Alternatives1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_rule__Part__Alternatives1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePLACEHOLDERB_in_rule__Bundle__Alternatives_5_21277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_5_2_1__0_in_rule__Bundle__Alternatives_5_21294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__ValuesAssignment_2_0_in_rule__BodyFunction__Alternatives_21327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__0_in_rule__BodyFunction__Alternatives_21345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__FunctionAssignment_2_2_in_rule__BodyFunction__Alternatives_21363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__0_in_rule__BodyFunction__Alternatives_21381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__SpecialFunction__Alternatives_21414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SpecialFunction__Alternatives_21431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SpecialFunction__Alternatives_21448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SpecialFunction__Alternatives_21465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SpecialFunction__Alternatives_21483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_5__0_in_rule__SpecialFunction__Alternatives_21502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_6__0_in_rule__SpecialFunction__Alternatives_21520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__FuncAssignment_2_7_in_rule__SpecialFunction__Alternatives_21538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__0__Impl_in_rule__Bundle__Group__01569 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Bundle__Group__1_in_rule__Bundle__Group__01572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Bundle__Group__0__Impl1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__1__Impl_in_rule__Bundle__Group__11631 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Bundle__Group__2_in_rule__Bundle__Group__11634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__ComponentAssignment_1_in_rule__Bundle__Group__1__Impl1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__2__Impl_in_rule__Bundle__Group__21691 = new BitSet(new long[]{0x00000000000B8C70L});
    public static final BitSet FOLLOW_rule__Bundle__Group__3_in_rule__Bundle__Group__21694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__NameAssignment_2_in_rule__Bundle__Group__2__Impl1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__3__Impl_in_rule__Bundle__Group__31751 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Bundle__Group__4_in_rule__Bundle__Group__31754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePLACEHOLDERB_in_rule__Bundle__Group__3__Impl1782 = new BitSet(new long[]{0x0000000000038C72L});
    public static final BitSet FOLLOW_rule__Bundle__Group__4__Impl_in_rule__Bundle__Group__41813 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_rule__Bundle__Group__5_in_rule__Bundle__Group__41816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Bundle__Group__4__Impl1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group__5__Impl_in_rule__Bundle__Group__51875 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Bundle__Group__6_in_rule__Bundle__Group__51878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_5__0_in_rule__Bundle__Group__5__Impl1905 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Bundle__Group__6__Impl_in_rule__Bundle__Group__61936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Bundle__Group__6__Impl1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_5__0__Impl_in_rule__Bundle__Group_5__02009 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Bundle__Group_5__1_in_rule__Bundle__Group_5__02012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__PromiseTypeAssignment_5_0_in_rule__Bundle__Group_5__0__Impl2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_5__1__Impl_in_rule__Bundle__Group_5__12069 = new BitSet(new long[]{0x00000000000B8C72L});
    public static final BitSet FOLLOW_rule__Bundle__Group_5__2_in_rule__Bundle__Group_5__12072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Bundle__Group_5__1__Impl2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_5__2__Impl_in_rule__Bundle__Group_5__22131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Alternatives_5_2_in_rule__Bundle__Group_5__2__Impl2158 = new BitSet(new long[]{0x00000000000B8C72L});
    public static final BitSet FOLLOW_rule__Bundle__Group_5_2_1__0__Impl_in_rule__Bundle__Group_5_2_1__02195 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Bundle__Group_5_2_1__1_in_rule__Bundle__Group_5_2_1__02198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Bundle__Group_5_2_1__0__Impl2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_5_2_1__1__Impl_in_rule__Bundle__Group_5_2_1__12257 = new BitSet(new long[]{0x0000000000138C70L});
    public static final BitSet FOLLOW_rule__Bundle__Group_5_2_1__2_in_rule__Bundle__Group_5_2_1__12260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Bundle__Group_5_2_1__1__Impl2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bundle__Group_5_2_1__2__Impl_in_rule__Bundle__Group_5_2_1__22319 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Bundle__Group_5_2_1__3_in_rule__Bundle__Group_5_2_1__22322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePLACEHOLDERB_in_rule__Bundle__Group_5_2_1__2__Impl2350 = new BitSet(new long[]{0x0000000000038C72L});
    public static final BitSet FOLLOW_rule__Bundle__Group_5_2_1__3__Impl_in_rule__Bundle__Group_5_2_1__32381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Bundle__Group_5_2_1__3__Impl2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__0__Impl_in_rule__Body__Group__02448 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Body__Group__1_in_rule__Body__Group__02451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Body__Group__0__Impl2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__1__Impl_in_rule__Body__Group__12510 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Body__Group__2_in_rule__Body__Group__12513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__ComponentAssignment_1_in_rule__Body__Group__1__Impl2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__2__Impl_in_rule__Body__Group__22570 = new BitSet(new long[]{0x0000000000080400L});
    public static final BitSet FOLLOW_rule__Body__Group__3_in_rule__Body__Group__22573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__NameAssignment_2_in_rule__Body__Group__2__Impl2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__3__Impl_in_rule__Body__Group__32630 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Body__Group__4_in_rule__Body__Group__32633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3__0_in_rule__Body__Group__3__Impl2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__4__Impl_in_rule__Body__Group__42691 = new BitSet(new long[]{0x0000000000107C10L});
    public static final BitSet FOLLOW_rule__Body__Group__5_in_rule__Body__Group__42694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Body__Group__4__Impl2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group__5__Impl_in_rule__Body__Group__52753 = new BitSet(new long[]{0x0000000000107C10L});
    public static final BitSet FOLLOW_rule__Body__Group__6_in_rule__Body__Group__52756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__PromiseTypeAssignment_5_in_rule__Body__Group__5__Impl2783 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Body__Group__6__Impl_in_rule__Body__Group__62814 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Body__Group__7_in_rule__Body__Group__62817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__ClassesAssignment_6_in_rule__Body__Group__6__Impl2844 = new BitSet(new long[]{0x0000000000007C12L});
    public static final BitSet FOLLOW_rule__Body__Group__7__Impl_in_rule__Body__Group__72875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Body__Group__7__Impl2903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3__0__Impl_in_rule__Body__Group_3__02950 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Body__Group_3__1_in_rule__Body__Group_3__02953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Body__Group_3__0__Impl2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3__1__Impl_in_rule__Body__Group_3__13012 = new BitSet(new long[]{0x0000000000020800L});
    public static final BitSet FOLLOW_rule__Body__Group_3__2_in_rule__Body__Group_3__13015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__VariablesAssignment_3_1_in_rule__Body__Group_3__1__Impl3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3__2__Impl_in_rule__Body__Group_3__23072 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Body__Group_3__3_in_rule__Body__Group_3__23075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3_2__0_in_rule__Body__Group_3__2__Impl3102 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Body__Group_3__3__Impl_in_rule__Body__Group_3__33133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Body__Group_3__3__Impl3161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3_2__0__Impl_in_rule__Body__Group_3_2__03200 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Body__Group_3_2__1_in_rule__Body__Group_3_2__03203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Body__Group_3_2__0__Impl3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__Group_3_2__1__Impl_in_rule__Body__Group_3_2__13262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Body__VariablesAssignment_3_2_1_in_rule__Body__Group_3_2__1__Impl3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__0__Impl_in_rule__BodyFunction__Group__03323 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__1_in_rule__BodyFunction__Group__03326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__NameAssignment_0_in_rule__BodyFunction__Group__0__Impl3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__1__Impl_in_rule__BodyFunction__Group__13383 = new BitSet(new long[]{0x0000000000080050L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__2_in_rule__BodyFunction__Group__13386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BodyFunction__Group__1__Impl3414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__2__Impl_in_rule__BodyFunction__Group__23445 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__3_in_rule__BodyFunction__Group__23448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Alternatives_2_in_rule__BodyFunction__Group__2__Impl3475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group__3__Impl_in_rule__BodyFunction__Group__33505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BodyFunction__Group__3__Impl3533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__0__Impl_in_rule__BodyFunction__Group_2_1__03572 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__1_in_rule__BodyFunction__Group_2_1__03575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__ListAssignment_2_1_0_in_rule__BodyFunction__Group_2_1__0__Impl3602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__1__Impl_in_rule__BodyFunction__Group_2_1__13632 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__2_in_rule__BodyFunction__Group_2_1__13635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__ValuesAssignment_2_1_1_in_rule__BodyFunction__Group_2_1__1__Impl3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__2__Impl_in_rule__BodyFunction__Group_2_1__23692 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__3_in_rule__BodyFunction__Group_2_1__23695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1_2__0_in_rule__BodyFunction__Group_2_1__2__Impl3722 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1__3__Impl_in_rule__BodyFunction__Group_2_1__33753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BodyFunction__Group_2_1__3__Impl3781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1_2__0__Impl_in_rule__BodyFunction__Group_2_1_2__03820 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1_2__1_in_rule__BodyFunction__Group_2_1_2__03823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BodyFunction__Group_2_1_2__0__Impl3851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_1_2__1__Impl_in_rule__BodyFunction__Group_2_1_2__13882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__ValuesAssignment_2_1_2_1_in_rule__BodyFunction__Group_2_1_2__1__Impl3909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__0__Impl_in_rule__BodyFunction__Group_2_3__03943 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__1_in_rule__BodyFunction__Group_2_3__03946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BodyFunction__Group_2_3__0__Impl3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__1__Impl_in_rule__BodyFunction__Group_2_3__14005 = new BitSet(new long[]{0x0000000000138C70L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__2_in_rule__BodyFunction__Group_2_3__14008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BodyFunction__Group_2_3__1__Impl4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__2__Impl_in_rule__BodyFunction__Group_2_3__24067 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__3_in_rule__BodyFunction__Group_2_3__24070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePLACEHOLDERB_in_rule__BodyFunction__Group_2_3__2__Impl4098 = new BitSet(new long[]{0x0000000000038C72L});
    public static final BitSet FOLLOW_rule__BodyFunction__Group_2_3__3__Impl_in_rule__BodyFunction__Group_2_3__34129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BodyFunction__Group_2_3__3__Impl4157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__0__Impl_in_rule__SpecialFunction__Group__04196 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__1_in_rule__SpecialFunction__Group__04199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__NameAssignment_0_in_rule__SpecialFunction__Group__0__Impl4226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__1__Impl_in_rule__SpecialFunction__Group__14256 = new BitSet(new long[]{0x00000000030208F0L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__2_in_rule__SpecialFunction__Group__14259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__SpecialFunction__Group__1__Impl4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__2__Impl_in_rule__SpecialFunction__Group__24318 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__3_in_rule__SpecialFunction__Group__24321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Alternatives_2_in_rule__SpecialFunction__Group__2__Impl4348 = new BitSet(new long[]{0x00000000030200F2L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group__3__Impl_in_rule__SpecialFunction__Group__34379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__SpecialFunction__Group__3__Impl4407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_5__0__Impl_in_rule__SpecialFunction__Group_2_5__04446 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_5__1_in_rule__SpecialFunction__Group_2_5__04449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SpecialFunction__Group_2_5__0__Impl4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_5__1__Impl_in_rule__SpecialFunction__Group_2_5__14508 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_5__2_in_rule__SpecialFunction__Group_2_5__14511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SpecialFunction__Group_2_5__1__Impl4538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_5__2__Impl_in_rule__SpecialFunction__Group_2_5__24567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__SpecialFunction__Group_2_5__2__Impl4595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_6__0__Impl_in_rule__SpecialFunction__Group_2_6__04632 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_6__1_in_rule__SpecialFunction__Group_2_6__04635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SpecialFunction__Group_2_6__0__Impl4663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_6__1__Impl_in_rule__SpecialFunction__Group_2_6__14694 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_6__2_in_rule__SpecialFunction__Group_2_6__14697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SpecialFunction__Group_2_6__1__Impl4724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SpecialFunction__Group_2_6__2__Impl_in_rule__SpecialFunction__Group_2_6__24753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SpecialFunction__Group_2_6__2__Impl4781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyClass__Group__0__Impl_in_rule__BodyClass__Group__04818 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__BodyClass__Group__1_in_rule__BodyClass__Group__04821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyClass__NameAssignment_0_in_rule__BodyClass__Group__0__Impl4848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyClass__Group__1__Impl_in_rule__BodyClass__Group__14878 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__BodyClass__Group__2_in_rule__BodyClass__Group__14881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BodyClass__Group__1__Impl4909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyClass__Group__2__Impl_in_rule__BodyClass__Group__24940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BodyClass__PromiseTypeAssignment_2_in_rule__BodyClass__Group__2__Impl4967 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rule__CfModel__ElementsAssignment5009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundleComponent_in_rule__Bundle__ComponentAssignment_15040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Bundle__NameAssignment_25071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBundlePromiseType_in_rule__Bundle__PromiseTypeAssignment_5_05102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyComponent_in_rule__Body__ComponentAssignment_15133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Body__NameAssignment_25164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Body__VariablesAssignment_3_15195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Body__VariablesAssignment_3_2_15226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_rule__Body__PromiseTypeAssignment_55257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyClass_in_rule__Body__ClassesAssignment_65288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyPromiseType_in_rule__BodyFunction__NameAssignment_05319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_05350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BodyFunction__ListAssignment_2_1_05386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_1_15425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__BodyFunction__ValuesAssignment_2_1_2_15456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_rule__BodyFunction__FunctionAssignment_2_25487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SpecialFunction__NameAssignment_05518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialFunction_in_rule__SpecialFunction__FuncAssignment_2_75549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BundlePromiseType__NameAssignment5580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BodyPromiseType__NameAssignment5611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BundleComponent__NameAssignment5642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BodyComponent__NameAssignment5673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCLASS_ID_in_rule__BodyClass__NameAssignment_05704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBodyFunction_in_rule__BodyClass__PromiseTypeAssignment_25735 = new BitSet(new long[]{0x0000000000000002L});

}