lexer grammar InternalCfeditor;
@header {
package edu.kit.scc.cfeditor.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T10 : '=>' ;
T11 : ';' ;
T12 : ',' ;
T13 : '(' ;
T14 : ')' ;
T15 : '!' ;
T16 : 'bundle' ;
T17 : '{' ;
T18 : '}' ;
T19 : ':' ;
T20 : '@' ;
T21 : 'body' ;
T22 : '$(' ;
T23 : '${' ;
T24 : '::' ;

// $ANTLR src "../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g" 2842
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g" 2844
RULE_INT : ('0'..'9')+;

// $ANTLR src "../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g" 2846
RULE_STRING : ('"' (~(('\\'|'"'))|'\\' .)* '"'|'\'' (~(('\\'|'\''))|'\\' .)* '\'');

// $ANTLR src "../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g" 2848
RULE_SL_COMMENT : '#' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g" 2850
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../edu.kit.scc.cfeditor.ui/src-gen/edu/kit/scc/cfeditor/ui/contentassist/antlr/internal/InternalCfeditor.g" 2852
RULE_ANY_OTHER : .;


