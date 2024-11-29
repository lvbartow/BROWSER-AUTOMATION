package org.project.browserautomation.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.project.browserautomation.services.BadGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBadParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_URL", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NAV_TO'", "'CHECK_EXISTS'", "'FROM'", "'VAR'", "'CLICK_ON'", "'POS'", "'IN'", "'VALUE'", "'CHECKBOX_ACTION'", "'ALL'", "'FILL_FIELD'", "'NAME'", "'STORE_ELEMENT'", "'PROP'", "'BUTTON'", "'LINK'", "'IMAGE'", "'COMBO'", "'TEXT'", "'TRUE'", "'FALSE'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int RULE_URL=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBadParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBadParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBadParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBad.g"; }



     	private BadGrammarAccess grammarAccess;

        public InternalBadParser(TokenStream input, BadGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected BadGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalBad.g:65:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalBad.g:65:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalBad.g:66:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalBad.g:72:1: ruleProgram returns [EObject current=null] : ( (lv_instructions_0_0= ruleInstruction ) )* ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_instructions_0_0 = null;



        	enterRule();

        try {
            // InternalBad.g:78:2: ( ( (lv_instructions_0_0= ruleInstruction ) )* )
            // InternalBad.g:79:2: ( (lv_instructions_0_0= ruleInstruction ) )*
            {
            // InternalBad.g:79:2: ( (lv_instructions_0_0= ruleInstruction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=13)||LA1_0==16||LA1_0==20||LA1_0==22||LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBad.g:80:3: (lv_instructions_0_0= ruleInstruction )
            	    {
            	    // InternalBad.g:80:3: (lv_instructions_0_0= ruleInstruction )
            	    // InternalBad.g:81:4: lv_instructions_0_0= ruleInstruction
            	    {

            	    				newCompositeNode(grammarAccess.getProgramAccess().getInstructionsInstructionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_instructions_0_0=ruleInstruction();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"instructions",
            	    					lv_instructions_0_0,
            	    					"org.project.browserautomation.Bad.Instruction");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleInstruction"
    // InternalBad.g:101:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalBad.g:101:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalBad.g:102:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalBad.g:108:1: ruleInstruction returns [EObject current=null] : (this_NavigateToUrl_0= ruleNavigateToUrl | this_ClickOn_1= ruleClickOn | this_FillField_2= ruleFillField | this_CheckExists_3= ruleCheckExists | this_CheckboxAction_4= ruleCheckboxAction | this_StoreElement_5= ruleStoreElement ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_NavigateToUrl_0 = null;

        EObject this_ClickOn_1 = null;

        EObject this_FillField_2 = null;

        EObject this_CheckExists_3 = null;

        EObject this_CheckboxAction_4 = null;

        EObject this_StoreElement_5 = null;



        	enterRule();

        try {
            // InternalBad.g:114:2: ( (this_NavigateToUrl_0= ruleNavigateToUrl | this_ClickOn_1= ruleClickOn | this_FillField_2= ruleFillField | this_CheckExists_3= ruleCheckExists | this_CheckboxAction_4= ruleCheckboxAction | this_StoreElement_5= ruleStoreElement ) )
            // InternalBad.g:115:2: (this_NavigateToUrl_0= ruleNavigateToUrl | this_ClickOn_1= ruleClickOn | this_FillField_2= ruleFillField | this_CheckExists_3= ruleCheckExists | this_CheckboxAction_4= ruleCheckboxAction | this_StoreElement_5= ruleStoreElement )
            {
            // InternalBad.g:115:2: (this_NavigateToUrl_0= ruleNavigateToUrl | this_ClickOn_1= ruleClickOn | this_FillField_2= ruleFillField | this_CheckExists_3= ruleCheckExists | this_CheckboxAction_4= ruleCheckboxAction | this_StoreElement_5= ruleStoreElement )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 22:
                {
                alt2=3;
                }
                break;
            case 13:
                {
                alt2=4;
                }
                break;
            case 20:
                {
                alt2=5;
                }
                break;
            case 24:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBad.g:116:3: this_NavigateToUrl_0= ruleNavigateToUrl
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getNavigateToUrlParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NavigateToUrl_0=ruleNavigateToUrl();

                    state._fsp--;


                    			current = this_NavigateToUrl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBad.g:125:3: this_ClickOn_1= ruleClickOn
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getClickOnParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClickOn_1=ruleClickOn();

                    state._fsp--;


                    			current = this_ClickOn_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalBad.g:134:3: this_FillField_2= ruleFillField
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getFillFieldParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FillField_2=ruleFillField();

                    state._fsp--;


                    			current = this_FillField_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalBad.g:143:3: this_CheckExists_3= ruleCheckExists
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getCheckExistsParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CheckExists_3=ruleCheckExists();

                    state._fsp--;


                    			current = this_CheckExists_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalBad.g:152:3: this_CheckboxAction_4= ruleCheckboxAction
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getCheckboxActionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_CheckboxAction_4=ruleCheckboxAction();

                    state._fsp--;


                    			current = this_CheckboxAction_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalBad.g:161:3: this_StoreElement_5= ruleStoreElement
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getStoreElementParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_StoreElement_5=ruleStoreElement();

                    state._fsp--;


                    			current = this_StoreElement_5;
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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleNavigateToUrl"
    // InternalBad.g:173:1: entryRuleNavigateToUrl returns [EObject current=null] : iv_ruleNavigateToUrl= ruleNavigateToUrl EOF ;
    public final EObject entryRuleNavigateToUrl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavigateToUrl = null;


        try {
            // InternalBad.g:173:54: (iv_ruleNavigateToUrl= ruleNavigateToUrl EOF )
            // InternalBad.g:174:2: iv_ruleNavigateToUrl= ruleNavigateToUrl EOF
            {
             newCompositeNode(grammarAccess.getNavigateToUrlRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNavigateToUrl=ruleNavigateToUrl();

            state._fsp--;

             current =iv_ruleNavigateToUrl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNavigateToUrl"


    // $ANTLR start "ruleNavigateToUrl"
    // InternalBad.g:180:1: ruleNavigateToUrl returns [EObject current=null] : (otherlv_0= 'NAV_TO' ( (lv_url_1_0= RULE_URL ) ) ) ;
    public final EObject ruleNavigateToUrl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;


        	enterRule();

        try {
            // InternalBad.g:186:2: ( (otherlv_0= 'NAV_TO' ( (lv_url_1_0= RULE_URL ) ) ) )
            // InternalBad.g:187:2: (otherlv_0= 'NAV_TO' ( (lv_url_1_0= RULE_URL ) ) )
            {
            // InternalBad.g:187:2: (otherlv_0= 'NAV_TO' ( (lv_url_1_0= RULE_URL ) ) )
            // InternalBad.g:188:3: otherlv_0= 'NAV_TO' ( (lv_url_1_0= RULE_URL ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getNavigateToUrlAccess().getNAV_TOKeyword_0());
            		
            // InternalBad.g:192:3: ( (lv_url_1_0= RULE_URL ) )
            // InternalBad.g:193:4: (lv_url_1_0= RULE_URL )
            {
            // InternalBad.g:193:4: (lv_url_1_0= RULE_URL )
            // InternalBad.g:194:5: lv_url_1_0= RULE_URL
            {
            lv_url_1_0=(Token)match(input,RULE_URL,FOLLOW_2); 

            					newLeafNode(lv_url_1_0, grammarAccess.getNavigateToUrlAccess().getUrlURLTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNavigateToUrlRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_1_0,
            						"org.project.browserautomation.Bad.URL");
            				

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
    // $ANTLR end "ruleNavigateToUrl"


    // $ANTLR start "entryRuleCheckExists"
    // InternalBad.g:214:1: entryRuleCheckExists returns [EObject current=null] : iv_ruleCheckExists= ruleCheckExists EOF ;
    public final EObject entryRuleCheckExists() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckExists = null;


        try {
            // InternalBad.g:214:52: (iv_ruleCheckExists= ruleCheckExists EOF )
            // InternalBad.g:215:2: iv_ruleCheckExists= ruleCheckExists EOF
            {
             newCompositeNode(grammarAccess.getCheckExistsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheckExists=ruleCheckExists();

            state._fsp--;

             current =iv_ruleCheckExists; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCheckExists"


    // $ANTLR start "ruleCheckExists"
    // InternalBad.g:221:1: ruleCheckExists returns [EObject current=null] : ( (otherlv_0= 'CHECK_EXISTS' ( (lv_type_1_0= ruleElemType ) ) ( (lv_id_2_0= RULE_STRING ) ) ) | (otherlv_3= 'CHECK_EXISTS' ( (lv_type_4_0= ruleElemType ) ) otherlv_5= 'FROM' otherlv_6= 'VAR' ( (lv_varname_7_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleCheckExists() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_varname_7_0=null;
        Enumerator lv_type_1_0 = null;

        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalBad.g:227:2: ( ( (otherlv_0= 'CHECK_EXISTS' ( (lv_type_1_0= ruleElemType ) ) ( (lv_id_2_0= RULE_STRING ) ) ) | (otherlv_3= 'CHECK_EXISTS' ( (lv_type_4_0= ruleElemType ) ) otherlv_5= 'FROM' otherlv_6= 'VAR' ( (lv_varname_7_0= RULE_STRING ) ) ) ) )
            // InternalBad.g:228:2: ( (otherlv_0= 'CHECK_EXISTS' ( (lv_type_1_0= ruleElemType ) ) ( (lv_id_2_0= RULE_STRING ) ) ) | (otherlv_3= 'CHECK_EXISTS' ( (lv_type_4_0= ruleElemType ) ) otherlv_5= 'FROM' otherlv_6= 'VAR' ( (lv_varname_7_0= RULE_STRING ) ) ) )
            {
            // InternalBad.g:228:2: ( (otherlv_0= 'CHECK_EXISTS' ( (lv_type_1_0= ruleElemType ) ) ( (lv_id_2_0= RULE_STRING ) ) ) | (otherlv_3= 'CHECK_EXISTS' ( (lv_type_4_0= ruleElemType ) ) otherlv_5= 'FROM' otherlv_6= 'VAR' ( (lv_varname_7_0= RULE_STRING ) ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==27) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==RULE_STRING) ) {
                        alt3=1;
                    }
                    else if ( (LA3_2==14) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA3_1==30) ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==14) ) {
                        alt3=2;
                    }
                    else if ( (LA3_3==RULE_STRING) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBad.g:229:3: (otherlv_0= 'CHECK_EXISTS' ( (lv_type_1_0= ruleElemType ) ) ( (lv_id_2_0= RULE_STRING ) ) )
                    {
                    // InternalBad.g:229:3: (otherlv_0= 'CHECK_EXISTS' ( (lv_type_1_0= ruleElemType ) ) ( (lv_id_2_0= RULE_STRING ) ) )
                    // InternalBad.g:230:4: otherlv_0= 'CHECK_EXISTS' ( (lv_type_1_0= ruleElemType ) ) ( (lv_id_2_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getCheckExistsAccess().getCHECK_EXISTSKeyword_0_0());
                    			
                    // InternalBad.g:234:4: ( (lv_type_1_0= ruleElemType ) )
                    // InternalBad.g:235:5: (lv_type_1_0= ruleElemType )
                    {
                    // InternalBad.g:235:5: (lv_type_1_0= ruleElemType )
                    // InternalBad.g:236:6: lv_type_1_0= ruleElemType
                    {

                    						newCompositeNode(grammarAccess.getCheckExistsAccess().getTypeElemTypeEnumRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_type_1_0=ruleElemType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCheckExistsRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_1_0,
                    							"org.project.browserautomation.Bad.ElemType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBad.g:253:4: ( (lv_id_2_0= RULE_STRING ) )
                    // InternalBad.g:254:5: (lv_id_2_0= RULE_STRING )
                    {
                    // InternalBad.g:254:5: (lv_id_2_0= RULE_STRING )
                    // InternalBad.g:255:6: lv_id_2_0= RULE_STRING
                    {
                    lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_id_2_0, grammarAccess.getCheckExistsAccess().getIdSTRINGTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCheckExistsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"id",
                    							lv_id_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBad.g:273:3: (otherlv_3= 'CHECK_EXISTS' ( (lv_type_4_0= ruleElemType ) ) otherlv_5= 'FROM' otherlv_6= 'VAR' ( (lv_varname_7_0= RULE_STRING ) ) )
                    {
                    // InternalBad.g:273:3: (otherlv_3= 'CHECK_EXISTS' ( (lv_type_4_0= ruleElemType ) ) otherlv_5= 'FROM' otherlv_6= 'VAR' ( (lv_varname_7_0= RULE_STRING ) ) )
                    // InternalBad.g:274:4: otherlv_3= 'CHECK_EXISTS' ( (lv_type_4_0= ruleElemType ) ) otherlv_5= 'FROM' otherlv_6= 'VAR' ( (lv_varname_7_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getCheckExistsAccess().getCHECK_EXISTSKeyword_1_0());
                    			
                    // InternalBad.g:278:4: ( (lv_type_4_0= ruleElemType ) )
                    // InternalBad.g:279:5: (lv_type_4_0= ruleElemType )
                    {
                    // InternalBad.g:279:5: (lv_type_4_0= ruleElemType )
                    // InternalBad.g:280:6: lv_type_4_0= ruleElemType
                    {

                    						newCompositeNode(grammarAccess.getCheckExistsAccess().getTypeElemTypeEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_type_4_0=ruleElemType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCheckExistsRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"org.project.browserautomation.Bad.ElemType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getCheckExistsAccess().getFROMKeyword_1_2());
                    			
                    otherlv_6=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getCheckExistsAccess().getVARKeyword_1_3());
                    			
                    // InternalBad.g:305:4: ( (lv_varname_7_0= RULE_STRING ) )
                    // InternalBad.g:306:5: (lv_varname_7_0= RULE_STRING )
                    {
                    // InternalBad.g:306:5: (lv_varname_7_0= RULE_STRING )
                    // InternalBad.g:307:6: lv_varname_7_0= RULE_STRING
                    {
                    lv_varname_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_varname_7_0, grammarAccess.getCheckExistsAccess().getVarnameSTRINGTerminalRuleCall_1_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCheckExistsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"varname",
                    							lv_varname_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

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
    // $ANTLR end "ruleCheckExists"


    // $ANTLR start "entryRuleClickOn"
    // InternalBad.g:328:1: entryRuleClickOn returns [EObject current=null] : iv_ruleClickOn= ruleClickOn EOF ;
    public final EObject entryRuleClickOn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClickOn = null;


        try {
            // InternalBad.g:328:48: (iv_ruleClickOn= ruleClickOn EOF )
            // InternalBad.g:329:2: iv_ruleClickOn= ruleClickOn EOF
            {
             newCompositeNode(grammarAccess.getClickOnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClickOn=ruleClickOn();

            state._fsp--;

             current =iv_ruleClickOn; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClickOn"


    // $ANTLR start "ruleClickOn"
    // InternalBad.g:335:1: ruleClickOn returns [EObject current=null] : ( (otherlv_0= 'CLICK_ON' ( (lv_type_1_0= ruleClickType ) ) ( ( (lv_id_2_0= RULE_STRING ) ) | ( (otherlv_3= 'VAR' )+ ( (lv_varname_4_0= RULE_STRING ) ) ) ) ) | (otherlv_5= 'CLICK_ON' ( (lv_type_6_0= ruleClickType ) ) otherlv_7= 'POS' ( (lv_pos_index_8_0= RULE_INT ) ) otherlv_9= 'IN' ( (lv_id_10_0= RULE_STRING ) ) ) | (otherlv_11= 'CLICK_ON' ( (lv_type_12_0= ruleClickType ) ) ( (lv_id_combo_13_0= RULE_STRING ) ) otherlv_14= 'VALUE' ( (lv_to_select_15_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleClickOn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        Token lv_varname_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_pos_index_8_0=null;
        Token otherlv_9=null;
        Token lv_id_10_0=null;
        Token otherlv_11=null;
        Token lv_id_combo_13_0=null;
        Token otherlv_14=null;
        Token lv_to_select_15_0=null;
        Enumerator lv_type_1_0 = null;

        Enumerator lv_type_6_0 = null;

        Enumerator lv_type_12_0 = null;



        	enterRule();

        try {
            // InternalBad.g:341:2: ( ( (otherlv_0= 'CLICK_ON' ( (lv_type_1_0= ruleClickType ) ) ( ( (lv_id_2_0= RULE_STRING ) ) | ( (otherlv_3= 'VAR' )+ ( (lv_varname_4_0= RULE_STRING ) ) ) ) ) | (otherlv_5= 'CLICK_ON' ( (lv_type_6_0= ruleClickType ) ) otherlv_7= 'POS' ( (lv_pos_index_8_0= RULE_INT ) ) otherlv_9= 'IN' ( (lv_id_10_0= RULE_STRING ) ) ) | (otherlv_11= 'CLICK_ON' ( (lv_type_12_0= ruleClickType ) ) ( (lv_id_combo_13_0= RULE_STRING ) ) otherlv_14= 'VALUE' ( (lv_to_select_15_0= RULE_STRING ) ) ) ) )
            // InternalBad.g:342:2: ( (otherlv_0= 'CLICK_ON' ( (lv_type_1_0= ruleClickType ) ) ( ( (lv_id_2_0= RULE_STRING ) ) | ( (otherlv_3= 'VAR' )+ ( (lv_varname_4_0= RULE_STRING ) ) ) ) ) | (otherlv_5= 'CLICK_ON' ( (lv_type_6_0= ruleClickType ) ) otherlv_7= 'POS' ( (lv_pos_index_8_0= RULE_INT ) ) otherlv_9= 'IN' ( (lv_id_10_0= RULE_STRING ) ) ) | (otherlv_11= 'CLICK_ON' ( (lv_type_12_0= ruleClickType ) ) ( (lv_id_combo_13_0= RULE_STRING ) ) otherlv_14= 'VALUE' ( (lv_to_select_15_0= RULE_STRING ) ) ) )
            {
            // InternalBad.g:342:2: ( (otherlv_0= 'CLICK_ON' ( (lv_type_1_0= ruleClickType ) ) ( ( (lv_id_2_0= RULE_STRING ) ) | ( (otherlv_3= 'VAR' )+ ( (lv_varname_4_0= RULE_STRING ) ) ) ) ) | (otherlv_5= 'CLICK_ON' ( (lv_type_6_0= ruleClickType ) ) otherlv_7= 'POS' ( (lv_pos_index_8_0= RULE_INT ) ) otherlv_9= 'IN' ( (lv_id_10_0= RULE_STRING ) ) ) | (otherlv_11= 'CLICK_ON' ( (lv_type_12_0= ruleClickType ) ) ( (lv_id_combo_13_0= RULE_STRING ) ) otherlv_14= 'VALUE' ( (lv_to_select_15_0= RULE_STRING ) ) ) )
            int alt6=3;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalBad.g:343:3: (otherlv_0= 'CLICK_ON' ( (lv_type_1_0= ruleClickType ) ) ( ( (lv_id_2_0= RULE_STRING ) ) | ( (otherlv_3= 'VAR' )+ ( (lv_varname_4_0= RULE_STRING ) ) ) ) )
                    {
                    // InternalBad.g:343:3: (otherlv_0= 'CLICK_ON' ( (lv_type_1_0= ruleClickType ) ) ( ( (lv_id_2_0= RULE_STRING ) ) | ( (otherlv_3= 'VAR' )+ ( (lv_varname_4_0= RULE_STRING ) ) ) ) )
                    // InternalBad.g:344:4: otherlv_0= 'CLICK_ON' ( (lv_type_1_0= ruleClickType ) ) ( ( (lv_id_2_0= RULE_STRING ) ) | ( (otherlv_3= 'VAR' )+ ( (lv_varname_4_0= RULE_STRING ) ) ) )
                    {
                    otherlv_0=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getClickOnAccess().getCLICK_ONKeyword_0_0());
                    			
                    // InternalBad.g:348:4: ( (lv_type_1_0= ruleClickType ) )
                    // InternalBad.g:349:5: (lv_type_1_0= ruleClickType )
                    {
                    // InternalBad.g:349:5: (lv_type_1_0= ruleClickType )
                    // InternalBad.g:350:6: lv_type_1_0= ruleClickType
                    {

                    						newCompositeNode(grammarAccess.getClickOnAccess().getTypeClickTypeEnumRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_type_1_0=ruleClickType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClickOnRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_1_0,
                    							"org.project.browserautomation.Bad.ClickType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBad.g:367:4: ( ( (lv_id_2_0= RULE_STRING ) ) | ( (otherlv_3= 'VAR' )+ ( (lv_varname_4_0= RULE_STRING ) ) ) )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_STRING) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==15) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalBad.g:368:5: ( (lv_id_2_0= RULE_STRING ) )
                            {
                            // InternalBad.g:368:5: ( (lv_id_2_0= RULE_STRING ) )
                            // InternalBad.g:369:6: (lv_id_2_0= RULE_STRING )
                            {
                            // InternalBad.g:369:6: (lv_id_2_0= RULE_STRING )
                            // InternalBad.g:370:7: lv_id_2_0= RULE_STRING
                            {
                            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                            							newLeafNode(lv_id_2_0, grammarAccess.getClickOnAccess().getIdSTRINGTerminalRuleCall_0_2_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getClickOnRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"id",
                            								lv_id_2_0,
                            								"org.eclipse.xtext.common.Terminals.STRING");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalBad.g:387:5: ( (otherlv_3= 'VAR' )+ ( (lv_varname_4_0= RULE_STRING ) ) )
                            {
                            // InternalBad.g:387:5: ( (otherlv_3= 'VAR' )+ ( (lv_varname_4_0= RULE_STRING ) ) )
                            // InternalBad.g:388:6: (otherlv_3= 'VAR' )+ ( (lv_varname_4_0= RULE_STRING ) )
                            {
                            // InternalBad.g:388:6: (otherlv_3= 'VAR' )+
                            int cnt4=0;
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( (LA4_0==15) ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // InternalBad.g:389:7: otherlv_3= 'VAR'
                            	    {
                            	    otherlv_3=(Token)match(input,15,FOLLOW_10); 

                            	    							newLeafNode(otherlv_3, grammarAccess.getClickOnAccess().getVARKeyword_0_2_1_0());
                            	    						

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt4 >= 1 ) break loop4;
                                        EarlyExitException eee =
                                            new EarlyExitException(4, input);
                                        throw eee;
                                }
                                cnt4++;
                            } while (true);

                            // InternalBad.g:394:6: ( (lv_varname_4_0= RULE_STRING ) )
                            // InternalBad.g:395:7: (lv_varname_4_0= RULE_STRING )
                            {
                            // InternalBad.g:395:7: (lv_varname_4_0= RULE_STRING )
                            // InternalBad.g:396:8: lv_varname_4_0= RULE_STRING
                            {
                            lv_varname_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                            								newLeafNode(lv_varname_4_0, grammarAccess.getClickOnAccess().getVarnameSTRINGTerminalRuleCall_0_2_1_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getClickOnRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"varname",
                            									lv_varname_4_0,
                            									"org.eclipse.xtext.common.Terminals.STRING");
                            							

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBad.g:416:3: (otherlv_5= 'CLICK_ON' ( (lv_type_6_0= ruleClickType ) ) otherlv_7= 'POS' ( (lv_pos_index_8_0= RULE_INT ) ) otherlv_9= 'IN' ( (lv_id_10_0= RULE_STRING ) ) )
                    {
                    // InternalBad.g:416:3: (otherlv_5= 'CLICK_ON' ( (lv_type_6_0= ruleClickType ) ) otherlv_7= 'POS' ( (lv_pos_index_8_0= RULE_INT ) ) otherlv_9= 'IN' ( (lv_id_10_0= RULE_STRING ) ) )
                    // InternalBad.g:417:4: otherlv_5= 'CLICK_ON' ( (lv_type_6_0= ruleClickType ) ) otherlv_7= 'POS' ( (lv_pos_index_8_0= RULE_INT ) ) otherlv_9= 'IN' ( (lv_id_10_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getClickOnAccess().getCLICK_ONKeyword_1_0());
                    			
                    // InternalBad.g:421:4: ( (lv_type_6_0= ruleClickType ) )
                    // InternalBad.g:422:5: (lv_type_6_0= ruleClickType )
                    {
                    // InternalBad.g:422:5: (lv_type_6_0= ruleClickType )
                    // InternalBad.g:423:6: lv_type_6_0= ruleClickType
                    {

                    						newCompositeNode(grammarAccess.getClickOnAccess().getTypeClickTypeEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_type_6_0=ruleClickType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClickOnRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_6_0,
                    							"org.project.browserautomation.Bad.ClickType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getClickOnAccess().getPOSKeyword_1_2());
                    			
                    // InternalBad.g:444:4: ( (lv_pos_index_8_0= RULE_INT ) )
                    // InternalBad.g:445:5: (lv_pos_index_8_0= RULE_INT )
                    {
                    // InternalBad.g:445:5: (lv_pos_index_8_0= RULE_INT )
                    // InternalBad.g:446:6: lv_pos_index_8_0= RULE_INT
                    {
                    lv_pos_index_8_0=(Token)match(input,RULE_INT,FOLLOW_13); 

                    						newLeafNode(lv_pos_index_8_0, grammarAccess.getClickOnAccess().getPos_indexINTTerminalRuleCall_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClickOnRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"pos_index",
                    							lv_pos_index_8_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getClickOnAccess().getINKeyword_1_4());
                    			
                    // InternalBad.g:466:4: ( (lv_id_10_0= RULE_STRING ) )
                    // InternalBad.g:467:5: (lv_id_10_0= RULE_STRING )
                    {
                    // InternalBad.g:467:5: (lv_id_10_0= RULE_STRING )
                    // InternalBad.g:468:6: lv_id_10_0= RULE_STRING
                    {
                    lv_id_10_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_id_10_0, grammarAccess.getClickOnAccess().getIdSTRINGTerminalRuleCall_1_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClickOnRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"id",
                    							lv_id_10_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBad.g:486:3: (otherlv_11= 'CLICK_ON' ( (lv_type_12_0= ruleClickType ) ) ( (lv_id_combo_13_0= RULE_STRING ) ) otherlv_14= 'VALUE' ( (lv_to_select_15_0= RULE_STRING ) ) )
                    {
                    // InternalBad.g:486:3: (otherlv_11= 'CLICK_ON' ( (lv_type_12_0= ruleClickType ) ) ( (lv_id_combo_13_0= RULE_STRING ) ) otherlv_14= 'VALUE' ( (lv_to_select_15_0= RULE_STRING ) ) )
                    // InternalBad.g:487:4: otherlv_11= 'CLICK_ON' ( (lv_type_12_0= ruleClickType ) ) ( (lv_id_combo_13_0= RULE_STRING ) ) otherlv_14= 'VALUE' ( (lv_to_select_15_0= RULE_STRING ) )
                    {
                    otherlv_11=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getClickOnAccess().getCLICK_ONKeyword_2_0());
                    			
                    // InternalBad.g:491:4: ( (lv_type_12_0= ruleClickType ) )
                    // InternalBad.g:492:5: (lv_type_12_0= ruleClickType )
                    {
                    // InternalBad.g:492:5: (lv_type_12_0= ruleClickType )
                    // InternalBad.g:493:6: lv_type_12_0= ruleClickType
                    {

                    						newCompositeNode(grammarAccess.getClickOnAccess().getTypeClickTypeEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_type_12_0=ruleClickType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClickOnRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_12_0,
                    							"org.project.browserautomation.Bad.ClickType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBad.g:510:4: ( (lv_id_combo_13_0= RULE_STRING ) )
                    // InternalBad.g:511:5: (lv_id_combo_13_0= RULE_STRING )
                    {
                    // InternalBad.g:511:5: (lv_id_combo_13_0= RULE_STRING )
                    // InternalBad.g:512:6: lv_id_combo_13_0= RULE_STRING
                    {
                    lv_id_combo_13_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

                    						newLeafNode(lv_id_combo_13_0, grammarAccess.getClickOnAccess().getId_comboSTRINGTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClickOnRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"id_combo",
                    							lv_id_combo_13_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_14, grammarAccess.getClickOnAccess().getVALUEKeyword_2_3());
                    			
                    // InternalBad.g:532:4: ( (lv_to_select_15_0= RULE_STRING ) )
                    // InternalBad.g:533:5: (lv_to_select_15_0= RULE_STRING )
                    {
                    // InternalBad.g:533:5: (lv_to_select_15_0= RULE_STRING )
                    // InternalBad.g:534:6: lv_to_select_15_0= RULE_STRING
                    {
                    lv_to_select_15_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_to_select_15_0, grammarAccess.getClickOnAccess().getTo_selectSTRINGTerminalRuleCall_2_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClickOnRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"to_select",
                    							lv_to_select_15_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

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
    // $ANTLR end "ruleClickOn"


    // $ANTLR start "entryRuleCheckboxAction"
    // InternalBad.g:555:1: entryRuleCheckboxAction returns [EObject current=null] : iv_ruleCheckboxAction= ruleCheckboxAction EOF ;
    public final EObject entryRuleCheckboxAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheckboxAction = null;


        try {
            // InternalBad.g:555:55: (iv_ruleCheckboxAction= ruleCheckboxAction EOF )
            // InternalBad.g:556:2: iv_ruleCheckboxAction= ruleCheckboxAction EOF
            {
             newCompositeNode(grammarAccess.getCheckboxActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCheckboxAction=ruleCheckboxAction();

            state._fsp--;

             current =iv_ruleCheckboxAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCheckboxAction"


    // $ANTLR start "ruleCheckboxAction"
    // InternalBad.g:562:1: ruleCheckboxAction returns [EObject current=null] : (otherlv_0= 'CHECKBOX_ACTION' ( (lv_bool_1_0= ruleBoolString ) ) (otherlv_2= 'ALL' | ( (lv_actions_3_0= RULE_STRING ) )* ) ) ;
    public final EObject ruleCheckboxAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_actions_3_0=null;
        Enumerator lv_bool_1_0 = null;



        	enterRule();

        try {
            // InternalBad.g:568:2: ( (otherlv_0= 'CHECKBOX_ACTION' ( (lv_bool_1_0= ruleBoolString ) ) (otherlv_2= 'ALL' | ( (lv_actions_3_0= RULE_STRING ) )* ) ) )
            // InternalBad.g:569:2: (otherlv_0= 'CHECKBOX_ACTION' ( (lv_bool_1_0= ruleBoolString ) ) (otherlv_2= 'ALL' | ( (lv_actions_3_0= RULE_STRING ) )* ) )
            {
            // InternalBad.g:569:2: (otherlv_0= 'CHECKBOX_ACTION' ( (lv_bool_1_0= ruleBoolString ) ) (otherlv_2= 'ALL' | ( (lv_actions_3_0= RULE_STRING ) )* ) )
            // InternalBad.g:570:3: otherlv_0= 'CHECKBOX_ACTION' ( (lv_bool_1_0= ruleBoolString ) ) (otherlv_2= 'ALL' | ( (lv_actions_3_0= RULE_STRING ) )* )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getCheckboxActionAccess().getCHECKBOX_ACTIONKeyword_0());
            		
            // InternalBad.g:574:3: ( (lv_bool_1_0= ruleBoolString ) )
            // InternalBad.g:575:4: (lv_bool_1_0= ruleBoolString )
            {
            // InternalBad.g:575:4: (lv_bool_1_0= ruleBoolString )
            // InternalBad.g:576:5: lv_bool_1_0= ruleBoolString
            {

            					newCompositeNode(grammarAccess.getCheckboxActionAccess().getBoolBoolStringEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_bool_1_0=ruleBoolString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCheckboxActionRule());
            					}
            					set(
            						current,
            						"bool",
            						lv_bool_1_0,
            						"org.project.browserautomation.Bad.BoolString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBad.g:593:3: (otherlv_2= 'ALL' | ( (lv_actions_3_0= RULE_STRING ) )* )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==EOF||LA8_0==RULE_STRING||(LA8_0>=12 && LA8_0<=13)||LA8_0==16||LA8_0==20||LA8_0==22||LA8_0==24) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalBad.g:594:4: otherlv_2= 'ALL'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getCheckboxActionAccess().getALLKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalBad.g:599:4: ( (lv_actions_3_0= RULE_STRING ) )*
                    {
                    // InternalBad.g:599:4: ( (lv_actions_3_0= RULE_STRING ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_STRING) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalBad.g:600:5: (lv_actions_3_0= RULE_STRING )
                    	    {
                    	    // InternalBad.g:600:5: (lv_actions_3_0= RULE_STRING )
                    	    // InternalBad.g:601:6: lv_actions_3_0= RULE_STRING
                    	    {
                    	    lv_actions_3_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    	    						newLeafNode(lv_actions_3_0, grammarAccess.getCheckboxActionAccess().getActionsSTRINGTerminalRuleCall_2_1_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getCheckboxActionRule());
                    	    						}
                    	    						addWithLastConsumed(
                    	    							current,
                    	    							"actions",
                    	    							lv_actions_3_0,
                    	    							"org.eclipse.xtext.common.Terminals.STRING");
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


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
    // $ANTLR end "ruleCheckboxAction"


    // $ANTLR start "entryRuleFillField"
    // InternalBad.g:622:1: entryRuleFillField returns [EObject current=null] : iv_ruleFillField= ruleFillField EOF ;
    public final EObject entryRuleFillField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFillField = null;


        try {
            // InternalBad.g:622:50: (iv_ruleFillField= ruleFillField EOF )
            // InternalBad.g:623:2: iv_ruleFillField= ruleFillField EOF
            {
             newCompositeNode(grammarAccess.getFillFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFillField=ruleFillField();

            state._fsp--;

             current =iv_ruleFillField; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFillField"


    // $ANTLR start "ruleFillField"
    // InternalBad.g:629:1: ruleFillField returns [EObject current=null] : (otherlv_0= 'FILL_FIELD' otherlv_1= 'NAME' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= 'VALUE' ( ( (lv_value_4_0= RULE_STRING ) ) | (otherlv_5= 'FROM' otherlv_6= 'VAR' ( (lv_varname_7_0= RULE_STRING ) ) ) ) ) ;
    public final EObject ruleFillField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_varname_7_0=null;


        	enterRule();

        try {
            // InternalBad.g:635:2: ( (otherlv_0= 'FILL_FIELD' otherlv_1= 'NAME' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= 'VALUE' ( ( (lv_value_4_0= RULE_STRING ) ) | (otherlv_5= 'FROM' otherlv_6= 'VAR' ( (lv_varname_7_0= RULE_STRING ) ) ) ) ) )
            // InternalBad.g:636:2: (otherlv_0= 'FILL_FIELD' otherlv_1= 'NAME' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= 'VALUE' ( ( (lv_value_4_0= RULE_STRING ) ) | (otherlv_5= 'FROM' otherlv_6= 'VAR' ( (lv_varname_7_0= RULE_STRING ) ) ) ) )
            {
            // InternalBad.g:636:2: (otherlv_0= 'FILL_FIELD' otherlv_1= 'NAME' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= 'VALUE' ( ( (lv_value_4_0= RULE_STRING ) ) | (otherlv_5= 'FROM' otherlv_6= 'VAR' ( (lv_varname_7_0= RULE_STRING ) ) ) ) )
            // InternalBad.g:637:3: otherlv_0= 'FILL_FIELD' otherlv_1= 'NAME' ( (lv_id_2_0= RULE_STRING ) ) otherlv_3= 'VALUE' ( ( (lv_value_4_0= RULE_STRING ) ) | (otherlv_5= 'FROM' otherlv_6= 'VAR' ( (lv_varname_7_0= RULE_STRING ) ) ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getFillFieldAccess().getFILL_FIELDKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getFillFieldAccess().getNAMEKeyword_1());
            		
            // InternalBad.g:645:3: ( (lv_id_2_0= RULE_STRING ) )
            // InternalBad.g:646:4: (lv_id_2_0= RULE_STRING )
            {
            // InternalBad.g:646:4: (lv_id_2_0= RULE_STRING )
            // InternalBad.g:647:5: lv_id_2_0= RULE_STRING
            {
            lv_id_2_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_id_2_0, grammarAccess.getFillFieldAccess().getIdSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFillFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getFillFieldAccess().getVALUEKeyword_3());
            		
            // InternalBad.g:667:3: ( ( (lv_value_4_0= RULE_STRING ) ) | (otherlv_5= 'FROM' otherlv_6= 'VAR' ( (lv_varname_7_0= RULE_STRING ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==14) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalBad.g:668:4: ( (lv_value_4_0= RULE_STRING ) )
                    {
                    // InternalBad.g:668:4: ( (lv_value_4_0= RULE_STRING ) )
                    // InternalBad.g:669:5: (lv_value_4_0= RULE_STRING )
                    {
                    // InternalBad.g:669:5: (lv_value_4_0= RULE_STRING )
                    // InternalBad.g:670:6: lv_value_4_0= RULE_STRING
                    {
                    lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_4_0, grammarAccess.getFillFieldAccess().getValueSTRINGTerminalRuleCall_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFillFieldRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBad.g:687:4: (otherlv_5= 'FROM' otherlv_6= 'VAR' ( (lv_varname_7_0= RULE_STRING ) ) )
                    {
                    // InternalBad.g:687:4: (otherlv_5= 'FROM' otherlv_6= 'VAR' ( (lv_varname_7_0= RULE_STRING ) ) )
                    // InternalBad.g:688:5: otherlv_5= 'FROM' otherlv_6= 'VAR' ( (lv_varname_7_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_8); 

                    					newLeafNode(otherlv_5, grammarAccess.getFillFieldAccess().getFROMKeyword_4_1_0());
                    				
                    otherlv_6=(Token)match(input,15,FOLLOW_6); 

                    					newLeafNode(otherlv_6, grammarAccess.getFillFieldAccess().getVARKeyword_4_1_1());
                    				
                    // InternalBad.g:696:5: ( (lv_varname_7_0= RULE_STRING ) )
                    // InternalBad.g:697:6: (lv_varname_7_0= RULE_STRING )
                    {
                    // InternalBad.g:697:6: (lv_varname_7_0= RULE_STRING )
                    // InternalBad.g:698:7: lv_varname_7_0= RULE_STRING
                    {
                    lv_varname_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    							newLeafNode(lv_varname_7_0, grammarAccess.getFillFieldAccess().getVarnameSTRINGTerminalRuleCall_4_1_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFillFieldRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"varname",
                    								lv_varname_7_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

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
    // $ANTLR end "ruleFillField"


    // $ANTLR start "entryRuleStoreElement"
    // InternalBad.g:720:1: entryRuleStoreElement returns [EObject current=null] : iv_ruleStoreElement= ruleStoreElement EOF ;
    public final EObject entryRuleStoreElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStoreElement = null;


        try {
            // InternalBad.g:720:53: (iv_ruleStoreElement= ruleStoreElement EOF )
            // InternalBad.g:721:2: iv_ruleStoreElement= ruleStoreElement EOF
            {
             newCompositeNode(grammarAccess.getStoreElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStoreElement=ruleStoreElement();

            state._fsp--;

             current =iv_ruleStoreElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStoreElement"


    // $ANTLR start "ruleStoreElement"
    // InternalBad.g:727:1: ruleStoreElement returns [EObject current=null] : ( (otherlv_0= 'STORE_ELEMENT' otherlv_1= 'POS' ( (lv_pos_index_2_0= RULE_INT ) ) otherlv_3= 'FROM' ( (lv_id_from_4_0= RULE_STRING ) ) otherlv_5= 'PROP' ( (lv_prop_name_6_0= RULE_STRING ) ) otherlv_7= 'IN' otherlv_8= 'VAR' ( (lv_varname_9_0= RULE_STRING ) ) ) | (otherlv_10= 'STORE_ELEMENT' otherlv_11= 'FROM' ( (lv_id_from_12_0= RULE_STRING ) ) otherlv_13= 'PROP' ( (lv_prop_name_14_0= RULE_STRING ) ) otherlv_15= 'IN' otherlv_16= 'VAR' ( (lv_varname_17_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleStoreElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_pos_index_2_0=null;
        Token otherlv_3=null;
        Token lv_id_from_4_0=null;
        Token otherlv_5=null;
        Token lv_prop_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_varname_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_id_from_12_0=null;
        Token otherlv_13=null;
        Token lv_prop_name_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_varname_17_0=null;


        	enterRule();

        try {
            // InternalBad.g:733:2: ( ( (otherlv_0= 'STORE_ELEMENT' otherlv_1= 'POS' ( (lv_pos_index_2_0= RULE_INT ) ) otherlv_3= 'FROM' ( (lv_id_from_4_0= RULE_STRING ) ) otherlv_5= 'PROP' ( (lv_prop_name_6_0= RULE_STRING ) ) otherlv_7= 'IN' otherlv_8= 'VAR' ( (lv_varname_9_0= RULE_STRING ) ) ) | (otherlv_10= 'STORE_ELEMENT' otherlv_11= 'FROM' ( (lv_id_from_12_0= RULE_STRING ) ) otherlv_13= 'PROP' ( (lv_prop_name_14_0= RULE_STRING ) ) otherlv_15= 'IN' otherlv_16= 'VAR' ( (lv_varname_17_0= RULE_STRING ) ) ) ) )
            // InternalBad.g:734:2: ( (otherlv_0= 'STORE_ELEMENT' otherlv_1= 'POS' ( (lv_pos_index_2_0= RULE_INT ) ) otherlv_3= 'FROM' ( (lv_id_from_4_0= RULE_STRING ) ) otherlv_5= 'PROP' ( (lv_prop_name_6_0= RULE_STRING ) ) otherlv_7= 'IN' otherlv_8= 'VAR' ( (lv_varname_9_0= RULE_STRING ) ) ) | (otherlv_10= 'STORE_ELEMENT' otherlv_11= 'FROM' ( (lv_id_from_12_0= RULE_STRING ) ) otherlv_13= 'PROP' ( (lv_prop_name_14_0= RULE_STRING ) ) otherlv_15= 'IN' otherlv_16= 'VAR' ( (lv_varname_17_0= RULE_STRING ) ) ) )
            {
            // InternalBad.g:734:2: ( (otherlv_0= 'STORE_ELEMENT' otherlv_1= 'POS' ( (lv_pos_index_2_0= RULE_INT ) ) otherlv_3= 'FROM' ( (lv_id_from_4_0= RULE_STRING ) ) otherlv_5= 'PROP' ( (lv_prop_name_6_0= RULE_STRING ) ) otherlv_7= 'IN' otherlv_8= 'VAR' ( (lv_varname_9_0= RULE_STRING ) ) ) | (otherlv_10= 'STORE_ELEMENT' otherlv_11= 'FROM' ( (lv_id_from_12_0= RULE_STRING ) ) otherlv_13= 'PROP' ( (lv_prop_name_14_0= RULE_STRING ) ) otherlv_15= 'IN' otherlv_16= 'VAR' ( (lv_varname_17_0= RULE_STRING ) ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==14) ) {
                    alt10=2;
                }
                else if ( (LA10_1==17) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalBad.g:735:3: (otherlv_0= 'STORE_ELEMENT' otherlv_1= 'POS' ( (lv_pos_index_2_0= RULE_INT ) ) otherlv_3= 'FROM' ( (lv_id_from_4_0= RULE_STRING ) ) otherlv_5= 'PROP' ( (lv_prop_name_6_0= RULE_STRING ) ) otherlv_7= 'IN' otherlv_8= 'VAR' ( (lv_varname_9_0= RULE_STRING ) ) )
                    {
                    // InternalBad.g:735:3: (otherlv_0= 'STORE_ELEMENT' otherlv_1= 'POS' ( (lv_pos_index_2_0= RULE_INT ) ) otherlv_3= 'FROM' ( (lv_id_from_4_0= RULE_STRING ) ) otherlv_5= 'PROP' ( (lv_prop_name_6_0= RULE_STRING ) ) otherlv_7= 'IN' otherlv_8= 'VAR' ( (lv_varname_9_0= RULE_STRING ) ) )
                    // InternalBad.g:736:4: otherlv_0= 'STORE_ELEMENT' otherlv_1= 'POS' ( (lv_pos_index_2_0= RULE_INT ) ) otherlv_3= 'FROM' ( (lv_id_from_4_0= RULE_STRING ) ) otherlv_5= 'PROP' ( (lv_prop_name_6_0= RULE_STRING ) ) otherlv_7= 'IN' otherlv_8= 'VAR' ( (lv_varname_9_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getStoreElementAccess().getSTORE_ELEMENTKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getStoreElementAccess().getPOSKeyword_0_1());
                    			
                    // InternalBad.g:744:4: ( (lv_pos_index_2_0= RULE_INT ) )
                    // InternalBad.g:745:5: (lv_pos_index_2_0= RULE_INT )
                    {
                    // InternalBad.g:745:5: (lv_pos_index_2_0= RULE_INT )
                    // InternalBad.g:746:6: lv_pos_index_2_0= RULE_INT
                    {
                    lv_pos_index_2_0=(Token)match(input,RULE_INT,FOLLOW_7); 

                    						newLeafNode(lv_pos_index_2_0, grammarAccess.getStoreElementAccess().getPos_indexINTTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStoreElementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"pos_index",
                    							lv_pos_index_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getStoreElementAccess().getFROMKeyword_0_3());
                    			
                    // InternalBad.g:766:4: ( (lv_id_from_4_0= RULE_STRING ) )
                    // InternalBad.g:767:5: (lv_id_from_4_0= RULE_STRING )
                    {
                    // InternalBad.g:767:5: (lv_id_from_4_0= RULE_STRING )
                    // InternalBad.g:768:6: lv_id_from_4_0= RULE_STRING
                    {
                    lv_id_from_4_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

                    						newLeafNode(lv_id_from_4_0, grammarAccess.getStoreElementAccess().getId_fromSTRINGTerminalRuleCall_0_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStoreElementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"id_from",
                    							lv_id_from_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,25,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getStoreElementAccess().getPROPKeyword_0_5());
                    			
                    // InternalBad.g:788:4: ( (lv_prop_name_6_0= RULE_STRING ) )
                    // InternalBad.g:789:5: (lv_prop_name_6_0= RULE_STRING )
                    {
                    // InternalBad.g:789:5: (lv_prop_name_6_0= RULE_STRING )
                    // InternalBad.g:790:6: lv_prop_name_6_0= RULE_STRING
                    {
                    lv_prop_name_6_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    						newLeafNode(lv_prop_name_6_0, grammarAccess.getStoreElementAccess().getProp_nameSTRINGTerminalRuleCall_0_6_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStoreElementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"prop_name",
                    							lv_prop_name_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getStoreElementAccess().getINKeyword_0_7());
                    			
                    otherlv_8=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getStoreElementAccess().getVARKeyword_0_8());
                    			
                    // InternalBad.g:814:4: ( (lv_varname_9_0= RULE_STRING ) )
                    // InternalBad.g:815:5: (lv_varname_9_0= RULE_STRING )
                    {
                    // InternalBad.g:815:5: (lv_varname_9_0= RULE_STRING )
                    // InternalBad.g:816:6: lv_varname_9_0= RULE_STRING
                    {
                    lv_varname_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_varname_9_0, grammarAccess.getStoreElementAccess().getVarnameSTRINGTerminalRuleCall_0_9_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStoreElementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"varname",
                    							lv_varname_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBad.g:834:3: (otherlv_10= 'STORE_ELEMENT' otherlv_11= 'FROM' ( (lv_id_from_12_0= RULE_STRING ) ) otherlv_13= 'PROP' ( (lv_prop_name_14_0= RULE_STRING ) ) otherlv_15= 'IN' otherlv_16= 'VAR' ( (lv_varname_17_0= RULE_STRING ) ) )
                    {
                    // InternalBad.g:834:3: (otherlv_10= 'STORE_ELEMENT' otherlv_11= 'FROM' ( (lv_id_from_12_0= RULE_STRING ) ) otherlv_13= 'PROP' ( (lv_prop_name_14_0= RULE_STRING ) ) otherlv_15= 'IN' otherlv_16= 'VAR' ( (lv_varname_17_0= RULE_STRING ) ) )
                    // InternalBad.g:835:4: otherlv_10= 'STORE_ELEMENT' otherlv_11= 'FROM' ( (lv_id_from_12_0= RULE_STRING ) ) otherlv_13= 'PROP' ( (lv_prop_name_14_0= RULE_STRING ) ) otherlv_15= 'IN' otherlv_16= 'VAR' ( (lv_varname_17_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,24,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getStoreElementAccess().getSTORE_ELEMENTKeyword_1_0());
                    			
                    otherlv_11=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getStoreElementAccess().getFROMKeyword_1_1());
                    			
                    // InternalBad.g:843:4: ( (lv_id_from_12_0= RULE_STRING ) )
                    // InternalBad.g:844:5: (lv_id_from_12_0= RULE_STRING )
                    {
                    // InternalBad.g:844:5: (lv_id_from_12_0= RULE_STRING )
                    // InternalBad.g:845:6: lv_id_from_12_0= RULE_STRING
                    {
                    lv_id_from_12_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

                    						newLeafNode(lv_id_from_12_0, grammarAccess.getStoreElementAccess().getId_fromSTRINGTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStoreElementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"id_from",
                    							lv_id_from_12_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,25,FOLLOW_6); 

                    				newLeafNode(otherlv_13, grammarAccess.getStoreElementAccess().getPROPKeyword_1_3());
                    			
                    // InternalBad.g:865:4: ( (lv_prop_name_14_0= RULE_STRING ) )
                    // InternalBad.g:866:5: (lv_prop_name_14_0= RULE_STRING )
                    {
                    // InternalBad.g:866:5: (lv_prop_name_14_0= RULE_STRING )
                    // InternalBad.g:867:6: lv_prop_name_14_0= RULE_STRING
                    {
                    lv_prop_name_14_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

                    						newLeafNode(lv_prop_name_14_0, grammarAccess.getStoreElementAccess().getProp_nameSTRINGTerminalRuleCall_1_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStoreElementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"prop_name",
                    							lv_prop_name_14_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_15=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getStoreElementAccess().getINKeyword_1_5());
                    			
                    otherlv_16=(Token)match(input,15,FOLLOW_6); 

                    				newLeafNode(otherlv_16, grammarAccess.getStoreElementAccess().getVARKeyword_1_6());
                    			
                    // InternalBad.g:891:4: ( (lv_varname_17_0= RULE_STRING ) )
                    // InternalBad.g:892:5: (lv_varname_17_0= RULE_STRING )
                    {
                    // InternalBad.g:892:5: (lv_varname_17_0= RULE_STRING )
                    // InternalBad.g:893:6: lv_varname_17_0= RULE_STRING
                    {
                    lv_varname_17_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_varname_17_0, grammarAccess.getStoreElementAccess().getVarnameSTRINGTerminalRuleCall_1_7_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStoreElementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"varname",
                    							lv_varname_17_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

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
    // $ANTLR end "ruleStoreElement"


    // $ANTLR start "ruleClickType"
    // InternalBad.g:914:1: ruleClickType returns [Enumerator current=null] : ( (enumLiteral_0= 'BUTTON' ) | (enumLiteral_1= 'LINK' ) | (enumLiteral_2= 'IMAGE' ) | (enumLiteral_3= 'COMBO' ) ) ;
    public final Enumerator ruleClickType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalBad.g:920:2: ( ( (enumLiteral_0= 'BUTTON' ) | (enumLiteral_1= 'LINK' ) | (enumLiteral_2= 'IMAGE' ) | (enumLiteral_3= 'COMBO' ) ) )
            // InternalBad.g:921:2: ( (enumLiteral_0= 'BUTTON' ) | (enumLiteral_1= 'LINK' ) | (enumLiteral_2= 'IMAGE' ) | (enumLiteral_3= 'COMBO' ) )
            {
            // InternalBad.g:921:2: ( (enumLiteral_0= 'BUTTON' ) | (enumLiteral_1= 'LINK' ) | (enumLiteral_2= 'IMAGE' ) | (enumLiteral_3= 'COMBO' ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt11=1;
                }
                break;
            case 27:
                {
                alt11=2;
                }
                break;
            case 28:
                {
                alt11=3;
                }
                break;
            case 29:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalBad.g:922:3: (enumLiteral_0= 'BUTTON' )
                    {
                    // InternalBad.g:922:3: (enumLiteral_0= 'BUTTON' )
                    // InternalBad.g:923:4: enumLiteral_0= 'BUTTON'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getClickTypeAccess().getBUTTONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getClickTypeAccess().getBUTTONEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBad.g:930:3: (enumLiteral_1= 'LINK' )
                    {
                    // InternalBad.g:930:3: (enumLiteral_1= 'LINK' )
                    // InternalBad.g:931:4: enumLiteral_1= 'LINK'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getClickTypeAccess().getLINKEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getClickTypeAccess().getLINKEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalBad.g:938:3: (enumLiteral_2= 'IMAGE' )
                    {
                    // InternalBad.g:938:3: (enumLiteral_2= 'IMAGE' )
                    // InternalBad.g:939:4: enumLiteral_2= 'IMAGE'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getClickTypeAccess().getIMAGEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getClickTypeAccess().getIMAGEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBad.g:946:3: (enumLiteral_3= 'COMBO' )
                    {
                    // InternalBad.g:946:3: (enumLiteral_3= 'COMBO' )
                    // InternalBad.g:947:4: enumLiteral_3= 'COMBO'
                    {
                    enumLiteral_3=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getClickTypeAccess().getCOMBOEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getClickTypeAccess().getCOMBOEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleClickType"


    // $ANTLR start "ruleElemType"
    // InternalBad.g:957:1: ruleElemType returns [Enumerator current=null] : ( (enumLiteral_0= 'LINK' ) | (enumLiteral_1= 'TEXT' ) ) ;
    public final Enumerator ruleElemType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalBad.g:963:2: ( ( (enumLiteral_0= 'LINK' ) | (enumLiteral_1= 'TEXT' ) ) )
            // InternalBad.g:964:2: ( (enumLiteral_0= 'LINK' ) | (enumLiteral_1= 'TEXT' ) )
            {
            // InternalBad.g:964:2: ( (enumLiteral_0= 'LINK' ) | (enumLiteral_1= 'TEXT' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            else if ( (LA12_0==30) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalBad.g:965:3: (enumLiteral_0= 'LINK' )
                    {
                    // InternalBad.g:965:3: (enumLiteral_0= 'LINK' )
                    // InternalBad.g:966:4: enumLiteral_0= 'LINK'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getElemTypeAccess().getLINKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getElemTypeAccess().getLINKEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBad.g:973:3: (enumLiteral_1= 'TEXT' )
                    {
                    // InternalBad.g:973:3: (enumLiteral_1= 'TEXT' )
                    // InternalBad.g:974:4: enumLiteral_1= 'TEXT'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getElemTypeAccess().getTEXTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getElemTypeAccess().getTEXTEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleElemType"


    // $ANTLR start "ruleBoolString"
    // InternalBad.g:984:1: ruleBoolString returns [Enumerator current=null] : ( (enumLiteral_0= 'TRUE' ) | (enumLiteral_1= 'FALSE' ) ) ;
    public final Enumerator ruleBoolString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalBad.g:990:2: ( ( (enumLiteral_0= 'TRUE' ) | (enumLiteral_1= 'FALSE' ) ) )
            // InternalBad.g:991:2: ( (enumLiteral_0= 'TRUE' ) | (enumLiteral_1= 'FALSE' ) )
            {
            // InternalBad.g:991:2: ( (enumLiteral_0= 'TRUE' ) | (enumLiteral_1= 'FALSE' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            else if ( (LA13_0==32) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalBad.g:992:3: (enumLiteral_0= 'TRUE' )
                    {
                    // InternalBad.g:992:3: (enumLiteral_0= 'TRUE' )
                    // InternalBad.g:993:4: enumLiteral_0= 'TRUE'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getBoolStringAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBoolStringAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBad.g:1000:3: (enumLiteral_1= 'FALSE' )
                    {
                    // InternalBad.g:1000:3: (enumLiteral_1= 'FALSE' )
                    // InternalBad.g:1001:4: enumLiteral_1= 'FALSE'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getBoolStringAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBoolStringAccess().getFALSEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleBoolString"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\7\uffff\1\10\2\uffff";
    static final String dfa_3s = "\1\20\1\32\4\5\1\uffff\1\14\2\uffff";
    static final String dfa_4s = "\1\20\1\35\4\21\1\uffff\1\30\2\uffff";
    static final String dfa_5s = "\6\uffff\1\2\1\uffff\1\1\1\3";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2\1\3\1\4\1\5",
            "\1\7\11\uffff\1\10\1\uffff\1\6",
            "\1\7\11\uffff\1\10\1\uffff\1\6",
            "\1\7\11\uffff\1\10\1\uffff\1\6",
            "\1\7\11\uffff\1\10\1\uffff\1\6",
            "",
            "\2\10\2\uffff\1\10\2\uffff\1\11\1\10\1\uffff\1\10\1\uffff\1\10",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "342:2: ( (otherlv_0= 'CLICK_ON' ( (lv_type_1_0= ruleClickType ) ) ( ( (lv_id_2_0= RULE_STRING ) ) | ( (otherlv_3= 'VAR' )+ ( (lv_varname_4_0= RULE_STRING ) ) ) ) ) | (otherlv_5= 'CLICK_ON' ( (lv_type_6_0= ruleClickType ) ) otherlv_7= 'POS' ( (lv_pos_index_8_0= RULE_INT ) ) otherlv_9= 'IN' ( (lv_id_10_0= RULE_STRING ) ) ) | (otherlv_11= 'CLICK_ON' ( (lv_type_12_0= ruleClickType ) ) ( (lv_id_combo_13_0= RULE_STRING ) ) otherlv_14= 'VALUE' ( (lv_to_select_15_0= RULE_STRING ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001513002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000048000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200022L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});

}