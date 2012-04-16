package com.jaspersoft.studio.editor.jrexpressions.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.jaspersoft.studio.editor.jrexpressions.services.JavaJRExpressionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJavaJRExpressionParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EQUAL", "RULE_NOTEQUAL", "RULE_GT", "RULE_GTE", "RULE_LT", "RULE_LTE", "RULE_INTLITERAL", "RULE_LONGLITERAL", "RULE_FLOATLITERAL", "RULE_DOUBLELITERAL", "RULE_CHARLITERAL", "RULE_STRINGLITERAL", "RULE_TRUE", "RULE_FALSE", "RULE_NULL", "RULE_LPAREN", "RULE_RPAREN", "RULE_NOT", "RULE_INSTANCEOF", "RULE_DOT", "RULE_NEW", "RULE_LBRACE", "RULE_COMMA", "RULE_RBRACE", "RULE_LBRACKET", "RULE_RBRACKET", "RULE_IDENTIFIER", "RULE_FIELDTOKEN", "RULE_PARAMETERTOKEN", "RULE_VARIABLETOKEN", "RULE_BRACED_JRIDENTIFIER", "RULE_JRIDENTIFIER", "RULE_INTEGERNUMBER", "RULE_LONGSUFFIX", "RULE_HEXPREFIX", "RULE_HEXDIGIT", "RULE_EXPONENT", "RULE_NONINTEGERNUMBER", "RULE_FLOATSUFFIX", "RULE_DOUBLESUFFIX", "RULE_ESCAPESEQUENCE", "RULE_SEMI", "RULE_LETTER", "RULE_JAVAIDDIGIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'+'", "'-'", "'*'", "'/'", "'boolean'", "'char'", "'byte'", "'short'", "'int'", "'long'", "'float'", "'double'", "'?'", "':'", "'||'", "'&&'"
    };
    public static final int T__66=66;
    public static final int RULE_INTLITERAL=10;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_GTE=7;
    public static final int RULE_INSTANCEOF=22;
    public static final int RULE_HEXDIGIT=39;
    public static final int RULE_LTE=9;
    public static final int RULE_LBRACKET=28;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int RULE_NOT=21;
    public static final int RULE_CHARLITERAL=14;
    public static final int RULE_LT=8;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int RULE_FALSE=17;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_DOT=23;
    public static final int T__53=53;
    public static final int RULE_FLOATLITERAL=12;
    public static final int T__54=54;
    public static final int RULE_STRINGLITERAL=15;
    public static final int RULE_NONINTEGERNUMBER=41;
    public static final int RULE_JAVAIDDIGIT=47;
    public static final int RULE_LPAREN=19;
    public static final int T__59=59;
    public static final int RULE_GT=6;
    public static final int RULE_FLOATSUFFIX=42;
    public static final int RULE_LBRACE=25;
    public static final int RULE_LONGSUFFIX=37;
    public static final int RULE_RBRACKET=29;
    public static final int RULE_SEMI=45;
    public static final int RULE_ESCAPESEQUENCE=44;
    public static final int RULE_NOTEQUAL=5;
    public static final int RULE_RBRACE=27;
    public static final int RULE_DOUBLELITERAL=13;
    public static final int RULE_HEXPREFIX=38;
    public static final int RULE_VARIABLETOKEN=33;
    public static final int RULE_IDENTIFIER=30;
    public static final int RULE_COMMA=26;
    public static final int RULE_EQUAL=4;
    public static final int RULE_BRACED_JRIDENTIFIER=34;
    public static final int RULE_SL_COMMENT=49;
    public static final int RULE_JRIDENTIFIER=35;
    public static final int RULE_LETTER=46;
    public static final int RULE_PARAMETERTOKEN=32;
    public static final int RULE_NULL=18;
    public static final int RULE_ML_COMMENT=48;
    public static final int RULE_TRUE=16;
    public static final int RULE_DOUBLESUFFIX=43;
    public static final int RULE_LONGLITERAL=11;
    public static final int RULE_NEW=24;
    public static final int RULE_EXPONENT=40;
    public static final int RULE_INTEGERNUMBER=36;
    public static final int RULE_RPAREN=20;
    public static final int RULE_WS=50;
    public static final int RULE_FIELDTOKEN=31;

    // delegates
    // delegators


        public InternalJavaJRExpressionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJavaJRExpressionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJavaJRExpressionParser.tokenNames; }
    public String getGrammarFileName() { return "../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g"; }


     
     	private JavaJRExpressionGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(JavaJRExpressionGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:61:1: ( ruleModel EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:69:1: ruleModel : ( ruleExpression ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:73:2: ( ( ruleExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:74:1: ( ruleExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:74:1: ( ruleExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:75:1: ruleExpression
            {
             before(grammarAccess.getModelAccess().getExpressionParserRuleCall()); 
            pushFollow(FOLLOW_ruleExpression_in_ruleModel94);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getModelAccess().getExpressionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:88:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:89:1: ( ruleExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:90:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression120);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression127); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:97:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:101:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:102:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:102:1: ( ( rule__Expression__Alternatives ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:103:1: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:104:1: ( rule__Expression__Alternatives )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:104:2: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_in_ruleExpression153);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleMethodInvocation"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:116:1: entryRuleMethodInvocation : ruleMethodInvocation EOF ;
    public final void entryRuleMethodInvocation() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:117:1: ( ruleMethodInvocation EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:118:1: ruleMethodInvocation EOF
            {
             before(grammarAccess.getMethodInvocationRule()); 
            pushFollow(FOLLOW_ruleMethodInvocation_in_entryRuleMethodInvocation180);
            ruleMethodInvocation();

            state._fsp--;

             after(grammarAccess.getMethodInvocationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodInvocation187); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethodInvocation"


    // $ANTLR start "ruleMethodInvocation"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:125:1: ruleMethodInvocation : ( ( rule__MethodInvocation__Group__0 ) ) ;
    public final void ruleMethodInvocation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:129:2: ( ( ( rule__MethodInvocation__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:130:1: ( ( rule__MethodInvocation__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:130:1: ( ( rule__MethodInvocation__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:131:1: ( rule__MethodInvocation__Group__0 )
            {
             before(grammarAccess.getMethodInvocationAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:132:1: ( rule__MethodInvocation__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:132:2: rule__MethodInvocation__Group__0
            {
            pushFollow(FOLLOW_rule__MethodInvocation__Group__0_in_ruleMethodInvocation213);
            rule__MethodInvocation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodInvocationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodInvocation"


    // $ANTLR start "entryRuleMethodName"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:144:1: entryRuleMethodName : ruleMethodName EOF ;
    public final void entryRuleMethodName() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:145:1: ( ruleMethodName EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:146:1: ruleMethodName EOF
            {
             before(grammarAccess.getMethodNameRule()); 
            pushFollow(FOLLOW_ruleMethodName_in_entryRuleMethodName240);
            ruleMethodName();

            state._fsp--;

             after(grammarAccess.getMethodNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodName247); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethodName"


    // $ANTLR start "ruleMethodName"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:153:1: ruleMethodName : ( ( rule__MethodName__Group__0 ) ) ;
    public final void ruleMethodName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:157:2: ( ( ( rule__MethodName__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:158:1: ( ( rule__MethodName__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:158:1: ( ( rule__MethodName__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:159:1: ( rule__MethodName__Group__0 )
            {
             before(grammarAccess.getMethodNameAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:160:1: ( rule__MethodName__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:160:2: rule__MethodName__Group__0
            {
            pushFollow(FOLLOW_rule__MethodName__Group__0_in_ruleMethodName273);
            rule__MethodName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodName"


    // $ANTLR start "entryRuleBaseJRExpr"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:172:1: entryRuleBaseJRExpr : ruleBaseJRExpr EOF ;
    public final void entryRuleBaseJRExpr() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:173:1: ( ruleBaseJRExpr EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:174:1: ruleBaseJRExpr EOF
            {
             before(grammarAccess.getBaseJRExprRule()); 
            pushFollow(FOLLOW_ruleBaseJRExpr_in_entryRuleBaseJRExpr300);
            ruleBaseJRExpr();

            state._fsp--;

             after(grammarAccess.getBaseJRExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseJRExpr307); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBaseJRExpr"


    // $ANTLR start "ruleBaseJRExpr"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:181:1: ruleBaseJRExpr : ( ( rule__BaseJRExpr__Alternatives ) ) ;
    public final void ruleBaseJRExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:185:2: ( ( ( rule__BaseJRExpr__Alternatives ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:186:1: ( ( rule__BaseJRExpr__Alternatives ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:186:1: ( ( rule__BaseJRExpr__Alternatives ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:187:1: ( rule__BaseJRExpr__Alternatives )
            {
             before(grammarAccess.getBaseJRExprAccess().getAlternatives()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:188:1: ( rule__BaseJRExpr__Alternatives )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:188:2: rule__BaseJRExpr__Alternatives
            {
            pushFollow(FOLLOW_rule__BaseJRExpr__Alternatives_in_ruleBaseJRExpr333);
            rule__BaseJRExpr__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBaseJRExprAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBaseJRExpr"


    // $ANTLR start "entryRuleArguments"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:200:1: entryRuleArguments : ruleArguments EOF ;
    public final void entryRuleArguments() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:201:1: ( ruleArguments EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:202:1: ruleArguments EOF
            {
             before(grammarAccess.getArgumentsRule()); 
            pushFollow(FOLLOW_ruleArguments_in_entryRuleArguments360);
            ruleArguments();

            state._fsp--;

             after(grammarAccess.getArgumentsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArguments367); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArguments"


    // $ANTLR start "ruleArguments"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:209:1: ruleArguments : ( ( rule__Arguments__Group__0 ) ) ;
    public final void ruleArguments() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:213:2: ( ( ( rule__Arguments__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:214:1: ( ( rule__Arguments__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:214:1: ( ( rule__Arguments__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:215:1: ( rule__Arguments__Group__0 )
            {
             before(grammarAccess.getArgumentsAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:216:1: ( rule__Arguments__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:216:2: rule__Arguments__Group__0
            {
            pushFollow(FOLLOW_rule__Arguments__Group__0_in_ruleArguments393);
            rule__Arguments__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArgumentsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArguments"


    // $ANTLR start "entryRuleExpressionList"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:228:1: entryRuleExpressionList : ruleExpressionList EOF ;
    public final void entryRuleExpressionList() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:229:1: ( ruleExpressionList EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:230:1: ruleExpressionList EOF
            {
             before(grammarAccess.getExpressionListRule()); 
            pushFollow(FOLLOW_ruleExpressionList_in_entryRuleExpressionList420);
            ruleExpressionList();

            state._fsp--;

             after(grammarAccess.getExpressionListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionList427); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionList"


    // $ANTLR start "ruleExpressionList"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:237:1: ruleExpressionList : ( ( rule__ExpressionList__Group__0 ) ) ;
    public final void ruleExpressionList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:241:2: ( ( ( rule__ExpressionList__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:242:1: ( ( rule__ExpressionList__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:242:1: ( ( rule__ExpressionList__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:243:1: ( rule__ExpressionList__Group__0 )
            {
             before(grammarAccess.getExpressionListAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:244:1: ( rule__ExpressionList__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:244:2: rule__ExpressionList__Group__0
            {
            pushFollow(FOLLOW_rule__ExpressionList__Group__0_in_ruleExpressionList453);
            rule__ExpressionList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionList"


    // $ANTLR start "entryRuleBaseCommonExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:256:1: entryRuleBaseCommonExpression : ruleBaseCommonExpression EOF ;
    public final void entryRuleBaseCommonExpression() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:257:1: ( ruleBaseCommonExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:258:1: ruleBaseCommonExpression EOF
            {
             before(grammarAccess.getBaseCommonExpressionRule()); 
            pushFollow(FOLLOW_ruleBaseCommonExpression_in_entryRuleBaseCommonExpression480);
            ruleBaseCommonExpression();

            state._fsp--;

             after(grammarAccess.getBaseCommonExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseCommonExpression487); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBaseCommonExpression"


    // $ANTLR start "ruleBaseCommonExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:265:1: ruleBaseCommonExpression : ( ( rule__BaseCommonExpression__Alternatives ) ) ;
    public final void ruleBaseCommonExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:269:2: ( ( ( rule__BaseCommonExpression__Alternatives ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:270:1: ( ( rule__BaseCommonExpression__Alternatives ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:270:1: ( ( rule__BaseCommonExpression__Alternatives ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:271:1: ( rule__BaseCommonExpression__Alternatives )
            {
             before(grammarAccess.getBaseCommonExpressionAccess().getAlternatives()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:272:1: ( rule__BaseCommonExpression__Alternatives )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:272:2: rule__BaseCommonExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__BaseCommonExpression__Alternatives_in_ruleBaseCommonExpression513);
            rule__BaseCommonExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBaseCommonExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBaseCommonExpression"


    // $ANTLR start "entryRuleCast"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:284:1: entryRuleCast : ruleCast EOF ;
    public final void entryRuleCast() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:285:1: ( ruleCast EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:286:1: ruleCast EOF
            {
             before(grammarAccess.getCastRule()); 
            pushFollow(FOLLOW_ruleCast_in_entryRuleCast540);
            ruleCast();

            state._fsp--;

             after(grammarAccess.getCastRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCast547); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCast"


    // $ANTLR start "ruleCast"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:293:1: ruleCast : ( ( rule__Cast__Group__0 ) ) ;
    public final void ruleCast() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:297:2: ( ( ( rule__Cast__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:298:1: ( ( rule__Cast__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:298:1: ( ( rule__Cast__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:299:1: ( rule__Cast__Group__0 )
            {
             before(grammarAccess.getCastAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:300:1: ( rule__Cast__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:300:2: rule__Cast__Group__0
            {
            pushFollow(FOLLOW_rule__Cast__Group__0_in_ruleCast573);
            rule__Cast__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCastAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCast"


    // $ANTLR start "entryRuleConditionalExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:312:1: entryRuleConditionalExpression : ruleConditionalExpression EOF ;
    public final void entryRuleConditionalExpression() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:313:1: ( ruleConditionalExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:314:1: ruleConditionalExpression EOF
            {
             before(grammarAccess.getConditionalExpressionRule()); 
            pushFollow(FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression600);
            ruleConditionalExpression();

            state._fsp--;

             after(grammarAccess.getConditionalExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalExpression607); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditionalExpression"


    // $ANTLR start "ruleConditionalExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:321:1: ruleConditionalExpression : ( ( rule__ConditionalExpression__Group__0 ) ) ;
    public final void ruleConditionalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:325:2: ( ( ( rule__ConditionalExpression__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:326:1: ( ( rule__ConditionalExpression__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:326:1: ( ( rule__ConditionalExpression__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:327:1: ( rule__ConditionalExpression__Group__0 )
            {
             before(grammarAccess.getConditionalExpressionAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:328:1: ( rule__ConditionalExpression__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:328:2: rule__ConditionalExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__0_in_ruleConditionalExpression633);
            rule__ConditionalExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionalExpression"


    // $ANTLR start "entryRuleTestExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:340:1: entryRuleTestExpression : ruleTestExpression EOF ;
    public final void entryRuleTestExpression() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:341:1: ( ruleTestExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:342:1: ruleTestExpression EOF
            {
             before(grammarAccess.getTestExpressionRule()); 
            pushFollow(FOLLOW_ruleTestExpression_in_entryRuleTestExpression660);
            ruleTestExpression();

            state._fsp--;

             after(grammarAccess.getTestExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestExpression667); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTestExpression"


    // $ANTLR start "ruleTestExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:349:1: ruleTestExpression : ( ruleOrExpression ) ;
    public final void ruleTestExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:353:2: ( ( ruleOrExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:354:1: ( ruleOrExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:354:1: ( ruleOrExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:355:1: ruleOrExpression
            {
             before(grammarAccess.getTestExpressionAccess().getOrExpressionParserRuleCall()); 
            pushFollow(FOLLOW_ruleOrExpression_in_ruleTestExpression693);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getTestExpressionAccess().getOrExpressionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTestExpression"


    // $ANTLR start "entryRuleOrExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:368:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:369:1: ( ruleOrExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:370:1: ruleOrExpression EOF
            {
             before(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression719);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression726); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:377:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:381:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:382:1: ( ( rule__OrExpression__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:382:1: ( ( rule__OrExpression__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:383:1: ( rule__OrExpression__Group__0 )
            {
             before(grammarAccess.getOrExpressionAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:384:1: ( rule__OrExpression__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:384:2: rule__OrExpression__Group__0
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression752);
            rule__OrExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:396:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:397:1: ( ruleAndExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:398:1: ruleAndExpression EOF
            {
             before(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression779);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression786); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:405:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:409:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:410:1: ( ( rule__AndExpression__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:410:1: ( ( rule__AndExpression__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:411:1: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:412:1: ( rule__AndExpression__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:412:2: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression812);
            rule__AndExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRulePrimaryCondExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:424:1: entryRulePrimaryCondExpression : rulePrimaryCondExpression EOF ;
    public final void entryRulePrimaryCondExpression() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:425:1: ( rulePrimaryCondExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:426:1: rulePrimaryCondExpression EOF
            {
             before(grammarAccess.getPrimaryCondExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryCondExpression_in_entryRulePrimaryCondExpression839);
            rulePrimaryCondExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryCondExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryCondExpression846); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryCondExpression"


    // $ANTLR start "rulePrimaryCondExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:433:1: rulePrimaryCondExpression : ( ( rule__PrimaryCondExpression__ExprAssignment ) ) ;
    public final void rulePrimaryCondExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:437:2: ( ( ( rule__PrimaryCondExpression__ExprAssignment ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:438:1: ( ( rule__PrimaryCondExpression__ExprAssignment ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:438:1: ( ( rule__PrimaryCondExpression__ExprAssignment ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:439:1: ( rule__PrimaryCondExpression__ExprAssignment )
            {
             before(grammarAccess.getPrimaryCondExpressionAccess().getExprAssignment()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:440:1: ( rule__PrimaryCondExpression__ExprAssignment )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:440:2: rule__PrimaryCondExpression__ExprAssignment
            {
            pushFollow(FOLLOW_rule__PrimaryCondExpression__ExprAssignment_in_rulePrimaryCondExpression872);
            rule__PrimaryCondExpression__ExprAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryCondExpressionAccess().getExprAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryCondExpression"


    // $ANTLR start "entryRuleBaseBooleanExpr"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:452:1: entryRuleBaseBooleanExpr : ruleBaseBooleanExpr EOF ;
    public final void entryRuleBaseBooleanExpr() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:453:1: ( ruleBaseBooleanExpr EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:454:1: ruleBaseBooleanExpr EOF
            {
             before(grammarAccess.getBaseBooleanExprRule()); 
            pushFollow(FOLLOW_ruleBaseBooleanExpr_in_entryRuleBaseBooleanExpr899);
            ruleBaseBooleanExpr();

            state._fsp--;

             after(grammarAccess.getBaseBooleanExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseBooleanExpr906); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBaseBooleanExpr"


    // $ANTLR start "ruleBaseBooleanExpr"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:461:1: ruleBaseBooleanExpr : ( ( rule__BaseBooleanExpr__Group__0 ) ) ;
    public final void ruleBaseBooleanExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:465:2: ( ( ( rule__BaseBooleanExpr__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:466:1: ( ( rule__BaseBooleanExpr__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:466:1: ( ( rule__BaseBooleanExpr__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:467:1: ( rule__BaseBooleanExpr__Group__0 )
            {
             before(grammarAccess.getBaseBooleanExprAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:468:1: ( rule__BaseBooleanExpr__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:468:2: rule__BaseBooleanExpr__Group__0
            {
            pushFollow(FOLLOW_rule__BaseBooleanExpr__Group__0_in_ruleBaseBooleanExpr932);
            rule__BaseBooleanExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBaseBooleanExprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBaseBooleanExpr"


    // $ANTLR start "entryRuleEqualityExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:480:1: entryRuleEqualityExpression : ruleEqualityExpression EOF ;
    public final void entryRuleEqualityExpression() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:481:1: ( ruleEqualityExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:482:1: ruleEqualityExpression EOF
            {
             before(grammarAccess.getEqualityExpressionRule()); 
            pushFollow(FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression959);
            ruleEqualityExpression();

            state._fsp--;

             after(grammarAccess.getEqualityExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualityExpression966); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:489:1: ruleEqualityExpression : ( ( rule__EqualityExpression__Group__0 ) ) ;
    public final void ruleEqualityExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:493:2: ( ( ( rule__EqualityExpression__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:494:1: ( ( rule__EqualityExpression__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:494:1: ( ( rule__EqualityExpression__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:495:1: ( rule__EqualityExpression__Group__0 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:496:1: ( rule__EqualityExpression__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:496:2: rule__EqualityExpression__Group__0
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group__0_in_ruleEqualityExpression992);
            rule__EqualityExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleRelationalExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:508:1: entryRuleRelationalExpression : ruleRelationalExpression EOF ;
    public final void entryRuleRelationalExpression() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:509:1: ( ruleRelationalExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:510:1: ruleRelationalExpression EOF
            {
             before(grammarAccess.getRelationalExpressionRule()); 
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression1019);
            ruleRelationalExpression();

            state._fsp--;

             after(grammarAccess.getRelationalExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression1026); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:517:1: ruleRelationalExpression : ( ( rule__RelationalExpression__Group__0 ) ) ;
    public final void ruleRelationalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:521:2: ( ( ( rule__RelationalExpression__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:522:1: ( ( rule__RelationalExpression__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:522:1: ( ( rule__RelationalExpression__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:523:1: ( rule__RelationalExpression__Group__0 )
            {
             before(grammarAccess.getRelationalExpressionAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:524:1: ( rule__RelationalExpression__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:524:2: rule__RelationalExpression__Group__0
            {
            pushFollow(FOLLOW_rule__RelationalExpression__Group__0_in_ruleRelationalExpression1052);
            rule__RelationalExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationalExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleInstanceOfExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:536:1: entryRuleInstanceOfExpression : ruleInstanceOfExpression EOF ;
    public final void entryRuleInstanceOfExpression() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:537:1: ( ruleInstanceOfExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:538:1: ruleInstanceOfExpression EOF
            {
             before(grammarAccess.getInstanceOfExpressionRule()); 
            pushFollow(FOLLOW_ruleInstanceOfExpression_in_entryRuleInstanceOfExpression1079);
            ruleInstanceOfExpression();

            state._fsp--;

             after(grammarAccess.getInstanceOfExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceOfExpression1086); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstanceOfExpression"


    // $ANTLR start "ruleInstanceOfExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:545:1: ruleInstanceOfExpression : ( ( rule__InstanceOfExpression__Group__0 ) ) ;
    public final void ruleInstanceOfExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:549:2: ( ( ( rule__InstanceOfExpression__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:550:1: ( ( rule__InstanceOfExpression__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:550:1: ( ( rule__InstanceOfExpression__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:551:1: ( rule__InstanceOfExpression__Group__0 )
            {
             before(grammarAccess.getInstanceOfExpressionAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:552:1: ( rule__InstanceOfExpression__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:552:2: rule__InstanceOfExpression__Group__0
            {
            pushFollow(FOLLOW_rule__InstanceOfExpression__Group__0_in_ruleInstanceOfExpression1112);
            rule__InstanceOfExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstanceOfExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstanceOfExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:564:1: entryRuleAdditiveExpression : ruleAdditiveExpression EOF ;
    public final void entryRuleAdditiveExpression() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:565:1: ( ruleAdditiveExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:566:1: ruleAdditiveExpression EOF
            {
             before(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression1139);
            ruleAdditiveExpression();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression1146); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:573:1: ruleAdditiveExpression : ( ( rule__AdditiveExpression__Group__0 ) ) ;
    public final void ruleAdditiveExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:577:2: ( ( ( rule__AdditiveExpression__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:578:1: ( ( rule__AdditiveExpression__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:578:1: ( ( rule__AdditiveExpression__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:579:1: ( rule__AdditiveExpression__Group__0 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:580:1: ( rule__AdditiveExpression__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:580:2: rule__AdditiveExpression__Group__0
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__Group__0_in_ruleAdditiveExpression1172);
            rule__AdditiveExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:592:1: entryRuleMultiplicativeExpression : ruleMultiplicativeExpression EOF ;
    public final void entryRuleMultiplicativeExpression() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:593:1: ( ruleMultiplicativeExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:594:1: ruleMultiplicativeExpression EOF
            {
             before(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression1199);
            ruleMultiplicativeExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression1206); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:601:1: ruleMultiplicativeExpression : ( ( rule__MultiplicativeExpression__Group__0 ) ) ;
    public final void ruleMultiplicativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:605:2: ( ( ( rule__MultiplicativeExpression__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:606:1: ( ( rule__MultiplicativeExpression__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:606:1: ( ( rule__MultiplicativeExpression__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:607:1: ( rule__MultiplicativeExpression__Group__0 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:608:1: ( rule__MultiplicativeExpression__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:608:2: rule__MultiplicativeExpression__Group__0
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group__0_in_ruleMultiplicativeExpression1232);
            rule__MultiplicativeExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleRelationalOp"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:620:1: entryRuleRelationalOp : ruleRelationalOp EOF ;
    public final void entryRuleRelationalOp() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:621:1: ( ruleRelationalOp EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:622:1: ruleRelationalOp EOF
            {
             before(grammarAccess.getRelationalOpRule()); 
            pushFollow(FOLLOW_ruleRelationalOp_in_entryRuleRelationalOp1259);
            ruleRelationalOp();

            state._fsp--;

             after(grammarAccess.getRelationalOpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalOp1266); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationalOp"


    // $ANTLR start "ruleRelationalOp"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:629:1: ruleRelationalOp : ( ( rule__RelationalOp__Alternatives ) ) ;
    public final void ruleRelationalOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:633:2: ( ( ( rule__RelationalOp__Alternatives ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:634:1: ( ( rule__RelationalOp__Alternatives ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:634:1: ( ( rule__RelationalOp__Alternatives ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:635:1: ( rule__RelationalOp__Alternatives )
            {
             before(grammarAccess.getRelationalOpAccess().getAlternatives()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:636:1: ( rule__RelationalOp__Alternatives )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:636:2: rule__RelationalOp__Alternatives
            {
            pushFollow(FOLLOW_rule__RelationalOp__Alternatives_in_ruleRelationalOp1292);
            rule__RelationalOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationalOpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationalOp"


    // $ANTLR start "entryRuleCreator"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:648:1: entryRuleCreator : ruleCreator EOF ;
    public final void entryRuleCreator() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:649:1: ( ruleCreator EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:650:1: ruleCreator EOF
            {
             before(grammarAccess.getCreatorRule()); 
            pushFollow(FOLLOW_ruleCreator_in_entryRuleCreator1319);
            ruleCreator();

            state._fsp--;

             after(grammarAccess.getCreatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreator1326); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCreator"


    // $ANTLR start "ruleCreator"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:657:1: ruleCreator : ( ( rule__Creator__Alternatives ) ) ;
    public final void ruleCreator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:661:2: ( ( ( rule__Creator__Alternatives ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:662:1: ( ( rule__Creator__Alternatives ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:662:1: ( ( rule__Creator__Alternatives ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:663:1: ( rule__Creator__Alternatives )
            {
             before(grammarAccess.getCreatorAccess().getAlternatives()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:664:1: ( rule__Creator__Alternatives )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:664:2: rule__Creator__Alternatives
            {
            pushFollow(FOLLOW_rule__Creator__Alternatives_in_ruleCreator1352);
            rule__Creator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCreatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCreator"


    // $ANTLR start "entryRuleClassCreator"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:676:1: entryRuleClassCreator : ruleClassCreator EOF ;
    public final void entryRuleClassCreator() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:677:1: ( ruleClassCreator EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:678:1: ruleClassCreator EOF
            {
             before(grammarAccess.getClassCreatorRule()); 
            pushFollow(FOLLOW_ruleClassCreator_in_entryRuleClassCreator1379);
            ruleClassCreator();

            state._fsp--;

             after(grammarAccess.getClassCreatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassCreator1386); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClassCreator"


    // $ANTLR start "ruleClassCreator"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:685:1: ruleClassCreator : ( ( rule__ClassCreator__Group__0 ) ) ;
    public final void ruleClassCreator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:689:2: ( ( ( rule__ClassCreator__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:690:1: ( ( rule__ClassCreator__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:690:1: ( ( rule__ClassCreator__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:691:1: ( rule__ClassCreator__Group__0 )
            {
             before(grammarAccess.getClassCreatorAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:692:1: ( rule__ClassCreator__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:692:2: rule__ClassCreator__Group__0
            {
            pushFollow(FOLLOW_rule__ClassCreator__Group__0_in_ruleClassCreator1412);
            rule__ClassCreator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassCreatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassCreator"


    // $ANTLR start "entryRuleArrayCreator"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:704:1: entryRuleArrayCreator : ruleArrayCreator EOF ;
    public final void entryRuleArrayCreator() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:705:1: ( ruleArrayCreator EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:706:1: ruleArrayCreator EOF
            {
             before(grammarAccess.getArrayCreatorRule()); 
            pushFollow(FOLLOW_ruleArrayCreator_in_entryRuleArrayCreator1439);
            ruleArrayCreator();

            state._fsp--;

             after(grammarAccess.getArrayCreatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayCreator1446); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrayCreator"


    // $ANTLR start "ruleArrayCreator"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:713:1: ruleArrayCreator : ( ( rule__ArrayCreator__Group__0 ) ) ;
    public final void ruleArrayCreator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:717:2: ( ( ( rule__ArrayCreator__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:718:1: ( ( rule__ArrayCreator__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:718:1: ( ( rule__ArrayCreator__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:719:1: ( rule__ArrayCreator__Group__0 )
            {
             before(grammarAccess.getArrayCreatorAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:720:1: ( rule__ArrayCreator__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:720:2: rule__ArrayCreator__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayCreator__Group__0_in_ruleArrayCreator1472);
            rule__ArrayCreator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayCreatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayCreator"


    // $ANTLR start "entryRuleArrayInitializer"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:732:1: entryRuleArrayInitializer : ruleArrayInitializer EOF ;
    public final void entryRuleArrayInitializer() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:733:1: ( ruleArrayInitializer EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:734:1: ruleArrayInitializer EOF
            {
             before(grammarAccess.getArrayInitializerRule()); 
            pushFollow(FOLLOW_ruleArrayInitializer_in_entryRuleArrayInitializer1499);
            ruleArrayInitializer();

            state._fsp--;

             after(grammarAccess.getArrayInitializerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayInitializer1506); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrayInitializer"


    // $ANTLR start "ruleArrayInitializer"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:741:1: ruleArrayInitializer : ( ( rule__ArrayInitializer__Group__0 ) ) ;
    public final void ruleArrayInitializer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:745:2: ( ( ( rule__ArrayInitializer__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:746:1: ( ( rule__ArrayInitializer__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:746:1: ( ( rule__ArrayInitializer__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:747:1: ( rule__ArrayInitializer__Group__0 )
            {
             before(grammarAccess.getArrayInitializerAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:748:1: ( rule__ArrayInitializer__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:748:2: rule__ArrayInitializer__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayInitializer__Group__0_in_ruleArrayInitializer1532);
            rule__ArrayInitializer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayInitializerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayInitializer"


    // $ANTLR start "entryRuleArrayType"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:762:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:763:1: ( ruleArrayType EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:764:1: ruleArrayType EOF
            {
             before(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_ruleArrayType_in_entryRuleArrayType1561);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayType1568); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:771:1: ruleArrayType : ( ( rule__ArrayType__Group__0 ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:775:2: ( ( ( rule__ArrayType__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:776:1: ( ( rule__ArrayType__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:776:1: ( ( rule__ArrayType__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:777:1: ( rule__ArrayType__Group__0 )
            {
             before(grammarAccess.getArrayTypeAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:778:1: ( rule__ArrayType__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:778:2: rule__ArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__0_in_ruleArrayType1594);
            rule__ArrayType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleClassOrInterfaceType"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:790:1: entryRuleClassOrInterfaceType : ruleClassOrInterfaceType EOF ;
    public final void entryRuleClassOrInterfaceType() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:791:1: ( ruleClassOrInterfaceType EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:792:1: ruleClassOrInterfaceType EOF
            {
             before(grammarAccess.getClassOrInterfaceTypeRule()); 
            pushFollow(FOLLOW_ruleClassOrInterfaceType_in_entryRuleClassOrInterfaceType1621);
            ruleClassOrInterfaceType();

            state._fsp--;

             after(grammarAccess.getClassOrInterfaceTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassOrInterfaceType1628); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClassOrInterfaceType"


    // $ANTLR start "ruleClassOrInterfaceType"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:799:1: ruleClassOrInterfaceType : ( ( rule__ClassOrInterfaceType__QualifiedNameAssignment ) ) ;
    public final void ruleClassOrInterfaceType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:803:2: ( ( ( rule__ClassOrInterfaceType__QualifiedNameAssignment ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:804:1: ( ( rule__ClassOrInterfaceType__QualifiedNameAssignment ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:804:1: ( ( rule__ClassOrInterfaceType__QualifiedNameAssignment ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:805:1: ( rule__ClassOrInterfaceType__QualifiedNameAssignment )
            {
             before(grammarAccess.getClassOrInterfaceTypeAccess().getQualifiedNameAssignment()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:806:1: ( rule__ClassOrInterfaceType__QualifiedNameAssignment )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:806:2: rule__ClassOrInterfaceType__QualifiedNameAssignment
            {
            pushFollow(FOLLOW_rule__ClassOrInterfaceType__QualifiedNameAssignment_in_ruleClassOrInterfaceType1654);
            rule__ClassOrInterfaceType__QualifiedNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getClassOrInterfaceTypeAccess().getQualifiedNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassOrInterfaceType"


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:818:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:819:1: ( ruleQualifiedName EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:820:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1681);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1688); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:827:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:831:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:832:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:832:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:833:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:834:1: ( rule__QualifiedName__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:834:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1714);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleLiteral"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:846:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:847:1: ( ruleLiteral EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:848:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1741);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1748); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:855:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:859:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:860:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:860:1: ( ( rule__Literal__Alternatives ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:861:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:862:1: ( rule__Literal__Alternatives )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:862:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1774);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRulePrimitiveType"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:874:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:875:1: ( rulePrimitiveType EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:876:1: rulePrimitiveType EOF
            {
             before(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType1801);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType1808); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:883:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:887:2: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:888:1: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:888:1: ( ( rule__PrimitiveType__Alternatives ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:889:1: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:890:1: ( rule__PrimitiveType__Alternatives )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:890:2: rule__PrimitiveType__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType1834);
            rule__PrimitiveType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "rule__Expression__Alternatives"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:902:1: rule__Expression__Alternatives : ( ( ruleCreator ) | ( ( rule__Expression__Group_1__0 ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:906:1: ( ( ruleCreator ) | ( ( rule__Expression__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_NEW) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=RULE_INTLITERAL && LA1_0<=RULE_LPAREN)||LA1_0==RULE_NOT||(LA1_0>=RULE_IDENTIFIER && LA1_0<=RULE_VARIABLETOKEN)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:907:1: ( ruleCreator )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:907:1: ( ruleCreator )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:908:1: ruleCreator
                    {
                     before(grammarAccess.getExpressionAccess().getCreatorParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCreator_in_rule__Expression__Alternatives1870);
                    ruleCreator();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getCreatorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:913:6: ( ( rule__Expression__Group_1__0 ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:913:6: ( ( rule__Expression__Group_1__0 ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:914:1: ( rule__Expression__Group_1__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1()); 
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:915:1: ( rule__Expression__Group_1__0 )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:915:2: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Alternatives1887);
                    rule__Expression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__BaseJRExpr__Alternatives"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:924:1: rule__BaseJRExpr__Alternatives : ( ( ( rule__BaseJRExpr__FieldTokenAssignment_0 ) ) | ( ( rule__BaseJRExpr__ParameterTokenAssignment_1 ) ) | ( ( rule__BaseJRExpr__VariableTokenAssignment_2 ) ) );
    public final void rule__BaseJRExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:928:1: ( ( ( rule__BaseJRExpr__FieldTokenAssignment_0 ) ) | ( ( rule__BaseJRExpr__ParameterTokenAssignment_1 ) ) | ( ( rule__BaseJRExpr__VariableTokenAssignment_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_FIELDTOKEN:
                {
                alt2=1;
                }
                break;
            case RULE_PARAMETERTOKEN:
                {
                alt2=2;
                }
                break;
            case RULE_VARIABLETOKEN:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:929:1: ( ( rule__BaseJRExpr__FieldTokenAssignment_0 ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:929:1: ( ( rule__BaseJRExpr__FieldTokenAssignment_0 ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:930:1: ( rule__BaseJRExpr__FieldTokenAssignment_0 )
                    {
                     before(grammarAccess.getBaseJRExprAccess().getFieldTokenAssignment_0()); 
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:931:1: ( rule__BaseJRExpr__FieldTokenAssignment_0 )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:931:2: rule__BaseJRExpr__FieldTokenAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BaseJRExpr__FieldTokenAssignment_0_in_rule__BaseJRExpr__Alternatives1920);
                    rule__BaseJRExpr__FieldTokenAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBaseJRExprAccess().getFieldTokenAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:935:6: ( ( rule__BaseJRExpr__ParameterTokenAssignment_1 ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:935:6: ( ( rule__BaseJRExpr__ParameterTokenAssignment_1 ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:936:1: ( rule__BaseJRExpr__ParameterTokenAssignment_1 )
                    {
                     before(grammarAccess.getBaseJRExprAccess().getParameterTokenAssignment_1()); 
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:937:1: ( rule__BaseJRExpr__ParameterTokenAssignment_1 )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:937:2: rule__BaseJRExpr__ParameterTokenAssignment_1
                    {
                    pushFollow(FOLLOW_rule__BaseJRExpr__ParameterTokenAssignment_1_in_rule__BaseJRExpr__Alternatives1938);
                    rule__BaseJRExpr__ParameterTokenAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBaseJRExprAccess().getParameterTokenAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:941:6: ( ( rule__BaseJRExpr__VariableTokenAssignment_2 ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:941:6: ( ( rule__BaseJRExpr__VariableTokenAssignment_2 ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:942:1: ( rule__BaseJRExpr__VariableTokenAssignment_2 )
                    {
                     before(grammarAccess.getBaseJRExprAccess().getVariableTokenAssignment_2()); 
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:943:1: ( rule__BaseJRExpr__VariableTokenAssignment_2 )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:943:2: rule__BaseJRExpr__VariableTokenAssignment_2
                    {
                    pushFollow(FOLLOW_rule__BaseJRExpr__VariableTokenAssignment_2_in_rule__BaseJRExpr__Alternatives1956);
                    rule__BaseJRExpr__VariableTokenAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getBaseJRExprAccess().getVariableTokenAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseJRExpr__Alternatives"


    // $ANTLR start "rule__BaseCommonExpression__Alternatives"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:952:1: rule__BaseCommonExpression__Alternatives : ( ( ( rule__BaseCommonExpression__BasejrexprAssignment_0 ) ) | ( ( rule__BaseCommonExpression__LiteralAssignment_1 ) ) | ( ( rule__BaseCommonExpression__Group_2__0 ) ) | ( ruleMethodInvocation ) );
    public final void rule__BaseCommonExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:956:1: ( ( ( rule__BaseCommonExpression__BasejrexprAssignment_0 ) ) | ( ( rule__BaseCommonExpression__LiteralAssignment_1 ) ) | ( ( rule__BaseCommonExpression__Group_2__0 ) ) | ( ruleMethodInvocation ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_FIELDTOKEN:
            case RULE_PARAMETERTOKEN:
            case RULE_VARIABLETOKEN:
                {
                alt3=1;
                }
                break;
            case RULE_INTLITERAL:
            case RULE_LONGLITERAL:
            case RULE_FLOATLITERAL:
            case RULE_DOUBLELITERAL:
            case RULE_CHARLITERAL:
            case RULE_STRINGLITERAL:
            case RULE_TRUE:
            case RULE_FALSE:
            case RULE_NULL:
                {
                alt3=2;
                }
                break;
            case RULE_LPAREN:
                {
                alt3=3;
                }
                break;
            case RULE_IDENTIFIER:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:957:1: ( ( rule__BaseCommonExpression__BasejrexprAssignment_0 ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:957:1: ( ( rule__BaseCommonExpression__BasejrexprAssignment_0 ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:958:1: ( rule__BaseCommonExpression__BasejrexprAssignment_0 )
                    {
                     before(grammarAccess.getBaseCommonExpressionAccess().getBasejrexprAssignment_0()); 
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:959:1: ( rule__BaseCommonExpression__BasejrexprAssignment_0 )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:959:2: rule__BaseCommonExpression__BasejrexprAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BaseCommonExpression__BasejrexprAssignment_0_in_rule__BaseCommonExpression__Alternatives1989);
                    rule__BaseCommonExpression__BasejrexprAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBaseCommonExpressionAccess().getBasejrexprAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:963:6: ( ( rule__BaseCommonExpression__LiteralAssignment_1 ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:963:6: ( ( rule__BaseCommonExpression__LiteralAssignment_1 ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:964:1: ( rule__BaseCommonExpression__LiteralAssignment_1 )
                    {
                     before(grammarAccess.getBaseCommonExpressionAccess().getLiteralAssignment_1()); 
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:965:1: ( rule__BaseCommonExpression__LiteralAssignment_1 )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:965:2: rule__BaseCommonExpression__LiteralAssignment_1
                    {
                    pushFollow(FOLLOW_rule__BaseCommonExpression__LiteralAssignment_1_in_rule__BaseCommonExpression__Alternatives2007);
                    rule__BaseCommonExpression__LiteralAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBaseCommonExpressionAccess().getLiteralAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:969:6: ( ( rule__BaseCommonExpression__Group_2__0 ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:969:6: ( ( rule__BaseCommonExpression__Group_2__0 ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:970:1: ( rule__BaseCommonExpression__Group_2__0 )
                    {
                     before(grammarAccess.getBaseCommonExpressionAccess().getGroup_2()); 
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:971:1: ( rule__BaseCommonExpression__Group_2__0 )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:971:2: rule__BaseCommonExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__BaseCommonExpression__Group_2__0_in_rule__BaseCommonExpression__Alternatives2025);
                    rule__BaseCommonExpression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBaseCommonExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:975:6: ( ruleMethodInvocation )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:975:6: ( ruleMethodInvocation )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:976:1: ruleMethodInvocation
                    {
                     before(grammarAccess.getBaseCommonExpressionAccess().getMethodInvocationParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleMethodInvocation_in_rule__BaseCommonExpression__Alternatives2043);
                    ruleMethodInvocation();

                    state._fsp--;

                     after(grammarAccess.getBaseCommonExpressionAccess().getMethodInvocationParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseCommonExpression__Alternatives"


    // $ANTLR start "rule__Cast__Alternatives_1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:986:1: rule__Cast__Alternatives_1 : ( ( ( rule__Cast__PtypeAssignment_1_0 ) ) | ( ( rule__Cast__ArrtypeAssignment_1_1 ) ) | ( ( rule__Cast__ClazztypeAssignment_1_2 ) ) );
    public final void rule__Cast__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:990:1: ( ( ( rule__Cast__PtypeAssignment_1_0 ) ) | ( ( rule__Cast__ArrtypeAssignment_1_1 ) ) | ( ( rule__Cast__ClazztypeAssignment_1_2 ) ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:991:1: ( ( rule__Cast__PtypeAssignment_1_0 ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:991:1: ( ( rule__Cast__PtypeAssignment_1_0 ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:992:1: ( rule__Cast__PtypeAssignment_1_0 )
                    {
                     before(grammarAccess.getCastAccess().getPtypeAssignment_1_0()); 
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:993:1: ( rule__Cast__PtypeAssignment_1_0 )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:993:2: rule__Cast__PtypeAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Cast__PtypeAssignment_1_0_in_rule__Cast__Alternatives_12075);
                    rule__Cast__PtypeAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCastAccess().getPtypeAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:997:6: ( ( rule__Cast__ArrtypeAssignment_1_1 ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:997:6: ( ( rule__Cast__ArrtypeAssignment_1_1 ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:998:1: ( rule__Cast__ArrtypeAssignment_1_1 )
                    {
                     before(grammarAccess.getCastAccess().getArrtypeAssignment_1_1()); 
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:999:1: ( rule__Cast__ArrtypeAssignment_1_1 )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:999:2: rule__Cast__ArrtypeAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Cast__ArrtypeAssignment_1_1_in_rule__Cast__Alternatives_12093);
                    rule__Cast__ArrtypeAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCastAccess().getArrtypeAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1003:6: ( ( rule__Cast__ClazztypeAssignment_1_2 ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1003:6: ( ( rule__Cast__ClazztypeAssignment_1_2 ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1004:1: ( rule__Cast__ClazztypeAssignment_1_2 )
                    {
                     before(grammarAccess.getCastAccess().getClazztypeAssignment_1_2()); 
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1005:1: ( rule__Cast__ClazztypeAssignment_1_2 )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1005:2: rule__Cast__ClazztypeAssignment_1_2
                    {
                    pushFollow(FOLLOW_rule__Cast__ClazztypeAssignment_1_2_in_rule__Cast__Alternatives_12111);
                    rule__Cast__ClazztypeAssignment_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getCastAccess().getClazztypeAssignment_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cast__Alternatives_1"


    // $ANTLR start "rule__EqualityExpression__Alternatives_1_0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1014:1: rule__EqualityExpression__Alternatives_1_0 : ( ( RULE_EQUAL ) | ( RULE_NOTEQUAL ) );
    public final void rule__EqualityExpression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1018:1: ( ( RULE_EQUAL ) | ( RULE_NOTEQUAL ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_EQUAL) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_NOTEQUAL) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1019:1: ( RULE_EQUAL )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1019:1: ( RULE_EQUAL )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1020:1: RULE_EQUAL
                    {
                     before(grammarAccess.getEqualityExpressionAccess().getEQUALTerminalRuleCall_1_0_0()); 
                    match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_rule__EqualityExpression__Alternatives_1_02144); 
                     after(grammarAccess.getEqualityExpressionAccess().getEQUALTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1025:6: ( RULE_NOTEQUAL )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1025:6: ( RULE_NOTEQUAL )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1026:1: RULE_NOTEQUAL
                    {
                     before(grammarAccess.getEqualityExpressionAccess().getNOTEQUALTerminalRuleCall_1_0_1()); 
                    match(input,RULE_NOTEQUAL,FOLLOW_RULE_NOTEQUAL_in_rule__EqualityExpression__Alternatives_1_02161); 
                     after(grammarAccess.getEqualityExpressionAccess().getNOTEQUALTerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Alternatives_1_0"


    // $ANTLR start "rule__InstanceOfExpression__TargetAlternatives_1_1_0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1036:1: rule__InstanceOfExpression__TargetAlternatives_1_1_0 : ( ( ruleRelationalExpression ) | ( ruleClassOrInterfaceType ) );
    public final void rule__InstanceOfExpression__TargetAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1040:1: ( ( ruleRelationalExpression ) | ( ruleClassOrInterfaceType ) )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1041:1: ( ruleRelationalExpression )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1041:1: ( ruleRelationalExpression )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1042:1: ruleRelationalExpression
                    {
                     before(grammarAccess.getInstanceOfExpressionAccess().getTargetRelationalExpressionParserRuleCall_1_1_0_0()); 
                    pushFollow(FOLLOW_ruleRelationalExpression_in_rule__InstanceOfExpression__TargetAlternatives_1_1_02193);
                    ruleRelationalExpression();

                    state._fsp--;

                     after(grammarAccess.getInstanceOfExpressionAccess().getTargetRelationalExpressionParserRuleCall_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1047:6: ( ruleClassOrInterfaceType )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1047:6: ( ruleClassOrInterfaceType )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1048:1: ruleClassOrInterfaceType
                    {
                     before(grammarAccess.getInstanceOfExpressionAccess().getTargetClassOrInterfaceTypeParserRuleCall_1_1_0_1()); 
                    pushFollow(FOLLOW_ruleClassOrInterfaceType_in_rule__InstanceOfExpression__TargetAlternatives_1_1_02210);
                    ruleClassOrInterfaceType();

                    state._fsp--;

                     after(grammarAccess.getInstanceOfExpressionAccess().getTargetClassOrInterfaceTypeParserRuleCall_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceOfExpression__TargetAlternatives_1_1_0"


    // $ANTLR start "rule__AdditiveExpression__Alternatives_1_0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1058:1: rule__AdditiveExpression__Alternatives_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__AdditiveExpression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1062:1: ( ( '+' ) | ( '-' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==51) ) {
                alt7=1;
            }
            else if ( (LA7_0==52) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1063:1: ( '+' )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1063:1: ( '+' )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1064:1: '+'
                    {
                     before(grammarAccess.getAdditiveExpressionAccess().getPlusSignKeyword_1_0_0()); 
                    match(input,51,FOLLOW_51_in_rule__AdditiveExpression__Alternatives_1_02243); 
                     after(grammarAccess.getAdditiveExpressionAccess().getPlusSignKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1071:6: ( '-' )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1071:6: ( '-' )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1072:1: '-'
                    {
                     before(grammarAccess.getAdditiveExpressionAccess().getHyphenMinusKeyword_1_0_1()); 
                    match(input,52,FOLLOW_52_in_rule__AdditiveExpression__Alternatives_1_02263); 
                     after(grammarAccess.getAdditiveExpressionAccess().getHyphenMinusKeyword_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Alternatives_1_0"


    // $ANTLR start "rule__MultiplicativeExpression__Alternatives_2_0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1084:1: rule__MultiplicativeExpression__Alternatives_2_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__MultiplicativeExpression__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1088:1: ( ( '*' ) | ( '/' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==53) ) {
                alt8=1;
            }
            else if ( (LA8_0==54) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1089:1: ( '*' )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1089:1: ( '*' )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1090:1: '*'
                    {
                     before(grammarAccess.getMultiplicativeExpressionAccess().getAsteriskKeyword_2_0_0()); 
                    match(input,53,FOLLOW_53_in_rule__MultiplicativeExpression__Alternatives_2_02298); 
                     after(grammarAccess.getMultiplicativeExpressionAccess().getAsteriskKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1097:6: ( '/' )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1097:6: ( '/' )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1098:1: '/'
                    {
                     before(grammarAccess.getMultiplicativeExpressionAccess().getSolidusKeyword_2_0_1()); 
                    match(input,54,FOLLOW_54_in_rule__MultiplicativeExpression__Alternatives_2_02318); 
                     after(grammarAccess.getMultiplicativeExpressionAccess().getSolidusKeyword_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Alternatives_2_0"


    // $ANTLR start "rule__RelationalOp__Alternatives"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1110:1: rule__RelationalOp__Alternatives : ( ( RULE_GT ) | ( RULE_GTE ) | ( RULE_LT ) | ( RULE_LTE ) );
    public final void rule__RelationalOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1114:1: ( ( RULE_GT ) | ( RULE_GTE ) | ( RULE_LT ) | ( RULE_LTE ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case RULE_GT:
                {
                alt9=1;
                }
                break;
            case RULE_GTE:
                {
                alt9=2;
                }
                break;
            case RULE_LT:
                {
                alt9=3;
                }
                break;
            case RULE_LTE:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1115:1: ( RULE_GT )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1115:1: ( RULE_GT )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1116:1: RULE_GT
                    {
                     before(grammarAccess.getRelationalOpAccess().getGTTerminalRuleCall_0()); 
                    match(input,RULE_GT,FOLLOW_RULE_GT_in_rule__RelationalOp__Alternatives2352); 
                     after(grammarAccess.getRelationalOpAccess().getGTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1121:6: ( RULE_GTE )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1121:6: ( RULE_GTE )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1122:1: RULE_GTE
                    {
                     before(grammarAccess.getRelationalOpAccess().getGTETerminalRuleCall_1()); 
                    match(input,RULE_GTE,FOLLOW_RULE_GTE_in_rule__RelationalOp__Alternatives2369); 
                     after(grammarAccess.getRelationalOpAccess().getGTETerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1127:6: ( RULE_LT )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1127:6: ( RULE_LT )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1128:1: RULE_LT
                    {
                     before(grammarAccess.getRelationalOpAccess().getLTTerminalRuleCall_2()); 
                    match(input,RULE_LT,FOLLOW_RULE_LT_in_rule__RelationalOp__Alternatives2386); 
                     after(grammarAccess.getRelationalOpAccess().getLTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1133:6: ( RULE_LTE )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1133:6: ( RULE_LTE )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1134:1: RULE_LTE
                    {
                     before(grammarAccess.getRelationalOpAccess().getLTETerminalRuleCall_3()); 
                    match(input,RULE_LTE,FOLLOW_RULE_LTE_in_rule__RelationalOp__Alternatives2403); 
                     after(grammarAccess.getRelationalOpAccess().getLTETerminalRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalOp__Alternatives"


    // $ANTLR start "rule__Creator__Alternatives"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1144:1: rule__Creator__Alternatives : ( ( ruleClassCreator ) | ( ruleArrayCreator ) );
    public final void rule__Creator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1148:1: ( ( ruleClassCreator ) | ( ruleArrayCreator ) )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1149:1: ( ruleClassCreator )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1149:1: ( ruleClassCreator )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1150:1: ruleClassCreator
                    {
                     before(grammarAccess.getCreatorAccess().getClassCreatorParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleClassCreator_in_rule__Creator__Alternatives2435);
                    ruleClassCreator();

                    state._fsp--;

                     after(grammarAccess.getCreatorAccess().getClassCreatorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1155:6: ( ruleArrayCreator )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1155:6: ( ruleArrayCreator )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1156:1: ruleArrayCreator
                    {
                     before(grammarAccess.getCreatorAccess().getArrayCreatorParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleArrayCreator_in_rule__Creator__Alternatives2452);
                    ruleArrayCreator();

                    state._fsp--;

                     after(grammarAccess.getCreatorAccess().getArrayCreatorParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creator__Alternatives"


    // $ANTLR start "rule__ArrayType__Alternatives_0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1166:1: rule__ArrayType__Alternatives_0 : ( ( ( rule__ArrayType__ClazzInterfAssignment_0_0 ) ) | ( ( rule__ArrayType__PrimtypeAssignment_0_1 ) ) );
    public final void rule__ArrayType__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1170:1: ( ( ( rule__ArrayType__ClazzInterfAssignment_0_0 ) ) | ( ( rule__ArrayType__PrimtypeAssignment_0_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_IDENTIFIER) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=55 && LA11_0<=62)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1171:1: ( ( rule__ArrayType__ClazzInterfAssignment_0_0 ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1171:1: ( ( rule__ArrayType__ClazzInterfAssignment_0_0 ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1172:1: ( rule__ArrayType__ClazzInterfAssignment_0_0 )
                    {
                     before(grammarAccess.getArrayTypeAccess().getClazzInterfAssignment_0_0()); 
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1173:1: ( rule__ArrayType__ClazzInterfAssignment_0_0 )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1173:2: rule__ArrayType__ClazzInterfAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__ArrayType__ClazzInterfAssignment_0_0_in_rule__ArrayType__Alternatives_02484);
                    rule__ArrayType__ClazzInterfAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArrayTypeAccess().getClazzInterfAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1177:6: ( ( rule__ArrayType__PrimtypeAssignment_0_1 ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1177:6: ( ( rule__ArrayType__PrimtypeAssignment_0_1 ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1178:1: ( rule__ArrayType__PrimtypeAssignment_0_1 )
                    {
                     before(grammarAccess.getArrayTypeAccess().getPrimtypeAssignment_0_1()); 
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1179:1: ( rule__ArrayType__PrimtypeAssignment_0_1 )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1179:2: rule__ArrayType__PrimtypeAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__ArrayType__PrimtypeAssignment_0_1_in_rule__ArrayType__Alternatives_02502);
                    rule__ArrayType__PrimtypeAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getArrayTypeAccess().getPrimtypeAssignment_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Alternatives_0"


    // $ANTLR start "rule__Literal__Alternatives"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1188:1: rule__Literal__Alternatives : ( ( RULE_INTLITERAL ) | ( RULE_LONGLITERAL ) | ( RULE_FLOATLITERAL ) | ( RULE_DOUBLELITERAL ) | ( RULE_CHARLITERAL ) | ( RULE_STRINGLITERAL ) | ( RULE_TRUE ) | ( RULE_FALSE ) | ( RULE_NULL ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1192:1: ( ( RULE_INTLITERAL ) | ( RULE_LONGLITERAL ) | ( RULE_FLOATLITERAL ) | ( RULE_DOUBLELITERAL ) | ( RULE_CHARLITERAL ) | ( RULE_STRINGLITERAL ) | ( RULE_TRUE ) | ( RULE_FALSE ) | ( RULE_NULL ) )
            int alt12=9;
            switch ( input.LA(1) ) {
            case RULE_INTLITERAL:
                {
                alt12=1;
                }
                break;
            case RULE_LONGLITERAL:
                {
                alt12=2;
                }
                break;
            case RULE_FLOATLITERAL:
                {
                alt12=3;
                }
                break;
            case RULE_DOUBLELITERAL:
                {
                alt12=4;
                }
                break;
            case RULE_CHARLITERAL:
                {
                alt12=5;
                }
                break;
            case RULE_STRINGLITERAL:
                {
                alt12=6;
                }
                break;
            case RULE_TRUE:
                {
                alt12=7;
                }
                break;
            case RULE_FALSE:
                {
                alt12=8;
                }
                break;
            case RULE_NULL:
                {
                alt12=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1193:1: ( RULE_INTLITERAL )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1193:1: ( RULE_INTLITERAL )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1194:1: RULE_INTLITERAL
                    {
                     before(grammarAccess.getLiteralAccess().getINTLITERALTerminalRuleCall_0()); 
                    match(input,RULE_INTLITERAL,FOLLOW_RULE_INTLITERAL_in_rule__Literal__Alternatives2535); 
                     after(grammarAccess.getLiteralAccess().getINTLITERALTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1199:6: ( RULE_LONGLITERAL )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1199:6: ( RULE_LONGLITERAL )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1200:1: RULE_LONGLITERAL
                    {
                     before(grammarAccess.getLiteralAccess().getLONGLITERALTerminalRuleCall_1()); 
                    match(input,RULE_LONGLITERAL,FOLLOW_RULE_LONGLITERAL_in_rule__Literal__Alternatives2552); 
                     after(grammarAccess.getLiteralAccess().getLONGLITERALTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1205:6: ( RULE_FLOATLITERAL )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1205:6: ( RULE_FLOATLITERAL )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1206:1: RULE_FLOATLITERAL
                    {
                     before(grammarAccess.getLiteralAccess().getFLOATLITERALTerminalRuleCall_2()); 
                    match(input,RULE_FLOATLITERAL,FOLLOW_RULE_FLOATLITERAL_in_rule__Literal__Alternatives2569); 
                     after(grammarAccess.getLiteralAccess().getFLOATLITERALTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1211:6: ( RULE_DOUBLELITERAL )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1211:6: ( RULE_DOUBLELITERAL )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1212:1: RULE_DOUBLELITERAL
                    {
                     before(grammarAccess.getLiteralAccess().getDOUBLELITERALTerminalRuleCall_3()); 
                    match(input,RULE_DOUBLELITERAL,FOLLOW_RULE_DOUBLELITERAL_in_rule__Literal__Alternatives2586); 
                     after(grammarAccess.getLiteralAccess().getDOUBLELITERALTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1217:6: ( RULE_CHARLITERAL )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1217:6: ( RULE_CHARLITERAL )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1218:1: RULE_CHARLITERAL
                    {
                     before(grammarAccess.getLiteralAccess().getCHARLITERALTerminalRuleCall_4()); 
                    match(input,RULE_CHARLITERAL,FOLLOW_RULE_CHARLITERAL_in_rule__Literal__Alternatives2603); 
                     after(grammarAccess.getLiteralAccess().getCHARLITERALTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1223:6: ( RULE_STRINGLITERAL )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1223:6: ( RULE_STRINGLITERAL )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1224:1: RULE_STRINGLITERAL
                    {
                     before(grammarAccess.getLiteralAccess().getSTRINGLITERALTerminalRuleCall_5()); 
                    match(input,RULE_STRINGLITERAL,FOLLOW_RULE_STRINGLITERAL_in_rule__Literal__Alternatives2620); 
                     after(grammarAccess.getLiteralAccess().getSTRINGLITERALTerminalRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1229:6: ( RULE_TRUE )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1229:6: ( RULE_TRUE )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1230:1: RULE_TRUE
                    {
                     before(grammarAccess.getLiteralAccess().getTRUETerminalRuleCall_6()); 
                    match(input,RULE_TRUE,FOLLOW_RULE_TRUE_in_rule__Literal__Alternatives2637); 
                     after(grammarAccess.getLiteralAccess().getTRUETerminalRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1235:6: ( RULE_FALSE )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1235:6: ( RULE_FALSE )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1236:1: RULE_FALSE
                    {
                     before(grammarAccess.getLiteralAccess().getFALSETerminalRuleCall_7()); 
                    match(input,RULE_FALSE,FOLLOW_RULE_FALSE_in_rule__Literal__Alternatives2654); 
                     after(grammarAccess.getLiteralAccess().getFALSETerminalRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1241:6: ( RULE_NULL )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1241:6: ( RULE_NULL )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1242:1: RULE_NULL
                    {
                     before(grammarAccess.getLiteralAccess().getNULLTerminalRuleCall_8()); 
                    match(input,RULE_NULL,FOLLOW_RULE_NULL_in_rule__Literal__Alternatives2671); 
                     after(grammarAccess.getLiteralAccess().getNULLTerminalRuleCall_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__PrimitiveType__Alternatives"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1252:1: rule__PrimitiveType__Alternatives : ( ( 'boolean' ) | ( 'char' ) | ( 'byte' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1256:1: ( ( 'boolean' ) | ( 'char' ) | ( 'byte' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) )
            int alt13=8;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt13=1;
                }
                break;
            case 56:
                {
                alt13=2;
                }
                break;
            case 57:
                {
                alt13=3;
                }
                break;
            case 58:
                {
                alt13=4;
                }
                break;
            case 59:
                {
                alt13=5;
                }
                break;
            case 60:
                {
                alt13=6;
                }
                break;
            case 61:
                {
                alt13=7;
                }
                break;
            case 62:
                {
                alt13=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1257:1: ( 'boolean' )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1257:1: ( 'boolean' )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1258:1: 'boolean'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getBooleanKeyword_0()); 
                    match(input,55,FOLLOW_55_in_rule__PrimitiveType__Alternatives2704); 
                     after(grammarAccess.getPrimitiveTypeAccess().getBooleanKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1265:6: ( 'char' )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1265:6: ( 'char' )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1266:1: 'char'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getCharKeyword_1()); 
                    match(input,56,FOLLOW_56_in_rule__PrimitiveType__Alternatives2724); 
                     after(grammarAccess.getPrimitiveTypeAccess().getCharKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1273:6: ( 'byte' )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1273:6: ( 'byte' )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1274:1: 'byte'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getByteKeyword_2()); 
                    match(input,57,FOLLOW_57_in_rule__PrimitiveType__Alternatives2744); 
                     after(grammarAccess.getPrimitiveTypeAccess().getByteKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1281:6: ( 'short' )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1281:6: ( 'short' )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1282:1: 'short'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getShortKeyword_3()); 
                    match(input,58,FOLLOW_58_in_rule__PrimitiveType__Alternatives2764); 
                     after(grammarAccess.getPrimitiveTypeAccess().getShortKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1289:6: ( 'int' )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1289:6: ( 'int' )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1290:1: 'int'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getIntKeyword_4()); 
                    match(input,59,FOLLOW_59_in_rule__PrimitiveType__Alternatives2784); 
                     after(grammarAccess.getPrimitiveTypeAccess().getIntKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1297:6: ( 'long' )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1297:6: ( 'long' )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1298:1: 'long'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getLongKeyword_5()); 
                    match(input,60,FOLLOW_60_in_rule__PrimitiveType__Alternatives2804); 
                     after(grammarAccess.getPrimitiveTypeAccess().getLongKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1305:6: ( 'float' )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1305:6: ( 'float' )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1306:1: 'float'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getFloatKeyword_6()); 
                    match(input,61,FOLLOW_61_in_rule__PrimitiveType__Alternatives2824); 
                     after(grammarAccess.getPrimitiveTypeAccess().getFloatKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1313:6: ( 'double' )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1313:6: ( 'double' )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1314:1: 'double'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getDoubleKeyword_7()); 
                    match(input,62,FOLLOW_62_in_rule__PrimitiveType__Alternatives2844); 
                     after(grammarAccess.getPrimitiveTypeAccess().getDoubleKeyword_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Alternatives"


    // $ANTLR start "rule__Expression__Group_1__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1328:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1332:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1333:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__02876);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__02879);
            rule__Expression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1340:1: rule__Expression__Group_1__0__Impl : ( ( ruleCast )? ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1344:1: ( ( ( ruleCast )? ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1345:1: ( ( ruleCast )? )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1345:1: ( ( ruleCast )? )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1346:1: ( ruleCast )?
            {
             before(grammarAccess.getExpressionAccess().getCastParserRuleCall_1_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1347:1: ( ruleCast )?
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1347:3: ruleCast
                    {
                    pushFollow(FOLLOW_ruleCast_in_rule__Expression__Group_1__0__Impl2907);
                    ruleCast();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getCastParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1357:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1361:1: ( rule__Expression__Group_1__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1362:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__12938);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1368:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__CondExprAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1372:1: ( ( ( rule__Expression__CondExprAssignment_1_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1373:1: ( ( rule__Expression__CondExprAssignment_1_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1373:1: ( ( rule__Expression__CondExprAssignment_1_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1374:1: ( rule__Expression__CondExprAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getCondExprAssignment_1_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1375:1: ( rule__Expression__CondExprAssignment_1_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1375:2: rule__Expression__CondExprAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expression__CondExprAssignment_1_1_in_rule__Expression__Group_1__1__Impl2965);
            rule__Expression__CondExprAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getCondExprAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__MethodInvocation__Group__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1389:1: rule__MethodInvocation__Group__0 : rule__MethodInvocation__Group__0__Impl rule__MethodInvocation__Group__1 ;
    public final void rule__MethodInvocation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1393:1: ( rule__MethodInvocation__Group__0__Impl rule__MethodInvocation__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1394:2: rule__MethodInvocation__Group__0__Impl rule__MethodInvocation__Group__1
            {
            pushFollow(FOLLOW_rule__MethodInvocation__Group__0__Impl_in_rule__MethodInvocation__Group__02999);
            rule__MethodInvocation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodInvocation__Group__1_in_rule__MethodInvocation__Group__03002);
            rule__MethodInvocation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodInvocation__Group__0"


    // $ANTLR start "rule__MethodInvocation__Group__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1401:1: rule__MethodInvocation__Group__0__Impl : ( ( rule__MethodInvocation__FullyQualifiedMethodNameAssignment_0 ) ) ;
    public final void rule__MethodInvocation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1405:1: ( ( ( rule__MethodInvocation__FullyQualifiedMethodNameAssignment_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1406:1: ( ( rule__MethodInvocation__FullyQualifiedMethodNameAssignment_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1406:1: ( ( rule__MethodInvocation__FullyQualifiedMethodNameAssignment_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1407:1: ( rule__MethodInvocation__FullyQualifiedMethodNameAssignment_0 )
            {
             before(grammarAccess.getMethodInvocationAccess().getFullyQualifiedMethodNameAssignment_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1408:1: ( rule__MethodInvocation__FullyQualifiedMethodNameAssignment_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1408:2: rule__MethodInvocation__FullyQualifiedMethodNameAssignment_0
            {
            pushFollow(FOLLOW_rule__MethodInvocation__FullyQualifiedMethodNameAssignment_0_in_rule__MethodInvocation__Group__0__Impl3029);
            rule__MethodInvocation__FullyQualifiedMethodNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodInvocationAccess().getFullyQualifiedMethodNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodInvocation__Group__0__Impl"


    // $ANTLR start "rule__MethodInvocation__Group__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1418:1: rule__MethodInvocation__Group__1 : rule__MethodInvocation__Group__1__Impl ;
    public final void rule__MethodInvocation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1422:1: ( rule__MethodInvocation__Group__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1423:2: rule__MethodInvocation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MethodInvocation__Group__1__Impl_in_rule__MethodInvocation__Group__13059);
            rule__MethodInvocation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodInvocation__Group__1"


    // $ANTLR start "rule__MethodInvocation__Group__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1429:1: rule__MethodInvocation__Group__1__Impl : ( ( rule__MethodInvocation__ArgsAssignment_1 ) ) ;
    public final void rule__MethodInvocation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1433:1: ( ( ( rule__MethodInvocation__ArgsAssignment_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1434:1: ( ( rule__MethodInvocation__ArgsAssignment_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1434:1: ( ( rule__MethodInvocation__ArgsAssignment_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1435:1: ( rule__MethodInvocation__ArgsAssignment_1 )
            {
             before(grammarAccess.getMethodInvocationAccess().getArgsAssignment_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1436:1: ( rule__MethodInvocation__ArgsAssignment_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1436:2: rule__MethodInvocation__ArgsAssignment_1
            {
            pushFollow(FOLLOW_rule__MethodInvocation__ArgsAssignment_1_in_rule__MethodInvocation__Group__1__Impl3086);
            rule__MethodInvocation__ArgsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodInvocationAccess().getArgsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodInvocation__Group__1__Impl"


    // $ANTLR start "rule__MethodName__Group__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1450:1: rule__MethodName__Group__0 : rule__MethodName__Group__0__Impl rule__MethodName__Group__1 ;
    public final void rule__MethodName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1454:1: ( rule__MethodName__Group__0__Impl rule__MethodName__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1455:2: rule__MethodName__Group__0__Impl rule__MethodName__Group__1
            {
            pushFollow(FOLLOW_rule__MethodName__Group__0__Impl_in_rule__MethodName__Group__03120);
            rule__MethodName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodName__Group__1_in_rule__MethodName__Group__03123);
            rule__MethodName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodName__Group__0"


    // $ANTLR start "rule__MethodName__Group__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1462:1: rule__MethodName__Group__0__Impl : ( ( rule__MethodName__Group_0__0 )* ) ;
    public final void rule__MethodName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1466:1: ( ( ( rule__MethodName__Group_0__0 )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1467:1: ( ( rule__MethodName__Group_0__0 )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1467:1: ( ( rule__MethodName__Group_0__0 )* )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1468:1: ( rule__MethodName__Group_0__0 )*
            {
             before(grammarAccess.getMethodNameAccess().getGroup_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1469:1: ( rule__MethodName__Group_0__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_IDENTIFIER) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==RULE_DOT) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1469:2: rule__MethodName__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__MethodName__Group_0__0_in_rule__MethodName__Group__0__Impl3150);
            	    rule__MethodName__Group_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getMethodNameAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodName__Group__0__Impl"


    // $ANTLR start "rule__MethodName__Group__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1479:1: rule__MethodName__Group__1 : rule__MethodName__Group__1__Impl ;
    public final void rule__MethodName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1483:1: ( rule__MethodName__Group__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1484:2: rule__MethodName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MethodName__Group__1__Impl_in_rule__MethodName__Group__13181);
            rule__MethodName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodName__Group__1"


    // $ANTLR start "rule__MethodName__Group__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1490:1: rule__MethodName__Group__1__Impl : ( ( rule__MethodName__MethodNameAssignment_1 ) ) ;
    public final void rule__MethodName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1494:1: ( ( ( rule__MethodName__MethodNameAssignment_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1495:1: ( ( rule__MethodName__MethodNameAssignment_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1495:1: ( ( rule__MethodName__MethodNameAssignment_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1496:1: ( rule__MethodName__MethodNameAssignment_1 )
            {
             before(grammarAccess.getMethodNameAccess().getMethodNameAssignment_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1497:1: ( rule__MethodName__MethodNameAssignment_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1497:2: rule__MethodName__MethodNameAssignment_1
            {
            pushFollow(FOLLOW_rule__MethodName__MethodNameAssignment_1_in_rule__MethodName__Group__1__Impl3208);
            rule__MethodName__MethodNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodNameAccess().getMethodNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodName__Group__1__Impl"


    // $ANTLR start "rule__MethodName__Group_0__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1511:1: rule__MethodName__Group_0__0 : rule__MethodName__Group_0__0__Impl rule__MethodName__Group_0__1 ;
    public final void rule__MethodName__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1515:1: ( rule__MethodName__Group_0__0__Impl rule__MethodName__Group_0__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1516:2: rule__MethodName__Group_0__0__Impl rule__MethodName__Group_0__1
            {
            pushFollow(FOLLOW_rule__MethodName__Group_0__0__Impl_in_rule__MethodName__Group_0__03242);
            rule__MethodName__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodName__Group_0__1_in_rule__MethodName__Group_0__03245);
            rule__MethodName__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodName__Group_0__0"


    // $ANTLR start "rule__MethodName__Group_0__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1523:1: rule__MethodName__Group_0__0__Impl : ( ( rule__MethodName__PrefixQMNAssignment_0_0 ) ) ;
    public final void rule__MethodName__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1527:1: ( ( ( rule__MethodName__PrefixQMNAssignment_0_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1528:1: ( ( rule__MethodName__PrefixQMNAssignment_0_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1528:1: ( ( rule__MethodName__PrefixQMNAssignment_0_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1529:1: ( rule__MethodName__PrefixQMNAssignment_0_0 )
            {
             before(grammarAccess.getMethodNameAccess().getPrefixQMNAssignment_0_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1530:1: ( rule__MethodName__PrefixQMNAssignment_0_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1530:2: rule__MethodName__PrefixQMNAssignment_0_0
            {
            pushFollow(FOLLOW_rule__MethodName__PrefixQMNAssignment_0_0_in_rule__MethodName__Group_0__0__Impl3272);
            rule__MethodName__PrefixQMNAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodNameAccess().getPrefixQMNAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodName__Group_0__0__Impl"


    // $ANTLR start "rule__MethodName__Group_0__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1540:1: rule__MethodName__Group_0__1 : rule__MethodName__Group_0__1__Impl ;
    public final void rule__MethodName__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1544:1: ( rule__MethodName__Group_0__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1545:2: rule__MethodName__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__MethodName__Group_0__1__Impl_in_rule__MethodName__Group_0__13302);
            rule__MethodName__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodName__Group_0__1"


    // $ANTLR start "rule__MethodName__Group_0__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1551:1: rule__MethodName__Group_0__1__Impl : ( ( rule__MethodName__DotsAssignment_0_1 ) ) ;
    public final void rule__MethodName__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1555:1: ( ( ( rule__MethodName__DotsAssignment_0_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1556:1: ( ( rule__MethodName__DotsAssignment_0_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1556:1: ( ( rule__MethodName__DotsAssignment_0_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1557:1: ( rule__MethodName__DotsAssignment_0_1 )
            {
             before(grammarAccess.getMethodNameAccess().getDotsAssignment_0_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1558:1: ( rule__MethodName__DotsAssignment_0_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1558:2: rule__MethodName__DotsAssignment_0_1
            {
            pushFollow(FOLLOW_rule__MethodName__DotsAssignment_0_1_in_rule__MethodName__Group_0__1__Impl3329);
            rule__MethodName__DotsAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodNameAccess().getDotsAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodName__Group_0__1__Impl"


    // $ANTLR start "rule__Arguments__Group__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1572:1: rule__Arguments__Group__0 : rule__Arguments__Group__0__Impl rule__Arguments__Group__1 ;
    public final void rule__Arguments__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1576:1: ( rule__Arguments__Group__0__Impl rule__Arguments__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1577:2: rule__Arguments__Group__0__Impl rule__Arguments__Group__1
            {
            pushFollow(FOLLOW_rule__Arguments__Group__0__Impl_in_rule__Arguments__Group__03363);
            rule__Arguments__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Arguments__Group__1_in_rule__Arguments__Group__03366);
            rule__Arguments__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__0"


    // $ANTLR start "rule__Arguments__Group__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1584:1: rule__Arguments__Group__0__Impl : ( ( rule__Arguments__LeftPAssignment_0 ) ) ;
    public final void rule__Arguments__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1588:1: ( ( ( rule__Arguments__LeftPAssignment_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1589:1: ( ( rule__Arguments__LeftPAssignment_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1589:1: ( ( rule__Arguments__LeftPAssignment_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1590:1: ( rule__Arguments__LeftPAssignment_0 )
            {
             before(grammarAccess.getArgumentsAccess().getLeftPAssignment_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1591:1: ( rule__Arguments__LeftPAssignment_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1591:2: rule__Arguments__LeftPAssignment_0
            {
            pushFollow(FOLLOW_rule__Arguments__LeftPAssignment_0_in_rule__Arguments__Group__0__Impl3393);
            rule__Arguments__LeftPAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getArgumentsAccess().getLeftPAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__0__Impl"


    // $ANTLR start "rule__Arguments__Group__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1601:1: rule__Arguments__Group__1 : rule__Arguments__Group__1__Impl rule__Arguments__Group__2 ;
    public final void rule__Arguments__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1605:1: ( rule__Arguments__Group__1__Impl rule__Arguments__Group__2 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1606:2: rule__Arguments__Group__1__Impl rule__Arguments__Group__2
            {
            pushFollow(FOLLOW_rule__Arguments__Group__1__Impl_in_rule__Arguments__Group__13423);
            rule__Arguments__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Arguments__Group__2_in_rule__Arguments__Group__13426);
            rule__Arguments__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__1"


    // $ANTLR start "rule__Arguments__Group__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1613:1: rule__Arguments__Group__1__Impl : ( ( rule__Arguments__ExprLstAssignment_1 )? ) ;
    public final void rule__Arguments__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1617:1: ( ( ( rule__Arguments__ExprLstAssignment_1 )? ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1618:1: ( ( rule__Arguments__ExprLstAssignment_1 )? )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1618:1: ( ( rule__Arguments__ExprLstAssignment_1 )? )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1619:1: ( rule__Arguments__ExprLstAssignment_1 )?
            {
             before(grammarAccess.getArgumentsAccess().getExprLstAssignment_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1620:1: ( rule__Arguments__ExprLstAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_INTLITERAL && LA16_0<=RULE_LPAREN)||LA16_0==RULE_NOT||LA16_0==RULE_NEW||(LA16_0>=RULE_IDENTIFIER && LA16_0<=RULE_VARIABLETOKEN)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1620:2: rule__Arguments__ExprLstAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Arguments__ExprLstAssignment_1_in_rule__Arguments__Group__1__Impl3453);
                    rule__Arguments__ExprLstAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentsAccess().getExprLstAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__1__Impl"


    // $ANTLR start "rule__Arguments__Group__2"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1630:1: rule__Arguments__Group__2 : rule__Arguments__Group__2__Impl ;
    public final void rule__Arguments__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1634:1: ( rule__Arguments__Group__2__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1635:2: rule__Arguments__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Arguments__Group__2__Impl_in_rule__Arguments__Group__23484);
            rule__Arguments__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__2"


    // $ANTLR start "rule__Arguments__Group__2__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1641:1: rule__Arguments__Group__2__Impl : ( ( rule__Arguments__RightPAssignment_2 ) ) ;
    public final void rule__Arguments__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1645:1: ( ( ( rule__Arguments__RightPAssignment_2 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1646:1: ( ( rule__Arguments__RightPAssignment_2 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1646:1: ( ( rule__Arguments__RightPAssignment_2 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1647:1: ( rule__Arguments__RightPAssignment_2 )
            {
             before(grammarAccess.getArgumentsAccess().getRightPAssignment_2()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1648:1: ( rule__Arguments__RightPAssignment_2 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1648:2: rule__Arguments__RightPAssignment_2
            {
            pushFollow(FOLLOW_rule__Arguments__RightPAssignment_2_in_rule__Arguments__Group__2__Impl3511);
            rule__Arguments__RightPAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getArgumentsAccess().getRightPAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__Group__2__Impl"


    // $ANTLR start "rule__ExpressionList__Group__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1664:1: rule__ExpressionList__Group__0 : rule__ExpressionList__Group__0__Impl rule__ExpressionList__Group__1 ;
    public final void rule__ExpressionList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1668:1: ( rule__ExpressionList__Group__0__Impl rule__ExpressionList__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1669:2: rule__ExpressionList__Group__0__Impl rule__ExpressionList__Group__1
            {
            pushFollow(FOLLOW_rule__ExpressionList__Group__0__Impl_in_rule__ExpressionList__Group__03547);
            rule__ExpressionList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpressionList__Group__1_in_rule__ExpressionList__Group__03550);
            rule__ExpressionList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__Group__0"


    // $ANTLR start "rule__ExpressionList__Group__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1676:1: rule__ExpressionList__Group__0__Impl : ( ( rule__ExpressionList__ExpressionsAssignment_0 ) ) ;
    public final void rule__ExpressionList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1680:1: ( ( ( rule__ExpressionList__ExpressionsAssignment_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1681:1: ( ( rule__ExpressionList__ExpressionsAssignment_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1681:1: ( ( rule__ExpressionList__ExpressionsAssignment_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1682:1: ( rule__ExpressionList__ExpressionsAssignment_0 )
            {
             before(grammarAccess.getExpressionListAccess().getExpressionsAssignment_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1683:1: ( rule__ExpressionList__ExpressionsAssignment_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1683:2: rule__ExpressionList__ExpressionsAssignment_0
            {
            pushFollow(FOLLOW_rule__ExpressionList__ExpressionsAssignment_0_in_rule__ExpressionList__Group__0__Impl3577);
            rule__ExpressionList__ExpressionsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionListAccess().getExpressionsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__Group__0__Impl"


    // $ANTLR start "rule__ExpressionList__Group__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1693:1: rule__ExpressionList__Group__1 : rule__ExpressionList__Group__1__Impl ;
    public final void rule__ExpressionList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1697:1: ( rule__ExpressionList__Group__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1698:2: rule__ExpressionList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExpressionList__Group__1__Impl_in_rule__ExpressionList__Group__13607);
            rule__ExpressionList__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__Group__1"


    // $ANTLR start "rule__ExpressionList__Group__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1704:1: rule__ExpressionList__Group__1__Impl : ( ( rule__ExpressionList__Group_1__0 )* ) ;
    public final void rule__ExpressionList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1708:1: ( ( ( rule__ExpressionList__Group_1__0 )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1709:1: ( ( rule__ExpressionList__Group_1__0 )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1709:1: ( ( rule__ExpressionList__Group_1__0 )* )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1710:1: ( rule__ExpressionList__Group_1__0 )*
            {
             before(grammarAccess.getExpressionListAccess().getGroup_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1711:1: ( rule__ExpressionList__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1711:2: rule__ExpressionList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ExpressionList__Group_1__0_in_rule__ExpressionList__Group__1__Impl3634);
            	    rule__ExpressionList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getExpressionListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__Group__1__Impl"


    // $ANTLR start "rule__ExpressionList__Group_1__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1725:1: rule__ExpressionList__Group_1__0 : rule__ExpressionList__Group_1__0__Impl rule__ExpressionList__Group_1__1 ;
    public final void rule__ExpressionList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1729:1: ( rule__ExpressionList__Group_1__0__Impl rule__ExpressionList__Group_1__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1730:2: rule__ExpressionList__Group_1__0__Impl rule__ExpressionList__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExpressionList__Group_1__0__Impl_in_rule__ExpressionList__Group_1__03669);
            rule__ExpressionList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpressionList__Group_1__1_in_rule__ExpressionList__Group_1__03672);
            rule__ExpressionList__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__Group_1__0"


    // $ANTLR start "rule__ExpressionList__Group_1__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1737:1: rule__ExpressionList__Group_1__0__Impl : ( ( rule__ExpressionList__CommasAssignment_1_0 ) ) ;
    public final void rule__ExpressionList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1741:1: ( ( ( rule__ExpressionList__CommasAssignment_1_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1742:1: ( ( rule__ExpressionList__CommasAssignment_1_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1742:1: ( ( rule__ExpressionList__CommasAssignment_1_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1743:1: ( rule__ExpressionList__CommasAssignment_1_0 )
            {
             before(grammarAccess.getExpressionListAccess().getCommasAssignment_1_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1744:1: ( rule__ExpressionList__CommasAssignment_1_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1744:2: rule__ExpressionList__CommasAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ExpressionList__CommasAssignment_1_0_in_rule__ExpressionList__Group_1__0__Impl3699);
            rule__ExpressionList__CommasAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionListAccess().getCommasAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__Group_1__0__Impl"


    // $ANTLR start "rule__ExpressionList__Group_1__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1754:1: rule__ExpressionList__Group_1__1 : rule__ExpressionList__Group_1__1__Impl ;
    public final void rule__ExpressionList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1758:1: ( rule__ExpressionList__Group_1__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1759:2: rule__ExpressionList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ExpressionList__Group_1__1__Impl_in_rule__ExpressionList__Group_1__13729);
            rule__ExpressionList__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__Group_1__1"


    // $ANTLR start "rule__ExpressionList__Group_1__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1765:1: rule__ExpressionList__Group_1__1__Impl : ( ( rule__ExpressionList__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__ExpressionList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1769:1: ( ( ( rule__ExpressionList__ExpressionsAssignment_1_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1770:1: ( ( rule__ExpressionList__ExpressionsAssignment_1_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1770:1: ( ( rule__ExpressionList__ExpressionsAssignment_1_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1771:1: ( rule__ExpressionList__ExpressionsAssignment_1_1 )
            {
             before(grammarAccess.getExpressionListAccess().getExpressionsAssignment_1_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1772:1: ( rule__ExpressionList__ExpressionsAssignment_1_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1772:2: rule__ExpressionList__ExpressionsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ExpressionList__ExpressionsAssignment_1_1_in_rule__ExpressionList__Group_1__1__Impl3756);
            rule__ExpressionList__ExpressionsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionListAccess().getExpressionsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__Group_1__1__Impl"


    // $ANTLR start "rule__BaseCommonExpression__Group_2__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1786:1: rule__BaseCommonExpression__Group_2__0 : rule__BaseCommonExpression__Group_2__0__Impl rule__BaseCommonExpression__Group_2__1 ;
    public final void rule__BaseCommonExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1790:1: ( rule__BaseCommonExpression__Group_2__0__Impl rule__BaseCommonExpression__Group_2__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1791:2: rule__BaseCommonExpression__Group_2__0__Impl rule__BaseCommonExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__BaseCommonExpression__Group_2__0__Impl_in_rule__BaseCommonExpression__Group_2__03790);
            rule__BaseCommonExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseCommonExpression__Group_2__1_in_rule__BaseCommonExpression__Group_2__03793);
            rule__BaseCommonExpression__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseCommonExpression__Group_2__0"


    // $ANTLR start "rule__BaseCommonExpression__Group_2__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1798:1: rule__BaseCommonExpression__Group_2__0__Impl : ( RULE_LPAREN ) ;
    public final void rule__BaseCommonExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1802:1: ( ( RULE_LPAREN ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1803:1: ( RULE_LPAREN )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1803:1: ( RULE_LPAREN )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1804:1: RULE_LPAREN
            {
             before(grammarAccess.getBaseCommonExpressionAccess().getLPARENTerminalRuleCall_2_0()); 
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rule__BaseCommonExpression__Group_2__0__Impl3820); 
             after(grammarAccess.getBaseCommonExpressionAccess().getLPARENTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseCommonExpression__Group_2__0__Impl"


    // $ANTLR start "rule__BaseCommonExpression__Group_2__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1815:1: rule__BaseCommonExpression__Group_2__1 : rule__BaseCommonExpression__Group_2__1__Impl rule__BaseCommonExpression__Group_2__2 ;
    public final void rule__BaseCommonExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1819:1: ( rule__BaseCommonExpression__Group_2__1__Impl rule__BaseCommonExpression__Group_2__2 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1820:2: rule__BaseCommonExpression__Group_2__1__Impl rule__BaseCommonExpression__Group_2__2
            {
            pushFollow(FOLLOW_rule__BaseCommonExpression__Group_2__1__Impl_in_rule__BaseCommonExpression__Group_2__13849);
            rule__BaseCommonExpression__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseCommonExpression__Group_2__2_in_rule__BaseCommonExpression__Group_2__13852);
            rule__BaseCommonExpression__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseCommonExpression__Group_2__1"


    // $ANTLR start "rule__BaseCommonExpression__Group_2__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1827:1: rule__BaseCommonExpression__Group_2__1__Impl : ( ruleExpression ) ;
    public final void rule__BaseCommonExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1831:1: ( ( ruleExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1832:1: ( ruleExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1832:1: ( ruleExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1833:1: ruleExpression
            {
             before(grammarAccess.getBaseCommonExpressionAccess().getExpressionParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__BaseCommonExpression__Group_2__1__Impl3879);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBaseCommonExpressionAccess().getExpressionParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseCommonExpression__Group_2__1__Impl"


    // $ANTLR start "rule__BaseCommonExpression__Group_2__2"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1844:1: rule__BaseCommonExpression__Group_2__2 : rule__BaseCommonExpression__Group_2__2__Impl ;
    public final void rule__BaseCommonExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1848:1: ( rule__BaseCommonExpression__Group_2__2__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1849:2: rule__BaseCommonExpression__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__BaseCommonExpression__Group_2__2__Impl_in_rule__BaseCommonExpression__Group_2__23908);
            rule__BaseCommonExpression__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseCommonExpression__Group_2__2"


    // $ANTLR start "rule__BaseCommonExpression__Group_2__2__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1855:1: rule__BaseCommonExpression__Group_2__2__Impl : ( RULE_RPAREN ) ;
    public final void rule__BaseCommonExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1859:1: ( ( RULE_RPAREN ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1860:1: ( RULE_RPAREN )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1860:1: ( RULE_RPAREN )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1861:1: RULE_RPAREN
            {
             before(grammarAccess.getBaseCommonExpressionAccess().getRPARENTerminalRuleCall_2_2()); 
            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rule__BaseCommonExpression__Group_2__2__Impl3935); 
             after(grammarAccess.getBaseCommonExpressionAccess().getRPARENTerminalRuleCall_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseCommonExpression__Group_2__2__Impl"


    // $ANTLR start "rule__Cast__Group__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1878:1: rule__Cast__Group__0 : rule__Cast__Group__0__Impl rule__Cast__Group__1 ;
    public final void rule__Cast__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1882:1: ( rule__Cast__Group__0__Impl rule__Cast__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1883:2: rule__Cast__Group__0__Impl rule__Cast__Group__1
            {
            pushFollow(FOLLOW_rule__Cast__Group__0__Impl_in_rule__Cast__Group__03970);
            rule__Cast__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cast__Group__1_in_rule__Cast__Group__03973);
            rule__Cast__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cast__Group__0"


    // $ANTLR start "rule__Cast__Group__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1890:1: rule__Cast__Group__0__Impl : ( ( rule__Cast__LparAssignment_0 ) ) ;
    public final void rule__Cast__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1894:1: ( ( ( rule__Cast__LparAssignment_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1895:1: ( ( rule__Cast__LparAssignment_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1895:1: ( ( rule__Cast__LparAssignment_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1896:1: ( rule__Cast__LparAssignment_0 )
            {
             before(grammarAccess.getCastAccess().getLparAssignment_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1897:1: ( rule__Cast__LparAssignment_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1897:2: rule__Cast__LparAssignment_0
            {
            pushFollow(FOLLOW_rule__Cast__LparAssignment_0_in_rule__Cast__Group__0__Impl4000);
            rule__Cast__LparAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCastAccess().getLparAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cast__Group__0__Impl"


    // $ANTLR start "rule__Cast__Group__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1907:1: rule__Cast__Group__1 : rule__Cast__Group__1__Impl rule__Cast__Group__2 ;
    public final void rule__Cast__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1911:1: ( rule__Cast__Group__1__Impl rule__Cast__Group__2 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1912:2: rule__Cast__Group__1__Impl rule__Cast__Group__2
            {
            pushFollow(FOLLOW_rule__Cast__Group__1__Impl_in_rule__Cast__Group__14030);
            rule__Cast__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cast__Group__2_in_rule__Cast__Group__14033);
            rule__Cast__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cast__Group__1"


    // $ANTLR start "rule__Cast__Group__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1919:1: rule__Cast__Group__1__Impl : ( ( rule__Cast__Alternatives_1 ) ) ;
    public final void rule__Cast__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1923:1: ( ( ( rule__Cast__Alternatives_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1924:1: ( ( rule__Cast__Alternatives_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1924:1: ( ( rule__Cast__Alternatives_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1925:1: ( rule__Cast__Alternatives_1 )
            {
             before(grammarAccess.getCastAccess().getAlternatives_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1926:1: ( rule__Cast__Alternatives_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1926:2: rule__Cast__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Cast__Alternatives_1_in_rule__Cast__Group__1__Impl4060);
            rule__Cast__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getCastAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cast__Group__1__Impl"


    // $ANTLR start "rule__Cast__Group__2"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1936:1: rule__Cast__Group__2 : rule__Cast__Group__2__Impl ;
    public final void rule__Cast__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1940:1: ( rule__Cast__Group__2__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1941:2: rule__Cast__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Cast__Group__2__Impl_in_rule__Cast__Group__24090);
            rule__Cast__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cast__Group__2"


    // $ANTLR start "rule__Cast__Group__2__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1947:1: rule__Cast__Group__2__Impl : ( ( rule__Cast__RparAssignment_2 ) ) ;
    public final void rule__Cast__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1951:1: ( ( ( rule__Cast__RparAssignment_2 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1952:1: ( ( rule__Cast__RparAssignment_2 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1952:1: ( ( rule__Cast__RparAssignment_2 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1953:1: ( rule__Cast__RparAssignment_2 )
            {
             before(grammarAccess.getCastAccess().getRparAssignment_2()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1954:1: ( rule__Cast__RparAssignment_2 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1954:2: rule__Cast__RparAssignment_2
            {
            pushFollow(FOLLOW_rule__Cast__RparAssignment_2_in_rule__Cast__Group__2__Impl4117);
            rule__Cast__RparAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCastAccess().getRparAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cast__Group__2__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1970:1: rule__ConditionalExpression__Group__0 : rule__ConditionalExpression__Group__0__Impl rule__ConditionalExpression__Group__1 ;
    public final void rule__ConditionalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1974:1: ( rule__ConditionalExpression__Group__0__Impl rule__ConditionalExpression__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1975:2: rule__ConditionalExpression__Group__0__Impl rule__ConditionalExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__0__Impl_in_rule__ConditionalExpression__Group__04153);
            rule__ConditionalExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionalExpression__Group__1_in_rule__ConditionalExpression__Group__04156);
            rule__ConditionalExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group__0"


    // $ANTLR start "rule__ConditionalExpression__Group__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1982:1: rule__ConditionalExpression__Group__0__Impl : ( ruleTestExpression ) ;
    public final void rule__ConditionalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1986:1: ( ( ruleTestExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1987:1: ( ruleTestExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1987:1: ( ruleTestExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1988:1: ruleTestExpression
            {
             before(grammarAccess.getConditionalExpressionAccess().getTestExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTestExpression_in_rule__ConditionalExpression__Group__0__Impl4183);
            ruleTestExpression();

            state._fsp--;

             after(grammarAccess.getConditionalExpressionAccess().getTestExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group__0__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1999:1: rule__ConditionalExpression__Group__1 : rule__ConditionalExpression__Group__1__Impl ;
    public final void rule__ConditionalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2003:1: ( rule__ConditionalExpression__Group__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2004:2: rule__ConditionalExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__1__Impl_in_rule__ConditionalExpression__Group__14212);
            rule__ConditionalExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group__1"


    // $ANTLR start "rule__ConditionalExpression__Group__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2010:1: rule__ConditionalExpression__Group__1__Impl : ( ( rule__ConditionalExpression__Group_1__0 )? ) ;
    public final void rule__ConditionalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2014:1: ( ( ( rule__ConditionalExpression__Group_1__0 )? ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2015:1: ( ( rule__ConditionalExpression__Group_1__0 )? )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2015:1: ( ( rule__ConditionalExpression__Group_1__0 )? )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2016:1: ( rule__ConditionalExpression__Group_1__0 )?
            {
             before(grammarAccess.getConditionalExpressionAccess().getGroup_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2017:1: ( rule__ConditionalExpression__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==63) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2017:2: rule__ConditionalExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ConditionalExpression__Group_1__0_in_rule__ConditionalExpression__Group__1__Impl4239);
                    rule__ConditionalExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionalExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group__1__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group_1__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2031:1: rule__ConditionalExpression__Group_1__0 : rule__ConditionalExpression__Group_1__0__Impl rule__ConditionalExpression__Group_1__1 ;
    public final void rule__ConditionalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2035:1: ( rule__ConditionalExpression__Group_1__0__Impl rule__ConditionalExpression__Group_1__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2036:2: rule__ConditionalExpression__Group_1__0__Impl rule__ConditionalExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group_1__0__Impl_in_rule__ConditionalExpression__Group_1__04274);
            rule__ConditionalExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionalExpression__Group_1__1_in_rule__ConditionalExpression__Group_1__04277);
            rule__ConditionalExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_1__0"


    // $ANTLR start "rule__ConditionalExpression__Group_1__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2043:1: rule__ConditionalExpression__Group_1__0__Impl : ( '?' ) ;
    public final void rule__ConditionalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2047:1: ( ( '?' ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2048:1: ( '?' )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2048:1: ( '?' )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2049:1: '?'
            {
             before(grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_0()); 
            match(input,63,FOLLOW_63_in_rule__ConditionalExpression__Group_1__0__Impl4305); 
             after(grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group_1__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2062:1: rule__ConditionalExpression__Group_1__1 : rule__ConditionalExpression__Group_1__1__Impl rule__ConditionalExpression__Group_1__2 ;
    public final void rule__ConditionalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2066:1: ( rule__ConditionalExpression__Group_1__1__Impl rule__ConditionalExpression__Group_1__2 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2067:2: rule__ConditionalExpression__Group_1__1__Impl rule__ConditionalExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group_1__1__Impl_in_rule__ConditionalExpression__Group_1__14336);
            rule__ConditionalExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionalExpression__Group_1__2_in_rule__ConditionalExpression__Group_1__14339);
            rule__ConditionalExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_1__1"


    // $ANTLR start "rule__ConditionalExpression__Group_1__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2074:1: rule__ConditionalExpression__Group_1__1__Impl : ( ( rule__ConditionalExpression__OkReturnedExprAssignment_1_1 ) ) ;
    public final void rule__ConditionalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2078:1: ( ( ( rule__ConditionalExpression__OkReturnedExprAssignment_1_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2079:1: ( ( rule__ConditionalExpression__OkReturnedExprAssignment_1_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2079:1: ( ( rule__ConditionalExpression__OkReturnedExprAssignment_1_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2080:1: ( rule__ConditionalExpression__OkReturnedExprAssignment_1_1 )
            {
             before(grammarAccess.getConditionalExpressionAccess().getOkReturnedExprAssignment_1_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2081:1: ( rule__ConditionalExpression__OkReturnedExprAssignment_1_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2081:2: rule__ConditionalExpression__OkReturnedExprAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__OkReturnedExprAssignment_1_1_in_rule__ConditionalExpression__Group_1__1__Impl4366);
            rule__ConditionalExpression__OkReturnedExprAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionalExpressionAccess().getOkReturnedExprAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group_1__2"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2091:1: rule__ConditionalExpression__Group_1__2 : rule__ConditionalExpression__Group_1__2__Impl rule__ConditionalExpression__Group_1__3 ;
    public final void rule__ConditionalExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2095:1: ( rule__ConditionalExpression__Group_1__2__Impl rule__ConditionalExpression__Group_1__3 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2096:2: rule__ConditionalExpression__Group_1__2__Impl rule__ConditionalExpression__Group_1__3
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group_1__2__Impl_in_rule__ConditionalExpression__Group_1__24396);
            rule__ConditionalExpression__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionalExpression__Group_1__3_in_rule__ConditionalExpression__Group_1__24399);
            rule__ConditionalExpression__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_1__2"


    // $ANTLR start "rule__ConditionalExpression__Group_1__2__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2103:1: rule__ConditionalExpression__Group_1__2__Impl : ( ':' ) ;
    public final void rule__ConditionalExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2107:1: ( ( ':' ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2108:1: ( ':' )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2108:1: ( ':' )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2109:1: ':'
            {
             before(grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_2()); 
            match(input,64,FOLLOW_64_in_rule__ConditionalExpression__Group_1__2__Impl4427); 
             after(grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ConditionalExpression__Group_1__3"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2122:1: rule__ConditionalExpression__Group_1__3 : rule__ConditionalExpression__Group_1__3__Impl ;
    public final void rule__ConditionalExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2126:1: ( rule__ConditionalExpression__Group_1__3__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2127:2: rule__ConditionalExpression__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group_1__3__Impl_in_rule__ConditionalExpression__Group_1__34458);
            rule__ConditionalExpression__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_1__3"


    // $ANTLR start "rule__ConditionalExpression__Group_1__3__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2133:1: rule__ConditionalExpression__Group_1__3__Impl : ( ( rule__ConditionalExpression__KoReturnedExprAssignment_1_3 ) ) ;
    public final void rule__ConditionalExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2137:1: ( ( ( rule__ConditionalExpression__KoReturnedExprAssignment_1_3 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2138:1: ( ( rule__ConditionalExpression__KoReturnedExprAssignment_1_3 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2138:1: ( ( rule__ConditionalExpression__KoReturnedExprAssignment_1_3 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2139:1: ( rule__ConditionalExpression__KoReturnedExprAssignment_1_3 )
            {
             before(grammarAccess.getConditionalExpressionAccess().getKoReturnedExprAssignment_1_3()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2140:1: ( rule__ConditionalExpression__KoReturnedExprAssignment_1_3 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2140:2: rule__ConditionalExpression__KoReturnedExprAssignment_1_3
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__KoReturnedExprAssignment_1_3_in_rule__ConditionalExpression__Group_1__3__Impl4485);
            rule__ConditionalExpression__KoReturnedExprAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getConditionalExpressionAccess().getKoReturnedExprAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__Group_1__3__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2158:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2162:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2163:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__04523);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__04526);
            rule__OrExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0"


    // $ANTLR start "rule__OrExpression__Group__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2170:1: rule__OrExpression__Group__0__Impl : ( ( rule__OrExpression__AndExpAssignment_0 ) ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2174:1: ( ( ( rule__OrExpression__AndExpAssignment_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2175:1: ( ( rule__OrExpression__AndExpAssignment_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2175:1: ( ( rule__OrExpression__AndExpAssignment_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2176:1: ( rule__OrExpression__AndExpAssignment_0 )
            {
             before(grammarAccess.getOrExpressionAccess().getAndExpAssignment_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2177:1: ( rule__OrExpression__AndExpAssignment_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2177:2: rule__OrExpression__AndExpAssignment_0
            {
            pushFollow(FOLLOW_rule__OrExpression__AndExpAssignment_0_in_rule__OrExpression__Group__0__Impl4553);
            rule__OrExpression__AndExpAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getAndExpAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0__Impl"


    // $ANTLR start "rule__OrExpression__Group__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2187:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2191:1: ( rule__OrExpression__Group__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2192:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__14583);
            rule__OrExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1"


    // $ANTLR start "rule__OrExpression__Group__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2198:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2202:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2203:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2203:1: ( ( rule__OrExpression__Group_1__0 )* )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2204:1: ( rule__OrExpression__Group_1__0 )*
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2205:1: ( rule__OrExpression__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==65) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2205:2: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl4610);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getOrExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2219:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2223:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2224:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__04645);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__04648);
            rule__OrExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0"


    // $ANTLR start "rule__OrExpression__Group_1__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2231:1: rule__OrExpression__Group_1__0__Impl : ( '||' ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2235:1: ( ( '||' ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2236:1: ( '||' )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2236:1: ( '||' )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2237:1: '||'
            {
             before(grammarAccess.getOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_0()); 
            match(input,65,FOLLOW_65_in_rule__OrExpression__Group_1__0__Impl4676); 
             after(grammarAccess.getOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2250:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2254:1: ( rule__OrExpression__Group_1__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2255:2: rule__OrExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__14707);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1"


    // $ANTLR start "rule__OrExpression__Group_1__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2261:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__AndExpAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2265:1: ( ( ( rule__OrExpression__AndExpAssignment_1_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2266:1: ( ( rule__OrExpression__AndExpAssignment_1_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2266:1: ( ( rule__OrExpression__AndExpAssignment_1_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2267:1: ( rule__OrExpression__AndExpAssignment_1_1 )
            {
             before(grammarAccess.getOrExpressionAccess().getAndExpAssignment_1_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2268:1: ( rule__OrExpression__AndExpAssignment_1_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2268:2: rule__OrExpression__AndExpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__OrExpression__AndExpAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl4734);
            rule__OrExpression__AndExpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getAndExpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2282:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2286:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2287:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__04768);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__04771);
            rule__AndExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2294:1: rule__AndExpression__Group__0__Impl : ( ( rule__AndExpression__PrimaryCondAssignment_0 ) ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2298:1: ( ( ( rule__AndExpression__PrimaryCondAssignment_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2299:1: ( ( rule__AndExpression__PrimaryCondAssignment_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2299:1: ( ( rule__AndExpression__PrimaryCondAssignment_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2300:1: ( rule__AndExpression__PrimaryCondAssignment_0 )
            {
             before(grammarAccess.getAndExpressionAccess().getPrimaryCondAssignment_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2301:1: ( rule__AndExpression__PrimaryCondAssignment_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2301:2: rule__AndExpression__PrimaryCondAssignment_0
            {
            pushFollow(FOLLOW_rule__AndExpression__PrimaryCondAssignment_0_in_rule__AndExpression__Group__0__Impl4798);
            rule__AndExpression__PrimaryCondAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getPrimaryCondAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2311:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2315:1: ( rule__AndExpression__Group__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2316:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__14828);
            rule__AndExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2322:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2326:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2327:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2327:1: ( ( rule__AndExpression__Group_1__0 )* )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2328:1: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2329:1: ( rule__AndExpression__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==66) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2329:2: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl4855);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getAndExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2343:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2347:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2348:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__04890);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__04893);
            rule__AndExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0"


    // $ANTLR start "rule__AndExpression__Group_1__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2355:1: rule__AndExpression__Group_1__0__Impl : ( '&&' ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2359:1: ( ( '&&' ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2360:1: ( '&&' )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2360:1: ( '&&' )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2361:1: '&&'
            {
             before(grammarAccess.getAndExpressionAccess().getAmpersandAmpersandKeyword_1_0()); 
            match(input,66,FOLLOW_66_in_rule__AndExpression__Group_1__0__Impl4921); 
             after(grammarAccess.getAndExpressionAccess().getAmpersandAmpersandKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2374:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2378:1: ( rule__AndExpression__Group_1__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2379:2: rule__AndExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__14952);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1"


    // $ANTLR start "rule__AndExpression__Group_1__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2385:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__PrimaryCondAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2389:1: ( ( ( rule__AndExpression__PrimaryCondAssignment_1_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2390:1: ( ( rule__AndExpression__PrimaryCondAssignment_1_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2390:1: ( ( rule__AndExpression__PrimaryCondAssignment_1_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2391:1: ( rule__AndExpression__PrimaryCondAssignment_1_1 )
            {
             before(grammarAccess.getAndExpressionAccess().getPrimaryCondAssignment_1_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2392:1: ( rule__AndExpression__PrimaryCondAssignment_1_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2392:2: rule__AndExpression__PrimaryCondAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AndExpression__PrimaryCondAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl4979);
            rule__AndExpression__PrimaryCondAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getPrimaryCondAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__BaseBooleanExpr__Group__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2406:1: rule__BaseBooleanExpr__Group__0 : rule__BaseBooleanExpr__Group__0__Impl rule__BaseBooleanExpr__Group__1 ;
    public final void rule__BaseBooleanExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2410:1: ( rule__BaseBooleanExpr__Group__0__Impl rule__BaseBooleanExpr__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2411:2: rule__BaseBooleanExpr__Group__0__Impl rule__BaseBooleanExpr__Group__1
            {
            pushFollow(FOLLOW_rule__BaseBooleanExpr__Group__0__Impl_in_rule__BaseBooleanExpr__Group__05013);
            rule__BaseBooleanExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseBooleanExpr__Group__1_in_rule__BaseBooleanExpr__Group__05016);
            rule__BaseBooleanExpr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseBooleanExpr__Group__0"


    // $ANTLR start "rule__BaseBooleanExpr__Group__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2418:1: rule__BaseBooleanExpr__Group__0__Impl : ( ( RULE_NOT )? ) ;
    public final void rule__BaseBooleanExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2422:1: ( ( ( RULE_NOT )? ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2423:1: ( ( RULE_NOT )? )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2423:1: ( ( RULE_NOT )? )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2424:1: ( RULE_NOT )?
            {
             before(grammarAccess.getBaseBooleanExprAccess().getNOTTerminalRuleCall_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2425:1: ( RULE_NOT )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_NOT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2425:3: RULE_NOT
                    {
                    match(input,RULE_NOT,FOLLOW_RULE_NOT_in_rule__BaseBooleanExpr__Group__0__Impl5044); 

                    }
                    break;

            }

             after(grammarAccess.getBaseBooleanExprAccess().getNOTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseBooleanExpr__Group__0__Impl"


    // $ANTLR start "rule__BaseBooleanExpr__Group__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2435:1: rule__BaseBooleanExpr__Group__1 : rule__BaseBooleanExpr__Group__1__Impl ;
    public final void rule__BaseBooleanExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2439:1: ( rule__BaseBooleanExpr__Group__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2440:2: rule__BaseBooleanExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BaseBooleanExpr__Group__1__Impl_in_rule__BaseBooleanExpr__Group__15075);
            rule__BaseBooleanExpr__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseBooleanExpr__Group__1"


    // $ANTLR start "rule__BaseBooleanExpr__Group__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2446:1: rule__BaseBooleanExpr__Group__1__Impl : ( ruleEqualityExpression ) ;
    public final void rule__BaseBooleanExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2450:1: ( ( ruleEqualityExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2451:1: ( ruleEqualityExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2451:1: ( ruleEqualityExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2452:1: ruleEqualityExpression
            {
             before(grammarAccess.getBaseBooleanExprAccess().getEqualityExpressionParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleEqualityExpression_in_rule__BaseBooleanExpr__Group__1__Impl5102);
            ruleEqualityExpression();

            state._fsp--;

             after(grammarAccess.getBaseBooleanExprAccess().getEqualityExpressionParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseBooleanExpr__Group__1__Impl"


    // $ANTLR start "rule__EqualityExpression__Group__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2467:1: rule__EqualityExpression__Group__0 : rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 ;
    public final void rule__EqualityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2471:1: ( rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2472:2: rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group__0__Impl_in_rule__EqualityExpression__Group__05135);
            rule__EqualityExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqualityExpression__Group__1_in_rule__EqualityExpression__Group__05138);
            rule__EqualityExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group__0"


    // $ANTLR start "rule__EqualityExpression__Group__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2479:1: rule__EqualityExpression__Group__0__Impl : ( ( rule__EqualityExpression__InstanceofAssignment_0 ) ) ;
    public final void rule__EqualityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2483:1: ( ( ( rule__EqualityExpression__InstanceofAssignment_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2484:1: ( ( rule__EqualityExpression__InstanceofAssignment_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2484:1: ( ( rule__EqualityExpression__InstanceofAssignment_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2485:1: ( rule__EqualityExpression__InstanceofAssignment_0 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getInstanceofAssignment_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2486:1: ( rule__EqualityExpression__InstanceofAssignment_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2486:2: rule__EqualityExpression__InstanceofAssignment_0
            {
            pushFollow(FOLLOW_rule__EqualityExpression__InstanceofAssignment_0_in_rule__EqualityExpression__Group__0__Impl5165);
            rule__EqualityExpression__InstanceofAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpressionAccess().getInstanceofAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group__0__Impl"


    // $ANTLR start "rule__EqualityExpression__Group__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2496:1: rule__EqualityExpression__Group__1 : rule__EqualityExpression__Group__1__Impl ;
    public final void rule__EqualityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2500:1: ( rule__EqualityExpression__Group__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2501:2: rule__EqualityExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group__1__Impl_in_rule__EqualityExpression__Group__15195);
            rule__EqualityExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group__1"


    // $ANTLR start "rule__EqualityExpression__Group__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2507:1: rule__EqualityExpression__Group__1__Impl : ( ( rule__EqualityExpression__Group_1__0 )* ) ;
    public final void rule__EqualityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2511:1: ( ( ( rule__EqualityExpression__Group_1__0 )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2512:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2512:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2513:1: ( rule__EqualityExpression__Group_1__0 )*
            {
             before(grammarAccess.getEqualityExpressionAccess().getGroup_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2514:1: ( rule__EqualityExpression__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_EQUAL && LA22_0<=RULE_NOTEQUAL)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2514:2: rule__EqualityExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__EqualityExpression__Group_1__0_in_rule__EqualityExpression__Group__1__Impl5222);
            	    rule__EqualityExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getEqualityExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group__1__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_1__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2528:1: rule__EqualityExpression__Group_1__0 : rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 ;
    public final void rule__EqualityExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2532:1: ( rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2533:2: rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group_1__0__Impl_in_rule__EqualityExpression__Group_1__05257);
            rule__EqualityExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqualityExpression__Group_1__1_in_rule__EqualityExpression__Group_1__05260);
            rule__EqualityExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1__0"


    // $ANTLR start "rule__EqualityExpression__Group_1__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2540:1: rule__EqualityExpression__Group_1__0__Impl : ( ( rule__EqualityExpression__Alternatives_1_0 ) ) ;
    public final void rule__EqualityExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2544:1: ( ( ( rule__EqualityExpression__Alternatives_1_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2545:1: ( ( rule__EqualityExpression__Alternatives_1_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2545:1: ( ( rule__EqualityExpression__Alternatives_1_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2546:1: ( rule__EqualityExpression__Alternatives_1_0 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getAlternatives_1_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2547:1: ( rule__EqualityExpression__Alternatives_1_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2547:2: rule__EqualityExpression__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Alternatives_1_0_in_rule__EqualityExpression__Group_1__0__Impl5287);
            rule__EqualityExpression__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpressionAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1__0__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_1__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2557:1: rule__EqualityExpression__Group_1__1 : rule__EqualityExpression__Group_1__1__Impl ;
    public final void rule__EqualityExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2561:1: ( rule__EqualityExpression__Group_1__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2562:2: rule__EqualityExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group_1__1__Impl_in_rule__EqualityExpression__Group_1__15317);
            rule__EqualityExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1__1"


    // $ANTLR start "rule__EqualityExpression__Group_1__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2568:1: rule__EqualityExpression__Group_1__1__Impl : ( ( rule__EqualityExpression__InstanceofAssignment_1_1 ) ) ;
    public final void rule__EqualityExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2572:1: ( ( ( rule__EqualityExpression__InstanceofAssignment_1_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2573:1: ( ( rule__EqualityExpression__InstanceofAssignment_1_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2573:1: ( ( rule__EqualityExpression__InstanceofAssignment_1_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2574:1: ( rule__EqualityExpression__InstanceofAssignment_1_1 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getInstanceofAssignment_1_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2575:1: ( rule__EqualityExpression__InstanceofAssignment_1_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2575:2: rule__EqualityExpression__InstanceofAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EqualityExpression__InstanceofAssignment_1_1_in_rule__EqualityExpression__Group_1__1__Impl5344);
            rule__EqualityExpression__InstanceofAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpressionAccess().getInstanceofAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1__1__Impl"


    // $ANTLR start "rule__RelationalExpression__Group__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2589:1: rule__RelationalExpression__Group__0 : rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 ;
    public final void rule__RelationalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2593:1: ( rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2594:2: rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1
            {
            pushFollow(FOLLOW_rule__RelationalExpression__Group__0__Impl_in_rule__RelationalExpression__Group__05378);
            rule__RelationalExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationalExpression__Group__1_in_rule__RelationalExpression__Group__05381);
            rule__RelationalExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group__0"


    // $ANTLR start "rule__RelationalExpression__Group__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2601:1: rule__RelationalExpression__Group__0__Impl : ( ( rule__RelationalExpression__RelAssignment_0 ) ) ;
    public final void rule__RelationalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2605:1: ( ( ( rule__RelationalExpression__RelAssignment_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2606:1: ( ( rule__RelationalExpression__RelAssignment_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2606:1: ( ( rule__RelationalExpression__RelAssignment_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2607:1: ( rule__RelationalExpression__RelAssignment_0 )
            {
             before(grammarAccess.getRelationalExpressionAccess().getRelAssignment_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2608:1: ( rule__RelationalExpression__RelAssignment_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2608:2: rule__RelationalExpression__RelAssignment_0
            {
            pushFollow(FOLLOW_rule__RelationalExpression__RelAssignment_0_in_rule__RelationalExpression__Group__0__Impl5408);
            rule__RelationalExpression__RelAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationalExpressionAccess().getRelAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group__0__Impl"


    // $ANTLR start "rule__RelationalExpression__Group__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2618:1: rule__RelationalExpression__Group__1 : rule__RelationalExpression__Group__1__Impl ;
    public final void rule__RelationalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2622:1: ( rule__RelationalExpression__Group__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2623:2: rule__RelationalExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RelationalExpression__Group__1__Impl_in_rule__RelationalExpression__Group__15438);
            rule__RelationalExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group__1"


    // $ANTLR start "rule__RelationalExpression__Group__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2629:1: rule__RelationalExpression__Group__1__Impl : ( ( rule__RelationalExpression__Group_1__0 )* ) ;
    public final void rule__RelationalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2633:1: ( ( ( rule__RelationalExpression__Group_1__0 )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2634:1: ( ( rule__RelationalExpression__Group_1__0 )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2634:1: ( ( rule__RelationalExpression__Group_1__0 )* )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2635:1: ( rule__RelationalExpression__Group_1__0 )*
            {
             before(grammarAccess.getRelationalExpressionAccess().getGroup_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2636:1: ( rule__RelationalExpression__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_GT && LA23_0<=RULE_LTE)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2636:2: rule__RelationalExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__RelationalExpression__Group_1__0_in_rule__RelationalExpression__Group__1__Impl5465);
            	    rule__RelationalExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getRelationalExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group__1__Impl"


    // $ANTLR start "rule__RelationalExpression__Group_1__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2650:1: rule__RelationalExpression__Group_1__0 : rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1 ;
    public final void rule__RelationalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2654:1: ( rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2655:2: rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__RelationalExpression__Group_1__0__Impl_in_rule__RelationalExpression__Group_1__05500);
            rule__RelationalExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationalExpression__Group_1__1_in_rule__RelationalExpression__Group_1__05503);
            rule__RelationalExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_1__0"


    // $ANTLR start "rule__RelationalExpression__Group_1__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2662:1: rule__RelationalExpression__Group_1__0__Impl : ( ruleRelationalOp ) ;
    public final void rule__RelationalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2666:1: ( ( ruleRelationalOp ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2667:1: ( ruleRelationalOp )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2667:1: ( ruleRelationalOp )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2668:1: ruleRelationalOp
            {
             before(grammarAccess.getRelationalExpressionAccess().getRelationalOpParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRelationalOp_in_rule__RelationalExpression__Group_1__0__Impl5530);
            ruleRelationalOp();

            state._fsp--;

             after(grammarAccess.getRelationalExpressionAccess().getRelationalOpParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_1__0__Impl"


    // $ANTLR start "rule__RelationalExpression__Group_1__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2679:1: rule__RelationalExpression__Group_1__1 : rule__RelationalExpression__Group_1__1__Impl ;
    public final void rule__RelationalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2683:1: ( rule__RelationalExpression__Group_1__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2684:2: rule__RelationalExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RelationalExpression__Group_1__1__Impl_in_rule__RelationalExpression__Group_1__15559);
            rule__RelationalExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_1__1"


    // $ANTLR start "rule__RelationalExpression__Group_1__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2690:1: rule__RelationalExpression__Group_1__1__Impl : ( ( rule__RelationalExpression__RelAssignment_1_1 ) ) ;
    public final void rule__RelationalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2694:1: ( ( ( rule__RelationalExpression__RelAssignment_1_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2695:1: ( ( rule__RelationalExpression__RelAssignment_1_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2695:1: ( ( rule__RelationalExpression__RelAssignment_1_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2696:1: ( rule__RelationalExpression__RelAssignment_1_1 )
            {
             before(grammarAccess.getRelationalExpressionAccess().getRelAssignment_1_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2697:1: ( rule__RelationalExpression__RelAssignment_1_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2697:2: rule__RelationalExpression__RelAssignment_1_1
            {
            pushFollow(FOLLOW_rule__RelationalExpression__RelAssignment_1_1_in_rule__RelationalExpression__Group_1__1__Impl5586);
            rule__RelationalExpression__RelAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationalExpressionAccess().getRelAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_1__1__Impl"


    // $ANTLR start "rule__InstanceOfExpression__Group__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2711:1: rule__InstanceOfExpression__Group__0 : rule__InstanceOfExpression__Group__0__Impl rule__InstanceOfExpression__Group__1 ;
    public final void rule__InstanceOfExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2715:1: ( rule__InstanceOfExpression__Group__0__Impl rule__InstanceOfExpression__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2716:2: rule__InstanceOfExpression__Group__0__Impl rule__InstanceOfExpression__Group__1
            {
            pushFollow(FOLLOW_rule__InstanceOfExpression__Group__0__Impl_in_rule__InstanceOfExpression__Group__05620);
            rule__InstanceOfExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstanceOfExpression__Group__1_in_rule__InstanceOfExpression__Group__05623);
            rule__InstanceOfExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceOfExpression__Group__0"


    // $ANTLR start "rule__InstanceOfExpression__Group__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2723:1: rule__InstanceOfExpression__Group__0__Impl : ( ( rule__InstanceOfExpression__ElAssignment_0 ) ) ;
    public final void rule__InstanceOfExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2727:1: ( ( ( rule__InstanceOfExpression__ElAssignment_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2728:1: ( ( rule__InstanceOfExpression__ElAssignment_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2728:1: ( ( rule__InstanceOfExpression__ElAssignment_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2729:1: ( rule__InstanceOfExpression__ElAssignment_0 )
            {
             before(grammarAccess.getInstanceOfExpressionAccess().getElAssignment_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2730:1: ( rule__InstanceOfExpression__ElAssignment_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2730:2: rule__InstanceOfExpression__ElAssignment_0
            {
            pushFollow(FOLLOW_rule__InstanceOfExpression__ElAssignment_0_in_rule__InstanceOfExpression__Group__0__Impl5650);
            rule__InstanceOfExpression__ElAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInstanceOfExpressionAccess().getElAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceOfExpression__Group__0__Impl"


    // $ANTLR start "rule__InstanceOfExpression__Group__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2740:1: rule__InstanceOfExpression__Group__1 : rule__InstanceOfExpression__Group__1__Impl ;
    public final void rule__InstanceOfExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2744:1: ( rule__InstanceOfExpression__Group__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2745:2: rule__InstanceOfExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InstanceOfExpression__Group__1__Impl_in_rule__InstanceOfExpression__Group__15680);
            rule__InstanceOfExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceOfExpression__Group__1"


    // $ANTLR start "rule__InstanceOfExpression__Group__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2751:1: rule__InstanceOfExpression__Group__1__Impl : ( ( rule__InstanceOfExpression__Group_1__0 )? ) ;
    public final void rule__InstanceOfExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2755:1: ( ( ( rule__InstanceOfExpression__Group_1__0 )? ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2756:1: ( ( rule__InstanceOfExpression__Group_1__0 )? )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2756:1: ( ( rule__InstanceOfExpression__Group_1__0 )? )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2757:1: ( rule__InstanceOfExpression__Group_1__0 )?
            {
             before(grammarAccess.getInstanceOfExpressionAccess().getGroup_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2758:1: ( rule__InstanceOfExpression__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INSTANCEOF) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2758:2: rule__InstanceOfExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__InstanceOfExpression__Group_1__0_in_rule__InstanceOfExpression__Group__1__Impl5707);
                    rule__InstanceOfExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInstanceOfExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceOfExpression__Group__1__Impl"


    // $ANTLR start "rule__InstanceOfExpression__Group_1__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2772:1: rule__InstanceOfExpression__Group_1__0 : rule__InstanceOfExpression__Group_1__0__Impl rule__InstanceOfExpression__Group_1__1 ;
    public final void rule__InstanceOfExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2776:1: ( rule__InstanceOfExpression__Group_1__0__Impl rule__InstanceOfExpression__Group_1__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2777:2: rule__InstanceOfExpression__Group_1__0__Impl rule__InstanceOfExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__InstanceOfExpression__Group_1__0__Impl_in_rule__InstanceOfExpression__Group_1__05742);
            rule__InstanceOfExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstanceOfExpression__Group_1__1_in_rule__InstanceOfExpression__Group_1__05745);
            rule__InstanceOfExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceOfExpression__Group_1__0"


    // $ANTLR start "rule__InstanceOfExpression__Group_1__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2784:1: rule__InstanceOfExpression__Group_1__0__Impl : ( RULE_INSTANCEOF ) ;
    public final void rule__InstanceOfExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2788:1: ( ( RULE_INSTANCEOF ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2789:1: ( RULE_INSTANCEOF )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2789:1: ( RULE_INSTANCEOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2790:1: RULE_INSTANCEOF
            {
             before(grammarAccess.getInstanceOfExpressionAccess().getINSTANCEOFTerminalRuleCall_1_0()); 
            match(input,RULE_INSTANCEOF,FOLLOW_RULE_INSTANCEOF_in_rule__InstanceOfExpression__Group_1__0__Impl5772); 
             after(grammarAccess.getInstanceOfExpressionAccess().getINSTANCEOFTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceOfExpression__Group_1__0__Impl"


    // $ANTLR start "rule__InstanceOfExpression__Group_1__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2801:1: rule__InstanceOfExpression__Group_1__1 : rule__InstanceOfExpression__Group_1__1__Impl ;
    public final void rule__InstanceOfExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2805:1: ( rule__InstanceOfExpression__Group_1__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2806:2: rule__InstanceOfExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__InstanceOfExpression__Group_1__1__Impl_in_rule__InstanceOfExpression__Group_1__15801);
            rule__InstanceOfExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceOfExpression__Group_1__1"


    // $ANTLR start "rule__InstanceOfExpression__Group_1__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2812:1: rule__InstanceOfExpression__Group_1__1__Impl : ( ( rule__InstanceOfExpression__TargetAssignment_1_1 ) ) ;
    public final void rule__InstanceOfExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2816:1: ( ( ( rule__InstanceOfExpression__TargetAssignment_1_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2817:1: ( ( rule__InstanceOfExpression__TargetAssignment_1_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2817:1: ( ( rule__InstanceOfExpression__TargetAssignment_1_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2818:1: ( rule__InstanceOfExpression__TargetAssignment_1_1 )
            {
             before(grammarAccess.getInstanceOfExpressionAccess().getTargetAssignment_1_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2819:1: ( rule__InstanceOfExpression__TargetAssignment_1_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2819:2: rule__InstanceOfExpression__TargetAssignment_1_1
            {
            pushFollow(FOLLOW_rule__InstanceOfExpression__TargetAssignment_1_1_in_rule__InstanceOfExpression__Group_1__1__Impl5828);
            rule__InstanceOfExpression__TargetAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInstanceOfExpressionAccess().getTargetAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceOfExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2833:1: rule__AdditiveExpression__Group__0 : rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 ;
    public final void rule__AdditiveExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2837:1: ( rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2838:2: rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__Group__0__Impl_in_rule__AdditiveExpression__Group__05862);
            rule__AdditiveExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AdditiveExpression__Group__1_in_rule__AdditiveExpression__Group__05865);
            rule__AdditiveExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group__0"


    // $ANTLR start "rule__AdditiveExpression__Group__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2845:1: rule__AdditiveExpression__Group__0__Impl : ( ( rule__AdditiveExpression__MultExprAssignment_0 ) ) ;
    public final void rule__AdditiveExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2849:1: ( ( ( rule__AdditiveExpression__MultExprAssignment_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2850:1: ( ( rule__AdditiveExpression__MultExprAssignment_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2850:1: ( ( rule__AdditiveExpression__MultExprAssignment_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2851:1: ( rule__AdditiveExpression__MultExprAssignment_0 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getMultExprAssignment_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2852:1: ( rule__AdditiveExpression__MultExprAssignment_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2852:2: rule__AdditiveExpression__MultExprAssignment_0
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__MultExprAssignment_0_in_rule__AdditiveExpression__Group__0__Impl5892);
            rule__AdditiveExpression__MultExprAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveExpressionAccess().getMultExprAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group__0__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2862:1: rule__AdditiveExpression__Group__1 : rule__AdditiveExpression__Group__1__Impl ;
    public final void rule__AdditiveExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2866:1: ( rule__AdditiveExpression__Group__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2867:2: rule__AdditiveExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__Group__1__Impl_in_rule__AdditiveExpression__Group__15922);
            rule__AdditiveExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group__1"


    // $ANTLR start "rule__AdditiveExpression__Group__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2873:1: rule__AdditiveExpression__Group__1__Impl : ( ( rule__AdditiveExpression__Group_1__0 )* ) ;
    public final void rule__AdditiveExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2877:1: ( ( ( rule__AdditiveExpression__Group_1__0 )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2878:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2878:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2879:1: ( rule__AdditiveExpression__Group_1__0 )*
            {
             before(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2880:1: ( rule__AdditiveExpression__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=51 && LA25_0<=52)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2880:2: rule__AdditiveExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AdditiveExpression__Group_1__0_in_rule__AdditiveExpression__Group__1__Impl5949);
            	    rule__AdditiveExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group__1__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2894:1: rule__AdditiveExpression__Group_1__0 : rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 ;
    public final void rule__AdditiveExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2898:1: ( rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2899:2: rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__Group_1__0__Impl_in_rule__AdditiveExpression__Group_1__05984);
            rule__AdditiveExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AdditiveExpression__Group_1__1_in_rule__AdditiveExpression__Group_1__05987);
            rule__AdditiveExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1__0"


    // $ANTLR start "rule__AdditiveExpression__Group_1__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2906:1: rule__AdditiveExpression__Group_1__0__Impl : ( ( rule__AdditiveExpression__Alternatives_1_0 ) ) ;
    public final void rule__AdditiveExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2910:1: ( ( ( rule__AdditiveExpression__Alternatives_1_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2911:1: ( ( rule__AdditiveExpression__Alternatives_1_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2911:1: ( ( rule__AdditiveExpression__Alternatives_1_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2912:1: ( rule__AdditiveExpression__Alternatives_1_0 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getAlternatives_1_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2913:1: ( rule__AdditiveExpression__Alternatives_1_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2913:2: rule__AdditiveExpression__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__Alternatives_1_0_in_rule__AdditiveExpression__Group_1__0__Impl6014);
            rule__AdditiveExpression__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveExpressionAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2923:1: rule__AdditiveExpression__Group_1__1 : rule__AdditiveExpression__Group_1__1__Impl ;
    public final void rule__AdditiveExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2927:1: ( rule__AdditiveExpression__Group_1__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2928:2: rule__AdditiveExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__Group_1__1__Impl_in_rule__AdditiveExpression__Group_1__16044);
            rule__AdditiveExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1__1"


    // $ANTLR start "rule__AdditiveExpression__Group_1__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2934:1: rule__AdditiveExpression__Group_1__1__Impl : ( ( rule__AdditiveExpression__MultExprAssignment_1_1 ) ) ;
    public final void rule__AdditiveExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2938:1: ( ( ( rule__AdditiveExpression__MultExprAssignment_1_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2939:1: ( ( rule__AdditiveExpression__MultExprAssignment_1_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2939:1: ( ( rule__AdditiveExpression__MultExprAssignment_1_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2940:1: ( rule__AdditiveExpression__MultExprAssignment_1_1 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getMultExprAssignment_1_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2941:1: ( rule__AdditiveExpression__MultExprAssignment_1_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2941:2: rule__AdditiveExpression__MultExprAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__MultExprAssignment_1_1_in_rule__AdditiveExpression__Group_1__1__Impl6071);
            rule__AdditiveExpression__MultExprAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveExpressionAccess().getMultExprAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2955:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2959:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2960:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group__0__Impl_in_rule__MultiplicativeExpression__Group__06105);
            rule__MultiplicativeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group__1_in_rule__MultiplicativeExpression__Group__06108);
            rule__MultiplicativeExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2967:1: rule__MultiplicativeExpression__Group__0__Impl : ( ( rule__MultiplicativeExpression__BaseExprAssignment_0 ) ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2971:1: ( ( ( rule__MultiplicativeExpression__BaseExprAssignment_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2972:1: ( ( rule__MultiplicativeExpression__BaseExprAssignment_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2972:1: ( ( rule__MultiplicativeExpression__BaseExprAssignment_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2973:1: ( rule__MultiplicativeExpression__BaseExprAssignment_0 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getBaseExprAssignment_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2974:1: ( rule__MultiplicativeExpression__BaseExprAssignment_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2974:2: rule__MultiplicativeExpression__BaseExprAssignment_0
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__BaseExprAssignment_0_in_rule__MultiplicativeExpression__Group__0__Impl6135);
            rule__MultiplicativeExpression__BaseExprAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getBaseExprAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2984:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl rule__MultiplicativeExpression__Group__2 ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2988:1: ( rule__MultiplicativeExpression__Group__1__Impl rule__MultiplicativeExpression__Group__2 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2989:2: rule__MultiplicativeExpression__Group__1__Impl rule__MultiplicativeExpression__Group__2
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group__1__Impl_in_rule__MultiplicativeExpression__Group__16165);
            rule__MultiplicativeExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group__2_in_rule__MultiplicativeExpression__Group__16168);
            rule__MultiplicativeExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2996:1: rule__MultiplicativeExpression__Group__1__Impl : ( ( rule__MultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3000:1: ( ( ( rule__MultiplicativeExpression__Group_1__0 )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3001:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3001:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3002:1: ( rule__MultiplicativeExpression__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3003:1: ( rule__MultiplicativeExpression__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_DOT) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3003:2: rule__MultiplicativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_1__0_in_rule__MultiplicativeExpression__Group__1__Impl6195);
            	    rule__MultiplicativeExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__2"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3013:1: rule__MultiplicativeExpression__Group__2 : rule__MultiplicativeExpression__Group__2__Impl ;
    public final void rule__MultiplicativeExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3017:1: ( rule__MultiplicativeExpression__Group__2__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3018:2: rule__MultiplicativeExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group__2__Impl_in_rule__MultiplicativeExpression__Group__26226);
            rule__MultiplicativeExpression__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__2"


    // $ANTLR start "rule__MultiplicativeExpression__Group__2__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3024:1: rule__MultiplicativeExpression__Group__2__Impl : ( ( rule__MultiplicativeExpression__Group_2__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3028:1: ( ( ( rule__MultiplicativeExpression__Group_2__0 )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3029:1: ( ( rule__MultiplicativeExpression__Group_2__0 )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3029:1: ( ( rule__MultiplicativeExpression__Group_2__0 )* )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3030:1: ( rule__MultiplicativeExpression__Group_2__0 )*
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_2()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3031:1: ( rule__MultiplicativeExpression__Group_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=53 && LA27_0<=54)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3031:2: rule__MultiplicativeExpression__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_2__0_in_rule__MultiplicativeExpression__Group__2__Impl6253);
            	    rule__MultiplicativeExpression__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getMultiplicativeExpressionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__2__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3047:1: rule__MultiplicativeExpression__Group_1__0 : rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 ;
    public final void rule__MultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3051:1: ( rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3052:2: rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_1__0__Impl_in_rule__MultiplicativeExpression__Group_1__06290);
            rule__MultiplicativeExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_1__1_in_rule__MultiplicativeExpression__Group_1__06293);
            rule__MultiplicativeExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3059:1: rule__MultiplicativeExpression__Group_1__0__Impl : ( RULE_DOT ) ;
    public final void rule__MultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3063:1: ( ( RULE_DOT ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3064:1: ( RULE_DOT )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3064:1: ( RULE_DOT )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3065:1: RULE_DOT
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getDOTTerminalRuleCall_1_0()); 
            match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rule__MultiplicativeExpression__Group_1__0__Impl6320); 
             after(grammarAccess.getMultiplicativeExpressionAccess().getDOTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3076:1: rule__MultiplicativeExpression__Group_1__1 : rule__MultiplicativeExpression__Group_1__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3080:1: ( rule__MultiplicativeExpression__Group_1__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3081:2: rule__MultiplicativeExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_1__1__Impl_in_rule__MultiplicativeExpression__Group_1__16349);
            rule__MultiplicativeExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3087:1: rule__MultiplicativeExpression__Group_1__1__Impl : ( ( rule__MultiplicativeExpression__MethodsAssignment_1_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3091:1: ( ( ( rule__MultiplicativeExpression__MethodsAssignment_1_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3092:1: ( ( rule__MultiplicativeExpression__MethodsAssignment_1_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3092:1: ( ( rule__MultiplicativeExpression__MethodsAssignment_1_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3093:1: ( rule__MultiplicativeExpression__MethodsAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getMethodsAssignment_1_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3094:1: ( rule__MultiplicativeExpression__MethodsAssignment_1_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3094:2: rule__MultiplicativeExpression__MethodsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__MethodsAssignment_1_1_in_rule__MultiplicativeExpression__Group_1__1__Impl6376);
            rule__MultiplicativeExpression__MethodsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getMethodsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_2__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3108:1: rule__MultiplicativeExpression__Group_2__0 : rule__MultiplicativeExpression__Group_2__0__Impl rule__MultiplicativeExpression__Group_2__1 ;
    public final void rule__MultiplicativeExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3112:1: ( rule__MultiplicativeExpression__Group_2__0__Impl rule__MultiplicativeExpression__Group_2__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3113:2: rule__MultiplicativeExpression__Group_2__0__Impl rule__MultiplicativeExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_2__0__Impl_in_rule__MultiplicativeExpression__Group_2__06410);
            rule__MultiplicativeExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_2__1_in_rule__MultiplicativeExpression__Group_2__06413);
            rule__MultiplicativeExpression__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_2__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group_2__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3120:1: rule__MultiplicativeExpression__Group_2__0__Impl : ( ( rule__MultiplicativeExpression__Alternatives_2_0 ) ) ;
    public final void rule__MultiplicativeExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3124:1: ( ( ( rule__MultiplicativeExpression__Alternatives_2_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3125:1: ( ( rule__MultiplicativeExpression__Alternatives_2_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3125:1: ( ( rule__MultiplicativeExpression__Alternatives_2_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3126:1: ( rule__MultiplicativeExpression__Alternatives_2_0 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getAlternatives_2_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3127:1: ( rule__MultiplicativeExpression__Alternatives_2_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3127:2: rule__MultiplicativeExpression__Alternatives_2_0
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__Alternatives_2_0_in_rule__MultiplicativeExpression__Group_2__0__Impl6440);
            rule__MultiplicativeExpression__Alternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_2__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_2__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3137:1: rule__MultiplicativeExpression__Group_2__1 : rule__MultiplicativeExpression__Group_2__1__Impl rule__MultiplicativeExpression__Group_2__2 ;
    public final void rule__MultiplicativeExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3141:1: ( rule__MultiplicativeExpression__Group_2__1__Impl rule__MultiplicativeExpression__Group_2__2 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3142:2: rule__MultiplicativeExpression__Group_2__1__Impl rule__MultiplicativeExpression__Group_2__2
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_2__1__Impl_in_rule__MultiplicativeExpression__Group_2__16470);
            rule__MultiplicativeExpression__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_2__2_in_rule__MultiplicativeExpression__Group_2__16473);
            rule__MultiplicativeExpression__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_2__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group_2__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3149:1: rule__MultiplicativeExpression__Group_2__1__Impl : ( ( rule__MultiplicativeExpression__BaseExprAssignment_2_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3153:1: ( ( ( rule__MultiplicativeExpression__BaseExprAssignment_2_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3154:1: ( ( rule__MultiplicativeExpression__BaseExprAssignment_2_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3154:1: ( ( rule__MultiplicativeExpression__BaseExprAssignment_2_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3155:1: ( rule__MultiplicativeExpression__BaseExprAssignment_2_1 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getBaseExprAssignment_2_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3156:1: ( rule__MultiplicativeExpression__BaseExprAssignment_2_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3156:2: rule__MultiplicativeExpression__BaseExprAssignment_2_1
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__BaseExprAssignment_2_1_in_rule__MultiplicativeExpression__Group_2__1__Impl6500);
            rule__MultiplicativeExpression__BaseExprAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getBaseExprAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_2__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_2__2"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3166:1: rule__MultiplicativeExpression__Group_2__2 : rule__MultiplicativeExpression__Group_2__2__Impl ;
    public final void rule__MultiplicativeExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3170:1: ( rule__MultiplicativeExpression__Group_2__2__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3171:2: rule__MultiplicativeExpression__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_2__2__Impl_in_rule__MultiplicativeExpression__Group_2__26530);
            rule__MultiplicativeExpression__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_2__2"


    // $ANTLR start "rule__MultiplicativeExpression__Group_2__2__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3177:1: rule__MultiplicativeExpression__Group_2__2__Impl : ( ( rule__MultiplicativeExpression__Group_2_2__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3181:1: ( ( ( rule__MultiplicativeExpression__Group_2_2__0 )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3182:1: ( ( rule__MultiplicativeExpression__Group_2_2__0 )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3182:1: ( ( rule__MultiplicativeExpression__Group_2_2__0 )* )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3183:1: ( rule__MultiplicativeExpression__Group_2_2__0 )*
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_2_2()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3184:1: ( rule__MultiplicativeExpression__Group_2_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_DOT) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3184:2: rule__MultiplicativeExpression__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_2_2__0_in_rule__MultiplicativeExpression__Group_2__2__Impl6557);
            	    rule__MultiplicativeExpression__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getMultiplicativeExpressionAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_2__2__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_2_2__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3200:1: rule__MultiplicativeExpression__Group_2_2__0 : rule__MultiplicativeExpression__Group_2_2__0__Impl rule__MultiplicativeExpression__Group_2_2__1 ;
    public final void rule__MultiplicativeExpression__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3204:1: ( rule__MultiplicativeExpression__Group_2_2__0__Impl rule__MultiplicativeExpression__Group_2_2__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3205:2: rule__MultiplicativeExpression__Group_2_2__0__Impl rule__MultiplicativeExpression__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_2_2__0__Impl_in_rule__MultiplicativeExpression__Group_2_2__06594);
            rule__MultiplicativeExpression__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_2_2__1_in_rule__MultiplicativeExpression__Group_2_2__06597);
            rule__MultiplicativeExpression__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_2_2__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group_2_2__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3212:1: rule__MultiplicativeExpression__Group_2_2__0__Impl : ( RULE_DOT ) ;
    public final void rule__MultiplicativeExpression__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3216:1: ( ( RULE_DOT ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3217:1: ( RULE_DOT )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3217:1: ( RULE_DOT )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3218:1: RULE_DOT
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getDOTTerminalRuleCall_2_2_0()); 
            match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rule__MultiplicativeExpression__Group_2_2__0__Impl6624); 
             after(grammarAccess.getMultiplicativeExpressionAccess().getDOTTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_2_2__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_2_2__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3229:1: rule__MultiplicativeExpression__Group_2_2__1 : rule__MultiplicativeExpression__Group_2_2__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3233:1: ( rule__MultiplicativeExpression__Group_2_2__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3234:2: rule__MultiplicativeExpression__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_2_2__1__Impl_in_rule__MultiplicativeExpression__Group_2_2__16653);
            rule__MultiplicativeExpression__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_2_2__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group_2_2__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3240:1: rule__MultiplicativeExpression__Group_2_2__1__Impl : ( ( rule__MultiplicativeExpression__MethodsAssignment_2_2_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3244:1: ( ( ( rule__MultiplicativeExpression__MethodsAssignment_2_2_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3245:1: ( ( rule__MultiplicativeExpression__MethodsAssignment_2_2_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3245:1: ( ( rule__MultiplicativeExpression__MethodsAssignment_2_2_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3246:1: ( rule__MultiplicativeExpression__MethodsAssignment_2_2_1 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getMethodsAssignment_2_2_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3247:1: ( rule__MultiplicativeExpression__MethodsAssignment_2_2_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3247:2: rule__MultiplicativeExpression__MethodsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__MethodsAssignment_2_2_1_in_rule__MultiplicativeExpression__Group_2_2__1__Impl6680);
            rule__MultiplicativeExpression__MethodsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getMethodsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_2_2__1__Impl"


    // $ANTLR start "rule__ClassCreator__Group__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3261:1: rule__ClassCreator__Group__0 : rule__ClassCreator__Group__0__Impl rule__ClassCreator__Group__1 ;
    public final void rule__ClassCreator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3265:1: ( rule__ClassCreator__Group__0__Impl rule__ClassCreator__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3266:2: rule__ClassCreator__Group__0__Impl rule__ClassCreator__Group__1
            {
            pushFollow(FOLLOW_rule__ClassCreator__Group__0__Impl_in_rule__ClassCreator__Group__06714);
            rule__ClassCreator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassCreator__Group__1_in_rule__ClassCreator__Group__06717);
            rule__ClassCreator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassCreator__Group__0"


    // $ANTLR start "rule__ClassCreator__Group__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3273:1: rule__ClassCreator__Group__0__Impl : ( RULE_NEW ) ;
    public final void rule__ClassCreator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3277:1: ( ( RULE_NEW ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3278:1: ( RULE_NEW )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3278:1: ( RULE_NEW )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3279:1: RULE_NEW
            {
             before(grammarAccess.getClassCreatorAccess().getNEWTerminalRuleCall_0()); 
            match(input,RULE_NEW,FOLLOW_RULE_NEW_in_rule__ClassCreator__Group__0__Impl6744); 
             after(grammarAccess.getClassCreatorAccess().getNEWTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassCreator__Group__0__Impl"


    // $ANTLR start "rule__ClassCreator__Group__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3290:1: rule__ClassCreator__Group__1 : rule__ClassCreator__Group__1__Impl rule__ClassCreator__Group__2 ;
    public final void rule__ClassCreator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3294:1: ( rule__ClassCreator__Group__1__Impl rule__ClassCreator__Group__2 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3295:2: rule__ClassCreator__Group__1__Impl rule__ClassCreator__Group__2
            {
            pushFollow(FOLLOW_rule__ClassCreator__Group__1__Impl_in_rule__ClassCreator__Group__16773);
            rule__ClassCreator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassCreator__Group__2_in_rule__ClassCreator__Group__16776);
            rule__ClassCreator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassCreator__Group__1"


    // $ANTLR start "rule__ClassCreator__Group__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3302:1: rule__ClassCreator__Group__1__Impl : ( ( rule__ClassCreator__ClazzAssignment_1 ) ) ;
    public final void rule__ClassCreator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3306:1: ( ( ( rule__ClassCreator__ClazzAssignment_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3307:1: ( ( rule__ClassCreator__ClazzAssignment_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3307:1: ( ( rule__ClassCreator__ClazzAssignment_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3308:1: ( rule__ClassCreator__ClazzAssignment_1 )
            {
             before(grammarAccess.getClassCreatorAccess().getClazzAssignment_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3309:1: ( rule__ClassCreator__ClazzAssignment_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3309:2: rule__ClassCreator__ClazzAssignment_1
            {
            pushFollow(FOLLOW_rule__ClassCreator__ClazzAssignment_1_in_rule__ClassCreator__Group__1__Impl6803);
            rule__ClassCreator__ClazzAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassCreatorAccess().getClazzAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassCreator__Group__1__Impl"


    // $ANTLR start "rule__ClassCreator__Group__2"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3319:1: rule__ClassCreator__Group__2 : rule__ClassCreator__Group__2__Impl ;
    public final void rule__ClassCreator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3323:1: ( rule__ClassCreator__Group__2__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3324:2: rule__ClassCreator__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ClassCreator__Group__2__Impl_in_rule__ClassCreator__Group__26833);
            rule__ClassCreator__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassCreator__Group__2"


    // $ANTLR start "rule__ClassCreator__Group__2__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3330:1: rule__ClassCreator__Group__2__Impl : ( ( rule__ClassCreator__ArgsAssignment_2 ) ) ;
    public final void rule__ClassCreator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3334:1: ( ( ( rule__ClassCreator__ArgsAssignment_2 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3335:1: ( ( rule__ClassCreator__ArgsAssignment_2 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3335:1: ( ( rule__ClassCreator__ArgsAssignment_2 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3336:1: ( rule__ClassCreator__ArgsAssignment_2 )
            {
             before(grammarAccess.getClassCreatorAccess().getArgsAssignment_2()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3337:1: ( rule__ClassCreator__ArgsAssignment_2 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3337:2: rule__ClassCreator__ArgsAssignment_2
            {
            pushFollow(FOLLOW_rule__ClassCreator__ArgsAssignment_2_in_rule__ClassCreator__Group__2__Impl6860);
            rule__ClassCreator__ArgsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClassCreatorAccess().getArgsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassCreator__Group__2__Impl"


    // $ANTLR start "rule__ArrayCreator__Group__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3353:1: rule__ArrayCreator__Group__0 : rule__ArrayCreator__Group__0__Impl rule__ArrayCreator__Group__1 ;
    public final void rule__ArrayCreator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3357:1: ( rule__ArrayCreator__Group__0__Impl rule__ArrayCreator__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3358:2: rule__ArrayCreator__Group__0__Impl rule__ArrayCreator__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayCreator__Group__0__Impl_in_rule__ArrayCreator__Group__06896);
            rule__ArrayCreator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayCreator__Group__1_in_rule__ArrayCreator__Group__06899);
            rule__ArrayCreator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayCreator__Group__0"


    // $ANTLR start "rule__ArrayCreator__Group__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3365:1: rule__ArrayCreator__Group__0__Impl : ( RULE_NEW ) ;
    public final void rule__ArrayCreator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3369:1: ( ( RULE_NEW ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3370:1: ( RULE_NEW )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3370:1: ( RULE_NEW )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3371:1: RULE_NEW
            {
             before(grammarAccess.getArrayCreatorAccess().getNEWTerminalRuleCall_0()); 
            match(input,RULE_NEW,FOLLOW_RULE_NEW_in_rule__ArrayCreator__Group__0__Impl6926); 
             after(grammarAccess.getArrayCreatorAccess().getNEWTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayCreator__Group__0__Impl"


    // $ANTLR start "rule__ArrayCreator__Group__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3382:1: rule__ArrayCreator__Group__1 : rule__ArrayCreator__Group__1__Impl rule__ArrayCreator__Group__2 ;
    public final void rule__ArrayCreator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3386:1: ( rule__ArrayCreator__Group__1__Impl rule__ArrayCreator__Group__2 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3387:2: rule__ArrayCreator__Group__1__Impl rule__ArrayCreator__Group__2
            {
            pushFollow(FOLLOW_rule__ArrayCreator__Group__1__Impl_in_rule__ArrayCreator__Group__16955);
            rule__ArrayCreator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayCreator__Group__2_in_rule__ArrayCreator__Group__16958);
            rule__ArrayCreator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayCreator__Group__1"


    // $ANTLR start "rule__ArrayCreator__Group__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3394:1: rule__ArrayCreator__Group__1__Impl : ( ( rule__ArrayCreator__TypeAssignment_1 ) ) ;
    public final void rule__ArrayCreator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3398:1: ( ( ( rule__ArrayCreator__TypeAssignment_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3399:1: ( ( rule__ArrayCreator__TypeAssignment_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3399:1: ( ( rule__ArrayCreator__TypeAssignment_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3400:1: ( rule__ArrayCreator__TypeAssignment_1 )
            {
             before(grammarAccess.getArrayCreatorAccess().getTypeAssignment_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3401:1: ( rule__ArrayCreator__TypeAssignment_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3401:2: rule__ArrayCreator__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__ArrayCreator__TypeAssignment_1_in_rule__ArrayCreator__Group__1__Impl6985);
            rule__ArrayCreator__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayCreatorAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayCreator__Group__1__Impl"


    // $ANTLR start "rule__ArrayCreator__Group__2"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3411:1: rule__ArrayCreator__Group__2 : rule__ArrayCreator__Group__2__Impl ;
    public final void rule__ArrayCreator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3415:1: ( rule__ArrayCreator__Group__2__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3416:2: rule__ArrayCreator__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ArrayCreator__Group__2__Impl_in_rule__ArrayCreator__Group__27015);
            rule__ArrayCreator__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayCreator__Group__2"


    // $ANTLR start "rule__ArrayCreator__Group__2__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3422:1: rule__ArrayCreator__Group__2__Impl : ( ( rule__ArrayCreator__ArrayInitializerAssignment_2 ) ) ;
    public final void rule__ArrayCreator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3426:1: ( ( ( rule__ArrayCreator__ArrayInitializerAssignment_2 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3427:1: ( ( rule__ArrayCreator__ArrayInitializerAssignment_2 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3427:1: ( ( rule__ArrayCreator__ArrayInitializerAssignment_2 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3428:1: ( rule__ArrayCreator__ArrayInitializerAssignment_2 )
            {
             before(grammarAccess.getArrayCreatorAccess().getArrayInitializerAssignment_2()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3429:1: ( rule__ArrayCreator__ArrayInitializerAssignment_2 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3429:2: rule__ArrayCreator__ArrayInitializerAssignment_2
            {
            pushFollow(FOLLOW_rule__ArrayCreator__ArrayInitializerAssignment_2_in_rule__ArrayCreator__Group__2__Impl7042);
            rule__ArrayCreator__ArrayInitializerAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getArrayCreatorAccess().getArrayInitializerAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayCreator__Group__2__Impl"


    // $ANTLR start "rule__ArrayInitializer__Group__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3445:1: rule__ArrayInitializer__Group__0 : rule__ArrayInitializer__Group__0__Impl rule__ArrayInitializer__Group__1 ;
    public final void rule__ArrayInitializer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3449:1: ( rule__ArrayInitializer__Group__0__Impl rule__ArrayInitializer__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3450:2: rule__ArrayInitializer__Group__0__Impl rule__ArrayInitializer__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayInitializer__Group__0__Impl_in_rule__ArrayInitializer__Group__07078);
            rule__ArrayInitializer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayInitializer__Group__1_in_rule__ArrayInitializer__Group__07081);
            rule__ArrayInitializer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializer__Group__0"


    // $ANTLR start "rule__ArrayInitializer__Group__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3457:1: rule__ArrayInitializer__Group__0__Impl : ( () ) ;
    public final void rule__ArrayInitializer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3461:1: ( ( () ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3462:1: ( () )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3462:1: ( () )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3463:1: ()
            {
             before(grammarAccess.getArrayInitializerAccess().getArrayInitializerAction_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3464:1: ()
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3466:1: 
            {
            }

             after(grammarAccess.getArrayInitializerAccess().getArrayInitializerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializer__Group__0__Impl"


    // $ANTLR start "rule__ArrayInitializer__Group__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3476:1: rule__ArrayInitializer__Group__1 : rule__ArrayInitializer__Group__1__Impl rule__ArrayInitializer__Group__2 ;
    public final void rule__ArrayInitializer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3480:1: ( rule__ArrayInitializer__Group__1__Impl rule__ArrayInitializer__Group__2 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3481:2: rule__ArrayInitializer__Group__1__Impl rule__ArrayInitializer__Group__2
            {
            pushFollow(FOLLOW_rule__ArrayInitializer__Group__1__Impl_in_rule__ArrayInitializer__Group__17139);
            rule__ArrayInitializer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayInitializer__Group__2_in_rule__ArrayInitializer__Group__17142);
            rule__ArrayInitializer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializer__Group__1"


    // $ANTLR start "rule__ArrayInitializer__Group__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3488:1: rule__ArrayInitializer__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__ArrayInitializer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3492:1: ( ( RULE_LBRACE ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3493:1: ( RULE_LBRACE )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3493:1: ( RULE_LBRACE )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3494:1: RULE_LBRACE
            {
             before(grammarAccess.getArrayInitializerAccess().getLBRACETerminalRuleCall_1()); 
            match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_rule__ArrayInitializer__Group__1__Impl7169); 
             after(grammarAccess.getArrayInitializerAccess().getLBRACETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializer__Group__1__Impl"


    // $ANTLR start "rule__ArrayInitializer__Group__2"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3505:1: rule__ArrayInitializer__Group__2 : rule__ArrayInitializer__Group__2__Impl rule__ArrayInitializer__Group__3 ;
    public final void rule__ArrayInitializer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3509:1: ( rule__ArrayInitializer__Group__2__Impl rule__ArrayInitializer__Group__3 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3510:2: rule__ArrayInitializer__Group__2__Impl rule__ArrayInitializer__Group__3
            {
            pushFollow(FOLLOW_rule__ArrayInitializer__Group__2__Impl_in_rule__ArrayInitializer__Group__27198);
            rule__ArrayInitializer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayInitializer__Group__3_in_rule__ArrayInitializer__Group__27201);
            rule__ArrayInitializer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializer__Group__2"


    // $ANTLR start "rule__ArrayInitializer__Group__2__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3517:1: rule__ArrayInitializer__Group__2__Impl : ( ( rule__ArrayInitializer__Group_2__0 )? ) ;
    public final void rule__ArrayInitializer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3521:1: ( ( ( rule__ArrayInitializer__Group_2__0 )? ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3522:1: ( ( rule__ArrayInitializer__Group_2__0 )? )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3522:1: ( ( rule__ArrayInitializer__Group_2__0 )? )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3523:1: ( rule__ArrayInitializer__Group_2__0 )?
            {
             before(grammarAccess.getArrayInitializerAccess().getGroup_2()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3524:1: ( rule__ArrayInitializer__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_INTLITERAL && LA29_0<=RULE_LPAREN)||LA29_0==RULE_NOT||LA29_0==RULE_NEW||(LA29_0>=RULE_IDENTIFIER && LA29_0<=RULE_VARIABLETOKEN)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3524:2: rule__ArrayInitializer__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ArrayInitializer__Group_2__0_in_rule__ArrayInitializer__Group__2__Impl7228);
                    rule__ArrayInitializer__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArrayInitializerAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializer__Group__2__Impl"


    // $ANTLR start "rule__ArrayInitializer__Group__3"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3534:1: rule__ArrayInitializer__Group__3 : rule__ArrayInitializer__Group__3__Impl rule__ArrayInitializer__Group__4 ;
    public final void rule__ArrayInitializer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3538:1: ( rule__ArrayInitializer__Group__3__Impl rule__ArrayInitializer__Group__4 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3539:2: rule__ArrayInitializer__Group__3__Impl rule__ArrayInitializer__Group__4
            {
            pushFollow(FOLLOW_rule__ArrayInitializer__Group__3__Impl_in_rule__ArrayInitializer__Group__37259);
            rule__ArrayInitializer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayInitializer__Group__4_in_rule__ArrayInitializer__Group__37262);
            rule__ArrayInitializer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializer__Group__3"


    // $ANTLR start "rule__ArrayInitializer__Group__3__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3546:1: rule__ArrayInitializer__Group__3__Impl : ( ( RULE_COMMA )? ) ;
    public final void rule__ArrayInitializer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3550:1: ( ( ( RULE_COMMA )? ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3551:1: ( ( RULE_COMMA )? )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3551:1: ( ( RULE_COMMA )? )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3552:1: ( RULE_COMMA )?
            {
             before(grammarAccess.getArrayInitializerAccess().getCOMMATerminalRuleCall_3()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3553:1: ( RULE_COMMA )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_COMMA) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3553:3: RULE_COMMA
                    {
                    match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__ArrayInitializer__Group__3__Impl7290); 

                    }
                    break;

            }

             after(grammarAccess.getArrayInitializerAccess().getCOMMATerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializer__Group__3__Impl"


    // $ANTLR start "rule__ArrayInitializer__Group__4"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3563:1: rule__ArrayInitializer__Group__4 : rule__ArrayInitializer__Group__4__Impl ;
    public final void rule__ArrayInitializer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3567:1: ( rule__ArrayInitializer__Group__4__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3568:2: rule__ArrayInitializer__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ArrayInitializer__Group__4__Impl_in_rule__ArrayInitializer__Group__47321);
            rule__ArrayInitializer__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializer__Group__4"


    // $ANTLR start "rule__ArrayInitializer__Group__4__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3574:1: rule__ArrayInitializer__Group__4__Impl : ( RULE_RBRACE ) ;
    public final void rule__ArrayInitializer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3578:1: ( ( RULE_RBRACE ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3579:1: ( RULE_RBRACE )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3579:1: ( RULE_RBRACE )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3580:1: RULE_RBRACE
            {
             before(grammarAccess.getArrayInitializerAccess().getRBRACETerminalRuleCall_4()); 
            match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_rule__ArrayInitializer__Group__4__Impl7348); 
             after(grammarAccess.getArrayInitializerAccess().getRBRACETerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializer__Group__4__Impl"


    // $ANTLR start "rule__ArrayInitializer__Group_2__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3601:1: rule__ArrayInitializer__Group_2__0 : rule__ArrayInitializer__Group_2__0__Impl rule__ArrayInitializer__Group_2__1 ;
    public final void rule__ArrayInitializer__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3605:1: ( rule__ArrayInitializer__Group_2__0__Impl rule__ArrayInitializer__Group_2__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3606:2: rule__ArrayInitializer__Group_2__0__Impl rule__ArrayInitializer__Group_2__1
            {
            pushFollow(FOLLOW_rule__ArrayInitializer__Group_2__0__Impl_in_rule__ArrayInitializer__Group_2__07387);
            rule__ArrayInitializer__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayInitializer__Group_2__1_in_rule__ArrayInitializer__Group_2__07390);
            rule__ArrayInitializer__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializer__Group_2__0"


    // $ANTLR start "rule__ArrayInitializer__Group_2__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3613:1: rule__ArrayInitializer__Group_2__0__Impl : ( ( rule__ArrayInitializer__FirstElAssignment_2_0 ) ) ;
    public final void rule__ArrayInitializer__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3617:1: ( ( ( rule__ArrayInitializer__FirstElAssignment_2_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3618:1: ( ( rule__ArrayInitializer__FirstElAssignment_2_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3618:1: ( ( rule__ArrayInitializer__FirstElAssignment_2_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3619:1: ( rule__ArrayInitializer__FirstElAssignment_2_0 )
            {
             before(grammarAccess.getArrayInitializerAccess().getFirstElAssignment_2_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3620:1: ( rule__ArrayInitializer__FirstElAssignment_2_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3620:2: rule__ArrayInitializer__FirstElAssignment_2_0
            {
            pushFollow(FOLLOW_rule__ArrayInitializer__FirstElAssignment_2_0_in_rule__ArrayInitializer__Group_2__0__Impl7417);
            rule__ArrayInitializer__FirstElAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getArrayInitializerAccess().getFirstElAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializer__Group_2__0__Impl"


    // $ANTLR start "rule__ArrayInitializer__Group_2__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3630:1: rule__ArrayInitializer__Group_2__1 : rule__ArrayInitializer__Group_2__1__Impl ;
    public final void rule__ArrayInitializer__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3634:1: ( rule__ArrayInitializer__Group_2__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3635:2: rule__ArrayInitializer__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrayInitializer__Group_2__1__Impl_in_rule__ArrayInitializer__Group_2__17447);
            rule__ArrayInitializer__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializer__Group_2__1"


    // $ANTLR start "rule__ArrayInitializer__Group_2__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3641:1: rule__ArrayInitializer__Group_2__1__Impl : ( ( rule__ArrayInitializer__Group_2_1__0 )* ) ;
    public final void rule__ArrayInitializer__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3645:1: ( ( ( rule__ArrayInitializer__Group_2_1__0 )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3646:1: ( ( rule__ArrayInitializer__Group_2_1__0 )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3646:1: ( ( rule__ArrayInitializer__Group_2_1__0 )* )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3647:1: ( rule__ArrayInitializer__Group_2_1__0 )*
            {
             before(grammarAccess.getArrayInitializerAccess().getGroup_2_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3648:1: ( rule__ArrayInitializer__Group_2_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_COMMA) ) {
                    int LA31_1 = input.LA(2);

                    if ( ((LA31_1>=RULE_INTLITERAL && LA31_1<=RULE_LPAREN)||LA31_1==RULE_NOT||LA31_1==RULE_NEW||(LA31_1>=RULE_IDENTIFIER && LA31_1<=RULE_VARIABLETOKEN)) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3648:2: rule__ArrayInitializer__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ArrayInitializer__Group_2_1__0_in_rule__ArrayInitializer__Group_2__1__Impl7474);
            	    rule__ArrayInitializer__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getArrayInitializerAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializer__Group_2__1__Impl"


    // $ANTLR start "rule__ArrayInitializer__Group_2_1__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3662:1: rule__ArrayInitializer__Group_2_1__0 : rule__ArrayInitializer__Group_2_1__0__Impl rule__ArrayInitializer__Group_2_1__1 ;
    public final void rule__ArrayInitializer__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3666:1: ( rule__ArrayInitializer__Group_2_1__0__Impl rule__ArrayInitializer__Group_2_1__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3667:2: rule__ArrayInitializer__Group_2_1__0__Impl rule__ArrayInitializer__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__ArrayInitializer__Group_2_1__0__Impl_in_rule__ArrayInitializer__Group_2_1__07509);
            rule__ArrayInitializer__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayInitializer__Group_2_1__1_in_rule__ArrayInitializer__Group_2_1__07512);
            rule__ArrayInitializer__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializer__Group_2_1__0"


    // $ANTLR start "rule__ArrayInitializer__Group_2_1__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3674:1: rule__ArrayInitializer__Group_2_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__ArrayInitializer__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3678:1: ( ( RULE_COMMA ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3679:1: ( RULE_COMMA )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3679:1: ( RULE_COMMA )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3680:1: RULE_COMMA
            {
             before(grammarAccess.getArrayInitializerAccess().getCOMMATerminalRuleCall_2_1_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__ArrayInitializer__Group_2_1__0__Impl7539); 
             after(grammarAccess.getArrayInitializerAccess().getCOMMATerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializer__Group_2_1__0__Impl"


    // $ANTLR start "rule__ArrayInitializer__Group_2_1__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3691:1: rule__ArrayInitializer__Group_2_1__1 : rule__ArrayInitializer__Group_2_1__1__Impl ;
    public final void rule__ArrayInitializer__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3695:1: ( rule__ArrayInitializer__Group_2_1__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3696:2: rule__ArrayInitializer__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrayInitializer__Group_2_1__1__Impl_in_rule__ArrayInitializer__Group_2_1__17568);
            rule__ArrayInitializer__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializer__Group_2_1__1"


    // $ANTLR start "rule__ArrayInitializer__Group_2_1__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3702:1: rule__ArrayInitializer__Group_2_1__1__Impl : ( ( rule__ArrayInitializer__OtherElsAssignment_2_1_1 ) ) ;
    public final void rule__ArrayInitializer__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3706:1: ( ( ( rule__ArrayInitializer__OtherElsAssignment_2_1_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3707:1: ( ( rule__ArrayInitializer__OtherElsAssignment_2_1_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3707:1: ( ( rule__ArrayInitializer__OtherElsAssignment_2_1_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3708:1: ( rule__ArrayInitializer__OtherElsAssignment_2_1_1 )
            {
             before(grammarAccess.getArrayInitializerAccess().getOtherElsAssignment_2_1_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3709:1: ( rule__ArrayInitializer__OtherElsAssignment_2_1_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3709:2: rule__ArrayInitializer__OtherElsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__ArrayInitializer__OtherElsAssignment_2_1_1_in_rule__ArrayInitializer__Group_2_1__1__Impl7595);
            rule__ArrayInitializer__OtherElsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayInitializerAccess().getOtherElsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializer__Group_2_1__1__Impl"


    // $ANTLR start "rule__ArrayType__Group__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3724:1: rule__ArrayType__Group__0 : rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 ;
    public final void rule__ArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3728:1: ( rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3729:2: rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__0__Impl_in_rule__ArrayType__Group__07630);
            rule__ArrayType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__1_in_rule__ArrayType__Group__07633);
            rule__ArrayType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__0"


    // $ANTLR start "rule__ArrayType__Group__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3736:1: rule__ArrayType__Group__0__Impl : ( ( rule__ArrayType__Alternatives_0 ) ) ;
    public final void rule__ArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3740:1: ( ( ( rule__ArrayType__Alternatives_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3741:1: ( ( rule__ArrayType__Alternatives_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3741:1: ( ( rule__ArrayType__Alternatives_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3742:1: ( rule__ArrayType__Alternatives_0 )
            {
             before(grammarAccess.getArrayTypeAccess().getAlternatives_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3743:1: ( rule__ArrayType__Alternatives_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3743:2: rule__ArrayType__Alternatives_0
            {
            pushFollow(FOLLOW_rule__ArrayType__Alternatives_0_in_rule__ArrayType__Group__0__Impl7660);
            rule__ArrayType__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__0__Impl"


    // $ANTLR start "rule__ArrayType__Group__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3753:1: rule__ArrayType__Group__1 : rule__ArrayType__Group__1__Impl ;
    public final void rule__ArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3757:1: ( rule__ArrayType__Group__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3758:2: rule__ArrayType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__1__Impl_in_rule__ArrayType__Group__17690);
            rule__ArrayType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__1"


    // $ANTLR start "rule__ArrayType__Group__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3764:1: rule__ArrayType__Group__1__Impl : ( ( ( rule__ArrayType__Group_1__0 ) ) ( ( rule__ArrayType__Group_1__0 )* ) ) ;
    public final void rule__ArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3768:1: ( ( ( ( rule__ArrayType__Group_1__0 ) ) ( ( rule__ArrayType__Group_1__0 )* ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3769:1: ( ( ( rule__ArrayType__Group_1__0 ) ) ( ( rule__ArrayType__Group_1__0 )* ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3769:1: ( ( ( rule__ArrayType__Group_1__0 ) ) ( ( rule__ArrayType__Group_1__0 )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3770:1: ( ( rule__ArrayType__Group_1__0 ) ) ( ( rule__ArrayType__Group_1__0 )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3770:1: ( ( rule__ArrayType__Group_1__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3771:1: ( rule__ArrayType__Group_1__0 )
            {
             before(grammarAccess.getArrayTypeAccess().getGroup_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3772:1: ( rule__ArrayType__Group_1__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3772:2: rule__ArrayType__Group_1__0
            {
            pushFollow(FOLLOW_rule__ArrayType__Group_1__0_in_rule__ArrayType__Group__1__Impl7719);
            rule__ArrayType__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getGroup_1()); 

            }

            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3775:1: ( ( rule__ArrayType__Group_1__0 )* )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3776:1: ( rule__ArrayType__Group_1__0 )*
            {
             before(grammarAccess.getArrayTypeAccess().getGroup_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3777:1: ( rule__ArrayType__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_LBRACKET) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3777:2: rule__ArrayType__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ArrayType__Group_1__0_in_rule__ArrayType__Group__1__Impl7731);
            	    rule__ArrayType__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getArrayTypeAccess().getGroup_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__1__Impl"


    // $ANTLR start "rule__ArrayType__Group_1__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3792:1: rule__ArrayType__Group_1__0 : rule__ArrayType__Group_1__0__Impl rule__ArrayType__Group_1__1 ;
    public final void rule__ArrayType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3796:1: ( rule__ArrayType__Group_1__0__Impl rule__ArrayType__Group_1__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3797:2: rule__ArrayType__Group_1__0__Impl rule__ArrayType__Group_1__1
            {
            pushFollow(FOLLOW_rule__ArrayType__Group_1__0__Impl_in_rule__ArrayType__Group_1__07768);
            rule__ArrayType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group_1__1_in_rule__ArrayType__Group_1__07771);
            rule__ArrayType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_1__0"


    // $ANTLR start "rule__ArrayType__Group_1__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3804:1: rule__ArrayType__Group_1__0__Impl : ( RULE_LBRACKET ) ;
    public final void rule__ArrayType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3808:1: ( ( RULE_LBRACKET ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3809:1: ( RULE_LBRACKET )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3809:1: ( RULE_LBRACKET )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3810:1: RULE_LBRACKET
            {
             before(grammarAccess.getArrayTypeAccess().getLBRACKETTerminalRuleCall_1_0()); 
            match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_rule__ArrayType__Group_1__0__Impl7798); 
             after(grammarAccess.getArrayTypeAccess().getLBRACKETTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_1__0__Impl"


    // $ANTLR start "rule__ArrayType__Group_1__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3821:1: rule__ArrayType__Group_1__1 : rule__ArrayType__Group_1__1__Impl ;
    public final void rule__ArrayType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3825:1: ( rule__ArrayType__Group_1__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3826:2: rule__ArrayType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrayType__Group_1__1__Impl_in_rule__ArrayType__Group_1__17827);
            rule__ArrayType__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_1__1"


    // $ANTLR start "rule__ArrayType__Group_1__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3832:1: rule__ArrayType__Group_1__1__Impl : ( RULE_RBRACKET ) ;
    public final void rule__ArrayType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3836:1: ( ( RULE_RBRACKET ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3837:1: ( RULE_RBRACKET )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3837:1: ( RULE_RBRACKET )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3838:1: RULE_RBRACKET
            {
             before(grammarAccess.getArrayTypeAccess().getRBRACKETTerminalRuleCall_1_1()); 
            match(input,RULE_RBRACKET,FOLLOW_RULE_RBRACKET_in_rule__ArrayType__Group_1__1__Impl7854); 
             after(grammarAccess.getArrayTypeAccess().getRBRACKETTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3853:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3857:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3858:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__07887);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__07890);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3865:1: rule__QualifiedName__Group__0__Impl : ( () ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3869:1: ( ( () ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3870:1: ( () )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3870:1: ( () )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3871:1: ()
            {
             before(grammarAccess.getQualifiedNameAccess().getQualifiedNameAction_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3872:1: ()
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3874:1: 
            {
            }

             after(grammarAccess.getQualifiedNameAccess().getQualifiedNameAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3884:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl rule__QualifiedName__Group__2 ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3888:1: ( rule__QualifiedName__Group__1__Impl rule__QualifiedName__Group__2 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3889:2: rule__QualifiedName__Group__1__Impl rule__QualifiedName__Group__2
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__17948);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__2_in_rule__QualifiedName__Group__17951);
            rule__QualifiedName__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3896:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__IdentifierAssignment_1 ) ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3900:1: ( ( ( rule__QualifiedName__IdentifierAssignment_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3901:1: ( ( rule__QualifiedName__IdentifierAssignment_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3901:1: ( ( rule__QualifiedName__IdentifierAssignment_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3902:1: ( rule__QualifiedName__IdentifierAssignment_1 )
            {
             before(grammarAccess.getQualifiedNameAccess().getIdentifierAssignment_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3903:1: ( rule__QualifiedName__IdentifierAssignment_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3903:2: rule__QualifiedName__IdentifierAssignment_1
            {
            pushFollow(FOLLOW_rule__QualifiedName__IdentifierAssignment_1_in_rule__QualifiedName__Group__1__Impl7978);
            rule__QualifiedName__IdentifierAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getIdentifierAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__2"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3913:1: rule__QualifiedName__Group__2 : rule__QualifiedName__Group__2__Impl ;
    public final void rule__QualifiedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3917:1: ( rule__QualifiedName__Group__2__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3918:2: rule__QualifiedName__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__2__Impl_in_rule__QualifiedName__Group__28008);
            rule__QualifiedName__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__2"


    // $ANTLR start "rule__QualifiedName__Group__2__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3924:1: rule__QualifiedName__Group__2__Impl : ( ( rule__QualifiedName__Group_2__0 )* ) ;
    public final void rule__QualifiedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3928:1: ( ( ( rule__QualifiedName__Group_2__0 )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3929:1: ( ( rule__QualifiedName__Group_2__0 )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3929:1: ( ( rule__QualifiedName__Group_2__0 )* )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3930:1: ( rule__QualifiedName__Group_2__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_2()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3931:1: ( rule__QualifiedName__Group_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_DOT) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3931:2: rule__QualifiedName__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_2__0_in_rule__QualifiedName__Group__2__Impl8035);
            	    rule__QualifiedName__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group_2__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3947:1: rule__QualifiedName__Group_2__0 : rule__QualifiedName__Group_2__0__Impl rule__QualifiedName__Group_2__1 ;
    public final void rule__QualifiedName__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3951:1: ( rule__QualifiedName__Group_2__0__Impl rule__QualifiedName__Group_2__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3952:2: rule__QualifiedName__Group_2__0__Impl rule__QualifiedName__Group_2__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_2__0__Impl_in_rule__QualifiedName__Group_2__08072);
            rule__QualifiedName__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_2__1_in_rule__QualifiedName__Group_2__08075);
            rule__QualifiedName__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_2__0"


    // $ANTLR start "rule__QualifiedName__Group_2__0__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3959:1: rule__QualifiedName__Group_2__0__Impl : ( ( rule__QualifiedName__DotAssignment_2_0 ) ) ;
    public final void rule__QualifiedName__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3963:1: ( ( ( rule__QualifiedName__DotAssignment_2_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3964:1: ( ( rule__QualifiedName__DotAssignment_2_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3964:1: ( ( rule__QualifiedName__DotAssignment_2_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3965:1: ( rule__QualifiedName__DotAssignment_2_0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getDotAssignment_2_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3966:1: ( rule__QualifiedName__DotAssignment_2_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3966:2: rule__QualifiedName__DotAssignment_2_0
            {
            pushFollow(FOLLOW_rule__QualifiedName__DotAssignment_2_0_in_rule__QualifiedName__Group_2__0__Impl8102);
            rule__QualifiedName__DotAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getDotAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_2__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_2__1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3976:1: rule__QualifiedName__Group_2__1 : rule__QualifiedName__Group_2__1__Impl ;
    public final void rule__QualifiedName__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3980:1: ( rule__QualifiedName__Group_2__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3981:2: rule__QualifiedName__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_2__1__Impl_in_rule__QualifiedName__Group_2__18132);
            rule__QualifiedName__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_2__1"


    // $ANTLR start "rule__QualifiedName__Group_2__1__Impl"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3987:1: rule__QualifiedName__Group_2__1__Impl : ( ( rule__QualifiedName__IdentifierAssignment_2_1 ) ) ;
    public final void rule__QualifiedName__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3991:1: ( ( ( rule__QualifiedName__IdentifierAssignment_2_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3992:1: ( ( rule__QualifiedName__IdentifierAssignment_2_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3992:1: ( ( rule__QualifiedName__IdentifierAssignment_2_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3993:1: ( rule__QualifiedName__IdentifierAssignment_2_1 )
            {
             before(grammarAccess.getQualifiedNameAccess().getIdentifierAssignment_2_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3994:1: ( rule__QualifiedName__IdentifierAssignment_2_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3994:2: rule__QualifiedName__IdentifierAssignment_2_1
            {
            pushFollow(FOLLOW_rule__QualifiedName__IdentifierAssignment_2_1_in_rule__QualifiedName__Group_2__1__Impl8159);
            rule__QualifiedName__IdentifierAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getIdentifierAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_2__1__Impl"


    // $ANTLR start "rule__Expression__CondExprAssignment_1_1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4009:1: rule__Expression__CondExprAssignment_1_1 : ( ruleConditionalExpression ) ;
    public final void rule__Expression__CondExprAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4013:1: ( ( ruleConditionalExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4014:1: ( ruleConditionalExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4014:1: ( ruleConditionalExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4015:1: ruleConditionalExpression
            {
             before(grammarAccess.getExpressionAccess().getCondExprConditionalExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleConditionalExpression_in_rule__Expression__CondExprAssignment_1_18198);
            ruleConditionalExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getCondExprConditionalExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__CondExprAssignment_1_1"


    // $ANTLR start "rule__MethodInvocation__FullyQualifiedMethodNameAssignment_0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4024:1: rule__MethodInvocation__FullyQualifiedMethodNameAssignment_0 : ( ruleMethodName ) ;
    public final void rule__MethodInvocation__FullyQualifiedMethodNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4028:1: ( ( ruleMethodName ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4029:1: ( ruleMethodName )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4029:1: ( ruleMethodName )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4030:1: ruleMethodName
            {
             before(grammarAccess.getMethodInvocationAccess().getFullyQualifiedMethodNameMethodNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMethodName_in_rule__MethodInvocation__FullyQualifiedMethodNameAssignment_08229);
            ruleMethodName();

            state._fsp--;

             after(grammarAccess.getMethodInvocationAccess().getFullyQualifiedMethodNameMethodNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodInvocation__FullyQualifiedMethodNameAssignment_0"


    // $ANTLR start "rule__MethodInvocation__ArgsAssignment_1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4039:1: rule__MethodInvocation__ArgsAssignment_1 : ( ruleArguments ) ;
    public final void rule__MethodInvocation__ArgsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4043:1: ( ( ruleArguments ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4044:1: ( ruleArguments )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4044:1: ( ruleArguments )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4045:1: ruleArguments
            {
             before(grammarAccess.getMethodInvocationAccess().getArgsArgumentsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleArguments_in_rule__MethodInvocation__ArgsAssignment_18260);
            ruleArguments();

            state._fsp--;

             after(grammarAccess.getMethodInvocationAccess().getArgsArgumentsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodInvocation__ArgsAssignment_1"


    // $ANTLR start "rule__MethodName__PrefixQMNAssignment_0_0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4054:1: rule__MethodName__PrefixQMNAssignment_0_0 : ( RULE_IDENTIFIER ) ;
    public final void rule__MethodName__PrefixQMNAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4058:1: ( ( RULE_IDENTIFIER ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4059:1: ( RULE_IDENTIFIER )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4059:1: ( RULE_IDENTIFIER )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4060:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getMethodNameAccess().getPrefixQMNIDENTIFIERTerminalRuleCall_0_0_0()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__MethodName__PrefixQMNAssignment_0_08291); 
             after(grammarAccess.getMethodNameAccess().getPrefixQMNIDENTIFIERTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodName__PrefixQMNAssignment_0_0"


    // $ANTLR start "rule__MethodName__DotsAssignment_0_1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4069:1: rule__MethodName__DotsAssignment_0_1 : ( RULE_DOT ) ;
    public final void rule__MethodName__DotsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4073:1: ( ( RULE_DOT ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4074:1: ( RULE_DOT )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4074:1: ( RULE_DOT )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4075:1: RULE_DOT
            {
             before(grammarAccess.getMethodNameAccess().getDotsDOTTerminalRuleCall_0_1_0()); 
            match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rule__MethodName__DotsAssignment_0_18322); 
             after(grammarAccess.getMethodNameAccess().getDotsDOTTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodName__DotsAssignment_0_1"


    // $ANTLR start "rule__MethodName__MethodNameAssignment_1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4084:1: rule__MethodName__MethodNameAssignment_1 : ( RULE_IDENTIFIER ) ;
    public final void rule__MethodName__MethodNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4088:1: ( ( RULE_IDENTIFIER ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4089:1: ( RULE_IDENTIFIER )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4089:1: ( RULE_IDENTIFIER )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4090:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getMethodNameAccess().getMethodNameIDENTIFIERTerminalRuleCall_1_0()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__MethodName__MethodNameAssignment_18353); 
             after(grammarAccess.getMethodNameAccess().getMethodNameIDENTIFIERTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodName__MethodNameAssignment_1"


    // $ANTLR start "rule__BaseJRExpr__FieldTokenAssignment_0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4099:1: rule__BaseJRExpr__FieldTokenAssignment_0 : ( RULE_FIELDTOKEN ) ;
    public final void rule__BaseJRExpr__FieldTokenAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4103:1: ( ( RULE_FIELDTOKEN ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4104:1: ( RULE_FIELDTOKEN )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4104:1: ( RULE_FIELDTOKEN )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4105:1: RULE_FIELDTOKEN
            {
             before(grammarAccess.getBaseJRExprAccess().getFieldTokenFieldTokenTerminalRuleCall_0_0()); 
            match(input,RULE_FIELDTOKEN,FOLLOW_RULE_FIELDTOKEN_in_rule__BaseJRExpr__FieldTokenAssignment_08384); 
             after(grammarAccess.getBaseJRExprAccess().getFieldTokenFieldTokenTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseJRExpr__FieldTokenAssignment_0"


    // $ANTLR start "rule__BaseJRExpr__ParameterTokenAssignment_1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4114:1: rule__BaseJRExpr__ParameterTokenAssignment_1 : ( RULE_PARAMETERTOKEN ) ;
    public final void rule__BaseJRExpr__ParameterTokenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4118:1: ( ( RULE_PARAMETERTOKEN ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4119:1: ( RULE_PARAMETERTOKEN )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4119:1: ( RULE_PARAMETERTOKEN )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4120:1: RULE_PARAMETERTOKEN
            {
             before(grammarAccess.getBaseJRExprAccess().getParameterTokenParameterTokenTerminalRuleCall_1_0()); 
            match(input,RULE_PARAMETERTOKEN,FOLLOW_RULE_PARAMETERTOKEN_in_rule__BaseJRExpr__ParameterTokenAssignment_18415); 
             after(grammarAccess.getBaseJRExprAccess().getParameterTokenParameterTokenTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseJRExpr__ParameterTokenAssignment_1"


    // $ANTLR start "rule__BaseJRExpr__VariableTokenAssignment_2"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4129:1: rule__BaseJRExpr__VariableTokenAssignment_2 : ( RULE_VARIABLETOKEN ) ;
    public final void rule__BaseJRExpr__VariableTokenAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4133:1: ( ( RULE_VARIABLETOKEN ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4134:1: ( RULE_VARIABLETOKEN )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4134:1: ( RULE_VARIABLETOKEN )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4135:1: RULE_VARIABLETOKEN
            {
             before(grammarAccess.getBaseJRExprAccess().getVariableTokenVariableTokenTerminalRuleCall_2_0()); 
            match(input,RULE_VARIABLETOKEN,FOLLOW_RULE_VARIABLETOKEN_in_rule__BaseJRExpr__VariableTokenAssignment_28446); 
             after(grammarAccess.getBaseJRExprAccess().getVariableTokenVariableTokenTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseJRExpr__VariableTokenAssignment_2"


    // $ANTLR start "rule__Arguments__LeftPAssignment_0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4144:1: rule__Arguments__LeftPAssignment_0 : ( RULE_LPAREN ) ;
    public final void rule__Arguments__LeftPAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4148:1: ( ( RULE_LPAREN ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4149:1: ( RULE_LPAREN )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4149:1: ( RULE_LPAREN )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4150:1: RULE_LPAREN
            {
             before(grammarAccess.getArgumentsAccess().getLeftPLPARENTerminalRuleCall_0_0()); 
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rule__Arguments__LeftPAssignment_08477); 
             after(grammarAccess.getArgumentsAccess().getLeftPLPARENTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__LeftPAssignment_0"


    // $ANTLR start "rule__Arguments__ExprLstAssignment_1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4159:1: rule__Arguments__ExprLstAssignment_1 : ( ruleExpressionList ) ;
    public final void rule__Arguments__ExprLstAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4163:1: ( ( ruleExpressionList ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4164:1: ( ruleExpressionList )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4164:1: ( ruleExpressionList )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4165:1: ruleExpressionList
            {
             before(grammarAccess.getArgumentsAccess().getExprLstExpressionListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpressionList_in_rule__Arguments__ExprLstAssignment_18508);
            ruleExpressionList();

            state._fsp--;

             after(grammarAccess.getArgumentsAccess().getExprLstExpressionListParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__ExprLstAssignment_1"


    // $ANTLR start "rule__Arguments__RightPAssignment_2"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4174:1: rule__Arguments__RightPAssignment_2 : ( RULE_RPAREN ) ;
    public final void rule__Arguments__RightPAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4178:1: ( ( RULE_RPAREN ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4179:1: ( RULE_RPAREN )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4179:1: ( RULE_RPAREN )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4180:1: RULE_RPAREN
            {
             before(grammarAccess.getArgumentsAccess().getRightPRPARENTerminalRuleCall_2_0()); 
            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rule__Arguments__RightPAssignment_28539); 
             after(grammarAccess.getArgumentsAccess().getRightPRPARENTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arguments__RightPAssignment_2"


    // $ANTLR start "rule__ExpressionList__ExpressionsAssignment_0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4189:1: rule__ExpressionList__ExpressionsAssignment_0 : ( ruleExpression ) ;
    public final void rule__ExpressionList__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4193:1: ( ( ruleExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4194:1: ( ruleExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4194:1: ( ruleExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4195:1: ruleExpression
            {
             before(grammarAccess.getExpressionListAccess().getExpressionsExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ExpressionList__ExpressionsAssignment_08570);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionListAccess().getExpressionsExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__ExpressionsAssignment_0"


    // $ANTLR start "rule__ExpressionList__CommasAssignment_1_0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4204:1: rule__ExpressionList__CommasAssignment_1_0 : ( RULE_COMMA ) ;
    public final void rule__ExpressionList__CommasAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4208:1: ( ( RULE_COMMA ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4209:1: ( RULE_COMMA )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4209:1: ( RULE_COMMA )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4210:1: RULE_COMMA
            {
             before(grammarAccess.getExpressionListAccess().getCommasCOMMATerminalRuleCall_1_0_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__ExpressionList__CommasAssignment_1_08601); 
             after(grammarAccess.getExpressionListAccess().getCommasCOMMATerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__CommasAssignment_1_0"


    // $ANTLR start "rule__ExpressionList__ExpressionsAssignment_1_1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4219:1: rule__ExpressionList__ExpressionsAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__ExpressionList__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4223:1: ( ( ruleExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4224:1: ( ruleExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4224:1: ( ruleExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4225:1: ruleExpression
            {
             before(grammarAccess.getExpressionListAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ExpressionList__ExpressionsAssignment_1_18632);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionListAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionList__ExpressionsAssignment_1_1"


    // $ANTLR start "rule__BaseCommonExpression__BasejrexprAssignment_0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4234:1: rule__BaseCommonExpression__BasejrexprAssignment_0 : ( ruleBaseJRExpr ) ;
    public final void rule__BaseCommonExpression__BasejrexprAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4238:1: ( ( ruleBaseJRExpr ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4239:1: ( ruleBaseJRExpr )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4239:1: ( ruleBaseJRExpr )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4240:1: ruleBaseJRExpr
            {
             before(grammarAccess.getBaseCommonExpressionAccess().getBasejrexprBaseJRExprParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBaseJRExpr_in_rule__BaseCommonExpression__BasejrexprAssignment_08663);
            ruleBaseJRExpr();

            state._fsp--;

             after(grammarAccess.getBaseCommonExpressionAccess().getBasejrexprBaseJRExprParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseCommonExpression__BasejrexprAssignment_0"


    // $ANTLR start "rule__BaseCommonExpression__LiteralAssignment_1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4249:1: rule__BaseCommonExpression__LiteralAssignment_1 : ( ruleLiteral ) ;
    public final void rule__BaseCommonExpression__LiteralAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4253:1: ( ( ruleLiteral ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4254:1: ( ruleLiteral )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4254:1: ( ruleLiteral )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4255:1: ruleLiteral
            {
             before(grammarAccess.getBaseCommonExpressionAccess().getLiteralLiteralParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__BaseCommonExpression__LiteralAssignment_18694);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getBaseCommonExpressionAccess().getLiteralLiteralParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseCommonExpression__LiteralAssignment_1"


    // $ANTLR start "rule__Cast__LparAssignment_0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4264:1: rule__Cast__LparAssignment_0 : ( RULE_LPAREN ) ;
    public final void rule__Cast__LparAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4268:1: ( ( RULE_LPAREN ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4269:1: ( RULE_LPAREN )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4269:1: ( RULE_LPAREN )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4270:1: RULE_LPAREN
            {
             before(grammarAccess.getCastAccess().getLparLPARENTerminalRuleCall_0_0()); 
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rule__Cast__LparAssignment_08725); 
             after(grammarAccess.getCastAccess().getLparLPARENTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cast__LparAssignment_0"


    // $ANTLR start "rule__Cast__PtypeAssignment_1_0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4279:1: rule__Cast__PtypeAssignment_1_0 : ( rulePrimitiveType ) ;
    public final void rule__Cast__PtypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4283:1: ( ( rulePrimitiveType ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4284:1: ( rulePrimitiveType )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4284:1: ( rulePrimitiveType )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4285:1: rulePrimitiveType
            {
             before(grammarAccess.getCastAccess().getPtypePrimitiveTypeParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_rule__Cast__PtypeAssignment_1_08756);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getCastAccess().getPtypePrimitiveTypeParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cast__PtypeAssignment_1_0"


    // $ANTLR start "rule__Cast__ArrtypeAssignment_1_1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4294:1: rule__Cast__ArrtypeAssignment_1_1 : ( ruleArrayType ) ;
    public final void rule__Cast__ArrtypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4298:1: ( ( ruleArrayType ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4299:1: ( ruleArrayType )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4299:1: ( ruleArrayType )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4300:1: ruleArrayType
            {
             before(grammarAccess.getCastAccess().getArrtypeArrayTypeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleArrayType_in_rule__Cast__ArrtypeAssignment_1_18787);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getCastAccess().getArrtypeArrayTypeParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cast__ArrtypeAssignment_1_1"


    // $ANTLR start "rule__Cast__ClazztypeAssignment_1_2"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4309:1: rule__Cast__ClazztypeAssignment_1_2 : ( ruleClassOrInterfaceType ) ;
    public final void rule__Cast__ClazztypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4313:1: ( ( ruleClassOrInterfaceType ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4314:1: ( ruleClassOrInterfaceType )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4314:1: ( ruleClassOrInterfaceType )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4315:1: ruleClassOrInterfaceType
            {
             before(grammarAccess.getCastAccess().getClazztypeClassOrInterfaceTypeParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleClassOrInterfaceType_in_rule__Cast__ClazztypeAssignment_1_28818);
            ruleClassOrInterfaceType();

            state._fsp--;

             after(grammarAccess.getCastAccess().getClazztypeClassOrInterfaceTypeParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cast__ClazztypeAssignment_1_2"


    // $ANTLR start "rule__Cast__RparAssignment_2"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4324:1: rule__Cast__RparAssignment_2 : ( RULE_RPAREN ) ;
    public final void rule__Cast__RparAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4328:1: ( ( RULE_RPAREN ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4329:1: ( RULE_RPAREN )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4329:1: ( RULE_RPAREN )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4330:1: RULE_RPAREN
            {
             before(grammarAccess.getCastAccess().getRparRPARENTerminalRuleCall_2_0()); 
            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rule__Cast__RparAssignment_28849); 
             after(grammarAccess.getCastAccess().getRparRPARENTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cast__RparAssignment_2"


    // $ANTLR start "rule__ConditionalExpression__OkReturnedExprAssignment_1_1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4339:1: rule__ConditionalExpression__OkReturnedExprAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__ConditionalExpression__OkReturnedExprAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4343:1: ( ( ruleExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4344:1: ( ruleExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4344:1: ( ruleExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4345:1: ruleExpression
            {
             before(grammarAccess.getConditionalExpressionAccess().getOkReturnedExprExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ConditionalExpression__OkReturnedExprAssignment_1_18880);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getConditionalExpressionAccess().getOkReturnedExprExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__OkReturnedExprAssignment_1_1"


    // $ANTLR start "rule__ConditionalExpression__KoReturnedExprAssignment_1_3"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4354:1: rule__ConditionalExpression__KoReturnedExprAssignment_1_3 : ( ruleExpression ) ;
    public final void rule__ConditionalExpression__KoReturnedExprAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4358:1: ( ( ruleExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4359:1: ( ruleExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4359:1: ( ruleExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4360:1: ruleExpression
            {
             before(grammarAccess.getConditionalExpressionAccess().getKoReturnedExprExpressionParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ConditionalExpression__KoReturnedExprAssignment_1_38911);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getConditionalExpressionAccess().getKoReturnedExprExpressionParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionalExpression__KoReturnedExprAssignment_1_3"


    // $ANTLR start "rule__OrExpression__AndExpAssignment_0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4369:1: rule__OrExpression__AndExpAssignment_0 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__AndExpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4373:1: ( ( ruleAndExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4374:1: ( ruleAndExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4374:1: ( ruleAndExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4375:1: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getAndExpAndExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAndExpression_in_rule__OrExpression__AndExpAssignment_08942);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getAndExpAndExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__AndExpAssignment_0"


    // $ANTLR start "rule__OrExpression__AndExpAssignment_1_1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4384:1: rule__OrExpression__AndExpAssignment_1_1 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__AndExpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4388:1: ( ( ruleAndExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4389:1: ( ruleAndExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4389:1: ( ruleAndExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4390:1: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getAndExpAndExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAndExpression_in_rule__OrExpression__AndExpAssignment_1_18973);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getAndExpAndExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__AndExpAssignment_1_1"


    // $ANTLR start "rule__AndExpression__PrimaryCondAssignment_0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4399:1: rule__AndExpression__PrimaryCondAssignment_0 : ( rulePrimaryCondExpression ) ;
    public final void rule__AndExpression__PrimaryCondAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4403:1: ( ( rulePrimaryCondExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4404:1: ( rulePrimaryCondExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4404:1: ( rulePrimaryCondExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4405:1: rulePrimaryCondExpression
            {
             before(grammarAccess.getAndExpressionAccess().getPrimaryCondPrimaryCondExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePrimaryCondExpression_in_rule__AndExpression__PrimaryCondAssignment_09004);
            rulePrimaryCondExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getPrimaryCondPrimaryCondExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__PrimaryCondAssignment_0"


    // $ANTLR start "rule__AndExpression__PrimaryCondAssignment_1_1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4414:1: rule__AndExpression__PrimaryCondAssignment_1_1 : ( rulePrimaryCondExpression ) ;
    public final void rule__AndExpression__PrimaryCondAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4418:1: ( ( rulePrimaryCondExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4419:1: ( rulePrimaryCondExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4419:1: ( rulePrimaryCondExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4420:1: rulePrimaryCondExpression
            {
             before(grammarAccess.getAndExpressionAccess().getPrimaryCondPrimaryCondExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulePrimaryCondExpression_in_rule__AndExpression__PrimaryCondAssignment_1_19035);
            rulePrimaryCondExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getPrimaryCondPrimaryCondExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__PrimaryCondAssignment_1_1"


    // $ANTLR start "rule__PrimaryCondExpression__ExprAssignment"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4429:1: rule__PrimaryCondExpression__ExprAssignment : ( ruleBaseBooleanExpr ) ;
    public final void rule__PrimaryCondExpression__ExprAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4433:1: ( ( ruleBaseBooleanExpr ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4434:1: ( ruleBaseBooleanExpr )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4434:1: ( ruleBaseBooleanExpr )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4435:1: ruleBaseBooleanExpr
            {
             before(grammarAccess.getPrimaryCondExpressionAccess().getExprBaseBooleanExprParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBaseBooleanExpr_in_rule__PrimaryCondExpression__ExprAssignment9066);
            ruleBaseBooleanExpr();

            state._fsp--;

             after(grammarAccess.getPrimaryCondExpressionAccess().getExprBaseBooleanExprParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryCondExpression__ExprAssignment"


    // $ANTLR start "rule__EqualityExpression__InstanceofAssignment_0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4444:1: rule__EqualityExpression__InstanceofAssignment_0 : ( ruleInstanceOfExpression ) ;
    public final void rule__EqualityExpression__InstanceofAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4448:1: ( ( ruleInstanceOfExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4449:1: ( ruleInstanceOfExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4449:1: ( ruleInstanceOfExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4450:1: ruleInstanceOfExpression
            {
             before(grammarAccess.getEqualityExpressionAccess().getInstanceofInstanceOfExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleInstanceOfExpression_in_rule__EqualityExpression__InstanceofAssignment_09097);
            ruleInstanceOfExpression();

            state._fsp--;

             after(grammarAccess.getEqualityExpressionAccess().getInstanceofInstanceOfExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__InstanceofAssignment_0"


    // $ANTLR start "rule__EqualityExpression__InstanceofAssignment_1_1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4459:1: rule__EqualityExpression__InstanceofAssignment_1_1 : ( ruleInstanceOfExpression ) ;
    public final void rule__EqualityExpression__InstanceofAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4463:1: ( ( ruleInstanceOfExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4464:1: ( ruleInstanceOfExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4464:1: ( ruleInstanceOfExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4465:1: ruleInstanceOfExpression
            {
             before(grammarAccess.getEqualityExpressionAccess().getInstanceofInstanceOfExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleInstanceOfExpression_in_rule__EqualityExpression__InstanceofAssignment_1_19128);
            ruleInstanceOfExpression();

            state._fsp--;

             after(grammarAccess.getEqualityExpressionAccess().getInstanceofInstanceOfExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__InstanceofAssignment_1_1"


    // $ANTLR start "rule__RelationalExpression__RelAssignment_0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4474:1: rule__RelationalExpression__RelAssignment_0 : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__RelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4478:1: ( ( ruleAdditiveExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4479:1: ( ruleAdditiveExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4479:1: ( ruleAdditiveExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4480:1: ruleAdditiveExpression
            {
             before(grammarAccess.getRelationalExpressionAccess().getRelAdditiveExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAdditiveExpression_in_rule__RelationalExpression__RelAssignment_09159);
            ruleAdditiveExpression();

            state._fsp--;

             after(grammarAccess.getRelationalExpressionAccess().getRelAdditiveExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__RelAssignment_0"


    // $ANTLR start "rule__RelationalExpression__RelAssignment_1_1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4489:1: rule__RelationalExpression__RelAssignment_1_1 : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__RelAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4493:1: ( ( ruleAdditiveExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4494:1: ( ruleAdditiveExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4494:1: ( ruleAdditiveExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4495:1: ruleAdditiveExpression
            {
             before(grammarAccess.getRelationalExpressionAccess().getRelAdditiveExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAdditiveExpression_in_rule__RelationalExpression__RelAssignment_1_19190);
            ruleAdditiveExpression();

            state._fsp--;

             after(grammarAccess.getRelationalExpressionAccess().getRelAdditiveExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__RelAssignment_1_1"


    // $ANTLR start "rule__InstanceOfExpression__ElAssignment_0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4504:1: rule__InstanceOfExpression__ElAssignment_0 : ( ruleRelationalExpression ) ;
    public final void rule__InstanceOfExpression__ElAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4508:1: ( ( ruleRelationalExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4509:1: ( ruleRelationalExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4509:1: ( ruleRelationalExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4510:1: ruleRelationalExpression
            {
             before(grammarAccess.getInstanceOfExpressionAccess().getElRelationalExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleRelationalExpression_in_rule__InstanceOfExpression__ElAssignment_09221);
            ruleRelationalExpression();

            state._fsp--;

             after(grammarAccess.getInstanceOfExpressionAccess().getElRelationalExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceOfExpression__ElAssignment_0"


    // $ANTLR start "rule__InstanceOfExpression__TargetAssignment_1_1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4519:1: rule__InstanceOfExpression__TargetAssignment_1_1 : ( ( rule__InstanceOfExpression__TargetAlternatives_1_1_0 ) ) ;
    public final void rule__InstanceOfExpression__TargetAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4523:1: ( ( ( rule__InstanceOfExpression__TargetAlternatives_1_1_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4524:1: ( ( rule__InstanceOfExpression__TargetAlternatives_1_1_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4524:1: ( ( rule__InstanceOfExpression__TargetAlternatives_1_1_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4525:1: ( rule__InstanceOfExpression__TargetAlternatives_1_1_0 )
            {
             before(grammarAccess.getInstanceOfExpressionAccess().getTargetAlternatives_1_1_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4526:1: ( rule__InstanceOfExpression__TargetAlternatives_1_1_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4526:2: rule__InstanceOfExpression__TargetAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__InstanceOfExpression__TargetAlternatives_1_1_0_in_rule__InstanceOfExpression__TargetAssignment_1_19252);
            rule__InstanceOfExpression__TargetAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getInstanceOfExpressionAccess().getTargetAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceOfExpression__TargetAssignment_1_1"


    // $ANTLR start "rule__AdditiveExpression__MultExprAssignment_0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4535:1: rule__AdditiveExpression__MultExprAssignment_0 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__MultExprAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4539:1: ( ( ruleMultiplicativeExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4540:1: ( ruleMultiplicativeExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4540:1: ( ruleMultiplicativeExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4541:1: ruleMultiplicativeExpression
            {
             before(grammarAccess.getAdditiveExpressionAccess().getMultExprMultiplicativeExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_rule__AdditiveExpression__MultExprAssignment_09285);
            ruleMultiplicativeExpression();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionAccess().getMultExprMultiplicativeExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__MultExprAssignment_0"


    // $ANTLR start "rule__AdditiveExpression__MultExprAssignment_1_1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4550:1: rule__AdditiveExpression__MultExprAssignment_1_1 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__MultExprAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4554:1: ( ( ruleMultiplicativeExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4555:1: ( ruleMultiplicativeExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4555:1: ( ruleMultiplicativeExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4556:1: ruleMultiplicativeExpression
            {
             before(grammarAccess.getAdditiveExpressionAccess().getMultExprMultiplicativeExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_rule__AdditiveExpression__MultExprAssignment_1_19316);
            ruleMultiplicativeExpression();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionAccess().getMultExprMultiplicativeExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__MultExprAssignment_1_1"


    // $ANTLR start "rule__MultiplicativeExpression__BaseExprAssignment_0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4565:1: rule__MultiplicativeExpression__BaseExprAssignment_0 : ( ruleBaseCommonExpression ) ;
    public final void rule__MultiplicativeExpression__BaseExprAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4569:1: ( ( ruleBaseCommonExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4570:1: ( ruleBaseCommonExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4570:1: ( ruleBaseCommonExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4571:1: ruleBaseCommonExpression
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getBaseExprBaseCommonExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBaseCommonExpression_in_rule__MultiplicativeExpression__BaseExprAssignment_09347);
            ruleBaseCommonExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionAccess().getBaseExprBaseCommonExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__BaseExprAssignment_0"


    // $ANTLR start "rule__MultiplicativeExpression__MethodsAssignment_1_1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4580:1: rule__MultiplicativeExpression__MethodsAssignment_1_1 : ( ruleMethodInvocation ) ;
    public final void rule__MultiplicativeExpression__MethodsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4584:1: ( ( ruleMethodInvocation ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4585:1: ( ruleMethodInvocation )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4585:1: ( ruleMethodInvocation )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4586:1: ruleMethodInvocation
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getMethodsMethodInvocationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMethodInvocation_in_rule__MultiplicativeExpression__MethodsAssignment_1_19378);
            ruleMethodInvocation();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionAccess().getMethodsMethodInvocationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__MethodsAssignment_1_1"


    // $ANTLR start "rule__MultiplicativeExpression__BaseExprAssignment_2_1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4595:1: rule__MultiplicativeExpression__BaseExprAssignment_2_1 : ( ruleBaseCommonExpression ) ;
    public final void rule__MultiplicativeExpression__BaseExprAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4599:1: ( ( ruleBaseCommonExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4600:1: ( ruleBaseCommonExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4600:1: ( ruleBaseCommonExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4601:1: ruleBaseCommonExpression
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getBaseExprBaseCommonExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleBaseCommonExpression_in_rule__MultiplicativeExpression__BaseExprAssignment_2_19409);
            ruleBaseCommonExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionAccess().getBaseExprBaseCommonExpressionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__BaseExprAssignment_2_1"


    // $ANTLR start "rule__MultiplicativeExpression__MethodsAssignment_2_2_1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4610:1: rule__MultiplicativeExpression__MethodsAssignment_2_2_1 : ( ruleMethodInvocation ) ;
    public final void rule__MultiplicativeExpression__MethodsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4614:1: ( ( ruleMethodInvocation ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4615:1: ( ruleMethodInvocation )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4615:1: ( ruleMethodInvocation )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4616:1: ruleMethodInvocation
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getMethodsMethodInvocationParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleMethodInvocation_in_rule__MultiplicativeExpression__MethodsAssignment_2_2_19440);
            ruleMethodInvocation();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionAccess().getMethodsMethodInvocationParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__MethodsAssignment_2_2_1"


    // $ANTLR start "rule__ClassCreator__ClazzAssignment_1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4625:1: rule__ClassCreator__ClazzAssignment_1 : ( ruleClassOrInterfaceType ) ;
    public final void rule__ClassCreator__ClazzAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4629:1: ( ( ruleClassOrInterfaceType ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4630:1: ( ruleClassOrInterfaceType )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4630:1: ( ruleClassOrInterfaceType )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4631:1: ruleClassOrInterfaceType
            {
             before(grammarAccess.getClassCreatorAccess().getClazzClassOrInterfaceTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleClassOrInterfaceType_in_rule__ClassCreator__ClazzAssignment_19471);
            ruleClassOrInterfaceType();

            state._fsp--;

             after(grammarAccess.getClassCreatorAccess().getClazzClassOrInterfaceTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassCreator__ClazzAssignment_1"


    // $ANTLR start "rule__ClassCreator__ArgsAssignment_2"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4640:1: rule__ClassCreator__ArgsAssignment_2 : ( ruleArguments ) ;
    public final void rule__ClassCreator__ArgsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4644:1: ( ( ruleArguments ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4645:1: ( ruleArguments )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4645:1: ( ruleArguments )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4646:1: ruleArguments
            {
             before(grammarAccess.getClassCreatorAccess().getArgsArgumentsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleArguments_in_rule__ClassCreator__ArgsAssignment_29502);
            ruleArguments();

            state._fsp--;

             after(grammarAccess.getClassCreatorAccess().getArgsArgumentsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassCreator__ArgsAssignment_2"


    // $ANTLR start "rule__ArrayCreator__TypeAssignment_1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4655:1: rule__ArrayCreator__TypeAssignment_1 : ( ruleArrayType ) ;
    public final void rule__ArrayCreator__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4659:1: ( ( ruleArrayType ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4660:1: ( ruleArrayType )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4660:1: ( ruleArrayType )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4661:1: ruleArrayType
            {
             before(grammarAccess.getArrayCreatorAccess().getTypeArrayTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleArrayType_in_rule__ArrayCreator__TypeAssignment_19533);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getArrayCreatorAccess().getTypeArrayTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayCreator__TypeAssignment_1"


    // $ANTLR start "rule__ArrayCreator__ArrayInitializerAssignment_2"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4670:1: rule__ArrayCreator__ArrayInitializerAssignment_2 : ( ruleArrayInitializer ) ;
    public final void rule__ArrayCreator__ArrayInitializerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4674:1: ( ( ruleArrayInitializer ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4675:1: ( ruleArrayInitializer )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4675:1: ( ruleArrayInitializer )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4676:1: ruleArrayInitializer
            {
             before(grammarAccess.getArrayCreatorAccess().getArrayInitializerArrayInitializerParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleArrayInitializer_in_rule__ArrayCreator__ArrayInitializerAssignment_29564);
            ruleArrayInitializer();

            state._fsp--;

             after(grammarAccess.getArrayCreatorAccess().getArrayInitializerArrayInitializerParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayCreator__ArrayInitializerAssignment_2"


    // $ANTLR start "rule__ArrayInitializer__FirstElAssignment_2_0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4685:1: rule__ArrayInitializer__FirstElAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__ArrayInitializer__FirstElAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4689:1: ( ( ruleExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4690:1: ( ruleExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4690:1: ( ruleExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4691:1: ruleExpression
            {
             before(grammarAccess.getArrayInitializerAccess().getFirstElExpressionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ArrayInitializer__FirstElAssignment_2_09595);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getArrayInitializerAccess().getFirstElExpressionParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializer__FirstElAssignment_2_0"


    // $ANTLR start "rule__ArrayInitializer__OtherElsAssignment_2_1_1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4700:1: rule__ArrayInitializer__OtherElsAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__ArrayInitializer__OtherElsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4704:1: ( ( ruleExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4705:1: ( ruleExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4705:1: ( ruleExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4706:1: ruleExpression
            {
             before(grammarAccess.getArrayInitializerAccess().getOtherElsExpressionParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ArrayInitializer__OtherElsAssignment_2_1_19626);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getArrayInitializerAccess().getOtherElsExpressionParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializer__OtherElsAssignment_2_1_1"


    // $ANTLR start "rule__ArrayType__ClazzInterfAssignment_0_0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4716:1: rule__ArrayType__ClazzInterfAssignment_0_0 : ( ruleClassOrInterfaceType ) ;
    public final void rule__ArrayType__ClazzInterfAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4720:1: ( ( ruleClassOrInterfaceType ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4721:1: ( ruleClassOrInterfaceType )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4721:1: ( ruleClassOrInterfaceType )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4722:1: ruleClassOrInterfaceType
            {
             before(grammarAccess.getArrayTypeAccess().getClazzInterfClassOrInterfaceTypeParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleClassOrInterfaceType_in_rule__ArrayType__ClazzInterfAssignment_0_09658);
            ruleClassOrInterfaceType();

            state._fsp--;

             after(grammarAccess.getArrayTypeAccess().getClazzInterfClassOrInterfaceTypeParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__ClazzInterfAssignment_0_0"


    // $ANTLR start "rule__ArrayType__PrimtypeAssignment_0_1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4731:1: rule__ArrayType__PrimtypeAssignment_0_1 : ( rulePrimitiveType ) ;
    public final void rule__ArrayType__PrimtypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4735:1: ( ( rulePrimitiveType ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4736:1: ( rulePrimitiveType )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4736:1: ( rulePrimitiveType )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4737:1: rulePrimitiveType
            {
             before(grammarAccess.getArrayTypeAccess().getPrimtypePrimitiveTypeParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_rule__ArrayType__PrimtypeAssignment_0_19689);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getArrayTypeAccess().getPrimtypePrimitiveTypeParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__PrimtypeAssignment_0_1"


    // $ANTLR start "rule__ClassOrInterfaceType__QualifiedNameAssignment"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4746:1: rule__ClassOrInterfaceType__QualifiedNameAssignment : ( ruleQualifiedName ) ;
    public final void rule__ClassOrInterfaceType__QualifiedNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4750:1: ( ( ruleQualifiedName ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4751:1: ( ruleQualifiedName )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4751:1: ( ruleQualifiedName )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4752:1: ruleQualifiedName
            {
             before(grammarAccess.getClassOrInterfaceTypeAccess().getQualifiedNameQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ClassOrInterfaceType__QualifiedNameAssignment9720);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getClassOrInterfaceTypeAccess().getQualifiedNameQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassOrInterfaceType__QualifiedNameAssignment"


    // $ANTLR start "rule__QualifiedName__IdentifierAssignment_1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4761:1: rule__QualifiedName__IdentifierAssignment_1 : ( RULE_IDENTIFIER ) ;
    public final void rule__QualifiedName__IdentifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4765:1: ( ( RULE_IDENTIFIER ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4766:1: ( RULE_IDENTIFIER )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4766:1: ( RULE_IDENTIFIER )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4767:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getQualifiedNameAccess().getIdentifierIDENTIFIERTerminalRuleCall_1_0()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__QualifiedName__IdentifierAssignment_19751); 
             after(grammarAccess.getQualifiedNameAccess().getIdentifierIDENTIFIERTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__IdentifierAssignment_1"


    // $ANTLR start "rule__QualifiedName__DotAssignment_2_0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4776:1: rule__QualifiedName__DotAssignment_2_0 : ( RULE_DOT ) ;
    public final void rule__QualifiedName__DotAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4780:1: ( ( RULE_DOT ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4781:1: ( RULE_DOT )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4781:1: ( RULE_DOT )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4782:1: RULE_DOT
            {
             before(grammarAccess.getQualifiedNameAccess().getDotDOTTerminalRuleCall_2_0_0()); 
            match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rule__QualifiedName__DotAssignment_2_09782); 
             after(grammarAccess.getQualifiedNameAccess().getDotDOTTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__DotAssignment_2_0"


    // $ANTLR start "rule__QualifiedName__IdentifierAssignment_2_1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4791:1: rule__QualifiedName__IdentifierAssignment_2_1 : ( RULE_IDENTIFIER ) ;
    public final void rule__QualifiedName__IdentifierAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4795:1: ( ( RULE_IDENTIFIER ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4796:1: ( RULE_IDENTIFIER )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4796:1: ( RULE_IDENTIFIER )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4797:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getQualifiedNameAccess().getIdentifierIDENTIFIERTerminalRuleCall_2_1_0()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__QualifiedName__IdentifierAssignment_2_19813); 
             after(grammarAccess.getQualifiedNameAccess().getIdentifierIDENTIFIERTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__IdentifierAssignment_2_1"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA4_eotS =
        "\17\uffff";
    static final String DFA4_eofS =
        "\17\uffff";
    static final String DFA4_minS =
        "\1\36\11\24\2\uffff\1\36\1\uffff\1\24";
    static final String DFA4_maxS =
        "\1\76\11\34\2\uffff\1\36\1\uffff\1\34";
    static final String DFA4_acceptS =
        "\12\uffff\1\2\1\1\1\uffff\1\3\1\uffff";
    static final String DFA4_specialS =
        "\17\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\11\30\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10",
            "\1\13\7\uffff\1\12",
            "\1\13\7\uffff\1\12",
            "\1\13\7\uffff\1\12",
            "\1\13\7\uffff\1\12",
            "\1\13\7\uffff\1\12",
            "\1\13\7\uffff\1\12",
            "\1\13\7\uffff\1\12",
            "\1\13\7\uffff\1\12",
            "\1\15\2\uffff\1\14\4\uffff\1\12",
            "",
            "",
            "\1\16",
            "",
            "\1\15\2\uffff\1\14\4\uffff\1\12"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "986:1: rule__Cast__Alternatives_1 : ( ( ( rule__Cast__PtypeAssignment_1_0 ) ) | ( ( rule__Cast__ArrtypeAssignment_1_1 ) ) | ( ( rule__Cast__ClazztypeAssignment_1_2 ) ) );";
        }
    }
    static final String DFA6_eotS =
        "\6\uffff";
    static final String DFA6_eofS =
        "\2\uffff\1\4\2\uffff\1\4";
    static final String DFA6_minS =
        "\1\12\1\uffff\1\4\1\36\1\uffff\1\4";
    static final String DFA6_maxS =
        "\1\41\1\uffff\1\102\1\36\1\uffff\1\102";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\uffff";
    static final String DFA6_specialS =
        "\6\uffff}>";
    static final String[] DFA6_transitionS = {
            "\12\1\12\uffff\1\2\3\1",
            "",
            "\2\4\15\uffff\1\1\1\4\2\uffff\1\3\2\uffff\2\4\43\uffff\4\4",
            "\1\5",
            "",
            "\2\4\15\uffff\1\1\1\4\2\uffff\1\3\2\uffff\2\4\43\uffff\4\4"
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1036:1: rule__InstanceOfExpression__TargetAlternatives_1_1_0 : ( ( ruleRelationalExpression ) | ( ruleClassOrInterfaceType ) );";
        }
    }
    static final String DFA10_eotS =
        "\7\uffff";
    static final String DFA10_eofS =
        "\7\uffff";
    static final String DFA10_minS =
        "\1\30\1\36\1\23\1\uffff\1\36\1\uffff\1\23";
    static final String DFA10_maxS =
        "\1\30\1\76\1\34\1\uffff\1\36\1\uffff\1\34";
    static final String DFA10_acceptS =
        "\3\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String DFA10_specialS =
        "\7\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1",
            "\1\2\30\uffff\10\3",
            "\1\5\3\uffff\1\4\4\uffff\1\3",
            "",
            "\1\6",
            "",
            "\1\5\3\uffff\1\4\4\uffff\1\3"
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1144:1: rule__Creator__Alternatives : ( ( ruleClassCreator ) | ( ruleArrayCreator ) );";
        }
    }
    static final String DFA14_eotS =
        "\7\uffff";
    static final String DFA14_eofS =
        "\7\uffff";
    static final String DFA14_minS =
        "\2\12\1\uffff\1\23\1\uffff\1\36\1\23";
    static final String DFA14_maxS =
        "\1\41\1\76\1\uffff\1\34\1\uffff\1\36\1\34";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\2\uffff";
    static final String DFA14_specialS =
        "\7\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\2\1\1\1\uffff\1\2\10\uffff\4\2",
            "\12\2\1\uffff\1\2\2\uffff\1\2\5\uffff\1\3\3\2\25\uffff\10\4",
            "",
            "\1\2\1\4\2\uffff\1\5\4\uffff\1\4",
            "",
            "\1\6",
            "\1\2\1\4\2\uffff\1\5\4\uffff\1\4"
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1347:1: ( ruleCast )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodInvocation_in_entryRuleMethodInvocation180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodInvocation187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodInvocation__Group__0_in_ruleMethodInvocation213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodName_in_entryRuleMethodName240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodName247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodName__Group__0_in_ruleMethodName273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseJRExpr_in_entryRuleBaseJRExpr300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseJRExpr307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseJRExpr__Alternatives_in_ruleBaseJRExpr333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArguments_in_entryRuleArguments360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArguments367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arguments__Group__0_in_ruleArguments393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionList_in_entryRuleExpressionList420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionList427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionList__Group__0_in_ruleExpressionList453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseCommonExpression_in_entryRuleBaseCommonExpression480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseCommonExpression487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseCommonExpression__Alternatives_in_ruleBaseCommonExpression513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_in_entryRuleCast540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCast547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cast__Group__0_in_ruleCast573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalExpression607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__0_in_ruleConditionalExpression633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestExpression_in_entryRuleTestExpression660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestExpression667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleTestExpression693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryCondExpression_in_entryRulePrimaryCondExpression839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryCondExpression846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryCondExpression__ExprAssignment_in_rulePrimaryCondExpression872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseBooleanExpr_in_entryRuleBaseBooleanExpr899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseBooleanExpr906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseBooleanExpr__Group__0_in_ruleBaseBooleanExpr932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualityExpression966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group__0_in_ruleEqualityExpression992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression1019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group__0_in_ruleRelationalExpression1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceOfExpression_in_entryRuleInstanceOfExpression1079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceOfExpression1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstanceOfExpression__Group__0_in_ruleInstanceOfExpression1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression1139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group__0_in_ruleAdditiveExpression1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression1199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group__0_in_ruleMultiplicativeExpression1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalOp_in_entryRuleRelationalOp1259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalOp1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalOp__Alternatives_in_ruleRelationalOp1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreator_in_entryRuleCreator1319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreator1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Creator__Alternatives_in_ruleCreator1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassCreator_in_entryRuleClassCreator1379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassCreator1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassCreator__Group__0_in_ruleClassCreator1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayCreator_in_entryRuleArrayCreator1439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayCreator1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayCreator__Group__0_in_ruleArrayCreator1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayInitializer_in_entryRuleArrayInitializer1499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayInitializer1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group__0_in_ruleArrayInitializer1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_entryRuleArrayType1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayType1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__0_in_ruleArrayType1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceType_in_entryRuleClassOrInterfaceType1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassOrInterfaceType1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassOrInterfaceType__QualifiedNameAssignment_in_ruleClassOrInterfaceType1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType1801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreator_in_rule__Expression__Alternatives1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Alternatives1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseJRExpr__FieldTokenAssignment_0_in_rule__BaseJRExpr__Alternatives1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseJRExpr__ParameterTokenAssignment_1_in_rule__BaseJRExpr__Alternatives1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseJRExpr__VariableTokenAssignment_2_in_rule__BaseJRExpr__Alternatives1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseCommonExpression__BasejrexprAssignment_0_in_rule__BaseCommonExpression__Alternatives1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseCommonExpression__LiteralAssignment_1_in_rule__BaseCommonExpression__Alternatives2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseCommonExpression__Group_2__0_in_rule__BaseCommonExpression__Alternatives2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodInvocation_in_rule__BaseCommonExpression__Alternatives2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cast__PtypeAssignment_1_0_in_rule__Cast__Alternatives_12075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cast__ArrtypeAssignment_1_1_in_rule__Cast__Alternatives_12093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cast__ClazztypeAssignment_1_2_in_rule__Cast__Alternatives_12111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_rule__EqualityExpression__Alternatives_1_02144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOTEQUAL_in_rule__EqualityExpression__Alternatives_1_02161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_rule__InstanceOfExpression__TargetAlternatives_1_1_02193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceType_in_rule__InstanceOfExpression__TargetAlternatives_1_1_02210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__AdditiveExpression__Alternatives_1_02243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__AdditiveExpression__Alternatives_1_02263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__MultiplicativeExpression__Alternatives_2_02298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__MultiplicativeExpression__Alternatives_2_02318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GT_in_rule__RelationalOp__Alternatives2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GTE_in_rule__RelationalOp__Alternatives2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LT_in_rule__RelationalOp__Alternatives2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LTE_in_rule__RelationalOp__Alternatives2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassCreator_in_rule__Creator__Alternatives2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayCreator_in_rule__Creator__Alternatives2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__ClazzInterfAssignment_0_0_in_rule__ArrayType__Alternatives_02484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__PrimtypeAssignment_0_1_in_rule__ArrayType__Alternatives_02502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTLITERAL_in_rule__Literal__Alternatives2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LONGLITERAL_in_rule__Literal__Alternatives2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOATLITERAL_in_rule__Literal__Alternatives2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLELITERAL_in_rule__Literal__Alternatives2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHARLITERAL_in_rule__Literal__Alternatives2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRINGLITERAL_in_rule__Literal__Alternatives2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TRUE_in_rule__Literal__Alternatives2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FALSE_in_rule__Literal__Alternatives2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_rule__Literal__Alternatives2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__PrimitiveType__Alternatives2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__PrimitiveType__Alternatives2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__PrimitiveType__Alternatives2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__PrimitiveType__Alternatives2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__PrimitiveType__Alternatives2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__PrimitiveType__Alternatives2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__PrimitiveType__Alternatives2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__PrimitiveType__Alternatives2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__02876 = new BitSet(new long[]{0x00000003C02FFC00L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__02879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_in_rule__Expression__Group_1__0__Impl2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__12938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__CondExprAssignment_1_1_in_rule__Expression__Group_1__1__Impl2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodInvocation__Group__0__Impl_in_rule__MethodInvocation__Group__02999 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__MethodInvocation__Group__1_in_rule__MethodInvocation__Group__03002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodInvocation__FullyQualifiedMethodNameAssignment_0_in_rule__MethodInvocation__Group__0__Impl3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodInvocation__Group__1__Impl_in_rule__MethodInvocation__Group__13059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodInvocation__ArgsAssignment_1_in_rule__MethodInvocation__Group__1__Impl3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodName__Group__0__Impl_in_rule__MethodName__Group__03120 = new BitSet(new long[]{0x00000003C02FFC00L});
    public static final BitSet FOLLOW_rule__MethodName__Group__1_in_rule__MethodName__Group__03123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodName__Group_0__0_in_rule__MethodName__Group__0__Impl3150 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__MethodName__Group__1__Impl_in_rule__MethodName__Group__13181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodName__MethodNameAssignment_1_in_rule__MethodName__Group__1__Impl3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodName__Group_0__0__Impl_in_rule__MethodName__Group_0__03242 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MethodName__Group_0__1_in_rule__MethodName__Group_0__03245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodName__PrefixQMNAssignment_0_0_in_rule__MethodName__Group_0__0__Impl3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodName__Group_0__1__Impl_in_rule__MethodName__Group_0__13302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodName__DotsAssignment_0_1_in_rule__MethodName__Group_0__1__Impl3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arguments__Group__0__Impl_in_rule__Arguments__Group__03363 = new BitSet(new long[]{0x00000003C13FFC00L});
    public static final BitSet FOLLOW_rule__Arguments__Group__1_in_rule__Arguments__Group__03366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arguments__LeftPAssignment_0_in_rule__Arguments__Group__0__Impl3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arguments__Group__1__Impl_in_rule__Arguments__Group__13423 = new BitSet(new long[]{0x00000003C13FFC00L});
    public static final BitSet FOLLOW_rule__Arguments__Group__2_in_rule__Arguments__Group__13426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arguments__ExprLstAssignment_1_in_rule__Arguments__Group__1__Impl3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arguments__Group__2__Impl_in_rule__Arguments__Group__23484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arguments__RightPAssignment_2_in_rule__Arguments__Group__2__Impl3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionList__Group__0__Impl_in_rule__ExpressionList__Group__03547 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ExpressionList__Group__1_in_rule__ExpressionList__Group__03550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionList__ExpressionsAssignment_0_in_rule__ExpressionList__Group__0__Impl3577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionList__Group__1__Impl_in_rule__ExpressionList__Group__13607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionList__Group_1__0_in_rule__ExpressionList__Group__1__Impl3634 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__ExpressionList__Group_1__0__Impl_in_rule__ExpressionList__Group_1__03669 = new BitSet(new long[]{0x00000003C12FFC00L});
    public static final BitSet FOLLOW_rule__ExpressionList__Group_1__1_in_rule__ExpressionList__Group_1__03672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionList__CommasAssignment_1_0_in_rule__ExpressionList__Group_1__0__Impl3699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionList__Group_1__1__Impl_in_rule__ExpressionList__Group_1__13729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionList__ExpressionsAssignment_1_1_in_rule__ExpressionList__Group_1__1__Impl3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseCommonExpression__Group_2__0__Impl_in_rule__BaseCommonExpression__Group_2__03790 = new BitSet(new long[]{0x00000003C12FFC00L});
    public static final BitSet FOLLOW_rule__BaseCommonExpression__Group_2__1_in_rule__BaseCommonExpression__Group_2__03793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rule__BaseCommonExpression__Group_2__0__Impl3820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseCommonExpression__Group_2__1__Impl_in_rule__BaseCommonExpression__Group_2__13849 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__BaseCommonExpression__Group_2__2_in_rule__BaseCommonExpression__Group_2__13852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__BaseCommonExpression__Group_2__1__Impl3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseCommonExpression__Group_2__2__Impl_in_rule__BaseCommonExpression__Group_2__23908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rule__BaseCommonExpression__Group_2__2__Impl3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cast__Group__0__Impl_in_rule__Cast__Group__03970 = new BitSet(new long[]{0x7F80000040000000L});
    public static final BitSet FOLLOW_rule__Cast__Group__1_in_rule__Cast__Group__03973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cast__LparAssignment_0_in_rule__Cast__Group__0__Impl4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cast__Group__1__Impl_in_rule__Cast__Group__14030 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Cast__Group__2_in_rule__Cast__Group__14033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cast__Alternatives_1_in_rule__Cast__Group__1__Impl4060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cast__Group__2__Impl_in_rule__Cast__Group__24090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cast__RparAssignment_2_in_rule__Cast__Group__2__Impl4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__0__Impl_in_rule__ConditionalExpression__Group__04153 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__1_in_rule__ConditionalExpression__Group__04156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestExpression_in_rule__ConditionalExpression__Group__0__Impl4183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__1__Impl_in_rule__ConditionalExpression__Group__14212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group_1__0_in_rule__ConditionalExpression__Group__1__Impl4239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group_1__0__Impl_in_rule__ConditionalExpression__Group_1__04274 = new BitSet(new long[]{0x00000003C12FFC00L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group_1__1_in_rule__ConditionalExpression__Group_1__04277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__ConditionalExpression__Group_1__0__Impl4305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group_1__1__Impl_in_rule__ConditionalExpression__Group_1__14336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group_1__2_in_rule__ConditionalExpression__Group_1__14339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__OkReturnedExprAssignment_1_1_in_rule__ConditionalExpression__Group_1__1__Impl4366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group_1__2__Impl_in_rule__ConditionalExpression__Group_1__24396 = new BitSet(new long[]{0x00000003C12FFC00L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group_1__3_in_rule__ConditionalExpression__Group_1__24399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__ConditionalExpression__Group_1__2__Impl4427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group_1__3__Impl_in_rule__ConditionalExpression__Group_1__34458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__KoReturnedExprAssignment_1_3_in_rule__ConditionalExpression__Group_1__3__Impl4485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__04523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__04526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__AndExpAssignment_0_in_rule__OrExpression__Group__0__Impl4553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__14583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl4610 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__04645 = new BitSet(new long[]{0x00000003C02FFC00L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__04648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__OrExpression__Group_1__0__Impl4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__14707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__AndExpAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl4734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__04768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__04771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__PrimaryCondAssignment_0_in_rule__AndExpression__Group__0__Impl4798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__14828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl4855 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__04890 = new BitSet(new long[]{0x00000003C02FFC00L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__04893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__AndExpression__Group_1__0__Impl4921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__14952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__PrimaryCondAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl4979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseBooleanExpr__Group__0__Impl_in_rule__BaseBooleanExpr__Group__05013 = new BitSet(new long[]{0x00000003C02FFC00L});
    public static final BitSet FOLLOW_rule__BaseBooleanExpr__Group__1_in_rule__BaseBooleanExpr__Group__05016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_in_rule__BaseBooleanExpr__Group__0__Impl5044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseBooleanExpr__Group__1__Impl_in_rule__BaseBooleanExpr__Group__15075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_rule__BaseBooleanExpr__Group__1__Impl5102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group__0__Impl_in_rule__EqualityExpression__Group__05135 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group__1_in_rule__EqualityExpression__Group__05138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__InstanceofAssignment_0_in_rule__EqualityExpression__Group__0__Impl5165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group__1__Impl_in_rule__EqualityExpression__Group__15195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_1__0_in_rule__EqualityExpression__Group__1__Impl5222 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_1__0__Impl_in_rule__EqualityExpression__Group_1__05257 = new BitSet(new long[]{0x00000003C02FFC00L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_1__1_in_rule__EqualityExpression__Group_1__05260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Alternatives_1_0_in_rule__EqualityExpression__Group_1__0__Impl5287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_1__1__Impl_in_rule__EqualityExpression__Group_1__15317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__InstanceofAssignment_1_1_in_rule__EqualityExpression__Group_1__1__Impl5344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group__0__Impl_in_rule__RelationalExpression__Group__05378 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group__1_in_rule__RelationalExpression__Group__05381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__RelAssignment_0_in_rule__RelationalExpression__Group__0__Impl5408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group__1__Impl_in_rule__RelationalExpression__Group__15438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group_1__0_in_rule__RelationalExpression__Group__1__Impl5465 = new BitSet(new long[]{0x00000000000003C2L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group_1__0__Impl_in_rule__RelationalExpression__Group_1__05500 = new BitSet(new long[]{0x00000003C02FFC00L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group_1__1_in_rule__RelationalExpression__Group_1__05503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalOp_in_rule__RelationalExpression__Group_1__0__Impl5530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group_1__1__Impl_in_rule__RelationalExpression__Group_1__15559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__RelAssignment_1_1_in_rule__RelationalExpression__Group_1__1__Impl5586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstanceOfExpression__Group__0__Impl_in_rule__InstanceOfExpression__Group__05620 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__InstanceOfExpression__Group__1_in_rule__InstanceOfExpression__Group__05623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstanceOfExpression__ElAssignment_0_in_rule__InstanceOfExpression__Group__0__Impl5650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstanceOfExpression__Group__1__Impl_in_rule__InstanceOfExpression__Group__15680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstanceOfExpression__Group_1__0_in_rule__InstanceOfExpression__Group__1__Impl5707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstanceOfExpression__Group_1__0__Impl_in_rule__InstanceOfExpression__Group_1__05742 = new BitSet(new long[]{0x00000003C02FFC00L});
    public static final BitSet FOLLOW_rule__InstanceOfExpression__Group_1__1_in_rule__InstanceOfExpression__Group_1__05745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INSTANCEOF_in_rule__InstanceOfExpression__Group_1__0__Impl5772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstanceOfExpression__Group_1__1__Impl_in_rule__InstanceOfExpression__Group_1__15801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstanceOfExpression__TargetAssignment_1_1_in_rule__InstanceOfExpression__Group_1__1__Impl5828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group__0__Impl_in_rule__AdditiveExpression__Group__05862 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group__1_in_rule__AdditiveExpression__Group__05865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__MultExprAssignment_0_in_rule__AdditiveExpression__Group__0__Impl5892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group__1__Impl_in_rule__AdditiveExpression__Group__15922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group_1__0_in_rule__AdditiveExpression__Group__1__Impl5949 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group_1__0__Impl_in_rule__AdditiveExpression__Group_1__05984 = new BitSet(new long[]{0x00000003C02FFC00L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group_1__1_in_rule__AdditiveExpression__Group_1__05987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Alternatives_1_0_in_rule__AdditiveExpression__Group_1__0__Impl6014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group_1__1__Impl_in_rule__AdditiveExpression__Group_1__16044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__MultExprAssignment_1_1_in_rule__AdditiveExpression__Group_1__1__Impl6071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group__0__Impl_in_rule__MultiplicativeExpression__Group__06105 = new BitSet(new long[]{0x0060000000800000L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group__1_in_rule__MultiplicativeExpression__Group__06108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__BaseExprAssignment_0_in_rule__MultiplicativeExpression__Group__0__Impl6135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group__1__Impl_in_rule__MultiplicativeExpression__Group__16165 = new BitSet(new long[]{0x0060000000800000L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group__2_in_rule__MultiplicativeExpression__Group__16168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_1__0_in_rule__MultiplicativeExpression__Group__1__Impl6195 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group__2__Impl_in_rule__MultiplicativeExpression__Group__26226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_2__0_in_rule__MultiplicativeExpression__Group__2__Impl6253 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_1__0__Impl_in_rule__MultiplicativeExpression__Group_1__06290 = new BitSet(new long[]{0x00000003C02FFC00L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_1__1_in_rule__MultiplicativeExpression__Group_1__06293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_rule__MultiplicativeExpression__Group_1__0__Impl6320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_1__1__Impl_in_rule__MultiplicativeExpression__Group_1__16349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__MethodsAssignment_1_1_in_rule__MultiplicativeExpression__Group_1__1__Impl6376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_2__0__Impl_in_rule__MultiplicativeExpression__Group_2__06410 = new BitSet(new long[]{0x00000003C02FFC00L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_2__1_in_rule__MultiplicativeExpression__Group_2__06413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Alternatives_2_0_in_rule__MultiplicativeExpression__Group_2__0__Impl6440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_2__1__Impl_in_rule__MultiplicativeExpression__Group_2__16470 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_2__2_in_rule__MultiplicativeExpression__Group_2__16473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__BaseExprAssignment_2_1_in_rule__MultiplicativeExpression__Group_2__1__Impl6500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_2__2__Impl_in_rule__MultiplicativeExpression__Group_2__26530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_2_2__0_in_rule__MultiplicativeExpression__Group_2__2__Impl6557 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_2_2__0__Impl_in_rule__MultiplicativeExpression__Group_2_2__06594 = new BitSet(new long[]{0x00000003C02FFC00L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_2_2__1_in_rule__MultiplicativeExpression__Group_2_2__06597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_rule__MultiplicativeExpression__Group_2_2__0__Impl6624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_2_2__1__Impl_in_rule__MultiplicativeExpression__Group_2_2__16653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__MethodsAssignment_2_2_1_in_rule__MultiplicativeExpression__Group_2_2__1__Impl6680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassCreator__Group__0__Impl_in_rule__ClassCreator__Group__06714 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ClassCreator__Group__1_in_rule__ClassCreator__Group__06717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEW_in_rule__ClassCreator__Group__0__Impl6744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassCreator__Group__1__Impl_in_rule__ClassCreator__Group__16773 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ClassCreator__Group__2_in_rule__ClassCreator__Group__16776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassCreator__ClazzAssignment_1_in_rule__ClassCreator__Group__1__Impl6803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassCreator__Group__2__Impl_in_rule__ClassCreator__Group__26833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassCreator__ArgsAssignment_2_in_rule__ClassCreator__Group__2__Impl6860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayCreator__Group__0__Impl_in_rule__ArrayCreator__Group__06896 = new BitSet(new long[]{0x7F80000040000000L});
    public static final BitSet FOLLOW_rule__ArrayCreator__Group__1_in_rule__ArrayCreator__Group__06899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEW_in_rule__ArrayCreator__Group__0__Impl6926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayCreator__Group__1__Impl_in_rule__ArrayCreator__Group__16955 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ArrayCreator__Group__2_in_rule__ArrayCreator__Group__16958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayCreator__TypeAssignment_1_in_rule__ArrayCreator__Group__1__Impl6985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayCreator__Group__2__Impl_in_rule__ArrayCreator__Group__27015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayCreator__ArrayInitializerAssignment_2_in_rule__ArrayCreator__Group__2__Impl7042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group__0__Impl_in_rule__ArrayInitializer__Group__07078 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group__1_in_rule__ArrayInitializer__Group__07081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group__1__Impl_in_rule__ArrayInitializer__Group__17139 = new BitSet(new long[]{0x00000003CD2FFC00L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group__2_in_rule__ArrayInitializer__Group__17142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_rule__ArrayInitializer__Group__1__Impl7169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group__2__Impl_in_rule__ArrayInitializer__Group__27198 = new BitSet(new long[]{0x00000003CD2FFC00L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group__3_in_rule__ArrayInitializer__Group__27201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group_2__0_in_rule__ArrayInitializer__Group__2__Impl7228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group__3__Impl_in_rule__ArrayInitializer__Group__37259 = new BitSet(new long[]{0x00000003CD2FFC00L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group__4_in_rule__ArrayInitializer__Group__37262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__ArrayInitializer__Group__3__Impl7290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group__4__Impl_in_rule__ArrayInitializer__Group__47321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_rule__ArrayInitializer__Group__4__Impl7348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group_2__0__Impl_in_rule__ArrayInitializer__Group_2__07387 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group_2__1_in_rule__ArrayInitializer__Group_2__07390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__FirstElAssignment_2_0_in_rule__ArrayInitializer__Group_2__0__Impl7417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group_2__1__Impl_in_rule__ArrayInitializer__Group_2__17447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group_2_1__0_in_rule__ArrayInitializer__Group_2__1__Impl7474 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group_2_1__0__Impl_in_rule__ArrayInitializer__Group_2_1__07509 = new BitSet(new long[]{0x00000003C12FFC00L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group_2_1__1_in_rule__ArrayInitializer__Group_2_1__07512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__ArrayInitializer__Group_2_1__0__Impl7539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group_2_1__1__Impl_in_rule__ArrayInitializer__Group_2_1__17568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__OtherElsAssignment_2_1_1_in_rule__ArrayInitializer__Group_2_1__1__Impl7595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__0__Impl_in_rule__ArrayType__Group__07630 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__1_in_rule__ArrayType__Group__07633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Alternatives_0_in_rule__ArrayType__Group__0__Impl7660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__1__Impl_in_rule__ArrayType__Group__17690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_1__0_in_rule__ArrayType__Group__1__Impl7719 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_1__0_in_rule__ArrayType__Group__1__Impl7731 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_1__0__Impl_in_rule__ArrayType__Group_1__07768 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_1__1_in_rule__ArrayType__Group_1__07771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_rule__ArrayType__Group_1__0__Impl7798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_1__1__Impl_in_rule__ArrayType__Group_1__17827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RBRACKET_in_rule__ArrayType__Group_1__1__Impl7854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__07887 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__07890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__17948 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__2_in_rule__QualifiedName__Group__17951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__IdentifierAssignment_1_in_rule__QualifiedName__Group__1__Impl7978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__2__Impl_in_rule__QualifiedName__Group__28008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_2__0_in_rule__QualifiedName__Group__2__Impl8035 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_2__0__Impl_in_rule__QualifiedName__Group_2__08072 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_2__1_in_rule__QualifiedName__Group_2__08075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__DotAssignment_2_0_in_rule__QualifiedName__Group_2__0__Impl8102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_2__1__Impl_in_rule__QualifiedName__Group_2__18132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__IdentifierAssignment_2_1_in_rule__QualifiedName__Group_2__1__Impl8159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_rule__Expression__CondExprAssignment_1_18198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodName_in_rule__MethodInvocation__FullyQualifiedMethodNameAssignment_08229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArguments_in_rule__MethodInvocation__ArgsAssignment_18260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__MethodName__PrefixQMNAssignment_0_08291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_rule__MethodName__DotsAssignment_0_18322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__MethodName__MethodNameAssignment_18353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FIELDTOKEN_in_rule__BaseJRExpr__FieldTokenAssignment_08384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAMETERTOKEN_in_rule__BaseJRExpr__ParameterTokenAssignment_18415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLETOKEN_in_rule__BaseJRExpr__VariableTokenAssignment_28446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rule__Arguments__LeftPAssignment_08477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionList_in_rule__Arguments__ExprLstAssignment_18508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rule__Arguments__RightPAssignment_28539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ExpressionList__ExpressionsAssignment_08570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__ExpressionList__CommasAssignment_1_08601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ExpressionList__ExpressionsAssignment_1_18632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseJRExpr_in_rule__BaseCommonExpression__BasejrexprAssignment_08663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__BaseCommonExpression__LiteralAssignment_18694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rule__Cast__LparAssignment_08725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_rule__Cast__PtypeAssignment_1_08756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_rule__Cast__ArrtypeAssignment_1_18787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceType_in_rule__Cast__ClazztypeAssignment_1_28818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rule__Cast__RparAssignment_28849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ConditionalExpression__OkReturnedExprAssignment_1_18880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ConditionalExpression__KoReturnedExprAssignment_1_38911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__AndExpAssignment_08942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__AndExpAssignment_1_18973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryCondExpression_in_rule__AndExpression__PrimaryCondAssignment_09004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryCondExpression_in_rule__AndExpression__PrimaryCondAssignment_1_19035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseBooleanExpr_in_rule__PrimaryCondExpression__ExprAssignment9066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceOfExpression_in_rule__EqualityExpression__InstanceofAssignment_09097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceOfExpression_in_rule__EqualityExpression__InstanceofAssignment_1_19128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_rule__RelationalExpression__RelAssignment_09159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_rule__RelationalExpression__RelAssignment_1_19190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_rule__InstanceOfExpression__ElAssignment_09221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstanceOfExpression__TargetAlternatives_1_1_0_in_rule__InstanceOfExpression__TargetAssignment_1_19252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_rule__AdditiveExpression__MultExprAssignment_09285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_rule__AdditiveExpression__MultExprAssignment_1_19316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseCommonExpression_in_rule__MultiplicativeExpression__BaseExprAssignment_09347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodInvocation_in_rule__MultiplicativeExpression__MethodsAssignment_1_19378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseCommonExpression_in_rule__MultiplicativeExpression__BaseExprAssignment_2_19409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodInvocation_in_rule__MultiplicativeExpression__MethodsAssignment_2_2_19440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceType_in_rule__ClassCreator__ClazzAssignment_19471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArguments_in_rule__ClassCreator__ArgsAssignment_29502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_rule__ArrayCreator__TypeAssignment_19533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayInitializer_in_rule__ArrayCreator__ArrayInitializerAssignment_29564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ArrayInitializer__FirstElAssignment_2_09595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ArrayInitializer__OtherElsAssignment_2_1_19626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceType_in_rule__ArrayType__ClazzInterfAssignment_0_09658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_rule__ArrayType__PrimtypeAssignment_0_19689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ClassOrInterfaceType__QualifiedNameAssignment9720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__QualifiedName__IdentifierAssignment_19751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_rule__QualifiedName__DotAssignment_2_09782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__QualifiedName__IdentifierAssignment_2_19813 = new BitSet(new long[]{0x0000000000000002L});

}