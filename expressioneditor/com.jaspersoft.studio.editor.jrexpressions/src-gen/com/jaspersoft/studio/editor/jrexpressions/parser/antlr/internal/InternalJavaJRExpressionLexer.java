package com.jaspersoft.studio.editor.jrexpressions.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJavaJRExpressionLexer extends Lexer {
    public static final int T__66=66;
    public static final int RULE_INTLITERAL=25;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_GTE=16;
    public static final int RULE_INSTANCEOF=13;
    public static final int RULE_HEXDIGIT=39;
    public static final int RULE_LTE=18;
    public static final int RULE_LBRACKET=22;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int RULE_NOT=10;
    public static final int RULE_CHARLITERAL=29;
    public static final int RULE_LT=17;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int RULE_FALSE=32;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_DOT=14;
    public static final int T__53=53;
    public static final int RULE_FLOATLITERAL=27;
    public static final int T__54=54;
    public static final int RULE_STRINGLITERAL=30;
    public static final int RULE_NONINTEGERNUMBER=41;
    public static final int RULE_JAVAIDDIGIT=47;
    public static final int RULE_LPAREN=7;
    public static final int T__59=59;
    public static final int RULE_GT=15;
    public static final int RULE_FLOATSUFFIX=42;
    public static final int RULE_LBRACE=20;
    public static final int RULE_LONGSUFFIX=37;
    public static final int RULE_RBRACKET=23;
    public static final int RULE_SEMI=45;
    public static final int RULE_ESCAPESEQUENCE=44;
    public static final int RULE_NOTEQUAL=12;
    public static final int RULE_RBRACE=21;
    public static final int RULE_DOUBLELITERAL=28;
    public static final int RULE_HEXPREFIX=38;
    public static final int RULE_IDENTIFIER=24;
    public static final int RULE_COMMA=9;
    public static final int RULE_VARIABLETOKEN=6;
    public static final int RULE_EQUAL=11;
    public static final int RULE_BRACED_JRIDENTIFIER=34;
    public static final int RULE_SL_COMMENT=49;
    public static final int RULE_JRIDENTIFIER=35;
    public static final int RULE_PARAMETERTOKEN=5;
    public static final int RULE_NULL=33;
    public static final int RULE_LETTER=46;
    public static final int RULE_TRUE=31;
    public static final int RULE_ML_COMMENT=48;
    public static final int RULE_DOUBLESUFFIX=43;
    public static final int RULE_LONGLITERAL=26;
    public static final int RULE_NEW=19;
    public static final int RULE_EXPONENT=40;
    public static final int RULE_INTEGERNUMBER=36;
    public static final int RULE_RPAREN=8;
    public static final int RULE_WS=50;
    public static final int RULE_FIELDTOKEN=4;

    // delegates
    // delegators

    public InternalJavaJRExpressionLexer() {;} 
    public InternalJavaJRExpressionLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalJavaJRExpressionLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g"; }

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:11:7: ( '?' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:11:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:12:7: ( ':' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:12:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:13:7: ( '||' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:13:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:14:7: ( '&&' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:14:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:15:7: ( '+' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:15:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:16:7: ( '-' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:16:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:17:7: ( '*' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:17:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:18:7: ( '/' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:18:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:19:7: ( 'boolean' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:19:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:20:7: ( 'char' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:20:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:21:7: ( 'byte' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:21:9: 'byte'
            {
            match("byte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:22:7: ( 'short' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:22:9: 'short'
            {
            match("short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:23:7: ( 'int' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:23:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:24:7: ( 'long' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:24:9: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:25:7: ( 'float' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:25:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:26:7: ( 'double' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:26:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "RULE_FIELDTOKEN"
    public final void mRULE_FIELDTOKEN() throws RecognitionException {
        try {
            int _type = RULE_FIELDTOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1971:17: ( '$F' RULE_BRACED_JRIDENTIFIER )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1971:19: '$F' RULE_BRACED_JRIDENTIFIER
            {
            match("$F"); 

            mRULE_BRACED_JRIDENTIFIER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FIELDTOKEN"

    // $ANTLR start "RULE_VARIABLETOKEN"
    public final void mRULE_VARIABLETOKEN() throws RecognitionException {
        try {
            int _type = RULE_VARIABLETOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1973:20: ( '$V' RULE_BRACED_JRIDENTIFIER )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1973:22: '$V' RULE_BRACED_JRIDENTIFIER
            {
            match("$V"); 

            mRULE_BRACED_JRIDENTIFIER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VARIABLETOKEN"

    // $ANTLR start "RULE_PARAMETERTOKEN"
    public final void mRULE_PARAMETERTOKEN() throws RecognitionException {
        try {
            int _type = RULE_PARAMETERTOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1975:21: ( '$P' RULE_BRACED_JRIDENTIFIER )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1975:23: '$P' RULE_BRACED_JRIDENTIFIER
            {
            match("$P"); 

            mRULE_BRACED_JRIDENTIFIER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PARAMETERTOKEN"

    // $ANTLR start "RULE_BRACED_JRIDENTIFIER"
    public final void mRULE_BRACED_JRIDENTIFIER() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1977:35: ( RULE_LBRACE RULE_JRIDENTIFIER RULE_RBRACE )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1977:37: RULE_LBRACE RULE_JRIDENTIFIER RULE_RBRACE
            {
            mRULE_LBRACE(); 
            mRULE_JRIDENTIFIER(); 
            mRULE_RBRACE(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BRACED_JRIDENTIFIER"

    // $ANTLR start "RULE_LONGLITERAL"
    public final void mRULE_LONGLITERAL() throws RecognitionException {
        try {
            int _type = RULE_LONGLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1979:18: ( RULE_INTEGERNUMBER RULE_LONGSUFFIX )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1979:20: RULE_INTEGERNUMBER RULE_LONGSUFFIX
            {
            mRULE_INTEGERNUMBER(); 
            mRULE_LONGSUFFIX(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LONGLITERAL"

    // $ANTLR start "RULE_INTLITERAL"
    public final void mRULE_INTLITERAL() throws RecognitionException {
        try {
            int _type = RULE_INTLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1981:17: ( RULE_INTEGERNUMBER )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1981:19: RULE_INTEGERNUMBER
            {
            mRULE_INTEGERNUMBER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTLITERAL"

    // $ANTLR start "RULE_INTEGERNUMBER"
    public final void mRULE_INTEGERNUMBER() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1983:29: ( ( '0' | '1' .. '9' ( '0' .. '9' )* | '0' ( '0' .. '7' )+ | RULE_HEXPREFIX ( RULE_HEXDIGIT )+ ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1983:31: ( '0' | '1' .. '9' ( '0' .. '9' )* | '0' ( '0' .. '7' )+ | RULE_HEXPREFIX ( RULE_HEXDIGIT )+ )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1983:31: ( '0' | '1' .. '9' ( '0' .. '9' )* | '0' ( '0' .. '7' )+ | RULE_HEXPREFIX ( RULE_HEXDIGIT )+ )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='0') ) {
                switch ( input.LA(2) ) {
                case 'X':
                case 'x':
                    {
                    alt4=4;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt4=3;
                    }
                    break;
                default:
                    alt4=1;}

            }
            else if ( ((LA4_0>='1' && LA4_0<='9')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1983:32: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1983:36: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1983:45: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1983:46: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1983:57: '0' ( '0' .. '7' )+
                    {
                    match('0'); 
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1983:61: ( '0' .. '7' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='7')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1983:62: '0' .. '7'
                    	    {
                    	    matchRange('0','7'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;
                case 4 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1983:73: RULE_HEXPREFIX ( RULE_HEXDIGIT )+
                    {
                    mRULE_HEXPREFIX(); 
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1983:88: ( RULE_HEXDIGIT )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='F')||(LA3_0>='a' && LA3_0<='f')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1983:88: RULE_HEXDIGIT
                    	    {
                    	    mRULE_HEXDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGERNUMBER"

    // $ANTLR start "RULE_HEXPREFIX"
    public final void mRULE_HEXPREFIX() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1985:25: ( ( '0x' | '0X' ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1985:27: ( '0x' | '0X' )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1985:27: ( '0x' | '0X' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='0') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='x') ) {
                    alt5=1;
                }
                else if ( (LA5_1=='X') ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1985:28: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1985:33: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEXPREFIX"

    // $ANTLR start "RULE_HEXDIGIT"
    public final void mRULE_HEXDIGIT() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1987:24: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1987:26: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEXDIGIT"

    // $ANTLR start "RULE_LONGSUFFIX"
    public final void mRULE_LONGSUFFIX() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1989:26: ( ( 'l' | 'L' ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1989:28: ( 'l' | 'L' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LONGSUFFIX"

    // $ANTLR start "RULE_NONINTEGERNUMBER"
    public final void mRULE_NONINTEGERNUMBER() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1991:32: ( ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( RULE_EXPONENT )? | '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? | ( '0' .. '9' )+ RULE_EXPONENT | ( '0' .. '9' )+ | RULE_HEXPREFIX ( RULE_HEXDIGIT )* '.' ( RULE_HEXDIGIT )* ( 'p' | 'P' ) ( '+' | '-' )? ( '0' .. '9' )+ ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1991:34: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( RULE_EXPONENT )? | '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? | ( '0' .. '9' )+ RULE_EXPONENT | ( '0' .. '9' )+ | RULE_HEXPREFIX ( RULE_HEXDIGIT )* '.' ( RULE_HEXDIGIT )* ( 'p' | 'P' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1991:34: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( RULE_EXPONENT )? | '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? | ( '0' .. '9' )+ RULE_EXPONENT | ( '0' .. '9' )+ | RULE_HEXPREFIX ( RULE_HEXDIGIT )* '.' ( RULE_HEXDIGIT )* ( 'p' | 'P' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            int alt17=5;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1991:35: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( RULE_EXPONENT )?
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1991:35: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1991:36: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    match('.'); 
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1991:51: ( '0' .. '9' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1991:52: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1991:63: ( RULE_EXPONENT )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E'||LA8_0=='e') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1991:63: RULE_EXPONENT
                            {
                            mRULE_EXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1991:78: '.' ( '0' .. '9' )+ ( RULE_EXPONENT )?
                    {
                    match('.'); 
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1991:82: ( '0' .. '9' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1991:83: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);

                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1991:94: ( RULE_EXPONENT )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='E'||LA10_0=='e') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1991:94: RULE_EXPONENT
                            {
                            mRULE_EXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1991:109: ( '0' .. '9' )+ RULE_EXPONENT
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1991:109: ( '0' .. '9' )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1991:110: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    mRULE_EXPONENT(); 

                    }
                    break;
                case 4 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1991:135: ( '0' .. '9' )+
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1991:135: ( '0' .. '9' )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1991:136: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                    }
                    break;
                case 5 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1991:147: RULE_HEXPREFIX ( RULE_HEXDIGIT )* '.' ( RULE_HEXDIGIT )* ( 'p' | 'P' ) ( '+' | '-' )? ( '0' .. '9' )+
                    {
                    mRULE_HEXPREFIX(); 
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1991:162: ( RULE_HEXDIGIT )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='F')||(LA13_0>='a' && LA13_0<='f')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1991:162: RULE_HEXDIGIT
                    	    {
                    	    mRULE_HEXDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match('.'); 
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1991:181: ( RULE_HEXDIGIT )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')||(LA14_0>='A' && LA14_0<='F')||(LA14_0>='a' && LA14_0<='f')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1991:181: RULE_HEXDIGIT
                    	    {
                    	    mRULE_HEXDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1991:206: ( '+' | '-' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='+'||LA15_0=='-') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1991:217: ( '0' .. '9' )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1991:218: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NONINTEGERNUMBER"

    // $ANTLR start "RULE_EXPONENT"
    public final void mRULE_EXPONENT() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1993:24: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1993:26: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1993:36: ( '+' | '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='+'||LA18_0=='-') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1993:47: ( '0' .. '9' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='0' && LA19_0<='9')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1993:48: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT"

    // $ANTLR start "RULE_FLOATSUFFIX"
    public final void mRULE_FLOATSUFFIX() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1995:27: ( ( 'f' | 'F' ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1995:29: ( 'f' | 'F' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOATSUFFIX"

    // $ANTLR start "RULE_DOUBLESUFFIX"
    public final void mRULE_DOUBLESUFFIX() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1997:28: ( ( 'd' | 'D' ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1997:30: ( 'd' | 'D' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLESUFFIX"

    // $ANTLR start "RULE_FLOATLITERAL"
    public final void mRULE_FLOATLITERAL() throws RecognitionException {
        try {
            int _type = RULE_FLOATLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1999:19: ( RULE_NONINTEGERNUMBER RULE_FLOATSUFFIX )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1999:21: RULE_NONINTEGERNUMBER RULE_FLOATSUFFIX
            {
            mRULE_NONINTEGERNUMBER(); 
            mRULE_FLOATSUFFIX(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOATLITERAL"

    // $ANTLR start "RULE_DOUBLELITERAL"
    public final void mRULE_DOUBLELITERAL() throws RecognitionException {
        try {
            int _type = RULE_DOUBLELITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2001:20: ( RULE_NONINTEGERNUMBER ( RULE_DOUBLESUFFIX )? )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2001:22: RULE_NONINTEGERNUMBER ( RULE_DOUBLESUFFIX )?
            {
            mRULE_NONINTEGERNUMBER(); 
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2001:44: ( RULE_DOUBLESUFFIX )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='D'||LA20_0=='d') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2001:44: RULE_DOUBLESUFFIX
                    {
                    mRULE_DOUBLESUFFIX(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLELITERAL"

    // $ANTLR start "RULE_CHARLITERAL"
    public final void mRULE_CHARLITERAL() throws RecognitionException {
        try {
            int _type = RULE_CHARLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2003:18: ( '\\'' ( RULE_ESCAPESEQUENCE | ~ ( ( '\\'' | '\\\\' | '\\r' | '\\n' ) ) ) '\\'' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2003:20: '\\'' ( RULE_ESCAPESEQUENCE | ~ ( ( '\\'' | '\\\\' | '\\r' | '\\n' ) ) ) '\\''
            {
            match('\''); 
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2003:25: ( RULE_ESCAPESEQUENCE | ~ ( ( '\\'' | '\\\\' | '\\r' | '\\n' ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\\') ) {
                alt21=1;
            }
            else if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='&')||(LA21_0>='(' && LA21_0<='[')||(LA21_0>=']' && LA21_0<='\uFFFF')) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2003:26: RULE_ESCAPESEQUENCE
                    {
                    mRULE_ESCAPESEQUENCE(); 

                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2003:46: ~ ( ( '\\'' | '\\\\' | '\\r' | '\\n' ) )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHARLITERAL"

    // $ANTLR start "RULE_STRINGLITERAL"
    public final void mRULE_STRINGLITERAL() throws RecognitionException {
        try {
            int _type = RULE_STRINGLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2005:20: ( '\"' ( RULE_ESCAPESEQUENCE | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2005:22: '\"' ( RULE_ESCAPESEQUENCE | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )* '\"'
            {
            match('\"'); 
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2005:26: ( RULE_ESCAPESEQUENCE | ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) ) )*
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='\\') ) {
                    alt22=1;
                }
                else if ( ((LA22_0>='\u0000' && LA22_0<='\t')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='!')||(LA22_0>='#' && LA22_0<='[')||(LA22_0>=']' && LA22_0<='\uFFFF')) ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2005:27: RULE_ESCAPESEQUENCE
            	    {
            	    mRULE_ESCAPESEQUENCE(); 

            	    }
            	    break;
            	case 2 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2005:47: ~ ( ( '\\\\' | '\"' | '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRINGLITERAL"

    // $ANTLR start "RULE_ESCAPESEQUENCE"
    public final void mRULE_ESCAPESEQUENCE() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2007:30: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '0' .. '3' '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2007:32: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '0' .. '3' '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' )
            {
            match('\\'); 
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2007:37: ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '0' .. '3' '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' )
            int alt23=11;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2007:38: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2007:42: 't'
                    {
                    match('t'); 

                    }
                    break;
                case 3 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2007:46: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 4 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2007:50: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 5 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2007:54: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 6 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2007:58: '\"'
                    {
                    match('\"'); 

                    }
                    break;
                case 7 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2007:62: '\\''
                    {
                    match('\''); 

                    }
                    break;
                case 8 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2007:67: '\\\\'
                    {
                    match('\\'); 

                    }
                    break;
                case 9 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2007:72: '0' .. '3' '0' .. '7' '0' .. '7'
                    {
                    matchRange('0','3'); 
                    matchRange('0','7'); 
                    matchRange('0','7'); 

                    }
                    break;
                case 10 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2007:99: '0' .. '7' '0' .. '7'
                    {
                    matchRange('0','7'); 
                    matchRange('0','7'); 

                    }
                    break;
                case 11 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2007:117: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ESCAPESEQUENCE"

    // $ANTLR start "RULE_TRUE"
    public final void mRULE_TRUE() throws RecognitionException {
        try {
            int _type = RULE_TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2009:11: ( 'true' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2009:13: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TRUE"

    // $ANTLR start "RULE_FALSE"
    public final void mRULE_FALSE() throws RecognitionException {
        try {
            int _type = RULE_FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2011:12: ( 'false' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2011:14: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FALSE"

    // $ANTLR start "RULE_NULL"
    public final void mRULE_NULL() throws RecognitionException {
        try {
            int _type = RULE_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2013:11: ( 'null' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2013:13: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NULL"

    // $ANTLR start "RULE_LPAREN"
    public final void mRULE_LPAREN() throws RecognitionException {
        try {
            int _type = RULE_LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2015:13: ( '(' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2015:15: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LPAREN"

    // $ANTLR start "RULE_RPAREN"
    public final void mRULE_RPAREN() throws RecognitionException {
        try {
            int _type = RULE_RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2017:13: ( ')' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2017:15: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RPAREN"

    // $ANTLR start "RULE_LBRACE"
    public final void mRULE_LBRACE() throws RecognitionException {
        try {
            int _type = RULE_LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2019:13: ( '{' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2019:15: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LBRACE"

    // $ANTLR start "RULE_RBRACE"
    public final void mRULE_RBRACE() throws RecognitionException {
        try {
            int _type = RULE_RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2021:13: ( '}' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2021:15: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RBRACE"

    // $ANTLR start "RULE_LBRACKET"
    public final void mRULE_LBRACKET() throws RecognitionException {
        try {
            int _type = RULE_LBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2023:15: ( '[' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2023:17: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LBRACKET"

    // $ANTLR start "RULE_RBRACKET"
    public final void mRULE_RBRACKET() throws RecognitionException {
        try {
            int _type = RULE_RBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2025:15: ( ']' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2025:17: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RBRACKET"

    // $ANTLR start "RULE_SEMI"
    public final void mRULE_SEMI() throws RecognitionException {
        try {
            int _type = RULE_SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2027:11: ( ';' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2027:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEMI"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2029:12: ( ',' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2029:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_DOT"
    public final void mRULE_DOT() throws RecognitionException {
        try {
            int _type = RULE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2031:10: ( '.' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2031:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOT"

    // $ANTLR start "RULE_NOTEQUAL"
    public final void mRULE_NOTEQUAL() throws RecognitionException {
        try {
            int _type = RULE_NOTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2033:15: ( '!=' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2033:17: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOTEQUAL"

    // $ANTLR start "RULE_EQUAL"
    public final void mRULE_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2035:12: ( '==' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2035:14: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUAL"

    // $ANTLR start "RULE_GT"
    public final void mRULE_GT() throws RecognitionException {
        try {
            int _type = RULE_GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2037:9: ( '>' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2037:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GT"

    // $ANTLR start "RULE_GTE"
    public final void mRULE_GTE() throws RecognitionException {
        try {
            int _type = RULE_GTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2039:10: ( '>=' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2039:12: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GTE"

    // $ANTLR start "RULE_LT"
    public final void mRULE_LT() throws RecognitionException {
        try {
            int _type = RULE_LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2041:9: ( '<' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2041:11: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LT"

    // $ANTLR start "RULE_LTE"
    public final void mRULE_LTE() throws RecognitionException {
        try {
            int _type = RULE_LTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2043:10: ( '<=' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2043:12: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LTE"

    // $ANTLR start "RULE_NEW"
    public final void mRULE_NEW() throws RecognitionException {
        try {
            int _type = RULE_NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2045:10: ( 'new' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2045:12: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEW"

    // $ANTLR start "RULE_INSTANCEOF"
    public final void mRULE_INSTANCEOF() throws RecognitionException {
        try {
            int _type = RULE_INSTANCEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2047:17: ( 'instanceof' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2047:19: 'instanceof'
            {
            match("instanceof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INSTANCEOF"

    // $ANTLR start "RULE_NOT"
    public final void mRULE_NOT() throws RecognitionException {
        try {
            int _type = RULE_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2049:10: ( '!' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2049:12: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOT"

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2051:17: ( RULE_LETTER ( RULE_LETTER | RULE_JAVAIDDIGIT )* )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2051:19: RULE_LETTER ( RULE_LETTER | RULE_JAVAIDDIGIT )*
            {
            mRULE_LETTER(); 
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2051:31: ( RULE_LETTER | RULE_JAVAIDDIGIT )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0=='$'||(LA24_0>='0' && LA24_0<='9')||(LA24_0>='A' && LA24_0<='Z')||LA24_0=='_'||(LA24_0>='a' && LA24_0<='z')||(LA24_0>='\u00C0' && LA24_0<='\u00D6')||(LA24_0>='\u00D8' && LA24_0<='\u00F6')||(LA24_0>='\u00F8' && LA24_0<='\u1FFF')||(LA24_0>='\u3040' && LA24_0<='\u318F')||(LA24_0>='\u3300' && LA24_0<='\u337F')||(LA24_0>='\u3400' && LA24_0<='\u3D2D')||(LA24_0>='\u4E00' && LA24_0<='\u9FFF')||(LA24_0>='\uF900' && LA24_0<='\uFAFF')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u3040' && input.LA(1)<='\u318F')||(input.LA(1)>='\u3300' && input.LA(1)<='\u337F')||(input.LA(1)>='\u3400' && input.LA(1)<='\u3D2D')||(input.LA(1)>='\u4E00' && input.LA(1)<='\u9FFF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFAFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENTIFIER"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2053:22: ( ( '$' | 'A' .. 'Z' | '_' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u00FF' | '\\u0100' .. '\\u1FFF' | '\\u3040' .. '\\u318F' | '\\u3300' .. '\\u337F' | '\\u3400' .. '\\u3D2D' | '\\u4E00' .. '\\u9FFF' | '\\uF900' .. '\\uFAFF' ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2053:24: ( '$' | 'A' .. 'Z' | '_' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u00FF' | '\\u0100' .. '\\u1FFF' | '\\u3040' .. '\\u318F' | '\\u3300' .. '\\u337F' | '\\u3400' .. '\\u3D2D' | '\\u4E00' .. '\\u9FFF' | '\\uF900' .. '\\uFAFF' )
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u3040' && input.LA(1)<='\u318F')||(input.LA(1)>='\u3300' && input.LA(1)<='\u337F')||(input.LA(1)>='\u3400' && input.LA(1)<='\u3D2D')||(input.LA(1)>='\u4E00' && input.LA(1)<='\u9FFF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFAFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_JAVAIDDIGIT"
    public final void mRULE_JAVAIDDIGIT() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2055:27: ( ( '0' .. '9' | '\\u0660' .. '\\u0669' | '\\u06F0' .. '\\u06F9' | '\\u0966' .. '\\u096F' | '\\u09E6' .. '\\u09EF' | '\\u0A66' .. '\\u0A6F' | '\\u0AE6' .. '\\u0AEF' | '\\u0B66' .. '\\u0B6F' | '\\u0BE7' .. '\\u0BEF' | '\\u0C66' .. '\\u0C6F' | '\\u0CE6' .. '\\u0CEF' | '\\u0D66' .. '\\u0D6F' | '\\u0E50' .. '\\u0E59' | '\\u0ED0' .. '\\u0ED9' | '\\u1040' .. '\\u1049' ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2055:29: ( '0' .. '9' | '\\u0660' .. '\\u0669' | '\\u06F0' .. '\\u06F9' | '\\u0966' .. '\\u096F' | '\\u09E6' .. '\\u09EF' | '\\u0A66' .. '\\u0A6F' | '\\u0AE6' .. '\\u0AEF' | '\\u0B66' .. '\\u0B6F' | '\\u0BE7' .. '\\u0BEF' | '\\u0C66' .. '\\u0C6F' | '\\u0CE6' .. '\\u0CEF' | '\\u0D66' .. '\\u0D6F' | '\\u0E50' .. '\\u0E59' | '\\u0ED0' .. '\\u0ED9' | '\\u1040' .. '\\u1049' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='\u0660' && input.LA(1)<='\u0669')||(input.LA(1)>='\u06F0' && input.LA(1)<='\u06F9')||(input.LA(1)>='\u0966' && input.LA(1)<='\u096F')||(input.LA(1)>='\u09E6' && input.LA(1)<='\u09EF')||(input.LA(1)>='\u0A66' && input.LA(1)<='\u0A6F')||(input.LA(1)>='\u0AE6' && input.LA(1)<='\u0AEF')||(input.LA(1)>='\u0B66' && input.LA(1)<='\u0B6F')||(input.LA(1)>='\u0BE7' && input.LA(1)<='\u0BEF')||(input.LA(1)>='\u0C66' && input.LA(1)<='\u0C6F')||(input.LA(1)>='\u0CE6' && input.LA(1)<='\u0CEF')||(input.LA(1)>='\u0D66' && input.LA(1)<='\u0D6F')||(input.LA(1)>='\u0E50' && input.LA(1)<='\u0E59')||(input.LA(1)>='\u0ED0' && input.LA(1)<='\u0ED9')||(input.LA(1)>='\u1040' && input.LA(1)<='\u1049') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_JAVAIDDIGIT"

    // $ANTLR start "RULE_JRIDENTIFIER"
    public final void mRULE_JRIDENTIFIER() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2057:28: ( (~ ( ( '\\r' | '\\n' | '}' ) ) )+ )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2057:30: (~ ( ( '\\r' | '\\n' | '}' ) ) )+
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2057:30: (~ ( ( '\\r' | '\\n' | '}' ) ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='\u0000' && LA25_0<='\t')||(LA25_0>='\u000B' && LA25_0<='\f')||(LA25_0>='\u000E' && LA25_0<='|')||(LA25_0>='~' && LA25_0<='\uFFFF')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2057:30: ~ ( ( '\\r' | '\\n' | '}' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='|')||(input.LA(1)>='~' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_JRIDENTIFIER"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2059:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2059:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2059:24: ( options {greedy=false; } : . )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0=='*') ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1=='/') ) {
                        alt26=2;
                    }
                    else if ( ((LA26_1>='\u0000' && LA26_1<='.')||(LA26_1>='0' && LA26_1<='\uFFFF')) ) {
                        alt26=1;
                    }


                }
                else if ( ((LA26_0>='\u0000' && LA26_0<=')')||(LA26_0>='+' && LA26_0<='\uFFFF')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2059:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2061:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2061:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2061:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='\u0000' && LA27_0<='\t')||(LA27_0>='\u000B' && LA27_0<='\f')||(LA27_0>='\u000E' && LA27_0<='\uFFFF')) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2061:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2061:40: ( ( '\\r' )? '\\n' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='\n'||LA29_0=='\r') ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2061:41: ( '\\r' )? '\\n'
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2061:41: ( '\\r' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0=='\r') ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2061:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2063:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2063:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2063:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>='\t' && LA30_0<='\n')||LA30_0=='\r'||LA30_0==' ') ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:8: ( T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | RULE_FIELDTOKEN | RULE_VARIABLETOKEN | RULE_PARAMETERTOKEN | RULE_LONGLITERAL | RULE_INTLITERAL | RULE_FLOATLITERAL | RULE_DOUBLELITERAL | RULE_CHARLITERAL | RULE_STRINGLITERAL | RULE_TRUE | RULE_FALSE | RULE_NULL | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_LBRACKET | RULE_RBRACKET | RULE_SEMI | RULE_COMMA | RULE_DOT | RULE_NOTEQUAL | RULE_EQUAL | RULE_GT | RULE_GTE | RULE_LT | RULE_LTE | RULE_NEW | RULE_INSTANCEOF | RULE_NOT | RULE_IDENTIFIER | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt31=50;
        alt31 = dfa31.predict(input);
        switch (alt31) {
            case 1 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:10: T__51
                {
                mT__51(); 

                }
                break;
            case 2 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:16: T__52
                {
                mT__52(); 

                }
                break;
            case 3 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:22: T__53
                {
                mT__53(); 

                }
                break;
            case 4 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:28: T__54
                {
                mT__54(); 

                }
                break;
            case 5 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:34: T__55
                {
                mT__55(); 

                }
                break;
            case 6 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:40: T__56
                {
                mT__56(); 

                }
                break;
            case 7 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:46: T__57
                {
                mT__57(); 

                }
                break;
            case 8 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:52: T__58
                {
                mT__58(); 

                }
                break;
            case 9 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:58: T__59
                {
                mT__59(); 

                }
                break;
            case 10 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:64: T__60
                {
                mT__60(); 

                }
                break;
            case 11 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:70: T__61
                {
                mT__61(); 

                }
                break;
            case 12 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:76: T__62
                {
                mT__62(); 

                }
                break;
            case 13 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:82: T__63
                {
                mT__63(); 

                }
                break;
            case 14 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:88: T__64
                {
                mT__64(); 

                }
                break;
            case 15 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:94: T__65
                {
                mT__65(); 

                }
                break;
            case 16 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:100: T__66
                {
                mT__66(); 

                }
                break;
            case 17 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:106: RULE_FIELDTOKEN
                {
                mRULE_FIELDTOKEN(); 

                }
                break;
            case 18 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:122: RULE_VARIABLETOKEN
                {
                mRULE_VARIABLETOKEN(); 

                }
                break;
            case 19 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:141: RULE_PARAMETERTOKEN
                {
                mRULE_PARAMETERTOKEN(); 

                }
                break;
            case 20 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:161: RULE_LONGLITERAL
                {
                mRULE_LONGLITERAL(); 

                }
                break;
            case 21 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:178: RULE_INTLITERAL
                {
                mRULE_INTLITERAL(); 

                }
                break;
            case 22 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:194: RULE_FLOATLITERAL
                {
                mRULE_FLOATLITERAL(); 

                }
                break;
            case 23 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:212: RULE_DOUBLELITERAL
                {
                mRULE_DOUBLELITERAL(); 

                }
                break;
            case 24 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:231: RULE_CHARLITERAL
                {
                mRULE_CHARLITERAL(); 

                }
                break;
            case 25 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:248: RULE_STRINGLITERAL
                {
                mRULE_STRINGLITERAL(); 

                }
                break;
            case 26 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:267: RULE_TRUE
                {
                mRULE_TRUE(); 

                }
                break;
            case 27 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:277: RULE_FALSE
                {
                mRULE_FALSE(); 

                }
                break;
            case 28 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:288: RULE_NULL
                {
                mRULE_NULL(); 

                }
                break;
            case 29 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:298: RULE_LPAREN
                {
                mRULE_LPAREN(); 

                }
                break;
            case 30 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:310: RULE_RPAREN
                {
                mRULE_RPAREN(); 

                }
                break;
            case 31 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:322: RULE_LBRACE
                {
                mRULE_LBRACE(); 

                }
                break;
            case 32 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:334: RULE_RBRACE
                {
                mRULE_RBRACE(); 

                }
                break;
            case 33 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:346: RULE_LBRACKET
                {
                mRULE_LBRACKET(); 

                }
                break;
            case 34 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:360: RULE_RBRACKET
                {
                mRULE_RBRACKET(); 

                }
                break;
            case 35 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:374: RULE_SEMI
                {
                mRULE_SEMI(); 

                }
                break;
            case 36 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:384: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 37 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:395: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 38 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:404: RULE_NOTEQUAL
                {
                mRULE_NOTEQUAL(); 

                }
                break;
            case 39 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:418: RULE_EQUAL
                {
                mRULE_EQUAL(); 

                }
                break;
            case 40 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:429: RULE_GT
                {
                mRULE_GT(); 

                }
                break;
            case 41 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:437: RULE_GTE
                {
                mRULE_GTE(); 

                }
                break;
            case 42 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:446: RULE_LT
                {
                mRULE_LT(); 

                }
                break;
            case 43 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:454: RULE_LTE
                {
                mRULE_LTE(); 

                }
                break;
            case 44 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:463: RULE_NEW
                {
                mRULE_NEW(); 

                }
                break;
            case 45 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:472: RULE_INSTANCEOF
                {
                mRULE_INSTANCEOF(); 

                }
                break;
            case 46 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:488: RULE_NOT
                {
                mRULE_NOT(); 

                }
                break;
            case 47 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:497: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 48 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:513: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 49 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:529: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 50 :
                // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1:545: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA31 dfa31 = new DFA31(this);
    static final String DFA17_eotS =
        "\1\uffff\1\7\1\uffff\1\7\4\uffff";
    static final String DFA17_eofS =
        "\10\uffff";
    static final String DFA17_minS =
        "\2\56\1\uffff\1\56\4\uffff";
    static final String DFA17_maxS =
        "\1\71\1\170\1\uffff\1\145\4\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\1\uffff\1\5\1\1\1\3\1\4";
    static final String DFA17_specialS =
        "\10\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\2\1\uffff\1\1\11\3",
            "\1\5\1\uffff\12\3\13\uffff\1\6\22\uffff\1\4\14\uffff\1\6\22"+
            "\uffff\1\4",
            "",
            "\1\5\1\uffff\12\3\13\uffff\1\6\37\uffff\1\6",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1991:34: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( RULE_EXPONENT )? | '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? | ( '0' .. '9' )+ RULE_EXPONENT | ( '0' .. '9' )+ | RULE_HEXPREFIX ( RULE_HEXDIGIT )* '.' ( RULE_HEXDIGIT )* ( 'p' | 'P' ) ( '+' | '-' )? ( '0' .. '9' )+ )";
        }
    }
    static final String DFA23_eotS =
        "\11\uffff\2\14\1\15\3\uffff";
    static final String DFA23_eofS =
        "\17\uffff";
    static final String DFA23_minS =
        "\1\42\10\uffff\3\60\3\uffff";
    static final String DFA23_maxS =
        "\1\164\10\uffff\3\67\3\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\3\uffff\1\13\1\12\1\11";
    static final String DFA23_specialS =
        "\17\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\6\4\uffff\1\7\10\uffff\4\11\4\12\44\uffff\1\10\5\uffff\1"+
            "\1\3\uffff\1\4\7\uffff\1\3\3\uffff\1\5\1\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\10\13",
            "\10\15",
            "\10\16",
            "",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "2007:37: ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' | '0' .. '3' '0' .. '7' '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '7' )";
        }
    }
    static final String DFA31_eotS =
        "\10\uffff\1\50\10\44\2\72\1\101\2\uffff\2\44\10\uffff\1\106\1\uffff"+
        "\1\110\1\112\5\uffff\14\44\3\uffff\1\72\1\76\2\uffff\1\76\2\uffff"+
        "\1\72\1\76\1\uffff\3\44\6\uffff\4\44\1\146\5\44\3\uffff\1\72\2\uffff"+
        "\2\76\2\uffff\2\44\1\164\1\44\1\166\1\167\1\44\1\uffff\1\44\1\172"+
        "\3\44\3\uffff\1\76\1\uffff\1\76\1\u0080\1\u0081\1\uffff\1\44\2\uffff"+
        "\1\u0083\1\44\1\uffff\1\u0085\1\u0086\1\44\1\uffff\1\76\2\uffff"+
        "\1\44\1\uffff\1\44\2\uffff\1\u008a\1\u008b\1\44\2\uffff\2\44\1\u008f"+
        "\1\uffff";
    static final String DFA31_eofS =
        "\u0090\uffff";
    static final String DFA31_minS =
        "\1\11\7\uffff\1\52\1\157\2\150\1\156\1\157\1\141\1\157\1\106\2\56"+
        "\1\60\2\uffff\1\162\1\145\10\uffff\1\75\1\uffff\2\75\5\uffff\1\157"+
        "\1\164\1\141\1\157\1\163\1\156\1\157\1\154\1\165\3\173\2\56\1\53"+
        "\2\56\2\uffff\1\60\2\uffff\1\56\1\60\1\uffff\1\165\1\154\1\167\6"+
        "\uffff\1\154\1\145\2\162\1\44\1\164\1\147\1\141\1\163\1\142\3\uffff"+
        "\1\56\4\60\2\53\1\145\1\154\1\44\1\145\2\44\1\164\1\uffff\1\141"+
        "\1\44\1\164\1\145\1\154\1\60\1\53\4\60\2\44\1\uffff\1\141\2\uffff"+
        "\1\44\1\156\1\uffff\2\44\1\145\2\60\2\uffff\1\156\1\uffff\1\143"+
        "\2\uffff\2\44\1\145\2\uffff\1\157\1\146\1\44\1\uffff";
    static final String DFA31_maxS =
        "\1\ufaff\7\uffff\1\57\1\171\2\150\1\156\1\157\1\154\1\157\1\126"+
        "\1\170\1\154\1\71\2\uffff\1\162\1\165\10\uffff\1\75\1\uffff\2\75"+
        "\5\uffff\1\157\1\164\1\141\1\157\1\164\1\156\1\157\1\154\1\165\3"+
        "\173\2\146\1\71\1\154\1\146\2\uffff\1\146\2\uffff\1\154\1\146\1"+
        "\uffff\1\165\1\154\1\167\6\uffff\1\154\1\145\2\162\1\ufaff\1\164"+
        "\1\147\1\141\1\163\1\142\3\uffff\1\154\1\160\1\71\2\146\2\71\1\145"+
        "\1\154\1\ufaff\1\145\2\ufaff\1\164\1\uffff\1\141\1\ufaff\1\164\1"+
        "\145\1\154\1\160\2\71\1\146\1\71\1\146\2\ufaff\1\uffff\1\141\2\uffff"+
        "\1\ufaff\1\156\1\uffff\2\ufaff\1\145\1\71\1\146\2\uffff\1\156\1"+
        "\uffff\1\143\2\uffff\2\ufaff\1\145\2\uffff\1\157\1\146\1\ufaff\1"+
        "\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\14\uffff\1\30\1\31\2\uffff"+
        "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\uffff\1\47\2\uffff\1"+
        "\57\1\62\1\60\1\61\1\10\21\uffff\1\25\1\26\1\uffff\1\24\1\27\2\uffff"+
        "\1\45\3\uffff\1\46\1\56\1\51\1\50\1\53\1\52\12\uffff\1\21\1\22\1"+
        "\23\16\uffff\1\15\15\uffff\1\54\1\uffff\1\13\1\12\2\uffff\1\16\5"+
        "\uffff\1\32\1\34\1\uffff\1\14\1\uffff\1\17\1\33\3\uffff\1\20\1\11"+
        "\3\uffff\1\55";
    static final String DFA31_specialS =
        "\u0090\uffff}>";
    static final String[] DFA31_transitionS = {
            "\2\45\2\uffff\1\45\22\uffff\1\45\1\40\1\25\1\uffff\1\20\1\uffff"+
            "\1\4\1\24\1\30\1\31\1\7\1\5\1\37\1\6\1\23\1\10\1\21\11\22\1"+
            "\2\1\36\1\43\1\41\1\42\1\1\1\uffff\32\44\1\34\1\uffff\1\35\1"+
            "\uffff\1\44\1\uffff\1\44\1\11\1\12\1\17\1\44\1\16\2\44\1\14"+
            "\2\44\1\15\1\44\1\27\4\44\1\13\1\26\6\44\1\32\1\3\1\33\102\uffff"+
            "\27\44\1\uffff\37\44\1\uffff\u1f08\44\u1040\uffff\u0150\44\u0170"+
            "\uffff\u0080\44\u0080\uffff\u092e\44\u10d2\uffff\u5200\44\u5900"+
            "\uffff\u0200\44",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\46\4\uffff\1\47",
            "\1\51\11\uffff\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\60\12\uffff\1\57",
            "\1\61",
            "\1\62\11\uffff\1\64\5\uffff\1\63",
            "\1\74\1\uffff\10\70\2\71\12\uffff\1\76\1\67\1\73\5\uffff\1"+
            "\75\13\uffff\1\66\13\uffff\1\76\1\67\1\73\5\uffff\1\75\13\uffff"+
            "\1\65",
            "\1\74\1\uffff\12\77\12\uffff\1\76\1\67\1\73\5\uffff\1\75\27"+
            "\uffff\1\76\1\67\1\73\5\uffff\1\75",
            "\12\100",
            "",
            "",
            "\1\102",
            "\1\104\17\uffff\1\103",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\105",
            "",
            "\1\107",
            "\1\111",
            "",
            "",
            "",
            "",
            "",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\120\1\117",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\131\1\uffff\12\130\7\uffff\6\130\32\uffff\6\130",
            "\1\131\1\uffff\12\130\7\uffff\6\130\32\uffff\6\130",
            "\1\132\1\uffff\1\132\2\uffff\12\133",
            "\1\74\1\uffff\10\70\2\71\12\uffff\1\76\1\67\1\73\5\uffff\1"+
            "\75\27\uffff\1\76\1\67\1\73\5\uffff\1\75",
            "\1\74\1\uffff\12\71\13\uffff\1\67\1\73\36\uffff\1\67\1\73",
            "",
            "",
            "\12\134\13\uffff\1\135\1\73\36\uffff\1\135\1\73",
            "",
            "",
            "\1\74\1\uffff\12\77\12\uffff\1\76\1\67\1\73\5\uffff\1\75\27"+
            "\uffff\1\76\1\67\1\73\5\uffff\1\75",
            "\12\100\13\uffff\1\136\1\73\36\uffff\1\136\1\73",
            "",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32"+
            "\44\105\uffff\27\44\1\uffff\37\44\1\uffff\u1f08\44\u1040\uffff"+
            "\u0150\44\u0170\uffff\u0080\44\u0080\uffff\u092e\44\u10d2\uffff"+
            "\u5200\44\u5900\uffff\u0200\44",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "",
            "",
            "\1\131\1\uffff\12\130\7\uffff\6\130\5\uffff\1\75\24\uffff\6"+
            "\130\5\uffff\1\75",
            "\12\154\7\uffff\6\154\11\uffff\1\155\20\uffff\6\154\11\uffff"+
            "\1\155",
            "\12\133",
            "\12\133\14\uffff\1\73\37\uffff\1\73",
            "\12\134\13\uffff\1\135\1\73\36\uffff\1\135\1\73",
            "\1\156\1\uffff\1\156\2\uffff\12\157",
            "\1\160\1\uffff\1\160\2\uffff\12\161",
            "\1\162",
            "\1\163",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32"+
            "\44\105\uffff\27\44\1\uffff\37\44\1\uffff\u1f08\44\u1040\uffff"+
            "\u0150\44\u0170\uffff\u0080\44\u0080\uffff\u092e\44\u10d2\uffff"+
            "\u5200\44\u5900\uffff\u0200\44",
            "\1\165",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32"+
            "\44\105\uffff\27\44\1\uffff\37\44\1\uffff\u1f08\44\u1040\uffff"+
            "\u0150\44\u0170\uffff\u0080\44\u0080\uffff\u092e\44\u10d2\uffff"+
            "\u5200\44\u5900\uffff\u0200\44",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32"+
            "\44\105\uffff\27\44\1\uffff\37\44\1\uffff\u1f08\44\u1040\uffff"+
            "\u0150\44\u0170\uffff\u0080\44\u0080\uffff\u092e\44\u10d2\uffff"+
            "\u5200\44\u5900\uffff\u0200\44",
            "\1\170",
            "",
            "\1\171",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32"+
            "\44\105\uffff\27\44\1\uffff\37\44\1\uffff\u1f08\44\u1040\uffff"+
            "\u0150\44\u0170\uffff\u0080\44\u0080\uffff\u092e\44\u10d2\uffff"+
            "\u5200\44\u5900\uffff\u0200\44",
            "\1\173",
            "\1\174",
            "\1\175",
            "\12\154\7\uffff\6\154\11\uffff\1\155\20\uffff\6\154\11\uffff"+
            "\1\155",
            "\1\176\1\uffff\1\176\2\uffff\12\177",
            "\12\157",
            "\12\157\14\uffff\1\73\37\uffff\1\73",
            "\12\161",
            "\12\161\14\uffff\1\73\37\uffff\1\73",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32"+
            "\44\105\uffff\27\44\1\uffff\37\44\1\uffff\u1f08\44\u1040\uffff"+
            "\u0150\44\u0170\uffff\u0080\44\u0080\uffff\u092e\44\u10d2\uffff"+
            "\u5200\44\u5900\uffff\u0200\44",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32"+
            "\44\105\uffff\27\44\1\uffff\37\44\1\uffff\u1f08\44\u1040\uffff"+
            "\u0150\44\u0170\uffff\u0080\44\u0080\uffff\u092e\44\u10d2\uffff"+
            "\u5200\44\u5900\uffff\u0200\44",
            "",
            "\1\u0082",
            "",
            "",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32"+
            "\44\105\uffff\27\44\1\uffff\37\44\1\uffff\u1f08\44\u1040\uffff"+
            "\u0150\44\u0170\uffff\u0080\44\u0080\uffff\u092e\44\u10d2\uffff"+
            "\u5200\44\u5900\uffff\u0200\44",
            "\1\u0084",
            "",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32"+
            "\44\105\uffff\27\44\1\uffff\37\44\1\uffff\u1f08\44\u1040\uffff"+
            "\u0150\44\u0170\uffff\u0080\44\u0080\uffff\u092e\44\u10d2\uffff"+
            "\u5200\44\u5900\uffff\u0200\44",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32"+
            "\44\105\uffff\27\44\1\uffff\37\44\1\uffff\u1f08\44\u1040\uffff"+
            "\u0150\44\u0170\uffff\u0080\44\u0080\uffff\u092e\44\u10d2\uffff"+
            "\u5200\44\u5900\uffff\u0200\44",
            "\1\u0087",
            "\12\177",
            "\12\177\14\uffff\1\73\37\uffff\1\73",
            "",
            "",
            "\1\u0088",
            "",
            "\1\u0089",
            "",
            "",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32"+
            "\44\105\uffff\27\44\1\uffff\37\44\1\uffff\u1f08\44\u1040\uffff"+
            "\u0150\44\u0170\uffff\u0080\44\u0080\uffff\u092e\44\u10d2\uffff"+
            "\u5200\44\u5900\uffff\u0200\44",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32"+
            "\44\105\uffff\27\44\1\uffff\37\44\1\uffff\u1f08\44\u1040\uffff"+
            "\u0150\44\u0170\uffff\u0080\44\u0080\uffff\u092e\44\u10d2\uffff"+
            "\u5200\44\u5900\uffff\u0200\44",
            "\1\u008c",
            "",
            "",
            "\1\u008d",
            "\1\u008e",
            "\1\44\13\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32"+
            "\44\105\uffff\27\44\1\uffff\37\44\1\uffff\u1f08\44\u1040\uffff"+
            "\u0150\44\u0170\uffff\u0080\44\u0080\uffff\u092e\44\u10d2\uffff"+
            "\u5200\44\u5900\uffff\u0200\44",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | RULE_FIELDTOKEN | RULE_VARIABLETOKEN | RULE_PARAMETERTOKEN | RULE_LONGLITERAL | RULE_INTLITERAL | RULE_FLOATLITERAL | RULE_DOUBLELITERAL | RULE_CHARLITERAL | RULE_STRINGLITERAL | RULE_TRUE | RULE_FALSE | RULE_NULL | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_LBRACKET | RULE_RBRACKET | RULE_SEMI | RULE_COMMA | RULE_DOT | RULE_NOTEQUAL | RULE_EQUAL | RULE_GT | RULE_GTE | RULE_LT | RULE_LTE | RULE_NEW | RULE_INSTANCEOF | RULE_NOT | RULE_IDENTIFIER | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
    }
 

}