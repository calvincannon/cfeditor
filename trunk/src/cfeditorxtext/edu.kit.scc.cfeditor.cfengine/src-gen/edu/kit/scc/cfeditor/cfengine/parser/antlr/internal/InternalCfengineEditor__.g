lexer grammar InternalCfengineEditor;
@header {
package edu.kit.scc.cfeditor.cfengine.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T10 : '.' ;
T11 : '!' ;
T12 : '(' ;
T13 : ')' ;
T14 : '=>' ;
T15 : ';' ;
T16 : ',' ;
T17 : 'bundle' ;
T18 : '{' ;
T19 : '}' ;
T20 : ':' ;
T21 : '::' ;
T22 : 'body' ;
T23 : '@' ;
T24 : '$(' ;
T25 : '${' ;

// $ANTLR src "../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g" 1825
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g" 1827
RULE_INT : ('0'..'9')+;

// $ANTLR src "../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g" 1829
RULE_STRING : ('"' (~(('\\'|'"'))|'\\' .)* '"'|'\'' (~(('\\'|'\''))|'\\' .)* '\'');

// $ANTLR src "../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g" 1831
RULE_SL_COMMENT : '#' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g" 1833
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../edu.kit.scc.cfeditor.cfengine/src-gen/edu/kit/scc/cfeditor/cfengine/parser/antlr/internal/InternalCfengineEditor.g" 1835
RULE_ANY_OTHER : .;


