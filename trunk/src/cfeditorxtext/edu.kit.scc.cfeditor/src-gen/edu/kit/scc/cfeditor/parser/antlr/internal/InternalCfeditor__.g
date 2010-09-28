lexer grammar InternalCfeditor;
@header {
package edu.kit.scc.cfeditor.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T10 : '=>' ;
T11 : ';' ;
T12 : ',' ;
T13 : '(' ;
T14 : ')' ;
T15 : 'bundle' ;
T16 : '{' ;
T17 : ':' ;
T18 : '}' ;
T19 : 'body' ;

// $ANTLR src "../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g" 1049
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g" 1051
RULE_INT : ('0'..'9')+;

// $ANTLR src "../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g" 1053
RULE_STRING : ('"' (~(('\\'|'"'))|'\\' .)* '"'|'\'' (~(('\\'|'\''))|'\\' .)* '\'');

// $ANTLR src "../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g" 1055
RULE_SL_COMMENT : '#' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g" 1057
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g" 1059
RULE_ANY_OTHER : .;


