package org.cfeditor.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCfengineLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=6;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=7;
    public static final int T__9=9;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int RULE_WS=8;

    // delegates
    // delegators

    public InternalCfengineLexer() {;} 
    public InternalCfengineLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCfengineLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:11:6: ( '.' )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:11:8: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:12:7: ( '!' )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:12:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:13:7: ( '(' )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:13:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:14:7: ( ')' )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:14:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:15:7: ( 'bundle' )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:15:9: 'bundle'
            {
            match("bundle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:16:7: ( ',' )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:17:7: ( '{' )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:17:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:18:7: ( '}' )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:18:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:19:7: ( ':' )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:19:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:20:7: ( '::' )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:20:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:21:7: ( ';' )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:21:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:22:7: ( '=>' )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:22:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:23:7: ( '@' )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:23:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:24:7: ( 'body' )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:24:9: 'body'
            {
            match("body"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:25:7: ( '$(' )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:25:9: '$('
            {
            match("$("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:26:7: ( '${' )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:26:9: '${'
            {
            match("${"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1516:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1516:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1516:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1518:13: ( ( '\"' (~ ( ( '\\\\' | '\"' ) ) | '\\\\' . )* '\"' | '\\'' (~ ( ( '\\\\' | '\\'' ) ) | '\\\\' . )* '\\'' ) )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1518:15: ( '\"' (~ ( ( '\\\\' | '\"' ) ) | '\\\\' . )* '\"' | '\\'' (~ ( ( '\\\\' | '\\'' ) ) | '\\\\' . )* '\\'' )
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1518:15: ( '\"' (~ ( ( '\\\\' | '\"' ) ) | '\\\\' . )* '\"' | '\\'' (~ ( ( '\\\\' | '\\'' ) ) | '\\\\' . )* '\\'' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\"') ) {
                alt4=1;
            }
            else if ( (LA4_0=='\'') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1518:16: '\"' (~ ( ( '\\\\' | '\"' ) ) | '\\\\' . )* '\"'
                    {
                    match('\"'); 
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1518:20: (~ ( ( '\\\\' | '\"' ) ) | '\\\\' . )*
                    loop2:
                    do {
                        int alt2=3;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                            alt2=1;
                        }
                        else if ( (LA2_0=='\\') ) {
                            alt2=2;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1518:21: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1518:35: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1518:48: '\\'' (~ ( ( '\\\\' | '\\'' ) ) | '\\\\' . )* '\\''
                    {
                    match('\''); 
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1518:53: (~ ( ( '\\\\' | '\\'' ) ) | '\\\\' . )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                            alt3=1;
                        }
                        else if ( (LA3_0=='\\') ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1518:54: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1518:69: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1520:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1520:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1520:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1520:23: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1520:39: ( ( '\\r' )? '\\n' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\n'||LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1520:40: ( '\\r' )? '\\n'
                    {
                    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1520:40: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1520:40: '\\r'
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1522:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1522:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1522:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1524:16: ( . )
            // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1524:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | RULE_ID | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt9=21;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1:10: T__9
                {
                mT__9(); 

                }
                break;
            case 2 :
                // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1:15: T__10
                {
                mT__10(); 

                }
                break;
            case 3 :
                // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1:21: T__11
                {
                mT__11(); 

                }
                break;
            case 4 :
                // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1:27: T__12
                {
                mT__12(); 

                }
                break;
            case 5 :
                // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1:33: T__13
                {
                mT__13(); 

                }
                break;
            case 6 :
                // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1:39: T__14
                {
                mT__14(); 

                }
                break;
            case 7 :
                // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1:45: T__15
                {
                mT__15(); 

                }
                break;
            case 8 :
                // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1:51: T__16
                {
                mT__16(); 

                }
                break;
            case 9 :
                // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1:57: T__17
                {
                mT__17(); 

                }
                break;
            case 10 :
                // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1:63: T__18
                {
                mT__18(); 

                }
                break;
            case 11 :
                // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1:69: T__19
                {
                mT__19(); 

                }
                break;
            case 12 :
                // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1:75: T__20
                {
                mT__20(); 

                }
                break;
            case 13 :
                // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1:81: T__21
                {
                mT__21(); 

                }
                break;
            case 14 :
                // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1:87: T__22
                {
                mT__22(); 

                }
                break;
            case 15 :
                // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1:93: T__23
                {
                mT__23(); 

                }
                break;
            case 16 :
                // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1:99: T__24
                {
                mT__24(); 

                }
                break;
            case 17 :
                // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1:105: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 18 :
                // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1:113: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 19 :
                // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1:125: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 20 :
                // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1:141: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 21 :
                // ../org.cfeditor.editors/src-gen/org/cfeditor/parser/antlr/internal/InternalCfengine.g:1:149: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\5\uffff\1\32\3\uffff\1\37\1\uffff\1\23\1\uffff\1\23\1\uffff\2\23"+
        "\7\uffff\2\32\16\uffff\3\32\1\55\1\32\1\uffff\1\57\1\uffff";
    static final String DFA9_eofS =
        "\60\uffff";
    static final String DFA9_minS =
        "\1\0\4\uffff\1\157\3\uffff\1\72\1\uffff\1\76\1\uffff\1\50\1\uffff"+
        "\2\0\7\uffff\1\156\1\144\16\uffff\1\144\1\171\1\154\1\60\1\145\1"+
        "\uffff\1\60\1\uffff";
    static final String DFA9_maxS =
        "\1\uffff\4\uffff\1\165\3\uffff\1\72\1\uffff\1\76\1\uffff\1\173\1"+
        "\uffff\2\uffff\7\uffff\1\156\1\144\16\uffff\1\144\1\171\1\154\1"+
        "\172\1\145\1\uffff\1\172\1\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\7\1\10\1\uffff\1\13\1\uffff"+
        "\1\15\1\uffff\1\21\2\uffff\1\23\1\24\1\25\1\1\1\2\1\3\1\4\2\uffff"+
        "\1\21\1\6\1\7\1\10\1\12\1\11\1\13\1\14\1\15\1\17\1\20\1\22\1\23"+
        "\1\24\5\uffff\1\16\1\uffff\1\5";
    static final String DFA9_specialS =
        "\1\2\16\uffff\1\1\1\0\37\uffff}>";
    static final String[] DFA9_transitionS = {
            "\11\23\2\22\2\23\1\22\22\23\1\22\1\2\1\17\1\21\1\15\2\23\1\20"+
            "\1\3\1\4\2\23\1\6\1\23\1\1\13\23\1\11\1\12\1\23\1\13\2\23\1"+
            "\14\32\16\4\23\1\16\1\23\1\16\1\5\30\16\1\7\1\23\1\10\uff82"+
            "\23",
            "",
            "",
            "",
            "",
            "\1\31\5\uffff\1\30",
            "",
            "",
            "",
            "\1\36",
            "",
            "\1\41",
            "",
            "\1\43\122\uffff\1\44",
            "",
            "\0\45",
            "\0\45",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\50",
            "\1\51",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\52",
            "\1\53",
            "\1\54",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\56",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | RULE_ID | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_16 = input.LA(1);

                        s = -1;
                        if ( ((LA9_16>='\u0000' && LA9_16<='\uFFFF')) ) {s = 37;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_15 = input.LA(1);

                        s = -1;
                        if ( ((LA9_15>='\u0000' && LA9_15<='\uFFFF')) ) {s = 37;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_0 = input.LA(1);

                        s = -1;
                        if ( (LA9_0=='.') ) {s = 1;}

                        else if ( (LA9_0=='!') ) {s = 2;}

                        else if ( (LA9_0=='(') ) {s = 3;}

                        else if ( (LA9_0==')') ) {s = 4;}

                        else if ( (LA9_0=='b') ) {s = 5;}

                        else if ( (LA9_0==',') ) {s = 6;}

                        else if ( (LA9_0=='{') ) {s = 7;}

                        else if ( (LA9_0=='}') ) {s = 8;}

                        else if ( (LA9_0==':') ) {s = 9;}

                        else if ( (LA9_0==';') ) {s = 10;}

                        else if ( (LA9_0=='=') ) {s = 11;}

                        else if ( (LA9_0=='@') ) {s = 12;}

                        else if ( (LA9_0=='$') ) {s = 13;}

                        else if ( ((LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||LA9_0=='a'||(LA9_0>='c' && LA9_0<='z')) ) {s = 14;}

                        else if ( (LA9_0=='\"') ) {s = 15;}

                        else if ( (LA9_0=='\'') ) {s = 16;}

                        else if ( (LA9_0=='#') ) {s = 17;}

                        else if ( ((LA9_0>='\t' && LA9_0<='\n')||LA9_0=='\r'||LA9_0==' ') ) {s = 18;}

                        else if ( ((LA9_0>='\u0000' && LA9_0<='\b')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\u001F')||(LA9_0>='%' && LA9_0<='&')||(LA9_0>='*' && LA9_0<='+')||LA9_0=='-'||(LA9_0>='/' && LA9_0<='9')||LA9_0=='<'||(LA9_0>='>' && LA9_0<='?')||(LA9_0>='[' && LA9_0<='^')||LA9_0=='`'||LA9_0=='|'||(LA9_0>='~' && LA9_0<='\uFFFF')) ) {s = 19;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}