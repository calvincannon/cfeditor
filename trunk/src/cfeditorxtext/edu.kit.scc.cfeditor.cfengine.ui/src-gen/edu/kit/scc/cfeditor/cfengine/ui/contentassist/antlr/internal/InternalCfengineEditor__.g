lexer grammar InternalCfengineEditor;
@header {
package edu.kit.scc.cfeditor.cfengine.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T10 : '=>' ;
T11 : ';' ;
T12 : ',' ;
T13 : '(' ;
T14 : ')' ;
T15 : '.' ;
T16 : '!' ;
T17 : 'bundle' ;
T18 : '{' ;
T19 : '}' ;
T20 : ':' ;
T21 : '::' ;
T22 : '@' ;
T23 : 'body' ;
T24 : '$(' ;
T25 : '${' ;

// $ANTLR src "../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g" 4628
RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g" 4630
RULE_INT : ('0'..'9')+;

// $ANTLR src "../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g" 4632
RULE_STRING : ('"' (~(('\\'|'"'))|'\\' .)* '"'|'\'' (~(('\\'|'\''))|'\\' .)* '\'');

// $ANTLR src "../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g" 4634
RULE_SL_COMMENT : '#' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g" 4636
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../edu.kit.scc.cfeditor.cfengine.ui/src-gen/edu/kit/scc/cfeditor/cfengine/ui/contentassist/antlr/internal/InternalCfengineEditor.g" 4638
RULE_ANY_OTHER : .;


