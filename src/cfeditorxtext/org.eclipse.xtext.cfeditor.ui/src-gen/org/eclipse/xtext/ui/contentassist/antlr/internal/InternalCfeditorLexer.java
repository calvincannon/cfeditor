package org.eclipse.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCfeditorLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=4;
    public static final int Tokens=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_STRING=6;
    public static final int RULE_INT=7;
    public static final int T10=10;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int RULE_WS=9;
    public static final int T15=15;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
    public InternalCfeditorLexer() {;} 
    public InternalCfeditorLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g"; }

    // $ANTLR start T10
    public final void mT10() throws RecognitionException {
        try {
            int _type = T10;
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:10:5: ( '=>' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:10:7: '=>'
            {
            match("=>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T10

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:11:5: ( ';' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:11:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:12:5: ( ',' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:12:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:13:5: ( '(' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:13:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:14:5: ( ')' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:14:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:15:5: ( 'bundle' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:15:7: 'bundle'
            {
            match("bundle"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:16:5: ( '{' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:16:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:17:5: ( '}' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:17:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:18:5: ( ':' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:18:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:19:5: ( 'body' )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:19:7: 'body'
            {
            match("body"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1849:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1849:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1849:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1849:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1849:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1851:10: ( ( '0' .. '9' )+ )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1851:12: ( '0' .. '9' )+
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1851:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1851:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1853:13: ( ( '\"' (~ ( ( '\\\\' | '\"' ) ) | '\\\\' . )* '\"' | '\\'' (~ ( ( '\\\\' | '\\'' ) ) | '\\\\' . )* '\\'' ) )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1853:15: ( '\"' (~ ( ( '\\\\' | '\"' ) ) | '\\\\' . )* '\"' | '\\'' (~ ( ( '\\\\' | '\\'' ) ) | '\\\\' . )* '\\'' )
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1853:15: ( '\"' (~ ( ( '\\\\' | '\"' ) ) | '\\\\' . )* '\"' | '\\'' (~ ( ( '\\\\' | '\\'' ) ) | '\\\\' . )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1853:15: ( '\"' (~ ( ( '\\\\' | '\"' ) ) | '\\\\' . )* '\"' | '\\'' (~ ( ( '\\\\' | '\\'' ) ) | '\\\\' . )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1853:16: '\"' (~ ( ( '\\\\' | '\"' ) ) | '\\\\' . )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1853:20: (~ ( ( '\\\\' | '\"' ) ) | '\\\\' . )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=1;
                        }
                        else if ( (LA4_0=='\\') ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1853:21: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1853:35: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1853:48: '\\'' (~ ( ( '\\\\' | '\\'' ) ) | '\\\\' . )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1853:53: (~ ( ( '\\\\' | '\\'' ) ) | '\\\\' . )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=1;
                        }
                        else if ( (LA5_0=='\\') ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1853:54: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1853:69: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1855:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1855:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1855:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1855:23: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1855:39: ( ( '\\r' )? '\\n' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1855:40: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1855:40: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1855:40: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1857:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1857:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1857:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1859:16: ( . )
            // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1859:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1:8: ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | RULE_ID | RULE_INT | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt11=16;
        int LA11_0 = input.LA(1);

        if ( (LA11_0=='=') ) {
            int LA11_1 = input.LA(2);

            if ( (LA11_1=='>') ) {
                alt11=1;
            }
            else {
                alt11=16;}
        }
        else if ( (LA11_0==';') ) {
            alt11=2;
        }
        else if ( (LA11_0==',') ) {
            alt11=3;
        }
        else if ( (LA11_0=='(') ) {
            alt11=4;
        }
        else if ( (LA11_0==')') ) {
            alt11=5;
        }
        else if ( (LA11_0=='b') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA11_23 = input.LA(3);

                if ( (LA11_23=='d') ) {
                    int LA11_33 = input.LA(4);

                    if ( (LA11_33=='y') ) {
                        int LA11_35 = input.LA(5);

                        if ( ((LA11_35>='0' && LA11_35<='9')||(LA11_35>='A' && LA11_35<='Z')||LA11_35=='_'||(LA11_35>='a' && LA11_35<='z')) ) {
                            alt11=11;
                        }
                        else {
                            alt11=10;}
                    }
                    else {
                        alt11=11;}
                }
                else {
                    alt11=11;}
                }
                break;
            case 'u':
                {
                int LA11_24 = input.LA(3);

                if ( (LA11_24=='n') ) {
                    int LA11_34 = input.LA(4);

                    if ( (LA11_34=='d') ) {
                        int LA11_36 = input.LA(5);

                        if ( (LA11_36=='l') ) {
                            int LA11_38 = input.LA(6);

                            if ( (LA11_38=='e') ) {
                                int LA11_39 = input.LA(7);

                                if ( ((LA11_39>='0' && LA11_39<='9')||(LA11_39>='A' && LA11_39<='Z')||LA11_39=='_'||(LA11_39>='a' && LA11_39<='z')) ) {
                                    alt11=11;
                                }
                                else {
                                    alt11=6;}
                            }
                            else {
                                alt11=11;}
                        }
                        else {
                            alt11=11;}
                    }
                    else {
                        alt11=11;}
                }
                else {
                    alt11=11;}
                }
                break;
            default:
                alt11=11;}

        }
        else if ( (LA11_0=='{') ) {
            alt11=7;
        }
        else if ( (LA11_0=='}') ) {
            alt11=8;
        }
        else if ( (LA11_0==':') ) {
            alt11=9;
        }
        else if ( (LA11_0=='^') ) {
            int LA11_10 = input.LA(2);

            if ( ((LA11_10>='A' && LA11_10<='Z')||LA11_10=='_'||(LA11_10>='a' && LA11_10<='z')) ) {
                alt11=11;
            }
            else {
                alt11=16;}
        }
        else if ( ((LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||LA11_0=='a'||(LA11_0>='c' && LA11_0<='z')) ) {
            alt11=11;
        }
        else if ( ((LA11_0>='0' && LA11_0<='9')) ) {
            alt11=12;
        }
        else if ( (LA11_0=='\"') ) {
            int LA11_13 = input.LA(2);

            if ( ((LA11_13>='\u0000' && LA11_13<='\uFFFE')) ) {
                alt11=13;
            }
            else {
                alt11=16;}
        }
        else if ( (LA11_0=='\'') ) {
            int LA11_14 = input.LA(2);

            if ( ((LA11_14>='\u0000' && LA11_14<='\uFFFE')) ) {
                alt11=13;
            }
            else {
                alt11=16;}
        }
        else if ( (LA11_0=='#') ) {
            alt11=14;
        }
        else if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
            alt11=15;
        }
        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||LA11_0=='!'||(LA11_0>='$' && LA11_0<='&')||(LA11_0>='*' && LA11_0<='+')||(LA11_0>='-' && LA11_0<='/')||LA11_0=='<'||(LA11_0>='>' && LA11_0<='@')||(LA11_0>='[' && LA11_0<=']')||LA11_0=='`'||LA11_0=='|'||(LA11_0>='~' && LA11_0<='\uFFFE')) ) {
            alt11=16;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | RULE_ID | RULE_INT | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 11, 0, input);

            throw nvae;
        }
        switch (alt11) {
            case 1 :
                // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1:10: T10
                {
                mT10(); 

                }
                break;
            case 2 :
                // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1:14: T11
                {
                mT11(); 

                }
                break;
            case 3 :
                // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1:18: T12
                {
                mT12(); 

                }
                break;
            case 4 :
                // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1:22: T13
                {
                mT13(); 

                }
                break;
            case 5 :
                // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1:26: T14
                {
                mT14(); 

                }
                break;
            case 6 :
                // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1:30: T15
                {
                mT15(); 

                }
                break;
            case 7 :
                // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1:34: T16
                {
                mT16(); 

                }
                break;
            case 8 :
                // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1:38: T17
                {
                mT17(); 

                }
                break;
            case 9 :
                // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1:42: T18
                {
                mT18(); 

                }
                break;
            case 10 :
                // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1:46: T19
                {
                mT19(); 

                }
                break;
            case 11 :
                // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1:50: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 12 :
                // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1:58: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 13 :
                // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1:67: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 14 :
                // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1:79: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 15 :
                // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1:95: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 16 :
                // ../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g:1:103: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}