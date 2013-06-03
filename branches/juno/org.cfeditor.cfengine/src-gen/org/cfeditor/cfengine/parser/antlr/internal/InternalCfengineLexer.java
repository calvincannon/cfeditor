package org.cfeditor.cfengine.parser.antlr.internal;

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
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=6;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=7;
    public static final int RULE_ML_COMMENT=10;
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
    public static final int RULE_INT=9;
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
    public String getGrammarFileName() { return "../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:11:7: ( '.' )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:11:9: '.'
            {
            match('.'); 

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
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:12:7: ( '|' )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:12:9: '|'
            {
            match('|'); 

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
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:13:7: ( '!' )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:13:9: '!'
            {
            match('!'); 

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
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:14:7: ( '(' )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:14:9: '('
            {
            match('('); 

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
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:15:7: ( ')' )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:15:9: ')'
            {
            match(')'); 

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
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:16:7: ( '!(' )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:16:9: '!('
            {
            match("!("); 


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
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:17:7: ( '! (' )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:17:9: '! ('
            {
            match("! ("); 


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
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:18:7: ( 'bundle' )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:18:9: 'bundle'
            {
            match("bundle"); 


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
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:19:7: ( ',' )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:19:9: ','
            {
            match(','); 

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
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:20:7: ( '{' )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:20:9: '{'
            {
            match('{'); 

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
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:21:7: ( '}' )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:21:9: '}'
            {
            match('}'); 

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
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:22:7: ( ':' )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:22:9: ':'
            {
            match(':'); 

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
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:23:7: ( '::' )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:23:9: '::'
            {
            match("::"); 


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
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:24:7: ( ';' )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:24:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:25:7: ( '=>' )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:25:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:26:7: ( '@' )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:26:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:27:7: ( 'body' )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:27:9: 'body'
            {
            match("body"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:28:7: ( '$(' )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:28:9: '$('
            {
            match("$("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:29:7: ( '${' )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:29:9: '${'
            {
            match("${"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1554:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '\\\\s' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1554:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '\\\\s' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1554:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '\\\\s' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt1=1;
                }
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                {
                alt1=2;
                }
                break;
            case '_':
                {
                alt1=3;
                }
                break;
            case '\\':
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1554:12: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }
                    break;
                case 2 :
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1554:21: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }
                    break;
                case 3 :
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1554:30: '_'
                    {
                    match('_'); 

                    }
                    break;
                case 4 :
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1554:34: '\\\\s'
                    {
                    match("\\s"); 


                    }
                    break;

            }

            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1554:41: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:
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
            	    break loop2;
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
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1556:13: ( ( '\"' (~ ( ( '\\\\' | '\"' ) ) | '\\\\' . )* '\"' | '\\'' (~ ( ( '\\\\' | '\\'' ) ) | '\\\\' . )* '\\'' ) )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1556:15: ( '\"' (~ ( ( '\\\\' | '\"' ) ) | '\\\\' . )* '\"' | '\\'' (~ ( ( '\\\\' | '\\'' ) ) | '\\\\' . )* '\\'' )
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1556:15: ( '\"' (~ ( ( '\\\\' | '\"' ) ) | '\\\\' . )* '\"' | '\\'' (~ ( ( '\\\\' | '\\'' ) ) | '\\\\' . )* '\\'' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\"') ) {
                alt5=1;
            }
            else if ( (LA5_0=='\'') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1556:16: '\"' (~ ( ( '\\\\' | '\"' ) ) | '\\\\' . )* '\"'
                    {
                    match('\"'); 
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1556:20: (~ ( ( '\\\\' | '\"' ) ) | '\\\\' . )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                            alt3=1;
                        }
                        else if ( (LA3_0=='\\') ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1556:21: ~ ( ( '\\\\' | '\"' ) )
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
                    	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1556:35: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1556:48: '\\'' (~ ( ( '\\\\' | '\\'' ) ) | '\\\\' . )* '\\''
                    {
                    match('\''); 
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1556:53: (~ ( ( '\\\\' | '\\'' ) ) | '\\\\' . )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=1;
                        }
                        else if ( (LA4_0=='\\') ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1556:54: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1556:69: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
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
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1558:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1558:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1558:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1558:23: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop6;
                }
            } while (true);

            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1558:39: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1558:40: ( '\\r' )? '\\n'
                    {
                    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1558:40: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1558:40: '\\r'
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
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1560:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1560:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1560:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\t' && LA9_0<='\n')||LA9_0=='\r'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:
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
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1562:16: ( . )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1562:18: .
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1564:10: ( ( '0' .. '9' )+ )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1564:12: ( '0' .. '9' )+
            {
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1564:12: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1564:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1566:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1566:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1566:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1566:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    public void mTokens() throws RecognitionException {
        // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | RULE_ID | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER | RULE_INT | RULE_ML_COMMENT )
        int alt12=26;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1:124: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 21 :
                // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1:132: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 22 :
                // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1:144: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 23 :
                // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1:160: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 24 :
                // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1:168: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;
            case 25 :
                // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1:183: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 26 :
                // ../org.cfeditor.cfengine/src-gen/org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.g:1:192: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\3\uffff\1\36\2\uffff\1\43\3\uffff\1\50\1\uffff\1\31\1\uffff\1\31"+
        "\3\uffff\3\31\2\uffff\2\31\10\uffff\2\43\20\uffff\3\43\1\70\1\43"+
        "\1\uffff\1\72\1\uffff";
    static final String DFA12_eofS =
        "\73\uffff";
    static final String DFA12_minS =
        "\1\0\2\uffff\1\40\2\uffff\1\157\3\uffff\1\72\1\uffff\1\76\1\uffff"+
        "\1\50\3\uffff\1\163\2\0\2\uffff\1\60\1\52\10\uffff\1\156\1\144\20"+
        "\uffff\1\144\1\171\1\154\1\60\1\145\1\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\2\uffff\1\50\2\uffff\1\165\3\uffff\1\72\1\uffff\1\76\1"+
        "\uffff\1\173\3\uffff\1\163\2\uffff\2\uffff\1\71\1\52\10\uffff\1"+
        "\156\1\144\20\uffff\1\144\1\171\1\154\1\172\1\145\1\uffff\1\172"+
        "\1\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\uffff\1\11\1\12\1\13\1\uffff"+
        "\1\16\1\uffff\1\20\1\uffff\3\24\3\uffff\1\26\1\27\2\uffff\1\30\1"+
        "\1\1\2\1\6\1\7\1\3\1\4\1\5\2\uffff\1\24\1\11\1\12\1\13\1\15\1\14"+
        "\1\16\1\17\1\20\1\22\1\23\1\25\1\26\1\27\1\31\1\32\5\uffff\1\21"+
        "\1\uffff\1\10";
    static final String DFA12_specialS =
        "\1\2\22\uffff\1\1\1\0\46\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\31\2\26\2\31\1\26\22\31\1\26\1\3\1\23\1\25\1\16\2\31\1\24"+
            "\1\4\1\5\2\31\1\7\1\31\1\1\1\30\12\27\1\12\1\13\1\31\1\14\2"+
            "\31\1\15\32\20\1\31\1\22\2\31\1\21\1\31\1\17\1\6\30\17\1\10"+
            "\1\2\1\11\uff82\31",
            "",
            "",
            "\1\35\7\uffff\1\34",
            "",
            "",
            "\1\42\5\uffff\1\41",
            "",
            "",
            "",
            "\1\47",
            "",
            "\1\52",
            "",
            "\1\54\122\uffff\1\55",
            "",
            "",
            "",
            "\1\43",
            "\0\56",
            "\0\56",
            "",
            "",
            "\12\61",
            "\1\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\63",
            "\1\64",
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
            "",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\71",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | RULE_ID | RULE_STRING | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER | RULE_INT | RULE_ML_COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_20 = input.LA(1);

                        s = -1;
                        if ( ((LA12_20>='\u0000' && LA12_20<='\uFFFF')) ) {s = 46;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_19 = input.LA(1);

                        s = -1;
                        if ( ((LA12_19>='\u0000' && LA12_19<='\uFFFF')) ) {s = 46;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='.') ) {s = 1;}

                        else if ( (LA12_0=='|') ) {s = 2;}

                        else if ( (LA12_0=='!') ) {s = 3;}

                        else if ( (LA12_0=='(') ) {s = 4;}

                        else if ( (LA12_0==')') ) {s = 5;}

                        else if ( (LA12_0=='b') ) {s = 6;}

                        else if ( (LA12_0==',') ) {s = 7;}

                        else if ( (LA12_0=='{') ) {s = 8;}

                        else if ( (LA12_0=='}') ) {s = 9;}

                        else if ( (LA12_0==':') ) {s = 10;}

                        else if ( (LA12_0==';') ) {s = 11;}

                        else if ( (LA12_0=='=') ) {s = 12;}

                        else if ( (LA12_0=='@') ) {s = 13;}

                        else if ( (LA12_0=='$') ) {s = 14;}

                        else if ( (LA12_0=='a'||(LA12_0>='c' && LA12_0<='z')) ) {s = 15;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')) ) {s = 16;}

                        else if ( (LA12_0=='_') ) {s = 17;}

                        else if ( (LA12_0=='\\') ) {s = 18;}

                        else if ( (LA12_0=='\"') ) {s = 19;}

                        else if ( (LA12_0=='\'') ) {s = 20;}

                        else if ( (LA12_0=='#') ) {s = 21;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 22;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 23;}

                        else if ( (LA12_0=='/') ) {s = 24;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='%' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||LA12_0=='-'||LA12_0=='<'||(LA12_0>='>' && LA12_0<='?')||LA12_0=='['||(LA12_0>=']' && LA12_0<='^')||LA12_0=='`'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 25;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}