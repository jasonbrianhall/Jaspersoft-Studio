package com.jaspersoft.studio.editor.jrexpressions.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.jaspersoft.studio.editor.jrexpressions.services.JavaJRExpressionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJavaJRExpressionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_FIELDTOKEN", "RULE_PARAMETERTOKEN", "RULE_VARIABLETOKEN", "RULE_LPAREN", "RULE_RPAREN", "RULE_COMMA", "RULE_NOT", "RULE_EQUAL", "RULE_NOTEQUAL", "RULE_INSTANCEOF", "RULE_DOT", "RULE_GT", "RULE_GTE", "RULE_LT", "RULE_LTE", "RULE_NEW", "RULE_LBRACE", "RULE_RBRACE", "RULE_LBRACKET", "RULE_RBRACKET", "RULE_IDENTIFIER", "RULE_INTLITERAL", "RULE_LONGLITERAL", "RULE_FLOATLITERAL", "RULE_DOUBLELITERAL", "RULE_CHARLITERAL", "RULE_STRINGLITERAL", "RULE_TRUE", "RULE_FALSE", "RULE_NULL", "RULE_BRACED_JRIDENTIFIER", "RULE_JRIDENTIFIER", "RULE_INTEGERNUMBER", "RULE_LONGSUFFIX", "RULE_HEXPREFIX", "RULE_HEXDIGIT", "RULE_EXPONENT", "RULE_NONINTEGERNUMBER", "RULE_FLOATSUFFIX", "RULE_DOUBLESUFFIX", "RULE_ESCAPESEQUENCE", "RULE_SEMI", "RULE_LETTER", "RULE_JAVAIDDIGIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'?'", "':'", "'||'", "'&&'", "'+'", "'-'", "'*'", "'/'", "'boolean'", "'char'", "'byte'", "'short'", "'int'", "'long'", "'float'", "'double'"
    };
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
    public static final int RULE_VARIABLETOKEN=6;
    public static final int RULE_COMMA=9;
    public static final int RULE_IDENTIFIER=24;
    public static final int RULE_EQUAL=11;
    public static final int RULE_BRACED_JRIDENTIFIER=34;
    public static final int RULE_SL_COMMENT=49;
    public static final int RULE_JRIDENTIFIER=35;
    public static final int RULE_LETTER=46;
    public static final int RULE_NULL=33;
    public static final int RULE_PARAMETERTOKEN=5;
    public static final int RULE_ML_COMMENT=48;
    public static final int RULE_TRUE=31;
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


        public InternalJavaJRExpressionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJavaJRExpressionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJavaJRExpressionParser.tokenNames; }
    public String getGrammarFileName() { return "../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g"; }



     	private JavaJRExpressionGrammarAccess grammarAccess;
     	
        public InternalJavaJRExpressionParser(TokenStream input, JavaJRExpressionGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected JavaJRExpressionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:76:1: ruleModel returns [EObject current=null] : this_Expression_0= ruleExpression ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:79:28: (this_Expression_0= ruleExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:81:5: this_Expression_0= ruleExpression
            {
             
                    newCompositeNode(grammarAccess.getModelAccess().getExpressionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleExpression_in_ruleModel131);
            this_Expression_0=ruleExpression();

            state._fsp--;

             
                    current = this_Expression_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:97:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:98:2: (iv_ruleExpression= ruleExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:99:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression165);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression175); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:106:1: ruleExpression returns [EObject current=null] : (this_Creator_0= ruleCreator | ( (this_Cast_1= ruleCast )? ( (lv_condExpr_2_0= ruleConditionalExpression ) ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Creator_0 = null;

        EObject this_Cast_1 = null;

        EObject lv_condExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:109:28: ( (this_Creator_0= ruleCreator | ( (this_Cast_1= ruleCast )? ( (lv_condExpr_2_0= ruleConditionalExpression ) ) ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:110:1: (this_Creator_0= ruleCreator | ( (this_Cast_1= ruleCast )? ( (lv_condExpr_2_0= ruleConditionalExpression ) ) ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:110:1: (this_Creator_0= ruleCreator | ( (this_Cast_1= ruleCast )? ( (lv_condExpr_2_0= ruleConditionalExpression ) ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_NEW) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_FIELDTOKEN && LA2_0<=RULE_LPAREN)||LA2_0==RULE_NOT||(LA2_0>=RULE_IDENTIFIER && LA2_0<=RULE_NULL)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:111:5: this_Creator_0= ruleCreator
                    {
                     
                            newCompositeNode(grammarAccess.getExpressionAccess().getCreatorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCreator_in_ruleExpression222);
                    this_Creator_0=ruleCreator();

                    state._fsp--;

                     
                            current = this_Creator_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:120:6: ( (this_Cast_1= ruleCast )? ( (lv_condExpr_2_0= ruleConditionalExpression ) ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:120:6: ( (this_Cast_1= ruleCast )? ( (lv_condExpr_2_0= ruleConditionalExpression ) ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:120:7: (this_Cast_1= ruleCast )? ( (lv_condExpr_2_0= ruleConditionalExpression ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:120:7: (this_Cast_1= ruleCast )?
                    int alt1=2;
                    alt1 = dfa1.predict(input);
                    switch (alt1) {
                        case 1 :
                            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:121:5: this_Cast_1= ruleCast
                            {
                             
                                    newCompositeNode(grammarAccess.getExpressionAccess().getCastParserRuleCall_1_0()); 
                                
                            pushFollow(FOLLOW_ruleCast_in_ruleExpression251);
                            this_Cast_1=ruleCast();

                            state._fsp--;

                             
                                    current = this_Cast_1; 
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:129:3: ( (lv_condExpr_2_0= ruleConditionalExpression ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:130:1: (lv_condExpr_2_0= ruleConditionalExpression )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:130:1: (lv_condExpr_2_0= ruleConditionalExpression )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:131:3: lv_condExpr_2_0= ruleConditionalExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionAccess().getCondExprConditionalExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConditionalExpression_in_ruleExpression273);
                    lv_condExpr_2_0=ruleConditionalExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"condExpr",
                            		lv_condExpr_2_0, 
                            		"ConditionalExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleMethodInvocation"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:155:1: entryRuleMethodInvocation returns [EObject current=null] : iv_ruleMethodInvocation= ruleMethodInvocation EOF ;
    public final EObject entryRuleMethodInvocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodInvocation = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:156:2: (iv_ruleMethodInvocation= ruleMethodInvocation EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:157:2: iv_ruleMethodInvocation= ruleMethodInvocation EOF
            {
             newCompositeNode(grammarAccess.getMethodInvocationRule()); 
            pushFollow(FOLLOW_ruleMethodInvocation_in_entryRuleMethodInvocation310);
            iv_ruleMethodInvocation=ruleMethodInvocation();

            state._fsp--;

             current =iv_ruleMethodInvocation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodInvocation320); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodInvocation"


    // $ANTLR start "ruleMethodInvocation"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:164:1: ruleMethodInvocation returns [EObject current=null] : ( ( (lv_methodName_0_0= ruleQualifiedName ) ) ( (lv_args_1_0= ruleArguments ) ) ) ;
    public final EObject ruleMethodInvocation() throws RecognitionException {
        EObject current = null;

        EObject lv_methodName_0_0 = null;

        EObject lv_args_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:167:28: ( ( ( (lv_methodName_0_0= ruleQualifiedName ) ) ( (lv_args_1_0= ruleArguments ) ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:168:1: ( ( (lv_methodName_0_0= ruleQualifiedName ) ) ( (lv_args_1_0= ruleArguments ) ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:168:1: ( ( (lv_methodName_0_0= ruleQualifiedName ) ) ( (lv_args_1_0= ruleArguments ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:168:2: ( (lv_methodName_0_0= ruleQualifiedName ) ) ( (lv_args_1_0= ruleArguments ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:168:2: ( (lv_methodName_0_0= ruleQualifiedName ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:169:1: (lv_methodName_0_0= ruleQualifiedName )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:169:1: (lv_methodName_0_0= ruleQualifiedName )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:170:3: lv_methodName_0_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getMethodInvocationAccess().getMethodNameQualifiedNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleMethodInvocation366);
            lv_methodName_0_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMethodInvocationRule());
            	        }
                   		set(
                   			current, 
                   			"methodName",
                    		lv_methodName_0_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:186:2: ( (lv_args_1_0= ruleArguments ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:187:1: (lv_args_1_0= ruleArguments )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:187:1: (lv_args_1_0= ruleArguments )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:188:3: lv_args_1_0= ruleArguments
            {
             
            	        newCompositeNode(grammarAccess.getMethodInvocationAccess().getArgsArgumentsParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleArguments_in_ruleMethodInvocation387);
            lv_args_1_0=ruleArguments();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMethodInvocationRule());
            	        }
                   		set(
                   			current, 
                   			"args",
                    		lv_args_1_0, 
                    		"Arguments");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodInvocation"


    // $ANTLR start "entryRuleBaseJRExpr"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:212:1: entryRuleBaseJRExpr returns [EObject current=null] : iv_ruleBaseJRExpr= ruleBaseJRExpr EOF ;
    public final EObject entryRuleBaseJRExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseJRExpr = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:213:2: (iv_ruleBaseJRExpr= ruleBaseJRExpr EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:214:2: iv_ruleBaseJRExpr= ruleBaseJRExpr EOF
            {
             newCompositeNode(grammarAccess.getBaseJRExprRule()); 
            pushFollow(FOLLOW_ruleBaseJRExpr_in_entryRuleBaseJRExpr423);
            iv_ruleBaseJRExpr=ruleBaseJRExpr();

            state._fsp--;

             current =iv_ruleBaseJRExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseJRExpr433); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBaseJRExpr"


    // $ANTLR start "ruleBaseJRExpr"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:221:1: ruleBaseJRExpr returns [EObject current=null] : ( ( (lv_fieldToken_0_0= RULE_FIELDTOKEN ) ) | ( (lv_parameterToken_1_0= RULE_PARAMETERTOKEN ) ) | ( (lv_variableToken_2_0= RULE_VARIABLETOKEN ) ) ) ;
    public final EObject ruleBaseJRExpr() throws RecognitionException {
        EObject current = null;

        Token lv_fieldToken_0_0=null;
        Token lv_parameterToken_1_0=null;
        Token lv_variableToken_2_0=null;

         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:224:28: ( ( ( (lv_fieldToken_0_0= RULE_FIELDTOKEN ) ) | ( (lv_parameterToken_1_0= RULE_PARAMETERTOKEN ) ) | ( (lv_variableToken_2_0= RULE_VARIABLETOKEN ) ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:225:1: ( ( (lv_fieldToken_0_0= RULE_FIELDTOKEN ) ) | ( (lv_parameterToken_1_0= RULE_PARAMETERTOKEN ) ) | ( (lv_variableToken_2_0= RULE_VARIABLETOKEN ) ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:225:1: ( ( (lv_fieldToken_0_0= RULE_FIELDTOKEN ) ) | ( (lv_parameterToken_1_0= RULE_PARAMETERTOKEN ) ) | ( (lv_variableToken_2_0= RULE_VARIABLETOKEN ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_FIELDTOKEN:
                {
                alt3=1;
                }
                break;
            case RULE_PARAMETERTOKEN:
                {
                alt3=2;
                }
                break;
            case RULE_VARIABLETOKEN:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:225:2: ( (lv_fieldToken_0_0= RULE_FIELDTOKEN ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:225:2: ( (lv_fieldToken_0_0= RULE_FIELDTOKEN ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:226:1: (lv_fieldToken_0_0= RULE_FIELDTOKEN )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:226:1: (lv_fieldToken_0_0= RULE_FIELDTOKEN )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:227:3: lv_fieldToken_0_0= RULE_FIELDTOKEN
                    {
                    lv_fieldToken_0_0=(Token)match(input,RULE_FIELDTOKEN,FOLLOW_RULE_FIELDTOKEN_in_ruleBaseJRExpr475); 

                    			newLeafNode(lv_fieldToken_0_0, grammarAccess.getBaseJRExprAccess().getFieldTokenFieldTokenTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBaseJRExprRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"fieldToken",
                            		lv_fieldToken_0_0, 
                            		"FieldToken");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:244:6: ( (lv_parameterToken_1_0= RULE_PARAMETERTOKEN ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:244:6: ( (lv_parameterToken_1_0= RULE_PARAMETERTOKEN ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:245:1: (lv_parameterToken_1_0= RULE_PARAMETERTOKEN )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:245:1: (lv_parameterToken_1_0= RULE_PARAMETERTOKEN )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:246:3: lv_parameterToken_1_0= RULE_PARAMETERTOKEN
                    {
                    lv_parameterToken_1_0=(Token)match(input,RULE_PARAMETERTOKEN,FOLLOW_RULE_PARAMETERTOKEN_in_ruleBaseJRExpr503); 

                    			newLeafNode(lv_parameterToken_1_0, grammarAccess.getBaseJRExprAccess().getParameterTokenParameterTokenTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBaseJRExprRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"parameterToken",
                            		lv_parameterToken_1_0, 
                            		"ParameterToken");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:263:6: ( (lv_variableToken_2_0= RULE_VARIABLETOKEN ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:263:6: ( (lv_variableToken_2_0= RULE_VARIABLETOKEN ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:264:1: (lv_variableToken_2_0= RULE_VARIABLETOKEN )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:264:1: (lv_variableToken_2_0= RULE_VARIABLETOKEN )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:265:3: lv_variableToken_2_0= RULE_VARIABLETOKEN
                    {
                    lv_variableToken_2_0=(Token)match(input,RULE_VARIABLETOKEN,FOLLOW_RULE_VARIABLETOKEN_in_ruleBaseJRExpr531); 

                    			newLeafNode(lv_variableToken_2_0, grammarAccess.getBaseJRExprAccess().getVariableTokenVariableTokenTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBaseJRExprRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"variableToken",
                            		lv_variableToken_2_0, 
                            		"VariableToken");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBaseJRExpr"


    // $ANTLR start "entryRuleArguments"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:289:1: entryRuleArguments returns [EObject current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final EObject entryRuleArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArguments = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:290:2: (iv_ruleArguments= ruleArguments EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:291:2: iv_ruleArguments= ruleArguments EOF
            {
             newCompositeNode(grammarAccess.getArgumentsRule()); 
            pushFollow(FOLLOW_ruleArguments_in_entryRuleArguments572);
            iv_ruleArguments=ruleArguments();

            state._fsp--;

             current =iv_ruleArguments; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArguments582); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArguments"


    // $ANTLR start "ruleArguments"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:298:1: ruleArguments returns [EObject current=null] : ( ( (lv_leftP_0_0= RULE_LPAREN ) ) ( (lv_exprLst_1_0= ruleExpressionList ) )? ( (lv_rightP_2_0= RULE_RPAREN ) ) ) ;
    public final EObject ruleArguments() throws RecognitionException {
        EObject current = null;

        Token lv_leftP_0_0=null;
        Token lv_rightP_2_0=null;
        EObject lv_exprLst_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:301:28: ( ( ( (lv_leftP_0_0= RULE_LPAREN ) ) ( (lv_exprLst_1_0= ruleExpressionList ) )? ( (lv_rightP_2_0= RULE_RPAREN ) ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:302:1: ( ( (lv_leftP_0_0= RULE_LPAREN ) ) ( (lv_exprLst_1_0= ruleExpressionList ) )? ( (lv_rightP_2_0= RULE_RPAREN ) ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:302:1: ( ( (lv_leftP_0_0= RULE_LPAREN ) ) ( (lv_exprLst_1_0= ruleExpressionList ) )? ( (lv_rightP_2_0= RULE_RPAREN ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:302:2: ( (lv_leftP_0_0= RULE_LPAREN ) ) ( (lv_exprLst_1_0= ruleExpressionList ) )? ( (lv_rightP_2_0= RULE_RPAREN ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:302:2: ( (lv_leftP_0_0= RULE_LPAREN ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:303:1: (lv_leftP_0_0= RULE_LPAREN )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:303:1: (lv_leftP_0_0= RULE_LPAREN )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:304:3: lv_leftP_0_0= RULE_LPAREN
            {
            lv_leftP_0_0=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleArguments624); 

            			newLeafNode(lv_leftP_0_0, grammarAccess.getArgumentsAccess().getLeftPLPARENTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArgumentsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"leftP",
                    		lv_leftP_0_0, 
                    		"LPAREN");
            	    

            }


            }

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:320:2: ( (lv_exprLst_1_0= ruleExpressionList ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_FIELDTOKEN && LA4_0<=RULE_LPAREN)||LA4_0==RULE_NOT||LA4_0==RULE_NEW||(LA4_0>=RULE_IDENTIFIER && LA4_0<=RULE_NULL)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:321:1: (lv_exprLst_1_0= ruleExpressionList )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:321:1: (lv_exprLst_1_0= ruleExpressionList )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:322:3: lv_exprLst_1_0= ruleExpressionList
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentsAccess().getExprLstExpressionListParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpressionList_in_ruleArguments650);
                    lv_exprLst_1_0=ruleExpressionList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArgumentsRule());
                    	        }
                           		set(
                           			current, 
                           			"exprLst",
                            		lv_exprLst_1_0, 
                            		"ExpressionList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:338:3: ( (lv_rightP_2_0= RULE_RPAREN ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:339:1: (lv_rightP_2_0= RULE_RPAREN )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:339:1: (lv_rightP_2_0= RULE_RPAREN )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:340:3: lv_rightP_2_0= RULE_RPAREN
            {
            lv_rightP_2_0=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleArguments668); 

            			newLeafNode(lv_rightP_2_0, grammarAccess.getArgumentsAccess().getRightPRPARENTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArgumentsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"rightP",
                    		lv_rightP_2_0, 
                    		"RPAREN");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArguments"


    // $ANTLR start "entryRuleExpressionList"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:364:1: entryRuleExpressionList returns [EObject current=null] : iv_ruleExpressionList= ruleExpressionList EOF ;
    public final EObject entryRuleExpressionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionList = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:365:2: (iv_ruleExpressionList= ruleExpressionList EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:366:2: iv_ruleExpressionList= ruleExpressionList EOF
            {
             newCompositeNode(grammarAccess.getExpressionListRule()); 
            pushFollow(FOLLOW_ruleExpressionList_in_entryRuleExpressionList709);
            iv_ruleExpressionList=ruleExpressionList();

            state._fsp--;

             current =iv_ruleExpressionList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionList719); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionList"


    // $ANTLR start "ruleExpressionList"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:373:1: ruleExpressionList returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleExpression ) ) ( ( (lv_commas_1_0= RULE_COMMA ) ) ( (lv_expressions_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleExpressionList() throws RecognitionException {
        EObject current = null;

        Token lv_commas_1_0=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:376:28: ( ( ( (lv_expressions_0_0= ruleExpression ) ) ( ( (lv_commas_1_0= RULE_COMMA ) ) ( (lv_expressions_2_0= ruleExpression ) ) )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:377:1: ( ( (lv_expressions_0_0= ruleExpression ) ) ( ( (lv_commas_1_0= RULE_COMMA ) ) ( (lv_expressions_2_0= ruleExpression ) ) )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:377:1: ( ( (lv_expressions_0_0= ruleExpression ) ) ( ( (lv_commas_1_0= RULE_COMMA ) ) ( (lv_expressions_2_0= ruleExpression ) ) )* )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:377:2: ( (lv_expressions_0_0= ruleExpression ) ) ( ( (lv_commas_1_0= RULE_COMMA ) ) ( (lv_expressions_2_0= ruleExpression ) ) )*
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:377:2: ( (lv_expressions_0_0= ruleExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:378:1: (lv_expressions_0_0= ruleExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:378:1: (lv_expressions_0_0= ruleExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:379:3: lv_expressions_0_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getExpressionListAccess().getExpressionsExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionList765);
            lv_expressions_0_0=ruleExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpressionListRule());
            	        }
                   		add(
                   			current, 
                   			"expressions",
                    		lv_expressions_0_0, 
                    		"Expression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:395:2: ( ( (lv_commas_1_0= RULE_COMMA ) ) ( (lv_expressions_2_0= ruleExpression ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:395:3: ( (lv_commas_1_0= RULE_COMMA ) ) ( (lv_expressions_2_0= ruleExpression ) )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:395:3: ( (lv_commas_1_0= RULE_COMMA ) )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:396:1: (lv_commas_1_0= RULE_COMMA )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:396:1: (lv_commas_1_0= RULE_COMMA )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:397:3: lv_commas_1_0= RULE_COMMA
            	    {
            	    lv_commas_1_0=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleExpressionList783); 

            	    			newLeafNode(lv_commas_1_0, grammarAccess.getExpressionListAccess().getCommasCOMMATerminalRuleCall_1_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExpressionListRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"commas",
            	            		lv_commas_1_0, 
            	            		"COMMA");
            	    	    

            	    }


            	    }

            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:413:2: ( (lv_expressions_2_0= ruleExpression ) )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:414:1: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:414:1: (lv_expressions_2_0= ruleExpression )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:415:3: lv_expressions_2_0= ruleExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpressionListAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionList809);
            	    lv_expressions_2_0=ruleExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExpressionListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"expressions",
            	            		lv_expressions_2_0, 
            	            		"Expression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionList"


    // $ANTLR start "entryRuleBaseCommonExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:439:1: entryRuleBaseCommonExpression returns [EObject current=null] : iv_ruleBaseCommonExpression= ruleBaseCommonExpression EOF ;
    public final EObject entryRuleBaseCommonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseCommonExpression = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:440:2: (iv_ruleBaseCommonExpression= ruleBaseCommonExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:441:2: iv_ruleBaseCommonExpression= ruleBaseCommonExpression EOF
            {
             newCompositeNode(grammarAccess.getBaseCommonExpressionRule()); 
            pushFollow(FOLLOW_ruleBaseCommonExpression_in_entryRuleBaseCommonExpression847);
            iv_ruleBaseCommonExpression=ruleBaseCommonExpression();

            state._fsp--;

             current =iv_ruleBaseCommonExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseCommonExpression857); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBaseCommonExpression"


    // $ANTLR start "ruleBaseCommonExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:448:1: ruleBaseCommonExpression returns [EObject current=null] : ( ( (lv_basejrexpr_0_0= ruleBaseJRExpr ) ) | ( (lv_literal_1_0= ruleLiteral ) ) | (this_LPAREN_2= RULE_LPAREN this_Expression_3= ruleExpression this_RPAREN_4= RULE_RPAREN ) | this_MethodInvocation_5= ruleMethodInvocation ) ;
    public final EObject ruleBaseCommonExpression() throws RecognitionException {
        EObject current = null;

        Token this_LPAREN_2=null;
        Token this_RPAREN_4=null;
        EObject lv_basejrexpr_0_0 = null;

        AntlrDatatypeRuleToken lv_literal_1_0 = null;

        EObject this_Expression_3 = null;

        EObject this_MethodInvocation_5 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:451:28: ( ( ( (lv_basejrexpr_0_0= ruleBaseJRExpr ) ) | ( (lv_literal_1_0= ruleLiteral ) ) | (this_LPAREN_2= RULE_LPAREN this_Expression_3= ruleExpression this_RPAREN_4= RULE_RPAREN ) | this_MethodInvocation_5= ruleMethodInvocation ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:452:1: ( ( (lv_basejrexpr_0_0= ruleBaseJRExpr ) ) | ( (lv_literal_1_0= ruleLiteral ) ) | (this_LPAREN_2= RULE_LPAREN this_Expression_3= ruleExpression this_RPAREN_4= RULE_RPAREN ) | this_MethodInvocation_5= ruleMethodInvocation )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:452:1: ( ( (lv_basejrexpr_0_0= ruleBaseJRExpr ) ) | ( (lv_literal_1_0= ruleLiteral ) ) | (this_LPAREN_2= RULE_LPAREN this_Expression_3= ruleExpression this_RPAREN_4= RULE_RPAREN ) | this_MethodInvocation_5= ruleMethodInvocation )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_FIELDTOKEN:
            case RULE_PARAMETERTOKEN:
            case RULE_VARIABLETOKEN:
                {
                alt6=1;
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
                alt6=2;
                }
                break;
            case RULE_LPAREN:
                {
                alt6=3;
                }
                break;
            case RULE_IDENTIFIER:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:452:2: ( (lv_basejrexpr_0_0= ruleBaseJRExpr ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:452:2: ( (lv_basejrexpr_0_0= ruleBaseJRExpr ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:453:1: (lv_basejrexpr_0_0= ruleBaseJRExpr )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:453:1: (lv_basejrexpr_0_0= ruleBaseJRExpr )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:454:3: lv_basejrexpr_0_0= ruleBaseJRExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getBaseCommonExpressionAccess().getBasejrexprBaseJRExprParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBaseJRExpr_in_ruleBaseCommonExpression903);
                    lv_basejrexpr_0_0=ruleBaseJRExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBaseCommonExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"basejrexpr",
                            		lv_basejrexpr_0_0, 
                            		"BaseJRExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:471:6: ( (lv_literal_1_0= ruleLiteral ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:471:6: ( (lv_literal_1_0= ruleLiteral ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:472:1: (lv_literal_1_0= ruleLiteral )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:472:1: (lv_literal_1_0= ruleLiteral )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:473:3: lv_literal_1_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getBaseCommonExpressionAccess().getLiteralLiteralParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleBaseCommonExpression930);
                    lv_literal_1_0=ruleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBaseCommonExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"literal",
                            		lv_literal_1_0, 
                            		"Literal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:490:6: (this_LPAREN_2= RULE_LPAREN this_Expression_3= ruleExpression this_RPAREN_4= RULE_RPAREN )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:490:6: (this_LPAREN_2= RULE_LPAREN this_Expression_3= ruleExpression this_RPAREN_4= RULE_RPAREN )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:490:7: this_LPAREN_2= RULE_LPAREN this_Expression_3= ruleExpression this_RPAREN_4= RULE_RPAREN
                    {
                    this_LPAREN_2=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleBaseCommonExpression948); 
                     
                        newLeafNode(this_LPAREN_2, grammarAccess.getBaseCommonExpressionAccess().getLPARENTerminalRuleCall_2_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getBaseCommonExpressionAccess().getExpressionParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleBaseCommonExpression969);
                    this_Expression_3=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_3; 
                            afterParserOrEnumRuleCall();
                        
                    this_RPAREN_4=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleBaseCommonExpression979); 
                     
                        newLeafNode(this_RPAREN_4, grammarAccess.getBaseCommonExpressionAccess().getRPARENTerminalRuleCall_2_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:509:5: this_MethodInvocation_5= ruleMethodInvocation
                    {
                     
                            newCompositeNode(grammarAccess.getBaseCommonExpressionAccess().getMethodInvocationParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleMethodInvocation_in_ruleBaseCommonExpression1007);
                    this_MethodInvocation_5=ruleMethodInvocation();

                    state._fsp--;

                     
                            current = this_MethodInvocation_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBaseCommonExpression"


    // $ANTLR start "entryRuleCast"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:525:1: entryRuleCast returns [EObject current=null] : iv_ruleCast= ruleCast EOF ;
    public final EObject entryRuleCast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCast = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:526:2: (iv_ruleCast= ruleCast EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:527:2: iv_ruleCast= ruleCast EOF
            {
             newCompositeNode(grammarAccess.getCastRule()); 
            pushFollow(FOLLOW_ruleCast_in_entryRuleCast1042);
            iv_ruleCast=ruleCast();

            state._fsp--;

             current =iv_ruleCast; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCast1052); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCast"


    // $ANTLR start "ruleCast"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:534:1: ruleCast returns [EObject current=null] : ( ( (lv_lpar_0_0= RULE_LPAREN ) ) ( ( (lv_ptype_1_0= rulePrimitiveType ) ) | ( (lv_arrtype_2_0= ruleArrayType ) ) | ( (lv_clazztype_3_0= ruleClassOrInterfaceType ) ) ) ( (lv_rpar_4_0= RULE_RPAREN ) ) ) ;
    public final EObject ruleCast() throws RecognitionException {
        EObject current = null;

        Token lv_lpar_0_0=null;
        Token lv_rpar_4_0=null;
        AntlrDatatypeRuleToken lv_ptype_1_0 = null;

        EObject lv_arrtype_2_0 = null;

        EObject lv_clazztype_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:537:28: ( ( ( (lv_lpar_0_0= RULE_LPAREN ) ) ( ( (lv_ptype_1_0= rulePrimitiveType ) ) | ( (lv_arrtype_2_0= ruleArrayType ) ) | ( (lv_clazztype_3_0= ruleClassOrInterfaceType ) ) ) ( (lv_rpar_4_0= RULE_RPAREN ) ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:538:1: ( ( (lv_lpar_0_0= RULE_LPAREN ) ) ( ( (lv_ptype_1_0= rulePrimitiveType ) ) | ( (lv_arrtype_2_0= ruleArrayType ) ) | ( (lv_clazztype_3_0= ruleClassOrInterfaceType ) ) ) ( (lv_rpar_4_0= RULE_RPAREN ) ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:538:1: ( ( (lv_lpar_0_0= RULE_LPAREN ) ) ( ( (lv_ptype_1_0= rulePrimitiveType ) ) | ( (lv_arrtype_2_0= ruleArrayType ) ) | ( (lv_clazztype_3_0= ruleClassOrInterfaceType ) ) ) ( (lv_rpar_4_0= RULE_RPAREN ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:538:2: ( (lv_lpar_0_0= RULE_LPAREN ) ) ( ( (lv_ptype_1_0= rulePrimitiveType ) ) | ( (lv_arrtype_2_0= ruleArrayType ) ) | ( (lv_clazztype_3_0= ruleClassOrInterfaceType ) ) ) ( (lv_rpar_4_0= RULE_RPAREN ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:538:2: ( (lv_lpar_0_0= RULE_LPAREN ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:539:1: (lv_lpar_0_0= RULE_LPAREN )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:539:1: (lv_lpar_0_0= RULE_LPAREN )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:540:3: lv_lpar_0_0= RULE_LPAREN
            {
            lv_lpar_0_0=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleCast1094); 

            			newLeafNode(lv_lpar_0_0, grammarAccess.getCastAccess().getLparLPARENTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCastRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"lpar",
                    		lv_lpar_0_0, 
                    		"LPAREN");
            	    

            }


            }

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:556:2: ( ( (lv_ptype_1_0= rulePrimitiveType ) ) | ( (lv_arrtype_2_0= ruleArrayType ) ) | ( (lv_clazztype_3_0= ruleClassOrInterfaceType ) ) )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:556:3: ( (lv_ptype_1_0= rulePrimitiveType ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:556:3: ( (lv_ptype_1_0= rulePrimitiveType ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:557:1: (lv_ptype_1_0= rulePrimitiveType )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:557:1: (lv_ptype_1_0= rulePrimitiveType )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:558:3: lv_ptype_1_0= rulePrimitiveType
                    {
                     
                    	        newCompositeNode(grammarAccess.getCastAccess().getPtypePrimitiveTypeParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimitiveType_in_ruleCast1121);
                    lv_ptype_1_0=rulePrimitiveType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCastRule());
                    	        }
                           		set(
                           			current, 
                           			"ptype",
                            		lv_ptype_1_0, 
                            		"PrimitiveType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:575:6: ( (lv_arrtype_2_0= ruleArrayType ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:575:6: ( (lv_arrtype_2_0= ruleArrayType ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:576:1: (lv_arrtype_2_0= ruleArrayType )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:576:1: (lv_arrtype_2_0= ruleArrayType )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:577:3: lv_arrtype_2_0= ruleArrayType
                    {
                     
                    	        newCompositeNode(grammarAccess.getCastAccess().getArrtypeArrayTypeParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArrayType_in_ruleCast1148);
                    lv_arrtype_2_0=ruleArrayType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCastRule());
                    	        }
                           		set(
                           			current, 
                           			"arrtype",
                            		lv_arrtype_2_0, 
                            		"ArrayType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:594:6: ( (lv_clazztype_3_0= ruleClassOrInterfaceType ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:594:6: ( (lv_clazztype_3_0= ruleClassOrInterfaceType ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:595:1: (lv_clazztype_3_0= ruleClassOrInterfaceType )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:595:1: (lv_clazztype_3_0= ruleClassOrInterfaceType )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:596:3: lv_clazztype_3_0= ruleClassOrInterfaceType
                    {
                     
                    	        newCompositeNode(grammarAccess.getCastAccess().getClazztypeClassOrInterfaceTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClassOrInterfaceType_in_ruleCast1175);
                    lv_clazztype_3_0=ruleClassOrInterfaceType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCastRule());
                    	        }
                           		set(
                           			current, 
                           			"clazztype",
                            		lv_clazztype_3_0, 
                            		"ClassOrInterfaceType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:612:3: ( (lv_rpar_4_0= RULE_RPAREN ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:613:1: (lv_rpar_4_0= RULE_RPAREN )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:613:1: (lv_rpar_4_0= RULE_RPAREN )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:614:3: lv_rpar_4_0= RULE_RPAREN
            {
            lv_rpar_4_0=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleCast1193); 

            			newLeafNode(lv_rpar_4_0, grammarAccess.getCastAccess().getRparRPARENTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCastRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"rpar",
                    		lv_rpar_4_0, 
                    		"RPAREN");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCast"


    // $ANTLR start "entryRuleConditionalExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:638:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:639:2: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:640:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
             newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            pushFollow(FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression1234);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;

             current =iv_ruleConditionalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalExpression1244); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionalExpression"


    // $ANTLR start "ruleConditionalExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:647:1: ruleConditionalExpression returns [EObject current=null] : (this_TestExpression_0= ruleTestExpression (otherlv_1= '?' ( (lv_okReturnedExpr_2_0= ruleExpression ) ) otherlv_3= ':' ( (lv_koReturnedExpr_4_0= ruleExpression ) ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_TestExpression_0 = null;

        EObject lv_okReturnedExpr_2_0 = null;

        EObject lv_koReturnedExpr_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:650:28: ( (this_TestExpression_0= ruleTestExpression (otherlv_1= '?' ( (lv_okReturnedExpr_2_0= ruleExpression ) ) otherlv_3= ':' ( (lv_koReturnedExpr_4_0= ruleExpression ) ) )? ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:651:1: (this_TestExpression_0= ruleTestExpression (otherlv_1= '?' ( (lv_okReturnedExpr_2_0= ruleExpression ) ) otherlv_3= ':' ( (lv_koReturnedExpr_4_0= ruleExpression ) ) )? )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:651:1: (this_TestExpression_0= ruleTestExpression (otherlv_1= '?' ( (lv_okReturnedExpr_2_0= ruleExpression ) ) otherlv_3= ':' ( (lv_koReturnedExpr_4_0= ruleExpression ) ) )? )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:652:5: this_TestExpression_0= ruleTestExpression (otherlv_1= '?' ( (lv_okReturnedExpr_2_0= ruleExpression ) ) otherlv_3= ':' ( (lv_koReturnedExpr_4_0= ruleExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getConditionalExpressionAccess().getTestExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTestExpression_in_ruleConditionalExpression1291);
            this_TestExpression_0=ruleTestExpression();

            state._fsp--;

             
                    current = this_TestExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:660:1: (otherlv_1= '?' ( (lv_okReturnedExpr_2_0= ruleExpression ) ) otherlv_3= ':' ( (lv_koReturnedExpr_4_0= ruleExpression ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==51) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:660:3: otherlv_1= '?' ( (lv_okReturnedExpr_2_0= ruleExpression ) ) otherlv_3= ':' ( (lv_koReturnedExpr_4_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleConditionalExpression1303); 

                        	newLeafNode(otherlv_1, grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_0());
                        
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:664:1: ( (lv_okReturnedExpr_2_0= ruleExpression ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:665:1: (lv_okReturnedExpr_2_0= ruleExpression )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:665:1: (lv_okReturnedExpr_2_0= ruleExpression )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:666:3: lv_okReturnedExpr_2_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getOkReturnedExprExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleConditionalExpression1324);
                    lv_okReturnedExpr_2_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"okReturnedExpr",
                            		lv_okReturnedExpr_2_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleConditionalExpression1336); 

                        	newLeafNode(otherlv_3, grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_2());
                        
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:686:1: ( (lv_koReturnedExpr_4_0= ruleExpression ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:687:1: (lv_koReturnedExpr_4_0= ruleExpression )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:687:1: (lv_koReturnedExpr_4_0= ruleExpression )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:688:3: lv_koReturnedExpr_4_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getKoReturnedExprExpressionParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleConditionalExpression1357);
                    lv_koReturnedExpr_4_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConditionalExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"koReturnedExpr",
                            		lv_koReturnedExpr_4_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionalExpression"


    // $ANTLR start "entryRuleTestExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:712:1: entryRuleTestExpression returns [EObject current=null] : iv_ruleTestExpression= ruleTestExpression EOF ;
    public final EObject entryRuleTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestExpression = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:713:2: (iv_ruleTestExpression= ruleTestExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:714:2: iv_ruleTestExpression= ruleTestExpression EOF
            {
             newCompositeNode(grammarAccess.getTestExpressionRule()); 
            pushFollow(FOLLOW_ruleTestExpression_in_entryRuleTestExpression1395);
            iv_ruleTestExpression=ruleTestExpression();

            state._fsp--;

             current =iv_ruleTestExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestExpression1405); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTestExpression"


    // $ANTLR start "ruleTestExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:721:1: ruleTestExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleTestExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:724:28: (this_OrExpression_0= ruleOrExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:726:5: this_OrExpression_0= ruleOrExpression
            {
             
                    newCompositeNode(grammarAccess.getTestExpressionAccess().getOrExpressionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleOrExpression_in_ruleTestExpression1451);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;

             
                    current = this_OrExpression_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestExpression"


    // $ANTLR start "entryRuleOrExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:742:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:743:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:744:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression1485);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression1495); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:751:1: ruleOrExpression returns [EObject current=null] : ( ( (lv_andExp_0_0= ruleAndExpression ) ) (otherlv_1= '||' ( (lv_andExp_2_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_andExp_0_0 = null;

        EObject lv_andExp_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:754:28: ( ( ( (lv_andExp_0_0= ruleAndExpression ) ) (otherlv_1= '||' ( (lv_andExp_2_0= ruleAndExpression ) ) )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:755:1: ( ( (lv_andExp_0_0= ruleAndExpression ) ) (otherlv_1= '||' ( (lv_andExp_2_0= ruleAndExpression ) ) )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:755:1: ( ( (lv_andExp_0_0= ruleAndExpression ) ) (otherlv_1= '||' ( (lv_andExp_2_0= ruleAndExpression ) ) )* )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:755:2: ( (lv_andExp_0_0= ruleAndExpression ) ) (otherlv_1= '||' ( (lv_andExp_2_0= ruleAndExpression ) ) )*
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:755:2: ( (lv_andExp_0_0= ruleAndExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:756:1: (lv_andExp_0_0= ruleAndExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:756:1: (lv_andExp_0_0= ruleAndExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:757:3: lv_andExp_0_0= ruleAndExpression
            {
             
            	        newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpAndExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression1541);
            lv_andExp_0_0=ruleAndExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"andExp",
                    		lv_andExp_0_0, 
                    		"AndExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:773:2: (otherlv_1= '||' ( (lv_andExp_2_0= ruleAndExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==53) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:773:4: otherlv_1= '||' ( (lv_andExp_2_0= ruleAndExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleOrExpression1554); 

            	        	newLeafNode(otherlv_1, grammarAccess.getOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_0());
            	        
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:777:1: ( (lv_andExp_2_0= ruleAndExpression ) )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:778:1: (lv_andExp_2_0= ruleAndExpression )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:778:1: (lv_andExp_2_0= ruleAndExpression )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:779:3: lv_andExp_2_0= ruleAndExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpAndExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression1575);
            	    lv_andExp_2_0=ruleAndExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"andExp",
            	            		lv_andExp_2_0, 
            	            		"AndExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:803:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:804:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:805:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression1613);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression1623); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:812:1: ruleAndExpression returns [EObject current=null] : ( ( (lv_primaryCond_0_0= rulePrimaryCondExpression ) ) (otherlv_1= '&&' ( (lv_primaryCond_2_0= rulePrimaryCondExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_primaryCond_0_0 = null;

        EObject lv_primaryCond_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:815:28: ( ( ( (lv_primaryCond_0_0= rulePrimaryCondExpression ) ) (otherlv_1= '&&' ( (lv_primaryCond_2_0= rulePrimaryCondExpression ) ) )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:816:1: ( ( (lv_primaryCond_0_0= rulePrimaryCondExpression ) ) (otherlv_1= '&&' ( (lv_primaryCond_2_0= rulePrimaryCondExpression ) ) )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:816:1: ( ( (lv_primaryCond_0_0= rulePrimaryCondExpression ) ) (otherlv_1= '&&' ( (lv_primaryCond_2_0= rulePrimaryCondExpression ) ) )* )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:816:2: ( (lv_primaryCond_0_0= rulePrimaryCondExpression ) ) (otherlv_1= '&&' ( (lv_primaryCond_2_0= rulePrimaryCondExpression ) ) )*
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:816:2: ( (lv_primaryCond_0_0= rulePrimaryCondExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:817:1: (lv_primaryCond_0_0= rulePrimaryCondExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:817:1: (lv_primaryCond_0_0= rulePrimaryCondExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:818:3: lv_primaryCond_0_0= rulePrimaryCondExpression
            {
             
            	        newCompositeNode(grammarAccess.getAndExpressionAccess().getPrimaryCondPrimaryCondExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePrimaryCondExpression_in_ruleAndExpression1669);
            lv_primaryCond_0_0=rulePrimaryCondExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"primaryCond",
                    		lv_primaryCond_0_0, 
                    		"PrimaryCondExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:834:2: (otherlv_1= '&&' ( (lv_primaryCond_2_0= rulePrimaryCondExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==54) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:834:4: otherlv_1= '&&' ( (lv_primaryCond_2_0= rulePrimaryCondExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleAndExpression1682); 

            	        	newLeafNode(otherlv_1, grammarAccess.getAndExpressionAccess().getAmpersandAmpersandKeyword_1_0());
            	        
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:838:1: ( (lv_primaryCond_2_0= rulePrimaryCondExpression ) )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:839:1: (lv_primaryCond_2_0= rulePrimaryCondExpression )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:839:1: (lv_primaryCond_2_0= rulePrimaryCondExpression )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:840:3: lv_primaryCond_2_0= rulePrimaryCondExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndExpressionAccess().getPrimaryCondPrimaryCondExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimaryCondExpression_in_ruleAndExpression1703);
            	    lv_primaryCond_2_0=rulePrimaryCondExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"primaryCond",
            	            		lv_primaryCond_2_0, 
            	            		"PrimaryCondExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRulePrimaryCondExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:864:1: entryRulePrimaryCondExpression returns [EObject current=null] : iv_rulePrimaryCondExpression= rulePrimaryCondExpression EOF ;
    public final EObject entryRulePrimaryCondExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryCondExpression = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:865:2: (iv_rulePrimaryCondExpression= rulePrimaryCondExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:866:2: iv_rulePrimaryCondExpression= rulePrimaryCondExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryCondExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryCondExpression_in_entryRulePrimaryCondExpression1741);
            iv_rulePrimaryCondExpression=rulePrimaryCondExpression();

            state._fsp--;

             current =iv_rulePrimaryCondExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryCondExpression1751); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryCondExpression"


    // $ANTLR start "rulePrimaryCondExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:873:1: rulePrimaryCondExpression returns [EObject current=null] : ( (lv_expr_0_0= ruleBaseBooleanExpr ) ) ;
    public final EObject rulePrimaryCondExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:876:28: ( ( (lv_expr_0_0= ruleBaseBooleanExpr ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:877:1: ( (lv_expr_0_0= ruleBaseBooleanExpr ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:877:1: ( (lv_expr_0_0= ruleBaseBooleanExpr ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:878:1: (lv_expr_0_0= ruleBaseBooleanExpr )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:878:1: (lv_expr_0_0= ruleBaseBooleanExpr )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:879:3: lv_expr_0_0= ruleBaseBooleanExpr
            {
             
            	        newCompositeNode(grammarAccess.getPrimaryCondExpressionAccess().getExprBaseBooleanExprParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleBaseBooleanExpr_in_rulePrimaryCondExpression1796);
            lv_expr_0_0=ruleBaseBooleanExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPrimaryCondExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_0_0, 
                    		"BaseBooleanExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryCondExpression"


    // $ANTLR start "entryRuleBaseBooleanExpr"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:903:1: entryRuleBaseBooleanExpr returns [EObject current=null] : iv_ruleBaseBooleanExpr= ruleBaseBooleanExpr EOF ;
    public final EObject entryRuleBaseBooleanExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseBooleanExpr = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:904:2: (iv_ruleBaseBooleanExpr= ruleBaseBooleanExpr EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:905:2: iv_ruleBaseBooleanExpr= ruleBaseBooleanExpr EOF
            {
             newCompositeNode(grammarAccess.getBaseBooleanExprRule()); 
            pushFollow(FOLLOW_ruleBaseBooleanExpr_in_entryRuleBaseBooleanExpr1831);
            iv_ruleBaseBooleanExpr=ruleBaseBooleanExpr();

            state._fsp--;

             current =iv_ruleBaseBooleanExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseBooleanExpr1841); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBaseBooleanExpr"


    // $ANTLR start "ruleBaseBooleanExpr"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:912:1: ruleBaseBooleanExpr returns [EObject current=null] : ( (this_NOT_0= RULE_NOT )? this_EqualityExpression_1= ruleEqualityExpression ) ;
    public final EObject ruleBaseBooleanExpr() throws RecognitionException {
        EObject current = null;

        Token this_NOT_0=null;
        EObject this_EqualityExpression_1 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:915:28: ( ( (this_NOT_0= RULE_NOT )? this_EqualityExpression_1= ruleEqualityExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:916:1: ( (this_NOT_0= RULE_NOT )? this_EqualityExpression_1= ruleEqualityExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:916:1: ( (this_NOT_0= RULE_NOT )? this_EqualityExpression_1= ruleEqualityExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:916:2: (this_NOT_0= RULE_NOT )? this_EqualityExpression_1= ruleEqualityExpression
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:916:2: (this_NOT_0= RULE_NOT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_NOT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:916:3: this_NOT_0= RULE_NOT
                    {
                    this_NOT_0=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleBaseBooleanExpr1878); 
                     
                        newLeafNode(this_NOT_0, grammarAccess.getBaseBooleanExprAccess().getNOTTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getBaseBooleanExprAccess().getEqualityExpressionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleEqualityExpression_in_ruleBaseBooleanExpr1901);
            this_EqualityExpression_1=ruleEqualityExpression();

            state._fsp--;

             
                    current = this_EqualityExpression_1; 
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBaseBooleanExpr"


    // $ANTLR start "entryRuleEqualityExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:937:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:938:2: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:939:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
             newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            pushFollow(FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression1936);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;

             current =iv_ruleEqualityExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualityExpression1946); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:946:1: ruleEqualityExpression returns [EObject current=null] : ( ( (lv_instanceof_0_0= ruleInstanceOfExpression ) ) ( (this_EQUAL_1= RULE_EQUAL | this_NOTEQUAL_2= RULE_NOTEQUAL ) ( (lv_instanceof_3_0= ruleInstanceOfExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        Token this_EQUAL_1=null;
        Token this_NOTEQUAL_2=null;
        EObject lv_instanceof_0_0 = null;

        EObject lv_instanceof_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:949:28: ( ( ( (lv_instanceof_0_0= ruleInstanceOfExpression ) ) ( (this_EQUAL_1= RULE_EQUAL | this_NOTEQUAL_2= RULE_NOTEQUAL ) ( (lv_instanceof_3_0= ruleInstanceOfExpression ) ) )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:950:1: ( ( (lv_instanceof_0_0= ruleInstanceOfExpression ) ) ( (this_EQUAL_1= RULE_EQUAL | this_NOTEQUAL_2= RULE_NOTEQUAL ) ( (lv_instanceof_3_0= ruleInstanceOfExpression ) ) )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:950:1: ( ( (lv_instanceof_0_0= ruleInstanceOfExpression ) ) ( (this_EQUAL_1= RULE_EQUAL | this_NOTEQUAL_2= RULE_NOTEQUAL ) ( (lv_instanceof_3_0= ruleInstanceOfExpression ) ) )* )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:950:2: ( (lv_instanceof_0_0= ruleInstanceOfExpression ) ) ( (this_EQUAL_1= RULE_EQUAL | this_NOTEQUAL_2= RULE_NOTEQUAL ) ( (lv_instanceof_3_0= ruleInstanceOfExpression ) ) )*
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:950:2: ( (lv_instanceof_0_0= ruleInstanceOfExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:951:1: (lv_instanceof_0_0= ruleInstanceOfExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:951:1: (lv_instanceof_0_0= ruleInstanceOfExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:952:3: lv_instanceof_0_0= ruleInstanceOfExpression
            {
             
            	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getInstanceofInstanceOfExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleInstanceOfExpression_in_ruleEqualityExpression1992);
            lv_instanceof_0_0=ruleInstanceOfExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"instanceof",
                    		lv_instanceof_0_0, 
                    		"InstanceOfExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:968:2: ( (this_EQUAL_1= RULE_EQUAL | this_NOTEQUAL_2= RULE_NOTEQUAL ) ( (lv_instanceof_3_0= ruleInstanceOfExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_EQUAL && LA13_0<=RULE_NOTEQUAL)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:968:3: (this_EQUAL_1= RULE_EQUAL | this_NOTEQUAL_2= RULE_NOTEQUAL ) ( (lv_instanceof_3_0= ruleInstanceOfExpression ) )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:968:3: (this_EQUAL_1= RULE_EQUAL | this_NOTEQUAL_2= RULE_NOTEQUAL )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==RULE_EQUAL) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==RULE_NOTEQUAL) ) {
            	        alt12=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:968:4: this_EQUAL_1= RULE_EQUAL
            	            {
            	            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_ruleEqualityExpression2005); 
            	             
            	                newLeafNode(this_EQUAL_1, grammarAccess.getEqualityExpressionAccess().getEQUALTerminalRuleCall_1_0_0()); 
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:973:6: this_NOTEQUAL_2= RULE_NOTEQUAL
            	            {
            	            this_NOTEQUAL_2=(Token)match(input,RULE_NOTEQUAL,FOLLOW_RULE_NOTEQUAL_in_ruleEqualityExpression2021); 
            	             
            	                newLeafNode(this_NOTEQUAL_2, grammarAccess.getEqualityExpressionAccess().getNOTEQUALTerminalRuleCall_1_0_1()); 
            	                

            	            }
            	            break;

            	    }

            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:977:2: ( (lv_instanceof_3_0= ruleInstanceOfExpression ) )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:978:1: (lv_instanceof_3_0= ruleInstanceOfExpression )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:978:1: (lv_instanceof_3_0= ruleInstanceOfExpression )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:979:3: lv_instanceof_3_0= ruleInstanceOfExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getInstanceofInstanceOfExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstanceOfExpression_in_ruleEqualityExpression2042);
            	    lv_instanceof_3_0=ruleInstanceOfExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"instanceof",
            	            		lv_instanceof_3_0, 
            	            		"InstanceOfExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleRelationalExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1003:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1004:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1005:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
             newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression2080);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;

             current =iv_ruleRelationalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression2090); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1012:1: ruleRelationalExpression returns [EObject current=null] : ( ( (lv_rel_0_0= ruleAdditiveExpression ) ) ( ruleRelationalOp ( (lv_rel_2_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_rel_0_0 = null;

        EObject lv_rel_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1015:28: ( ( ( (lv_rel_0_0= ruleAdditiveExpression ) ) ( ruleRelationalOp ( (lv_rel_2_0= ruleAdditiveExpression ) ) )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1016:1: ( ( (lv_rel_0_0= ruleAdditiveExpression ) ) ( ruleRelationalOp ( (lv_rel_2_0= ruleAdditiveExpression ) ) )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1016:1: ( ( (lv_rel_0_0= ruleAdditiveExpression ) ) ( ruleRelationalOp ( (lv_rel_2_0= ruleAdditiveExpression ) ) )* )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1016:2: ( (lv_rel_0_0= ruleAdditiveExpression ) ) ( ruleRelationalOp ( (lv_rel_2_0= ruleAdditiveExpression ) ) )*
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1016:2: ( (lv_rel_0_0= ruleAdditiveExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1017:1: (lv_rel_0_0= ruleAdditiveExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1017:1: (lv_rel_0_0= ruleAdditiveExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1018:3: lv_rel_0_0= ruleAdditiveExpression
            {
             
            	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRelAdditiveExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression2136);
            lv_rel_0_0=ruleAdditiveExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"rel",
                    		lv_rel_0_0, 
                    		"AdditiveExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1034:2: ( ruleRelationalOp ( (lv_rel_2_0= ruleAdditiveExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_GT && LA14_0<=RULE_LTE)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1035:5: ruleRelationalOp ( (lv_rel_2_0= ruleAdditiveExpression ) )
            	    {
            	     
            	            newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRelationalOpParserRuleCall_1_0()); 
            	        
            	    pushFollow(FOLLOW_ruleRelationalOp_in_ruleRelationalExpression2153);
            	    ruleRelationalOp();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1042:1: ( (lv_rel_2_0= ruleAdditiveExpression ) )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1043:1: (lv_rel_2_0= ruleAdditiveExpression )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1043:1: (lv_rel_2_0= ruleAdditiveExpression )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1044:3: lv_rel_2_0= ruleAdditiveExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRelAdditiveExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression2173);
            	    lv_rel_2_0=ruleAdditiveExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rel",
            	            		lv_rel_2_0, 
            	            		"AdditiveExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleInstanceOfExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1068:1: entryRuleInstanceOfExpression returns [EObject current=null] : iv_ruleInstanceOfExpression= ruleInstanceOfExpression EOF ;
    public final EObject entryRuleInstanceOfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceOfExpression = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1069:2: (iv_ruleInstanceOfExpression= ruleInstanceOfExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1070:2: iv_ruleInstanceOfExpression= ruleInstanceOfExpression EOF
            {
             newCompositeNode(grammarAccess.getInstanceOfExpressionRule()); 
            pushFollow(FOLLOW_ruleInstanceOfExpression_in_entryRuleInstanceOfExpression2211);
            iv_ruleInstanceOfExpression=ruleInstanceOfExpression();

            state._fsp--;

             current =iv_ruleInstanceOfExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceOfExpression2221); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstanceOfExpression"


    // $ANTLR start "ruleInstanceOfExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1077:1: ruleInstanceOfExpression returns [EObject current=null] : ( ( (lv_el_0_0= ruleRelationalExpression ) ) (this_INSTANCEOF_1= RULE_INSTANCEOF ( ( (lv_target_2_1= ruleRelationalExpression | lv_target_2_2= ruleClassOrInterfaceType ) ) ) )? ) ;
    public final EObject ruleInstanceOfExpression() throws RecognitionException {
        EObject current = null;

        Token this_INSTANCEOF_1=null;
        EObject lv_el_0_0 = null;

        EObject lv_target_2_1 = null;

        EObject lv_target_2_2 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1080:28: ( ( ( (lv_el_0_0= ruleRelationalExpression ) ) (this_INSTANCEOF_1= RULE_INSTANCEOF ( ( (lv_target_2_1= ruleRelationalExpression | lv_target_2_2= ruleClassOrInterfaceType ) ) ) )? ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1081:1: ( ( (lv_el_0_0= ruleRelationalExpression ) ) (this_INSTANCEOF_1= RULE_INSTANCEOF ( ( (lv_target_2_1= ruleRelationalExpression | lv_target_2_2= ruleClassOrInterfaceType ) ) ) )? )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1081:1: ( ( (lv_el_0_0= ruleRelationalExpression ) ) (this_INSTANCEOF_1= RULE_INSTANCEOF ( ( (lv_target_2_1= ruleRelationalExpression | lv_target_2_2= ruleClassOrInterfaceType ) ) ) )? )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1081:2: ( (lv_el_0_0= ruleRelationalExpression ) ) (this_INSTANCEOF_1= RULE_INSTANCEOF ( ( (lv_target_2_1= ruleRelationalExpression | lv_target_2_2= ruleClassOrInterfaceType ) ) ) )?
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1081:2: ( (lv_el_0_0= ruleRelationalExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1082:1: (lv_el_0_0= ruleRelationalExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1082:1: (lv_el_0_0= ruleRelationalExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1083:3: lv_el_0_0= ruleRelationalExpression
            {
             
            	        newCompositeNode(grammarAccess.getInstanceOfExpressionAccess().getElRelationalExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleRelationalExpression_in_ruleInstanceOfExpression2267);
            lv_el_0_0=ruleRelationalExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInstanceOfExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"el",
                    		lv_el_0_0, 
                    		"RelationalExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1099:2: (this_INSTANCEOF_1= RULE_INSTANCEOF ( ( (lv_target_2_1= ruleRelationalExpression | lv_target_2_2= ruleClassOrInterfaceType ) ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INSTANCEOF) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1099:3: this_INSTANCEOF_1= RULE_INSTANCEOF ( ( (lv_target_2_1= ruleRelationalExpression | lv_target_2_2= ruleClassOrInterfaceType ) ) )
                    {
                    this_INSTANCEOF_1=(Token)match(input,RULE_INSTANCEOF,FOLLOW_RULE_INSTANCEOF_in_ruleInstanceOfExpression2279); 
                     
                        newLeafNode(this_INSTANCEOF_1, grammarAccess.getInstanceOfExpressionAccess().getINSTANCEOFTerminalRuleCall_1_0()); 
                        
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1103:1: ( ( (lv_target_2_1= ruleRelationalExpression | lv_target_2_2= ruleClassOrInterfaceType ) ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1104:1: ( (lv_target_2_1= ruleRelationalExpression | lv_target_2_2= ruleClassOrInterfaceType ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1104:1: ( (lv_target_2_1= ruleRelationalExpression | lv_target_2_2= ruleClassOrInterfaceType ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1105:1: (lv_target_2_1= ruleRelationalExpression | lv_target_2_2= ruleClassOrInterfaceType )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1105:1: (lv_target_2_1= ruleRelationalExpression | lv_target_2_2= ruleClassOrInterfaceType )
                    int alt15=2;
                    alt15 = dfa15.predict(input);
                    switch (alt15) {
                        case 1 :
                            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1106:3: lv_target_2_1= ruleRelationalExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getInstanceOfExpressionAccess().getTargetRelationalExpressionParserRuleCall_1_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRelationalExpression_in_ruleInstanceOfExpression2301);
                            lv_target_2_1=ruleRelationalExpression();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getInstanceOfExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"target",
                                    		lv_target_2_1, 
                                    		"RelationalExpression");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;
                        case 2 :
                            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1121:8: lv_target_2_2= ruleClassOrInterfaceType
                            {
                             
                            	        newCompositeNode(grammarAccess.getInstanceOfExpressionAccess().getTargetClassOrInterfaceTypeParserRuleCall_1_1_0_1()); 
                            	    
                            pushFollow(FOLLOW_ruleClassOrInterfaceType_in_ruleInstanceOfExpression2320);
                            lv_target_2_2=ruleClassOrInterfaceType();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getInstanceOfExpressionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"target",
                                    		lv_target_2_2, 
                                    		"ClassOrInterfaceType");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstanceOfExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1147:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1148:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1149:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
             newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression2361);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;

             current =iv_ruleAdditiveExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression2371); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1156:1: ruleAdditiveExpression returns [EObject current=null] : ( ( (lv_multExpr_0_0= ruleMultiplicativeExpression ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_multExpr_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_multExpr_0_0 = null;

        EObject lv_multExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1159:28: ( ( ( (lv_multExpr_0_0= ruleMultiplicativeExpression ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_multExpr_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1160:1: ( ( (lv_multExpr_0_0= ruleMultiplicativeExpression ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_multExpr_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1160:1: ( ( (lv_multExpr_0_0= ruleMultiplicativeExpression ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_multExpr_3_0= ruleMultiplicativeExpression ) ) )* )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1160:2: ( (lv_multExpr_0_0= ruleMultiplicativeExpression ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_multExpr_3_0= ruleMultiplicativeExpression ) ) )*
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1160:2: ( (lv_multExpr_0_0= ruleMultiplicativeExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1161:1: (lv_multExpr_0_0= ruleMultiplicativeExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1161:1: (lv_multExpr_0_0= ruleMultiplicativeExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1162:3: lv_multExpr_0_0= ruleMultiplicativeExpression
            {
             
            	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultExprMultiplicativeExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression2417);
            lv_multExpr_0_0=ruleMultiplicativeExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"multExpr",
                    		lv_multExpr_0_0, 
                    		"MultiplicativeExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1178:2: ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_multExpr_3_0= ruleMultiplicativeExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=55 && LA18_0<=56)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1178:3: (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_multExpr_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1178:3: (otherlv_1= '+' | otherlv_2= '-' )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==55) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==56) ) {
            	        alt17=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1178:5: otherlv_1= '+'
            	            {
            	            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleAdditiveExpression2431); 

            	                	newLeafNode(otherlv_1, grammarAccess.getAdditiveExpressionAccess().getPlusSignKeyword_1_0_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1183:7: otherlv_2= '-'
            	            {
            	            otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleAdditiveExpression2449); 

            	                	newLeafNode(otherlv_2, grammarAccess.getAdditiveExpressionAccess().getHyphenMinusKeyword_1_0_1());
            	                

            	            }
            	            break;

            	    }

            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1187:2: ( (lv_multExpr_3_0= ruleMultiplicativeExpression ) )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1188:1: (lv_multExpr_3_0= ruleMultiplicativeExpression )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1188:1: (lv_multExpr_3_0= ruleMultiplicativeExpression )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1189:3: lv_multExpr_3_0= ruleMultiplicativeExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultExprMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression2471);
            	    lv_multExpr_3_0=ruleMultiplicativeExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"multExpr",
            	            		lv_multExpr_3_0, 
            	            		"MultiplicativeExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1213:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1214:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1215:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression2509);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;

             current =iv_ruleMultiplicativeExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression2519); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1222:1: ruleMultiplicativeExpression returns [EObject current=null] : ( ( (lv_baseExpr_0_0= ruleBaseCommonExpression ) ) (this_DOT_1= RULE_DOT ( (lv_methods_2_0= ruleMethodInvocation ) ) )* ( (otherlv_3= '*' | otherlv_4= '/' ) ( (lv_baseExpr_5_0= ruleBaseCommonExpression ) ) (this_DOT_6= RULE_DOT ( (lv_methods_7_0= ruleMethodInvocation ) ) )* )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        Token this_DOT_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_DOT_6=null;
        EObject lv_baseExpr_0_0 = null;

        EObject lv_methods_2_0 = null;

        EObject lv_baseExpr_5_0 = null;

        EObject lv_methods_7_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1225:28: ( ( ( (lv_baseExpr_0_0= ruleBaseCommonExpression ) ) (this_DOT_1= RULE_DOT ( (lv_methods_2_0= ruleMethodInvocation ) ) )* ( (otherlv_3= '*' | otherlv_4= '/' ) ( (lv_baseExpr_5_0= ruleBaseCommonExpression ) ) (this_DOT_6= RULE_DOT ( (lv_methods_7_0= ruleMethodInvocation ) ) )* )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1226:1: ( ( (lv_baseExpr_0_0= ruleBaseCommonExpression ) ) (this_DOT_1= RULE_DOT ( (lv_methods_2_0= ruleMethodInvocation ) ) )* ( (otherlv_3= '*' | otherlv_4= '/' ) ( (lv_baseExpr_5_0= ruleBaseCommonExpression ) ) (this_DOT_6= RULE_DOT ( (lv_methods_7_0= ruleMethodInvocation ) ) )* )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1226:1: ( ( (lv_baseExpr_0_0= ruleBaseCommonExpression ) ) (this_DOT_1= RULE_DOT ( (lv_methods_2_0= ruleMethodInvocation ) ) )* ( (otherlv_3= '*' | otherlv_4= '/' ) ( (lv_baseExpr_5_0= ruleBaseCommonExpression ) ) (this_DOT_6= RULE_DOT ( (lv_methods_7_0= ruleMethodInvocation ) ) )* )* )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1226:2: ( (lv_baseExpr_0_0= ruleBaseCommonExpression ) ) (this_DOT_1= RULE_DOT ( (lv_methods_2_0= ruleMethodInvocation ) ) )* ( (otherlv_3= '*' | otherlv_4= '/' ) ( (lv_baseExpr_5_0= ruleBaseCommonExpression ) ) (this_DOT_6= RULE_DOT ( (lv_methods_7_0= ruleMethodInvocation ) ) )* )*
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1226:2: ( (lv_baseExpr_0_0= ruleBaseCommonExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1227:1: (lv_baseExpr_0_0= ruleBaseCommonExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1227:1: (lv_baseExpr_0_0= ruleBaseCommonExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1228:3: lv_baseExpr_0_0= ruleBaseCommonExpression
            {
             
            	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getBaseExprBaseCommonExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBaseCommonExpression_in_ruleMultiplicativeExpression2565);
            lv_baseExpr_0_0=ruleBaseCommonExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"baseExpr",
                    		lv_baseExpr_0_0, 
                    		"BaseCommonExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1244:2: (this_DOT_1= RULE_DOT ( (lv_methods_2_0= ruleMethodInvocation ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_DOT) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1244:3: this_DOT_1= RULE_DOT ( (lv_methods_2_0= ruleMethodInvocation ) )
            	    {
            	    this_DOT_1=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleMultiplicativeExpression2577); 
            	     
            	        newLeafNode(this_DOT_1, grammarAccess.getMultiplicativeExpressionAccess().getDOTTerminalRuleCall_1_0()); 
            	        
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1248:1: ( (lv_methods_2_0= ruleMethodInvocation ) )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1249:1: (lv_methods_2_0= ruleMethodInvocation )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1249:1: (lv_methods_2_0= ruleMethodInvocation )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1250:3: lv_methods_2_0= ruleMethodInvocation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getMethodsMethodInvocationParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethodInvocation_in_ruleMultiplicativeExpression2597);
            	    lv_methods_2_0=ruleMethodInvocation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"methods",
            	            		lv_methods_2_0, 
            	            		"MethodInvocation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1266:4: ( (otherlv_3= '*' | otherlv_4= '/' ) ( (lv_baseExpr_5_0= ruleBaseCommonExpression ) ) (this_DOT_6= RULE_DOT ( (lv_methods_7_0= ruleMethodInvocation ) ) )* )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=57 && LA22_0<=58)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1266:5: (otherlv_3= '*' | otherlv_4= '/' ) ( (lv_baseExpr_5_0= ruleBaseCommonExpression ) ) (this_DOT_6= RULE_DOT ( (lv_methods_7_0= ruleMethodInvocation ) ) )*
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1266:5: (otherlv_3= '*' | otherlv_4= '/' )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==57) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==58) ) {
            	        alt20=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1266:7: otherlv_3= '*'
            	            {
            	            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleMultiplicativeExpression2613); 

            	                	newLeafNode(otherlv_3, grammarAccess.getMultiplicativeExpressionAccess().getAsteriskKeyword_2_0_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1271:7: otherlv_4= '/'
            	            {
            	            otherlv_4=(Token)match(input,58,FOLLOW_58_in_ruleMultiplicativeExpression2631); 

            	                	newLeafNode(otherlv_4, grammarAccess.getMultiplicativeExpressionAccess().getSolidusKeyword_2_0_1());
            	                

            	            }
            	            break;

            	    }

            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1275:2: ( (lv_baseExpr_5_0= ruleBaseCommonExpression ) )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1276:1: (lv_baseExpr_5_0= ruleBaseCommonExpression )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1276:1: (lv_baseExpr_5_0= ruleBaseCommonExpression )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1277:3: lv_baseExpr_5_0= ruleBaseCommonExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getBaseExprBaseCommonExpressionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBaseCommonExpression_in_ruleMultiplicativeExpression2653);
            	    lv_baseExpr_5_0=ruleBaseCommonExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"baseExpr",
            	            		lv_baseExpr_5_0, 
            	            		"BaseCommonExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1293:2: (this_DOT_6= RULE_DOT ( (lv_methods_7_0= ruleMethodInvocation ) ) )*
            	    loop21:
            	    do {
            	        int alt21=2;
            	        int LA21_0 = input.LA(1);

            	        if ( (LA21_0==RULE_DOT) ) {
            	            alt21=1;
            	        }


            	        switch (alt21) {
            	    	case 1 :
            	    	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1293:3: this_DOT_6= RULE_DOT ( (lv_methods_7_0= ruleMethodInvocation ) )
            	    	    {
            	    	    this_DOT_6=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleMultiplicativeExpression2665); 
            	    	     
            	    	        newLeafNode(this_DOT_6, grammarAccess.getMultiplicativeExpressionAccess().getDOTTerminalRuleCall_2_2_0()); 
            	    	        
            	    	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1297:1: ( (lv_methods_7_0= ruleMethodInvocation ) )
            	    	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1298:1: (lv_methods_7_0= ruleMethodInvocation )
            	    	    {
            	    	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1298:1: (lv_methods_7_0= ruleMethodInvocation )
            	    	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1299:3: lv_methods_7_0= ruleMethodInvocation
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getMethodsMethodInvocationParserRuleCall_2_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleMethodInvocation_in_ruleMultiplicativeExpression2685);
            	    	    lv_methods_7_0=ruleMethodInvocation();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"methods",
            	    	            		lv_methods_7_0, 
            	    	            		"MethodInvocation");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop21;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleRelationalOp"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1323:1: entryRuleRelationalOp returns [String current=null] : iv_ruleRelationalOp= ruleRelationalOp EOF ;
    public final String entryRuleRelationalOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationalOp = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1324:2: (iv_ruleRelationalOp= ruleRelationalOp EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1325:2: iv_ruleRelationalOp= ruleRelationalOp EOF
            {
             newCompositeNode(grammarAccess.getRelationalOpRule()); 
            pushFollow(FOLLOW_ruleRelationalOp_in_entryRuleRelationalOp2726);
            iv_ruleRelationalOp=ruleRelationalOp();

            state._fsp--;

             current =iv_ruleRelationalOp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalOp2737); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationalOp"


    // $ANTLR start "ruleRelationalOp"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1332:1: ruleRelationalOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_GT_0= RULE_GT | this_GTE_1= RULE_GTE | this_LT_2= RULE_LT | this_LTE_3= RULE_LTE ) ;
    public final AntlrDatatypeRuleToken ruleRelationalOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_GT_0=null;
        Token this_GTE_1=null;
        Token this_LT_2=null;
        Token this_LTE_3=null;

         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1335:28: ( (this_GT_0= RULE_GT | this_GTE_1= RULE_GTE | this_LT_2= RULE_LT | this_LTE_3= RULE_LTE ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1336:1: (this_GT_0= RULE_GT | this_GTE_1= RULE_GTE | this_LT_2= RULE_LT | this_LTE_3= RULE_LTE )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1336:1: (this_GT_0= RULE_GT | this_GTE_1= RULE_GTE | this_LT_2= RULE_LT | this_LTE_3= RULE_LTE )
            int alt23=4;
            switch ( input.LA(1) ) {
            case RULE_GT:
                {
                alt23=1;
                }
                break;
            case RULE_GTE:
                {
                alt23=2;
                }
                break;
            case RULE_LT:
                {
                alt23=3;
                }
                break;
            case RULE_LTE:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1336:6: this_GT_0= RULE_GT
                    {
                    this_GT_0=(Token)match(input,RULE_GT,FOLLOW_RULE_GT_in_ruleRelationalOp2777); 

                    		current.merge(this_GT_0);
                        
                     
                        newLeafNode(this_GT_0, grammarAccess.getRelationalOpAccess().getGTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1344:10: this_GTE_1= RULE_GTE
                    {
                    this_GTE_1=(Token)match(input,RULE_GTE,FOLLOW_RULE_GTE_in_ruleRelationalOp2803); 

                    		current.merge(this_GTE_1);
                        
                     
                        newLeafNode(this_GTE_1, grammarAccess.getRelationalOpAccess().getGTETerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1352:10: this_LT_2= RULE_LT
                    {
                    this_LT_2=(Token)match(input,RULE_LT,FOLLOW_RULE_LT_in_ruleRelationalOp2829); 

                    		current.merge(this_LT_2);
                        
                     
                        newLeafNode(this_LT_2, grammarAccess.getRelationalOpAccess().getLTTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1360:10: this_LTE_3= RULE_LTE
                    {
                    this_LTE_3=(Token)match(input,RULE_LTE,FOLLOW_RULE_LTE_in_ruleRelationalOp2855); 

                    		current.merge(this_LTE_3);
                        
                     
                        newLeafNode(this_LTE_3, grammarAccess.getRelationalOpAccess().getLTETerminalRuleCall_3()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalOp"


    // $ANTLR start "entryRuleCreator"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1375:1: entryRuleCreator returns [EObject current=null] : iv_ruleCreator= ruleCreator EOF ;
    public final EObject entryRuleCreator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreator = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1376:2: (iv_ruleCreator= ruleCreator EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1377:2: iv_ruleCreator= ruleCreator EOF
            {
             newCompositeNode(grammarAccess.getCreatorRule()); 
            pushFollow(FOLLOW_ruleCreator_in_entryRuleCreator2900);
            iv_ruleCreator=ruleCreator();

            state._fsp--;

             current =iv_ruleCreator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreator2910); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreator"


    // $ANTLR start "ruleCreator"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1384:1: ruleCreator returns [EObject current=null] : (this_ClassCreator_0= ruleClassCreator | this_ArrayCreator_1= ruleArrayCreator ) ;
    public final EObject ruleCreator() throws RecognitionException {
        EObject current = null;

        EObject this_ClassCreator_0 = null;

        EObject this_ArrayCreator_1 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1387:28: ( (this_ClassCreator_0= ruleClassCreator | this_ArrayCreator_1= ruleArrayCreator ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1388:1: (this_ClassCreator_0= ruleClassCreator | this_ArrayCreator_1= ruleArrayCreator )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1388:1: (this_ClassCreator_0= ruleClassCreator | this_ArrayCreator_1= ruleArrayCreator )
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1389:5: this_ClassCreator_0= ruleClassCreator
                    {
                     
                            newCompositeNode(grammarAccess.getCreatorAccess().getClassCreatorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleClassCreator_in_ruleCreator2957);
                    this_ClassCreator_0=ruleClassCreator();

                    state._fsp--;

                     
                            current = this_ClassCreator_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1399:5: this_ArrayCreator_1= ruleArrayCreator
                    {
                     
                            newCompositeNode(grammarAccess.getCreatorAccess().getArrayCreatorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleArrayCreator_in_ruleCreator2984);
                    this_ArrayCreator_1=ruleArrayCreator();

                    state._fsp--;

                     
                            current = this_ArrayCreator_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreator"


    // $ANTLR start "entryRuleClassCreator"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1415:1: entryRuleClassCreator returns [EObject current=null] : iv_ruleClassCreator= ruleClassCreator EOF ;
    public final EObject entryRuleClassCreator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassCreator = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1416:2: (iv_ruleClassCreator= ruleClassCreator EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1417:2: iv_ruleClassCreator= ruleClassCreator EOF
            {
             newCompositeNode(grammarAccess.getClassCreatorRule()); 
            pushFollow(FOLLOW_ruleClassCreator_in_entryRuleClassCreator3019);
            iv_ruleClassCreator=ruleClassCreator();

            state._fsp--;

             current =iv_ruleClassCreator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassCreator3029); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassCreator"


    // $ANTLR start "ruleClassCreator"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1424:1: ruleClassCreator returns [EObject current=null] : (this_NEW_0= RULE_NEW ( (lv_clazz_1_0= ruleClassOrInterfaceType ) ) ( (lv_args_2_0= ruleArguments ) ) ) ;
    public final EObject ruleClassCreator() throws RecognitionException {
        EObject current = null;

        Token this_NEW_0=null;
        EObject lv_clazz_1_0 = null;

        EObject lv_args_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1427:28: ( (this_NEW_0= RULE_NEW ( (lv_clazz_1_0= ruleClassOrInterfaceType ) ) ( (lv_args_2_0= ruleArguments ) ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1428:1: (this_NEW_0= RULE_NEW ( (lv_clazz_1_0= ruleClassOrInterfaceType ) ) ( (lv_args_2_0= ruleArguments ) ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1428:1: (this_NEW_0= RULE_NEW ( (lv_clazz_1_0= ruleClassOrInterfaceType ) ) ( (lv_args_2_0= ruleArguments ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1428:2: this_NEW_0= RULE_NEW ( (lv_clazz_1_0= ruleClassOrInterfaceType ) ) ( (lv_args_2_0= ruleArguments ) )
            {
            this_NEW_0=(Token)match(input,RULE_NEW,FOLLOW_RULE_NEW_in_ruleClassCreator3065); 
             
                newLeafNode(this_NEW_0, grammarAccess.getClassCreatorAccess().getNEWTerminalRuleCall_0()); 
                
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1432:1: ( (lv_clazz_1_0= ruleClassOrInterfaceType ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1433:1: (lv_clazz_1_0= ruleClassOrInterfaceType )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1433:1: (lv_clazz_1_0= ruleClassOrInterfaceType )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1434:3: lv_clazz_1_0= ruleClassOrInterfaceType
            {
             
            	        newCompositeNode(grammarAccess.getClassCreatorAccess().getClazzClassOrInterfaceTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleClassOrInterfaceType_in_ruleClassCreator3085);
            lv_clazz_1_0=ruleClassOrInterfaceType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassCreatorRule());
            	        }
                   		set(
                   			current, 
                   			"clazz",
                    		lv_clazz_1_0, 
                    		"ClassOrInterfaceType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1450:2: ( (lv_args_2_0= ruleArguments ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1451:1: (lv_args_2_0= ruleArguments )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1451:1: (lv_args_2_0= ruleArguments )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1452:3: lv_args_2_0= ruleArguments
            {
             
            	        newCompositeNode(grammarAccess.getClassCreatorAccess().getArgsArgumentsParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleArguments_in_ruleClassCreator3106);
            lv_args_2_0=ruleArguments();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassCreatorRule());
            	        }
                   		set(
                   			current, 
                   			"args",
                    		lv_args_2_0, 
                    		"Arguments");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassCreator"


    // $ANTLR start "entryRuleArrayCreator"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1476:1: entryRuleArrayCreator returns [EObject current=null] : iv_ruleArrayCreator= ruleArrayCreator EOF ;
    public final EObject entryRuleArrayCreator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayCreator = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1477:2: (iv_ruleArrayCreator= ruleArrayCreator EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1478:2: iv_ruleArrayCreator= ruleArrayCreator EOF
            {
             newCompositeNode(grammarAccess.getArrayCreatorRule()); 
            pushFollow(FOLLOW_ruleArrayCreator_in_entryRuleArrayCreator3142);
            iv_ruleArrayCreator=ruleArrayCreator();

            state._fsp--;

             current =iv_ruleArrayCreator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayCreator3152); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayCreator"


    // $ANTLR start "ruleArrayCreator"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1485:1: ruleArrayCreator returns [EObject current=null] : (this_NEW_0= RULE_NEW ( (lv_type_1_0= ruleArrayType ) ) ( (lv_arrayInitializer_2_0= ruleArrayInitializer ) ) ) ;
    public final EObject ruleArrayCreator() throws RecognitionException {
        EObject current = null;

        Token this_NEW_0=null;
        EObject lv_type_1_0 = null;

        EObject lv_arrayInitializer_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1488:28: ( (this_NEW_0= RULE_NEW ( (lv_type_1_0= ruleArrayType ) ) ( (lv_arrayInitializer_2_0= ruleArrayInitializer ) ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1489:1: (this_NEW_0= RULE_NEW ( (lv_type_1_0= ruleArrayType ) ) ( (lv_arrayInitializer_2_0= ruleArrayInitializer ) ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1489:1: (this_NEW_0= RULE_NEW ( (lv_type_1_0= ruleArrayType ) ) ( (lv_arrayInitializer_2_0= ruleArrayInitializer ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1489:2: this_NEW_0= RULE_NEW ( (lv_type_1_0= ruleArrayType ) ) ( (lv_arrayInitializer_2_0= ruleArrayInitializer ) )
            {
            this_NEW_0=(Token)match(input,RULE_NEW,FOLLOW_RULE_NEW_in_ruleArrayCreator3188); 
             
                newLeafNode(this_NEW_0, grammarAccess.getArrayCreatorAccess().getNEWTerminalRuleCall_0()); 
                
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1493:1: ( (lv_type_1_0= ruleArrayType ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1494:1: (lv_type_1_0= ruleArrayType )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1494:1: (lv_type_1_0= ruleArrayType )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1495:3: lv_type_1_0= ruleArrayType
            {
             
            	        newCompositeNode(grammarAccess.getArrayCreatorAccess().getTypeArrayTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleArrayType_in_ruleArrayCreator3208);
            lv_type_1_0=ruleArrayType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArrayCreatorRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"ArrayType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1511:2: ( (lv_arrayInitializer_2_0= ruleArrayInitializer ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1512:1: (lv_arrayInitializer_2_0= ruleArrayInitializer )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1512:1: (lv_arrayInitializer_2_0= ruleArrayInitializer )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1513:3: lv_arrayInitializer_2_0= ruleArrayInitializer
            {
             
            	        newCompositeNode(grammarAccess.getArrayCreatorAccess().getArrayInitializerArrayInitializerParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleArrayInitializer_in_ruleArrayCreator3229);
            lv_arrayInitializer_2_0=ruleArrayInitializer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArrayCreatorRule());
            	        }
                   		set(
                   			current, 
                   			"arrayInitializer",
                    		lv_arrayInitializer_2_0, 
                    		"ArrayInitializer");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayCreator"


    // $ANTLR start "entryRuleArrayInitializer"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1537:1: entryRuleArrayInitializer returns [EObject current=null] : iv_ruleArrayInitializer= ruleArrayInitializer EOF ;
    public final EObject entryRuleArrayInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayInitializer = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1538:2: (iv_ruleArrayInitializer= ruleArrayInitializer EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1539:2: iv_ruleArrayInitializer= ruleArrayInitializer EOF
            {
             newCompositeNode(grammarAccess.getArrayInitializerRule()); 
            pushFollow(FOLLOW_ruleArrayInitializer_in_entryRuleArrayInitializer3265);
            iv_ruleArrayInitializer=ruleArrayInitializer();

            state._fsp--;

             current =iv_ruleArrayInitializer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayInitializer3275); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayInitializer"


    // $ANTLR start "ruleArrayInitializer"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1546:1: ruleArrayInitializer returns [EObject current=null] : ( () this_LBRACE_1= RULE_LBRACE ( ( (lv_firstEl_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_otherEls_4_0= ruleExpression ) ) )* )? (this_COMMA_5= RULE_COMMA )? this_RBRACE_6= RULE_RBRACE ) ;
    public final EObject ruleArrayInitializer() throws RecognitionException {
        EObject current = null;

        Token this_LBRACE_1=null;
        Token this_COMMA_3=null;
        Token this_COMMA_5=null;
        Token this_RBRACE_6=null;
        EObject lv_firstEl_2_0 = null;

        EObject lv_otherEls_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1549:28: ( ( () this_LBRACE_1= RULE_LBRACE ( ( (lv_firstEl_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_otherEls_4_0= ruleExpression ) ) )* )? (this_COMMA_5= RULE_COMMA )? this_RBRACE_6= RULE_RBRACE ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1550:1: ( () this_LBRACE_1= RULE_LBRACE ( ( (lv_firstEl_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_otherEls_4_0= ruleExpression ) ) )* )? (this_COMMA_5= RULE_COMMA )? this_RBRACE_6= RULE_RBRACE )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1550:1: ( () this_LBRACE_1= RULE_LBRACE ( ( (lv_firstEl_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_otherEls_4_0= ruleExpression ) ) )* )? (this_COMMA_5= RULE_COMMA )? this_RBRACE_6= RULE_RBRACE )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1550:2: () this_LBRACE_1= RULE_LBRACE ( ( (lv_firstEl_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_otherEls_4_0= ruleExpression ) ) )* )? (this_COMMA_5= RULE_COMMA )? this_RBRACE_6= RULE_RBRACE
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1550:2: ()
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1551:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getArrayInitializerAccess().getArrayInitializerAction_0(),
                        current);
                

            }

            this_LBRACE_1=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleArrayInitializer3320); 
             
                newLeafNode(this_LBRACE_1, grammarAccess.getArrayInitializerAccess().getLBRACETerminalRuleCall_1()); 
                
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1560:1: ( ( (lv_firstEl_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_otherEls_4_0= ruleExpression ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_FIELDTOKEN && LA26_0<=RULE_LPAREN)||LA26_0==RULE_NOT||LA26_0==RULE_NEW||(LA26_0>=RULE_IDENTIFIER && LA26_0<=RULE_NULL)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1560:2: ( (lv_firstEl_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_otherEls_4_0= ruleExpression ) ) )*
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1560:2: ( (lv_firstEl_2_0= ruleExpression ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1561:1: (lv_firstEl_2_0= ruleExpression )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1561:1: (lv_firstEl_2_0= ruleExpression )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1562:3: lv_firstEl_2_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayInitializerAccess().getFirstElExpressionParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleArrayInitializer3341);
                    lv_firstEl_2_0=ruleExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrayInitializerRule());
                    	        }
                           		set(
                           			current, 
                           			"firstEl",
                            		lv_firstEl_2_0, 
                            		"Expression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1578:2: (this_COMMA_3= RULE_COMMA ( (lv_otherEls_4_0= ruleExpression ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_COMMA) ) {
                            int LA25_1 = input.LA(2);

                            if ( ((LA25_1>=RULE_FIELDTOKEN && LA25_1<=RULE_LPAREN)||LA25_1==RULE_NOT||LA25_1==RULE_NEW||(LA25_1>=RULE_IDENTIFIER && LA25_1<=RULE_NULL)) ) {
                                alt25=1;
                            }


                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1578:3: this_COMMA_3= RULE_COMMA ( (lv_otherEls_4_0= ruleExpression ) )
                    	    {
                    	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleArrayInitializer3353); 
                    	     
                    	        newLeafNode(this_COMMA_3, grammarAccess.getArrayInitializerAccess().getCOMMATerminalRuleCall_2_1_0()); 
                    	        
                    	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1582:1: ( (lv_otherEls_4_0= ruleExpression ) )
                    	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1583:1: (lv_otherEls_4_0= ruleExpression )
                    	    {
                    	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1583:1: (lv_otherEls_4_0= ruleExpression )
                    	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1584:3: lv_otherEls_4_0= ruleExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getArrayInitializerAccess().getOtherElsExpressionParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleArrayInitializer3373);
                    	    lv_otherEls_4_0=ruleExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getArrayInitializerRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"otherEls",
                    	            		lv_otherEls_4_0, 
                    	            		"Expression");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1600:6: (this_COMMA_5= RULE_COMMA )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_COMMA) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1600:7: this_COMMA_5= RULE_COMMA
                    {
                    this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleArrayInitializer3389); 
                     
                        newLeafNode(this_COMMA_5, grammarAccess.getArrayInitializerAccess().getCOMMATerminalRuleCall_3()); 
                        

                    }
                    break;

            }

            this_RBRACE_6=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleArrayInitializer3401); 
             
                newLeafNode(this_RBRACE_6, grammarAccess.getArrayInitializerAccess().getRBRACETerminalRuleCall_4()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayInitializer"


    // $ANTLR start "entryRuleArrayType"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1618:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1619:2: (iv_ruleArrayType= ruleArrayType EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1620:2: iv_ruleArrayType= ruleArrayType EOF
            {
             newCompositeNode(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_ruleArrayType_in_entryRuleArrayType3438);
            iv_ruleArrayType=ruleArrayType();

            state._fsp--;

             current =iv_ruleArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayType3448); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1627:1: ruleArrayType returns [EObject current=null] : ( ( ( (lv_clazzInterf_0_0= ruleClassOrInterfaceType ) ) | ( (lv_primtype_1_0= rulePrimitiveType ) ) ) (this_LBRACKET_2= RULE_LBRACKET this_RBRACKET_3= RULE_RBRACKET )+ ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token this_LBRACKET_2=null;
        Token this_RBRACKET_3=null;
        EObject lv_clazzInterf_0_0 = null;

        AntlrDatatypeRuleToken lv_primtype_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1630:28: ( ( ( ( (lv_clazzInterf_0_0= ruleClassOrInterfaceType ) ) | ( (lv_primtype_1_0= rulePrimitiveType ) ) ) (this_LBRACKET_2= RULE_LBRACKET this_RBRACKET_3= RULE_RBRACKET )+ ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1631:1: ( ( ( (lv_clazzInterf_0_0= ruleClassOrInterfaceType ) ) | ( (lv_primtype_1_0= rulePrimitiveType ) ) ) (this_LBRACKET_2= RULE_LBRACKET this_RBRACKET_3= RULE_RBRACKET )+ )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1631:1: ( ( ( (lv_clazzInterf_0_0= ruleClassOrInterfaceType ) ) | ( (lv_primtype_1_0= rulePrimitiveType ) ) ) (this_LBRACKET_2= RULE_LBRACKET this_RBRACKET_3= RULE_RBRACKET )+ )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1631:2: ( ( (lv_clazzInterf_0_0= ruleClassOrInterfaceType ) ) | ( (lv_primtype_1_0= rulePrimitiveType ) ) ) (this_LBRACKET_2= RULE_LBRACKET this_RBRACKET_3= RULE_RBRACKET )+
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1631:2: ( ( (lv_clazzInterf_0_0= ruleClassOrInterfaceType ) ) | ( (lv_primtype_1_0= rulePrimitiveType ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_IDENTIFIER) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=59 && LA28_0<=66)) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1631:3: ( (lv_clazzInterf_0_0= ruleClassOrInterfaceType ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1631:3: ( (lv_clazzInterf_0_0= ruleClassOrInterfaceType ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1632:1: (lv_clazzInterf_0_0= ruleClassOrInterfaceType )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1632:1: (lv_clazzInterf_0_0= ruleClassOrInterfaceType )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1633:3: lv_clazzInterf_0_0= ruleClassOrInterfaceType
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayTypeAccess().getClazzInterfClassOrInterfaceTypeParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClassOrInterfaceType_in_ruleArrayType3495);
                    lv_clazzInterf_0_0=ruleClassOrInterfaceType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrayTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"clazzInterf",
                            		lv_clazzInterf_0_0, 
                            		"ClassOrInterfaceType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1650:6: ( (lv_primtype_1_0= rulePrimitiveType ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1650:6: ( (lv_primtype_1_0= rulePrimitiveType ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1651:1: (lv_primtype_1_0= rulePrimitiveType )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1651:1: (lv_primtype_1_0= rulePrimitiveType )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1652:3: lv_primtype_1_0= rulePrimitiveType
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayTypeAccess().getPrimtypePrimitiveTypeParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimitiveType_in_ruleArrayType3522);
                    lv_primtype_1_0=rulePrimitiveType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrayTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"primtype",
                            		lv_primtype_1_0, 
                            		"PrimitiveType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1668:3: (this_LBRACKET_2= RULE_LBRACKET this_RBRACKET_3= RULE_RBRACKET )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_LBRACKET) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1668:4: this_LBRACKET_2= RULE_LBRACKET this_RBRACKET_3= RULE_RBRACKET
            	    {
            	    this_LBRACKET_2=(Token)match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_ruleArrayType3535); 
            	     
            	        newLeafNode(this_LBRACKET_2, grammarAccess.getArrayTypeAccess().getLBRACKETTerminalRuleCall_1_0()); 
            	        
            	    this_RBRACKET_3=(Token)match(input,RULE_RBRACKET,FOLLOW_RULE_RBRACKET_in_ruleArrayType3545); 
            	     
            	        newLeafNode(this_RBRACKET_3, grammarAccess.getArrayTypeAccess().getRBRACKETTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleClassOrInterfaceType"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1684:1: entryRuleClassOrInterfaceType returns [EObject current=null] : iv_ruleClassOrInterfaceType= ruleClassOrInterfaceType EOF ;
    public final EObject entryRuleClassOrInterfaceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassOrInterfaceType = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1685:2: (iv_ruleClassOrInterfaceType= ruleClassOrInterfaceType EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1686:2: iv_ruleClassOrInterfaceType= ruleClassOrInterfaceType EOF
            {
             newCompositeNode(grammarAccess.getClassOrInterfaceTypeRule()); 
            pushFollow(FOLLOW_ruleClassOrInterfaceType_in_entryRuleClassOrInterfaceType3582);
            iv_ruleClassOrInterfaceType=ruleClassOrInterfaceType();

            state._fsp--;

             current =iv_ruleClassOrInterfaceType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassOrInterfaceType3592); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassOrInterfaceType"


    // $ANTLR start "ruleClassOrInterfaceType"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1693:1: ruleClassOrInterfaceType returns [EObject current=null] : ( (lv_qualifiedName_0_0= ruleQualifiedName ) ) ;
    public final EObject ruleClassOrInterfaceType() throws RecognitionException {
        EObject current = null;

        EObject lv_qualifiedName_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1696:28: ( ( (lv_qualifiedName_0_0= ruleQualifiedName ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1697:1: ( (lv_qualifiedName_0_0= ruleQualifiedName ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1697:1: ( (lv_qualifiedName_0_0= ruleQualifiedName ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1698:1: (lv_qualifiedName_0_0= ruleQualifiedName )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1698:1: (lv_qualifiedName_0_0= ruleQualifiedName )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1699:3: lv_qualifiedName_0_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getClassOrInterfaceTypeAccess().getQualifiedNameQualifiedNameParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleClassOrInterfaceType3637);
            lv_qualifiedName_0_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassOrInterfaceTypeRule());
            	        }
                   		set(
                   			current, 
                   			"qualifiedName",
                    		lv_qualifiedName_0_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassOrInterfaceType"


    // $ANTLR start "entryRuleQualifiedName"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1723:1: entryRuleQualifiedName returns [EObject current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final EObject entryRuleQualifiedName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedName = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1724:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1725:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3672);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName3682); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1732:1: ruleQualifiedName returns [EObject current=null] : ( () ( (lv_identifier_1_0= RULE_IDENTIFIER ) ) ( ( (lv_dot_2_0= RULE_DOT ) ) ( (lv_identifier_3_0= RULE_IDENTIFIER ) ) )* ) ;
    public final EObject ruleQualifiedName() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_1_0=null;
        Token lv_dot_2_0=null;
        Token lv_identifier_3_0=null;

         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1735:28: ( ( () ( (lv_identifier_1_0= RULE_IDENTIFIER ) ) ( ( (lv_dot_2_0= RULE_DOT ) ) ( (lv_identifier_3_0= RULE_IDENTIFIER ) ) )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1736:1: ( () ( (lv_identifier_1_0= RULE_IDENTIFIER ) ) ( ( (lv_dot_2_0= RULE_DOT ) ) ( (lv_identifier_3_0= RULE_IDENTIFIER ) ) )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1736:1: ( () ( (lv_identifier_1_0= RULE_IDENTIFIER ) ) ( ( (lv_dot_2_0= RULE_DOT ) ) ( (lv_identifier_3_0= RULE_IDENTIFIER ) ) )* )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1736:2: () ( (lv_identifier_1_0= RULE_IDENTIFIER ) ) ( ( (lv_dot_2_0= RULE_DOT ) ) ( (lv_identifier_3_0= RULE_IDENTIFIER ) ) )*
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1736:2: ()
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1737:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getQualifiedNameAccess().getQualifiedNameAction_0(),
                        current);
                

            }

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1742:2: ( (lv_identifier_1_0= RULE_IDENTIFIER ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1743:1: (lv_identifier_1_0= RULE_IDENTIFIER )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1743:1: (lv_identifier_1_0= RULE_IDENTIFIER )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1744:3: lv_identifier_1_0= RULE_IDENTIFIER
            {
            lv_identifier_1_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleQualifiedName3733); 

            			newLeafNode(lv_identifier_1_0, grammarAccess.getQualifiedNameAccess().getIdentifierIDENTIFIERTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQualifiedNameRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"identifier",
                    		lv_identifier_1_0, 
                    		"IDENTIFIER");
            	    

            }


            }

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1760:2: ( ( (lv_dot_2_0= RULE_DOT ) ) ( (lv_identifier_3_0= RULE_IDENTIFIER ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_DOT) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1760:3: ( (lv_dot_2_0= RULE_DOT ) ) ( (lv_identifier_3_0= RULE_IDENTIFIER ) )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1760:3: ( (lv_dot_2_0= RULE_DOT ) )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1761:1: (lv_dot_2_0= RULE_DOT )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1761:1: (lv_dot_2_0= RULE_DOT )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1762:3: lv_dot_2_0= RULE_DOT
            	    {
            	    lv_dot_2_0=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleQualifiedName3756); 

            	    			newLeafNode(lv_dot_2_0, grammarAccess.getQualifiedNameAccess().getDotDOTTerminalRuleCall_2_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getQualifiedNameRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"dot",
            	            		lv_dot_2_0, 
            	            		"DOT");
            	    	    

            	    }


            	    }

            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1778:2: ( (lv_identifier_3_0= RULE_IDENTIFIER ) )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1779:1: (lv_identifier_3_0= RULE_IDENTIFIER )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1779:1: (lv_identifier_3_0= RULE_IDENTIFIER )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1780:3: lv_identifier_3_0= RULE_IDENTIFIER
            	    {
            	    lv_identifier_3_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleQualifiedName3778); 

            	    			newLeafNode(lv_identifier_3_0, grammarAccess.getQualifiedNameAccess().getIdentifierIDENTIFIERTerminalRuleCall_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getQualifiedNameRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"identifier",
            	            		lv_identifier_3_0, 
            	            		"IDENTIFIER");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleLiteral"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1804:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1805:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1806:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral3822);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral3833); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1813:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INTLITERAL_0= RULE_INTLITERAL | this_LONGLITERAL_1= RULE_LONGLITERAL | this_FLOATLITERAL_2= RULE_FLOATLITERAL | this_DOUBLELITERAL_3= RULE_DOUBLELITERAL | this_CHARLITERAL_4= RULE_CHARLITERAL | this_STRINGLITERAL_5= RULE_STRINGLITERAL | this_TRUE_6= RULE_TRUE | this_FALSE_7= RULE_FALSE | this_NULL_8= RULE_NULL ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTLITERAL_0=null;
        Token this_LONGLITERAL_1=null;
        Token this_FLOATLITERAL_2=null;
        Token this_DOUBLELITERAL_3=null;
        Token this_CHARLITERAL_4=null;
        Token this_STRINGLITERAL_5=null;
        Token this_TRUE_6=null;
        Token this_FALSE_7=null;
        Token this_NULL_8=null;

         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1816:28: ( (this_INTLITERAL_0= RULE_INTLITERAL | this_LONGLITERAL_1= RULE_LONGLITERAL | this_FLOATLITERAL_2= RULE_FLOATLITERAL | this_DOUBLELITERAL_3= RULE_DOUBLELITERAL | this_CHARLITERAL_4= RULE_CHARLITERAL | this_STRINGLITERAL_5= RULE_STRINGLITERAL | this_TRUE_6= RULE_TRUE | this_FALSE_7= RULE_FALSE | this_NULL_8= RULE_NULL ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1817:1: (this_INTLITERAL_0= RULE_INTLITERAL | this_LONGLITERAL_1= RULE_LONGLITERAL | this_FLOATLITERAL_2= RULE_FLOATLITERAL | this_DOUBLELITERAL_3= RULE_DOUBLELITERAL | this_CHARLITERAL_4= RULE_CHARLITERAL | this_STRINGLITERAL_5= RULE_STRINGLITERAL | this_TRUE_6= RULE_TRUE | this_FALSE_7= RULE_FALSE | this_NULL_8= RULE_NULL )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1817:1: (this_INTLITERAL_0= RULE_INTLITERAL | this_LONGLITERAL_1= RULE_LONGLITERAL | this_FLOATLITERAL_2= RULE_FLOATLITERAL | this_DOUBLELITERAL_3= RULE_DOUBLELITERAL | this_CHARLITERAL_4= RULE_CHARLITERAL | this_STRINGLITERAL_5= RULE_STRINGLITERAL | this_TRUE_6= RULE_TRUE | this_FALSE_7= RULE_FALSE | this_NULL_8= RULE_NULL )
            int alt31=9;
            switch ( input.LA(1) ) {
            case RULE_INTLITERAL:
                {
                alt31=1;
                }
                break;
            case RULE_LONGLITERAL:
                {
                alt31=2;
                }
                break;
            case RULE_FLOATLITERAL:
                {
                alt31=3;
                }
                break;
            case RULE_DOUBLELITERAL:
                {
                alt31=4;
                }
                break;
            case RULE_CHARLITERAL:
                {
                alt31=5;
                }
                break;
            case RULE_STRINGLITERAL:
                {
                alt31=6;
                }
                break;
            case RULE_TRUE:
                {
                alt31=7;
                }
                break;
            case RULE_FALSE:
                {
                alt31=8;
                }
                break;
            case RULE_NULL:
                {
                alt31=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1817:6: this_INTLITERAL_0= RULE_INTLITERAL
                    {
                    this_INTLITERAL_0=(Token)match(input,RULE_INTLITERAL,FOLLOW_RULE_INTLITERAL_in_ruleLiteral3873); 

                    		current.merge(this_INTLITERAL_0);
                        
                     
                        newLeafNode(this_INTLITERAL_0, grammarAccess.getLiteralAccess().getINTLITERALTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1825:10: this_LONGLITERAL_1= RULE_LONGLITERAL
                    {
                    this_LONGLITERAL_1=(Token)match(input,RULE_LONGLITERAL,FOLLOW_RULE_LONGLITERAL_in_ruleLiteral3899); 

                    		current.merge(this_LONGLITERAL_1);
                        
                     
                        newLeafNode(this_LONGLITERAL_1, grammarAccess.getLiteralAccess().getLONGLITERALTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1833:10: this_FLOATLITERAL_2= RULE_FLOATLITERAL
                    {
                    this_FLOATLITERAL_2=(Token)match(input,RULE_FLOATLITERAL,FOLLOW_RULE_FLOATLITERAL_in_ruleLiteral3925); 

                    		current.merge(this_FLOATLITERAL_2);
                        
                     
                        newLeafNode(this_FLOATLITERAL_2, grammarAccess.getLiteralAccess().getFLOATLITERALTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1841:10: this_DOUBLELITERAL_3= RULE_DOUBLELITERAL
                    {
                    this_DOUBLELITERAL_3=(Token)match(input,RULE_DOUBLELITERAL,FOLLOW_RULE_DOUBLELITERAL_in_ruleLiteral3951); 

                    		current.merge(this_DOUBLELITERAL_3);
                        
                     
                        newLeafNode(this_DOUBLELITERAL_3, grammarAccess.getLiteralAccess().getDOUBLELITERALTerminalRuleCall_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1849:10: this_CHARLITERAL_4= RULE_CHARLITERAL
                    {
                    this_CHARLITERAL_4=(Token)match(input,RULE_CHARLITERAL,FOLLOW_RULE_CHARLITERAL_in_ruleLiteral3977); 

                    		current.merge(this_CHARLITERAL_4);
                        
                     
                        newLeafNode(this_CHARLITERAL_4, grammarAccess.getLiteralAccess().getCHARLITERALTerminalRuleCall_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1857:10: this_STRINGLITERAL_5= RULE_STRINGLITERAL
                    {
                    this_STRINGLITERAL_5=(Token)match(input,RULE_STRINGLITERAL,FOLLOW_RULE_STRINGLITERAL_in_ruleLiteral4003); 

                    		current.merge(this_STRINGLITERAL_5);
                        
                     
                        newLeafNode(this_STRINGLITERAL_5, grammarAccess.getLiteralAccess().getSTRINGLITERALTerminalRuleCall_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1865:10: this_TRUE_6= RULE_TRUE
                    {
                    this_TRUE_6=(Token)match(input,RULE_TRUE,FOLLOW_RULE_TRUE_in_ruleLiteral4029); 

                    		current.merge(this_TRUE_6);
                        
                     
                        newLeafNode(this_TRUE_6, grammarAccess.getLiteralAccess().getTRUETerminalRuleCall_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1873:10: this_FALSE_7= RULE_FALSE
                    {
                    this_FALSE_7=(Token)match(input,RULE_FALSE,FOLLOW_RULE_FALSE_in_ruleLiteral4055); 

                    		current.merge(this_FALSE_7);
                        
                     
                        newLeafNode(this_FALSE_7, grammarAccess.getLiteralAccess().getFALSETerminalRuleCall_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1881:10: this_NULL_8= RULE_NULL
                    {
                    this_NULL_8=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleLiteral4081); 

                    		current.merge(this_NULL_8);
                        
                     
                        newLeafNode(this_NULL_8, grammarAccess.getLiteralAccess().getNULLTerminalRuleCall_8()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRulePrimitiveType"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1896:1: entryRulePrimitiveType returns [String current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final String entryRulePrimitiveType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveType = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1897:2: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1898:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType4127);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;

             current =iv_rulePrimitiveType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType4138); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1905:1: rulePrimitiveType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'char' | kw= 'byte' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'float' | kw= 'double' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1908:28: ( (kw= 'boolean' | kw= 'char' | kw= 'byte' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'float' | kw= 'double' ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1909:1: (kw= 'boolean' | kw= 'char' | kw= 'byte' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'float' | kw= 'double' )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1909:1: (kw= 'boolean' | kw= 'char' | kw= 'byte' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'float' | kw= 'double' )
            int alt32=8;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt32=1;
                }
                break;
            case 60:
                {
                alt32=2;
                }
                break;
            case 61:
                {
                alt32=3;
                }
                break;
            case 62:
                {
                alt32=4;
                }
                break;
            case 63:
                {
                alt32=5;
                }
                break;
            case 64:
                {
                alt32=6;
                }
                break;
            case 65:
                {
                alt32=7;
                }
                break;
            case 66:
                {
                alt32=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1910:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_rulePrimitiveType4176); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getBooleanKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1917:2: kw= 'char'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_rulePrimitiveType4195); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getCharKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1924:2: kw= 'byte'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_rulePrimitiveType4214); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getByteKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1931:2: kw= 'short'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_rulePrimitiveType4233); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getShortKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1938:2: kw= 'int'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_rulePrimitiveType4252); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getIntKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1945:2: kw= 'long'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_rulePrimitiveType4271); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getLongKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1952:2: kw= 'float'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_rulePrimitiveType4290); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getFloatKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1959:2: kw= 'double'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_rulePrimitiveType4309); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getDoubleKeyword_7()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveType"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA1_eotS =
        "\7\uffff";
    static final String DFA1_eofS =
        "\7\uffff";
    static final String DFA1_minS =
        "\2\4\1\uffff\1\7\1\uffff\1\30\1\7";
    static final String DFA1_maxS =
        "\1\41\1\102\1\uffff\1\26\1\uffff\1\30\1\26";
    static final String DFA1_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\2\uffff";
    static final String DFA1_specialS =
        "\7\uffff}>";
    static final String[] DFA1_transitionS = {
            "\3\2\1\1\2\uffff\1\2\15\uffff\12\2",
            "\4\2\2\uffff\1\2\10\uffff\1\2\4\uffff\1\3\11\2\31\uffff\10"+
            "\4",
            "",
            "\1\2\1\4\5\uffff\1\5\7\uffff\1\4",
            "",
            "\1\6",
            "\1\2\1\4\5\uffff\1\5\7\uffff\1\4"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "120:7: (this_Cast_1= ruleCast )?";
        }
    }
    static final String DFA7_eotS =
        "\17\uffff";
    static final String DFA7_eofS =
        "\17\uffff";
    static final String DFA7_minS =
        "\1\30\11\10\2\uffff\1\30\1\uffff\1\10";
    static final String DFA7_maxS =
        "\1\102\11\26\2\uffff\1\30\1\uffff\1\26";
    static final String DFA7_acceptS =
        "\12\uffff\1\2\1\1\1\uffff\1\3\1\uffff";
    static final String DFA7_specialS =
        "\17\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\11\42\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10",
            "\1\13\15\uffff\1\12",
            "\1\13\15\uffff\1\12",
            "\1\13\15\uffff\1\12",
            "\1\13\15\uffff\1\12",
            "\1\13\15\uffff\1\12",
            "\1\13\15\uffff\1\12",
            "\1\13\15\uffff\1\12",
            "\1\13\15\uffff\1\12",
            "\1\15\5\uffff\1\14\7\uffff\1\12",
            "",
            "",
            "\1\16",
            "",
            "\1\15\5\uffff\1\14\7\uffff\1\12"
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "556:2: ( ( (lv_ptype_1_0= rulePrimitiveType ) ) | ( (lv_arrtype_2_0= ruleArrayType ) ) | ( (lv_clazztype_3_0= ruleClassOrInterfaceType ) ) )";
        }
    }
    static final String DFA15_eotS =
        "\6\uffff";
    static final String DFA15_eofS =
        "\2\uffff\1\4\2\uffff\1\4";
    static final String DFA15_minS =
        "\1\4\1\uffff\1\7\1\30\1\uffff\1\7";
    static final String DFA15_maxS =
        "\1\41\1\uffff\1\66\1\30\1\uffff\1\66";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\uffff";
    static final String DFA15_specialS =
        "\6\uffff}>";
    static final String[] DFA15_transitionS = {
            "\4\1\20\uffff\1\2\11\1",
            "",
            "\1\1\2\4\1\uffff\2\4\1\uffff\1\3\6\uffff\1\4\35\uffff\4\4",
            "\1\5",
            "",
            "\1\1\2\4\1\uffff\2\4\1\uffff\1\3\6\uffff\1\4\35\uffff\4\4"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1105:1: (lv_target_2_1= ruleRelationalExpression | lv_target_2_2= ruleClassOrInterfaceType )";
        }
    }
    static final String DFA24_eotS =
        "\7\uffff";
    static final String DFA24_eofS =
        "\7\uffff";
    static final String DFA24_minS =
        "\1\23\1\30\1\7\1\uffff\1\30\1\uffff\1\7";
    static final String DFA24_maxS =
        "\1\23\1\102\1\26\1\uffff\1\30\1\uffff\1\26";
    static final String DFA24_acceptS =
        "\3\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String DFA24_specialS =
        "\7\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\1",
            "\1\2\42\uffff\10\3",
            "\1\5\6\uffff\1\4\7\uffff\1\3",
            "",
            "\1\6",
            "",
            "\1\5\6\uffff\1\4\7\uffff\1\3"
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "1388:1: (this_ClassCreator_0= ruleClassCreator | this_ArrayCreator_1= ruleArrayCreator )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleModel131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreator_in_ruleExpression222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_in_ruleExpression251 = new BitSet(new long[]{0x00000003FF0004F0L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleExpression273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodInvocation_in_entryRuleMethodInvocation310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodInvocation320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMethodInvocation366 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleArguments_in_ruleMethodInvocation387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseJRExpr_in_entryRuleBaseJRExpr423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseJRExpr433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FIELDTOKEN_in_ruleBaseJRExpr475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAMETERTOKEN_in_ruleBaseJRExpr503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLETOKEN_in_ruleBaseJRExpr531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArguments_in_entryRuleArguments572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArguments582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleArguments624 = new BitSet(new long[]{0x00000003FF0805F0L});
    public static final BitSet FOLLOW_ruleExpressionList_in_ruleArguments650 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleArguments668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionList_in_entryRuleExpressionList709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionList719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionList765 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleExpressionList783 = new BitSet(new long[]{0x00000003FF0804F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionList809 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ruleBaseCommonExpression_in_entryRuleBaseCommonExpression847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseCommonExpression857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseJRExpr_in_ruleBaseCommonExpression903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleBaseCommonExpression930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleBaseCommonExpression948 = new BitSet(new long[]{0x00000003FF0804F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBaseCommonExpression969 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleBaseCommonExpression979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodInvocation_in_ruleBaseCommonExpression1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_in_entryRuleCast1042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCast1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleCast1094 = new BitSet(new long[]{0xF8000003FF0004F0L,0x0000000000000007L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_ruleCast1121 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleArrayType_in_ruleCast1148 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceType_in_ruleCast1175 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleCast1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression1234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalExpression1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestExpression_in_ruleConditionalExpression1291 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleConditionalExpression1303 = new BitSet(new long[]{0x00000003FF0804F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleConditionalExpression1324 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleConditionalExpression1336 = new BitSet(new long[]{0x00000003FF0804F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleConditionalExpression1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestExpression_in_entryRuleTestExpression1395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestExpression1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleTestExpression1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression1485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression1541 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleOrExpression1554 = new BitSet(new long[]{0x00000003FF0004F0L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression1575 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression1613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryCondExpression_in_ruleAndExpression1669 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleAndExpression1682 = new BitSet(new long[]{0x00000003FF0004F0L});
    public static final BitSet FOLLOW_rulePrimaryCondExpression_in_ruleAndExpression1703 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_rulePrimaryCondExpression_in_entryRulePrimaryCondExpression1741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryCondExpression1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseBooleanExpr_in_rulePrimaryCondExpression1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseBooleanExpr_in_entryRuleBaseBooleanExpr1831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseBooleanExpr1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleBaseBooleanExpr1878 = new BitSet(new long[]{0x00000003FF0004F0L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_ruleBaseBooleanExpr1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression1936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualityExpression1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceOfExpression_in_ruleEqualityExpression1992 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_ruleEqualityExpression2005 = new BitSet(new long[]{0x00000003FF0004F0L});
    public static final BitSet FOLLOW_RULE_NOTEQUAL_in_ruleEqualityExpression2021 = new BitSet(new long[]{0x00000003FF0004F0L});
    public static final BitSet FOLLOW_ruleInstanceOfExpression_in_ruleEqualityExpression2042 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression2080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression2136 = new BitSet(new long[]{0x0000000000078002L});
    public static final BitSet FOLLOW_ruleRelationalOp_in_ruleRelationalExpression2153 = new BitSet(new long[]{0x00000003FF0004F0L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression2173 = new BitSet(new long[]{0x0000000000078002L});
    public static final BitSet FOLLOW_ruleInstanceOfExpression_in_entryRuleInstanceOfExpression2211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceOfExpression2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleInstanceOfExpression2267 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_RULE_INSTANCEOF_in_ruleInstanceOfExpression2279 = new BitSet(new long[]{0x00000003FF0004F0L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleInstanceOfExpression2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceType_in_ruleInstanceOfExpression2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression2361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression2417 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_55_in_ruleAdditiveExpression2431 = new BitSet(new long[]{0x00000003FF0004F0L});
    public static final BitSet FOLLOW_56_in_ruleAdditiveExpression2449 = new BitSet(new long[]{0x00000003FF0004F0L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression2471 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression2509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseCommonExpression_in_ruleMultiplicativeExpression2565 = new BitSet(new long[]{0x0600000000004002L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleMultiplicativeExpression2577 = new BitSet(new long[]{0x00000003FF0004F0L});
    public static final BitSet FOLLOW_ruleMethodInvocation_in_ruleMultiplicativeExpression2597 = new BitSet(new long[]{0x0600000000004002L});
    public static final BitSet FOLLOW_57_in_ruleMultiplicativeExpression2613 = new BitSet(new long[]{0x00000003FF0004F0L});
    public static final BitSet FOLLOW_58_in_ruleMultiplicativeExpression2631 = new BitSet(new long[]{0x00000003FF0004F0L});
    public static final BitSet FOLLOW_ruleBaseCommonExpression_in_ruleMultiplicativeExpression2653 = new BitSet(new long[]{0x0600000000004002L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleMultiplicativeExpression2665 = new BitSet(new long[]{0x00000003FF0004F0L});
    public static final BitSet FOLLOW_ruleMethodInvocation_in_ruleMultiplicativeExpression2685 = new BitSet(new long[]{0x0600000000004002L});
    public static final BitSet FOLLOW_ruleRelationalOp_in_entryRuleRelationalOp2726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalOp2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GT_in_ruleRelationalOp2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GTE_in_ruleRelationalOp2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LT_in_ruleRelationalOp2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LTE_in_ruleRelationalOp2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreator_in_entryRuleCreator2900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreator2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassCreator_in_ruleCreator2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayCreator_in_ruleCreator2984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassCreator_in_entryRuleClassCreator3019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassCreator3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEW_in_ruleClassCreator3065 = new BitSet(new long[]{0x00000003FF0004F0L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceType_in_ruleClassCreator3085 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleArguments_in_ruleClassCreator3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayCreator_in_entryRuleArrayCreator3142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayCreator3152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEW_in_ruleArrayCreator3188 = new BitSet(new long[]{0xF8000003FF0004F0L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleArrayType_in_ruleArrayCreator3208 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleArrayInitializer_in_ruleArrayCreator3229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayInitializer_in_entryRuleArrayInitializer3265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayInitializer3275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleArrayInitializer3320 = new BitSet(new long[]{0x00000003FF2806F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArrayInitializer3341 = new BitSet(new long[]{0x0000000000200200L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleArrayInitializer3353 = new BitSet(new long[]{0x00000003FF0804F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArrayInitializer3373 = new BitSet(new long[]{0x0000000000200200L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleArrayInitializer3389 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleArrayInitializer3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_entryRuleArrayType3438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayType3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceType_in_ruleArrayType3495 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_ruleArrayType3522 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_ruleArrayType3535 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_RULE_RBRACKET_in_ruleArrayType3545 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceType_in_entryRuleClassOrInterfaceType3582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassOrInterfaceType3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleClassOrInterfaceType3637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName3682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleQualifiedName3733 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleQualifiedName3756 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleQualifiedName3778 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral3822 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral3833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTLITERAL_in_ruleLiteral3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LONGLITERAL_in_ruleLiteral3899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOATLITERAL_in_ruleLiteral3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLELITERAL_in_ruleLiteral3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHARLITERAL_in_ruleLiteral3977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRINGLITERAL_in_ruleLiteral4003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TRUE_in_ruleLiteral4029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FALSE_in_ruleLiteral4055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleLiteral4081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType4127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType4138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulePrimitiveType4176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rulePrimitiveType4195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rulePrimitiveType4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rulePrimitiveType4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rulePrimitiveType4252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rulePrimitiveType4271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rulePrimitiveType4290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rulePrimitiveType4309 = new BitSet(new long[]{0x0000000000000002L});

}