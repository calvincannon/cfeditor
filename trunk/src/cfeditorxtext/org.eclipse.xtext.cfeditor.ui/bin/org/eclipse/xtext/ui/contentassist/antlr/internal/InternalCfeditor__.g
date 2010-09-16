lexer grammar InternalCfeditor;
@header {
package org.eclipse.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T10 : '=>' ;
T11 : ';' ;
T12 : ',' ;
T13 : '(' ;
T14 : ')' ;
T15 : 'bundle' ;
T16 : '{' ;
T17 : '}' ;
T18 : ':' ;
T19 : 'body' ;

// $ANTLR src "../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g" 1849
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g" 1851
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g" 1853
RULE_STRING : ('"' (~(('\\'|'"'))|'\\' .)* '"'|'\'' (~(('\\'|'\''))|'\\' .)* '\'');

// $ANTLR src "../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g" 1855
RULE_SL_COMMENT : '#' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g" 1857
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.xtext.cfeditor.ui/src-gen/org/eclipse/xtext/ui/contentassist/antlr/internal/InternalCfeditor.g" 1859
RULE_ANY_OTHER : .;


