
/*
* generated by Xtext
*/
lexer grammar InternalSqlLexer;


@header {
package com.jaspersoft.studio.data.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}




KEYWORD_56 : ('R'|'r')('I'|'i')('G'|'g')('H'|'h')('T'|'t')' '('O'|'o')('U'|'u')('T'|'t')('E'|'e')('R'|'r')' '('J'|'j')('O'|'o')('I'|'i')('N'|'n');

KEYWORD_54 : ('F'|'f')('U'|'u')('L'|'l')('L'|'l')' '('O'|'o')('U'|'u')('T'|'t')('E'|'e')('R'|'r')' '('J'|'j')('O'|'o')('I'|'i')('N'|'n');

KEYWORD_55 : ('L'|'l')('E'|'e')('F'|'f')('T'|'t')' '('O'|'o')('U'|'u')('T'|'t')('E'|'e')('R'|'r')' '('J'|'j')('O'|'o')('I'|'i')('N'|'n');

KEYWORD_52 : ('I'|'i')('S'|'s')' '('N'|'n')('O'|'o')('T'|'t')' '('N'|'n')('U'|'u')('L'|'l')('L'|'l');

KEYWORD_53 : ('N'|'n')('O'|'o')('T'|'t')' '('B'|'b')('E'|'e')('T'|'t')('W'|'w')('E'|'e')('E'|'e')('N'|'n');

KEYWORD_50 : ('C'|'c')('R'|'r')('O'|'o')('S'|'s')('S'|'s')' '('J'|'j')('O'|'o')('I'|'i')('N'|'n');

KEYWORD_51 : ('I'|'i')('N'|'n')('N'|'n')('E'|'e')('R'|'r')' '('J'|'j')('O'|'o')('I'|'i')('N'|'n');

KEYWORD_49 : '['('B'|'b')('E'|'e')('T'|'t')('W'|'w')('E'|'e')('E'|'e')('N'|'n')']';

KEYWORD_40 : ('B'|'b')('E'|'e')('T'|'t')('W'|'w')('E'|'e')('E'|'e')('N'|'n')']';

KEYWORD_41 : ('D'|'d')('I'|'i')('S'|'s')('T'|'t')('I'|'i')('N'|'n')('C'|'c')('T'|'t');

KEYWORD_42 : ('G'|'g')('R'|'r')('O'|'o')('U'|'u')('P'|'p')' '('B'|'b')('Y'|'y');

KEYWORD_43 : ('N'|'n')('O'|'o')('T'|'t')' '('I'|'i')('N'|'n')' ''(';

KEYWORD_44 : ('N'|'n')('O'|'o')('T'|'t')' '('L'|'l')('I'|'i')('K'|'k')('E'|'e');

KEYWORD_45 : ('N'|'n')('O'|'o')('T'|'t')('E'|'e')('Q'|'q')('U'|'u')('A'|'a')('L'|'l');

KEYWORD_46 : ('O'|'o')('R'|'r')('D'|'d')('E'|'e')('R'|'r')' '('B'|'b')('Y'|'y');

KEYWORD_47 : '['('B'|'b')('E'|'e')('T'|'t')('W'|'w')('E'|'e')('E'|'e')('N'|'n');

KEYWORD_48 : '['('G'|'g')('R'|'r')('E'|'e')('A'|'a')('T'|'t')('E'|'e')('R'|'r');

KEYWORD_37 : ('B'|'b')('E'|'e')('T'|'t')('W'|'w')('E'|'e')('E'|'e')('N'|'n');

KEYWORD_38 : ('G'|'g')('R'|'r')('E'|'e')('A'|'a')('T'|'t')('E'|'e')('R'|'r');

KEYWORD_39 : ('I'|'i')('S'|'s')' '('N'|'n')('U'|'u')('L'|'l')('L'|'l');

KEYWORD_35 : ('H'|'h')('A'|'a')('V'|'v')('I'|'i')('N'|'n')('G'|'g');

KEYWORD_36 : ('S'|'s')('E'|'e')('L'|'l')('E'|'e')('C'|'c')('T'|'t');

KEYWORD_30 : ('E'|'e')('Q'|'q')('U'|'u')('A'|'a')('L'|'l');

KEYWORD_31 : ('L'|'l')('E'|'e')('S'|'s')('S'|'s')']';

KEYWORD_32 : ('N'|'n')('O'|'o')('T'|'t')('I'|'i')('N'|'n');

KEYWORD_33 : ('U'|'u')('N'|'n')('I'|'i')('O'|'o')('N'|'n');

KEYWORD_34 : ('W'|'w')('H'|'h')('E'|'e')('R'|'r')('E'|'e');

KEYWORD_24 : '$'('P'|'p')'!''{';

KEYWORD_25 : ('D'|'d')('E'|'e')('S'|'s')('C'|'c');

KEYWORD_26 : ('F'|'f')('R'|'r')('O'|'o')('M'|'m');

KEYWORD_27 : ('I'|'i')('N'|'n')' ''(';

KEYWORD_28 : ('L'|'l')('E'|'e')('S'|'s')('S'|'s');

KEYWORD_29 : ('L'|'l')('I'|'i')('K'|'k')('E'|'e');

KEYWORD_20 : '$'('P'|'p')'{';

KEYWORD_21 : '$'('X'|'x')'{';

KEYWORD_22 : ('A'|'a')('N'|'n')('D'|'d');

KEYWORD_23 : ('A'|'a')('S'|'s')('C'|'c');

KEYWORD_12 : '<''=';

KEYWORD_13 : '<''>';

KEYWORD_14 : '>''=';

KEYWORD_15 : ('A'|'a')('S'|'s');

KEYWORD_16 : ('I'|'i')('N'|'n');

KEYWORD_17 : ('O'|'o')('N'|'n');

KEYWORD_18 : ('O'|'o')('R'|'r');

KEYWORD_19 : '|''|';

KEYWORD_1 : '(';

KEYWORD_2 : ')';

KEYWORD_3 : '+';

KEYWORD_4 : ',';

KEYWORD_5 : '-';

KEYWORD_6 : '.';

KEYWORD_7 : '/';

KEYWORD_8 : '<';

KEYWORD_9 : '=';

KEYWORD_10 : '>';

KEYWORD_11 : '}';



RULE_STAR : '*';

RULE_SIGNED_INT : '-'? ('0'..'9')+;

RULE_TIMESTAMP : RULE_DATE ' ' RULE_TIME;

RULE_DATE : '\'' '0'..'9' '0'..'9' '0'..'9' '0'..'9' '-' '0'..'1' '0'..'9' '-' '0'..'3' '0'..'9' '\'';

RULE_TIME : '\'' '0'..'9' '0'..'9' ':' '0'..'9' '0'..'9' ':' '0'..'1' '0'..'9' '.' '0'..'9' '0'..'9' '0'..'9' '\'';

RULE_SIGNED_DOUBLE : '-'? ('0'..'9')+ ('.' ('0'..'9')+)?;

RULE_SL_COMMENT : ('--'|'#'|'//') ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;



