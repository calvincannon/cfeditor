lexer grammar InternalCfeditor;
@header {
package org.eclipse.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T10 : 'bundle' ;
T11 : '{' ;
T12 : ':' ;
T13 : '}' ;
T14 : 'body' ;
T15 : 'control' ;
T16 : ';' ;
T17 : ',' ;
T18 : '=>' ;
T19 : 'access' ;
T20 : 'classes' ;
T21 : 'commands' ;
T22 : 'databases' ;
T23 : 'environments' ;
T24 : 'files' ;
T25 : 'inferences' ;
T26 : 'interfaces' ;
T27 : 'measurements' ;
T28 : 'methods' ;
T29 : 'occurrences' ;
T30 : 'outputs' ;
T31 : 'packages' ;
T32 : 'processes' ;
T33 : 'reports' ;
T34 : 'roles' ;
T35 : 'services' ;
T36 : 'storage' ;
T37 : 'topics' ;
T38 : 'vars' ;
T39 : 'common' ;
T40 : 'agent' ;
T41 : 'server' ;
T42 : 'monitor' ;
T43 : 'runagent' ;
T44 : 'executor' ;
T45 : 'knowledge' ;
T46 : 'reporter' ;

// $ANTLR src "../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g" 1142
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g" 1144
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g" 1146
RULE_STRING : ('"' (~(('\\'|'"'))|'\\' .)* '"'|'\'' (~(('\\'|'\''))|'\\' .)* '\'');

// $ANTLR src "../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g" 1148
RULE_SL_COMMENT : '#' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g" 1150
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.xtext.cfeditor/src-gen/org/eclipse/xtext/parser/antlr/internal/InternalCfeditor.g" 1152
RULE_ANY_OTHER : .;


