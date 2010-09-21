lexer grammar InternalCfeditor;
@header {
package org.eclipse.xtext.parser.antlr.internal;

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

// $ANTLR src "../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g" 1033
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g" 1035
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g" 1037
RULE_STRING : ('"' (~(('\\'|'"'))|'\\' .)* '"'|'\'' (~(('\\'|'\''))|'\\' .)* '\'');

// $ANTLR src "../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g" 1039
RULE_SL_COMMENT : '#' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g" 1041
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g" 1043
RULE_ANY_OTHER : .;


