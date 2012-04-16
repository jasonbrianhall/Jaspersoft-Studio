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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENTIFIER", "RULE_DOT", "RULE_FIELDTOKEN", "RULE_PARAMETERTOKEN", "RULE_VARIABLETOKEN", "RULE_LPAREN", "RULE_RPAREN", "RULE_COMMA", "RULE_NOT", "RULE_EQUAL", "RULE_NOTEQUAL", "RULE_INSTANCEOF", "RULE_GT", "RULE_GTE", "RULE_LT", "RULE_LTE", "RULE_NEW", "RULE_LBRACE", "RULE_RBRACE", "RULE_LBRACKET", "RULE_RBRACKET", "RULE_INTLITERAL", "RULE_LONGLITERAL", "RULE_FLOATLITERAL", "RULE_DOUBLELITERAL", "RULE_CHARLITERAL", "RULE_STRINGLITERAL", "RULE_TRUE", "RULE_FALSE", "RULE_NULL", "RULE_BRACED_JRIDENTIFIER", "RULE_JRIDENTIFIER", "RULE_INTEGERNUMBER", "RULE_LONGSUFFIX", "RULE_HEXPREFIX", "RULE_HEXDIGIT", "RULE_EXPONENT", "RULE_NONINTEGERNUMBER", "RULE_FLOATSUFFIX", "RULE_DOUBLESUFFIX", "RULE_ESCAPESEQUENCE", "RULE_SEMI", "RULE_LETTER", "RULE_JAVAIDDIGIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'?'", "':'", "'||'", "'&&'", "'+'", "'-'", "'*'", "'/'", "'boolean'", "'char'", "'byte'", "'short'", "'int'", "'long'", "'float'", "'double'"
    };
    public static final int T__66=66;
    public static final int RULE_INTLITERAL=25;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_GTE=17;
    public static final int RULE_INSTANCEOF=15;
    public static final int RULE_HEXDIGIT=39;
    public static final int RULE_LTE=19;
    public static final int RULE_LBRACKET=23;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int RULE_NOT=12;
    public static final int RULE_CHARLITERAL=29;
    public static final int RULE_LT=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int RULE_FALSE=32;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_DOT=5;
    public static final int T__53=53;
    public static final int RULE_FLOATLITERAL=27;
    public static final int T__54=54;
    public static final int RULE_STRINGLITERAL=30;
    public static final int RULE_NONINTEGERNUMBER=41;
    public static final int RULE_JAVAIDDIGIT=47;
    public static final int RULE_LPAREN=9;
    public static final int T__59=59;
    public static final int RULE_GT=16;
    public static final int RULE_FLOATSUFFIX=42;
    public static final int RULE_LBRACE=21;
    public static final int RULE_LONGSUFFIX=37;
    public static final int RULE_RBRACKET=24;
    public static final int RULE_SEMI=45;
    public static final int RULE_ESCAPESEQUENCE=44;
    public static final int RULE_NOTEQUAL=14;
    public static final int RULE_RBRACE=22;
    public static final int RULE_DOUBLELITERAL=28;
    public static final int RULE_HEXPREFIX=38;
    public static final int RULE_IDENTIFIER=4;
    public static final int RULE_VARIABLETOKEN=8;
    public static final int RULE_COMMA=11;
    public static final int RULE_EQUAL=13;
    public static final int RULE_BRACED_JRIDENTIFIER=34;
    public static final int RULE_SL_COMMENT=49;
    public static final int RULE_JRIDENTIFIER=35;
    public static final int RULE_LETTER=46;
    public static final int RULE_NULL=33;
    public static final int RULE_PARAMETERTOKEN=7;
    public static final int RULE_ML_COMMENT=48;
    public static final int RULE_TRUE=31;
    public static final int RULE_DOUBLESUFFIX=43;
    public static final int RULE_LONGLITERAL=26;
    public static final int RULE_NEW=20;
    public static final int RULE_EXPONENT=40;
    public static final int RULE_INTEGERNUMBER=36;
    public static final int RULE_RPAREN=10;
    public static final int RULE_WS=50;
    public static final int RULE_FIELDTOKEN=6;

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
            else if ( (LA2_0==RULE_IDENTIFIER||(LA2_0>=RULE_FIELDTOKEN && LA2_0<=RULE_LPAREN)||LA2_0==RULE_NOT||(LA2_0>=RULE_INTLITERAL && LA2_0<=RULE_NULL)) ) {
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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:164:1: ruleMethodInvocation returns [EObject current=null] : ( ( (lv_fullyQualifiedMethodName_0_0= ruleMethodName ) ) ( (lv_args_1_0= ruleArguments ) ) ) ;
    public final EObject ruleMethodInvocation() throws RecognitionException {
        EObject current = null;

        EObject lv_fullyQualifiedMethodName_0_0 = null;

        EObject lv_args_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:167:28: ( ( ( (lv_fullyQualifiedMethodName_0_0= ruleMethodName ) ) ( (lv_args_1_0= ruleArguments ) ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:168:1: ( ( (lv_fullyQualifiedMethodName_0_0= ruleMethodName ) ) ( (lv_args_1_0= ruleArguments ) ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:168:1: ( ( (lv_fullyQualifiedMethodName_0_0= ruleMethodName ) ) ( (lv_args_1_0= ruleArguments ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:168:2: ( (lv_fullyQualifiedMethodName_0_0= ruleMethodName ) ) ( (lv_args_1_0= ruleArguments ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:168:2: ( (lv_fullyQualifiedMethodName_0_0= ruleMethodName ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:169:1: (lv_fullyQualifiedMethodName_0_0= ruleMethodName )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:169:1: (lv_fullyQualifiedMethodName_0_0= ruleMethodName )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:170:3: lv_fullyQualifiedMethodName_0_0= ruleMethodName
            {
             
            	        newCompositeNode(grammarAccess.getMethodInvocationAccess().getFullyQualifiedMethodNameMethodNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMethodName_in_ruleMethodInvocation366);
            lv_fullyQualifiedMethodName_0_0=ruleMethodName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMethodInvocationRule());
            	        }
                   		set(
                   			current, 
                   			"fullyQualifiedMethodName",
                    		lv_fullyQualifiedMethodName_0_0, 
                    		"MethodName");
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


    // $ANTLR start "entryRuleMethodName"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:212:1: entryRuleMethodName returns [EObject current=null] : iv_ruleMethodName= ruleMethodName EOF ;
    public final EObject entryRuleMethodName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodName = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:213:2: (iv_ruleMethodName= ruleMethodName EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:214:2: iv_ruleMethodName= ruleMethodName EOF
            {
             newCompositeNode(grammarAccess.getMethodNameRule()); 
            pushFollow(FOLLOW_ruleMethodName_in_entryRuleMethodName423);
            iv_ruleMethodName=ruleMethodName();

            state._fsp--;

             current =iv_ruleMethodName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethodName433); 

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
    // $ANTLR end "entryRuleMethodName"


    // $ANTLR start "ruleMethodName"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:221:1: ruleMethodName returns [EObject current=null] : ( ( ( (lv_prefixQMN_0_0= RULE_IDENTIFIER ) ) ( (lv_dots_1_0= RULE_DOT ) ) )* ( (lv_methodName_2_0= RULE_IDENTIFIER ) ) ) ;
    public final EObject ruleMethodName() throws RecognitionException {
        EObject current = null;

        Token lv_prefixQMN_0_0=null;
        Token lv_dots_1_0=null;
        Token lv_methodName_2_0=null;

         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:224:28: ( ( ( ( (lv_prefixQMN_0_0= RULE_IDENTIFIER ) ) ( (lv_dots_1_0= RULE_DOT ) ) )* ( (lv_methodName_2_0= RULE_IDENTIFIER ) ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:225:1: ( ( ( (lv_prefixQMN_0_0= RULE_IDENTIFIER ) ) ( (lv_dots_1_0= RULE_DOT ) ) )* ( (lv_methodName_2_0= RULE_IDENTIFIER ) ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:225:1: ( ( ( (lv_prefixQMN_0_0= RULE_IDENTIFIER ) ) ( (lv_dots_1_0= RULE_DOT ) ) )* ( (lv_methodName_2_0= RULE_IDENTIFIER ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:225:2: ( ( (lv_prefixQMN_0_0= RULE_IDENTIFIER ) ) ( (lv_dots_1_0= RULE_DOT ) ) )* ( (lv_methodName_2_0= RULE_IDENTIFIER ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:225:2: ( ( (lv_prefixQMN_0_0= RULE_IDENTIFIER ) ) ( (lv_dots_1_0= RULE_DOT ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_IDENTIFIER) ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1==RULE_DOT) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:225:3: ( (lv_prefixQMN_0_0= RULE_IDENTIFIER ) ) ( (lv_dots_1_0= RULE_DOT ) )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:225:3: ( (lv_prefixQMN_0_0= RULE_IDENTIFIER ) )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:226:1: (lv_prefixQMN_0_0= RULE_IDENTIFIER )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:226:1: (lv_prefixQMN_0_0= RULE_IDENTIFIER )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:227:3: lv_prefixQMN_0_0= RULE_IDENTIFIER
            	    {
            	    lv_prefixQMN_0_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleMethodName476); 

            	    			newLeafNode(lv_prefixQMN_0_0, grammarAccess.getMethodNameAccess().getPrefixQMNIDENTIFIERTerminalRuleCall_0_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMethodNameRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"prefixQMN",
            	            		lv_prefixQMN_0_0, 
            	            		"IDENTIFIER");
            	    	    

            	    }


            	    }

            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:243:2: ( (lv_dots_1_0= RULE_DOT ) )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:244:1: (lv_dots_1_0= RULE_DOT )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:244:1: (lv_dots_1_0= RULE_DOT )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:245:3: lv_dots_1_0= RULE_DOT
            	    {
            	    lv_dots_1_0=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleMethodName498); 

            	    			newLeafNode(lv_dots_1_0, grammarAccess.getMethodNameAccess().getDotsDOTTerminalRuleCall_0_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMethodNameRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"dots",
            	            		lv_dots_1_0, 
            	            		"DOT");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:261:4: ( (lv_methodName_2_0= RULE_IDENTIFIER ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:262:1: (lv_methodName_2_0= RULE_IDENTIFIER )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:262:1: (lv_methodName_2_0= RULE_IDENTIFIER )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:263:3: lv_methodName_2_0= RULE_IDENTIFIER
            {
            lv_methodName_2_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleMethodName522); 

            			newLeafNode(lv_methodName_2_0, grammarAccess.getMethodNameAccess().getMethodNameIDENTIFIERTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMethodNameRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"methodName",
                    		lv_methodName_2_0, 
                    		"IDENTIFIER");
            	    

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
    // $ANTLR end "ruleMethodName"


    // $ANTLR start "entryRuleBaseJRExpr"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:287:1: entryRuleBaseJRExpr returns [EObject current=null] : iv_ruleBaseJRExpr= ruleBaseJRExpr EOF ;
    public final EObject entryRuleBaseJRExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseJRExpr = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:288:2: (iv_ruleBaseJRExpr= ruleBaseJRExpr EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:289:2: iv_ruleBaseJRExpr= ruleBaseJRExpr EOF
            {
             newCompositeNode(grammarAccess.getBaseJRExprRule()); 
            pushFollow(FOLLOW_ruleBaseJRExpr_in_entryRuleBaseJRExpr563);
            iv_ruleBaseJRExpr=ruleBaseJRExpr();

            state._fsp--;

             current =iv_ruleBaseJRExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseJRExpr573); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:296:1: ruleBaseJRExpr returns [EObject current=null] : ( ( (lv_fieldToken_0_0= RULE_FIELDTOKEN ) ) | ( (lv_parameterToken_1_0= RULE_PARAMETERTOKEN ) ) | ( (lv_variableToken_2_0= RULE_VARIABLETOKEN ) ) ) ;
    public final EObject ruleBaseJRExpr() throws RecognitionException {
        EObject current = null;

        Token lv_fieldToken_0_0=null;
        Token lv_parameterToken_1_0=null;
        Token lv_variableToken_2_0=null;

         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:299:28: ( ( ( (lv_fieldToken_0_0= RULE_FIELDTOKEN ) ) | ( (lv_parameterToken_1_0= RULE_PARAMETERTOKEN ) ) | ( (lv_variableToken_2_0= RULE_VARIABLETOKEN ) ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:300:1: ( ( (lv_fieldToken_0_0= RULE_FIELDTOKEN ) ) | ( (lv_parameterToken_1_0= RULE_PARAMETERTOKEN ) ) | ( (lv_variableToken_2_0= RULE_VARIABLETOKEN ) ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:300:1: ( ( (lv_fieldToken_0_0= RULE_FIELDTOKEN ) ) | ( (lv_parameterToken_1_0= RULE_PARAMETERTOKEN ) ) | ( (lv_variableToken_2_0= RULE_VARIABLETOKEN ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_FIELDTOKEN:
                {
                alt4=1;
                }
                break;
            case RULE_PARAMETERTOKEN:
                {
                alt4=2;
                }
                break;
            case RULE_VARIABLETOKEN:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:300:2: ( (lv_fieldToken_0_0= RULE_FIELDTOKEN ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:300:2: ( (lv_fieldToken_0_0= RULE_FIELDTOKEN ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:301:1: (lv_fieldToken_0_0= RULE_FIELDTOKEN )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:301:1: (lv_fieldToken_0_0= RULE_FIELDTOKEN )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:302:3: lv_fieldToken_0_0= RULE_FIELDTOKEN
                    {
                    lv_fieldToken_0_0=(Token)match(input,RULE_FIELDTOKEN,FOLLOW_RULE_FIELDTOKEN_in_ruleBaseJRExpr615); 

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
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:319:6: ( (lv_parameterToken_1_0= RULE_PARAMETERTOKEN ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:319:6: ( (lv_parameterToken_1_0= RULE_PARAMETERTOKEN ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:320:1: (lv_parameterToken_1_0= RULE_PARAMETERTOKEN )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:320:1: (lv_parameterToken_1_0= RULE_PARAMETERTOKEN )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:321:3: lv_parameterToken_1_0= RULE_PARAMETERTOKEN
                    {
                    lv_parameterToken_1_0=(Token)match(input,RULE_PARAMETERTOKEN,FOLLOW_RULE_PARAMETERTOKEN_in_ruleBaseJRExpr643); 

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
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:338:6: ( (lv_variableToken_2_0= RULE_VARIABLETOKEN ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:338:6: ( (lv_variableToken_2_0= RULE_VARIABLETOKEN ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:339:1: (lv_variableToken_2_0= RULE_VARIABLETOKEN )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:339:1: (lv_variableToken_2_0= RULE_VARIABLETOKEN )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:340:3: lv_variableToken_2_0= RULE_VARIABLETOKEN
                    {
                    lv_variableToken_2_0=(Token)match(input,RULE_VARIABLETOKEN,FOLLOW_RULE_VARIABLETOKEN_in_ruleBaseJRExpr671); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:364:1: entryRuleArguments returns [EObject current=null] : iv_ruleArguments= ruleArguments EOF ;
    public final EObject entryRuleArguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArguments = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:365:2: (iv_ruleArguments= ruleArguments EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:366:2: iv_ruleArguments= ruleArguments EOF
            {
             newCompositeNode(grammarAccess.getArgumentsRule()); 
            pushFollow(FOLLOW_ruleArguments_in_entryRuleArguments712);
            iv_ruleArguments=ruleArguments();

            state._fsp--;

             current =iv_ruleArguments; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArguments722); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:373:1: ruleArguments returns [EObject current=null] : ( ( (lv_leftP_0_0= RULE_LPAREN ) ) ( (lv_exprLst_1_0= ruleExpressionList ) )? ( (lv_rightP_2_0= RULE_RPAREN ) ) ) ;
    public final EObject ruleArguments() throws RecognitionException {
        EObject current = null;

        Token lv_leftP_0_0=null;
        Token lv_rightP_2_0=null;
        EObject lv_exprLst_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:376:28: ( ( ( (lv_leftP_0_0= RULE_LPAREN ) ) ( (lv_exprLst_1_0= ruleExpressionList ) )? ( (lv_rightP_2_0= RULE_RPAREN ) ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:377:1: ( ( (lv_leftP_0_0= RULE_LPAREN ) ) ( (lv_exprLst_1_0= ruleExpressionList ) )? ( (lv_rightP_2_0= RULE_RPAREN ) ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:377:1: ( ( (lv_leftP_0_0= RULE_LPAREN ) ) ( (lv_exprLst_1_0= ruleExpressionList ) )? ( (lv_rightP_2_0= RULE_RPAREN ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:377:2: ( (lv_leftP_0_0= RULE_LPAREN ) ) ( (lv_exprLst_1_0= ruleExpressionList ) )? ( (lv_rightP_2_0= RULE_RPAREN ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:377:2: ( (lv_leftP_0_0= RULE_LPAREN ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:378:1: (lv_leftP_0_0= RULE_LPAREN )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:378:1: (lv_leftP_0_0= RULE_LPAREN )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:379:3: lv_leftP_0_0= RULE_LPAREN
            {
            lv_leftP_0_0=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleArguments764); 

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

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:395:2: ( (lv_exprLst_1_0= ruleExpressionList ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_IDENTIFIER||(LA5_0>=RULE_FIELDTOKEN && LA5_0<=RULE_LPAREN)||LA5_0==RULE_NOT||LA5_0==RULE_NEW||(LA5_0>=RULE_INTLITERAL && LA5_0<=RULE_NULL)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:396:1: (lv_exprLst_1_0= ruleExpressionList )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:396:1: (lv_exprLst_1_0= ruleExpressionList )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:397:3: lv_exprLst_1_0= ruleExpressionList
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentsAccess().getExprLstExpressionListParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpressionList_in_ruleArguments790);
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

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:413:3: ( (lv_rightP_2_0= RULE_RPAREN ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:414:1: (lv_rightP_2_0= RULE_RPAREN )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:414:1: (lv_rightP_2_0= RULE_RPAREN )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:415:3: lv_rightP_2_0= RULE_RPAREN
            {
            lv_rightP_2_0=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleArguments808); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:439:1: entryRuleExpressionList returns [EObject current=null] : iv_ruleExpressionList= ruleExpressionList EOF ;
    public final EObject entryRuleExpressionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionList = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:440:2: (iv_ruleExpressionList= ruleExpressionList EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:441:2: iv_ruleExpressionList= ruleExpressionList EOF
            {
             newCompositeNode(grammarAccess.getExpressionListRule()); 
            pushFollow(FOLLOW_ruleExpressionList_in_entryRuleExpressionList849);
            iv_ruleExpressionList=ruleExpressionList();

            state._fsp--;

             current =iv_ruleExpressionList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionList859); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:448:1: ruleExpressionList returns [EObject current=null] : ( ( (lv_expressions_0_0= ruleExpression ) ) ( ( (lv_commas_1_0= RULE_COMMA ) ) ( (lv_expressions_2_0= ruleExpression ) ) )* ) ;
    public final EObject ruleExpressionList() throws RecognitionException {
        EObject current = null;

        Token lv_commas_1_0=null;
        EObject lv_expressions_0_0 = null;

        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:451:28: ( ( ( (lv_expressions_0_0= ruleExpression ) ) ( ( (lv_commas_1_0= RULE_COMMA ) ) ( (lv_expressions_2_0= ruleExpression ) ) )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:452:1: ( ( (lv_expressions_0_0= ruleExpression ) ) ( ( (lv_commas_1_0= RULE_COMMA ) ) ( (lv_expressions_2_0= ruleExpression ) ) )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:452:1: ( ( (lv_expressions_0_0= ruleExpression ) ) ( ( (lv_commas_1_0= RULE_COMMA ) ) ( (lv_expressions_2_0= ruleExpression ) ) )* )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:452:2: ( (lv_expressions_0_0= ruleExpression ) ) ( ( (lv_commas_1_0= RULE_COMMA ) ) ( (lv_expressions_2_0= ruleExpression ) ) )*
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:452:2: ( (lv_expressions_0_0= ruleExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:453:1: (lv_expressions_0_0= ruleExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:453:1: (lv_expressions_0_0= ruleExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:454:3: lv_expressions_0_0= ruleExpression
            {
             
            	        newCompositeNode(grammarAccess.getExpressionListAccess().getExpressionsExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExpression_in_ruleExpressionList905);
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

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:470:2: ( ( (lv_commas_1_0= RULE_COMMA ) ) ( (lv_expressions_2_0= ruleExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:470:3: ( (lv_commas_1_0= RULE_COMMA ) ) ( (lv_expressions_2_0= ruleExpression ) )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:470:3: ( (lv_commas_1_0= RULE_COMMA ) )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:471:1: (lv_commas_1_0= RULE_COMMA )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:471:1: (lv_commas_1_0= RULE_COMMA )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:472:3: lv_commas_1_0= RULE_COMMA
            	    {
            	    lv_commas_1_0=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleExpressionList923); 

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

            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:488:2: ( (lv_expressions_2_0= ruleExpression ) )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:489:1: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:489:1: (lv_expressions_2_0= ruleExpression )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:490:3: lv_expressions_2_0= ruleExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExpressionListAccess().getExpressionsExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpression_in_ruleExpressionList949);
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
            	    break loop6;
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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:514:1: entryRuleBaseCommonExpression returns [EObject current=null] : iv_ruleBaseCommonExpression= ruleBaseCommonExpression EOF ;
    public final EObject entryRuleBaseCommonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseCommonExpression = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:515:2: (iv_ruleBaseCommonExpression= ruleBaseCommonExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:516:2: iv_ruleBaseCommonExpression= ruleBaseCommonExpression EOF
            {
             newCompositeNode(grammarAccess.getBaseCommonExpressionRule()); 
            pushFollow(FOLLOW_ruleBaseCommonExpression_in_entryRuleBaseCommonExpression987);
            iv_ruleBaseCommonExpression=ruleBaseCommonExpression();

            state._fsp--;

             current =iv_ruleBaseCommonExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseCommonExpression997); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:523:1: ruleBaseCommonExpression returns [EObject current=null] : ( ( (lv_basejrexpr_0_0= ruleBaseJRExpr ) ) | ( (lv_literal_1_0= ruleLiteral ) ) | (this_LPAREN_2= RULE_LPAREN this_Expression_3= ruleExpression this_RPAREN_4= RULE_RPAREN ) | this_MethodInvocation_5= ruleMethodInvocation ) ;
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
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:526:28: ( ( ( (lv_basejrexpr_0_0= ruleBaseJRExpr ) ) | ( (lv_literal_1_0= ruleLiteral ) ) | (this_LPAREN_2= RULE_LPAREN this_Expression_3= ruleExpression this_RPAREN_4= RULE_RPAREN ) | this_MethodInvocation_5= ruleMethodInvocation ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:527:1: ( ( (lv_basejrexpr_0_0= ruleBaseJRExpr ) ) | ( (lv_literal_1_0= ruleLiteral ) ) | (this_LPAREN_2= RULE_LPAREN this_Expression_3= ruleExpression this_RPAREN_4= RULE_RPAREN ) | this_MethodInvocation_5= ruleMethodInvocation )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:527:1: ( ( (lv_basejrexpr_0_0= ruleBaseJRExpr ) ) | ( (lv_literal_1_0= ruleLiteral ) ) | (this_LPAREN_2= RULE_LPAREN this_Expression_3= ruleExpression this_RPAREN_4= RULE_RPAREN ) | this_MethodInvocation_5= ruleMethodInvocation )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_FIELDTOKEN:
            case RULE_PARAMETERTOKEN:
            case RULE_VARIABLETOKEN:
                {
                alt7=1;
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
                alt7=2;
                }
                break;
            case RULE_LPAREN:
                {
                alt7=3;
                }
                break;
            case RULE_IDENTIFIER:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:527:2: ( (lv_basejrexpr_0_0= ruleBaseJRExpr ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:527:2: ( (lv_basejrexpr_0_0= ruleBaseJRExpr ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:528:1: (lv_basejrexpr_0_0= ruleBaseJRExpr )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:528:1: (lv_basejrexpr_0_0= ruleBaseJRExpr )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:529:3: lv_basejrexpr_0_0= ruleBaseJRExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getBaseCommonExpressionAccess().getBasejrexprBaseJRExprParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBaseJRExpr_in_ruleBaseCommonExpression1043);
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
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:546:6: ( (lv_literal_1_0= ruleLiteral ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:546:6: ( (lv_literal_1_0= ruleLiteral ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:547:1: (lv_literal_1_0= ruleLiteral )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:547:1: (lv_literal_1_0= ruleLiteral )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:548:3: lv_literal_1_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getBaseCommonExpressionAccess().getLiteralLiteralParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleBaseCommonExpression1070);
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
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:565:6: (this_LPAREN_2= RULE_LPAREN this_Expression_3= ruleExpression this_RPAREN_4= RULE_RPAREN )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:565:6: (this_LPAREN_2= RULE_LPAREN this_Expression_3= ruleExpression this_RPAREN_4= RULE_RPAREN )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:565:7: this_LPAREN_2= RULE_LPAREN this_Expression_3= ruleExpression this_RPAREN_4= RULE_RPAREN
                    {
                    this_LPAREN_2=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleBaseCommonExpression1088); 
                     
                        newLeafNode(this_LPAREN_2, grammarAccess.getBaseCommonExpressionAccess().getLPARENTerminalRuleCall_2_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getBaseCommonExpressionAccess().getExpressionParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_ruleBaseCommonExpression1109);
                    this_Expression_3=ruleExpression();

                    state._fsp--;

                     
                            current = this_Expression_3; 
                            afterParserOrEnumRuleCall();
                        
                    this_RPAREN_4=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleBaseCommonExpression1119); 
                     
                        newLeafNode(this_RPAREN_4, grammarAccess.getBaseCommonExpressionAccess().getRPARENTerminalRuleCall_2_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:584:5: this_MethodInvocation_5= ruleMethodInvocation
                    {
                     
                            newCompositeNode(grammarAccess.getBaseCommonExpressionAccess().getMethodInvocationParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleMethodInvocation_in_ruleBaseCommonExpression1147);
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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:600:1: entryRuleCast returns [EObject current=null] : iv_ruleCast= ruleCast EOF ;
    public final EObject entryRuleCast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCast = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:601:2: (iv_ruleCast= ruleCast EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:602:2: iv_ruleCast= ruleCast EOF
            {
             newCompositeNode(grammarAccess.getCastRule()); 
            pushFollow(FOLLOW_ruleCast_in_entryRuleCast1182);
            iv_ruleCast=ruleCast();

            state._fsp--;

             current =iv_ruleCast; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCast1192); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:609:1: ruleCast returns [EObject current=null] : ( ( (lv_lpar_0_0= RULE_LPAREN ) ) ( ( (lv_ptype_1_0= rulePrimitiveType ) ) | ( (lv_arrtype_2_0= ruleArrayType ) ) | ( (lv_clazztype_3_0= ruleClassOrInterfaceType ) ) ) ( (lv_rpar_4_0= RULE_RPAREN ) ) ) ;
    public final EObject ruleCast() throws RecognitionException {
        EObject current = null;

        Token lv_lpar_0_0=null;
        Token lv_rpar_4_0=null;
        AntlrDatatypeRuleToken lv_ptype_1_0 = null;

        EObject lv_arrtype_2_0 = null;

        EObject lv_clazztype_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:612:28: ( ( ( (lv_lpar_0_0= RULE_LPAREN ) ) ( ( (lv_ptype_1_0= rulePrimitiveType ) ) | ( (lv_arrtype_2_0= ruleArrayType ) ) | ( (lv_clazztype_3_0= ruleClassOrInterfaceType ) ) ) ( (lv_rpar_4_0= RULE_RPAREN ) ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:613:1: ( ( (lv_lpar_0_0= RULE_LPAREN ) ) ( ( (lv_ptype_1_0= rulePrimitiveType ) ) | ( (lv_arrtype_2_0= ruleArrayType ) ) | ( (lv_clazztype_3_0= ruleClassOrInterfaceType ) ) ) ( (lv_rpar_4_0= RULE_RPAREN ) ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:613:1: ( ( (lv_lpar_0_0= RULE_LPAREN ) ) ( ( (lv_ptype_1_0= rulePrimitiveType ) ) | ( (lv_arrtype_2_0= ruleArrayType ) ) | ( (lv_clazztype_3_0= ruleClassOrInterfaceType ) ) ) ( (lv_rpar_4_0= RULE_RPAREN ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:613:2: ( (lv_lpar_0_0= RULE_LPAREN ) ) ( ( (lv_ptype_1_0= rulePrimitiveType ) ) | ( (lv_arrtype_2_0= ruleArrayType ) ) | ( (lv_clazztype_3_0= ruleClassOrInterfaceType ) ) ) ( (lv_rpar_4_0= RULE_RPAREN ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:613:2: ( (lv_lpar_0_0= RULE_LPAREN ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:614:1: (lv_lpar_0_0= RULE_LPAREN )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:614:1: (lv_lpar_0_0= RULE_LPAREN )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:615:3: lv_lpar_0_0= RULE_LPAREN
            {
            lv_lpar_0_0=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleCast1234); 

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

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:631:2: ( ( (lv_ptype_1_0= rulePrimitiveType ) ) | ( (lv_arrtype_2_0= ruleArrayType ) ) | ( (lv_clazztype_3_0= ruleClassOrInterfaceType ) ) )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:631:3: ( (lv_ptype_1_0= rulePrimitiveType ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:631:3: ( (lv_ptype_1_0= rulePrimitiveType ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:632:1: (lv_ptype_1_0= rulePrimitiveType )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:632:1: (lv_ptype_1_0= rulePrimitiveType )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:633:3: lv_ptype_1_0= rulePrimitiveType
                    {
                     
                    	        newCompositeNode(grammarAccess.getCastAccess().getPtypePrimitiveTypeParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimitiveType_in_ruleCast1261);
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
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:650:6: ( (lv_arrtype_2_0= ruleArrayType ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:650:6: ( (lv_arrtype_2_0= ruleArrayType ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:651:1: (lv_arrtype_2_0= ruleArrayType )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:651:1: (lv_arrtype_2_0= ruleArrayType )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:652:3: lv_arrtype_2_0= ruleArrayType
                    {
                     
                    	        newCompositeNode(grammarAccess.getCastAccess().getArrtypeArrayTypeParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArrayType_in_ruleCast1288);
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
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:669:6: ( (lv_clazztype_3_0= ruleClassOrInterfaceType ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:669:6: ( (lv_clazztype_3_0= ruleClassOrInterfaceType ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:670:1: (lv_clazztype_3_0= ruleClassOrInterfaceType )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:670:1: (lv_clazztype_3_0= ruleClassOrInterfaceType )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:671:3: lv_clazztype_3_0= ruleClassOrInterfaceType
                    {
                     
                    	        newCompositeNode(grammarAccess.getCastAccess().getClazztypeClassOrInterfaceTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClassOrInterfaceType_in_ruleCast1315);
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

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:687:3: ( (lv_rpar_4_0= RULE_RPAREN ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:688:1: (lv_rpar_4_0= RULE_RPAREN )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:688:1: (lv_rpar_4_0= RULE_RPAREN )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:689:3: lv_rpar_4_0= RULE_RPAREN
            {
            lv_rpar_4_0=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleCast1333); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:713:1: entryRuleConditionalExpression returns [EObject current=null] : iv_ruleConditionalExpression= ruleConditionalExpression EOF ;
    public final EObject entryRuleConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpression = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:714:2: (iv_ruleConditionalExpression= ruleConditionalExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:715:2: iv_ruleConditionalExpression= ruleConditionalExpression EOF
            {
             newCompositeNode(grammarAccess.getConditionalExpressionRule()); 
            pushFollow(FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression1374);
            iv_ruleConditionalExpression=ruleConditionalExpression();

            state._fsp--;

             current =iv_ruleConditionalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConditionalExpression1384); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:722:1: ruleConditionalExpression returns [EObject current=null] : (this_TestExpression_0= ruleTestExpression (otherlv_1= '?' ( (lv_okReturnedExpr_2_0= ruleExpression ) ) otherlv_3= ':' ( (lv_koReturnedExpr_4_0= ruleExpression ) ) )? ) ;
    public final EObject ruleConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_TestExpression_0 = null;

        EObject lv_okReturnedExpr_2_0 = null;

        EObject lv_koReturnedExpr_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:725:28: ( (this_TestExpression_0= ruleTestExpression (otherlv_1= '?' ( (lv_okReturnedExpr_2_0= ruleExpression ) ) otherlv_3= ':' ( (lv_koReturnedExpr_4_0= ruleExpression ) ) )? ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:726:1: (this_TestExpression_0= ruleTestExpression (otherlv_1= '?' ( (lv_okReturnedExpr_2_0= ruleExpression ) ) otherlv_3= ':' ( (lv_koReturnedExpr_4_0= ruleExpression ) ) )? )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:726:1: (this_TestExpression_0= ruleTestExpression (otherlv_1= '?' ( (lv_okReturnedExpr_2_0= ruleExpression ) ) otherlv_3= ':' ( (lv_koReturnedExpr_4_0= ruleExpression ) ) )? )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:727:5: this_TestExpression_0= ruleTestExpression (otherlv_1= '?' ( (lv_okReturnedExpr_2_0= ruleExpression ) ) otherlv_3= ':' ( (lv_koReturnedExpr_4_0= ruleExpression ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getConditionalExpressionAccess().getTestExpressionParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTestExpression_in_ruleConditionalExpression1431);
            this_TestExpression_0=ruleTestExpression();

            state._fsp--;

             
                    current = this_TestExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:735:1: (otherlv_1= '?' ( (lv_okReturnedExpr_2_0= ruleExpression ) ) otherlv_3= ':' ( (lv_koReturnedExpr_4_0= ruleExpression ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==51) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:735:3: otherlv_1= '?' ( (lv_okReturnedExpr_2_0= ruleExpression ) ) otherlv_3= ':' ( (lv_koReturnedExpr_4_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleConditionalExpression1443); 

                        	newLeafNode(otherlv_1, grammarAccess.getConditionalExpressionAccess().getQuestionMarkKeyword_1_0());
                        
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:739:1: ( (lv_okReturnedExpr_2_0= ruleExpression ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:740:1: (lv_okReturnedExpr_2_0= ruleExpression )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:740:1: (lv_okReturnedExpr_2_0= ruleExpression )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:741:3: lv_okReturnedExpr_2_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getOkReturnedExprExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleConditionalExpression1464);
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

                    otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleConditionalExpression1476); 

                        	newLeafNode(otherlv_3, grammarAccess.getConditionalExpressionAccess().getColonKeyword_1_2());
                        
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:761:1: ( (lv_koReturnedExpr_4_0= ruleExpression ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:762:1: (lv_koReturnedExpr_4_0= ruleExpression )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:762:1: (lv_koReturnedExpr_4_0= ruleExpression )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:763:3: lv_koReturnedExpr_4_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getConditionalExpressionAccess().getKoReturnedExprExpressionParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleConditionalExpression1497);
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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:787:1: entryRuleTestExpression returns [EObject current=null] : iv_ruleTestExpression= ruleTestExpression EOF ;
    public final EObject entryRuleTestExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestExpression = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:788:2: (iv_ruleTestExpression= ruleTestExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:789:2: iv_ruleTestExpression= ruleTestExpression EOF
            {
             newCompositeNode(grammarAccess.getTestExpressionRule()); 
            pushFollow(FOLLOW_ruleTestExpression_in_entryRuleTestExpression1535);
            iv_ruleTestExpression=ruleTestExpression();

            state._fsp--;

             current =iv_ruleTestExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTestExpression1545); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:796:1: ruleTestExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleTestExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:799:28: (this_OrExpression_0= ruleOrExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:801:5: this_OrExpression_0= ruleOrExpression
            {
             
                    newCompositeNode(grammarAccess.getTestExpressionAccess().getOrExpressionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleOrExpression_in_ruleTestExpression1591);
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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:817:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:818:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:819:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression1625);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression1635); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:826:1: ruleOrExpression returns [EObject current=null] : ( ( (lv_andExp_0_0= ruleAndExpression ) ) (otherlv_1= '||' ( (lv_andExp_2_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_andExp_0_0 = null;

        EObject lv_andExp_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:829:28: ( ( ( (lv_andExp_0_0= ruleAndExpression ) ) (otherlv_1= '||' ( (lv_andExp_2_0= ruleAndExpression ) ) )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:830:1: ( ( (lv_andExp_0_0= ruleAndExpression ) ) (otherlv_1= '||' ( (lv_andExp_2_0= ruleAndExpression ) ) )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:830:1: ( ( (lv_andExp_0_0= ruleAndExpression ) ) (otherlv_1= '||' ( (lv_andExp_2_0= ruleAndExpression ) ) )* )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:830:2: ( (lv_andExp_0_0= ruleAndExpression ) ) (otherlv_1= '||' ( (lv_andExp_2_0= ruleAndExpression ) ) )*
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:830:2: ( (lv_andExp_0_0= ruleAndExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:831:1: (lv_andExp_0_0= ruleAndExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:831:1: (lv_andExp_0_0= ruleAndExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:832:3: lv_andExp_0_0= ruleAndExpression
            {
             
            	        newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpAndExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression1681);
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

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:848:2: (otherlv_1= '||' ( (lv_andExp_2_0= ruleAndExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==53) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:848:4: otherlv_1= '||' ( (lv_andExp_2_0= ruleAndExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleOrExpression1694); 

            	        	newLeafNode(otherlv_1, grammarAccess.getOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_0());
            	        
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:852:1: ( (lv_andExp_2_0= ruleAndExpression ) )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:853:1: (lv_andExp_2_0= ruleAndExpression )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:853:1: (lv_andExp_2_0= ruleAndExpression )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:854:3: lv_andExp_2_0= ruleAndExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpAndExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression1715);
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:878:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:879:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:880:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression1753);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression1763); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:887:1: ruleAndExpression returns [EObject current=null] : ( ( (lv_primaryCond_0_0= rulePrimaryCondExpression ) ) (otherlv_1= '&&' ( (lv_primaryCond_2_0= rulePrimaryCondExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_primaryCond_0_0 = null;

        EObject lv_primaryCond_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:890:28: ( ( ( (lv_primaryCond_0_0= rulePrimaryCondExpression ) ) (otherlv_1= '&&' ( (lv_primaryCond_2_0= rulePrimaryCondExpression ) ) )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:891:1: ( ( (lv_primaryCond_0_0= rulePrimaryCondExpression ) ) (otherlv_1= '&&' ( (lv_primaryCond_2_0= rulePrimaryCondExpression ) ) )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:891:1: ( ( (lv_primaryCond_0_0= rulePrimaryCondExpression ) ) (otherlv_1= '&&' ( (lv_primaryCond_2_0= rulePrimaryCondExpression ) ) )* )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:891:2: ( (lv_primaryCond_0_0= rulePrimaryCondExpression ) ) (otherlv_1= '&&' ( (lv_primaryCond_2_0= rulePrimaryCondExpression ) ) )*
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:891:2: ( (lv_primaryCond_0_0= rulePrimaryCondExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:892:1: (lv_primaryCond_0_0= rulePrimaryCondExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:892:1: (lv_primaryCond_0_0= rulePrimaryCondExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:893:3: lv_primaryCond_0_0= rulePrimaryCondExpression
            {
             
            	        newCompositeNode(grammarAccess.getAndExpressionAccess().getPrimaryCondPrimaryCondExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePrimaryCondExpression_in_ruleAndExpression1809);
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

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:909:2: (otherlv_1= '&&' ( (lv_primaryCond_2_0= rulePrimaryCondExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==54) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:909:4: otherlv_1= '&&' ( (lv_primaryCond_2_0= rulePrimaryCondExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleAndExpression1822); 

            	        	newLeafNode(otherlv_1, grammarAccess.getAndExpressionAccess().getAmpersandAmpersandKeyword_1_0());
            	        
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:913:1: ( (lv_primaryCond_2_0= rulePrimaryCondExpression ) )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:914:1: (lv_primaryCond_2_0= rulePrimaryCondExpression )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:914:1: (lv_primaryCond_2_0= rulePrimaryCondExpression )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:915:3: lv_primaryCond_2_0= rulePrimaryCondExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndExpressionAccess().getPrimaryCondPrimaryCondExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimaryCondExpression_in_ruleAndExpression1843);
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
            	    break loop11;
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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:939:1: entryRulePrimaryCondExpression returns [EObject current=null] : iv_rulePrimaryCondExpression= rulePrimaryCondExpression EOF ;
    public final EObject entryRulePrimaryCondExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryCondExpression = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:940:2: (iv_rulePrimaryCondExpression= rulePrimaryCondExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:941:2: iv_rulePrimaryCondExpression= rulePrimaryCondExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryCondExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryCondExpression_in_entryRulePrimaryCondExpression1881);
            iv_rulePrimaryCondExpression=rulePrimaryCondExpression();

            state._fsp--;

             current =iv_rulePrimaryCondExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryCondExpression1891); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:948:1: rulePrimaryCondExpression returns [EObject current=null] : ( (lv_expr_0_0= ruleBaseBooleanExpr ) ) ;
    public final EObject rulePrimaryCondExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:951:28: ( ( (lv_expr_0_0= ruleBaseBooleanExpr ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:952:1: ( (lv_expr_0_0= ruleBaseBooleanExpr ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:952:1: ( (lv_expr_0_0= ruleBaseBooleanExpr ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:953:1: (lv_expr_0_0= ruleBaseBooleanExpr )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:953:1: (lv_expr_0_0= ruleBaseBooleanExpr )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:954:3: lv_expr_0_0= ruleBaseBooleanExpr
            {
             
            	        newCompositeNode(grammarAccess.getPrimaryCondExpressionAccess().getExprBaseBooleanExprParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleBaseBooleanExpr_in_rulePrimaryCondExpression1936);
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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:978:1: entryRuleBaseBooleanExpr returns [EObject current=null] : iv_ruleBaseBooleanExpr= ruleBaseBooleanExpr EOF ;
    public final EObject entryRuleBaseBooleanExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseBooleanExpr = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:979:2: (iv_ruleBaseBooleanExpr= ruleBaseBooleanExpr EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:980:2: iv_ruleBaseBooleanExpr= ruleBaseBooleanExpr EOF
            {
             newCompositeNode(grammarAccess.getBaseBooleanExprRule()); 
            pushFollow(FOLLOW_ruleBaseBooleanExpr_in_entryRuleBaseBooleanExpr1971);
            iv_ruleBaseBooleanExpr=ruleBaseBooleanExpr();

            state._fsp--;

             current =iv_ruleBaseBooleanExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseBooleanExpr1981); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:987:1: ruleBaseBooleanExpr returns [EObject current=null] : ( (this_NOT_0= RULE_NOT )? this_EqualityExpression_1= ruleEqualityExpression ) ;
    public final EObject ruleBaseBooleanExpr() throws RecognitionException {
        EObject current = null;

        Token this_NOT_0=null;
        EObject this_EqualityExpression_1 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:990:28: ( ( (this_NOT_0= RULE_NOT )? this_EqualityExpression_1= ruleEqualityExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:991:1: ( (this_NOT_0= RULE_NOT )? this_EqualityExpression_1= ruleEqualityExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:991:1: ( (this_NOT_0= RULE_NOT )? this_EqualityExpression_1= ruleEqualityExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:991:2: (this_NOT_0= RULE_NOT )? this_EqualityExpression_1= ruleEqualityExpression
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:991:2: (this_NOT_0= RULE_NOT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_NOT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:991:3: this_NOT_0= RULE_NOT
                    {
                    this_NOT_0=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleBaseBooleanExpr2018); 
                     
                        newLeafNode(this_NOT_0, grammarAccess.getBaseBooleanExprAccess().getNOTTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getBaseBooleanExprAccess().getEqualityExpressionParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleEqualityExpression_in_ruleBaseBooleanExpr2041);
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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1012:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1013:2: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1014:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
             newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            pushFollow(FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression2076);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;

             current =iv_ruleEqualityExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualityExpression2086); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1021:1: ruleEqualityExpression returns [EObject current=null] : ( ( (lv_instanceof_0_0= ruleInstanceOfExpression ) ) ( (this_EQUAL_1= RULE_EQUAL | this_NOTEQUAL_2= RULE_NOTEQUAL ) ( (lv_instanceof_3_0= ruleInstanceOfExpression ) ) )* ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        Token this_EQUAL_1=null;
        Token this_NOTEQUAL_2=null;
        EObject lv_instanceof_0_0 = null;

        EObject lv_instanceof_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1024:28: ( ( ( (lv_instanceof_0_0= ruleInstanceOfExpression ) ) ( (this_EQUAL_1= RULE_EQUAL | this_NOTEQUAL_2= RULE_NOTEQUAL ) ( (lv_instanceof_3_0= ruleInstanceOfExpression ) ) )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1025:1: ( ( (lv_instanceof_0_0= ruleInstanceOfExpression ) ) ( (this_EQUAL_1= RULE_EQUAL | this_NOTEQUAL_2= RULE_NOTEQUAL ) ( (lv_instanceof_3_0= ruleInstanceOfExpression ) ) )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1025:1: ( ( (lv_instanceof_0_0= ruleInstanceOfExpression ) ) ( (this_EQUAL_1= RULE_EQUAL | this_NOTEQUAL_2= RULE_NOTEQUAL ) ( (lv_instanceof_3_0= ruleInstanceOfExpression ) ) )* )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1025:2: ( (lv_instanceof_0_0= ruleInstanceOfExpression ) ) ( (this_EQUAL_1= RULE_EQUAL | this_NOTEQUAL_2= RULE_NOTEQUAL ) ( (lv_instanceof_3_0= ruleInstanceOfExpression ) ) )*
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1025:2: ( (lv_instanceof_0_0= ruleInstanceOfExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1026:1: (lv_instanceof_0_0= ruleInstanceOfExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1026:1: (lv_instanceof_0_0= ruleInstanceOfExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1027:3: lv_instanceof_0_0= ruleInstanceOfExpression
            {
             
            	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getInstanceofInstanceOfExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleInstanceOfExpression_in_ruleEqualityExpression2132);
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

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1043:2: ( (this_EQUAL_1= RULE_EQUAL | this_NOTEQUAL_2= RULE_NOTEQUAL ) ( (lv_instanceof_3_0= ruleInstanceOfExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_EQUAL && LA14_0<=RULE_NOTEQUAL)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1043:3: (this_EQUAL_1= RULE_EQUAL | this_NOTEQUAL_2= RULE_NOTEQUAL ) ( (lv_instanceof_3_0= ruleInstanceOfExpression ) )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1043:3: (this_EQUAL_1= RULE_EQUAL | this_NOTEQUAL_2= RULE_NOTEQUAL )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==RULE_EQUAL) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==RULE_NOTEQUAL) ) {
            	        alt13=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1043:4: this_EQUAL_1= RULE_EQUAL
            	            {
            	            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_ruleEqualityExpression2145); 
            	             
            	                newLeafNode(this_EQUAL_1, grammarAccess.getEqualityExpressionAccess().getEQUALTerminalRuleCall_1_0_0()); 
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1048:6: this_NOTEQUAL_2= RULE_NOTEQUAL
            	            {
            	            this_NOTEQUAL_2=(Token)match(input,RULE_NOTEQUAL,FOLLOW_RULE_NOTEQUAL_in_ruleEqualityExpression2161); 
            	             
            	                newLeafNode(this_NOTEQUAL_2, grammarAccess.getEqualityExpressionAccess().getNOTEQUALTerminalRuleCall_1_0_1()); 
            	                

            	            }
            	            break;

            	    }

            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1052:2: ( (lv_instanceof_3_0= ruleInstanceOfExpression ) )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1053:1: (lv_instanceof_3_0= ruleInstanceOfExpression )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1053:1: (lv_instanceof_3_0= ruleInstanceOfExpression )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1054:3: lv_instanceof_3_0= ruleInstanceOfExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getInstanceofInstanceOfExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstanceOfExpression_in_ruleEqualityExpression2182);
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
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleRelationalExpression"
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1078:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1079:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1080:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
             newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression2220);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;

             current =iv_ruleRelationalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression2230); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1087:1: ruleRelationalExpression returns [EObject current=null] : ( ( (lv_rel_0_0= ruleAdditiveExpression ) ) ( ruleRelationalOp ( (lv_rel_2_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_rel_0_0 = null;

        EObject lv_rel_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1090:28: ( ( ( (lv_rel_0_0= ruleAdditiveExpression ) ) ( ruleRelationalOp ( (lv_rel_2_0= ruleAdditiveExpression ) ) )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1091:1: ( ( (lv_rel_0_0= ruleAdditiveExpression ) ) ( ruleRelationalOp ( (lv_rel_2_0= ruleAdditiveExpression ) ) )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1091:1: ( ( (lv_rel_0_0= ruleAdditiveExpression ) ) ( ruleRelationalOp ( (lv_rel_2_0= ruleAdditiveExpression ) ) )* )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1091:2: ( (lv_rel_0_0= ruleAdditiveExpression ) ) ( ruleRelationalOp ( (lv_rel_2_0= ruleAdditiveExpression ) ) )*
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1091:2: ( (lv_rel_0_0= ruleAdditiveExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1092:1: (lv_rel_0_0= ruleAdditiveExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1092:1: (lv_rel_0_0= ruleAdditiveExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1093:3: lv_rel_0_0= ruleAdditiveExpression
            {
             
            	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRelAdditiveExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression2276);
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

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1109:2: ( ruleRelationalOp ( (lv_rel_2_0= ruleAdditiveExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_GT && LA15_0<=RULE_LTE)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1110:5: ruleRelationalOp ( (lv_rel_2_0= ruleAdditiveExpression ) )
            	    {
            	     
            	            newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRelationalOpParserRuleCall_1_0()); 
            	        
            	    pushFollow(FOLLOW_ruleRelationalOp_in_ruleRelationalExpression2293);
            	    ruleRelationalOp();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1117:1: ( (lv_rel_2_0= ruleAdditiveExpression ) )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1118:1: (lv_rel_2_0= ruleAdditiveExpression )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1118:1: (lv_rel_2_0= ruleAdditiveExpression )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1119:3: lv_rel_2_0= ruleAdditiveExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRelAdditiveExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression2313);
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
            	    break loop15;
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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1143:1: entryRuleInstanceOfExpression returns [EObject current=null] : iv_ruleInstanceOfExpression= ruleInstanceOfExpression EOF ;
    public final EObject entryRuleInstanceOfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceOfExpression = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1144:2: (iv_ruleInstanceOfExpression= ruleInstanceOfExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1145:2: iv_ruleInstanceOfExpression= ruleInstanceOfExpression EOF
            {
             newCompositeNode(grammarAccess.getInstanceOfExpressionRule()); 
            pushFollow(FOLLOW_ruleInstanceOfExpression_in_entryRuleInstanceOfExpression2351);
            iv_ruleInstanceOfExpression=ruleInstanceOfExpression();

            state._fsp--;

             current =iv_ruleInstanceOfExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceOfExpression2361); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1152:1: ruleInstanceOfExpression returns [EObject current=null] : ( ( (lv_el_0_0= ruleRelationalExpression ) ) (this_INSTANCEOF_1= RULE_INSTANCEOF ( ( (lv_target_2_1= ruleRelationalExpression | lv_target_2_2= ruleClassOrInterfaceType ) ) ) )? ) ;
    public final EObject ruleInstanceOfExpression() throws RecognitionException {
        EObject current = null;

        Token this_INSTANCEOF_1=null;
        EObject lv_el_0_0 = null;

        EObject lv_target_2_1 = null;

        EObject lv_target_2_2 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1155:28: ( ( ( (lv_el_0_0= ruleRelationalExpression ) ) (this_INSTANCEOF_1= RULE_INSTANCEOF ( ( (lv_target_2_1= ruleRelationalExpression | lv_target_2_2= ruleClassOrInterfaceType ) ) ) )? ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1156:1: ( ( (lv_el_0_0= ruleRelationalExpression ) ) (this_INSTANCEOF_1= RULE_INSTANCEOF ( ( (lv_target_2_1= ruleRelationalExpression | lv_target_2_2= ruleClassOrInterfaceType ) ) ) )? )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1156:1: ( ( (lv_el_0_0= ruleRelationalExpression ) ) (this_INSTANCEOF_1= RULE_INSTANCEOF ( ( (lv_target_2_1= ruleRelationalExpression | lv_target_2_2= ruleClassOrInterfaceType ) ) ) )? )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1156:2: ( (lv_el_0_0= ruleRelationalExpression ) ) (this_INSTANCEOF_1= RULE_INSTANCEOF ( ( (lv_target_2_1= ruleRelationalExpression | lv_target_2_2= ruleClassOrInterfaceType ) ) ) )?
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1156:2: ( (lv_el_0_0= ruleRelationalExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1157:1: (lv_el_0_0= ruleRelationalExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1157:1: (lv_el_0_0= ruleRelationalExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1158:3: lv_el_0_0= ruleRelationalExpression
            {
             
            	        newCompositeNode(grammarAccess.getInstanceOfExpressionAccess().getElRelationalExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleRelationalExpression_in_ruleInstanceOfExpression2407);
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

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1174:2: (this_INSTANCEOF_1= RULE_INSTANCEOF ( ( (lv_target_2_1= ruleRelationalExpression | lv_target_2_2= ruleClassOrInterfaceType ) ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INSTANCEOF) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1174:3: this_INSTANCEOF_1= RULE_INSTANCEOF ( ( (lv_target_2_1= ruleRelationalExpression | lv_target_2_2= ruleClassOrInterfaceType ) ) )
                    {
                    this_INSTANCEOF_1=(Token)match(input,RULE_INSTANCEOF,FOLLOW_RULE_INSTANCEOF_in_ruleInstanceOfExpression2419); 
                     
                        newLeafNode(this_INSTANCEOF_1, grammarAccess.getInstanceOfExpressionAccess().getINSTANCEOFTerminalRuleCall_1_0()); 
                        
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1178:1: ( ( (lv_target_2_1= ruleRelationalExpression | lv_target_2_2= ruleClassOrInterfaceType ) ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1179:1: ( (lv_target_2_1= ruleRelationalExpression | lv_target_2_2= ruleClassOrInterfaceType ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1179:1: ( (lv_target_2_1= ruleRelationalExpression | lv_target_2_2= ruleClassOrInterfaceType ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1180:1: (lv_target_2_1= ruleRelationalExpression | lv_target_2_2= ruleClassOrInterfaceType )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1180:1: (lv_target_2_1= ruleRelationalExpression | lv_target_2_2= ruleClassOrInterfaceType )
                    int alt16=2;
                    alt16 = dfa16.predict(input);
                    switch (alt16) {
                        case 1 :
                            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1181:3: lv_target_2_1= ruleRelationalExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getInstanceOfExpressionAccess().getTargetRelationalExpressionParserRuleCall_1_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleRelationalExpression_in_ruleInstanceOfExpression2441);
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
                            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1196:8: lv_target_2_2= ruleClassOrInterfaceType
                            {
                             
                            	        newCompositeNode(grammarAccess.getInstanceOfExpressionAccess().getTargetClassOrInterfaceTypeParserRuleCall_1_1_0_1()); 
                            	    
                            pushFollow(FOLLOW_ruleClassOrInterfaceType_in_ruleInstanceOfExpression2460);
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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1222:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1223:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1224:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
             newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression2501);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;

             current =iv_ruleAdditiveExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression2511); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1231:1: ruleAdditiveExpression returns [EObject current=null] : ( ( (lv_multExpr_0_0= ruleMultiplicativeExpression ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_multExpr_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_multExpr_0_0 = null;

        EObject lv_multExpr_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1234:28: ( ( ( (lv_multExpr_0_0= ruleMultiplicativeExpression ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_multExpr_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1235:1: ( ( (lv_multExpr_0_0= ruleMultiplicativeExpression ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_multExpr_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1235:1: ( ( (lv_multExpr_0_0= ruleMultiplicativeExpression ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_multExpr_3_0= ruleMultiplicativeExpression ) ) )* )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1235:2: ( (lv_multExpr_0_0= ruleMultiplicativeExpression ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_multExpr_3_0= ruleMultiplicativeExpression ) ) )*
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1235:2: ( (lv_multExpr_0_0= ruleMultiplicativeExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1236:1: (lv_multExpr_0_0= ruleMultiplicativeExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1236:1: (lv_multExpr_0_0= ruleMultiplicativeExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1237:3: lv_multExpr_0_0= ruleMultiplicativeExpression
            {
             
            	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultExprMultiplicativeExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression2557);
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

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1253:2: ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_multExpr_3_0= ruleMultiplicativeExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=55 && LA19_0<=56)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1253:3: (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_multExpr_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1253:3: (otherlv_1= '+' | otherlv_2= '-' )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==55) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==56) ) {
            	        alt18=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1253:5: otherlv_1= '+'
            	            {
            	            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleAdditiveExpression2571); 

            	                	newLeafNode(otherlv_1, grammarAccess.getAdditiveExpressionAccess().getPlusSignKeyword_1_0_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1258:7: otherlv_2= '-'
            	            {
            	            otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleAdditiveExpression2589); 

            	                	newLeafNode(otherlv_2, grammarAccess.getAdditiveExpressionAccess().getHyphenMinusKeyword_1_0_1());
            	                

            	            }
            	            break;

            	    }

            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1262:2: ( (lv_multExpr_3_0= ruleMultiplicativeExpression ) )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1263:1: (lv_multExpr_3_0= ruleMultiplicativeExpression )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1263:1: (lv_multExpr_3_0= ruleMultiplicativeExpression )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1264:3: lv_multExpr_3_0= ruleMultiplicativeExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultExprMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression2611);
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
            	    break loop19;
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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1288:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1289:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1290:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression2649);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;

             current =iv_ruleMultiplicativeExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression2659); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1297:1: ruleMultiplicativeExpression returns [EObject current=null] : ( ( (lv_baseExpr_0_0= ruleBaseCommonExpression ) ) (this_DOT_1= RULE_DOT ( (lv_methods_2_0= ruleMethodInvocation ) ) )* ( (otherlv_3= '*' | otherlv_4= '/' ) ( (lv_baseExpr_5_0= ruleBaseCommonExpression ) ) (this_DOT_6= RULE_DOT ( (lv_methods_7_0= ruleMethodInvocation ) ) )* )* ) ;
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
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1300:28: ( ( ( (lv_baseExpr_0_0= ruleBaseCommonExpression ) ) (this_DOT_1= RULE_DOT ( (lv_methods_2_0= ruleMethodInvocation ) ) )* ( (otherlv_3= '*' | otherlv_4= '/' ) ( (lv_baseExpr_5_0= ruleBaseCommonExpression ) ) (this_DOT_6= RULE_DOT ( (lv_methods_7_0= ruleMethodInvocation ) ) )* )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1301:1: ( ( (lv_baseExpr_0_0= ruleBaseCommonExpression ) ) (this_DOT_1= RULE_DOT ( (lv_methods_2_0= ruleMethodInvocation ) ) )* ( (otherlv_3= '*' | otherlv_4= '/' ) ( (lv_baseExpr_5_0= ruleBaseCommonExpression ) ) (this_DOT_6= RULE_DOT ( (lv_methods_7_0= ruleMethodInvocation ) ) )* )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1301:1: ( ( (lv_baseExpr_0_0= ruleBaseCommonExpression ) ) (this_DOT_1= RULE_DOT ( (lv_methods_2_0= ruleMethodInvocation ) ) )* ( (otherlv_3= '*' | otherlv_4= '/' ) ( (lv_baseExpr_5_0= ruleBaseCommonExpression ) ) (this_DOT_6= RULE_DOT ( (lv_methods_7_0= ruleMethodInvocation ) ) )* )* )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1301:2: ( (lv_baseExpr_0_0= ruleBaseCommonExpression ) ) (this_DOT_1= RULE_DOT ( (lv_methods_2_0= ruleMethodInvocation ) ) )* ( (otherlv_3= '*' | otherlv_4= '/' ) ( (lv_baseExpr_5_0= ruleBaseCommonExpression ) ) (this_DOT_6= RULE_DOT ( (lv_methods_7_0= ruleMethodInvocation ) ) )* )*
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1301:2: ( (lv_baseExpr_0_0= ruleBaseCommonExpression ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1302:1: (lv_baseExpr_0_0= ruleBaseCommonExpression )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1302:1: (lv_baseExpr_0_0= ruleBaseCommonExpression )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1303:3: lv_baseExpr_0_0= ruleBaseCommonExpression
            {
             
            	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getBaseExprBaseCommonExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleBaseCommonExpression_in_ruleMultiplicativeExpression2705);
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

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1319:2: (this_DOT_1= RULE_DOT ( (lv_methods_2_0= ruleMethodInvocation ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_DOT) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1319:3: this_DOT_1= RULE_DOT ( (lv_methods_2_0= ruleMethodInvocation ) )
            	    {
            	    this_DOT_1=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleMultiplicativeExpression2717); 
            	     
            	        newLeafNode(this_DOT_1, grammarAccess.getMultiplicativeExpressionAccess().getDOTTerminalRuleCall_1_0()); 
            	        
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1323:1: ( (lv_methods_2_0= ruleMethodInvocation ) )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1324:1: (lv_methods_2_0= ruleMethodInvocation )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1324:1: (lv_methods_2_0= ruleMethodInvocation )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1325:3: lv_methods_2_0= ruleMethodInvocation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getMethodsMethodInvocationParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMethodInvocation_in_ruleMultiplicativeExpression2737);
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
            	    break loop20;
                }
            } while (true);

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1341:4: ( (otherlv_3= '*' | otherlv_4= '/' ) ( (lv_baseExpr_5_0= ruleBaseCommonExpression ) ) (this_DOT_6= RULE_DOT ( (lv_methods_7_0= ruleMethodInvocation ) ) )* )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=57 && LA23_0<=58)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1341:5: (otherlv_3= '*' | otherlv_4= '/' ) ( (lv_baseExpr_5_0= ruleBaseCommonExpression ) ) (this_DOT_6= RULE_DOT ( (lv_methods_7_0= ruleMethodInvocation ) ) )*
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1341:5: (otherlv_3= '*' | otherlv_4= '/' )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==57) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==58) ) {
            	        alt21=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1341:7: otherlv_3= '*'
            	            {
            	            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleMultiplicativeExpression2753); 

            	                	newLeafNode(otherlv_3, grammarAccess.getMultiplicativeExpressionAccess().getAsteriskKeyword_2_0_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1346:7: otherlv_4= '/'
            	            {
            	            otherlv_4=(Token)match(input,58,FOLLOW_58_in_ruleMultiplicativeExpression2771); 

            	                	newLeafNode(otherlv_4, grammarAccess.getMultiplicativeExpressionAccess().getSolidusKeyword_2_0_1());
            	                

            	            }
            	            break;

            	    }

            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1350:2: ( (lv_baseExpr_5_0= ruleBaseCommonExpression ) )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1351:1: (lv_baseExpr_5_0= ruleBaseCommonExpression )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1351:1: (lv_baseExpr_5_0= ruleBaseCommonExpression )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1352:3: lv_baseExpr_5_0= ruleBaseCommonExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getBaseExprBaseCommonExpressionParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBaseCommonExpression_in_ruleMultiplicativeExpression2793);
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

            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1368:2: (this_DOT_6= RULE_DOT ( (lv_methods_7_0= ruleMethodInvocation ) ) )*
            	    loop22:
            	    do {
            	        int alt22=2;
            	        int LA22_0 = input.LA(1);

            	        if ( (LA22_0==RULE_DOT) ) {
            	            alt22=1;
            	        }


            	        switch (alt22) {
            	    	case 1 :
            	    	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1368:3: this_DOT_6= RULE_DOT ( (lv_methods_7_0= ruleMethodInvocation ) )
            	    	    {
            	    	    this_DOT_6=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleMultiplicativeExpression2805); 
            	    	     
            	    	        newLeafNode(this_DOT_6, grammarAccess.getMultiplicativeExpressionAccess().getDOTTerminalRuleCall_2_2_0()); 
            	    	        
            	    	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1372:1: ( (lv_methods_7_0= ruleMethodInvocation ) )
            	    	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1373:1: (lv_methods_7_0= ruleMethodInvocation )
            	    	    {
            	    	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1373:1: (lv_methods_7_0= ruleMethodInvocation )
            	    	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1374:3: lv_methods_7_0= ruleMethodInvocation
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getMethodsMethodInvocationParserRuleCall_2_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleMethodInvocation_in_ruleMultiplicativeExpression2825);
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
            	    	    break loop22;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1398:1: entryRuleRelationalOp returns [String current=null] : iv_ruleRelationalOp= ruleRelationalOp EOF ;
    public final String entryRuleRelationalOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationalOp = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1399:2: (iv_ruleRelationalOp= ruleRelationalOp EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1400:2: iv_ruleRelationalOp= ruleRelationalOp EOF
            {
             newCompositeNode(grammarAccess.getRelationalOpRule()); 
            pushFollow(FOLLOW_ruleRelationalOp_in_entryRuleRelationalOp2866);
            iv_ruleRelationalOp=ruleRelationalOp();

            state._fsp--;

             current =iv_ruleRelationalOp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalOp2877); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1407:1: ruleRelationalOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_GT_0= RULE_GT | this_GTE_1= RULE_GTE | this_LT_2= RULE_LT | this_LTE_3= RULE_LTE ) ;
    public final AntlrDatatypeRuleToken ruleRelationalOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_GT_0=null;
        Token this_GTE_1=null;
        Token this_LT_2=null;
        Token this_LTE_3=null;

         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1410:28: ( (this_GT_0= RULE_GT | this_GTE_1= RULE_GTE | this_LT_2= RULE_LT | this_LTE_3= RULE_LTE ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1411:1: (this_GT_0= RULE_GT | this_GTE_1= RULE_GTE | this_LT_2= RULE_LT | this_LTE_3= RULE_LTE )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1411:1: (this_GT_0= RULE_GT | this_GTE_1= RULE_GTE | this_LT_2= RULE_LT | this_LTE_3= RULE_LTE )
            int alt24=4;
            switch ( input.LA(1) ) {
            case RULE_GT:
                {
                alt24=1;
                }
                break;
            case RULE_GTE:
                {
                alt24=2;
                }
                break;
            case RULE_LT:
                {
                alt24=3;
                }
                break;
            case RULE_LTE:
                {
                alt24=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1411:6: this_GT_0= RULE_GT
                    {
                    this_GT_0=(Token)match(input,RULE_GT,FOLLOW_RULE_GT_in_ruleRelationalOp2917); 

                    		current.merge(this_GT_0);
                        
                     
                        newLeafNode(this_GT_0, grammarAccess.getRelationalOpAccess().getGTTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1419:10: this_GTE_1= RULE_GTE
                    {
                    this_GTE_1=(Token)match(input,RULE_GTE,FOLLOW_RULE_GTE_in_ruleRelationalOp2943); 

                    		current.merge(this_GTE_1);
                        
                     
                        newLeafNode(this_GTE_1, grammarAccess.getRelationalOpAccess().getGTETerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1427:10: this_LT_2= RULE_LT
                    {
                    this_LT_2=(Token)match(input,RULE_LT,FOLLOW_RULE_LT_in_ruleRelationalOp2969); 

                    		current.merge(this_LT_2);
                        
                     
                        newLeafNode(this_LT_2, grammarAccess.getRelationalOpAccess().getLTTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1435:10: this_LTE_3= RULE_LTE
                    {
                    this_LTE_3=(Token)match(input,RULE_LTE,FOLLOW_RULE_LTE_in_ruleRelationalOp2995); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1450:1: entryRuleCreator returns [EObject current=null] : iv_ruleCreator= ruleCreator EOF ;
    public final EObject entryRuleCreator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreator = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1451:2: (iv_ruleCreator= ruleCreator EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1452:2: iv_ruleCreator= ruleCreator EOF
            {
             newCompositeNode(grammarAccess.getCreatorRule()); 
            pushFollow(FOLLOW_ruleCreator_in_entryRuleCreator3040);
            iv_ruleCreator=ruleCreator();

            state._fsp--;

             current =iv_ruleCreator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCreator3050); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1459:1: ruleCreator returns [EObject current=null] : (this_ClassCreator_0= ruleClassCreator | this_ArrayCreator_1= ruleArrayCreator ) ;
    public final EObject ruleCreator() throws RecognitionException {
        EObject current = null;

        EObject this_ClassCreator_0 = null;

        EObject this_ArrayCreator_1 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1462:28: ( (this_ClassCreator_0= ruleClassCreator | this_ArrayCreator_1= ruleArrayCreator ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1463:1: (this_ClassCreator_0= ruleClassCreator | this_ArrayCreator_1= ruleArrayCreator )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1463:1: (this_ClassCreator_0= ruleClassCreator | this_ArrayCreator_1= ruleArrayCreator )
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1464:5: this_ClassCreator_0= ruleClassCreator
                    {
                     
                            newCompositeNode(grammarAccess.getCreatorAccess().getClassCreatorParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleClassCreator_in_ruleCreator3097);
                    this_ClassCreator_0=ruleClassCreator();

                    state._fsp--;

                     
                            current = this_ClassCreator_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1474:5: this_ArrayCreator_1= ruleArrayCreator
                    {
                     
                            newCompositeNode(grammarAccess.getCreatorAccess().getArrayCreatorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleArrayCreator_in_ruleCreator3124);
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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1490:1: entryRuleClassCreator returns [EObject current=null] : iv_ruleClassCreator= ruleClassCreator EOF ;
    public final EObject entryRuleClassCreator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassCreator = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1491:2: (iv_ruleClassCreator= ruleClassCreator EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1492:2: iv_ruleClassCreator= ruleClassCreator EOF
            {
             newCompositeNode(grammarAccess.getClassCreatorRule()); 
            pushFollow(FOLLOW_ruleClassCreator_in_entryRuleClassCreator3159);
            iv_ruleClassCreator=ruleClassCreator();

            state._fsp--;

             current =iv_ruleClassCreator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassCreator3169); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1499:1: ruleClassCreator returns [EObject current=null] : (this_NEW_0= RULE_NEW ( (lv_clazz_1_0= ruleClassOrInterfaceType ) ) ( (lv_args_2_0= ruleArguments ) ) ) ;
    public final EObject ruleClassCreator() throws RecognitionException {
        EObject current = null;

        Token this_NEW_0=null;
        EObject lv_clazz_1_0 = null;

        EObject lv_args_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1502:28: ( (this_NEW_0= RULE_NEW ( (lv_clazz_1_0= ruleClassOrInterfaceType ) ) ( (lv_args_2_0= ruleArguments ) ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1503:1: (this_NEW_0= RULE_NEW ( (lv_clazz_1_0= ruleClassOrInterfaceType ) ) ( (lv_args_2_0= ruleArguments ) ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1503:1: (this_NEW_0= RULE_NEW ( (lv_clazz_1_0= ruleClassOrInterfaceType ) ) ( (lv_args_2_0= ruleArguments ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1503:2: this_NEW_0= RULE_NEW ( (lv_clazz_1_0= ruleClassOrInterfaceType ) ) ( (lv_args_2_0= ruleArguments ) )
            {
            this_NEW_0=(Token)match(input,RULE_NEW,FOLLOW_RULE_NEW_in_ruleClassCreator3205); 
             
                newLeafNode(this_NEW_0, grammarAccess.getClassCreatorAccess().getNEWTerminalRuleCall_0()); 
                
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1507:1: ( (lv_clazz_1_0= ruleClassOrInterfaceType ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1508:1: (lv_clazz_1_0= ruleClassOrInterfaceType )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1508:1: (lv_clazz_1_0= ruleClassOrInterfaceType )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1509:3: lv_clazz_1_0= ruleClassOrInterfaceType
            {
             
            	        newCompositeNode(grammarAccess.getClassCreatorAccess().getClazzClassOrInterfaceTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleClassOrInterfaceType_in_ruleClassCreator3225);
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

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1525:2: ( (lv_args_2_0= ruleArguments ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1526:1: (lv_args_2_0= ruleArguments )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1526:1: (lv_args_2_0= ruleArguments )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1527:3: lv_args_2_0= ruleArguments
            {
             
            	        newCompositeNode(grammarAccess.getClassCreatorAccess().getArgsArgumentsParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleArguments_in_ruleClassCreator3246);
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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1551:1: entryRuleArrayCreator returns [EObject current=null] : iv_ruleArrayCreator= ruleArrayCreator EOF ;
    public final EObject entryRuleArrayCreator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayCreator = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1552:2: (iv_ruleArrayCreator= ruleArrayCreator EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1553:2: iv_ruleArrayCreator= ruleArrayCreator EOF
            {
             newCompositeNode(grammarAccess.getArrayCreatorRule()); 
            pushFollow(FOLLOW_ruleArrayCreator_in_entryRuleArrayCreator3282);
            iv_ruleArrayCreator=ruleArrayCreator();

            state._fsp--;

             current =iv_ruleArrayCreator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayCreator3292); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1560:1: ruleArrayCreator returns [EObject current=null] : (this_NEW_0= RULE_NEW ( (lv_type_1_0= ruleArrayType ) ) ( (lv_arrayInitializer_2_0= ruleArrayInitializer ) ) ) ;
    public final EObject ruleArrayCreator() throws RecognitionException {
        EObject current = null;

        Token this_NEW_0=null;
        EObject lv_type_1_0 = null;

        EObject lv_arrayInitializer_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1563:28: ( (this_NEW_0= RULE_NEW ( (lv_type_1_0= ruleArrayType ) ) ( (lv_arrayInitializer_2_0= ruleArrayInitializer ) ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1564:1: (this_NEW_0= RULE_NEW ( (lv_type_1_0= ruleArrayType ) ) ( (lv_arrayInitializer_2_0= ruleArrayInitializer ) ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1564:1: (this_NEW_0= RULE_NEW ( (lv_type_1_0= ruleArrayType ) ) ( (lv_arrayInitializer_2_0= ruleArrayInitializer ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1564:2: this_NEW_0= RULE_NEW ( (lv_type_1_0= ruleArrayType ) ) ( (lv_arrayInitializer_2_0= ruleArrayInitializer ) )
            {
            this_NEW_0=(Token)match(input,RULE_NEW,FOLLOW_RULE_NEW_in_ruleArrayCreator3328); 
             
                newLeafNode(this_NEW_0, grammarAccess.getArrayCreatorAccess().getNEWTerminalRuleCall_0()); 
                
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1568:1: ( (lv_type_1_0= ruleArrayType ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1569:1: (lv_type_1_0= ruleArrayType )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1569:1: (lv_type_1_0= ruleArrayType )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1570:3: lv_type_1_0= ruleArrayType
            {
             
            	        newCompositeNode(grammarAccess.getArrayCreatorAccess().getTypeArrayTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleArrayType_in_ruleArrayCreator3348);
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

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1586:2: ( (lv_arrayInitializer_2_0= ruleArrayInitializer ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1587:1: (lv_arrayInitializer_2_0= ruleArrayInitializer )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1587:1: (lv_arrayInitializer_2_0= ruleArrayInitializer )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1588:3: lv_arrayInitializer_2_0= ruleArrayInitializer
            {
             
            	        newCompositeNode(grammarAccess.getArrayCreatorAccess().getArrayInitializerArrayInitializerParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleArrayInitializer_in_ruleArrayCreator3369);
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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1612:1: entryRuleArrayInitializer returns [EObject current=null] : iv_ruleArrayInitializer= ruleArrayInitializer EOF ;
    public final EObject entryRuleArrayInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayInitializer = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1613:2: (iv_ruleArrayInitializer= ruleArrayInitializer EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1614:2: iv_ruleArrayInitializer= ruleArrayInitializer EOF
            {
             newCompositeNode(grammarAccess.getArrayInitializerRule()); 
            pushFollow(FOLLOW_ruleArrayInitializer_in_entryRuleArrayInitializer3405);
            iv_ruleArrayInitializer=ruleArrayInitializer();

            state._fsp--;

             current =iv_ruleArrayInitializer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayInitializer3415); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1621:1: ruleArrayInitializer returns [EObject current=null] : ( () this_LBRACE_1= RULE_LBRACE ( ( (lv_firstEl_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_otherEls_4_0= ruleExpression ) ) )* )? (this_COMMA_5= RULE_COMMA )? this_RBRACE_6= RULE_RBRACE ) ;
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
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1624:28: ( ( () this_LBRACE_1= RULE_LBRACE ( ( (lv_firstEl_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_otherEls_4_0= ruleExpression ) ) )* )? (this_COMMA_5= RULE_COMMA )? this_RBRACE_6= RULE_RBRACE ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1625:1: ( () this_LBRACE_1= RULE_LBRACE ( ( (lv_firstEl_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_otherEls_4_0= ruleExpression ) ) )* )? (this_COMMA_5= RULE_COMMA )? this_RBRACE_6= RULE_RBRACE )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1625:1: ( () this_LBRACE_1= RULE_LBRACE ( ( (lv_firstEl_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_otherEls_4_0= ruleExpression ) ) )* )? (this_COMMA_5= RULE_COMMA )? this_RBRACE_6= RULE_RBRACE )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1625:2: () this_LBRACE_1= RULE_LBRACE ( ( (lv_firstEl_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_otherEls_4_0= ruleExpression ) ) )* )? (this_COMMA_5= RULE_COMMA )? this_RBRACE_6= RULE_RBRACE
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1625:2: ()
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1626:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getArrayInitializerAccess().getArrayInitializerAction_0(),
                        current);
                

            }

            this_LBRACE_1=(Token)match(input,RULE_LBRACE,FOLLOW_RULE_LBRACE_in_ruleArrayInitializer3460); 
             
                newLeafNode(this_LBRACE_1, grammarAccess.getArrayInitializerAccess().getLBRACETerminalRuleCall_1()); 
                
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1635:1: ( ( (lv_firstEl_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_otherEls_4_0= ruleExpression ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_IDENTIFIER||(LA27_0>=RULE_FIELDTOKEN && LA27_0<=RULE_LPAREN)||LA27_0==RULE_NOT||LA27_0==RULE_NEW||(LA27_0>=RULE_INTLITERAL && LA27_0<=RULE_NULL)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1635:2: ( (lv_firstEl_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_otherEls_4_0= ruleExpression ) ) )*
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1635:2: ( (lv_firstEl_2_0= ruleExpression ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1636:1: (lv_firstEl_2_0= ruleExpression )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1636:1: (lv_firstEl_2_0= ruleExpression )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1637:3: lv_firstEl_2_0= ruleExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayInitializerAccess().getFirstElExpressionParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleArrayInitializer3481);
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

                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1653:2: (this_COMMA_3= RULE_COMMA ( (lv_otherEls_4_0= ruleExpression ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==RULE_COMMA) ) {
                            int LA26_1 = input.LA(2);

                            if ( (LA26_1==RULE_IDENTIFIER||(LA26_1>=RULE_FIELDTOKEN && LA26_1<=RULE_LPAREN)||LA26_1==RULE_NOT||LA26_1==RULE_NEW||(LA26_1>=RULE_INTLITERAL && LA26_1<=RULE_NULL)) ) {
                                alt26=1;
                            }


                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1653:3: this_COMMA_3= RULE_COMMA ( (lv_otherEls_4_0= ruleExpression ) )
                    	    {
                    	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleArrayInitializer3493); 
                    	     
                    	        newLeafNode(this_COMMA_3, grammarAccess.getArrayInitializerAccess().getCOMMATerminalRuleCall_2_1_0()); 
                    	        
                    	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1657:1: ( (lv_otherEls_4_0= ruleExpression ) )
                    	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1658:1: (lv_otherEls_4_0= ruleExpression )
                    	    {
                    	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1658:1: (lv_otherEls_4_0= ruleExpression )
                    	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1659:3: lv_otherEls_4_0= ruleExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getArrayInitializerAccess().getOtherElsExpressionParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleArrayInitializer3513);
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
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1675:6: (this_COMMA_5= RULE_COMMA )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_COMMA) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1675:7: this_COMMA_5= RULE_COMMA
                    {
                    this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleArrayInitializer3529); 
                     
                        newLeafNode(this_COMMA_5, grammarAccess.getArrayInitializerAccess().getCOMMATerminalRuleCall_3()); 
                        

                    }
                    break;

            }

            this_RBRACE_6=(Token)match(input,RULE_RBRACE,FOLLOW_RULE_RBRACE_in_ruleArrayInitializer3541); 
             
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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1693:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1694:2: (iv_ruleArrayType= ruleArrayType EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1695:2: iv_ruleArrayType= ruleArrayType EOF
            {
             newCompositeNode(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_ruleArrayType_in_entryRuleArrayType3578);
            iv_ruleArrayType=ruleArrayType();

            state._fsp--;

             current =iv_ruleArrayType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayType3588); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1702:1: ruleArrayType returns [EObject current=null] : ( ( ( (lv_clazzInterf_0_0= ruleClassOrInterfaceType ) ) | ( (lv_primtype_1_0= rulePrimitiveType ) ) ) (this_LBRACKET_2= RULE_LBRACKET this_RBRACKET_3= RULE_RBRACKET )+ ) ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        Token this_LBRACKET_2=null;
        Token this_RBRACKET_3=null;
        EObject lv_clazzInterf_0_0 = null;

        AntlrDatatypeRuleToken lv_primtype_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1705:28: ( ( ( ( (lv_clazzInterf_0_0= ruleClassOrInterfaceType ) ) | ( (lv_primtype_1_0= rulePrimitiveType ) ) ) (this_LBRACKET_2= RULE_LBRACKET this_RBRACKET_3= RULE_RBRACKET )+ ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1706:1: ( ( ( (lv_clazzInterf_0_0= ruleClassOrInterfaceType ) ) | ( (lv_primtype_1_0= rulePrimitiveType ) ) ) (this_LBRACKET_2= RULE_LBRACKET this_RBRACKET_3= RULE_RBRACKET )+ )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1706:1: ( ( ( (lv_clazzInterf_0_0= ruleClassOrInterfaceType ) ) | ( (lv_primtype_1_0= rulePrimitiveType ) ) ) (this_LBRACKET_2= RULE_LBRACKET this_RBRACKET_3= RULE_RBRACKET )+ )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1706:2: ( ( (lv_clazzInterf_0_0= ruleClassOrInterfaceType ) ) | ( (lv_primtype_1_0= rulePrimitiveType ) ) ) (this_LBRACKET_2= RULE_LBRACKET this_RBRACKET_3= RULE_RBRACKET )+
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1706:2: ( ( (lv_clazzInterf_0_0= ruleClassOrInterfaceType ) ) | ( (lv_primtype_1_0= rulePrimitiveType ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_IDENTIFIER) ) {
                alt29=1;
            }
            else if ( ((LA29_0>=59 && LA29_0<=66)) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1706:3: ( (lv_clazzInterf_0_0= ruleClassOrInterfaceType ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1706:3: ( (lv_clazzInterf_0_0= ruleClassOrInterfaceType ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1707:1: (lv_clazzInterf_0_0= ruleClassOrInterfaceType )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1707:1: (lv_clazzInterf_0_0= ruleClassOrInterfaceType )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1708:3: lv_clazzInterf_0_0= ruleClassOrInterfaceType
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayTypeAccess().getClazzInterfClassOrInterfaceTypeParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClassOrInterfaceType_in_ruleArrayType3635);
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
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1725:6: ( (lv_primtype_1_0= rulePrimitiveType ) )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1725:6: ( (lv_primtype_1_0= rulePrimitiveType ) )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1726:1: (lv_primtype_1_0= rulePrimitiveType )
                    {
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1726:1: (lv_primtype_1_0= rulePrimitiveType )
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1727:3: lv_primtype_1_0= rulePrimitiveType
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayTypeAccess().getPrimtypePrimitiveTypeParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimitiveType_in_ruleArrayType3662);
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

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1743:3: (this_LBRACKET_2= RULE_LBRACKET this_RBRACKET_3= RULE_RBRACKET )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_LBRACKET) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1743:4: this_LBRACKET_2= RULE_LBRACKET this_RBRACKET_3= RULE_RBRACKET
            	    {
            	    this_LBRACKET_2=(Token)match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_ruleArrayType3675); 
            	     
            	        newLeafNode(this_LBRACKET_2, grammarAccess.getArrayTypeAccess().getLBRACKETTerminalRuleCall_1_0()); 
            	        
            	    this_RBRACKET_3=(Token)match(input,RULE_RBRACKET,FOLLOW_RULE_RBRACKET_in_ruleArrayType3685); 
            	     
            	        newLeafNode(this_RBRACKET_3, grammarAccess.getArrayTypeAccess().getRBRACKETTerminalRuleCall_1_1()); 
            	        

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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1759:1: entryRuleClassOrInterfaceType returns [EObject current=null] : iv_ruleClassOrInterfaceType= ruleClassOrInterfaceType EOF ;
    public final EObject entryRuleClassOrInterfaceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassOrInterfaceType = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1760:2: (iv_ruleClassOrInterfaceType= ruleClassOrInterfaceType EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1761:2: iv_ruleClassOrInterfaceType= ruleClassOrInterfaceType EOF
            {
             newCompositeNode(grammarAccess.getClassOrInterfaceTypeRule()); 
            pushFollow(FOLLOW_ruleClassOrInterfaceType_in_entryRuleClassOrInterfaceType3722);
            iv_ruleClassOrInterfaceType=ruleClassOrInterfaceType();

            state._fsp--;

             current =iv_ruleClassOrInterfaceType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassOrInterfaceType3732); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1768:1: ruleClassOrInterfaceType returns [EObject current=null] : ( (lv_qualifiedName_0_0= ruleQualifiedName ) ) ;
    public final EObject ruleClassOrInterfaceType() throws RecognitionException {
        EObject current = null;

        EObject lv_qualifiedName_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1771:28: ( ( (lv_qualifiedName_0_0= ruleQualifiedName ) ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1772:1: ( (lv_qualifiedName_0_0= ruleQualifiedName ) )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1772:1: ( (lv_qualifiedName_0_0= ruleQualifiedName ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1773:1: (lv_qualifiedName_0_0= ruleQualifiedName )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1773:1: (lv_qualifiedName_0_0= ruleQualifiedName )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1774:3: lv_qualifiedName_0_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getClassOrInterfaceTypeAccess().getQualifiedNameQualifiedNameParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleClassOrInterfaceType3777);
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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1798:1: entryRuleQualifiedName returns [EObject current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final EObject entryRuleQualifiedName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedName = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1799:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1800:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3812);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName3822); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1807:1: ruleQualifiedName returns [EObject current=null] : ( () ( (lv_identifier_1_0= RULE_IDENTIFIER ) ) ( ( (lv_dot_2_0= RULE_DOT ) ) ( (lv_identifier_3_0= RULE_IDENTIFIER ) ) )* ) ;
    public final EObject ruleQualifiedName() throws RecognitionException {
        EObject current = null;

        Token lv_identifier_1_0=null;
        Token lv_dot_2_0=null;
        Token lv_identifier_3_0=null;

         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1810:28: ( ( () ( (lv_identifier_1_0= RULE_IDENTIFIER ) ) ( ( (lv_dot_2_0= RULE_DOT ) ) ( (lv_identifier_3_0= RULE_IDENTIFIER ) ) )* ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1811:1: ( () ( (lv_identifier_1_0= RULE_IDENTIFIER ) ) ( ( (lv_dot_2_0= RULE_DOT ) ) ( (lv_identifier_3_0= RULE_IDENTIFIER ) ) )* )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1811:1: ( () ( (lv_identifier_1_0= RULE_IDENTIFIER ) ) ( ( (lv_dot_2_0= RULE_DOT ) ) ( (lv_identifier_3_0= RULE_IDENTIFIER ) ) )* )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1811:2: () ( (lv_identifier_1_0= RULE_IDENTIFIER ) ) ( ( (lv_dot_2_0= RULE_DOT ) ) ( (lv_identifier_3_0= RULE_IDENTIFIER ) ) )*
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1811:2: ()
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1812:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getQualifiedNameAccess().getQualifiedNameAction_0(),
                        current);
                

            }

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1817:2: ( (lv_identifier_1_0= RULE_IDENTIFIER ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1818:1: (lv_identifier_1_0= RULE_IDENTIFIER )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1818:1: (lv_identifier_1_0= RULE_IDENTIFIER )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1819:3: lv_identifier_1_0= RULE_IDENTIFIER
            {
            lv_identifier_1_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleQualifiedName3873); 

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

            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1835:2: ( ( (lv_dot_2_0= RULE_DOT ) ) ( (lv_identifier_3_0= RULE_IDENTIFIER ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_DOT) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1835:3: ( (lv_dot_2_0= RULE_DOT ) ) ( (lv_identifier_3_0= RULE_IDENTIFIER ) )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1835:3: ( (lv_dot_2_0= RULE_DOT ) )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1836:1: (lv_dot_2_0= RULE_DOT )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1836:1: (lv_dot_2_0= RULE_DOT )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1837:3: lv_dot_2_0= RULE_DOT
            	    {
            	    lv_dot_2_0=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleQualifiedName3896); 

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

            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1853:2: ( (lv_identifier_3_0= RULE_IDENTIFIER ) )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1854:1: (lv_identifier_3_0= RULE_IDENTIFIER )
            	    {
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1854:1: (lv_identifier_3_0= RULE_IDENTIFIER )
            	    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1855:3: lv_identifier_3_0= RULE_IDENTIFIER
            	    {
            	    lv_identifier_3_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleQualifiedName3918); 

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
            	    break loop31;
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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1879:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1880:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1881:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral3962);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral3973); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1888:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INTLITERAL_0= RULE_INTLITERAL | this_LONGLITERAL_1= RULE_LONGLITERAL | this_FLOATLITERAL_2= RULE_FLOATLITERAL | this_DOUBLELITERAL_3= RULE_DOUBLELITERAL | this_CHARLITERAL_4= RULE_CHARLITERAL | this_STRINGLITERAL_5= RULE_STRINGLITERAL | this_TRUE_6= RULE_TRUE | this_FALSE_7= RULE_FALSE | this_NULL_8= RULE_NULL ) ;
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
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1891:28: ( (this_INTLITERAL_0= RULE_INTLITERAL | this_LONGLITERAL_1= RULE_LONGLITERAL | this_FLOATLITERAL_2= RULE_FLOATLITERAL | this_DOUBLELITERAL_3= RULE_DOUBLELITERAL | this_CHARLITERAL_4= RULE_CHARLITERAL | this_STRINGLITERAL_5= RULE_STRINGLITERAL | this_TRUE_6= RULE_TRUE | this_FALSE_7= RULE_FALSE | this_NULL_8= RULE_NULL ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1892:1: (this_INTLITERAL_0= RULE_INTLITERAL | this_LONGLITERAL_1= RULE_LONGLITERAL | this_FLOATLITERAL_2= RULE_FLOATLITERAL | this_DOUBLELITERAL_3= RULE_DOUBLELITERAL | this_CHARLITERAL_4= RULE_CHARLITERAL | this_STRINGLITERAL_5= RULE_STRINGLITERAL | this_TRUE_6= RULE_TRUE | this_FALSE_7= RULE_FALSE | this_NULL_8= RULE_NULL )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1892:1: (this_INTLITERAL_0= RULE_INTLITERAL | this_LONGLITERAL_1= RULE_LONGLITERAL | this_FLOATLITERAL_2= RULE_FLOATLITERAL | this_DOUBLELITERAL_3= RULE_DOUBLELITERAL | this_CHARLITERAL_4= RULE_CHARLITERAL | this_STRINGLITERAL_5= RULE_STRINGLITERAL | this_TRUE_6= RULE_TRUE | this_FALSE_7= RULE_FALSE | this_NULL_8= RULE_NULL )
            int alt32=9;
            switch ( input.LA(1) ) {
            case RULE_INTLITERAL:
                {
                alt32=1;
                }
                break;
            case RULE_LONGLITERAL:
                {
                alt32=2;
                }
                break;
            case RULE_FLOATLITERAL:
                {
                alt32=3;
                }
                break;
            case RULE_DOUBLELITERAL:
                {
                alt32=4;
                }
                break;
            case RULE_CHARLITERAL:
                {
                alt32=5;
                }
                break;
            case RULE_STRINGLITERAL:
                {
                alt32=6;
                }
                break;
            case RULE_TRUE:
                {
                alt32=7;
                }
                break;
            case RULE_FALSE:
                {
                alt32=8;
                }
                break;
            case RULE_NULL:
                {
                alt32=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1892:6: this_INTLITERAL_0= RULE_INTLITERAL
                    {
                    this_INTLITERAL_0=(Token)match(input,RULE_INTLITERAL,FOLLOW_RULE_INTLITERAL_in_ruleLiteral4013); 

                    		current.merge(this_INTLITERAL_0);
                        
                     
                        newLeafNode(this_INTLITERAL_0, grammarAccess.getLiteralAccess().getINTLITERALTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1900:10: this_LONGLITERAL_1= RULE_LONGLITERAL
                    {
                    this_LONGLITERAL_1=(Token)match(input,RULE_LONGLITERAL,FOLLOW_RULE_LONGLITERAL_in_ruleLiteral4039); 

                    		current.merge(this_LONGLITERAL_1);
                        
                     
                        newLeafNode(this_LONGLITERAL_1, grammarAccess.getLiteralAccess().getLONGLITERALTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1908:10: this_FLOATLITERAL_2= RULE_FLOATLITERAL
                    {
                    this_FLOATLITERAL_2=(Token)match(input,RULE_FLOATLITERAL,FOLLOW_RULE_FLOATLITERAL_in_ruleLiteral4065); 

                    		current.merge(this_FLOATLITERAL_2);
                        
                     
                        newLeafNode(this_FLOATLITERAL_2, grammarAccess.getLiteralAccess().getFLOATLITERALTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1916:10: this_DOUBLELITERAL_3= RULE_DOUBLELITERAL
                    {
                    this_DOUBLELITERAL_3=(Token)match(input,RULE_DOUBLELITERAL,FOLLOW_RULE_DOUBLELITERAL_in_ruleLiteral4091); 

                    		current.merge(this_DOUBLELITERAL_3);
                        
                     
                        newLeafNode(this_DOUBLELITERAL_3, grammarAccess.getLiteralAccess().getDOUBLELITERALTerminalRuleCall_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1924:10: this_CHARLITERAL_4= RULE_CHARLITERAL
                    {
                    this_CHARLITERAL_4=(Token)match(input,RULE_CHARLITERAL,FOLLOW_RULE_CHARLITERAL_in_ruleLiteral4117); 

                    		current.merge(this_CHARLITERAL_4);
                        
                     
                        newLeafNode(this_CHARLITERAL_4, grammarAccess.getLiteralAccess().getCHARLITERALTerminalRuleCall_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1932:10: this_STRINGLITERAL_5= RULE_STRINGLITERAL
                    {
                    this_STRINGLITERAL_5=(Token)match(input,RULE_STRINGLITERAL,FOLLOW_RULE_STRINGLITERAL_in_ruleLiteral4143); 

                    		current.merge(this_STRINGLITERAL_5);
                        
                     
                        newLeafNode(this_STRINGLITERAL_5, grammarAccess.getLiteralAccess().getSTRINGLITERALTerminalRuleCall_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1940:10: this_TRUE_6= RULE_TRUE
                    {
                    this_TRUE_6=(Token)match(input,RULE_TRUE,FOLLOW_RULE_TRUE_in_ruleLiteral4169); 

                    		current.merge(this_TRUE_6);
                        
                     
                        newLeafNode(this_TRUE_6, grammarAccess.getLiteralAccess().getTRUETerminalRuleCall_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1948:10: this_FALSE_7= RULE_FALSE
                    {
                    this_FALSE_7=(Token)match(input,RULE_FALSE,FOLLOW_RULE_FALSE_in_ruleLiteral4195); 

                    		current.merge(this_FALSE_7);
                        
                     
                        newLeafNode(this_FALSE_7, grammarAccess.getLiteralAccess().getFALSETerminalRuleCall_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1956:10: this_NULL_8= RULE_NULL
                    {
                    this_NULL_8=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleLiteral4221); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1971:1: entryRulePrimitiveType returns [String current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final String entryRulePrimitiveType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveType = null;


        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1972:2: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1973:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType4267);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;

             current =iv_rulePrimitiveType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType4278); 

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
    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1980:1: rulePrimitiveType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'char' | kw= 'byte' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'float' | kw= 'double' ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1983:28: ( (kw= 'boolean' | kw= 'char' | kw= 'byte' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'float' | kw= 'double' ) )
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1984:1: (kw= 'boolean' | kw= 'char' | kw= 'byte' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'float' | kw= 'double' )
            {
            // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1984:1: (kw= 'boolean' | kw= 'char' | kw= 'byte' | kw= 'short' | kw= 'int' | kw= 'long' | kw= 'float' | kw= 'double' )
            int alt33=8;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt33=1;
                }
                break;
            case 60:
                {
                alt33=2;
                }
                break;
            case 61:
                {
                alt33=3;
                }
                break;
            case 62:
                {
                alt33=4;
                }
                break;
            case 63:
                {
                alt33=5;
                }
                break;
            case 64:
                {
                alt33=6;
                }
                break;
            case 65:
                {
                alt33=7;
                }
                break;
            case 66:
                {
                alt33=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1985:2: kw= 'boolean'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_rulePrimitiveType4316); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getBooleanKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1992:2: kw= 'char'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_rulePrimitiveType4335); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getCharKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:1999:2: kw= 'byte'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_rulePrimitiveType4354); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getByteKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2006:2: kw= 'short'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_rulePrimitiveType4373); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getShortKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2013:2: kw= 'int'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_rulePrimitiveType4392); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getIntKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2020:2: kw= 'long'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_rulePrimitiveType4411); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getLongKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2027:2: kw= 'float'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_rulePrimitiveType4430); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveTypeAccess().getFloatKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../com.jaspersoft.studio.editor.jrexpressions/src-gen/com/jaspersoft/studio/editor/jrexpressions/parser/antlr/internal/InternalJavaJRExpression.g:2034:2: kw= 'double'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_rulePrimitiveType4449); 

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
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA1_eotS =
        "\7\uffff";
    static final String DFA1_eofS =
        "\7\uffff";
    static final String DFA1_minS =
        "\2\4\1\uffff\1\5\1\uffff\1\4\1\5";
    static final String DFA1_maxS =
        "\1\41\1\102\1\uffff\1\27\1\uffff\1\4\1\27";
    static final String DFA1_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\2\uffff";
    static final String DFA1_specialS =
        "\7\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\1\uffff\3\2\1\1\2\uffff\1\2\14\uffff\11\2",
            "\1\3\1\uffff\4\2\2\uffff\1\2\7\uffff\1\2\4\uffff\11\2\31\uffff"+
            "\10\4",
            "",
            "\1\5\3\uffff\1\2\1\4\14\uffff\1\4",
            "",
            "\1\6",
            "\1\5\3\uffff\1\2\1\4\14\uffff\1\4"
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
    static final String DFA8_eotS =
        "\17\uffff";
    static final String DFA8_eofS =
        "\17\uffff";
    static final String DFA8_minS =
        "\1\4\10\12\1\5\2\uffff\1\4\1\uffff\1\5";
    static final String DFA8_maxS =
        "\1\102\11\27\2\uffff\1\4\1\uffff\1\27";
    static final String DFA8_acceptS =
        "\12\uffff\1\2\1\1\1\uffff\1\3\1\uffff";
    static final String DFA8_specialS =
        "\17\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\11\66\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10",
            "\1\13\14\uffff\1\12",
            "\1\13\14\uffff\1\12",
            "\1\13\14\uffff\1\12",
            "\1\13\14\uffff\1\12",
            "\1\13\14\uffff\1\12",
            "\1\13\14\uffff\1\12",
            "\1\13\14\uffff\1\12",
            "\1\13\14\uffff\1\12",
            "\1\14\4\uffff\1\15\14\uffff\1\12",
            "",
            "",
            "\1\16",
            "",
            "\1\14\4\uffff\1\15\14\uffff\1\12"
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "631:2: ( ( (lv_ptype_1_0= rulePrimitiveType ) ) | ( (lv_arrtype_2_0= ruleArrayType ) ) | ( (lv_clazztype_3_0= ruleClassOrInterfaceType ) ) )";
        }
    }
    static final String DFA16_eotS =
        "\6\uffff";
    static final String DFA16_eofS =
        "\2\uffff\1\4\2\uffff\1\4";
    static final String DFA16_minS =
        "\1\4\1\uffff\1\5\1\4\1\uffff\1\5";
    static final String DFA16_maxS =
        "\1\41\1\uffff\1\66\1\4\1\uffff\1\66";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\uffff";
    static final String DFA16_specialS =
        "\6\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\2\1\uffff\4\1\17\uffff\11\1",
            "",
            "\1\3\3\uffff\1\1\2\4\1\uffff\2\4\7\uffff\1\4\34\uffff\4\4",
            "\1\5",
            "",
            "\1\3\3\uffff\1\1\2\4\1\uffff\2\4\7\uffff\1\4\34\uffff\4\4"
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1180:1: (lv_target_2_1= ruleRelationalExpression | lv_target_2_2= ruleClassOrInterfaceType )";
        }
    }
    static final String DFA25_eotS =
        "\7\uffff";
    static final String DFA25_eofS =
        "\7\uffff";
    static final String DFA25_minS =
        "\1\24\1\4\1\5\1\uffff\1\4\1\uffff\1\5";
    static final String DFA25_maxS =
        "\1\24\1\102\1\27\1\uffff\1\4\1\uffff\1\27";
    static final String DFA25_acceptS =
        "\3\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String DFA25_specialS =
        "\7\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1",
            "\1\2\66\uffff\10\3",
            "\1\4\3\uffff\1\5\15\uffff\1\3",
            "",
            "\1\6",
            "",
            "\1\4\3\uffff\1\5\15\uffff\1\3"
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "1463:1: (this_ClassCreator_0= ruleClassCreator | this_ArrayCreator_1= ruleArrayCreator )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleModel131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreator_in_ruleExpression222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_in_ruleExpression251 = new BitSet(new long[]{0x00000003FE0013D0L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_ruleExpression273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodInvocation_in_entryRuleMethodInvocation310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodInvocation320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodName_in_ruleMethodInvocation366 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleArguments_in_ruleMethodInvocation387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodName_in_entryRuleMethodName423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethodName433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleMethodName476 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleMethodName498 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleMethodName522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseJRExpr_in_entryRuleBaseJRExpr563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseJRExpr573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FIELDTOKEN_in_ruleBaseJRExpr615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAMETERTOKEN_in_ruleBaseJRExpr643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLETOKEN_in_ruleBaseJRExpr671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArguments_in_entryRuleArguments712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArguments722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleArguments764 = new BitSet(new long[]{0x00000003FE1017D0L});
    public static final BitSet FOLLOW_ruleExpressionList_in_ruleArguments790 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleArguments808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionList_in_entryRuleExpressionList849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionList859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionList905 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleExpressionList923 = new BitSet(new long[]{0x00000003FE1013D0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpressionList949 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleBaseCommonExpression_in_entryRuleBaseCommonExpression987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseCommonExpression997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseJRExpr_in_ruleBaseCommonExpression1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleBaseCommonExpression1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleBaseCommonExpression1088 = new BitSet(new long[]{0x00000003FE1013D0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBaseCommonExpression1109 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleBaseCommonExpression1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethodInvocation_in_ruleBaseCommonExpression1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_in_entryRuleCast1182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCast1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleCast1234 = new BitSet(new long[]{0xF800000000000010L,0x0000000000000007L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_ruleCast1261 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleArrayType_in_ruleCast1288 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceType_in_ruleCast1315 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleCast1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConditionalExpression_in_entryRuleConditionalExpression1374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConditionalExpression1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestExpression_in_ruleConditionalExpression1431 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleConditionalExpression1443 = new BitSet(new long[]{0x00000003FE1013D0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleConditionalExpression1464 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleConditionalExpression1476 = new BitSet(new long[]{0x00000003FE1013D0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleConditionalExpression1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTestExpression_in_entryRuleTestExpression1535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTestExpression1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleTestExpression1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression1625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression1681 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_ruleOrExpression1694 = new BitSet(new long[]{0x00000003FE0013D0L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression1715 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression1753 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryCondExpression_in_ruleAndExpression1809 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleAndExpression1822 = new BitSet(new long[]{0x00000003FE0013D0L});
    public static final BitSet FOLLOW_rulePrimaryCondExpression_in_ruleAndExpression1843 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_rulePrimaryCondExpression_in_entryRulePrimaryCondExpression1881 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryCondExpression1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseBooleanExpr_in_rulePrimaryCondExpression1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseBooleanExpr_in_entryRuleBaseBooleanExpr1971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseBooleanExpr1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleBaseBooleanExpr2018 = new BitSet(new long[]{0x00000003FE0013D0L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_ruleBaseBooleanExpr2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression2076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualityExpression2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceOfExpression_in_ruleEqualityExpression2132 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_ruleEqualityExpression2145 = new BitSet(new long[]{0x00000003FE0013D0L});
    public static final BitSet FOLLOW_RULE_NOTEQUAL_in_ruleEqualityExpression2161 = new BitSet(new long[]{0x00000003FE0013D0L});
    public static final BitSet FOLLOW_ruleInstanceOfExpression_in_ruleEqualityExpression2182 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression2220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression2276 = new BitSet(new long[]{0x00000000000F0002L});
    public static final BitSet FOLLOW_ruleRelationalOp_in_ruleRelationalExpression2293 = new BitSet(new long[]{0x00000003FE0013D0L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression2313 = new BitSet(new long[]{0x00000000000F0002L});
    public static final BitSet FOLLOW_ruleInstanceOfExpression_in_entryRuleInstanceOfExpression2351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceOfExpression2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleInstanceOfExpression2407 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_RULE_INSTANCEOF_in_ruleInstanceOfExpression2419 = new BitSet(new long[]{0x00000003FE0013D0L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleInstanceOfExpression2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceType_in_ruleInstanceOfExpression2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression2501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression2557 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_55_in_ruleAdditiveExpression2571 = new BitSet(new long[]{0x00000003FE0013D0L});
    public static final BitSet FOLLOW_56_in_ruleAdditiveExpression2589 = new BitSet(new long[]{0x00000003FE0013D0L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression2611 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression2649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBaseCommonExpression_in_ruleMultiplicativeExpression2705 = new BitSet(new long[]{0x0600000000000022L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleMultiplicativeExpression2717 = new BitSet(new long[]{0x00000003FE0013D0L});
    public static final BitSet FOLLOW_ruleMethodInvocation_in_ruleMultiplicativeExpression2737 = new BitSet(new long[]{0x0600000000000022L});
    public static final BitSet FOLLOW_57_in_ruleMultiplicativeExpression2753 = new BitSet(new long[]{0x00000003FE0013D0L});
    public static final BitSet FOLLOW_58_in_ruleMultiplicativeExpression2771 = new BitSet(new long[]{0x00000003FE0013D0L});
    public static final BitSet FOLLOW_ruleBaseCommonExpression_in_ruleMultiplicativeExpression2793 = new BitSet(new long[]{0x0600000000000022L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleMultiplicativeExpression2805 = new BitSet(new long[]{0x00000003FE0013D0L});
    public static final BitSet FOLLOW_ruleMethodInvocation_in_ruleMultiplicativeExpression2825 = new BitSet(new long[]{0x0600000000000022L});
    public static final BitSet FOLLOW_ruleRelationalOp_in_entryRuleRelationalOp2866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalOp2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GT_in_ruleRelationalOp2917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_GTE_in_ruleRelationalOp2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LT_in_ruleRelationalOp2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LTE_in_ruleRelationalOp2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCreator_in_entryRuleCreator3040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCreator3050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassCreator_in_ruleCreator3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayCreator_in_ruleCreator3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassCreator_in_entryRuleClassCreator3159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassCreator3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEW_in_ruleClassCreator3205 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceType_in_ruleClassCreator3225 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleArguments_in_ruleClassCreator3246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayCreator_in_entryRuleArrayCreator3282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayCreator3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEW_in_ruleArrayCreator3328 = new BitSet(new long[]{0xF800000000000010L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleArrayType_in_ruleArrayCreator3348 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleArrayInitializer_in_ruleArrayCreator3369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayInitializer_in_entryRuleArrayInitializer3405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayInitializer3415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACE_in_ruleArrayInitializer3460 = new BitSet(new long[]{0x00000003FE501BD0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArrayInitializer3481 = new BitSet(new long[]{0x0000000000400800L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleArrayInitializer3493 = new BitSet(new long[]{0x00000003FE1013D0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArrayInitializer3513 = new BitSet(new long[]{0x0000000000400800L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleArrayInitializer3529 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RULE_RBRACE_in_ruleArrayInitializer3541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayType_in_entryRuleArrayType3578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayType3588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceType_in_ruleArrayType3635 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_ruleArrayType3662 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_ruleArrayType3675 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_RBRACKET_in_ruleArrayType3685 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleClassOrInterfaceType_in_entryRuleClassOrInterfaceType3722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassOrInterfaceType3732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleClassOrInterfaceType3777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleQualifiedName3873 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleQualifiedName3896 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleQualifiedName3918 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral3962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTLITERAL_in_ruleLiteral4013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LONGLITERAL_in_ruleLiteral4039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOATLITERAL_in_ruleLiteral4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLELITERAL_in_ruleLiteral4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHARLITERAL_in_ruleLiteral4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRINGLITERAL_in_ruleLiteral4143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TRUE_in_ruleLiteral4169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FALSE_in_ruleLiteral4195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleLiteral4221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType4267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType4278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulePrimitiveType4316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rulePrimitiveType4335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rulePrimitiveType4354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rulePrimitiveType4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rulePrimitiveType4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rulePrimitiveType4411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rulePrimitiveType4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rulePrimitiveType4449 = new BitSet(new long[]{0x0000000000000002L});

}