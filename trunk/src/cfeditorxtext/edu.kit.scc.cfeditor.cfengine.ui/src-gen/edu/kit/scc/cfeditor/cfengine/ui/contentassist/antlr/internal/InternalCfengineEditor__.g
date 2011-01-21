lexer grammar InternalCfengineEditor;
@header {
package edu.kit.scc.cfeditor.cfengine.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
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
T20 : '}' ;
T21 : ':' ;
T22 : '@' ;
T23 : 'body' ;
T24 : '$(' ;
T25 : '${' ;
T26 : '::' ;

// $ANTLR src "../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g" 2860
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g" 2862
RULE_INT : ('0'..'9')+;

// $ANTLR src "../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g" 2864
RULE_STRING : ('"' (~(('\\'|'"'))|'\\' .)* '"'|'\'' (~(('\\'|'\''))|'\\' .)* '\'');

// $ANTLR src "../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g" 2866
RULE_SL_COMMENT : '#' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g" 2868
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g" 2870
RULE_ANY_OTHER : .;


