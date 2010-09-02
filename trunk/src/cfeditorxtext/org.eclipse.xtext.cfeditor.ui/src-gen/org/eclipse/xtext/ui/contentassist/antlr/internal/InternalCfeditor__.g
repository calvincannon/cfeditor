lexer grammar InternalCfeditor;
@header {
package org.eclipse.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T10 : ';' ;
T11 : 'access' ;
T12 : 'classes' ;
T13 : 'commands' ;
T14 : 'databases' ;
T15 : 'environments' ;
T16 : 'files' ;
T17 : 'inferences' ;
T18 : 'interfaces' ;
T19 : 'measurements' ;
T20 : 'methods' ;
T21 : 'occurrences' ;
T22 : 'outputs' ;
T23 : 'packages' ;
T24 : 'processes' ;
T25 : 'reports' ;
T26 : 'roles' ;
T27 : 'services' ;
T28 : 'storage' ;
T29 : 'topics' ;
T30 : 'vars' ;
T31 : 'common' ;
T32 : 'agent' ;
T33 : 'server' ;
T34 : 'monitor' ;
T35 : 'runagent' ;
T36 : 'executor' ;
T37 : 'knowledge' ;
T38 : 'reporter' ;
T39 : 'bundle' ;
T40 : '{' ;
T41 : '}' ;
T42 : ':' ;
T43 : 'body' ;
T44 : ',' ;
T45 : '=>' ;
T46 : 'control' ;

// $ANTLR src "../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g" 1621
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g" 1623
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g" 1625
RULE_STRING : ('"' (~(('\\'|'"'))|'\\' .)* '"'|'\'' (~(('\\'|'\''))|'\\' .)* '\'');

// $ANTLR src "../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g" 1627
RULE_SL_COMMENT : '#' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g" 1629
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g" 1631
RULE_ANY_OTHER : .;


