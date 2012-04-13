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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EQUAL", "RULE_NOTEQUAL", "RULE_GT", "RULE_GTE", "RULE_LT", "RULE_LTE", "RULE_INTLITERAL", "RULE_LONGLITERAL", "RULE_FLOATLITERAL", "RULE_DOUBLELITERAL", "RULE_CHARLITERAL", "RULE_STRINGLITERAL", "RULE_TRUE", "RULE_FALSE", "RULE_NULL", "RULE_LPAREN", "RULE_RPAREN", "RULE_NOT", "RULE_INSTANCEOF", "RULE_DOT", "RULE_NEW", "RULE_LBRACE", "RULE_COMMA", "RULE_RBRACE", "RULE_LBRACKET", "RULE_RBRACKET", "RULE_FIELDTOKEN", "RULE_PARAMETERTOKEN", "RULE_VARIABLETOKEN", "RULE_IDENTIFIER", "RULE_BRACED_JRIDENTIFIER", "RULE_JRIDENTIFIER", "RULE_INTEGERNUMBER", "RULE_LONGSUFFIX", "RULE_HEXPREFIX", "RULE_HEXDIGIT", "RULE_EXPONENT", "RULE_NONINTEGERNUMBER", "RULE_FLOATSUFFIX", "RULE_DOUBLESUFFIX", "RULE_ESCAPESEQUENCE", "RULE_SEMI", "RULE_LETTER", "RULE_JAVAIDDIGIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'+'", "'-'", "'*'", "'/'", "'boolean'", "'char'", "'byte'", "'short'", "'int'", "'long'", "'float'", "'double'", "'?'", "':'", "'||'", "'&&'"
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
    public static final int RULE_IDENTIFIER=33;
    public static final int RULE_VARIABLETOKEN=32;
    public static final int RULE_COMMA=26;
    public static final int RULE_EQUAL=4;
    public static final int RULE_BRACED_JRIDENTIFIER=34;
    public static final int RULE_SL_COMMENT=49;
    public static final int RULE_JRIDENTIFIER=35;
    public static final int RULE_LETTER=46;
    public static final int RULE_PARAMETERTOKEN=31;
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
    public static final int RULE_FIELDTOKEN=30;

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


    // $ANTLR start "entryRuleBaseJRExpr"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:144:1: entryRuleBaseJRExpr : ruleBaseJRExpr EOF ;
    public final void entryRuleBaseJRExpr() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:145:1: ( ruleBaseJRExpr EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:146:1: ruleBaseJRExpr EOF
            {
             before(grammarAccess.getBaseJRExprRule()); 
            pushFollow(FOLLOW_ruleBaseJRExpr_in_entryRuleBaseJRExpr240);
            ruleBaseJRExpr();

            state._fsp--;

             after(grammarAccess.getBaseJRExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseJRExpr247); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:153:1: ruleBaseJRExpr : ( ( rule__BaseJRExpr__Alternatives ) ) ;
    public final void ruleBaseJRExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:157:2: ( ( ( rule__BaseJRExpr__Alternatives ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:158:1: ( ( rule__BaseJRExpr__Alternatives ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:158:1: ( ( rule__BaseJRExpr__Alternatives ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:159:1: ( rule__BaseJRExpr__Alternatives )
            {
             before(grammarAccess.getBaseJRExprAccess().getAlternatives()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:160:1: ( rule__BaseJRExpr__Alternatives )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:160:2: rule__BaseJRExpr__Alternatives
            {
            pushFollow(FOLLOW_rule__BaseJRExpr__Alternatives_in_ruleBaseJRExpr273);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:172:1: entryRuleArguments : ruleArguments EOF ;
    public final void entryRuleArguments() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:173:1: ( ruleArguments EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:174:1: ruleArguments EOF
            {
             before(grammarAccess.getArgumentsRule()); 
            pushFollow(FOLLOW_ruleArguments_in_entryRuleArguments300);
            ruleArguments();

            state._fsp--;

             after(grammarAccess.getArgumentsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArguments307); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:181:1: ruleArguments : ( ( rule__Arguments__Group__0 ) ) ;
    public final void ruleArguments() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:185:2: ( ( ( rule__Arguments__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:186:1: ( ( rule__Arguments__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:186:1: ( ( rule__Arguments__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:187:1: ( rule__Arguments__Group__0 )
            {
             before(grammarAccess.getArgumentsAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:188:1: ( rule__Arguments__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:188:2: rule__Arguments__Group__0
            {
            pushFollow(FOLLOW_rule__Arguments__Group__0_in_ruleArguments333);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:200:1: entryRuleExpressionList : ruleExpressionList EOF ;
    public final void entryRuleExpressionList() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:201:1: ( ruleExpressionList EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:202:1: ruleExpressionList EOF
            {
             before(grammarAccess.getExpressionListRule()); 
            pushFollow(FOLLOW_ruleExpressionList_in_entryRuleExpressionList360);
            ruleExpressionList();

            state._fsp--;

             after(grammarAccess.getExpressionListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionList367); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:209:1: ruleExpressionList : ( ( rule__ExpressionList__Group__0 ) ) ;
    public final void ruleExpressionList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:213:2: ( ( ( rule__ExpressionList__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:214:1: ( ( rule__ExpressionList__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:214:1: ( ( rule__ExpressionList__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:215:1: ( rule__ExpressionList__Group__0 )
            {
             before(grammarAccess.getExpressionListAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:216:1: ( rule__ExpressionList__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:216:2: rule__ExpressionList__Group__0
            {
            pushFollow(FOLLOW_rule__ExpressionList__Group__0_in_ruleExpressionList393);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:228:1: entryRuleBaseCommonExpression : ruleBaseCommonExpression EOF ;
    public final void entryRuleBaseCommonExpression() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:229:1: ( ruleBaseCommonExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:230:1: ruleBaseCommonExpression EOF
            {
             before(grammarAccess.getBaseCommonExpressionRule()); 
            pushFollow(FOLLOW_ruleBaseCommonExpression_in_entryRuleBaseCommonExpression420);
            ruleBaseCommonExpression();

            state._fsp--;

             after(grammarAccess.getBaseCommonExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseCommonExpression427); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:237:1: ruleBaseCommonExpression : ( ( rule__BaseCommonExpression__Alternatives ) ) ;
    public final void ruleBaseCommonExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:241:2: ( ( ( rule__BaseCommonExpression__Alternatives ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:242:1: ( ( rule__BaseCommonExpression__Alternatives ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:242:1: ( ( rule__BaseCommonExpression__Alternatives ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:243:1: ( rule__BaseCommonExpression__Alternatives )
            {
             before(grammarAccess.getBaseCommonExpressionAccess().getAlternatives()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:244:1: ( rule__BaseCommonExpression__Alternatives )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:244:2: rule__BaseCommonExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__BaseCommonExpression__Alternatives_in_ruleBaseCommonExpression453);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:256:1: entryRuleCast : ruleCast EOF ;
    public final void entryRuleCast() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:257:1: ( ruleCast EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:258:1: ruleCast EOF
            {
             before(grammarAccess.getCastRule()); 
            pushFollow(FOLLOW_ruleCast_in_entryRuleCast480);
            ruleCast();

            state._fsp--;

             after(grammarAccess.getCastRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCast487); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:265:1: ruleCast : ( ( rule__Cast__Group__0 ) ) ;
    public final void ruleCast() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:269:2: ( ( ( rule__Cast__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:270:1: ( ( rule__Cast__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:270:1: ( ( rule__Cast__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:271:1: ( rule__Cast__Group__0 )
            {
             before(grammarAccess.getCastAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:272:1: ( rule__Cast__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:272:2: rule__Cast__Group__0
            {
            pushFollow(FOLLOW_rule__Cast__Group__0_in_ruleCast513);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:284:1: entryRuleConditionalExpression : ruleConditionalExpression EOF ;
    public final void entryRuleConditionalExpression() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:285:1: ( ruleConditionalExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:286:1: ruleConditionalExpression EOF
            {
             before(grammarAccess.getConditionalExpressionRule()); 
            pushFollow(FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression540);
            ruleConditionalExpression();

            state._fsp--;

             after(grammarAccess.getConditionalExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalExpression547); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:293:1: ruleConditionalExpression : ( ( rule__ConditionalExpression__Group__0 ) ) ;
    public final void ruleConditionalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:297:2: ( ( ( rule__ConditionalExpression__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:298:1: ( ( rule__ConditionalExpression__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:298:1: ( ( rule__ConditionalExpression__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:299:1: ( rule__ConditionalExpression__Group__0 )
            {
             before(grammarAccess.getConditionalExpressionAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:300:1: ( rule__ConditionalExpression__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:300:2: rule__ConditionalExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__0_in_ruleConditionalExpression573);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:312:1: entryRuleTestExpression : ruleTestExpression EOF ;
    public final void entryRuleTestExpression() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:313:1: ( ruleTestExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:314:1: ruleTestExpression EOF
            {
             before(grammarAccess.getTestExpressionRule()); 
            pushFollow(FOLLOW_ruleTestExpression_in_entryRuleTestExpression600);
            ruleTestExpression();

            state._fsp--;

             after(grammarAccess.getTestExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestExpression607); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:321:1: ruleTestExpression : ( ruleOrExpression ) ;
    public final void ruleTestExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:325:2: ( ( ruleOrExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:326:1: ( ruleOrExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:326:1: ( ruleOrExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:327:1: ruleOrExpression
            {
             before(grammarAccess.getTestExpressionAccess().getOrExpressionParserRuleCall()); 
            pushFollow(FOLLOW_ruleOrExpression_in_ruleTestExpression633);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:340:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:341:1: ( ruleOrExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:342:1: ruleOrExpression EOF
            {
             before(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression659);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression666); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:349:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:353:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:354:1: ( ( rule__OrExpression__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:354:1: ( ( rule__OrExpression__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:355:1: ( rule__OrExpression__Group__0 )
            {
             before(grammarAccess.getOrExpressionAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:356:1: ( rule__OrExpression__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:356:2: rule__OrExpression__Group__0
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression692);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:368:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:369:1: ( ruleAndExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:370:1: ruleAndExpression EOF
            {
             before(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression719);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression726); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:377:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:381:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:382:1: ( ( rule__AndExpression__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:382:1: ( ( rule__AndExpression__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:383:1: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:384:1: ( rule__AndExpression__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:384:2: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression752);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:396:1: entryRulePrimaryCondExpression : rulePrimaryCondExpression EOF ;
    public final void entryRulePrimaryCondExpression() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:397:1: ( rulePrimaryCondExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:398:1: rulePrimaryCondExpression EOF
            {
             before(grammarAccess.getPrimaryCondExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryCondExpression_in_entryRulePrimaryCondExpression779);
            rulePrimaryCondExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryCondExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryCondExpression786); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:405:1: rulePrimaryCondExpression : ( ( rule__PrimaryCondExpression__ExprAssignment ) ) ;
    public final void rulePrimaryCondExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:409:2: ( ( ( rule__PrimaryCondExpression__ExprAssignment ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:410:1: ( ( rule__PrimaryCondExpression__ExprAssignment ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:410:1: ( ( rule__PrimaryCondExpression__ExprAssignment ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:411:1: ( rule__PrimaryCondExpression__ExprAssignment )
            {
             before(grammarAccess.getPrimaryCondExpressionAccess().getExprAssignment()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:412:1: ( rule__PrimaryCondExpression__ExprAssignment )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:412:2: rule__PrimaryCondExpression__ExprAssignment
            {
            pushFollow(FOLLOW_rule__PrimaryCondExpression__ExprAssignment_in_rulePrimaryCondExpression812);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:424:1: entryRuleBaseBooleanExpr : ruleBaseBooleanExpr EOF ;
    public final void entryRuleBaseBooleanExpr() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:425:1: ( ruleBaseBooleanExpr EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:426:1: ruleBaseBooleanExpr EOF
            {
             before(grammarAccess.getBaseBooleanExprRule()); 
            pushFollow(FOLLOW_ruleBaseBooleanExpr_in_entryRuleBaseBooleanExpr839);
            ruleBaseBooleanExpr();

            state._fsp--;

             after(grammarAccess.getBaseBooleanExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseBooleanExpr846); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:433:1: ruleBaseBooleanExpr : ( ( rule__BaseBooleanExpr__Group__0 ) ) ;
    public final void ruleBaseBooleanExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:437:2: ( ( ( rule__BaseBooleanExpr__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:438:1: ( ( rule__BaseBooleanExpr__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:438:1: ( ( rule__BaseBooleanExpr__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:439:1: ( rule__BaseBooleanExpr__Group__0 )
            {
             before(grammarAccess.getBaseBooleanExprAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:440:1: ( rule__BaseBooleanExpr__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:440:2: rule__BaseBooleanExpr__Group__0
            {
            pushFollow(FOLLOW_rule__BaseBooleanExpr__Group__0_in_ruleBaseBooleanExpr872);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:452:1: entryRuleEqualityExpression : ruleEqualityExpression EOF ;
    public final void entryRuleEqualityExpression() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:453:1: ( ruleEqualityExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:454:1: ruleEqualityExpression EOF
            {
             before(grammarAccess.getEqualityExpressionRule()); 
            pushFollow(FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression899);
            ruleEqualityExpression();

            state._fsp--;

             after(grammarAccess.getEqualityExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualityExpression906); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:461:1: ruleEqualityExpression : ( ( rule__EqualityExpression__Group__0 ) ) ;
    public final void ruleEqualityExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:465:2: ( ( ( rule__EqualityExpression__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:466:1: ( ( rule__EqualityExpression__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:466:1: ( ( rule__EqualityExpression__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:467:1: ( rule__EqualityExpression__Group__0 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:468:1: ( rule__EqualityExpression__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:468:2: rule__EqualityExpression__Group__0
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group__0_in_ruleEqualityExpression932);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:480:1: entryRuleRelationalExpression : ruleRelationalExpression EOF ;
    public final void entryRuleRelationalExpression() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:481:1: ( ruleRelationalExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:482:1: ruleRelationalExpression EOF
            {
             before(grammarAccess.getRelationalExpressionRule()); 
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression959);
            ruleRelationalExpression();

            state._fsp--;

             after(grammarAccess.getRelationalExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression966); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:489:1: ruleRelationalExpression : ( ( rule__RelationalExpression__Group__0 ) ) ;
    public final void ruleRelationalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:493:2: ( ( ( rule__RelationalExpression__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:494:1: ( ( rule__RelationalExpression__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:494:1: ( ( rule__RelationalExpression__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:495:1: ( rule__RelationalExpression__Group__0 )
            {
             before(grammarAccess.getRelationalExpressionAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:496:1: ( rule__RelationalExpression__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:496:2: rule__RelationalExpression__Group__0
            {
            pushFollow(FOLLOW_rule__RelationalExpression__Group__0_in_ruleRelationalExpression992);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:508:1: entryRuleInstanceOfExpression : ruleInstanceOfExpression EOF ;
    public final void entryRuleInstanceOfExpression() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:509:1: ( ruleInstanceOfExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:510:1: ruleInstanceOfExpression EOF
            {
             before(grammarAccess.getInstanceOfExpressionRule()); 
            pushFollow(FOLLOW_ruleInstanceOfExpression_in_entryRuleInstanceOfExpression1019);
            ruleInstanceOfExpression();

            state._fsp--;

             after(grammarAccess.getInstanceOfExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceOfExpression1026); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:517:1: ruleInstanceOfExpression : ( ( rule__InstanceOfExpression__Group__0 ) ) ;
    public final void ruleInstanceOfExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:521:2: ( ( ( rule__InstanceOfExpression__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:522:1: ( ( rule__InstanceOfExpression__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:522:1: ( ( rule__InstanceOfExpression__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:523:1: ( rule__InstanceOfExpression__Group__0 )
            {
             before(grammarAccess.getInstanceOfExpressionAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:524:1: ( rule__InstanceOfExpression__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:524:2: rule__InstanceOfExpression__Group__0
            {
            pushFollow(FOLLOW_rule__InstanceOfExpression__Group__0_in_ruleInstanceOfExpression1052);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:536:1: entryRuleAdditiveExpression : ruleAdditiveExpression EOF ;
    public final void entryRuleAdditiveExpression() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:537:1: ( ruleAdditiveExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:538:1: ruleAdditiveExpression EOF
            {
             before(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression1079);
            ruleAdditiveExpression();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression1086); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:545:1: ruleAdditiveExpression : ( ( rule__AdditiveExpression__Group__0 ) ) ;
    public final void ruleAdditiveExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:549:2: ( ( ( rule__AdditiveExpression__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:550:1: ( ( rule__AdditiveExpression__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:550:1: ( ( rule__AdditiveExpression__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:551:1: ( rule__AdditiveExpression__Group__0 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:552:1: ( rule__AdditiveExpression__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:552:2: rule__AdditiveExpression__Group__0
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__Group__0_in_ruleAdditiveExpression1112);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:564:1: entryRuleMultiplicativeExpression : ruleMultiplicativeExpression EOF ;
    public final void entryRuleMultiplicativeExpression() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:565:1: ( ruleMultiplicativeExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:566:1: ruleMultiplicativeExpression EOF
            {
             before(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression1139);
            ruleMultiplicativeExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression1146); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:573:1: ruleMultiplicativeExpression : ( ( rule__MultiplicativeExpression__Group__0 ) ) ;
    public final void ruleMultiplicativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:577:2: ( ( ( rule__MultiplicativeExpression__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:578:1: ( ( rule__MultiplicativeExpression__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:578:1: ( ( rule__MultiplicativeExpression__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:579:1: ( rule__MultiplicativeExpression__Group__0 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:580:1: ( rule__MultiplicativeExpression__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:580:2: rule__MultiplicativeExpression__Group__0
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group__0_in_ruleMultiplicativeExpression1172);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:592:1: entryRuleRelationalOp : ruleRelationalOp EOF ;
    public final void entryRuleRelationalOp() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:593:1: ( ruleRelationalOp EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:594:1: ruleRelationalOp EOF
            {
             before(grammarAccess.getRelationalOpRule()); 
            pushFollow(FOLLOW_ruleRelationalOp_in_entryRuleRelationalOp1199);
            ruleRelationalOp();

            state._fsp--;

             after(grammarAccess.getRelationalOpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalOp1206); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:601:1: ruleRelationalOp : ( ( rule__RelationalOp__Alternatives ) ) ;
    public final void ruleRelationalOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:605:2: ( ( ( rule__RelationalOp__Alternatives ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:606:1: ( ( rule__RelationalOp__Alternatives ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:606:1: ( ( rule__RelationalOp__Alternatives ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:607:1: ( rule__RelationalOp__Alternatives )
            {
             before(grammarAccess.getRelationalOpAccess().getAlternatives()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:608:1: ( rule__RelationalOp__Alternatives )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:608:2: rule__RelationalOp__Alternatives
            {
            pushFollow(FOLLOW_rule__RelationalOp__Alternatives_in_ruleRelationalOp1232);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:620:1: entryRuleCreator : ruleCreator EOF ;
    public final void entryRuleCreator() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:621:1: ( ruleCreator EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:622:1: ruleCreator EOF
            {
             before(grammarAccess.getCreatorRule()); 
            pushFollow(FOLLOW_ruleCreator_in_entryRuleCreator1259);
            ruleCreator();

            state._fsp--;

             after(grammarAccess.getCreatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreator1266); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:629:1: ruleCreator : ( ( rule__Creator__Alternatives ) ) ;
    public final void ruleCreator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:633:2: ( ( ( rule__Creator__Alternatives ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:634:1: ( ( rule__Creator__Alternatives ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:634:1: ( ( rule__Creator__Alternatives ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:635:1: ( rule__Creator__Alternatives )
            {
             before(grammarAccess.getCreatorAccess().getAlternatives()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:636:1: ( rule__Creator__Alternatives )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:636:2: rule__Creator__Alternatives
            {
            pushFollow(FOLLOW_rule__Creator__Alternatives_in_ruleCreator1292);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:648:1: entryRuleClassCreator : ruleClassCreator EOF ;
    public final void entryRuleClassCreator() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:649:1: ( ruleClassCreator EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:650:1: ruleClassCreator EOF
            {
             before(grammarAccess.getClassCreatorRule()); 
            pushFollow(FOLLOW_ruleClassCreator_in_entryRuleClassCreator1319);
            ruleClassCreator();

            state._fsp--;

             after(grammarAccess.getClassCreatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassCreator1326); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:657:1: ruleClassCreator : ( ( rule__ClassCreator__Group__0 ) ) ;
    public final void ruleClassCreator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:661:2: ( ( ( rule__ClassCreator__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:662:1: ( ( rule__ClassCreator__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:662:1: ( ( rule__ClassCreator__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:663:1: ( rule__ClassCreator__Group__0 )
            {
             before(grammarAccess.getClassCreatorAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:664:1: ( rule__ClassCreator__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:664:2: rule__ClassCreator__Group__0
            {
            pushFollow(FOLLOW_rule__ClassCreator__Group__0_in_ruleClassCreator1352);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:676:1: entryRuleArrayCreator : ruleArrayCreator EOF ;
    public final void entryRuleArrayCreator() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:677:1: ( ruleArrayCreator EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:678:1: ruleArrayCreator EOF
            {
             before(grammarAccess.getArrayCreatorRule()); 
            pushFollow(FOLLOW_ruleArrayCreator_in_entryRuleArrayCreator1379);
            ruleArrayCreator();

            state._fsp--;

             after(grammarAccess.getArrayCreatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayCreator1386); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:685:1: ruleArrayCreator : ( ( rule__ArrayCreator__Group__0 ) ) ;
    public final void ruleArrayCreator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:689:2: ( ( ( rule__ArrayCreator__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:690:1: ( ( rule__ArrayCreator__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:690:1: ( ( rule__ArrayCreator__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:691:1: ( rule__ArrayCreator__Group__0 )
            {
             before(grammarAccess.getArrayCreatorAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:692:1: ( rule__ArrayCreator__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:692:2: rule__ArrayCreator__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayCreator__Group__0_in_ruleArrayCreator1412);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:704:1: entryRuleArrayInitializer : ruleArrayInitializer EOF ;
    public final void entryRuleArrayInitializer() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:705:1: ( ruleArrayInitializer EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:706:1: ruleArrayInitializer EOF
            {
             before(grammarAccess.getArrayInitializerRule()); 
            pushFollow(FOLLOW_ruleArrayInitializer_in_entryRuleArrayInitializer1439);
            ruleArrayInitializer();

            state._fsp--;

             after(grammarAccess.getArrayInitializerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayInitializer1446); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:713:1: ruleArrayInitializer : ( ( rule__ArrayInitializer__Group__0 ) ) ;
    public final void ruleArrayInitializer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:717:2: ( ( ( rule__ArrayInitializer__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:718:1: ( ( rule__ArrayInitializer__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:718:1: ( ( rule__ArrayInitializer__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:719:1: ( rule__ArrayInitializer__Group__0 )
            {
             before(grammarAccess.getArrayInitializerAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:720:1: ( rule__ArrayInitializer__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:720:2: rule__ArrayInitializer__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayInitializer__Group__0_in_ruleArrayInitializer1472);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:734:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:735:1: ( ruleArrayType EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:736:1: ruleArrayType EOF
            {
             before(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_ruleArrayType_in_entryRuleArrayType1501);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getArrayTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayType1508); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:743:1: ruleArrayType : ( ( rule__ArrayType__Group__0 ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:747:2: ( ( ( rule__ArrayType__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:748:1: ( ( rule__ArrayType__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:748:1: ( ( rule__ArrayType__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:749:1: ( rule__ArrayType__Group__0 )
            {
             before(grammarAccess.getArrayTypeAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:750:1: ( rule__ArrayType__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:750:2: rule__ArrayType__Group__0
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__0_in_ruleArrayType1534);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:762:1: entryRuleClassOrInterfaceType : ruleClassOrInterfaceType EOF ;
    public final void entryRuleClassOrInterfaceType() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:763:1: ( ruleClassOrInterfaceType EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:764:1: ruleClassOrInterfaceType EOF
            {
             before(grammarAccess.getClassOrInterfaceTypeRule()); 
            pushFollow(FOLLOW_ruleClassOrInterfaceType_in_entryRuleClassOrInterfaceType1561);
            ruleClassOrInterfaceType();

            state._fsp--;

             after(grammarAccess.getClassOrInterfaceTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassOrInterfaceType1568); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:771:1: ruleClassOrInterfaceType : ( ( rule__ClassOrInterfaceType__QualifiedNameAssignment ) ) ;
    public final void ruleClassOrInterfaceType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:775:2: ( ( ( rule__ClassOrInterfaceType__QualifiedNameAssignment ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:776:1: ( ( rule__ClassOrInterfaceType__QualifiedNameAssignment ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:776:1: ( ( rule__ClassOrInterfaceType__QualifiedNameAssignment ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:777:1: ( rule__ClassOrInterfaceType__QualifiedNameAssignment )
            {
             before(grammarAccess.getClassOrInterfaceTypeAccess().getQualifiedNameAssignment()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:778:1: ( rule__ClassOrInterfaceType__QualifiedNameAssignment )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:778:2: rule__ClassOrInterfaceType__QualifiedNameAssignment
            {
            pushFollow(FOLLOW_rule__ClassOrInterfaceType__QualifiedNameAssignment_in_ruleClassOrInterfaceType1594);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:790:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:791:1: ( ruleQualifiedName EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:792:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1621);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1628); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:799:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:803:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:804:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:804:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:805:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:806:1: ( rule__QualifiedName__Group__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:806:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1654);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:818:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:819:1: ( ruleLiteral EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:820:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1681);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1688); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:827:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:831:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:832:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:832:1: ( ( rule__Literal__Alternatives ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:833:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:834:1: ( rule__Literal__Alternatives )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:834:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1714);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:846:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:847:1: ( rulePrimitiveType EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:848:1: rulePrimitiveType EOF
            {
             before(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType1741);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType1748); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:855:1: rulePrimitiveType : ( ( rule__PrimitiveType__Alternatives ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:859:2: ( ( ( rule__PrimitiveType__Alternatives ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:860:1: ( ( rule__PrimitiveType__Alternatives ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:860:1: ( ( rule__PrimitiveType__Alternatives ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:861:1: ( rule__PrimitiveType__Alternatives )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getAlternatives()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:862:1: ( rule__PrimitiveType__Alternatives )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:862:2: rule__PrimitiveType__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType1774);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:874:1: rule__Expression__Alternatives : ( ( ruleCreator ) | ( ( rule__Expression__Group_1__0 ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:878:1: ( ( ruleCreator ) | ( ( rule__Expression__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_NEW) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=RULE_INTLITERAL && LA1_0<=RULE_LPAREN)||LA1_0==RULE_NOT||(LA1_0>=RULE_FIELDTOKEN && LA1_0<=RULE_IDENTIFIER)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:879:1: ( ruleCreator )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:879:1: ( ruleCreator )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:880:1: ruleCreator
                    {
                     before(grammarAccess.getExpressionAccess().getCreatorParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCreator_in_rule__Expression__Alternatives1810);
                    ruleCreator();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getCreatorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:885:6: ( ( rule__Expression__Group_1__0 ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:885:6: ( ( rule__Expression__Group_1__0 ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:886:1: ( rule__Expression__Group_1__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1()); 
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:887:1: ( rule__Expression__Group_1__0 )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:887:2: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Alternatives1827);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:896:1: rule__BaseJRExpr__Alternatives : ( ( ( rule__BaseJRExpr__FieldTokenAssignment_0 ) ) | ( ( rule__BaseJRExpr__ParameterTokenAssignment_1 ) ) | ( ( rule__BaseJRExpr__VariableTokenAssignment_2 ) ) );
    public final void rule__BaseJRExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:900:1: ( ( ( rule__BaseJRExpr__FieldTokenAssignment_0 ) ) | ( ( rule__BaseJRExpr__ParameterTokenAssignment_1 ) ) | ( ( rule__BaseJRExpr__VariableTokenAssignment_2 ) ) )
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
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:901:1: ( ( rule__BaseJRExpr__FieldTokenAssignment_0 ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:901:1: ( ( rule__BaseJRExpr__FieldTokenAssignment_0 ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:902:1: ( rule__BaseJRExpr__FieldTokenAssignment_0 )
                    {
                     before(grammarAccess.getBaseJRExprAccess().getFieldTokenAssignment_0()); 
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:903:1: ( rule__BaseJRExpr__FieldTokenAssignment_0 )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:903:2: rule__BaseJRExpr__FieldTokenAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BaseJRExpr__FieldTokenAssignment_0_in_rule__BaseJRExpr__Alternatives1860);
                    rule__BaseJRExpr__FieldTokenAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBaseJRExprAccess().getFieldTokenAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:907:6: ( ( rule__BaseJRExpr__ParameterTokenAssignment_1 ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:907:6: ( ( rule__BaseJRExpr__ParameterTokenAssignment_1 ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:908:1: ( rule__BaseJRExpr__ParameterTokenAssignment_1 )
                    {
                     before(grammarAccess.getBaseJRExprAccess().getParameterTokenAssignment_1()); 
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:909:1: ( rule__BaseJRExpr__ParameterTokenAssignment_1 )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:909:2: rule__BaseJRExpr__ParameterTokenAssignment_1
                    {
                    pushFollow(FOLLOW_rule__BaseJRExpr__ParameterTokenAssignment_1_in_rule__BaseJRExpr__Alternatives1878);
                    rule__BaseJRExpr__ParameterTokenAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBaseJRExprAccess().getParameterTokenAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:913:6: ( ( rule__BaseJRExpr__VariableTokenAssignment_2 ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:913:6: ( ( rule__BaseJRExpr__VariableTokenAssignment_2 ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:914:1: ( rule__BaseJRExpr__VariableTokenAssignment_2 )
                    {
                     before(grammarAccess.getBaseJRExprAccess().getVariableTokenAssignment_2()); 
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:915:1: ( rule__BaseJRExpr__VariableTokenAssignment_2 )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:915:2: rule__BaseJRExpr__VariableTokenAssignment_2
                    {
                    pushFollow(FOLLOW_rule__BaseJRExpr__VariableTokenAssignment_2_in_rule__BaseJRExpr__Alternatives1896);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:924:1: rule__BaseCommonExpression__Alternatives : ( ( ( rule__BaseCommonExpression__BasejrexprAssignment_0 ) ) | ( ( rule__BaseCommonExpression__LiteralAssignment_1 ) ) | ( ( rule__BaseCommonExpression__Group_2__0 ) ) | ( ruleMethodInvocation ) );
    public final void rule__BaseCommonExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:928:1: ( ( ( rule__BaseCommonExpression__BasejrexprAssignment_0 ) ) | ( ( rule__BaseCommonExpression__LiteralAssignment_1 ) ) | ( ( rule__BaseCommonExpression__Group_2__0 ) ) | ( ruleMethodInvocation ) )
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
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:929:1: ( ( rule__BaseCommonExpression__BasejrexprAssignment_0 ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:929:1: ( ( rule__BaseCommonExpression__BasejrexprAssignment_0 ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:930:1: ( rule__BaseCommonExpression__BasejrexprAssignment_0 )
                    {
                     before(grammarAccess.getBaseCommonExpressionAccess().getBasejrexprAssignment_0()); 
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:931:1: ( rule__BaseCommonExpression__BasejrexprAssignment_0 )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:931:2: rule__BaseCommonExpression__BasejrexprAssignment_0
                    {
                    pushFollow(FOLLOW_rule__BaseCommonExpression__BasejrexprAssignment_0_in_rule__BaseCommonExpression__Alternatives1929);
                    rule__BaseCommonExpression__BasejrexprAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBaseCommonExpressionAccess().getBasejrexprAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:935:6: ( ( rule__BaseCommonExpression__LiteralAssignment_1 ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:935:6: ( ( rule__BaseCommonExpression__LiteralAssignment_1 ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:936:1: ( rule__BaseCommonExpression__LiteralAssignment_1 )
                    {
                     before(grammarAccess.getBaseCommonExpressionAccess().getLiteralAssignment_1()); 
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:937:1: ( rule__BaseCommonExpression__LiteralAssignment_1 )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:937:2: rule__BaseCommonExpression__LiteralAssignment_1
                    {
                    pushFollow(FOLLOW_rule__BaseCommonExpression__LiteralAssignment_1_in_rule__BaseCommonExpression__Alternatives1947);
                    rule__BaseCommonExpression__LiteralAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBaseCommonExpressionAccess().getLiteralAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:941:6: ( ( rule__BaseCommonExpression__Group_2__0 ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:941:6: ( ( rule__BaseCommonExpression__Group_2__0 ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:942:1: ( rule__BaseCommonExpression__Group_2__0 )
                    {
                     before(grammarAccess.getBaseCommonExpressionAccess().getGroup_2()); 
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:943:1: ( rule__BaseCommonExpression__Group_2__0 )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:943:2: rule__BaseCommonExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__BaseCommonExpression__Group_2__0_in_rule__BaseCommonExpression__Alternatives1965);
                    rule__BaseCommonExpression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBaseCommonExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:947:6: ( ruleMethodInvocation )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:947:6: ( ruleMethodInvocation )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:948:1: ruleMethodInvocation
                    {
                     before(grammarAccess.getBaseCommonExpressionAccess().getMethodInvocationParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleMethodInvocation_in_rule__BaseCommonExpression__Alternatives1983);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:958:1: rule__Cast__Alternatives_1 : ( ( ( rule__Cast__PtypeAssignment_1_0 ) ) | ( ( rule__Cast__ArrtypeAssignment_1_1 ) ) | ( ( rule__Cast__ClazztypeAssignment_1_2 ) ) );
    public final void rule__Cast__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:962:1: ( ( ( rule__Cast__PtypeAssignment_1_0 ) ) | ( ( rule__Cast__ArrtypeAssignment_1_1 ) ) | ( ( rule__Cast__ClazztypeAssignment_1_2 ) ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:963:1: ( ( rule__Cast__PtypeAssignment_1_0 ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:963:1: ( ( rule__Cast__PtypeAssignment_1_0 ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:964:1: ( rule__Cast__PtypeAssignment_1_0 )
                    {
                     before(grammarAccess.getCastAccess().getPtypeAssignment_1_0()); 
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:965:1: ( rule__Cast__PtypeAssignment_1_0 )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:965:2: rule__Cast__PtypeAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Cast__PtypeAssignment_1_0_in_rule__Cast__Alternatives_12015);
                    rule__Cast__PtypeAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCastAccess().getPtypeAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:969:6: ( ( rule__Cast__ArrtypeAssignment_1_1 ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:969:6: ( ( rule__Cast__ArrtypeAssignment_1_1 ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:970:1: ( rule__Cast__ArrtypeAssignment_1_1 )
                    {
                     before(grammarAccess.getCastAccess().getArrtypeAssignment_1_1()); 
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:971:1: ( rule__Cast__ArrtypeAssignment_1_1 )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:971:2: rule__Cast__ArrtypeAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Cast__ArrtypeAssignment_1_1_in_rule__Cast__Alternatives_12033);
                    rule__Cast__ArrtypeAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCastAccess().getArrtypeAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:975:6: ( ( rule__Cast__ClazztypeAssignment_1_2 ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:975:6: ( ( rule__Cast__ClazztypeAssignment_1_2 ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:976:1: ( rule__Cast__ClazztypeAssignment_1_2 )
                    {
                     before(grammarAccess.getCastAccess().getClazztypeAssignment_1_2()); 
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:977:1: ( rule__Cast__ClazztypeAssignment_1_2 )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:977:2: rule__Cast__ClazztypeAssignment_1_2
                    {
                    pushFollow(FOLLOW_rule__Cast__ClazztypeAssignment_1_2_in_rule__Cast__Alternatives_12051);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:986:1: rule__EqualityExpression__Alternatives_1_0 : ( ( RULE_EQUAL ) | ( RULE_NOTEQUAL ) );
    public final void rule__EqualityExpression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:990:1: ( ( RULE_EQUAL ) | ( RULE_NOTEQUAL ) )
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
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:991:1: ( RULE_EQUAL )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:991:1: ( RULE_EQUAL )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:992:1: RULE_EQUAL
                    {
                     before(grammarAccess.getEqualityExpressionAccess().getEQUALTerminalRuleCall_1_0_0()); 
                    match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_rule__EqualityExpression__Alternatives_1_02084); 
                     after(grammarAccess.getEqualityExpressionAccess().getEQUALTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:997:6: ( RULE_NOTEQUAL )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:997:6: ( RULE_NOTEQUAL )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:998:1: RULE_NOTEQUAL
                    {
                     before(grammarAccess.getEqualityExpressionAccess().getNOTEQUALTerminalRuleCall_1_0_1()); 
                    match(input,RULE_NOTEQUAL,FOLLOW_RULE_NOTEQUAL_in_rule__EqualityExpression__Alternatives_1_02101); 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1008:1: rule__InstanceOfExpression__TargetAlternatives_1_1_0 : ( ( ruleRelationalExpression ) | ( ruleClassOrInterfaceType ) );
    public final void rule__InstanceOfExpression__TargetAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1012:1: ( ( ruleRelationalExpression ) | ( ruleClassOrInterfaceType ) )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1013:1: ( ruleRelationalExpression )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1013:1: ( ruleRelationalExpression )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1014:1: ruleRelationalExpression
                    {
                     before(grammarAccess.getInstanceOfExpressionAccess().getTargetRelationalExpressionParserRuleCall_1_1_0_0()); 
                    pushFollow(FOLLOW_ruleRelationalExpression_in_rule__InstanceOfExpression__TargetAlternatives_1_1_02133);
                    ruleRelationalExpression();

                    state._fsp--;

                     after(grammarAccess.getInstanceOfExpressionAccess().getTargetRelationalExpressionParserRuleCall_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1019:6: ( ruleClassOrInterfaceType )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1019:6: ( ruleClassOrInterfaceType )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1020:1: ruleClassOrInterfaceType
                    {
                     before(grammarAccess.getInstanceOfExpressionAccess().getTargetClassOrInterfaceTypeParserRuleCall_1_1_0_1()); 
                    pushFollow(FOLLOW_ruleClassOrInterfaceType_in_rule__InstanceOfExpression__TargetAlternatives_1_1_02150);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1030:1: rule__AdditiveExpression__Alternatives_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__AdditiveExpression__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1034:1: ( ( '+' ) | ( '-' ) )
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
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1035:1: ( '+' )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1035:1: ( '+' )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1036:1: '+'
                    {
                     before(grammarAccess.getAdditiveExpressionAccess().getPlusSignKeyword_1_0_0()); 
                    match(input,51,FOLLOW_51_in_rule__AdditiveExpression__Alternatives_1_02183); 
                     after(grammarAccess.getAdditiveExpressionAccess().getPlusSignKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1043:6: ( '-' )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1043:6: ( '-' )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1044:1: '-'
                    {
                     before(grammarAccess.getAdditiveExpressionAccess().getHyphenMinusKeyword_1_0_1()); 
                    match(input,52,FOLLOW_52_in_rule__AdditiveExpression__Alternatives_1_02203); 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1056:1: rule__MultiplicativeExpression__Alternatives_2_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__MultiplicativeExpression__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1060:1: ( ( '*' ) | ( '/' ) )
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
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1061:1: ( '*' )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1061:1: ( '*' )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1062:1: '*'
                    {
                     before(grammarAccess.getMultiplicativeExpressionAccess().getAsteriskKeyword_2_0_0()); 
                    match(input,53,FOLLOW_53_in_rule__MultiplicativeExpression__Alternatives_2_02238); 
                     after(grammarAccess.getMultiplicativeExpressionAccess().getAsteriskKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1069:6: ( '/' )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1069:6: ( '/' )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1070:1: '/'
                    {
                     before(grammarAccess.getMultiplicativeExpressionAccess().getSolidusKeyword_2_0_1()); 
                    match(input,54,FOLLOW_54_in_rule__MultiplicativeExpression__Alternatives_2_02258); 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1082:1: rule__RelationalOp__Alternatives : ( ( RULE_GT ) | ( RULE_GTE ) | ( RULE_LT ) | ( RULE_LTE ) );
    public final void rule__RelationalOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1086:1: ( ( RULE_GT ) | ( RULE_GTE ) | ( RULE_LT ) | ( RULE_LTE ) )
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
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1087:1: ( RULE_GT )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1087:1: ( RULE_GT )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1088:1: RULE_GT
                    {
                     before(grammarAccess.getRelationalOpAccess().getGTTerminalRuleCall_0()); 
                    match(input,RULE_GT,FOLLOW_RULE_GT_in_rule__RelationalOp__Alternatives2292); 
                     after(grammarAccess.getRelationalOpAccess().getGTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1093:6: ( RULE_GTE )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1093:6: ( RULE_GTE )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1094:1: RULE_GTE
                    {
                     before(grammarAccess.getRelationalOpAccess().getGTETerminalRuleCall_1()); 
                    match(input,RULE_GTE,FOLLOW_RULE_GTE_in_rule__RelationalOp__Alternatives2309); 
                     after(grammarAccess.getRelationalOpAccess().getGTETerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1099:6: ( RULE_LT )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1099:6: ( RULE_LT )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1100:1: RULE_LT
                    {
                     before(grammarAccess.getRelationalOpAccess().getLTTerminalRuleCall_2()); 
                    match(input,RULE_LT,FOLLOW_RULE_LT_in_rule__RelationalOp__Alternatives2326); 
                     after(grammarAccess.getRelationalOpAccess().getLTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1105:6: ( RULE_LTE )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1105:6: ( RULE_LTE )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1106:1: RULE_LTE
                    {
                     before(grammarAccess.getRelationalOpAccess().getLTETerminalRuleCall_3()); 
                    match(input,RULE_LTE,FOLLOW_RULE_LTE_in_rule__RelationalOp__Alternatives2343); 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1116:1: rule__Creator__Alternatives : ( ( ruleClassCreator ) | ( ruleArrayCreator ) );
    public final void rule__Creator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1120:1: ( ( ruleClassCreator ) | ( ruleArrayCreator ) )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1121:1: ( ruleClassCreator )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1121:1: ( ruleClassCreator )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1122:1: ruleClassCreator
                    {
                     before(grammarAccess.getCreatorAccess().getClassCreatorParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleClassCreator_in_rule__Creator__Alternatives2375);
                    ruleClassCreator();

                    state._fsp--;

                     after(grammarAccess.getCreatorAccess().getClassCreatorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1127:6: ( ruleArrayCreator )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1127:6: ( ruleArrayCreator )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1128:1: ruleArrayCreator
                    {
                     before(grammarAccess.getCreatorAccess().getArrayCreatorParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleArrayCreator_in_rule__Creator__Alternatives2392);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1138:1: rule__ArrayType__Alternatives_0 : ( ( ( rule__ArrayType__ClazzInterfAssignment_0_0 ) ) | ( ( rule__ArrayType__PrimtypeAssignment_0_1 ) ) );
    public final void rule__ArrayType__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1142:1: ( ( ( rule__ArrayType__ClazzInterfAssignment_0_0 ) ) | ( ( rule__ArrayType__PrimtypeAssignment_0_1 ) ) )
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
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1143:1: ( ( rule__ArrayType__ClazzInterfAssignment_0_0 ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1143:1: ( ( rule__ArrayType__ClazzInterfAssignment_0_0 ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1144:1: ( rule__ArrayType__ClazzInterfAssignment_0_0 )
                    {
                     before(grammarAccess.getArrayTypeAccess().getClazzInterfAssignment_0_0()); 
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1145:1: ( rule__ArrayType__ClazzInterfAssignment_0_0 )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1145:2: rule__ArrayType__ClazzInterfAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__ArrayType__ClazzInterfAssignment_0_0_in_rule__ArrayType__Alternatives_02424);
                    rule__ArrayType__ClazzInterfAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArrayTypeAccess().getClazzInterfAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1149:6: ( ( rule__ArrayType__PrimtypeAssignment_0_1 ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1149:6: ( ( rule__ArrayType__PrimtypeAssignment_0_1 ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1150:1: ( rule__ArrayType__PrimtypeAssignment_0_1 )
                    {
                     before(grammarAccess.getArrayTypeAccess().getPrimtypeAssignment_0_1()); 
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1151:1: ( rule__ArrayType__PrimtypeAssignment_0_1 )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1151:2: rule__ArrayType__PrimtypeAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__ArrayType__PrimtypeAssignment_0_1_in_rule__ArrayType__Alternatives_02442);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1160:1: rule__Literal__Alternatives : ( ( RULE_INTLITERAL ) | ( RULE_LONGLITERAL ) | ( RULE_FLOATLITERAL ) | ( RULE_DOUBLELITERAL ) | ( RULE_CHARLITERAL ) | ( RULE_STRINGLITERAL ) | ( RULE_TRUE ) | ( RULE_FALSE ) | ( RULE_NULL ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1164:1: ( ( RULE_INTLITERAL ) | ( RULE_LONGLITERAL ) | ( RULE_FLOATLITERAL ) | ( RULE_DOUBLELITERAL ) | ( RULE_CHARLITERAL ) | ( RULE_STRINGLITERAL ) | ( RULE_TRUE ) | ( RULE_FALSE ) | ( RULE_NULL ) )
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
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1165:1: ( RULE_INTLITERAL )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1165:1: ( RULE_INTLITERAL )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1166:1: RULE_INTLITERAL
                    {
                     before(grammarAccess.getLiteralAccess().getINTLITERALTerminalRuleCall_0()); 
                    match(input,RULE_INTLITERAL,FOLLOW_RULE_INTLITERAL_in_rule__Literal__Alternatives2475); 
                     after(grammarAccess.getLiteralAccess().getINTLITERALTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1171:6: ( RULE_LONGLITERAL )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1171:6: ( RULE_LONGLITERAL )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1172:1: RULE_LONGLITERAL
                    {
                     before(grammarAccess.getLiteralAccess().getLONGLITERALTerminalRuleCall_1()); 
                    match(input,RULE_LONGLITERAL,FOLLOW_RULE_LONGLITERAL_in_rule__Literal__Alternatives2492); 
                     after(grammarAccess.getLiteralAccess().getLONGLITERALTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1177:6: ( RULE_FLOATLITERAL )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1177:6: ( RULE_FLOATLITERAL )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1178:1: RULE_FLOATLITERAL
                    {
                     before(grammarAccess.getLiteralAccess().getFLOATLITERALTerminalRuleCall_2()); 
                    match(input,RULE_FLOATLITERAL,FOLLOW_RULE_FLOATLITERAL_in_rule__Literal__Alternatives2509); 
                     after(grammarAccess.getLiteralAccess().getFLOATLITERALTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1183:6: ( RULE_DOUBLELITERAL )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1183:6: ( RULE_DOUBLELITERAL )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1184:1: RULE_DOUBLELITERAL
                    {
                     before(grammarAccess.getLiteralAccess().getDOUBLELITERALTerminalRuleCall_3()); 
                    match(input,RULE_DOUBLELITERAL,FOLLOW_RULE_DOUBLELITERAL_in_rule__Literal__Alternatives2526); 
                     after(grammarAccess.getLiteralAccess().getDOUBLELITERALTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1189:6: ( RULE_CHARLITERAL )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1189:6: ( RULE_CHARLITERAL )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1190:1: RULE_CHARLITERAL
                    {
                     before(grammarAccess.getLiteralAccess().getCHARLITERALTerminalRuleCall_4()); 
                    match(input,RULE_CHARLITERAL,FOLLOW_RULE_CHARLITERAL_in_rule__Literal__Alternatives2543); 
                     after(grammarAccess.getLiteralAccess().getCHARLITERALTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1195:6: ( RULE_STRINGLITERAL )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1195:6: ( RULE_STRINGLITERAL )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1196:1: RULE_STRINGLITERAL
                    {
                     before(grammarAccess.getLiteralAccess().getSTRINGLITERALTerminalRuleCall_5()); 
                    match(input,RULE_STRINGLITERAL,FOLLOW_RULE_STRINGLITERAL_in_rule__Literal__Alternatives2560); 
                     after(grammarAccess.getLiteralAccess().getSTRINGLITERALTerminalRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1201:6: ( RULE_TRUE )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1201:6: ( RULE_TRUE )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1202:1: RULE_TRUE
                    {
                     before(grammarAccess.getLiteralAccess().getTRUETerminalRuleCall_6()); 
                    match(input,RULE_TRUE,FOLLOW_RULE_TRUE_in_rule__Literal__Alternatives2577); 
                     after(grammarAccess.getLiteralAccess().getTRUETerminalRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1207:6: ( RULE_FALSE )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1207:6: ( RULE_FALSE )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1208:1: RULE_FALSE
                    {
                     before(grammarAccess.getLiteralAccess().getFALSETerminalRuleCall_7()); 
                    match(input,RULE_FALSE,FOLLOW_RULE_FALSE_in_rule__Literal__Alternatives2594); 
                     after(grammarAccess.getLiteralAccess().getFALSETerminalRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1213:6: ( RULE_NULL )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1213:6: ( RULE_NULL )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1214:1: RULE_NULL
                    {
                     before(grammarAccess.getLiteralAccess().getNULLTerminalRuleCall_8()); 
                    match(input,RULE_NULL,FOLLOW_RULE_NULL_in_rule__Literal__Alternatives2611); 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1224:1: rule__PrimitiveType__Alternatives : ( ( 'boolean' ) | ( 'char' ) | ( 'byte' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) );
    public final void rule__PrimitiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1228:1: ( ( 'boolean' ) | ( 'char' ) | ( 'byte' ) | ( 'short' ) | ( 'int' ) | ( 'long' ) | ( 'float' ) | ( 'double' ) )
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
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1229:1: ( 'boolean' )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1229:1: ( 'boolean' )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1230:1: 'boolean'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getBooleanKeyword_0()); 
                    match(input,55,FOLLOW_55_in_rule__PrimitiveType__Alternatives2644); 
                     after(grammarAccess.getPrimitiveTypeAccess().getBooleanKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1237:6: ( 'char' )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1237:6: ( 'char' )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1238:1: 'char'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getCharKeyword_1()); 
                    match(input,56,FOLLOW_56_in_rule__PrimitiveType__Alternatives2664); 
                     after(grammarAccess.getPrimitiveTypeAccess().getCharKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1245:6: ( 'byte' )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1245:6: ( 'byte' )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1246:1: 'byte'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getByteKeyword_2()); 
                    match(input,57,FOLLOW_57_in_rule__PrimitiveType__Alternatives2684); 
                     after(grammarAccess.getPrimitiveTypeAccess().getByteKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1253:6: ( 'short' )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1253:6: ( 'short' )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1254:1: 'short'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getShortKeyword_3()); 
                    match(input,58,FOLLOW_58_in_rule__PrimitiveType__Alternatives2704); 
                     after(grammarAccess.getPrimitiveTypeAccess().getShortKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1261:6: ( 'int' )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1261:6: ( 'int' )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1262:1: 'int'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getIntKeyword_4()); 
                    match(input,59,FOLLOW_59_in_rule__PrimitiveType__Alternatives2724); 
                     after(grammarAccess.getPrimitiveTypeAccess().getIntKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1269:6: ( 'long' )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1269:6: ( 'long' )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1270:1: 'long'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getLongKeyword_5()); 
                    match(input,60,FOLLOW_60_in_rule__PrimitiveType__Alternatives2744); 
                     after(grammarAccess.getPrimitiveTypeAccess().getLongKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1277:6: ( 'float' )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1277:6: ( 'float' )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1278:1: 'float'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getFloatKeyword_6()); 
                    match(input,61,FOLLOW_61_in_rule__PrimitiveType__Alternatives2764); 
                     after(grammarAccess.getPrimitiveTypeAccess().getFloatKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1285:6: ( 'double' )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1285:6: ( 'double' )
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1286:1: 'double'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getDoubleKeyword_7()); 
                    match(input,62,FOLLOW_62_in_rule__PrimitiveType__Alternatives2784); 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1300:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1304:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1305:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__02816);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__02819);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1312:1: rule__Expression__Group_1__0__Impl : ( ( ruleCast )? ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1316:1: ( ( ( ruleCast )? ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1317:1: ( ( ruleCast )? )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1317:1: ( ( ruleCast )? )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1318:1: ( ruleCast )?
            {
             before(grammarAccess.getExpressionAccess().getCastParserRuleCall_1_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1319:1: ( ruleCast )?
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1319:3: ruleCast
                    {
                    pushFollow(FOLLOW_ruleCast_in_rule__Expression__Group_1__0__Impl2847);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1329:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1333:1: ( rule__Expression__Group_1__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1334:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__12878);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1340:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__CondExprAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1344:1: ( ( ( rule__Expression__CondExprAssignment_1_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1345:1: ( ( rule__Expression__CondExprAssignment_1_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1345:1: ( ( rule__Expression__CondExprAssignment_1_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1346:1: ( rule__Expression__CondExprAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getCondExprAssignment_1_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1347:1: ( rule__Expression__CondExprAssignment_1_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1347:2: rule__Expression__CondExprAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expression__CondExprAssignment_1_1_in_rule__Expression__Group_1__1__Impl2905);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1361:1: rule__MethodInvocation__Group__0 : rule__MethodInvocation__Group__0__Impl rule__MethodInvocation__Group__1 ;
    public final void rule__MethodInvocation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1365:1: ( rule__MethodInvocation__Group__0__Impl rule__MethodInvocation__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1366:2: rule__MethodInvocation__Group__0__Impl rule__MethodInvocation__Group__1
            {
            pushFollow(FOLLOW_rule__MethodInvocation__Group__0__Impl_in_rule__MethodInvocation__Group__02939);
            rule__MethodInvocation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MethodInvocation__Group__1_in_rule__MethodInvocation__Group__02942);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1373:1: rule__MethodInvocation__Group__0__Impl : ( ( rule__MethodInvocation__MethodNameAssignment_0 ) ) ;
    public final void rule__MethodInvocation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1377:1: ( ( ( rule__MethodInvocation__MethodNameAssignment_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1378:1: ( ( rule__MethodInvocation__MethodNameAssignment_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1378:1: ( ( rule__MethodInvocation__MethodNameAssignment_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1379:1: ( rule__MethodInvocation__MethodNameAssignment_0 )
            {
             before(grammarAccess.getMethodInvocationAccess().getMethodNameAssignment_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1380:1: ( rule__MethodInvocation__MethodNameAssignment_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1380:2: rule__MethodInvocation__MethodNameAssignment_0
            {
            pushFollow(FOLLOW_rule__MethodInvocation__MethodNameAssignment_0_in_rule__MethodInvocation__Group__0__Impl2969);
            rule__MethodInvocation__MethodNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodInvocationAccess().getMethodNameAssignment_0()); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1390:1: rule__MethodInvocation__Group__1 : rule__MethodInvocation__Group__1__Impl ;
    public final void rule__MethodInvocation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1394:1: ( rule__MethodInvocation__Group__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1395:2: rule__MethodInvocation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MethodInvocation__Group__1__Impl_in_rule__MethodInvocation__Group__12999);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1401:1: rule__MethodInvocation__Group__1__Impl : ( ( rule__MethodInvocation__ArgsAssignment_1 ) ) ;
    public final void rule__MethodInvocation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1405:1: ( ( ( rule__MethodInvocation__ArgsAssignment_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1406:1: ( ( rule__MethodInvocation__ArgsAssignment_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1406:1: ( ( rule__MethodInvocation__ArgsAssignment_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1407:1: ( rule__MethodInvocation__ArgsAssignment_1 )
            {
             before(grammarAccess.getMethodInvocationAccess().getArgsAssignment_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1408:1: ( rule__MethodInvocation__ArgsAssignment_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1408:2: rule__MethodInvocation__ArgsAssignment_1
            {
            pushFollow(FOLLOW_rule__MethodInvocation__ArgsAssignment_1_in_rule__MethodInvocation__Group__1__Impl3026);
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


    // $ANTLR start "rule__Arguments__Group__0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1422:1: rule__Arguments__Group__0 : rule__Arguments__Group__0__Impl rule__Arguments__Group__1 ;
    public final void rule__Arguments__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1426:1: ( rule__Arguments__Group__0__Impl rule__Arguments__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1427:2: rule__Arguments__Group__0__Impl rule__Arguments__Group__1
            {
            pushFollow(FOLLOW_rule__Arguments__Group__0__Impl_in_rule__Arguments__Group__03060);
            rule__Arguments__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Arguments__Group__1_in_rule__Arguments__Group__03063);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1434:1: rule__Arguments__Group__0__Impl : ( ( rule__Arguments__LeftPAssignment_0 ) ) ;
    public final void rule__Arguments__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1438:1: ( ( ( rule__Arguments__LeftPAssignment_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1439:1: ( ( rule__Arguments__LeftPAssignment_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1439:1: ( ( rule__Arguments__LeftPAssignment_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1440:1: ( rule__Arguments__LeftPAssignment_0 )
            {
             before(grammarAccess.getArgumentsAccess().getLeftPAssignment_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1441:1: ( rule__Arguments__LeftPAssignment_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1441:2: rule__Arguments__LeftPAssignment_0
            {
            pushFollow(FOLLOW_rule__Arguments__LeftPAssignment_0_in_rule__Arguments__Group__0__Impl3090);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1451:1: rule__Arguments__Group__1 : rule__Arguments__Group__1__Impl rule__Arguments__Group__2 ;
    public final void rule__Arguments__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1455:1: ( rule__Arguments__Group__1__Impl rule__Arguments__Group__2 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1456:2: rule__Arguments__Group__1__Impl rule__Arguments__Group__2
            {
            pushFollow(FOLLOW_rule__Arguments__Group__1__Impl_in_rule__Arguments__Group__13120);
            rule__Arguments__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Arguments__Group__2_in_rule__Arguments__Group__13123);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1463:1: rule__Arguments__Group__1__Impl : ( ( rule__Arguments__ExprLstAssignment_1 )? ) ;
    public final void rule__Arguments__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1467:1: ( ( ( rule__Arguments__ExprLstAssignment_1 )? ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1468:1: ( ( rule__Arguments__ExprLstAssignment_1 )? )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1468:1: ( ( rule__Arguments__ExprLstAssignment_1 )? )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1469:1: ( rule__Arguments__ExprLstAssignment_1 )?
            {
             before(grammarAccess.getArgumentsAccess().getExprLstAssignment_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1470:1: ( rule__Arguments__ExprLstAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_INTLITERAL && LA15_0<=RULE_LPAREN)||LA15_0==RULE_NOT||LA15_0==RULE_NEW||(LA15_0>=RULE_FIELDTOKEN && LA15_0<=RULE_IDENTIFIER)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1470:2: rule__Arguments__ExprLstAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Arguments__ExprLstAssignment_1_in_rule__Arguments__Group__1__Impl3150);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1480:1: rule__Arguments__Group__2 : rule__Arguments__Group__2__Impl ;
    public final void rule__Arguments__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1484:1: ( rule__Arguments__Group__2__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1485:2: rule__Arguments__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Arguments__Group__2__Impl_in_rule__Arguments__Group__23181);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1491:1: rule__Arguments__Group__2__Impl : ( ( rule__Arguments__RightPAssignment_2 ) ) ;
    public final void rule__Arguments__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1495:1: ( ( ( rule__Arguments__RightPAssignment_2 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1496:1: ( ( rule__Arguments__RightPAssignment_2 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1496:1: ( ( rule__Arguments__RightPAssignment_2 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1497:1: ( rule__Arguments__RightPAssignment_2 )
            {
             before(grammarAccess.getArgumentsAccess().getRightPAssignment_2()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1498:1: ( rule__Arguments__RightPAssignment_2 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1498:2: rule__Arguments__RightPAssignment_2
            {
            pushFollow(FOLLOW_rule__Arguments__RightPAssignment_2_in_rule__Arguments__Group__2__Impl3208);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1514:1: rule__ExpressionList__Group__0 : rule__ExpressionList__Group__0__Impl rule__ExpressionList__Group__1 ;
    public final void rule__ExpressionList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1518:1: ( rule__ExpressionList__Group__0__Impl rule__ExpressionList__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1519:2: rule__ExpressionList__Group__0__Impl rule__ExpressionList__Group__1
            {
            pushFollow(FOLLOW_rule__ExpressionList__Group__0__Impl_in_rule__ExpressionList__Group__03244);
            rule__ExpressionList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpressionList__Group__1_in_rule__ExpressionList__Group__03247);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1526:1: rule__ExpressionList__Group__0__Impl : ( ( rule__ExpressionList__ExpressionsAssignment_0 ) ) ;
    public final void rule__ExpressionList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1530:1: ( ( ( rule__ExpressionList__ExpressionsAssignment_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1531:1: ( ( rule__ExpressionList__ExpressionsAssignment_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1531:1: ( ( rule__ExpressionList__ExpressionsAssignment_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1532:1: ( rule__ExpressionList__ExpressionsAssignment_0 )
            {
             before(grammarAccess.getExpressionListAccess().getExpressionsAssignment_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1533:1: ( rule__ExpressionList__ExpressionsAssignment_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1533:2: rule__ExpressionList__ExpressionsAssignment_0
            {
            pushFollow(FOLLOW_rule__ExpressionList__ExpressionsAssignment_0_in_rule__ExpressionList__Group__0__Impl3274);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1543:1: rule__ExpressionList__Group__1 : rule__ExpressionList__Group__1__Impl ;
    public final void rule__ExpressionList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1547:1: ( rule__ExpressionList__Group__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1548:2: rule__ExpressionList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExpressionList__Group__1__Impl_in_rule__ExpressionList__Group__13304);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1554:1: rule__ExpressionList__Group__1__Impl : ( ( rule__ExpressionList__Group_1__0 )* ) ;
    public final void rule__ExpressionList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1558:1: ( ( ( rule__ExpressionList__Group_1__0 )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1559:1: ( ( rule__ExpressionList__Group_1__0 )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1559:1: ( ( rule__ExpressionList__Group_1__0 )* )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1560:1: ( rule__ExpressionList__Group_1__0 )*
            {
             before(grammarAccess.getExpressionListAccess().getGroup_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1561:1: ( rule__ExpressionList__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_COMMA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1561:2: rule__ExpressionList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ExpressionList__Group_1__0_in_rule__ExpressionList__Group__1__Impl3331);
            	    rule__ExpressionList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1575:1: rule__ExpressionList__Group_1__0 : rule__ExpressionList__Group_1__0__Impl rule__ExpressionList__Group_1__1 ;
    public final void rule__ExpressionList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1579:1: ( rule__ExpressionList__Group_1__0__Impl rule__ExpressionList__Group_1__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1580:2: rule__ExpressionList__Group_1__0__Impl rule__ExpressionList__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExpressionList__Group_1__0__Impl_in_rule__ExpressionList__Group_1__03366);
            rule__ExpressionList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExpressionList__Group_1__1_in_rule__ExpressionList__Group_1__03369);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1587:1: rule__ExpressionList__Group_1__0__Impl : ( ( rule__ExpressionList__CommasAssignment_1_0 ) ) ;
    public final void rule__ExpressionList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1591:1: ( ( ( rule__ExpressionList__CommasAssignment_1_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1592:1: ( ( rule__ExpressionList__CommasAssignment_1_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1592:1: ( ( rule__ExpressionList__CommasAssignment_1_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1593:1: ( rule__ExpressionList__CommasAssignment_1_0 )
            {
             before(grammarAccess.getExpressionListAccess().getCommasAssignment_1_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1594:1: ( rule__ExpressionList__CommasAssignment_1_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1594:2: rule__ExpressionList__CommasAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ExpressionList__CommasAssignment_1_0_in_rule__ExpressionList__Group_1__0__Impl3396);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1604:1: rule__ExpressionList__Group_1__1 : rule__ExpressionList__Group_1__1__Impl ;
    public final void rule__ExpressionList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1608:1: ( rule__ExpressionList__Group_1__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1609:2: rule__ExpressionList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ExpressionList__Group_1__1__Impl_in_rule__ExpressionList__Group_1__13426);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1615:1: rule__ExpressionList__Group_1__1__Impl : ( ( rule__ExpressionList__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__ExpressionList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1619:1: ( ( ( rule__ExpressionList__ExpressionsAssignment_1_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1620:1: ( ( rule__ExpressionList__ExpressionsAssignment_1_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1620:1: ( ( rule__ExpressionList__ExpressionsAssignment_1_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1621:1: ( rule__ExpressionList__ExpressionsAssignment_1_1 )
            {
             before(grammarAccess.getExpressionListAccess().getExpressionsAssignment_1_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1622:1: ( rule__ExpressionList__ExpressionsAssignment_1_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1622:2: rule__ExpressionList__ExpressionsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ExpressionList__ExpressionsAssignment_1_1_in_rule__ExpressionList__Group_1__1__Impl3453);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1636:1: rule__BaseCommonExpression__Group_2__0 : rule__BaseCommonExpression__Group_2__0__Impl rule__BaseCommonExpression__Group_2__1 ;
    public final void rule__BaseCommonExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1640:1: ( rule__BaseCommonExpression__Group_2__0__Impl rule__BaseCommonExpression__Group_2__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1641:2: rule__BaseCommonExpression__Group_2__0__Impl rule__BaseCommonExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__BaseCommonExpression__Group_2__0__Impl_in_rule__BaseCommonExpression__Group_2__03487);
            rule__BaseCommonExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseCommonExpression__Group_2__1_in_rule__BaseCommonExpression__Group_2__03490);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1648:1: rule__BaseCommonExpression__Group_2__0__Impl : ( RULE_LPAREN ) ;
    public final void rule__BaseCommonExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1652:1: ( ( RULE_LPAREN ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1653:1: ( RULE_LPAREN )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1653:1: ( RULE_LPAREN )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1654:1: RULE_LPAREN
            {
             before(grammarAccess.getBaseCommonExpressionAccess().getLPARENTerminalRuleCall_2_0()); 
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rule__BaseCommonExpression__Group_2__0__Impl3517); 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1665:1: rule__BaseCommonExpression__Group_2__1 : rule__BaseCommonExpression__Group_2__1__Impl rule__BaseCommonExpression__Group_2__2 ;
    public final void rule__BaseCommonExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1669:1: ( rule__BaseCommonExpression__Group_2__1__Impl rule__BaseCommonExpression__Group_2__2 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1670:2: rule__BaseCommonExpression__Group_2__1__Impl rule__BaseCommonExpression__Group_2__2
            {
            pushFollow(FOLLOW_rule__BaseCommonExpression__Group_2__1__Impl_in_rule__BaseCommonExpression__Group_2__13546);
            rule__BaseCommonExpression__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseCommonExpression__Group_2__2_in_rule__BaseCommonExpression__Group_2__13549);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1677:1: rule__BaseCommonExpression__Group_2__1__Impl : ( ruleExpression ) ;
    public final void rule__BaseCommonExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1681:1: ( ( ruleExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1682:1: ( ruleExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1682:1: ( ruleExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1683:1: ruleExpression
            {
             before(grammarAccess.getBaseCommonExpressionAccess().getExpressionParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__BaseCommonExpression__Group_2__1__Impl3576);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1694:1: rule__BaseCommonExpression__Group_2__2 : rule__BaseCommonExpression__Group_2__2__Impl ;
    public final void rule__BaseCommonExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1698:1: ( rule__BaseCommonExpression__Group_2__2__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1699:2: rule__BaseCommonExpression__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__BaseCommonExpression__Group_2__2__Impl_in_rule__BaseCommonExpression__Group_2__23605);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1705:1: rule__BaseCommonExpression__Group_2__2__Impl : ( RULE_RPAREN ) ;
    public final void rule__BaseCommonExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1709:1: ( ( RULE_RPAREN ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1710:1: ( RULE_RPAREN )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1710:1: ( RULE_RPAREN )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1711:1: RULE_RPAREN
            {
             before(grammarAccess.getBaseCommonExpressionAccess().getRPARENTerminalRuleCall_2_2()); 
            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rule__BaseCommonExpression__Group_2__2__Impl3632); 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1728:1: rule__Cast__Group__0 : rule__Cast__Group__0__Impl rule__Cast__Group__1 ;
    public final void rule__Cast__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1732:1: ( rule__Cast__Group__0__Impl rule__Cast__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1733:2: rule__Cast__Group__0__Impl rule__Cast__Group__1
            {
            pushFollow(FOLLOW_rule__Cast__Group__0__Impl_in_rule__Cast__Group__03667);
            rule__Cast__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cast__Group__1_in_rule__Cast__Group__03670);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1740:1: rule__Cast__Group__0__Impl : ( ( rule__Cast__LparAssignment_0 ) ) ;
    public final void rule__Cast__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1744:1: ( ( ( rule__Cast__LparAssignment_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1745:1: ( ( rule__Cast__LparAssignment_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1745:1: ( ( rule__Cast__LparAssignment_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1746:1: ( rule__Cast__LparAssignment_0 )
            {
             before(grammarAccess.getCastAccess().getLparAssignment_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1747:1: ( rule__Cast__LparAssignment_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1747:2: rule__Cast__LparAssignment_0
            {
            pushFollow(FOLLOW_rule__Cast__LparAssignment_0_in_rule__Cast__Group__0__Impl3697);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1757:1: rule__Cast__Group__1 : rule__Cast__Group__1__Impl rule__Cast__Group__2 ;
    public final void rule__Cast__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1761:1: ( rule__Cast__Group__1__Impl rule__Cast__Group__2 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1762:2: rule__Cast__Group__1__Impl rule__Cast__Group__2
            {
            pushFollow(FOLLOW_rule__Cast__Group__1__Impl_in_rule__Cast__Group__13727);
            rule__Cast__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cast__Group__2_in_rule__Cast__Group__13730);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1769:1: rule__Cast__Group__1__Impl : ( ( rule__Cast__Alternatives_1 ) ) ;
    public final void rule__Cast__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1773:1: ( ( ( rule__Cast__Alternatives_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1774:1: ( ( rule__Cast__Alternatives_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1774:1: ( ( rule__Cast__Alternatives_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1775:1: ( rule__Cast__Alternatives_1 )
            {
             before(grammarAccess.getCastAccess().getAlternatives_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1776:1: ( rule__Cast__Alternatives_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1776:2: rule__Cast__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Cast__Alternatives_1_in_rule__Cast__Group__1__Impl3757);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1786:1: rule__Cast__Group__2 : rule__Cast__Group__2__Impl ;
    public final void rule__Cast__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1790:1: ( rule__Cast__Group__2__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1791:2: rule__Cast__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Cast__Group__2__Impl_in_rule__Cast__Group__23787);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1797:1: rule__Cast__Group__2__Impl : ( ( rule__Cast__RparAssignment_2 ) ) ;
    public final void rule__Cast__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1801:1: ( ( ( rule__Cast__RparAssignment_2 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1802:1: ( ( rule__Cast__RparAssignment_2 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1802:1: ( ( rule__Cast__RparAssignment_2 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1803:1: ( rule__Cast__RparAssignment_2 )
            {
             before(grammarAccess.getCastAccess().getRparAssignment_2()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1804:1: ( rule__Cast__RparAssignment_2 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1804:2: rule__Cast__RparAssignment_2
            {
            pushFollow(FOLLOW_rule__Cast__RparAssignment_2_in_rule__Cast__Group__2__Impl3814);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1820:1: rule__ConditionalExpression__Group__0 : rule__ConditionalExpression__Group__0__Impl rule__ConditionalExpression__Group__1 ;
    public final void rule__ConditionalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1824:1: ( rule__ConditionalExpression__Group__0__Impl rule__ConditionalExpression__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1825:2: rule__ConditionalExpression__Group__0__Impl rule__ConditionalExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__0__Impl_in_rule__ConditionalExpression__Group__03850);
            rule__ConditionalExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionalExpression__Group__1_in_rule__ConditionalExpression__Group__03853);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1832:1: rule__ConditionalExpression__Group__0__Impl : ( ruleTestExpression ) ;
    public final void rule__ConditionalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1836:1: ( ( ruleTestExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1837:1: ( ruleTestExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1837:1: ( ruleTestExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1838:1: ruleTestExpression
            {
             before(grammarAccess.getConditionalExpressionAccess().getTestExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTestExpression_in_rule__ConditionalExpression__Group__0__Impl3880);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1849:1: rule__ConditionalExpression__Group__1 : rule__ConditionalExpression__Group__1__Impl ;
    public final void rule__ConditionalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1853:1: ( rule__ConditionalExpression__Group__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1854:2: rule__ConditionalExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group__1__Impl_in_rule__ConditionalExpression__Group__13909);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1860:1: rule__ConditionalExpression__Group__1__Impl : ( ( rule__ConditionalExpression__Group_1__0 )? ) ;
    public final void rule__ConditionalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1864:1: ( ( ( rule__ConditionalExpression__Group_1__0 )? ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1865:1: ( ( rule__ConditionalExpression__Group_1__0 )? )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1865:1: ( ( rule__ConditionalExpression__Group_1__0 )? )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1866:1: ( rule__ConditionalExpression__Group_1__0 )?
            {
             before(grammarAccess.getConditionalExpressionAccess().getGroup_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1867:1: ( rule__ConditionalExpression__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==63) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1867:2: rule__ConditionalExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ConditionalExpression__Group_1__0_in_rule__ConditionalExpression__Group__1__Impl3936);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1881:1: rule__ConditionalExpression__Group_1__0 : rule__ConditionalExpression__Group_1__0__Impl rule__ConditionalExpression__Group_1__1 ;
    public final void rule__ConditionalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1885:1: ( rule__ConditionalExpression__Group_1__0__Impl rule__ConditionalExpression__Group_1__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1886:2: rule__ConditionalExpression__Group_1__0__Impl rule__ConditionalExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group_1__0__Impl_in_rule__ConditionalExpression__Group_1__03971);
            rule__ConditionalExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionalExpression__Group_1__1_in_rule__ConditionalExpression__Group_1__03974);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1893:1: rule__ConditionalExpression__Group_1__0__Impl : ( '?' ) ;
    public final void rule__ConditionalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1897:1: ( ( '?' ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1898:1: ( '?' )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1898:1: ( '?' )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1899:1: '?'
            {
             before(grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_0()); 
            match(input,63,FOLLOW_63_in_rule__ConditionalExpression__Group_1__0__Impl4002); 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1912:1: rule__ConditionalExpression__Group_1__1 : rule__ConditionalExpression__Group_1__1__Impl rule__ConditionalExpression__Group_1__2 ;
    public final void rule__ConditionalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1916:1: ( rule__ConditionalExpression__Group_1__1__Impl rule__ConditionalExpression__Group_1__2 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1917:2: rule__ConditionalExpression__Group_1__1__Impl rule__ConditionalExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group_1__1__Impl_in_rule__ConditionalExpression__Group_1__14033);
            rule__ConditionalExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionalExpression__Group_1__2_in_rule__ConditionalExpression__Group_1__14036);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1924:1: rule__ConditionalExpression__Group_1__1__Impl : ( ( rule__ConditionalExpression__OkReturnedExprAssignment_1_1 ) ) ;
    public final void rule__ConditionalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1928:1: ( ( ( rule__ConditionalExpression__OkReturnedExprAssignment_1_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1929:1: ( ( rule__ConditionalExpression__OkReturnedExprAssignment_1_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1929:1: ( ( rule__ConditionalExpression__OkReturnedExprAssignment_1_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1930:1: ( rule__ConditionalExpression__OkReturnedExprAssignment_1_1 )
            {
             before(grammarAccess.getConditionalExpressionAccess().getOkReturnedExprAssignment_1_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1931:1: ( rule__ConditionalExpression__OkReturnedExprAssignment_1_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1931:2: rule__ConditionalExpression__OkReturnedExprAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__OkReturnedExprAssignment_1_1_in_rule__ConditionalExpression__Group_1__1__Impl4063);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1941:1: rule__ConditionalExpression__Group_1__2 : rule__ConditionalExpression__Group_1__2__Impl rule__ConditionalExpression__Group_1__3 ;
    public final void rule__ConditionalExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1945:1: ( rule__ConditionalExpression__Group_1__2__Impl rule__ConditionalExpression__Group_1__3 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1946:2: rule__ConditionalExpression__Group_1__2__Impl rule__ConditionalExpression__Group_1__3
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group_1__2__Impl_in_rule__ConditionalExpression__Group_1__24093);
            rule__ConditionalExpression__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConditionalExpression__Group_1__3_in_rule__ConditionalExpression__Group_1__24096);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1953:1: rule__ConditionalExpression__Group_1__2__Impl : ( ':' ) ;
    public final void rule__ConditionalExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1957:1: ( ( ':' ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1958:1: ( ':' )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1958:1: ( ':' )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1959:1: ':'
            {
             before(grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_2()); 
            match(input,64,FOLLOW_64_in_rule__ConditionalExpression__Group_1__2__Impl4124); 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1972:1: rule__ConditionalExpression__Group_1__3 : rule__ConditionalExpression__Group_1__3__Impl ;
    public final void rule__ConditionalExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1976:1: ( rule__ConditionalExpression__Group_1__3__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1977:2: rule__ConditionalExpression__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__Group_1__3__Impl_in_rule__ConditionalExpression__Group_1__34155);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1983:1: rule__ConditionalExpression__Group_1__3__Impl : ( ( rule__ConditionalExpression__KoReturnedExprAssignment_1_3 ) ) ;
    public final void rule__ConditionalExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1987:1: ( ( ( rule__ConditionalExpression__KoReturnedExprAssignment_1_3 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1988:1: ( ( rule__ConditionalExpression__KoReturnedExprAssignment_1_3 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1988:1: ( ( rule__ConditionalExpression__KoReturnedExprAssignment_1_3 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1989:1: ( rule__ConditionalExpression__KoReturnedExprAssignment_1_3 )
            {
             before(grammarAccess.getConditionalExpressionAccess().getKoReturnedExprAssignment_1_3()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1990:1: ( rule__ConditionalExpression__KoReturnedExprAssignment_1_3 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:1990:2: rule__ConditionalExpression__KoReturnedExprAssignment_1_3
            {
            pushFollow(FOLLOW_rule__ConditionalExpression__KoReturnedExprAssignment_1_3_in_rule__ConditionalExpression__Group_1__3__Impl4182);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2008:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2012:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2013:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__04220);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__04223);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2020:1: rule__OrExpression__Group__0__Impl : ( ( rule__OrExpression__AndExpAssignment_0 ) ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2024:1: ( ( ( rule__OrExpression__AndExpAssignment_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2025:1: ( ( rule__OrExpression__AndExpAssignment_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2025:1: ( ( rule__OrExpression__AndExpAssignment_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2026:1: ( rule__OrExpression__AndExpAssignment_0 )
            {
             before(grammarAccess.getOrExpressionAccess().getAndExpAssignment_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2027:1: ( rule__OrExpression__AndExpAssignment_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2027:2: rule__OrExpression__AndExpAssignment_0
            {
            pushFollow(FOLLOW_rule__OrExpression__AndExpAssignment_0_in_rule__OrExpression__Group__0__Impl4250);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2037:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2041:1: ( rule__OrExpression__Group__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2042:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__14280);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2048:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2052:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2053:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2053:1: ( ( rule__OrExpression__Group_1__0 )* )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2054:1: ( rule__OrExpression__Group_1__0 )*
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2055:1: ( rule__OrExpression__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==65) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2055:2: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl4307);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2069:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2073:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2074:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__04342);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__04345);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2081:1: rule__OrExpression__Group_1__0__Impl : ( '||' ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2085:1: ( ( '||' ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2086:1: ( '||' )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2086:1: ( '||' )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2087:1: '||'
            {
             before(grammarAccess.getOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_0()); 
            match(input,65,FOLLOW_65_in_rule__OrExpression__Group_1__0__Impl4373); 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2100:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2104:1: ( rule__OrExpression__Group_1__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2105:2: rule__OrExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__14404);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2111:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__AndExpAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2115:1: ( ( ( rule__OrExpression__AndExpAssignment_1_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2116:1: ( ( rule__OrExpression__AndExpAssignment_1_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2116:1: ( ( rule__OrExpression__AndExpAssignment_1_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2117:1: ( rule__OrExpression__AndExpAssignment_1_1 )
            {
             before(grammarAccess.getOrExpressionAccess().getAndExpAssignment_1_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2118:1: ( rule__OrExpression__AndExpAssignment_1_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2118:2: rule__OrExpression__AndExpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__OrExpression__AndExpAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl4431);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2132:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2136:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2137:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__04465);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__04468);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2144:1: rule__AndExpression__Group__0__Impl : ( ( rule__AndExpression__PrimaryCondAssignment_0 ) ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2148:1: ( ( ( rule__AndExpression__PrimaryCondAssignment_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2149:1: ( ( rule__AndExpression__PrimaryCondAssignment_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2149:1: ( ( rule__AndExpression__PrimaryCondAssignment_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2150:1: ( rule__AndExpression__PrimaryCondAssignment_0 )
            {
             before(grammarAccess.getAndExpressionAccess().getPrimaryCondAssignment_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2151:1: ( rule__AndExpression__PrimaryCondAssignment_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2151:2: rule__AndExpression__PrimaryCondAssignment_0
            {
            pushFollow(FOLLOW_rule__AndExpression__PrimaryCondAssignment_0_in_rule__AndExpression__Group__0__Impl4495);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2161:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2165:1: ( rule__AndExpression__Group__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2166:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__14525);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2172:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2176:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2177:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2177:1: ( ( rule__AndExpression__Group_1__0 )* )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2178:1: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2179:1: ( rule__AndExpression__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==66) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2179:2: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl4552);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2193:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2197:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2198:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__04587);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__04590);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2205:1: rule__AndExpression__Group_1__0__Impl : ( '&&' ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2209:1: ( ( '&&' ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2210:1: ( '&&' )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2210:1: ( '&&' )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2211:1: '&&'
            {
             before(grammarAccess.getAndExpressionAccess().getAmpersandAmpersandKeyword_1_0()); 
            match(input,66,FOLLOW_66_in_rule__AndExpression__Group_1__0__Impl4618); 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2224:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2228:1: ( rule__AndExpression__Group_1__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2229:2: rule__AndExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__14649);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2235:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__PrimaryCondAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2239:1: ( ( ( rule__AndExpression__PrimaryCondAssignment_1_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2240:1: ( ( rule__AndExpression__PrimaryCondAssignment_1_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2240:1: ( ( rule__AndExpression__PrimaryCondAssignment_1_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2241:1: ( rule__AndExpression__PrimaryCondAssignment_1_1 )
            {
             before(grammarAccess.getAndExpressionAccess().getPrimaryCondAssignment_1_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2242:1: ( rule__AndExpression__PrimaryCondAssignment_1_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2242:2: rule__AndExpression__PrimaryCondAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AndExpression__PrimaryCondAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl4676);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2256:1: rule__BaseBooleanExpr__Group__0 : rule__BaseBooleanExpr__Group__0__Impl rule__BaseBooleanExpr__Group__1 ;
    public final void rule__BaseBooleanExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2260:1: ( rule__BaseBooleanExpr__Group__0__Impl rule__BaseBooleanExpr__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2261:2: rule__BaseBooleanExpr__Group__0__Impl rule__BaseBooleanExpr__Group__1
            {
            pushFollow(FOLLOW_rule__BaseBooleanExpr__Group__0__Impl_in_rule__BaseBooleanExpr__Group__04710);
            rule__BaseBooleanExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BaseBooleanExpr__Group__1_in_rule__BaseBooleanExpr__Group__04713);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2268:1: rule__BaseBooleanExpr__Group__0__Impl : ( ( RULE_NOT )? ) ;
    public final void rule__BaseBooleanExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2272:1: ( ( ( RULE_NOT )? ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2273:1: ( ( RULE_NOT )? )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2273:1: ( ( RULE_NOT )? )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2274:1: ( RULE_NOT )?
            {
             before(grammarAccess.getBaseBooleanExprAccess().getNOTTerminalRuleCall_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2275:1: ( RULE_NOT )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_NOT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2275:3: RULE_NOT
                    {
                    match(input,RULE_NOT,FOLLOW_RULE_NOT_in_rule__BaseBooleanExpr__Group__0__Impl4741); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2285:1: rule__BaseBooleanExpr__Group__1 : rule__BaseBooleanExpr__Group__1__Impl ;
    public final void rule__BaseBooleanExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2289:1: ( rule__BaseBooleanExpr__Group__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2290:2: rule__BaseBooleanExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BaseBooleanExpr__Group__1__Impl_in_rule__BaseBooleanExpr__Group__14772);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2296:1: rule__BaseBooleanExpr__Group__1__Impl : ( ruleEqualityExpression ) ;
    public final void rule__BaseBooleanExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2300:1: ( ( ruleEqualityExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2301:1: ( ruleEqualityExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2301:1: ( ruleEqualityExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2302:1: ruleEqualityExpression
            {
             before(grammarAccess.getBaseBooleanExprAccess().getEqualityExpressionParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleEqualityExpression_in_rule__BaseBooleanExpr__Group__1__Impl4799);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2317:1: rule__EqualityExpression__Group__0 : rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 ;
    public final void rule__EqualityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2321:1: ( rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2322:2: rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group__0__Impl_in_rule__EqualityExpression__Group__04832);
            rule__EqualityExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqualityExpression__Group__1_in_rule__EqualityExpression__Group__04835);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2329:1: rule__EqualityExpression__Group__0__Impl : ( ( rule__EqualityExpression__InstanceofAssignment_0 ) ) ;
    public final void rule__EqualityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2333:1: ( ( ( rule__EqualityExpression__InstanceofAssignment_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2334:1: ( ( rule__EqualityExpression__InstanceofAssignment_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2334:1: ( ( rule__EqualityExpression__InstanceofAssignment_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2335:1: ( rule__EqualityExpression__InstanceofAssignment_0 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getInstanceofAssignment_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2336:1: ( rule__EqualityExpression__InstanceofAssignment_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2336:2: rule__EqualityExpression__InstanceofAssignment_0
            {
            pushFollow(FOLLOW_rule__EqualityExpression__InstanceofAssignment_0_in_rule__EqualityExpression__Group__0__Impl4862);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2346:1: rule__EqualityExpression__Group__1 : rule__EqualityExpression__Group__1__Impl ;
    public final void rule__EqualityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2350:1: ( rule__EqualityExpression__Group__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2351:2: rule__EqualityExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group__1__Impl_in_rule__EqualityExpression__Group__14892);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2357:1: rule__EqualityExpression__Group__1__Impl : ( ( rule__EqualityExpression__Group_1__0 )* ) ;
    public final void rule__EqualityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2361:1: ( ( ( rule__EqualityExpression__Group_1__0 )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2362:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2362:1: ( ( rule__EqualityExpression__Group_1__0 )* )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2363:1: ( rule__EqualityExpression__Group_1__0 )*
            {
             before(grammarAccess.getEqualityExpressionAccess().getGroup_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2364:1: ( rule__EqualityExpression__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_EQUAL && LA21_0<=RULE_NOTEQUAL)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2364:2: rule__EqualityExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__EqualityExpression__Group_1__0_in_rule__EqualityExpression__Group__1__Impl4919);
            	    rule__EqualityExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2378:1: rule__EqualityExpression__Group_1__0 : rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 ;
    public final void rule__EqualityExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2382:1: ( rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2383:2: rule__EqualityExpression__Group_1__0__Impl rule__EqualityExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group_1__0__Impl_in_rule__EqualityExpression__Group_1__04954);
            rule__EqualityExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqualityExpression__Group_1__1_in_rule__EqualityExpression__Group_1__04957);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2390:1: rule__EqualityExpression__Group_1__0__Impl : ( ( rule__EqualityExpression__Alternatives_1_0 ) ) ;
    public final void rule__EqualityExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2394:1: ( ( ( rule__EqualityExpression__Alternatives_1_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2395:1: ( ( rule__EqualityExpression__Alternatives_1_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2395:1: ( ( rule__EqualityExpression__Alternatives_1_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2396:1: ( rule__EqualityExpression__Alternatives_1_0 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getAlternatives_1_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2397:1: ( rule__EqualityExpression__Alternatives_1_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2397:2: rule__EqualityExpression__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Alternatives_1_0_in_rule__EqualityExpression__Group_1__0__Impl4984);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2407:1: rule__EqualityExpression__Group_1__1 : rule__EqualityExpression__Group_1__1__Impl ;
    public final void rule__EqualityExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2411:1: ( rule__EqualityExpression__Group_1__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2412:2: rule__EqualityExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group_1__1__Impl_in_rule__EqualityExpression__Group_1__15014);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2418:1: rule__EqualityExpression__Group_1__1__Impl : ( ( rule__EqualityExpression__InstanceofAssignment_1_1 ) ) ;
    public final void rule__EqualityExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2422:1: ( ( ( rule__EqualityExpression__InstanceofAssignment_1_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2423:1: ( ( rule__EqualityExpression__InstanceofAssignment_1_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2423:1: ( ( rule__EqualityExpression__InstanceofAssignment_1_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2424:1: ( rule__EqualityExpression__InstanceofAssignment_1_1 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getInstanceofAssignment_1_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2425:1: ( rule__EqualityExpression__InstanceofAssignment_1_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2425:2: rule__EqualityExpression__InstanceofAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EqualityExpression__InstanceofAssignment_1_1_in_rule__EqualityExpression__Group_1__1__Impl5041);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2439:1: rule__RelationalExpression__Group__0 : rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 ;
    public final void rule__RelationalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2443:1: ( rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2444:2: rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1
            {
            pushFollow(FOLLOW_rule__RelationalExpression__Group__0__Impl_in_rule__RelationalExpression__Group__05075);
            rule__RelationalExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationalExpression__Group__1_in_rule__RelationalExpression__Group__05078);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2451:1: rule__RelationalExpression__Group__0__Impl : ( ( rule__RelationalExpression__RelAssignment_0 ) ) ;
    public final void rule__RelationalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2455:1: ( ( ( rule__RelationalExpression__RelAssignment_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2456:1: ( ( rule__RelationalExpression__RelAssignment_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2456:1: ( ( rule__RelationalExpression__RelAssignment_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2457:1: ( rule__RelationalExpression__RelAssignment_0 )
            {
             before(grammarAccess.getRelationalExpressionAccess().getRelAssignment_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2458:1: ( rule__RelationalExpression__RelAssignment_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2458:2: rule__RelationalExpression__RelAssignment_0
            {
            pushFollow(FOLLOW_rule__RelationalExpression__RelAssignment_0_in_rule__RelationalExpression__Group__0__Impl5105);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2468:1: rule__RelationalExpression__Group__1 : rule__RelationalExpression__Group__1__Impl ;
    public final void rule__RelationalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2472:1: ( rule__RelationalExpression__Group__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2473:2: rule__RelationalExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RelationalExpression__Group__1__Impl_in_rule__RelationalExpression__Group__15135);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2479:1: rule__RelationalExpression__Group__1__Impl : ( ( rule__RelationalExpression__Group_1__0 )* ) ;
    public final void rule__RelationalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2483:1: ( ( ( rule__RelationalExpression__Group_1__0 )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2484:1: ( ( rule__RelationalExpression__Group_1__0 )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2484:1: ( ( rule__RelationalExpression__Group_1__0 )* )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2485:1: ( rule__RelationalExpression__Group_1__0 )*
            {
             before(grammarAccess.getRelationalExpressionAccess().getGroup_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2486:1: ( rule__RelationalExpression__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_GT && LA22_0<=RULE_LTE)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2486:2: rule__RelationalExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__RelationalExpression__Group_1__0_in_rule__RelationalExpression__Group__1__Impl5162);
            	    rule__RelationalExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2500:1: rule__RelationalExpression__Group_1__0 : rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1 ;
    public final void rule__RelationalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2504:1: ( rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2505:2: rule__RelationalExpression__Group_1__0__Impl rule__RelationalExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__RelationalExpression__Group_1__0__Impl_in_rule__RelationalExpression__Group_1__05197);
            rule__RelationalExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationalExpression__Group_1__1_in_rule__RelationalExpression__Group_1__05200);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2512:1: rule__RelationalExpression__Group_1__0__Impl : ( ruleRelationalOp ) ;
    public final void rule__RelationalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2516:1: ( ( ruleRelationalOp ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2517:1: ( ruleRelationalOp )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2517:1: ( ruleRelationalOp )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2518:1: ruleRelationalOp
            {
             before(grammarAccess.getRelationalExpressionAccess().getRelationalOpParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRelationalOp_in_rule__RelationalExpression__Group_1__0__Impl5227);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2529:1: rule__RelationalExpression__Group_1__1 : rule__RelationalExpression__Group_1__1__Impl ;
    public final void rule__RelationalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2533:1: ( rule__RelationalExpression__Group_1__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2534:2: rule__RelationalExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RelationalExpression__Group_1__1__Impl_in_rule__RelationalExpression__Group_1__15256);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2540:1: rule__RelationalExpression__Group_1__1__Impl : ( ( rule__RelationalExpression__RelAssignment_1_1 ) ) ;
    public final void rule__RelationalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2544:1: ( ( ( rule__RelationalExpression__RelAssignment_1_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2545:1: ( ( rule__RelationalExpression__RelAssignment_1_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2545:1: ( ( rule__RelationalExpression__RelAssignment_1_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2546:1: ( rule__RelationalExpression__RelAssignment_1_1 )
            {
             before(grammarAccess.getRelationalExpressionAccess().getRelAssignment_1_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2547:1: ( rule__RelationalExpression__RelAssignment_1_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2547:2: rule__RelationalExpression__RelAssignment_1_1
            {
            pushFollow(FOLLOW_rule__RelationalExpression__RelAssignment_1_1_in_rule__RelationalExpression__Group_1__1__Impl5283);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2561:1: rule__InstanceOfExpression__Group__0 : rule__InstanceOfExpression__Group__0__Impl rule__InstanceOfExpression__Group__1 ;
    public final void rule__InstanceOfExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2565:1: ( rule__InstanceOfExpression__Group__0__Impl rule__InstanceOfExpression__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2566:2: rule__InstanceOfExpression__Group__0__Impl rule__InstanceOfExpression__Group__1
            {
            pushFollow(FOLLOW_rule__InstanceOfExpression__Group__0__Impl_in_rule__InstanceOfExpression__Group__05317);
            rule__InstanceOfExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstanceOfExpression__Group__1_in_rule__InstanceOfExpression__Group__05320);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2573:1: rule__InstanceOfExpression__Group__0__Impl : ( ( rule__InstanceOfExpression__ElAssignment_0 ) ) ;
    public final void rule__InstanceOfExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2577:1: ( ( ( rule__InstanceOfExpression__ElAssignment_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2578:1: ( ( rule__InstanceOfExpression__ElAssignment_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2578:1: ( ( rule__InstanceOfExpression__ElAssignment_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2579:1: ( rule__InstanceOfExpression__ElAssignment_0 )
            {
             before(grammarAccess.getInstanceOfExpressionAccess().getElAssignment_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2580:1: ( rule__InstanceOfExpression__ElAssignment_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2580:2: rule__InstanceOfExpression__ElAssignment_0
            {
            pushFollow(FOLLOW_rule__InstanceOfExpression__ElAssignment_0_in_rule__InstanceOfExpression__Group__0__Impl5347);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2590:1: rule__InstanceOfExpression__Group__1 : rule__InstanceOfExpression__Group__1__Impl ;
    public final void rule__InstanceOfExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2594:1: ( rule__InstanceOfExpression__Group__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2595:2: rule__InstanceOfExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InstanceOfExpression__Group__1__Impl_in_rule__InstanceOfExpression__Group__15377);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2601:1: rule__InstanceOfExpression__Group__1__Impl : ( ( rule__InstanceOfExpression__Group_1__0 )? ) ;
    public final void rule__InstanceOfExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2605:1: ( ( ( rule__InstanceOfExpression__Group_1__0 )? ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2606:1: ( ( rule__InstanceOfExpression__Group_1__0 )? )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2606:1: ( ( rule__InstanceOfExpression__Group_1__0 )? )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2607:1: ( rule__InstanceOfExpression__Group_1__0 )?
            {
             before(grammarAccess.getInstanceOfExpressionAccess().getGroup_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2608:1: ( rule__InstanceOfExpression__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INSTANCEOF) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2608:2: rule__InstanceOfExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__InstanceOfExpression__Group_1__0_in_rule__InstanceOfExpression__Group__1__Impl5404);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2622:1: rule__InstanceOfExpression__Group_1__0 : rule__InstanceOfExpression__Group_1__0__Impl rule__InstanceOfExpression__Group_1__1 ;
    public final void rule__InstanceOfExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2626:1: ( rule__InstanceOfExpression__Group_1__0__Impl rule__InstanceOfExpression__Group_1__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2627:2: rule__InstanceOfExpression__Group_1__0__Impl rule__InstanceOfExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__InstanceOfExpression__Group_1__0__Impl_in_rule__InstanceOfExpression__Group_1__05439);
            rule__InstanceOfExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstanceOfExpression__Group_1__1_in_rule__InstanceOfExpression__Group_1__05442);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2634:1: rule__InstanceOfExpression__Group_1__0__Impl : ( RULE_INSTANCEOF ) ;
    public final void rule__InstanceOfExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2638:1: ( ( RULE_INSTANCEOF ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2639:1: ( RULE_INSTANCEOF )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2639:1: ( RULE_INSTANCEOF )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2640:1: RULE_INSTANCEOF
            {
             before(grammarAccess.getInstanceOfExpressionAccess().getINSTANCEOFTerminalRuleCall_1_0()); 
            match(input,RULE_INSTANCEOF,FOLLOW_RULE_INSTANCEOF_in_rule__InstanceOfExpression__Group_1__0__Impl5469); 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2651:1: rule__InstanceOfExpression__Group_1__1 : rule__InstanceOfExpression__Group_1__1__Impl ;
    public final void rule__InstanceOfExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2655:1: ( rule__InstanceOfExpression__Group_1__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2656:2: rule__InstanceOfExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__InstanceOfExpression__Group_1__1__Impl_in_rule__InstanceOfExpression__Group_1__15498);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2662:1: rule__InstanceOfExpression__Group_1__1__Impl : ( ( rule__InstanceOfExpression__TargetAssignment_1_1 ) ) ;
    public final void rule__InstanceOfExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2666:1: ( ( ( rule__InstanceOfExpression__TargetAssignment_1_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2667:1: ( ( rule__InstanceOfExpression__TargetAssignment_1_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2667:1: ( ( rule__InstanceOfExpression__TargetAssignment_1_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2668:1: ( rule__InstanceOfExpression__TargetAssignment_1_1 )
            {
             before(grammarAccess.getInstanceOfExpressionAccess().getTargetAssignment_1_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2669:1: ( rule__InstanceOfExpression__TargetAssignment_1_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2669:2: rule__InstanceOfExpression__TargetAssignment_1_1
            {
            pushFollow(FOLLOW_rule__InstanceOfExpression__TargetAssignment_1_1_in_rule__InstanceOfExpression__Group_1__1__Impl5525);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2683:1: rule__AdditiveExpression__Group__0 : rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 ;
    public final void rule__AdditiveExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2687:1: ( rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2688:2: rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__Group__0__Impl_in_rule__AdditiveExpression__Group__05559);
            rule__AdditiveExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AdditiveExpression__Group__1_in_rule__AdditiveExpression__Group__05562);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2695:1: rule__AdditiveExpression__Group__0__Impl : ( ( rule__AdditiveExpression__MultExprAssignment_0 ) ) ;
    public final void rule__AdditiveExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2699:1: ( ( ( rule__AdditiveExpression__MultExprAssignment_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2700:1: ( ( rule__AdditiveExpression__MultExprAssignment_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2700:1: ( ( rule__AdditiveExpression__MultExprAssignment_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2701:1: ( rule__AdditiveExpression__MultExprAssignment_0 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getMultExprAssignment_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2702:1: ( rule__AdditiveExpression__MultExprAssignment_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2702:2: rule__AdditiveExpression__MultExprAssignment_0
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__MultExprAssignment_0_in_rule__AdditiveExpression__Group__0__Impl5589);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2712:1: rule__AdditiveExpression__Group__1 : rule__AdditiveExpression__Group__1__Impl ;
    public final void rule__AdditiveExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2716:1: ( rule__AdditiveExpression__Group__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2717:2: rule__AdditiveExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__Group__1__Impl_in_rule__AdditiveExpression__Group__15619);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2723:1: rule__AdditiveExpression__Group__1__Impl : ( ( rule__AdditiveExpression__Group_1__0 )* ) ;
    public final void rule__AdditiveExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2727:1: ( ( ( rule__AdditiveExpression__Group_1__0 )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2728:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2728:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2729:1: ( rule__AdditiveExpression__Group_1__0 )*
            {
             before(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2730:1: ( rule__AdditiveExpression__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=51 && LA24_0<=52)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2730:2: rule__AdditiveExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AdditiveExpression__Group_1__0_in_rule__AdditiveExpression__Group__1__Impl5646);
            	    rule__AdditiveExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2744:1: rule__AdditiveExpression__Group_1__0 : rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 ;
    public final void rule__AdditiveExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2748:1: ( rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2749:2: rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__Group_1__0__Impl_in_rule__AdditiveExpression__Group_1__05681);
            rule__AdditiveExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AdditiveExpression__Group_1__1_in_rule__AdditiveExpression__Group_1__05684);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2756:1: rule__AdditiveExpression__Group_1__0__Impl : ( ( rule__AdditiveExpression__Alternatives_1_0 ) ) ;
    public final void rule__AdditiveExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2760:1: ( ( ( rule__AdditiveExpression__Alternatives_1_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2761:1: ( ( rule__AdditiveExpression__Alternatives_1_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2761:1: ( ( rule__AdditiveExpression__Alternatives_1_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2762:1: ( rule__AdditiveExpression__Alternatives_1_0 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getAlternatives_1_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2763:1: ( rule__AdditiveExpression__Alternatives_1_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2763:2: rule__AdditiveExpression__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__Alternatives_1_0_in_rule__AdditiveExpression__Group_1__0__Impl5711);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2773:1: rule__AdditiveExpression__Group_1__1 : rule__AdditiveExpression__Group_1__1__Impl ;
    public final void rule__AdditiveExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2777:1: ( rule__AdditiveExpression__Group_1__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2778:2: rule__AdditiveExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__Group_1__1__Impl_in_rule__AdditiveExpression__Group_1__15741);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2784:1: rule__AdditiveExpression__Group_1__1__Impl : ( ( rule__AdditiveExpression__MultExprAssignment_1_1 ) ) ;
    public final void rule__AdditiveExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2788:1: ( ( ( rule__AdditiveExpression__MultExprAssignment_1_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2789:1: ( ( rule__AdditiveExpression__MultExprAssignment_1_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2789:1: ( ( rule__AdditiveExpression__MultExprAssignment_1_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2790:1: ( rule__AdditiveExpression__MultExprAssignment_1_1 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getMultExprAssignment_1_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2791:1: ( rule__AdditiveExpression__MultExprAssignment_1_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2791:2: rule__AdditiveExpression__MultExprAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__MultExprAssignment_1_1_in_rule__AdditiveExpression__Group_1__1__Impl5768);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2805:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2809:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2810:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group__0__Impl_in_rule__MultiplicativeExpression__Group__05802);
            rule__MultiplicativeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group__1_in_rule__MultiplicativeExpression__Group__05805);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2817:1: rule__MultiplicativeExpression__Group__0__Impl : ( ( rule__MultiplicativeExpression__BaseExprAssignment_0 ) ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2821:1: ( ( ( rule__MultiplicativeExpression__BaseExprAssignment_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2822:1: ( ( rule__MultiplicativeExpression__BaseExprAssignment_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2822:1: ( ( rule__MultiplicativeExpression__BaseExprAssignment_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2823:1: ( rule__MultiplicativeExpression__BaseExprAssignment_0 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getBaseExprAssignment_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2824:1: ( rule__MultiplicativeExpression__BaseExprAssignment_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2824:2: rule__MultiplicativeExpression__BaseExprAssignment_0
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__BaseExprAssignment_0_in_rule__MultiplicativeExpression__Group__0__Impl5832);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2834:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl rule__MultiplicativeExpression__Group__2 ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2838:1: ( rule__MultiplicativeExpression__Group__1__Impl rule__MultiplicativeExpression__Group__2 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2839:2: rule__MultiplicativeExpression__Group__1__Impl rule__MultiplicativeExpression__Group__2
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group__1__Impl_in_rule__MultiplicativeExpression__Group__15862);
            rule__MultiplicativeExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group__2_in_rule__MultiplicativeExpression__Group__15865);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2846:1: rule__MultiplicativeExpression__Group__1__Impl : ( ( rule__MultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2850:1: ( ( ( rule__MultiplicativeExpression__Group_1__0 )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2851:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2851:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2852:1: ( rule__MultiplicativeExpression__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2853:1: ( rule__MultiplicativeExpression__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_DOT) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2853:2: rule__MultiplicativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_1__0_in_rule__MultiplicativeExpression__Group__1__Impl5892);
            	    rule__MultiplicativeExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2863:1: rule__MultiplicativeExpression__Group__2 : rule__MultiplicativeExpression__Group__2__Impl ;
    public final void rule__MultiplicativeExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2867:1: ( rule__MultiplicativeExpression__Group__2__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2868:2: rule__MultiplicativeExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group__2__Impl_in_rule__MultiplicativeExpression__Group__25923);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2874:1: rule__MultiplicativeExpression__Group__2__Impl : ( ( rule__MultiplicativeExpression__Group_2__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2878:1: ( ( ( rule__MultiplicativeExpression__Group_2__0 )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2879:1: ( ( rule__MultiplicativeExpression__Group_2__0 )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2879:1: ( ( rule__MultiplicativeExpression__Group_2__0 )* )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2880:1: ( rule__MultiplicativeExpression__Group_2__0 )*
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_2()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2881:1: ( rule__MultiplicativeExpression__Group_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=53 && LA26_0<=54)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2881:2: rule__MultiplicativeExpression__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_2__0_in_rule__MultiplicativeExpression__Group__2__Impl5950);
            	    rule__MultiplicativeExpression__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2897:1: rule__MultiplicativeExpression__Group_1__0 : rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 ;
    public final void rule__MultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2901:1: ( rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2902:2: rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_1__0__Impl_in_rule__MultiplicativeExpression__Group_1__05987);
            rule__MultiplicativeExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_1__1_in_rule__MultiplicativeExpression__Group_1__05990);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2909:1: rule__MultiplicativeExpression__Group_1__0__Impl : ( RULE_DOT ) ;
    public final void rule__MultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2913:1: ( ( RULE_DOT ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2914:1: ( RULE_DOT )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2914:1: ( RULE_DOT )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2915:1: RULE_DOT
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getDOTTerminalRuleCall_1_0()); 
            match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rule__MultiplicativeExpression__Group_1__0__Impl6017); 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2926:1: rule__MultiplicativeExpression__Group_1__1 : rule__MultiplicativeExpression__Group_1__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2930:1: ( rule__MultiplicativeExpression__Group_1__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2931:2: rule__MultiplicativeExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_1__1__Impl_in_rule__MultiplicativeExpression__Group_1__16046);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2937:1: rule__MultiplicativeExpression__Group_1__1__Impl : ( ( rule__MultiplicativeExpression__MethodsAssignment_1_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2941:1: ( ( ( rule__MultiplicativeExpression__MethodsAssignment_1_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2942:1: ( ( rule__MultiplicativeExpression__MethodsAssignment_1_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2942:1: ( ( rule__MultiplicativeExpression__MethodsAssignment_1_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2943:1: ( rule__MultiplicativeExpression__MethodsAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getMethodsAssignment_1_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2944:1: ( rule__MultiplicativeExpression__MethodsAssignment_1_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2944:2: rule__MultiplicativeExpression__MethodsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__MethodsAssignment_1_1_in_rule__MultiplicativeExpression__Group_1__1__Impl6073);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2958:1: rule__MultiplicativeExpression__Group_2__0 : rule__MultiplicativeExpression__Group_2__0__Impl rule__MultiplicativeExpression__Group_2__1 ;
    public final void rule__MultiplicativeExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2962:1: ( rule__MultiplicativeExpression__Group_2__0__Impl rule__MultiplicativeExpression__Group_2__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2963:2: rule__MultiplicativeExpression__Group_2__0__Impl rule__MultiplicativeExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_2__0__Impl_in_rule__MultiplicativeExpression__Group_2__06107);
            rule__MultiplicativeExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_2__1_in_rule__MultiplicativeExpression__Group_2__06110);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2970:1: rule__MultiplicativeExpression__Group_2__0__Impl : ( ( rule__MultiplicativeExpression__Alternatives_2_0 ) ) ;
    public final void rule__MultiplicativeExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2974:1: ( ( ( rule__MultiplicativeExpression__Alternatives_2_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2975:1: ( ( rule__MultiplicativeExpression__Alternatives_2_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2975:1: ( ( rule__MultiplicativeExpression__Alternatives_2_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2976:1: ( rule__MultiplicativeExpression__Alternatives_2_0 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getAlternatives_2_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2977:1: ( rule__MultiplicativeExpression__Alternatives_2_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2977:2: rule__MultiplicativeExpression__Alternatives_2_0
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__Alternatives_2_0_in_rule__MultiplicativeExpression__Group_2__0__Impl6137);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2987:1: rule__MultiplicativeExpression__Group_2__1 : rule__MultiplicativeExpression__Group_2__1__Impl rule__MultiplicativeExpression__Group_2__2 ;
    public final void rule__MultiplicativeExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2991:1: ( rule__MultiplicativeExpression__Group_2__1__Impl rule__MultiplicativeExpression__Group_2__2 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2992:2: rule__MultiplicativeExpression__Group_2__1__Impl rule__MultiplicativeExpression__Group_2__2
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_2__1__Impl_in_rule__MultiplicativeExpression__Group_2__16167);
            rule__MultiplicativeExpression__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_2__2_in_rule__MultiplicativeExpression__Group_2__16170);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:2999:1: rule__MultiplicativeExpression__Group_2__1__Impl : ( ( rule__MultiplicativeExpression__BaseExprAssignment_2_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3003:1: ( ( ( rule__MultiplicativeExpression__BaseExprAssignment_2_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3004:1: ( ( rule__MultiplicativeExpression__BaseExprAssignment_2_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3004:1: ( ( rule__MultiplicativeExpression__BaseExprAssignment_2_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3005:1: ( rule__MultiplicativeExpression__BaseExprAssignment_2_1 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getBaseExprAssignment_2_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3006:1: ( rule__MultiplicativeExpression__BaseExprAssignment_2_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3006:2: rule__MultiplicativeExpression__BaseExprAssignment_2_1
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__BaseExprAssignment_2_1_in_rule__MultiplicativeExpression__Group_2__1__Impl6197);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3016:1: rule__MultiplicativeExpression__Group_2__2 : rule__MultiplicativeExpression__Group_2__2__Impl ;
    public final void rule__MultiplicativeExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3020:1: ( rule__MultiplicativeExpression__Group_2__2__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3021:2: rule__MultiplicativeExpression__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_2__2__Impl_in_rule__MultiplicativeExpression__Group_2__26227);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3027:1: rule__MultiplicativeExpression__Group_2__2__Impl : ( ( rule__MultiplicativeExpression__Group_2_2__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3031:1: ( ( ( rule__MultiplicativeExpression__Group_2_2__0 )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3032:1: ( ( rule__MultiplicativeExpression__Group_2_2__0 )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3032:1: ( ( rule__MultiplicativeExpression__Group_2_2__0 )* )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3033:1: ( rule__MultiplicativeExpression__Group_2_2__0 )*
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_2_2()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3034:1: ( rule__MultiplicativeExpression__Group_2_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_DOT) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3034:2: rule__MultiplicativeExpression__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_2_2__0_in_rule__MultiplicativeExpression__Group_2__2__Impl6254);
            	    rule__MultiplicativeExpression__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3050:1: rule__MultiplicativeExpression__Group_2_2__0 : rule__MultiplicativeExpression__Group_2_2__0__Impl rule__MultiplicativeExpression__Group_2_2__1 ;
    public final void rule__MultiplicativeExpression__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3054:1: ( rule__MultiplicativeExpression__Group_2_2__0__Impl rule__MultiplicativeExpression__Group_2_2__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3055:2: rule__MultiplicativeExpression__Group_2_2__0__Impl rule__MultiplicativeExpression__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_2_2__0__Impl_in_rule__MultiplicativeExpression__Group_2_2__06291);
            rule__MultiplicativeExpression__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_2_2__1_in_rule__MultiplicativeExpression__Group_2_2__06294);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3062:1: rule__MultiplicativeExpression__Group_2_2__0__Impl : ( RULE_DOT ) ;
    public final void rule__MultiplicativeExpression__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3066:1: ( ( RULE_DOT ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3067:1: ( RULE_DOT )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3067:1: ( RULE_DOT )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3068:1: RULE_DOT
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getDOTTerminalRuleCall_2_2_0()); 
            match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rule__MultiplicativeExpression__Group_2_2__0__Impl6321); 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3079:1: rule__MultiplicativeExpression__Group_2_2__1 : rule__MultiplicativeExpression__Group_2_2__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3083:1: ( rule__MultiplicativeExpression__Group_2_2__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3084:2: rule__MultiplicativeExpression__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_2_2__1__Impl_in_rule__MultiplicativeExpression__Group_2_2__16350);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3090:1: rule__MultiplicativeExpression__Group_2_2__1__Impl : ( ( rule__MultiplicativeExpression__MethodsAssignment_2_2_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3094:1: ( ( ( rule__MultiplicativeExpression__MethodsAssignment_2_2_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3095:1: ( ( rule__MultiplicativeExpression__MethodsAssignment_2_2_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3095:1: ( ( rule__MultiplicativeExpression__MethodsAssignment_2_2_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3096:1: ( rule__MultiplicativeExpression__MethodsAssignment_2_2_1 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getMethodsAssignment_2_2_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3097:1: ( rule__MultiplicativeExpression__MethodsAssignment_2_2_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3097:2: rule__MultiplicativeExpression__MethodsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__MethodsAssignment_2_2_1_in_rule__MultiplicativeExpression__Group_2_2__1__Impl6377);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3111:1: rule__ClassCreator__Group__0 : rule__ClassCreator__Group__0__Impl rule__ClassCreator__Group__1 ;
    public final void rule__ClassCreator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3115:1: ( rule__ClassCreator__Group__0__Impl rule__ClassCreator__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3116:2: rule__ClassCreator__Group__0__Impl rule__ClassCreator__Group__1
            {
            pushFollow(FOLLOW_rule__ClassCreator__Group__0__Impl_in_rule__ClassCreator__Group__06411);
            rule__ClassCreator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassCreator__Group__1_in_rule__ClassCreator__Group__06414);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3123:1: rule__ClassCreator__Group__0__Impl : ( RULE_NEW ) ;
    public final void rule__ClassCreator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3127:1: ( ( RULE_NEW ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3128:1: ( RULE_NEW )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3128:1: ( RULE_NEW )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3129:1: RULE_NEW
            {
             before(grammarAccess.getClassCreatorAccess().getNEWTerminalRuleCall_0()); 
            match(input,RULE_NEW,FOLLOW_RULE_NEW_in_rule__ClassCreator__Group__0__Impl6441); 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3140:1: rule__ClassCreator__Group__1 : rule__ClassCreator__Group__1__Impl rule__ClassCreator__Group__2 ;
    public final void rule__ClassCreator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3144:1: ( rule__ClassCreator__Group__1__Impl rule__ClassCreator__Group__2 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3145:2: rule__ClassCreator__Group__1__Impl rule__ClassCreator__Group__2
            {
            pushFollow(FOLLOW_rule__ClassCreator__Group__1__Impl_in_rule__ClassCreator__Group__16470);
            rule__ClassCreator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ClassCreator__Group__2_in_rule__ClassCreator__Group__16473);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3152:1: rule__ClassCreator__Group__1__Impl : ( ( rule__ClassCreator__ClazzAssignment_1 ) ) ;
    public final void rule__ClassCreator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3156:1: ( ( ( rule__ClassCreator__ClazzAssignment_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3157:1: ( ( rule__ClassCreator__ClazzAssignment_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3157:1: ( ( rule__ClassCreator__ClazzAssignment_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3158:1: ( rule__ClassCreator__ClazzAssignment_1 )
            {
             before(grammarAccess.getClassCreatorAccess().getClazzAssignment_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3159:1: ( rule__ClassCreator__ClazzAssignment_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3159:2: rule__ClassCreator__ClazzAssignment_1
            {
            pushFollow(FOLLOW_rule__ClassCreator__ClazzAssignment_1_in_rule__ClassCreator__Group__1__Impl6500);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3169:1: rule__ClassCreator__Group__2 : rule__ClassCreator__Group__2__Impl ;
    public final void rule__ClassCreator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3173:1: ( rule__ClassCreator__Group__2__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3174:2: rule__ClassCreator__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ClassCreator__Group__2__Impl_in_rule__ClassCreator__Group__26530);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3180:1: rule__ClassCreator__Group__2__Impl : ( ( rule__ClassCreator__ArgsAssignment_2 ) ) ;
    public final void rule__ClassCreator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3184:1: ( ( ( rule__ClassCreator__ArgsAssignment_2 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3185:1: ( ( rule__ClassCreator__ArgsAssignment_2 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3185:1: ( ( rule__ClassCreator__ArgsAssignment_2 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3186:1: ( rule__ClassCreator__ArgsAssignment_2 )
            {
             before(grammarAccess.getClassCreatorAccess().getArgsAssignment_2()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3187:1: ( rule__ClassCreator__ArgsAssignment_2 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3187:2: rule__ClassCreator__ArgsAssignment_2
            {
            pushFollow(FOLLOW_rule__ClassCreator__ArgsAssignment_2_in_rule__ClassCreator__Group__2__Impl6557);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3203:1: rule__ArrayCreator__Group__0 : rule__ArrayCreator__Group__0__Impl rule__ArrayCreator__Group__1 ;
    public final void rule__ArrayCreator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3207:1: ( rule__ArrayCreator__Group__0__Impl rule__ArrayCreator__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3208:2: rule__ArrayCreator__Group__0__Impl rule__ArrayCreator__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayCreator__Group__0__Impl_in_rule__ArrayCreator__Group__06593);
            rule__ArrayCreator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayCreator__Group__1_in_rule__ArrayCreator__Group__06596);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3215:1: rule__ArrayCreator__Group__0__Impl : ( RULE_NEW ) ;
    public final void rule__ArrayCreator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3219:1: ( ( RULE_NEW ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3220:1: ( RULE_NEW )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3220:1: ( RULE_NEW )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3221:1: RULE_NEW
            {
             before(grammarAccess.getArrayCreatorAccess().getNEWTerminalRuleCall_0()); 
            match(input,RULE_NEW,FOLLOW_RULE_NEW_in_rule__ArrayCreator__Group__0__Impl6623); 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3232:1: rule__ArrayCreator__Group__1 : rule__ArrayCreator__Group__1__Impl rule__ArrayCreator__Group__2 ;
    public final void rule__ArrayCreator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3236:1: ( rule__ArrayCreator__Group__1__Impl rule__ArrayCreator__Group__2 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3237:2: rule__ArrayCreator__Group__1__Impl rule__ArrayCreator__Group__2
            {
            pushFollow(FOLLOW_rule__ArrayCreator__Group__1__Impl_in_rule__ArrayCreator__Group__16652);
            rule__ArrayCreator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayCreator__Group__2_in_rule__ArrayCreator__Group__16655);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3244:1: rule__ArrayCreator__Group__1__Impl : ( ( rule__ArrayCreator__TypeAssignment_1 ) ) ;
    public final void rule__ArrayCreator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3248:1: ( ( ( rule__ArrayCreator__TypeAssignment_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3249:1: ( ( rule__ArrayCreator__TypeAssignment_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3249:1: ( ( rule__ArrayCreator__TypeAssignment_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3250:1: ( rule__ArrayCreator__TypeAssignment_1 )
            {
             before(grammarAccess.getArrayCreatorAccess().getTypeAssignment_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3251:1: ( rule__ArrayCreator__TypeAssignment_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3251:2: rule__ArrayCreator__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__ArrayCreator__TypeAssignment_1_in_rule__ArrayCreator__Group__1__Impl6682);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3261:1: rule__ArrayCreator__Group__2 : rule__ArrayCreator__Group__2__Impl ;
    public final void rule__ArrayCreator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3265:1: ( rule__ArrayCreator__Group__2__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3266:2: rule__ArrayCreator__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ArrayCreator__Group__2__Impl_in_rule__ArrayCreator__Group__26712);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3272:1: rule__ArrayCreator__Group__2__Impl : ( ( rule__ArrayCreator__ArrayInitializerAssignment_2 ) ) ;
    public final void rule__ArrayCreator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3276:1: ( ( ( rule__ArrayCreator__ArrayInitializerAssignment_2 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3277:1: ( ( rule__ArrayCreator__ArrayInitializerAssignment_2 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3277:1: ( ( rule__ArrayCreator__ArrayInitializerAssignment_2 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3278:1: ( rule__ArrayCreator__ArrayInitializerAssignment_2 )
            {
             before(grammarAccess.getArrayCreatorAccess().getArrayInitializerAssignment_2()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3279:1: ( rule__ArrayCreator__ArrayInitializerAssignment_2 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3279:2: rule__ArrayCreator__ArrayInitializerAssignment_2
            {
            pushFollow(FOLLOW_rule__ArrayCreator__ArrayInitializerAssignment_2_in_rule__ArrayCreator__Group__2__Impl6739);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3295:1: rule__ArrayInitializer__Group__0 : rule__ArrayInitializer__Group__0__Impl rule__ArrayInitializer__Group__1 ;
    public final void rule__ArrayInitializer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3299:1: ( rule__ArrayInitializer__Group__0__Impl rule__ArrayInitializer__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3300:2: rule__ArrayInitializer__Group__0__Impl rule__ArrayInitializer__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayInitializer__Group__0__Impl_in_rule__ArrayInitializer__Group__06775);
            rule__ArrayInitializer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayInitializer__Group__1_in_rule__ArrayInitializer__Group__06778);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3307:1: rule__ArrayInitializer__Group__0__Impl : ( () ) ;
    public final void rule__ArrayInitializer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3311:1: ( ( () ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3312:1: ( () )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3312:1: ( () )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3313:1: ()
            {
             before(grammarAccess.getArrayInitializerAccess().getArrayInitializerAction_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3314:1: ()
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3316:1: 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3326:1: rule__ArrayInitializer__Group__1 : rule__ArrayInitializer__Group__1__Impl rule__ArrayInitializer__Group__2 ;
    public final void rule__ArrayInitializer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3330:1: ( rule__ArrayInitializer__Group__1__Impl rule__ArrayInitializer__Group__2 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3331:2: rule__ArrayInitializer__Group__1__Impl rule__ArrayInitializer__Group__2
            {
            pushFollow(FOLLOW_rule__ArrayInitializer__Group__1__Impl_in_rule__ArrayInitializer__Group__16836);
            rule__ArrayInitializer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayInitializer__Group__2_in_rule__ArrayInitializer__Group__16839);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3338:1: rule__ArrayInitializer__Group__1__Impl : ( RULE_LBRACE ) ;
    public final void rule__ArrayInitializer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3342:1: ( ( RULE_LBRACE ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3343:1: ( RULE_LBRACE )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3343:1: ( RULE_LBRACE )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3344:1: RULE_LBRACE
            {
             before(grammarAccess.getArrayInitializerAccess().getLBRACETerminalRuleCall_1()); 
            match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_rule__ArrayInitializer__Group__1__Impl6866); 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3355:1: rule__ArrayInitializer__Group__2 : rule__ArrayInitializer__Group__2__Impl rule__ArrayInitializer__Group__3 ;
    public final void rule__ArrayInitializer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3359:1: ( rule__ArrayInitializer__Group__2__Impl rule__ArrayInitializer__Group__3 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3360:2: rule__ArrayInitializer__Group__2__Impl rule__ArrayInitializer__Group__3
            {
            pushFollow(FOLLOW_rule__ArrayInitializer__Group__2__Impl_in_rule__ArrayInitializer__Group__26895);
            rule__ArrayInitializer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayInitializer__Group__3_in_rule__ArrayInitializer__Group__26898);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3367:1: rule__ArrayInitializer__Group__2__Impl : ( ( rule__ArrayInitializer__Group_2__0 )? ) ;
    public final void rule__ArrayInitializer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3371:1: ( ( ( rule__ArrayInitializer__Group_2__0 )? ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3372:1: ( ( rule__ArrayInitializer__Group_2__0 )? )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3372:1: ( ( rule__ArrayInitializer__Group_2__0 )? )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3373:1: ( rule__ArrayInitializer__Group_2__0 )?
            {
             before(grammarAccess.getArrayInitializerAccess().getGroup_2()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3374:1: ( rule__ArrayInitializer__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_INTLITERAL && LA28_0<=RULE_LPAREN)||LA28_0==RULE_NOT||LA28_0==RULE_NEW||(LA28_0>=RULE_FIELDTOKEN && LA28_0<=RULE_IDENTIFIER)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3374:2: rule__ArrayInitializer__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ArrayInitializer__Group_2__0_in_rule__ArrayInitializer__Group__2__Impl6925);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3384:1: rule__ArrayInitializer__Group__3 : rule__ArrayInitializer__Group__3__Impl rule__ArrayInitializer__Group__4 ;
    public final void rule__ArrayInitializer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3388:1: ( rule__ArrayInitializer__Group__3__Impl rule__ArrayInitializer__Group__4 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3389:2: rule__ArrayInitializer__Group__3__Impl rule__ArrayInitializer__Group__4
            {
            pushFollow(FOLLOW_rule__ArrayInitializer__Group__3__Impl_in_rule__ArrayInitializer__Group__36956);
            rule__ArrayInitializer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayInitializer__Group__4_in_rule__ArrayInitializer__Group__36959);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3396:1: rule__ArrayInitializer__Group__3__Impl : ( ( RULE_COMMA )? ) ;
    public final void rule__ArrayInitializer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3400:1: ( ( ( RULE_COMMA )? ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3401:1: ( ( RULE_COMMA )? )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3401:1: ( ( RULE_COMMA )? )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3402:1: ( RULE_COMMA )?
            {
             before(grammarAccess.getArrayInitializerAccess().getCOMMATerminalRuleCall_3()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3403:1: ( RULE_COMMA )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_COMMA) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3403:3: RULE_COMMA
                    {
                    match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__ArrayInitializer__Group__3__Impl6987); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3413:1: rule__ArrayInitializer__Group__4 : rule__ArrayInitializer__Group__4__Impl ;
    public final void rule__ArrayInitializer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3417:1: ( rule__ArrayInitializer__Group__4__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3418:2: rule__ArrayInitializer__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ArrayInitializer__Group__4__Impl_in_rule__ArrayInitializer__Group__47018);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3424:1: rule__ArrayInitializer__Group__4__Impl : ( RULE_RBRACE ) ;
    public final void rule__ArrayInitializer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3428:1: ( ( RULE_RBRACE ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3429:1: ( RULE_RBRACE )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3429:1: ( RULE_RBRACE )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3430:1: RULE_RBRACE
            {
             before(grammarAccess.getArrayInitializerAccess().getRBRACETerminalRuleCall_4()); 
            match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_rule__ArrayInitializer__Group__4__Impl7045); 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3451:1: rule__ArrayInitializer__Group_2__0 : rule__ArrayInitializer__Group_2__0__Impl rule__ArrayInitializer__Group_2__1 ;
    public final void rule__ArrayInitializer__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3455:1: ( rule__ArrayInitializer__Group_2__0__Impl rule__ArrayInitializer__Group_2__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3456:2: rule__ArrayInitializer__Group_2__0__Impl rule__ArrayInitializer__Group_2__1
            {
            pushFollow(FOLLOW_rule__ArrayInitializer__Group_2__0__Impl_in_rule__ArrayInitializer__Group_2__07084);
            rule__ArrayInitializer__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayInitializer__Group_2__1_in_rule__ArrayInitializer__Group_2__07087);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3463:1: rule__ArrayInitializer__Group_2__0__Impl : ( ( rule__ArrayInitializer__FirstElAssignment_2_0 ) ) ;
    public final void rule__ArrayInitializer__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3467:1: ( ( ( rule__ArrayInitializer__FirstElAssignment_2_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3468:1: ( ( rule__ArrayInitializer__FirstElAssignment_2_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3468:1: ( ( rule__ArrayInitializer__FirstElAssignment_2_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3469:1: ( rule__ArrayInitializer__FirstElAssignment_2_0 )
            {
             before(grammarAccess.getArrayInitializerAccess().getFirstElAssignment_2_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3470:1: ( rule__ArrayInitializer__FirstElAssignment_2_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3470:2: rule__ArrayInitializer__FirstElAssignment_2_0
            {
            pushFollow(FOLLOW_rule__ArrayInitializer__FirstElAssignment_2_0_in_rule__ArrayInitializer__Group_2__0__Impl7114);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3480:1: rule__ArrayInitializer__Group_2__1 : rule__ArrayInitializer__Group_2__1__Impl ;
    public final void rule__ArrayInitializer__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3484:1: ( rule__ArrayInitializer__Group_2__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3485:2: rule__ArrayInitializer__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrayInitializer__Group_2__1__Impl_in_rule__ArrayInitializer__Group_2__17144);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3491:1: rule__ArrayInitializer__Group_2__1__Impl : ( ( rule__ArrayInitializer__Group_2_1__0 )* ) ;
    public final void rule__ArrayInitializer__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3495:1: ( ( ( rule__ArrayInitializer__Group_2_1__0 )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3496:1: ( ( rule__ArrayInitializer__Group_2_1__0 )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3496:1: ( ( rule__ArrayInitializer__Group_2_1__0 )* )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3497:1: ( rule__ArrayInitializer__Group_2_1__0 )*
            {
             before(grammarAccess.getArrayInitializerAccess().getGroup_2_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3498:1: ( rule__ArrayInitializer__Group_2_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_COMMA) ) {
                    int LA30_1 = input.LA(2);

                    if ( ((LA30_1>=RULE_INTLITERAL && LA30_1<=RULE_LPAREN)||LA30_1==RULE_NOT||LA30_1==RULE_NEW||(LA30_1>=RULE_FIELDTOKEN && LA30_1<=RULE_IDENTIFIER)) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3498:2: rule__ArrayInitializer__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ArrayInitializer__Group_2_1__0_in_rule__ArrayInitializer__Group_2__1__Impl7171);
            	    rule__ArrayInitializer__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3512:1: rule__ArrayInitializer__Group_2_1__0 : rule__ArrayInitializer__Group_2_1__0__Impl rule__ArrayInitializer__Group_2_1__1 ;
    public final void rule__ArrayInitializer__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3516:1: ( rule__ArrayInitializer__Group_2_1__0__Impl rule__ArrayInitializer__Group_2_1__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3517:2: rule__ArrayInitializer__Group_2_1__0__Impl rule__ArrayInitializer__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__ArrayInitializer__Group_2_1__0__Impl_in_rule__ArrayInitializer__Group_2_1__07206);
            rule__ArrayInitializer__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayInitializer__Group_2_1__1_in_rule__ArrayInitializer__Group_2_1__07209);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3524:1: rule__ArrayInitializer__Group_2_1__0__Impl : ( RULE_COMMA ) ;
    public final void rule__ArrayInitializer__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3528:1: ( ( RULE_COMMA ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3529:1: ( RULE_COMMA )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3529:1: ( RULE_COMMA )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3530:1: RULE_COMMA
            {
             before(grammarAccess.getArrayInitializerAccess().getCOMMATerminalRuleCall_2_1_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__ArrayInitializer__Group_2_1__0__Impl7236); 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3541:1: rule__ArrayInitializer__Group_2_1__1 : rule__ArrayInitializer__Group_2_1__1__Impl ;
    public final void rule__ArrayInitializer__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3545:1: ( rule__ArrayInitializer__Group_2_1__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3546:2: rule__ArrayInitializer__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrayInitializer__Group_2_1__1__Impl_in_rule__ArrayInitializer__Group_2_1__17265);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3552:1: rule__ArrayInitializer__Group_2_1__1__Impl : ( ( rule__ArrayInitializer__OtherElsAssignment_2_1_1 ) ) ;
    public final void rule__ArrayInitializer__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3556:1: ( ( ( rule__ArrayInitializer__OtherElsAssignment_2_1_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3557:1: ( ( rule__ArrayInitializer__OtherElsAssignment_2_1_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3557:1: ( ( rule__ArrayInitializer__OtherElsAssignment_2_1_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3558:1: ( rule__ArrayInitializer__OtherElsAssignment_2_1_1 )
            {
             before(grammarAccess.getArrayInitializerAccess().getOtherElsAssignment_2_1_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3559:1: ( rule__ArrayInitializer__OtherElsAssignment_2_1_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3559:2: rule__ArrayInitializer__OtherElsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__ArrayInitializer__OtherElsAssignment_2_1_1_in_rule__ArrayInitializer__Group_2_1__1__Impl7292);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3574:1: rule__ArrayType__Group__0 : rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 ;
    public final void rule__ArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3578:1: ( rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3579:2: rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__0__Impl_in_rule__ArrayType__Group__07327);
            rule__ArrayType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group__1_in_rule__ArrayType__Group__07330);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3586:1: rule__ArrayType__Group__0__Impl : ( ( rule__ArrayType__Alternatives_0 ) ) ;
    public final void rule__ArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3590:1: ( ( ( rule__ArrayType__Alternatives_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3591:1: ( ( rule__ArrayType__Alternatives_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3591:1: ( ( rule__ArrayType__Alternatives_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3592:1: ( rule__ArrayType__Alternatives_0 )
            {
             before(grammarAccess.getArrayTypeAccess().getAlternatives_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3593:1: ( rule__ArrayType__Alternatives_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3593:2: rule__ArrayType__Alternatives_0
            {
            pushFollow(FOLLOW_rule__ArrayType__Alternatives_0_in_rule__ArrayType__Group__0__Impl7357);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3603:1: rule__ArrayType__Group__1 : rule__ArrayType__Group__1__Impl ;
    public final void rule__ArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3607:1: ( rule__ArrayType__Group__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3608:2: rule__ArrayType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrayType__Group__1__Impl_in_rule__ArrayType__Group__17387);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3614:1: rule__ArrayType__Group__1__Impl : ( ( ( rule__ArrayType__Group_1__0 ) ) ( ( rule__ArrayType__Group_1__0 )* ) ) ;
    public final void rule__ArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3618:1: ( ( ( ( rule__ArrayType__Group_1__0 ) ) ( ( rule__ArrayType__Group_1__0 )* ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3619:1: ( ( ( rule__ArrayType__Group_1__0 ) ) ( ( rule__ArrayType__Group_1__0 )* ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3619:1: ( ( ( rule__ArrayType__Group_1__0 ) ) ( ( rule__ArrayType__Group_1__0 )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3620:1: ( ( rule__ArrayType__Group_1__0 ) ) ( ( rule__ArrayType__Group_1__0 )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3620:1: ( ( rule__ArrayType__Group_1__0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3621:1: ( rule__ArrayType__Group_1__0 )
            {
             before(grammarAccess.getArrayTypeAccess().getGroup_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3622:1: ( rule__ArrayType__Group_1__0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3622:2: rule__ArrayType__Group_1__0
            {
            pushFollow(FOLLOW_rule__ArrayType__Group_1__0_in_rule__ArrayType__Group__1__Impl7416);
            rule__ArrayType__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getGroup_1()); 

            }

            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3625:1: ( ( rule__ArrayType__Group_1__0 )* )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3626:1: ( rule__ArrayType__Group_1__0 )*
            {
             before(grammarAccess.getArrayTypeAccess().getGroup_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3627:1: ( rule__ArrayType__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_LBRACKET) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3627:2: rule__ArrayType__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ArrayType__Group_1__0_in_rule__ArrayType__Group__1__Impl7428);
            	    rule__ArrayType__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3642:1: rule__ArrayType__Group_1__0 : rule__ArrayType__Group_1__0__Impl rule__ArrayType__Group_1__1 ;
    public final void rule__ArrayType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3646:1: ( rule__ArrayType__Group_1__0__Impl rule__ArrayType__Group_1__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3647:2: rule__ArrayType__Group_1__0__Impl rule__ArrayType__Group_1__1
            {
            pushFollow(FOLLOW_rule__ArrayType__Group_1__0__Impl_in_rule__ArrayType__Group_1__07465);
            rule__ArrayType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ArrayType__Group_1__1_in_rule__ArrayType__Group_1__07468);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3654:1: rule__ArrayType__Group_1__0__Impl : ( RULE_LBRACKET ) ;
    public final void rule__ArrayType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3658:1: ( ( RULE_LBRACKET ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3659:1: ( RULE_LBRACKET )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3659:1: ( RULE_LBRACKET )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3660:1: RULE_LBRACKET
            {
             before(grammarAccess.getArrayTypeAccess().getLBRACKETTerminalRuleCall_1_0()); 
            match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_rule__ArrayType__Group_1__0__Impl7495); 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3671:1: rule__ArrayType__Group_1__1 : rule__ArrayType__Group_1__1__Impl ;
    public final void rule__ArrayType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3675:1: ( rule__ArrayType__Group_1__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3676:2: rule__ArrayType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ArrayType__Group_1__1__Impl_in_rule__ArrayType__Group_1__17524);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3682:1: rule__ArrayType__Group_1__1__Impl : ( RULE_RBRACKET ) ;
    public final void rule__ArrayType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3686:1: ( ( RULE_RBRACKET ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3687:1: ( RULE_RBRACKET )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3687:1: ( RULE_RBRACKET )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3688:1: RULE_RBRACKET
            {
             before(grammarAccess.getArrayTypeAccess().getRBRACKETTerminalRuleCall_1_1()); 
            match(input,RULE_RBRACKET,FOLLOW_RULE_RBRACKET_in_rule__ArrayType__Group_1__1__Impl7551); 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3703:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3707:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3708:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__07584);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__07587);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3715:1: rule__QualifiedName__Group__0__Impl : ( () ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3719:1: ( ( () ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3720:1: ( () )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3720:1: ( () )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3721:1: ()
            {
             before(grammarAccess.getQualifiedNameAccess().getQualifiedNameAction_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3722:1: ()
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3724:1: 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3734:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl rule__QualifiedName__Group__2 ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3738:1: ( rule__QualifiedName__Group__1__Impl rule__QualifiedName__Group__2 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3739:2: rule__QualifiedName__Group__1__Impl rule__QualifiedName__Group__2
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__17645);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__2_in_rule__QualifiedName__Group__17648);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3746:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__IdentifierAssignment_1 ) ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3750:1: ( ( ( rule__QualifiedName__IdentifierAssignment_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3751:1: ( ( rule__QualifiedName__IdentifierAssignment_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3751:1: ( ( rule__QualifiedName__IdentifierAssignment_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3752:1: ( rule__QualifiedName__IdentifierAssignment_1 )
            {
             before(grammarAccess.getQualifiedNameAccess().getIdentifierAssignment_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3753:1: ( rule__QualifiedName__IdentifierAssignment_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3753:2: rule__QualifiedName__IdentifierAssignment_1
            {
            pushFollow(FOLLOW_rule__QualifiedName__IdentifierAssignment_1_in_rule__QualifiedName__Group__1__Impl7675);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3763:1: rule__QualifiedName__Group__2 : rule__QualifiedName__Group__2__Impl ;
    public final void rule__QualifiedName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3767:1: ( rule__QualifiedName__Group__2__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3768:2: rule__QualifiedName__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__2__Impl_in_rule__QualifiedName__Group__27705);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3774:1: rule__QualifiedName__Group__2__Impl : ( ( rule__QualifiedName__Group_2__0 )* ) ;
    public final void rule__QualifiedName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3778:1: ( ( ( rule__QualifiedName__Group_2__0 )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3779:1: ( ( rule__QualifiedName__Group_2__0 )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3779:1: ( ( rule__QualifiedName__Group_2__0 )* )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3780:1: ( rule__QualifiedName__Group_2__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_2()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3781:1: ( rule__QualifiedName__Group_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_DOT) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3781:2: rule__QualifiedName__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_2__0_in_rule__QualifiedName__Group__2__Impl7732);
            	    rule__QualifiedName__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3797:1: rule__QualifiedName__Group_2__0 : rule__QualifiedName__Group_2__0__Impl rule__QualifiedName__Group_2__1 ;
    public final void rule__QualifiedName__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3801:1: ( rule__QualifiedName__Group_2__0__Impl rule__QualifiedName__Group_2__1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3802:2: rule__QualifiedName__Group_2__0__Impl rule__QualifiedName__Group_2__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_2__0__Impl_in_rule__QualifiedName__Group_2__07769);
            rule__QualifiedName__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_2__1_in_rule__QualifiedName__Group_2__07772);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3809:1: rule__QualifiedName__Group_2__0__Impl : ( ( rule__QualifiedName__DotAssignment_2_0 ) ) ;
    public final void rule__QualifiedName__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3813:1: ( ( ( rule__QualifiedName__DotAssignment_2_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3814:1: ( ( rule__QualifiedName__DotAssignment_2_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3814:1: ( ( rule__QualifiedName__DotAssignment_2_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3815:1: ( rule__QualifiedName__DotAssignment_2_0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getDotAssignment_2_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3816:1: ( rule__QualifiedName__DotAssignment_2_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3816:2: rule__QualifiedName__DotAssignment_2_0
            {
            pushFollow(FOLLOW_rule__QualifiedName__DotAssignment_2_0_in_rule__QualifiedName__Group_2__0__Impl7799);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3826:1: rule__QualifiedName__Group_2__1 : rule__QualifiedName__Group_2__1__Impl ;
    public final void rule__QualifiedName__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3830:1: ( rule__QualifiedName__Group_2__1__Impl )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3831:2: rule__QualifiedName__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_2__1__Impl_in_rule__QualifiedName__Group_2__17829);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3837:1: rule__QualifiedName__Group_2__1__Impl : ( ( rule__QualifiedName__IdentifierAssignment_2_1 ) ) ;
    public final void rule__QualifiedName__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3841:1: ( ( ( rule__QualifiedName__IdentifierAssignment_2_1 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3842:1: ( ( rule__QualifiedName__IdentifierAssignment_2_1 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3842:1: ( ( rule__QualifiedName__IdentifierAssignment_2_1 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3843:1: ( rule__QualifiedName__IdentifierAssignment_2_1 )
            {
             before(grammarAccess.getQualifiedNameAccess().getIdentifierAssignment_2_1()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3844:1: ( rule__QualifiedName__IdentifierAssignment_2_1 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3844:2: rule__QualifiedName__IdentifierAssignment_2_1
            {
            pushFollow(FOLLOW_rule__QualifiedName__IdentifierAssignment_2_1_in_rule__QualifiedName__Group_2__1__Impl7856);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3859:1: rule__Expression__CondExprAssignment_1_1 : ( ruleConditionalExpression ) ;
    public final void rule__Expression__CondExprAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3863:1: ( ( ruleConditionalExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3864:1: ( ruleConditionalExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3864:1: ( ruleConditionalExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3865:1: ruleConditionalExpression
            {
             before(grammarAccess.getExpressionAccess().getCondExprConditionalExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleConditionalExpression_in_rule__Expression__CondExprAssignment_1_17895);
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


    // $ANTLR start "rule__MethodInvocation__MethodNameAssignment_0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3874:1: rule__MethodInvocation__MethodNameAssignment_0 : ( ruleQualifiedName ) ;
    public final void rule__MethodInvocation__MethodNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3878:1: ( ( ruleQualifiedName ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3879:1: ( ruleQualifiedName )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3879:1: ( ruleQualifiedName )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3880:1: ruleQualifiedName
            {
             before(grammarAccess.getMethodInvocationAccess().getMethodNameQualifiedNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__MethodInvocation__MethodNameAssignment_07926);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMethodInvocationAccess().getMethodNameQualifiedNameParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__MethodInvocation__MethodNameAssignment_0"


    // $ANTLR start "rule__MethodInvocation__ArgsAssignment_1"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3889:1: rule__MethodInvocation__ArgsAssignment_1 : ( ruleArguments ) ;
    public final void rule__MethodInvocation__ArgsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3893:1: ( ( ruleArguments ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3894:1: ( ruleArguments )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3894:1: ( ruleArguments )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3895:1: ruleArguments
            {
             before(grammarAccess.getMethodInvocationAccess().getArgsArgumentsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleArguments_in_rule__MethodInvocation__ArgsAssignment_17957);
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


    // $ANTLR start "rule__BaseJRExpr__FieldTokenAssignment_0"
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3904:1: rule__BaseJRExpr__FieldTokenAssignment_0 : ( RULE_FIELDTOKEN ) ;
    public final void rule__BaseJRExpr__FieldTokenAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3908:1: ( ( RULE_FIELDTOKEN ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3909:1: ( RULE_FIELDTOKEN )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3909:1: ( RULE_FIELDTOKEN )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3910:1: RULE_FIELDTOKEN
            {
             before(grammarAccess.getBaseJRExprAccess().getFieldTokenFieldTokenTerminalRuleCall_0_0()); 
            match(input,RULE_FIELDTOKEN,FOLLOW_RULE_FIELDTOKEN_in_rule__BaseJRExpr__FieldTokenAssignment_07988); 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3919:1: rule__BaseJRExpr__ParameterTokenAssignment_1 : ( RULE_PARAMETERTOKEN ) ;
    public final void rule__BaseJRExpr__ParameterTokenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3923:1: ( ( RULE_PARAMETERTOKEN ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3924:1: ( RULE_PARAMETERTOKEN )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3924:1: ( RULE_PARAMETERTOKEN )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3925:1: RULE_PARAMETERTOKEN
            {
             before(grammarAccess.getBaseJRExprAccess().getParameterTokenParameterTokenTerminalRuleCall_1_0()); 
            match(input,RULE_PARAMETERTOKEN,FOLLOW_RULE_PARAMETERTOKEN_in_rule__BaseJRExpr__ParameterTokenAssignment_18019); 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3934:1: rule__BaseJRExpr__VariableTokenAssignment_2 : ( RULE_VARIABLETOKEN ) ;
    public final void rule__BaseJRExpr__VariableTokenAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3938:1: ( ( RULE_VARIABLETOKEN ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3939:1: ( RULE_VARIABLETOKEN )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3939:1: ( RULE_VARIABLETOKEN )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3940:1: RULE_VARIABLETOKEN
            {
             before(grammarAccess.getBaseJRExprAccess().getVariableTokenVariableTokenTerminalRuleCall_2_0()); 
            match(input,RULE_VARIABLETOKEN,FOLLOW_RULE_VARIABLETOKEN_in_rule__BaseJRExpr__VariableTokenAssignment_28050); 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3949:1: rule__Arguments__LeftPAssignment_0 : ( RULE_LPAREN ) ;
    public final void rule__Arguments__LeftPAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3953:1: ( ( RULE_LPAREN ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3954:1: ( RULE_LPAREN )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3954:1: ( RULE_LPAREN )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3955:1: RULE_LPAREN
            {
             before(grammarAccess.getArgumentsAccess().getLeftPLPARENTerminalRuleCall_0_0()); 
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rule__Arguments__LeftPAssignment_08081); 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3964:1: rule__Arguments__ExprLstAssignment_1 : ( ruleExpressionList ) ;
    public final void rule__Arguments__ExprLstAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3968:1: ( ( ruleExpressionList ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3969:1: ( ruleExpressionList )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3969:1: ( ruleExpressionList )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3970:1: ruleExpressionList
            {
             before(grammarAccess.getArgumentsAccess().getExprLstExpressionListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpressionList_in_rule__Arguments__ExprLstAssignment_18112);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3979:1: rule__Arguments__RightPAssignment_2 : ( RULE_RPAREN ) ;
    public final void rule__Arguments__RightPAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3983:1: ( ( RULE_RPAREN ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3984:1: ( RULE_RPAREN )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3984:1: ( RULE_RPAREN )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3985:1: RULE_RPAREN
            {
             before(grammarAccess.getArgumentsAccess().getRightPRPARENTerminalRuleCall_2_0()); 
            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rule__Arguments__RightPAssignment_28143); 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3994:1: rule__ExpressionList__ExpressionsAssignment_0 : ( ruleExpression ) ;
    public final void rule__ExpressionList__ExpressionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3998:1: ( ( ruleExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3999:1: ( ruleExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:3999:1: ( ruleExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4000:1: ruleExpression
            {
             before(grammarAccess.getExpressionListAccess().getExpressionsExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ExpressionList__ExpressionsAssignment_08174);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4009:1: rule__ExpressionList__CommasAssignment_1_0 : ( RULE_COMMA ) ;
    public final void rule__ExpressionList__CommasAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4013:1: ( ( RULE_COMMA ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4014:1: ( RULE_COMMA )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4014:1: ( RULE_COMMA )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4015:1: RULE_COMMA
            {
             before(grammarAccess.getExpressionListAccess().getCommasCOMMATerminalRuleCall_1_0_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__ExpressionList__CommasAssignment_1_08205); 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4024:1: rule__ExpressionList__ExpressionsAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__ExpressionList__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4028:1: ( ( ruleExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4029:1: ( ruleExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4029:1: ( ruleExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4030:1: ruleExpression
            {
             before(grammarAccess.getExpressionListAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ExpressionList__ExpressionsAssignment_1_18236);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4039:1: rule__BaseCommonExpression__BasejrexprAssignment_0 : ( ruleBaseJRExpr ) ;
    public final void rule__BaseCommonExpression__BasejrexprAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4043:1: ( ( ruleBaseJRExpr ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4044:1: ( ruleBaseJRExpr )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4044:1: ( ruleBaseJRExpr )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4045:1: ruleBaseJRExpr
            {
             before(grammarAccess.getBaseCommonExpressionAccess().getBasejrexprBaseJRExprParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBaseJRExpr_in_rule__BaseCommonExpression__BasejrexprAssignment_08267);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4054:1: rule__BaseCommonExpression__LiteralAssignment_1 : ( ruleLiteral ) ;
    public final void rule__BaseCommonExpression__LiteralAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4058:1: ( ( ruleLiteral ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4059:1: ( ruleLiteral )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4059:1: ( ruleLiteral )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4060:1: ruleLiteral
            {
             before(grammarAccess.getBaseCommonExpressionAccess().getLiteralLiteralParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__BaseCommonExpression__LiteralAssignment_18298);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4069:1: rule__Cast__LparAssignment_0 : ( RULE_LPAREN ) ;
    public final void rule__Cast__LparAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4073:1: ( ( RULE_LPAREN ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4074:1: ( RULE_LPAREN )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4074:1: ( RULE_LPAREN )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4075:1: RULE_LPAREN
            {
             before(grammarAccess.getCastAccess().getLparLPARENTerminalRuleCall_0_0()); 
            match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_rule__Cast__LparAssignment_08329); 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4084:1: rule__Cast__PtypeAssignment_1_0 : ( rulePrimitiveType ) ;
    public final void rule__Cast__PtypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4088:1: ( ( rulePrimitiveType ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4089:1: ( rulePrimitiveType )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4089:1: ( rulePrimitiveType )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4090:1: rulePrimitiveType
            {
             before(grammarAccess.getCastAccess().getPtypePrimitiveTypeParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_rule__Cast__PtypeAssignment_1_08360);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4099:1: rule__Cast__ArrtypeAssignment_1_1 : ( ruleArrayType ) ;
    public final void rule__Cast__ArrtypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4103:1: ( ( ruleArrayType ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4104:1: ( ruleArrayType )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4104:1: ( ruleArrayType )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4105:1: ruleArrayType
            {
             before(grammarAccess.getCastAccess().getArrtypeArrayTypeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleArrayType_in_rule__Cast__ArrtypeAssignment_1_18391);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4114:1: rule__Cast__ClazztypeAssignment_1_2 : ( ruleClassOrInterfaceType ) ;
    public final void rule__Cast__ClazztypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4118:1: ( ( ruleClassOrInterfaceType ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4119:1: ( ruleClassOrInterfaceType )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4119:1: ( ruleClassOrInterfaceType )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4120:1: ruleClassOrInterfaceType
            {
             before(grammarAccess.getCastAccess().getClazztypeClassOrInterfaceTypeParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleClassOrInterfaceType_in_rule__Cast__ClazztypeAssignment_1_28422);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4129:1: rule__Cast__RparAssignment_2 : ( RULE_RPAREN ) ;
    public final void rule__Cast__RparAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4133:1: ( ( RULE_RPAREN ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4134:1: ( RULE_RPAREN )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4134:1: ( RULE_RPAREN )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4135:1: RULE_RPAREN
            {
             before(grammarAccess.getCastAccess().getRparRPARENTerminalRuleCall_2_0()); 
            match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_rule__Cast__RparAssignment_28453); 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4144:1: rule__ConditionalExpression__OkReturnedExprAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__ConditionalExpression__OkReturnedExprAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4148:1: ( ( ruleExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4149:1: ( ruleExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4149:1: ( ruleExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4150:1: ruleExpression
            {
             before(grammarAccess.getConditionalExpressionAccess().getOkReturnedExprExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ConditionalExpression__OkReturnedExprAssignment_1_18484);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4159:1: rule__ConditionalExpression__KoReturnedExprAssignment_1_3 : ( ruleExpression ) ;
    public final void rule__ConditionalExpression__KoReturnedExprAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4163:1: ( ( ruleExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4164:1: ( ruleExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4164:1: ( ruleExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4165:1: ruleExpression
            {
             before(grammarAccess.getConditionalExpressionAccess().getKoReturnedExprExpressionParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ConditionalExpression__KoReturnedExprAssignment_1_38515);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4174:1: rule__OrExpression__AndExpAssignment_0 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__AndExpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4178:1: ( ( ruleAndExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4179:1: ( ruleAndExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4179:1: ( ruleAndExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4180:1: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getAndExpAndExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAndExpression_in_rule__OrExpression__AndExpAssignment_08546);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4189:1: rule__OrExpression__AndExpAssignment_1_1 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__AndExpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4193:1: ( ( ruleAndExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4194:1: ( ruleAndExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4194:1: ( ruleAndExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4195:1: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getAndExpAndExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAndExpression_in_rule__OrExpression__AndExpAssignment_1_18577);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4204:1: rule__AndExpression__PrimaryCondAssignment_0 : ( rulePrimaryCondExpression ) ;
    public final void rule__AndExpression__PrimaryCondAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4208:1: ( ( rulePrimaryCondExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4209:1: ( rulePrimaryCondExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4209:1: ( rulePrimaryCondExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4210:1: rulePrimaryCondExpression
            {
             before(grammarAccess.getAndExpressionAccess().getPrimaryCondPrimaryCondExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePrimaryCondExpression_in_rule__AndExpression__PrimaryCondAssignment_08608);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4219:1: rule__AndExpression__PrimaryCondAssignment_1_1 : ( rulePrimaryCondExpression ) ;
    public final void rule__AndExpression__PrimaryCondAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4223:1: ( ( rulePrimaryCondExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4224:1: ( rulePrimaryCondExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4224:1: ( rulePrimaryCondExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4225:1: rulePrimaryCondExpression
            {
             before(grammarAccess.getAndExpressionAccess().getPrimaryCondPrimaryCondExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulePrimaryCondExpression_in_rule__AndExpression__PrimaryCondAssignment_1_18639);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4234:1: rule__PrimaryCondExpression__ExprAssignment : ( ruleBaseBooleanExpr ) ;
    public final void rule__PrimaryCondExpression__ExprAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4238:1: ( ( ruleBaseBooleanExpr ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4239:1: ( ruleBaseBooleanExpr )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4239:1: ( ruleBaseBooleanExpr )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4240:1: ruleBaseBooleanExpr
            {
             before(grammarAccess.getPrimaryCondExpressionAccess().getExprBaseBooleanExprParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBaseBooleanExpr_in_rule__PrimaryCondExpression__ExprAssignment8670);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4249:1: rule__EqualityExpression__InstanceofAssignment_0 : ( ruleInstanceOfExpression ) ;
    public final void rule__EqualityExpression__InstanceofAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4253:1: ( ( ruleInstanceOfExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4254:1: ( ruleInstanceOfExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4254:1: ( ruleInstanceOfExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4255:1: ruleInstanceOfExpression
            {
             before(grammarAccess.getEqualityExpressionAccess().getInstanceofInstanceOfExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleInstanceOfExpression_in_rule__EqualityExpression__InstanceofAssignment_08701);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4264:1: rule__EqualityExpression__InstanceofAssignment_1_1 : ( ruleInstanceOfExpression ) ;
    public final void rule__EqualityExpression__InstanceofAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4268:1: ( ( ruleInstanceOfExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4269:1: ( ruleInstanceOfExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4269:1: ( ruleInstanceOfExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4270:1: ruleInstanceOfExpression
            {
             before(grammarAccess.getEqualityExpressionAccess().getInstanceofInstanceOfExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleInstanceOfExpression_in_rule__EqualityExpression__InstanceofAssignment_1_18732);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4279:1: rule__RelationalExpression__RelAssignment_0 : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__RelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4283:1: ( ( ruleAdditiveExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4284:1: ( ruleAdditiveExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4284:1: ( ruleAdditiveExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4285:1: ruleAdditiveExpression
            {
             before(grammarAccess.getRelationalExpressionAccess().getRelAdditiveExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAdditiveExpression_in_rule__RelationalExpression__RelAssignment_08763);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4294:1: rule__RelationalExpression__RelAssignment_1_1 : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__RelAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4298:1: ( ( ruleAdditiveExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4299:1: ( ruleAdditiveExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4299:1: ( ruleAdditiveExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4300:1: ruleAdditiveExpression
            {
             before(grammarAccess.getRelationalExpressionAccess().getRelAdditiveExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAdditiveExpression_in_rule__RelationalExpression__RelAssignment_1_18794);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4309:1: rule__InstanceOfExpression__ElAssignment_0 : ( ruleRelationalExpression ) ;
    public final void rule__InstanceOfExpression__ElAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4313:1: ( ( ruleRelationalExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4314:1: ( ruleRelationalExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4314:1: ( ruleRelationalExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4315:1: ruleRelationalExpression
            {
             before(grammarAccess.getInstanceOfExpressionAccess().getElRelationalExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleRelationalExpression_in_rule__InstanceOfExpression__ElAssignment_08825);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4324:1: rule__InstanceOfExpression__TargetAssignment_1_1 : ( ( rule__InstanceOfExpression__TargetAlternatives_1_1_0 ) ) ;
    public final void rule__InstanceOfExpression__TargetAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4328:1: ( ( ( rule__InstanceOfExpression__TargetAlternatives_1_1_0 ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4329:1: ( ( rule__InstanceOfExpression__TargetAlternatives_1_1_0 ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4329:1: ( ( rule__InstanceOfExpression__TargetAlternatives_1_1_0 ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4330:1: ( rule__InstanceOfExpression__TargetAlternatives_1_1_0 )
            {
             before(grammarAccess.getInstanceOfExpressionAccess().getTargetAlternatives_1_1_0()); 
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4331:1: ( rule__InstanceOfExpression__TargetAlternatives_1_1_0 )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4331:2: rule__InstanceOfExpression__TargetAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__InstanceOfExpression__TargetAlternatives_1_1_0_in_rule__InstanceOfExpression__TargetAssignment_1_18856);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4340:1: rule__AdditiveExpression__MultExprAssignment_0 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__MultExprAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4344:1: ( ( ruleMultiplicativeExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4345:1: ( ruleMultiplicativeExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4345:1: ( ruleMultiplicativeExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4346:1: ruleMultiplicativeExpression
            {
             before(grammarAccess.getAdditiveExpressionAccess().getMultExprMultiplicativeExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_rule__AdditiveExpression__MultExprAssignment_08889);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4355:1: rule__AdditiveExpression__MultExprAssignment_1_1 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__MultExprAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4359:1: ( ( ruleMultiplicativeExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4360:1: ( ruleMultiplicativeExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4360:1: ( ruleMultiplicativeExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4361:1: ruleMultiplicativeExpression
            {
             before(grammarAccess.getAdditiveExpressionAccess().getMultExprMultiplicativeExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_rule__AdditiveExpression__MultExprAssignment_1_18920);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4370:1: rule__MultiplicativeExpression__BaseExprAssignment_0 : ( ruleBaseCommonExpression ) ;
    public final void rule__MultiplicativeExpression__BaseExprAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4374:1: ( ( ruleBaseCommonExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4375:1: ( ruleBaseCommonExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4375:1: ( ruleBaseCommonExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4376:1: ruleBaseCommonExpression
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getBaseExprBaseCommonExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleBaseCommonExpression_in_rule__MultiplicativeExpression__BaseExprAssignment_08951);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4385:1: rule__MultiplicativeExpression__MethodsAssignment_1_1 : ( ruleMethodInvocation ) ;
    public final void rule__MultiplicativeExpression__MethodsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4389:1: ( ( ruleMethodInvocation ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4390:1: ( ruleMethodInvocation )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4390:1: ( ruleMethodInvocation )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4391:1: ruleMethodInvocation
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getMethodsMethodInvocationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMethodInvocation_in_rule__MultiplicativeExpression__MethodsAssignment_1_18982);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4400:1: rule__MultiplicativeExpression__BaseExprAssignment_2_1 : ( ruleBaseCommonExpression ) ;
    public final void rule__MultiplicativeExpression__BaseExprAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4404:1: ( ( ruleBaseCommonExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4405:1: ( ruleBaseCommonExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4405:1: ( ruleBaseCommonExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4406:1: ruleBaseCommonExpression
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getBaseExprBaseCommonExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleBaseCommonExpression_in_rule__MultiplicativeExpression__BaseExprAssignment_2_19013);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4415:1: rule__MultiplicativeExpression__MethodsAssignment_2_2_1 : ( ruleMethodInvocation ) ;
    public final void rule__MultiplicativeExpression__MethodsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4419:1: ( ( ruleMethodInvocation ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4420:1: ( ruleMethodInvocation )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4420:1: ( ruleMethodInvocation )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4421:1: ruleMethodInvocation
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getMethodsMethodInvocationParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleMethodInvocation_in_rule__MultiplicativeExpression__MethodsAssignment_2_2_19044);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4430:1: rule__ClassCreator__ClazzAssignment_1 : ( ruleClassOrInterfaceType ) ;
    public final void rule__ClassCreator__ClazzAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4434:1: ( ( ruleClassOrInterfaceType ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4435:1: ( ruleClassOrInterfaceType )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4435:1: ( ruleClassOrInterfaceType )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4436:1: ruleClassOrInterfaceType
            {
             before(grammarAccess.getClassCreatorAccess().getClazzClassOrInterfaceTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleClassOrInterfaceType_in_rule__ClassCreator__ClazzAssignment_19075);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4445:1: rule__ClassCreator__ArgsAssignment_2 : ( ruleArguments ) ;
    public final void rule__ClassCreator__ArgsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4449:1: ( ( ruleArguments ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4450:1: ( ruleArguments )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4450:1: ( ruleArguments )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4451:1: ruleArguments
            {
             before(grammarAccess.getClassCreatorAccess().getArgsArgumentsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleArguments_in_rule__ClassCreator__ArgsAssignment_29106);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4460:1: rule__ArrayCreator__TypeAssignment_1 : ( ruleArrayType ) ;
    public final void rule__ArrayCreator__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4464:1: ( ( ruleArrayType ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4465:1: ( ruleArrayType )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4465:1: ( ruleArrayType )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4466:1: ruleArrayType
            {
             before(grammarAccess.getArrayCreatorAccess().getTypeArrayTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleArrayType_in_rule__ArrayCreator__TypeAssignment_19137);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4475:1: rule__ArrayCreator__ArrayInitializerAssignment_2 : ( ruleArrayInitializer ) ;
    public final void rule__ArrayCreator__ArrayInitializerAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4479:1: ( ( ruleArrayInitializer ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4480:1: ( ruleArrayInitializer )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4480:1: ( ruleArrayInitializer )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4481:1: ruleArrayInitializer
            {
             before(grammarAccess.getArrayCreatorAccess().getArrayInitializerArrayInitializerParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleArrayInitializer_in_rule__ArrayCreator__ArrayInitializerAssignment_29168);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4490:1: rule__ArrayInitializer__FirstElAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__ArrayInitializer__FirstElAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4494:1: ( ( ruleExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4495:1: ( ruleExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4495:1: ( ruleExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4496:1: ruleExpression
            {
             before(grammarAccess.getArrayInitializerAccess().getFirstElExpressionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ArrayInitializer__FirstElAssignment_2_09199);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4505:1: rule__ArrayInitializer__OtherElsAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__ArrayInitializer__OtherElsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4509:1: ( ( ruleExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4510:1: ( ruleExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4510:1: ( ruleExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4511:1: ruleExpression
            {
             before(grammarAccess.getArrayInitializerAccess().getOtherElsExpressionParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__ArrayInitializer__OtherElsAssignment_2_1_19230);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4521:1: rule__ArrayType__ClazzInterfAssignment_0_0 : ( ruleClassOrInterfaceType ) ;
    public final void rule__ArrayType__ClazzInterfAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4525:1: ( ( ruleClassOrInterfaceType ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4526:1: ( ruleClassOrInterfaceType )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4526:1: ( ruleClassOrInterfaceType )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4527:1: ruleClassOrInterfaceType
            {
             before(grammarAccess.getArrayTypeAccess().getClazzInterfClassOrInterfaceTypeParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleClassOrInterfaceType_in_rule__ArrayType__ClazzInterfAssignment_0_09262);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4536:1: rule__ArrayType__PrimtypeAssignment_0_1 : ( rulePrimitiveType ) ;
    public final void rule__ArrayType__PrimtypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4540:1: ( ( rulePrimitiveType ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4541:1: ( rulePrimitiveType )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4541:1: ( rulePrimitiveType )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4542:1: rulePrimitiveType
            {
             before(grammarAccess.getArrayTypeAccess().getPrimtypePrimitiveTypeParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_rule__ArrayType__PrimtypeAssignment_0_19293);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4551:1: rule__ClassOrInterfaceType__QualifiedNameAssignment : ( ruleQualifiedName ) ;
    public final void rule__ClassOrInterfaceType__QualifiedNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4555:1: ( ( ruleQualifiedName ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4556:1: ( ruleQualifiedName )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4556:1: ( ruleQualifiedName )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4557:1: ruleQualifiedName
            {
             before(grammarAccess.getClassOrInterfaceTypeAccess().getQualifiedNameQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ClassOrInterfaceType__QualifiedNameAssignment9324);
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4566:1: rule__QualifiedName__IdentifierAssignment_1 : ( RULE_IDENTIFIER ) ;
    public final void rule__QualifiedName__IdentifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4570:1: ( ( RULE_IDENTIFIER ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4571:1: ( RULE_IDENTIFIER )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4571:1: ( RULE_IDENTIFIER )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4572:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getQualifiedNameAccess().getIdentifierIDENTIFIERTerminalRuleCall_1_0()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__QualifiedName__IdentifierAssignment_19355); 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4581:1: rule__QualifiedName__DotAssignment_2_0 : ( RULE_DOT ) ;
    public final void rule__QualifiedName__DotAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4585:1: ( ( RULE_DOT ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4586:1: ( RULE_DOT )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4586:1: ( RULE_DOT )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4587:1: RULE_DOT
            {
             before(grammarAccess.getQualifiedNameAccess().getDotDOTTerminalRuleCall_2_0_0()); 
            match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rule__QualifiedName__DotAssignment_2_09386); 
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
    // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4596:1: rule__QualifiedName__IdentifierAssignment_2_1 : ( RULE_IDENTIFIER ) ;
    public final void rule__QualifiedName__IdentifierAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4600:1: ( ( RULE_IDENTIFIER ) )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4601:1: ( RULE_IDENTIFIER )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4601:1: ( RULE_IDENTIFIER )
            // ../com.jaspersoft.studio.editor.jrexpressions.ui/src-gen/com/jaspersoft/studio/editor/jrexpressions/ui/contentassist/antlr/internal/InternalJavaJRExpression.g:4602:1: RULE_IDENTIFIER
            {
             before(grammarAccess.getQualifiedNameAccess().getIdentifierIDENTIFIERTerminalRuleCall_2_1_0()); 
            match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_rule__QualifiedName__IdentifierAssignment_2_19417); 
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
        "\1\41\11\24\2\uffff\1\41\1\uffff\1\24";
    static final String DFA4_maxS =
        "\1\76\11\34\2\uffff\1\41\1\uffff\1\34";
    static final String DFA4_acceptS =
        "\12\uffff\1\1\1\2\1\uffff\1\3\1\uffff";
    static final String DFA4_specialS =
        "\17\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\11\25\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10",
            "\1\12\7\uffff\1\13",
            "\1\12\7\uffff\1\13",
            "\1\12\7\uffff\1\13",
            "\1\12\7\uffff\1\13",
            "\1\12\7\uffff\1\13",
            "\1\12\7\uffff\1\13",
            "\1\12\7\uffff\1\13",
            "\1\12\7\uffff\1\13",
            "\1\15\2\uffff\1\14\4\uffff\1\13",
            "",
            "",
            "\1\16",
            "",
            "\1\15\2\uffff\1\14\4\uffff\1\13"
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
            return "958:1: rule__Cast__Alternatives_1 : ( ( ( rule__Cast__PtypeAssignment_1_0 ) ) | ( ( rule__Cast__ArrtypeAssignment_1_1 ) ) | ( ( rule__Cast__ClazztypeAssignment_1_2 ) ) );";
        }
    }
    static final String DFA6_eotS =
        "\6\uffff";
    static final String DFA6_eofS =
        "\2\uffff\1\4\2\uffff\1\4";
    static final String DFA6_minS =
        "\1\12\1\uffff\1\4\1\41\1\uffff\1\4";
    static final String DFA6_maxS =
        "\1\41\1\uffff\1\102\1\41\1\uffff\1\102";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\uffff";
    static final String DFA6_specialS =
        "\6\uffff}>";
    static final String[] DFA6_transitionS = {
            "\12\1\12\uffff\3\1\1\2",
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
            return "1008:1: rule__InstanceOfExpression__TargetAlternatives_1_1_0 : ( ( ruleRelationalExpression ) | ( ruleClassOrInterfaceType ) );";
        }
    }
    static final String DFA10_eotS =
        "\7\uffff";
    static final String DFA10_eofS =
        "\7\uffff";
    static final String DFA10_minS =
        "\1\30\1\41\1\23\1\uffff\1\41\1\uffff\1\23";
    static final String DFA10_maxS =
        "\1\30\1\76\1\34\1\uffff\1\41\1\uffff\1\34";
    static final String DFA10_acceptS =
        "\3\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String DFA10_specialS =
        "\7\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1",
            "\1\2\25\uffff\10\3",
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
            return "1116:1: rule__Creator__Alternatives : ( ( ruleClassCreator ) | ( ruleArrayCreator ) );";
        }
    }
    static final String DFA14_eotS =
        "\7\uffff";
    static final String DFA14_eofS =
        "\7\uffff";
    static final String DFA14_minS =
        "\2\12\1\uffff\1\23\1\uffff\1\41\1\23";
    static final String DFA14_maxS =
        "\1\41\1\76\1\uffff\1\34\1\uffff\1\41\1\34";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\2\uffff";
    static final String DFA14_specialS =
        "\7\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\2\1\1\1\uffff\1\2\10\uffff\4\2",
            "\12\2\1\uffff\1\2\2\uffff\1\2\5\uffff\3\2\1\3\25\uffff\10\4",
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
            return "1319:1: ( ruleCast )?";
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
    public static final BitSet FOLLOW_ruleBaseJRExpr_in_entryRuleBaseJRExpr240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseJRExpr247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseJRExpr__Alternatives_in_ruleBaseJRExpr273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArguments_in_entryRuleArguments300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArguments307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arguments__Group__0_in_ruleArguments333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionList_in_entryRuleExpressionList360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionList367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionList__Group__0_in_ruleExpressionList393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseCommonExpression_in_entryRuleBaseCommonExpression420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseCommonExpression427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseCommonExpression__Alternatives_in_ruleBaseCommonExpression453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_in_entryRuleCast480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCast487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cast__Group__0_in_ruleCast513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalExpression547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__0_in_ruleConditionalExpression573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestExpression_in_entryRuleTestExpression600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestExpression607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleTestExpression633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryCondExpression_in_entryRulePrimaryCondExpression779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryCondExpression786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryCondExpression__ExprAssignment_in_rulePrimaryCondExpression812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseBooleanExpr_in_entryRuleBaseBooleanExpr839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseBooleanExpr846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseBooleanExpr__Group__0_in_ruleBaseBooleanExpr872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualityExpression906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group__0_in_ruleEqualityExpression932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression959 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group__0_in_ruleRelationalExpression992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceOfExpression_in_entryRuleInstanceOfExpression1019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceOfExpression1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstanceOfExpression__Group__0_in_ruleInstanceOfExpression1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression1079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group__0_in_ruleAdditiveExpression1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression1139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group__0_in_ruleMultiplicativeExpression1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalOp_in_entryRuleRelationalOp1199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalOp1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalOp__Alternatives_in_ruleRelationalOp1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreator_in_entryRuleCreator1259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreator1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Creator__Alternatives_in_ruleCreator1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassCreator_in_entryRuleClassCreator1319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassCreator1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassCreator__Group__0_in_ruleClassCreator1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayCreator_in_entryRuleArrayCreator1379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayCreator1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayCreator__Group__0_in_ruleArrayCreator1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayInitializer_in_entryRuleArrayInitializer1439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayInitializer1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group__0_in_ruleArrayInitializer1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_entryRuleArrayType1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayType1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__0_in_ruleArrayType1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceType_in_entryRuleClassOrInterfaceType1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassOrInterfaceType1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassOrInterfaceType__QualifiedNameAssignment_in_ruleClassOrInterfaceType1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType1741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Alternatives_in_rulePrimitiveType1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreator_in_rule__Expression__Alternatives1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Alternatives1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseJRExpr__FieldTokenAssignment_0_in_rule__BaseJRExpr__Alternatives1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseJRExpr__ParameterTokenAssignment_1_in_rule__BaseJRExpr__Alternatives1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseJRExpr__VariableTokenAssignment_2_in_rule__BaseJRExpr__Alternatives1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseCommonExpression__BasejrexprAssignment_0_in_rule__BaseCommonExpression__Alternatives1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseCommonExpression__LiteralAssignment_1_in_rule__BaseCommonExpression__Alternatives1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseCommonExpression__Group_2__0_in_rule__BaseCommonExpression__Alternatives1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodInvocation_in_rule__BaseCommonExpression__Alternatives1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cast__PtypeAssignment_1_0_in_rule__Cast__Alternatives_12015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cast__ArrtypeAssignment_1_1_in_rule__Cast__Alternatives_12033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cast__ClazztypeAssignment_1_2_in_rule__Cast__Alternatives_12051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_rule__EqualityExpression__Alternatives_1_02084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOTEQUAL_in_rule__EqualityExpression__Alternatives_1_02101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_rule__InstanceOfExpression__TargetAlternatives_1_1_02133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceType_in_rule__InstanceOfExpression__TargetAlternatives_1_1_02150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__AdditiveExpression__Alternatives_1_02183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__AdditiveExpression__Alternatives_1_02203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__MultiplicativeExpression__Alternatives_2_02238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__MultiplicativeExpression__Alternatives_2_02258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GT_in_rule__RelationalOp__Alternatives2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GTE_in_rule__RelationalOp__Alternatives2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LT_in_rule__RelationalOp__Alternatives2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LTE_in_rule__RelationalOp__Alternatives2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassCreator_in_rule__Creator__Alternatives2375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayCreator_in_rule__Creator__Alternatives2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__ClazzInterfAssignment_0_0_in_rule__ArrayType__Alternatives_02424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__PrimtypeAssignment_0_1_in_rule__ArrayType__Alternatives_02442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTLITERAL_in_rule__Literal__Alternatives2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LONGLITERAL_in_rule__Literal__Alternatives2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOATLITERAL_in_rule__Literal__Alternatives2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLELITERAL_in_rule__Literal__Alternatives2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHARLITERAL_in_rule__Literal__Alternatives2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRINGLITERAL_in_rule__Literal__Alternatives2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TRUE_in_rule__Literal__Alternatives2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FALSE_in_rule__Literal__Alternatives2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_rule__Literal__Alternatives2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__PrimitiveType__Alternatives2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__PrimitiveType__Alternatives2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__PrimitiveType__Alternatives2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__PrimitiveType__Alternatives2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__PrimitiveType__Alternatives2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__PrimitiveType__Alternatives2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__PrimitiveType__Alternatives2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__PrimitiveType__Alternatives2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__02816 = new BitSet(new long[]{0x00000003C02FFC00L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__02819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_in_rule__Expression__Group_1__0__Impl2847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__12878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__CondExprAssignment_1_1_in_rule__Expression__Group_1__1__Impl2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodInvocation__Group__0__Impl_in_rule__MethodInvocation__Group__02939 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__MethodInvocation__Group__1_in_rule__MethodInvocation__Group__02942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodInvocation__MethodNameAssignment_0_in_rule__MethodInvocation__Group__0__Impl2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodInvocation__Group__1__Impl_in_rule__MethodInvocation__Group__12999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MethodInvocation__ArgsAssignment_1_in_rule__MethodInvocation__Group__1__Impl3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arguments__Group__0__Impl_in_rule__Arguments__Group__03060 = new BitSet(new long[]{0x00000003C13FFC00L});
    public static final BitSet FOLLOW_rule__Arguments__Group__1_in_rule__Arguments__Group__03063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arguments__LeftPAssignment_0_in_rule__Arguments__Group__0__Impl3090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arguments__Group__1__Impl_in_rule__Arguments__Group__13120 = new BitSet(new long[]{0x00000003C13FFC00L});
    public static final BitSet FOLLOW_rule__Arguments__Group__2_in_rule__Arguments__Group__13123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arguments__ExprLstAssignment_1_in_rule__Arguments__Group__1__Impl3150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arguments__Group__2__Impl_in_rule__Arguments__Group__23181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arguments__RightPAssignment_2_in_rule__Arguments__Group__2__Impl3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionList__Group__0__Impl_in_rule__ExpressionList__Group__03244 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ExpressionList__Group__1_in_rule__ExpressionList__Group__03247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionList__ExpressionsAssignment_0_in_rule__ExpressionList__Group__0__Impl3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionList__Group__1__Impl_in_rule__ExpressionList__Group__13304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionList__Group_1__0_in_rule__ExpressionList__Group__1__Impl3331 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__ExpressionList__Group_1__0__Impl_in_rule__ExpressionList__Group_1__03366 = new BitSet(new long[]{0x00000003C12FFC00L});
    public static final BitSet FOLLOW_rule__ExpressionList__Group_1__1_in_rule__ExpressionList__Group_1__03369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionList__CommasAssignment_1_0_in_rule__ExpressionList__Group_1__0__Impl3396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionList__Group_1__1__Impl_in_rule__ExpressionList__Group_1__13426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExpressionList__ExpressionsAssignment_1_1_in_rule__ExpressionList__Group_1__1__Impl3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseCommonExpression__Group_2__0__Impl_in_rule__BaseCommonExpression__Group_2__03487 = new BitSet(new long[]{0x00000003C12FFC00L});
    public static final BitSet FOLLOW_rule__BaseCommonExpression__Group_2__1_in_rule__BaseCommonExpression__Group_2__03490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rule__BaseCommonExpression__Group_2__0__Impl3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseCommonExpression__Group_2__1__Impl_in_rule__BaseCommonExpression__Group_2__13546 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__BaseCommonExpression__Group_2__2_in_rule__BaseCommonExpression__Group_2__13549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__BaseCommonExpression__Group_2__1__Impl3576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseCommonExpression__Group_2__2__Impl_in_rule__BaseCommonExpression__Group_2__23605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rule__BaseCommonExpression__Group_2__2__Impl3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cast__Group__0__Impl_in_rule__Cast__Group__03667 = new BitSet(new long[]{0x7F800003C02FFC00L});
    public static final BitSet FOLLOW_rule__Cast__Group__1_in_rule__Cast__Group__03670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cast__LparAssignment_0_in_rule__Cast__Group__0__Impl3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cast__Group__1__Impl_in_rule__Cast__Group__13727 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Cast__Group__2_in_rule__Cast__Group__13730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cast__Alternatives_1_in_rule__Cast__Group__1__Impl3757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cast__Group__2__Impl_in_rule__Cast__Group__23787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cast__RparAssignment_2_in_rule__Cast__Group__2__Impl3814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__0__Impl_in_rule__ConditionalExpression__Group__03850 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__1_in_rule__ConditionalExpression__Group__03853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestExpression_in_rule__ConditionalExpression__Group__0__Impl3880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group__1__Impl_in_rule__ConditionalExpression__Group__13909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group_1__0_in_rule__ConditionalExpression__Group__1__Impl3936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group_1__0__Impl_in_rule__ConditionalExpression__Group_1__03971 = new BitSet(new long[]{0x00000003C12FFC00L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group_1__1_in_rule__ConditionalExpression__Group_1__03974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__ConditionalExpression__Group_1__0__Impl4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group_1__1__Impl_in_rule__ConditionalExpression__Group_1__14033 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group_1__2_in_rule__ConditionalExpression__Group_1__14036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__OkReturnedExprAssignment_1_1_in_rule__ConditionalExpression__Group_1__1__Impl4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group_1__2__Impl_in_rule__ConditionalExpression__Group_1__24093 = new BitSet(new long[]{0x00000003C12FFC00L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group_1__3_in_rule__ConditionalExpression__Group_1__24096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__ConditionalExpression__Group_1__2__Impl4124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__Group_1__3__Impl_in_rule__ConditionalExpression__Group_1__34155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionalExpression__KoReturnedExprAssignment_1_3_in_rule__ConditionalExpression__Group_1__3__Impl4182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__04220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__04223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__AndExpAssignment_0_in_rule__OrExpression__Group__0__Impl4250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__14280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl4307 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__04342 = new BitSet(new long[]{0x00000003C02FFC00L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__04345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__OrExpression__Group_1__0__Impl4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__14404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__AndExpAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl4431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__04465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__04468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__PrimaryCondAssignment_0_in_rule__AndExpression__Group__0__Impl4495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__14525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl4552 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__04587 = new BitSet(new long[]{0x00000003C02FFC00L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__04590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__AndExpression__Group_1__0__Impl4618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__14649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__PrimaryCondAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseBooleanExpr__Group__0__Impl_in_rule__BaseBooleanExpr__Group__04710 = new BitSet(new long[]{0x00000003C02FFC00L});
    public static final BitSet FOLLOW_rule__BaseBooleanExpr__Group__1_in_rule__BaseBooleanExpr__Group__04713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_in_rule__BaseBooleanExpr__Group__0__Impl4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BaseBooleanExpr__Group__1__Impl_in_rule__BaseBooleanExpr__Group__14772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_rule__BaseBooleanExpr__Group__1__Impl4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group__0__Impl_in_rule__EqualityExpression__Group__04832 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group__1_in_rule__EqualityExpression__Group__04835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__InstanceofAssignment_0_in_rule__EqualityExpression__Group__0__Impl4862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group__1__Impl_in_rule__EqualityExpression__Group__14892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_1__0_in_rule__EqualityExpression__Group__1__Impl4919 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_1__0__Impl_in_rule__EqualityExpression__Group_1__04954 = new BitSet(new long[]{0x00000003C02FFC00L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_1__1_in_rule__EqualityExpression__Group_1__04957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Alternatives_1_0_in_rule__EqualityExpression__Group_1__0__Impl4984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_1__1__Impl_in_rule__EqualityExpression__Group_1__15014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__InstanceofAssignment_1_1_in_rule__EqualityExpression__Group_1__1__Impl5041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group__0__Impl_in_rule__RelationalExpression__Group__05075 = new BitSet(new long[]{0x00000000000003C0L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group__1_in_rule__RelationalExpression__Group__05078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__RelAssignment_0_in_rule__RelationalExpression__Group__0__Impl5105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group__1__Impl_in_rule__RelationalExpression__Group__15135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group_1__0_in_rule__RelationalExpression__Group__1__Impl5162 = new BitSet(new long[]{0x00000000000003C2L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group_1__0__Impl_in_rule__RelationalExpression__Group_1__05197 = new BitSet(new long[]{0x00000003C02FFC00L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group_1__1_in_rule__RelationalExpression__Group_1__05200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalOp_in_rule__RelationalExpression__Group_1__0__Impl5227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group_1__1__Impl_in_rule__RelationalExpression__Group_1__15256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__RelAssignment_1_1_in_rule__RelationalExpression__Group_1__1__Impl5283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstanceOfExpression__Group__0__Impl_in_rule__InstanceOfExpression__Group__05317 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__InstanceOfExpression__Group__1_in_rule__InstanceOfExpression__Group__05320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstanceOfExpression__ElAssignment_0_in_rule__InstanceOfExpression__Group__0__Impl5347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstanceOfExpression__Group__1__Impl_in_rule__InstanceOfExpression__Group__15377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstanceOfExpression__Group_1__0_in_rule__InstanceOfExpression__Group__1__Impl5404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstanceOfExpression__Group_1__0__Impl_in_rule__InstanceOfExpression__Group_1__05439 = new BitSet(new long[]{0x00000003C02FFC00L});
    public static final BitSet FOLLOW_rule__InstanceOfExpression__Group_1__1_in_rule__InstanceOfExpression__Group_1__05442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INSTANCEOF_in_rule__InstanceOfExpression__Group_1__0__Impl5469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstanceOfExpression__Group_1__1__Impl_in_rule__InstanceOfExpression__Group_1__15498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstanceOfExpression__TargetAssignment_1_1_in_rule__InstanceOfExpression__Group_1__1__Impl5525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group__0__Impl_in_rule__AdditiveExpression__Group__05559 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group__1_in_rule__AdditiveExpression__Group__05562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__MultExprAssignment_0_in_rule__AdditiveExpression__Group__0__Impl5589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group__1__Impl_in_rule__AdditiveExpression__Group__15619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group_1__0_in_rule__AdditiveExpression__Group__1__Impl5646 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group_1__0__Impl_in_rule__AdditiveExpression__Group_1__05681 = new BitSet(new long[]{0x00000003C02FFC00L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group_1__1_in_rule__AdditiveExpression__Group_1__05684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Alternatives_1_0_in_rule__AdditiveExpression__Group_1__0__Impl5711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group_1__1__Impl_in_rule__AdditiveExpression__Group_1__15741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__MultExprAssignment_1_1_in_rule__AdditiveExpression__Group_1__1__Impl5768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group__0__Impl_in_rule__MultiplicativeExpression__Group__05802 = new BitSet(new long[]{0x0060000000800000L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group__1_in_rule__MultiplicativeExpression__Group__05805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__BaseExprAssignment_0_in_rule__MultiplicativeExpression__Group__0__Impl5832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group__1__Impl_in_rule__MultiplicativeExpression__Group__15862 = new BitSet(new long[]{0x0060000000800000L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group__2_in_rule__MultiplicativeExpression__Group__15865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_1__0_in_rule__MultiplicativeExpression__Group__1__Impl5892 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group__2__Impl_in_rule__MultiplicativeExpression__Group__25923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_2__0_in_rule__MultiplicativeExpression__Group__2__Impl5950 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_1__0__Impl_in_rule__MultiplicativeExpression__Group_1__05987 = new BitSet(new long[]{0x00000003C02FFC00L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_1__1_in_rule__MultiplicativeExpression__Group_1__05990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_rule__MultiplicativeExpression__Group_1__0__Impl6017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_1__1__Impl_in_rule__MultiplicativeExpression__Group_1__16046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__MethodsAssignment_1_1_in_rule__MultiplicativeExpression__Group_1__1__Impl6073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_2__0__Impl_in_rule__MultiplicativeExpression__Group_2__06107 = new BitSet(new long[]{0x00000003C02FFC00L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_2__1_in_rule__MultiplicativeExpression__Group_2__06110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Alternatives_2_0_in_rule__MultiplicativeExpression__Group_2__0__Impl6137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_2__1__Impl_in_rule__MultiplicativeExpression__Group_2__16167 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_2__2_in_rule__MultiplicativeExpression__Group_2__16170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__BaseExprAssignment_2_1_in_rule__MultiplicativeExpression__Group_2__1__Impl6197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_2__2__Impl_in_rule__MultiplicativeExpression__Group_2__26227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_2_2__0_in_rule__MultiplicativeExpression__Group_2__2__Impl6254 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_2_2__0__Impl_in_rule__MultiplicativeExpression__Group_2_2__06291 = new BitSet(new long[]{0x00000003C02FFC00L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_2_2__1_in_rule__MultiplicativeExpression__Group_2_2__06294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_rule__MultiplicativeExpression__Group_2_2__0__Impl6321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_2_2__1__Impl_in_rule__MultiplicativeExpression__Group_2_2__16350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__MethodsAssignment_2_2_1_in_rule__MultiplicativeExpression__Group_2_2__1__Impl6377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassCreator__Group__0__Impl_in_rule__ClassCreator__Group__06411 = new BitSet(new long[]{0x00000003C02FFC00L});
    public static final BitSet FOLLOW_rule__ClassCreator__Group__1_in_rule__ClassCreator__Group__06414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEW_in_rule__ClassCreator__Group__0__Impl6441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassCreator__Group__1__Impl_in_rule__ClassCreator__Group__16470 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ClassCreator__Group__2_in_rule__ClassCreator__Group__16473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassCreator__ClazzAssignment_1_in_rule__ClassCreator__Group__1__Impl6500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassCreator__Group__2__Impl_in_rule__ClassCreator__Group__26530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ClassCreator__ArgsAssignment_2_in_rule__ClassCreator__Group__2__Impl6557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayCreator__Group__0__Impl_in_rule__ArrayCreator__Group__06593 = new BitSet(new long[]{0x7F800003C02FFC00L});
    public static final BitSet FOLLOW_rule__ArrayCreator__Group__1_in_rule__ArrayCreator__Group__06596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEW_in_rule__ArrayCreator__Group__0__Impl6623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayCreator__Group__1__Impl_in_rule__ArrayCreator__Group__16652 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ArrayCreator__Group__2_in_rule__ArrayCreator__Group__16655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayCreator__TypeAssignment_1_in_rule__ArrayCreator__Group__1__Impl6682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayCreator__Group__2__Impl_in_rule__ArrayCreator__Group__26712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayCreator__ArrayInitializerAssignment_2_in_rule__ArrayCreator__Group__2__Impl6739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group__0__Impl_in_rule__ArrayInitializer__Group__06775 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group__1_in_rule__ArrayInitializer__Group__06778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group__1__Impl_in_rule__ArrayInitializer__Group__16836 = new BitSet(new long[]{0x00000003CD2FFC00L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group__2_in_rule__ArrayInitializer__Group__16839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_rule__ArrayInitializer__Group__1__Impl6866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group__2__Impl_in_rule__ArrayInitializer__Group__26895 = new BitSet(new long[]{0x00000003CD2FFC00L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group__3_in_rule__ArrayInitializer__Group__26898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group_2__0_in_rule__ArrayInitializer__Group__2__Impl6925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group__3__Impl_in_rule__ArrayInitializer__Group__36956 = new BitSet(new long[]{0x00000003CD2FFC00L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group__4_in_rule__ArrayInitializer__Group__36959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__ArrayInitializer__Group__3__Impl6987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group__4__Impl_in_rule__ArrayInitializer__Group__47018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_rule__ArrayInitializer__Group__4__Impl7045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group_2__0__Impl_in_rule__ArrayInitializer__Group_2__07084 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group_2__1_in_rule__ArrayInitializer__Group_2__07087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__FirstElAssignment_2_0_in_rule__ArrayInitializer__Group_2__0__Impl7114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group_2__1__Impl_in_rule__ArrayInitializer__Group_2__17144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group_2_1__0_in_rule__ArrayInitializer__Group_2__1__Impl7171 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group_2_1__0__Impl_in_rule__ArrayInitializer__Group_2_1__07206 = new BitSet(new long[]{0x00000003C12FFC00L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group_2_1__1_in_rule__ArrayInitializer__Group_2_1__07209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__ArrayInitializer__Group_2_1__0__Impl7236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__Group_2_1__1__Impl_in_rule__ArrayInitializer__Group_2_1__17265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayInitializer__OtherElsAssignment_2_1_1_in_rule__ArrayInitializer__Group_2_1__1__Impl7292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__0__Impl_in_rule__ArrayType__Group__07327 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__1_in_rule__ArrayType__Group__07330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Alternatives_0_in_rule__ArrayType__Group__0__Impl7357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group__1__Impl_in_rule__ArrayType__Group__17387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_1__0_in_rule__ArrayType__Group__1__Impl7416 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_1__0_in_rule__ArrayType__Group__1__Impl7428 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_1__0__Impl_in_rule__ArrayType__Group_1__07465 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_1__1_in_rule__ArrayType__Group_1__07468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_rule__ArrayType__Group_1__0__Impl7495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArrayType__Group_1__1__Impl_in_rule__ArrayType__Group_1__17524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RBRACKET_in_rule__ArrayType__Group_1__1__Impl7551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__07584 = new BitSet(new long[]{0x00000003C02FFC00L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__07587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__17645 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__2_in_rule__QualifiedName__Group__17648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__IdentifierAssignment_1_in_rule__QualifiedName__Group__1__Impl7675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__2__Impl_in_rule__QualifiedName__Group__27705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_2__0_in_rule__QualifiedName__Group__2__Impl7732 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_2__0__Impl_in_rule__QualifiedName__Group_2__07769 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_2__1_in_rule__QualifiedName__Group_2__07772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__DotAssignment_2_0_in_rule__QualifiedName__Group_2__0__Impl7799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_2__1__Impl_in_rule__QualifiedName__Group_2__17829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__IdentifierAssignment_2_1_in_rule__QualifiedName__Group_2__1__Impl7856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_rule__Expression__CondExprAssignment_1_17895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__MethodInvocation__MethodNameAssignment_07926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArguments_in_rule__MethodInvocation__ArgsAssignment_17957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FIELDTOKEN_in_rule__BaseJRExpr__FieldTokenAssignment_07988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAMETERTOKEN_in_rule__BaseJRExpr__ParameterTokenAssignment_18019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLETOKEN_in_rule__BaseJRExpr__VariableTokenAssignment_28050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rule__Arguments__LeftPAssignment_08081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionList_in_rule__Arguments__ExprLstAssignment_18112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rule__Arguments__RightPAssignment_28143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ExpressionList__ExpressionsAssignment_08174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__ExpressionList__CommasAssignment_1_08205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ExpressionList__ExpressionsAssignment_1_18236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseJRExpr_in_rule__BaseCommonExpression__BasejrexprAssignment_08267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__BaseCommonExpression__LiteralAssignment_18298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_rule__Cast__LparAssignment_08329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_rule__Cast__PtypeAssignment_1_08360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_rule__Cast__ArrtypeAssignment_1_18391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceType_in_rule__Cast__ClazztypeAssignment_1_28422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_rule__Cast__RparAssignment_28453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ConditionalExpression__OkReturnedExprAssignment_1_18484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ConditionalExpression__KoReturnedExprAssignment_1_38515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__AndExpAssignment_08546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__AndExpAssignment_1_18577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryCondExpression_in_rule__AndExpression__PrimaryCondAssignment_08608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryCondExpression_in_rule__AndExpression__PrimaryCondAssignment_1_18639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseBooleanExpr_in_rule__PrimaryCondExpression__ExprAssignment8670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceOfExpression_in_rule__EqualityExpression__InstanceofAssignment_08701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceOfExpression_in_rule__EqualityExpression__InstanceofAssignment_1_18732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_rule__RelationalExpression__RelAssignment_08763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_rule__RelationalExpression__RelAssignment_1_18794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_rule__InstanceOfExpression__ElAssignment_08825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstanceOfExpression__TargetAlternatives_1_1_0_in_rule__InstanceOfExpression__TargetAssignment_1_18856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_rule__AdditiveExpression__MultExprAssignment_08889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_rule__AdditiveExpression__MultExprAssignment_1_18920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseCommonExpression_in_rule__MultiplicativeExpression__BaseExprAssignment_08951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodInvocation_in_rule__MultiplicativeExpression__MethodsAssignment_1_18982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseCommonExpression_in_rule__MultiplicativeExpression__BaseExprAssignment_2_19013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodInvocation_in_rule__MultiplicativeExpression__MethodsAssignment_2_2_19044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceType_in_rule__ClassCreator__ClazzAssignment_19075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArguments_in_rule__ClassCreator__ArgsAssignment_29106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_rule__ArrayCreator__TypeAssignment_19137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayInitializer_in_rule__ArrayCreator__ArrayInitializerAssignment_29168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ArrayInitializer__FirstElAssignment_2_09199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__ArrayInitializer__OtherElsAssignment_2_1_19230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceType_in_rule__ArrayType__ClazzInterfAssignment_0_09262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_rule__ArrayType__PrimtypeAssignment_0_19293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ClassOrInterfaceType__QualifiedNameAssignment9324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__QualifiedName__IdentifierAssignment_19355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_rule__QualifiedName__DotAssignment_2_09386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_rule__QualifiedName__IdentifierAssignment_2_19417 = new BitSet(new long[]{0x0000000000000002L});

}