lexer grammar InternalCfeditor;
@header {
package edu.kit.scc.cfeditor.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T10 : '(' ;
T11 : ')' ;
T12 : '|' ;
T13 : '!' ;
T14 : '.' ;
T15 : '=>' ;
T16 : ';' ;
T17 : ',' ;
T18 : 'bundle' ;
T19 : '{' ;
T20 : ':' ;
T21 : '@' ;
T22 : '}' ;
T23 : 'body' ;
T24 : '$(' ;
T25 : '${' ;
T26 : '::' ;

// $ANTLR src "../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g" 1280
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g" 1282
RULE_INT : ('0'..'9')+;

// $ANTLR src "../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g" 1284
RULE_STRING : ('"' (~(('\\'|'"'))|'\\' .)* '"'|'\'' (~(('\\'|'\''))|'\\' .)* '\'');

// $ANTLR src "../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g" 1286
RULE_SL_COMMENT : '#' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g" 1288
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../edu.kit.scc.cfeditor/src-gen/edu/kit/scc/cfeditor/parser/antlr/internal/InternalCfeditor.g" 1290
RULE_ANY_OTHER : .;


