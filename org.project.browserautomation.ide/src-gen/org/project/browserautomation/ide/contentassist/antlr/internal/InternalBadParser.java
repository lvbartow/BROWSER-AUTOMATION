package org.project.browserautomation.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.project.browserautomation.services.BadGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBadParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_URL", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ALL'", "'BUTTON'", "'LINK'", "'IMAGE'", "'COMBO'", "'TEXT'", "'TRUE'", "'FALSE'", "'NAV_TO'", "'CHECK_EXISTS'", "'FROM'", "'VAR'", "'CLICK_ON'", "'POS'", "'IN'", "'VALUE'", "'CHECKBOX_ACTION'", "'FILL_FIELD'", "'NAME'", "'STORE_ELEMENT'", "'PROP'"
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

    	public void setGrammarAccess(BadGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProgram"
    // InternalBad.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalBad.g:54:1: ( ruleProgram EOF )
            // InternalBad.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalBad.g:62:1: ruleProgram : ( ( rule__Program__InstructionsAssignment )* ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:66:2: ( ( ( rule__Program__InstructionsAssignment )* ) )
            // InternalBad.g:67:2: ( ( rule__Program__InstructionsAssignment )* )
            {
            // InternalBad.g:67:2: ( ( rule__Program__InstructionsAssignment )* )
            // InternalBad.g:68:3: ( rule__Program__InstructionsAssignment )*
            {
             before(grammarAccess.getProgramAccess().getInstructionsAssignment()); 
            // InternalBad.g:69:3: ( rule__Program__InstructionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=20 && LA1_0<=21)||LA1_0==24||(LA1_0>=28 && LA1_0<=29)||LA1_0==31) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBad.g:69:4: rule__Program__InstructionsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Program__InstructionsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getInstructionsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleInstruction"
    // InternalBad.g:78:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // InternalBad.g:79:1: ( ruleInstruction EOF )
            // InternalBad.g:80:1: ruleInstruction EOF
            {
             before(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getInstructionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalBad.g:87:1: ruleInstruction : ( ( rule__Instruction__Alternatives ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:91:2: ( ( ( rule__Instruction__Alternatives ) ) )
            // InternalBad.g:92:2: ( ( rule__Instruction__Alternatives ) )
            {
            // InternalBad.g:92:2: ( ( rule__Instruction__Alternatives ) )
            // InternalBad.g:93:3: ( rule__Instruction__Alternatives )
            {
             before(grammarAccess.getInstructionAccess().getAlternatives()); 
            // InternalBad.g:94:3: ( rule__Instruction__Alternatives )
            // InternalBad.g:94:4: rule__Instruction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstructionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleNavigateToUrl"
    // InternalBad.g:103:1: entryRuleNavigateToUrl : ruleNavigateToUrl EOF ;
    public final void entryRuleNavigateToUrl() throws RecognitionException {
        try {
            // InternalBad.g:104:1: ( ruleNavigateToUrl EOF )
            // InternalBad.g:105:1: ruleNavigateToUrl EOF
            {
             before(grammarAccess.getNavigateToUrlRule()); 
            pushFollow(FOLLOW_1);
            ruleNavigateToUrl();

            state._fsp--;

             after(grammarAccess.getNavigateToUrlRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNavigateToUrl"


    // $ANTLR start "ruleNavigateToUrl"
    // InternalBad.g:112:1: ruleNavigateToUrl : ( ( rule__NavigateToUrl__Group__0 ) ) ;
    public final void ruleNavigateToUrl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:116:2: ( ( ( rule__NavigateToUrl__Group__0 ) ) )
            // InternalBad.g:117:2: ( ( rule__NavigateToUrl__Group__0 ) )
            {
            // InternalBad.g:117:2: ( ( rule__NavigateToUrl__Group__0 ) )
            // InternalBad.g:118:3: ( rule__NavigateToUrl__Group__0 )
            {
             before(grammarAccess.getNavigateToUrlAccess().getGroup()); 
            // InternalBad.g:119:3: ( rule__NavigateToUrl__Group__0 )
            // InternalBad.g:119:4: rule__NavigateToUrl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NavigateToUrl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNavigateToUrlAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNavigateToUrl"


    // $ANTLR start "entryRuleCheckExists"
    // InternalBad.g:128:1: entryRuleCheckExists : ruleCheckExists EOF ;
    public final void entryRuleCheckExists() throws RecognitionException {
        try {
            // InternalBad.g:129:1: ( ruleCheckExists EOF )
            // InternalBad.g:130:1: ruleCheckExists EOF
            {
             before(grammarAccess.getCheckExistsRule()); 
            pushFollow(FOLLOW_1);
            ruleCheckExists();

            state._fsp--;

             after(grammarAccess.getCheckExistsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCheckExists"


    // $ANTLR start "ruleCheckExists"
    // InternalBad.g:137:1: ruleCheckExists : ( ( rule__CheckExists__Alternatives ) ) ;
    public final void ruleCheckExists() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:141:2: ( ( ( rule__CheckExists__Alternatives ) ) )
            // InternalBad.g:142:2: ( ( rule__CheckExists__Alternatives ) )
            {
            // InternalBad.g:142:2: ( ( rule__CheckExists__Alternatives ) )
            // InternalBad.g:143:3: ( rule__CheckExists__Alternatives )
            {
             before(grammarAccess.getCheckExistsAccess().getAlternatives()); 
            // InternalBad.g:144:3: ( rule__CheckExists__Alternatives )
            // InternalBad.g:144:4: rule__CheckExists__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CheckExists__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCheckExistsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheckExists"


    // $ANTLR start "entryRuleClickOn"
    // InternalBad.g:153:1: entryRuleClickOn : ruleClickOn EOF ;
    public final void entryRuleClickOn() throws RecognitionException {
        try {
            // InternalBad.g:154:1: ( ruleClickOn EOF )
            // InternalBad.g:155:1: ruleClickOn EOF
            {
             before(grammarAccess.getClickOnRule()); 
            pushFollow(FOLLOW_1);
            ruleClickOn();

            state._fsp--;

             after(grammarAccess.getClickOnRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClickOn"


    // $ANTLR start "ruleClickOn"
    // InternalBad.g:162:1: ruleClickOn : ( ( rule__ClickOn__Alternatives ) ) ;
    public final void ruleClickOn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:166:2: ( ( ( rule__ClickOn__Alternatives ) ) )
            // InternalBad.g:167:2: ( ( rule__ClickOn__Alternatives ) )
            {
            // InternalBad.g:167:2: ( ( rule__ClickOn__Alternatives ) )
            // InternalBad.g:168:3: ( rule__ClickOn__Alternatives )
            {
             before(grammarAccess.getClickOnAccess().getAlternatives()); 
            // InternalBad.g:169:3: ( rule__ClickOn__Alternatives )
            // InternalBad.g:169:4: rule__ClickOn__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ClickOn__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getClickOnAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClickOn"


    // $ANTLR start "entryRuleCheckboxAction"
    // InternalBad.g:178:1: entryRuleCheckboxAction : ruleCheckboxAction EOF ;
    public final void entryRuleCheckboxAction() throws RecognitionException {
        try {
            // InternalBad.g:179:1: ( ruleCheckboxAction EOF )
            // InternalBad.g:180:1: ruleCheckboxAction EOF
            {
             before(grammarAccess.getCheckboxActionRule()); 
            pushFollow(FOLLOW_1);
            ruleCheckboxAction();

            state._fsp--;

             after(grammarAccess.getCheckboxActionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCheckboxAction"


    // $ANTLR start "ruleCheckboxAction"
    // InternalBad.g:187:1: ruleCheckboxAction : ( ( rule__CheckboxAction__Group__0 ) ) ;
    public final void ruleCheckboxAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:191:2: ( ( ( rule__CheckboxAction__Group__0 ) ) )
            // InternalBad.g:192:2: ( ( rule__CheckboxAction__Group__0 ) )
            {
            // InternalBad.g:192:2: ( ( rule__CheckboxAction__Group__0 ) )
            // InternalBad.g:193:3: ( rule__CheckboxAction__Group__0 )
            {
             before(grammarAccess.getCheckboxActionAccess().getGroup()); 
            // InternalBad.g:194:3: ( rule__CheckboxAction__Group__0 )
            // InternalBad.g:194:4: rule__CheckboxAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CheckboxAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCheckboxAction"


    // $ANTLR start "entryRuleFillField"
    // InternalBad.g:203:1: entryRuleFillField : ruleFillField EOF ;
    public final void entryRuleFillField() throws RecognitionException {
        try {
            // InternalBad.g:204:1: ( ruleFillField EOF )
            // InternalBad.g:205:1: ruleFillField EOF
            {
             before(grammarAccess.getFillFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleFillField();

            state._fsp--;

             after(grammarAccess.getFillFieldRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFillField"


    // $ANTLR start "ruleFillField"
    // InternalBad.g:212:1: ruleFillField : ( ( rule__FillField__Group__0 ) ) ;
    public final void ruleFillField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:216:2: ( ( ( rule__FillField__Group__0 ) ) )
            // InternalBad.g:217:2: ( ( rule__FillField__Group__0 ) )
            {
            // InternalBad.g:217:2: ( ( rule__FillField__Group__0 ) )
            // InternalBad.g:218:3: ( rule__FillField__Group__0 )
            {
             before(grammarAccess.getFillFieldAccess().getGroup()); 
            // InternalBad.g:219:3: ( rule__FillField__Group__0 )
            // InternalBad.g:219:4: rule__FillField__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FillField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFillFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFillField"


    // $ANTLR start "entryRuleStoreElement"
    // InternalBad.g:228:1: entryRuleStoreElement : ruleStoreElement EOF ;
    public final void entryRuleStoreElement() throws RecognitionException {
        try {
            // InternalBad.g:229:1: ( ruleStoreElement EOF )
            // InternalBad.g:230:1: ruleStoreElement EOF
            {
             before(grammarAccess.getStoreElementRule()); 
            pushFollow(FOLLOW_1);
            ruleStoreElement();

            state._fsp--;

             after(grammarAccess.getStoreElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStoreElement"


    // $ANTLR start "ruleStoreElement"
    // InternalBad.g:237:1: ruleStoreElement : ( ( rule__StoreElement__Alternatives ) ) ;
    public final void ruleStoreElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:241:2: ( ( ( rule__StoreElement__Alternatives ) ) )
            // InternalBad.g:242:2: ( ( rule__StoreElement__Alternatives ) )
            {
            // InternalBad.g:242:2: ( ( rule__StoreElement__Alternatives ) )
            // InternalBad.g:243:3: ( rule__StoreElement__Alternatives )
            {
             before(grammarAccess.getStoreElementAccess().getAlternatives()); 
            // InternalBad.g:244:3: ( rule__StoreElement__Alternatives )
            // InternalBad.g:244:4: rule__StoreElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StoreElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStoreElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStoreElement"


    // $ANTLR start "ruleClickType"
    // InternalBad.g:253:1: ruleClickType : ( ( rule__ClickType__Alternatives ) ) ;
    public final void ruleClickType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:257:1: ( ( ( rule__ClickType__Alternatives ) ) )
            // InternalBad.g:258:2: ( ( rule__ClickType__Alternatives ) )
            {
            // InternalBad.g:258:2: ( ( rule__ClickType__Alternatives ) )
            // InternalBad.g:259:3: ( rule__ClickType__Alternatives )
            {
             before(grammarAccess.getClickTypeAccess().getAlternatives()); 
            // InternalBad.g:260:3: ( rule__ClickType__Alternatives )
            // InternalBad.g:260:4: rule__ClickType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ClickType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getClickTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClickType"


    // $ANTLR start "ruleElemType"
    // InternalBad.g:269:1: ruleElemType : ( ( rule__ElemType__Alternatives ) ) ;
    public final void ruleElemType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:273:1: ( ( ( rule__ElemType__Alternatives ) ) )
            // InternalBad.g:274:2: ( ( rule__ElemType__Alternatives ) )
            {
            // InternalBad.g:274:2: ( ( rule__ElemType__Alternatives ) )
            // InternalBad.g:275:3: ( rule__ElemType__Alternatives )
            {
             before(grammarAccess.getElemTypeAccess().getAlternatives()); 
            // InternalBad.g:276:3: ( rule__ElemType__Alternatives )
            // InternalBad.g:276:4: rule__ElemType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ElemType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElemTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElemType"


    // $ANTLR start "ruleBoolString"
    // InternalBad.g:285:1: ruleBoolString : ( ( rule__BoolString__Alternatives ) ) ;
    public final void ruleBoolString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:289:1: ( ( ( rule__BoolString__Alternatives ) ) )
            // InternalBad.g:290:2: ( ( rule__BoolString__Alternatives ) )
            {
            // InternalBad.g:290:2: ( ( rule__BoolString__Alternatives ) )
            // InternalBad.g:291:3: ( rule__BoolString__Alternatives )
            {
             before(grammarAccess.getBoolStringAccess().getAlternatives()); 
            // InternalBad.g:292:3: ( rule__BoolString__Alternatives )
            // InternalBad.g:292:4: rule__BoolString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BoolString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBoolStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolString"


    // $ANTLR start "rule__Instruction__Alternatives"
    // InternalBad.g:300:1: rule__Instruction__Alternatives : ( ( ruleNavigateToUrl ) | ( ruleClickOn ) | ( ruleFillField ) | ( ruleCheckExists ) | ( ruleCheckboxAction ) | ( ruleStoreElement ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:304:1: ( ( ruleNavigateToUrl ) | ( ruleClickOn ) | ( ruleFillField ) | ( ruleCheckExists ) | ( ruleCheckboxAction ) | ( ruleStoreElement ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 29:
                {
                alt2=3;
                }
                break;
            case 21:
                {
                alt2=4;
                }
                break;
            case 28:
                {
                alt2=5;
                }
                break;
            case 31:
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
                    // InternalBad.g:305:2: ( ruleNavigateToUrl )
                    {
                    // InternalBad.g:305:2: ( ruleNavigateToUrl )
                    // InternalBad.g:306:3: ruleNavigateToUrl
                    {
                     before(grammarAccess.getInstructionAccess().getNavigateToUrlParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNavigateToUrl();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getNavigateToUrlParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBad.g:311:2: ( ruleClickOn )
                    {
                    // InternalBad.g:311:2: ( ruleClickOn )
                    // InternalBad.g:312:3: ruleClickOn
                    {
                     before(grammarAccess.getInstructionAccess().getClickOnParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleClickOn();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getClickOnParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBad.g:317:2: ( ruleFillField )
                    {
                    // InternalBad.g:317:2: ( ruleFillField )
                    // InternalBad.g:318:3: ruleFillField
                    {
                     before(grammarAccess.getInstructionAccess().getFillFieldParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFillField();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getFillFieldParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBad.g:323:2: ( ruleCheckExists )
                    {
                    // InternalBad.g:323:2: ( ruleCheckExists )
                    // InternalBad.g:324:3: ruleCheckExists
                    {
                     before(grammarAccess.getInstructionAccess().getCheckExistsParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCheckExists();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getCheckExistsParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBad.g:329:2: ( ruleCheckboxAction )
                    {
                    // InternalBad.g:329:2: ( ruleCheckboxAction )
                    // InternalBad.g:330:3: ruleCheckboxAction
                    {
                     before(grammarAccess.getInstructionAccess().getCheckboxActionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleCheckboxAction();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getCheckboxActionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBad.g:335:2: ( ruleStoreElement )
                    {
                    // InternalBad.g:335:2: ( ruleStoreElement )
                    // InternalBad.g:336:3: ruleStoreElement
                    {
                     before(grammarAccess.getInstructionAccess().getStoreElementParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleStoreElement();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getStoreElementParserRuleCall_5()); 

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
    // $ANTLR end "rule__Instruction__Alternatives"


    // $ANTLR start "rule__CheckExists__Alternatives"
    // InternalBad.g:345:1: rule__CheckExists__Alternatives : ( ( ( rule__CheckExists__Group_0__0 ) ) | ( ( rule__CheckExists__Group_1__0 ) ) );
    public final void rule__CheckExists__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:349:1: ( ( ( rule__CheckExists__Group_0__0 ) ) | ( ( rule__CheckExists__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==14) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==22) ) {
                        alt3=2;
                    }
                    else if ( (LA3_2==RULE_STRING) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA3_1==17) ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==22) ) {
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
                    // InternalBad.g:350:2: ( ( rule__CheckExists__Group_0__0 ) )
                    {
                    // InternalBad.g:350:2: ( ( rule__CheckExists__Group_0__0 ) )
                    // InternalBad.g:351:3: ( rule__CheckExists__Group_0__0 )
                    {
                     before(grammarAccess.getCheckExistsAccess().getGroup_0()); 
                    // InternalBad.g:352:3: ( rule__CheckExists__Group_0__0 )
                    // InternalBad.g:352:4: rule__CheckExists__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CheckExists__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCheckExistsAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBad.g:356:2: ( ( rule__CheckExists__Group_1__0 ) )
                    {
                    // InternalBad.g:356:2: ( ( rule__CheckExists__Group_1__0 ) )
                    // InternalBad.g:357:3: ( rule__CheckExists__Group_1__0 )
                    {
                     before(grammarAccess.getCheckExistsAccess().getGroup_1()); 
                    // InternalBad.g:358:3: ( rule__CheckExists__Group_1__0 )
                    // InternalBad.g:358:4: rule__CheckExists__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CheckExists__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCheckExistsAccess().getGroup_1()); 

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
    // $ANTLR end "rule__CheckExists__Alternatives"


    // $ANTLR start "rule__ClickOn__Alternatives"
    // InternalBad.g:366:1: rule__ClickOn__Alternatives : ( ( ( rule__ClickOn__Group_0__0 ) ) | ( ( rule__ClickOn__Group_1__0 ) ) | ( ( rule__ClickOn__Group_2__0 ) ) );
    public final void rule__ClickOn__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:370:1: ( ( ( rule__ClickOn__Group_0__0 ) ) | ( ( rule__ClickOn__Group_1__0 ) ) | ( ( rule__ClickOn__Group_2__0 ) ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalBad.g:371:2: ( ( rule__ClickOn__Group_0__0 ) )
                    {
                    // InternalBad.g:371:2: ( ( rule__ClickOn__Group_0__0 ) )
                    // InternalBad.g:372:3: ( rule__ClickOn__Group_0__0 )
                    {
                     before(grammarAccess.getClickOnAccess().getGroup_0()); 
                    // InternalBad.g:373:3: ( rule__ClickOn__Group_0__0 )
                    // InternalBad.g:373:4: rule__ClickOn__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClickOn__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClickOnAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBad.g:377:2: ( ( rule__ClickOn__Group_1__0 ) )
                    {
                    // InternalBad.g:377:2: ( ( rule__ClickOn__Group_1__0 ) )
                    // InternalBad.g:378:3: ( rule__ClickOn__Group_1__0 )
                    {
                     before(grammarAccess.getClickOnAccess().getGroup_1()); 
                    // InternalBad.g:379:3: ( rule__ClickOn__Group_1__0 )
                    // InternalBad.g:379:4: rule__ClickOn__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClickOn__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClickOnAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBad.g:383:2: ( ( rule__ClickOn__Group_2__0 ) )
                    {
                    // InternalBad.g:383:2: ( ( rule__ClickOn__Group_2__0 ) )
                    // InternalBad.g:384:3: ( rule__ClickOn__Group_2__0 )
                    {
                     before(grammarAccess.getClickOnAccess().getGroup_2()); 
                    // InternalBad.g:385:3: ( rule__ClickOn__Group_2__0 )
                    // InternalBad.g:385:4: rule__ClickOn__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClickOn__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClickOnAccess().getGroup_2()); 

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
    // $ANTLR end "rule__ClickOn__Alternatives"


    // $ANTLR start "rule__ClickOn__Alternatives_0_2"
    // InternalBad.g:393:1: rule__ClickOn__Alternatives_0_2 : ( ( ( rule__ClickOn__IdAssignment_0_2_0 ) ) | ( ( rule__ClickOn__Group_0_2_1__0 ) ) );
    public final void rule__ClickOn__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:397:1: ( ( ( rule__ClickOn__IdAssignment_0_2_0 ) ) | ( ( rule__ClickOn__Group_0_2_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==23) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBad.g:398:2: ( ( rule__ClickOn__IdAssignment_0_2_0 ) )
                    {
                    // InternalBad.g:398:2: ( ( rule__ClickOn__IdAssignment_0_2_0 ) )
                    // InternalBad.g:399:3: ( rule__ClickOn__IdAssignment_0_2_0 )
                    {
                     before(grammarAccess.getClickOnAccess().getIdAssignment_0_2_0()); 
                    // InternalBad.g:400:3: ( rule__ClickOn__IdAssignment_0_2_0 )
                    // InternalBad.g:400:4: rule__ClickOn__IdAssignment_0_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClickOn__IdAssignment_0_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClickOnAccess().getIdAssignment_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBad.g:404:2: ( ( rule__ClickOn__Group_0_2_1__0 ) )
                    {
                    // InternalBad.g:404:2: ( ( rule__ClickOn__Group_0_2_1__0 ) )
                    // InternalBad.g:405:3: ( rule__ClickOn__Group_0_2_1__0 )
                    {
                     before(grammarAccess.getClickOnAccess().getGroup_0_2_1()); 
                    // InternalBad.g:406:3: ( rule__ClickOn__Group_0_2_1__0 )
                    // InternalBad.g:406:4: rule__ClickOn__Group_0_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClickOn__Group_0_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClickOnAccess().getGroup_0_2_1()); 

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
    // $ANTLR end "rule__ClickOn__Alternatives_0_2"


    // $ANTLR start "rule__CheckboxAction__Alternatives_2"
    // InternalBad.g:414:1: rule__CheckboxAction__Alternatives_2 : ( ( 'ALL' ) | ( ( rule__CheckboxAction__ActionsAssignment_2_1 )* ) );
    public final void rule__CheckboxAction__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:418:1: ( ( 'ALL' ) | ( ( rule__CheckboxAction__ActionsAssignment_2_1 )* ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            else if ( (LA7_0==EOF||LA7_0==RULE_STRING||(LA7_0>=20 && LA7_0<=21)||LA7_0==24||(LA7_0>=28 && LA7_0<=29)||LA7_0==31) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalBad.g:419:2: ( 'ALL' )
                    {
                    // InternalBad.g:419:2: ( 'ALL' )
                    // InternalBad.g:420:3: 'ALL'
                    {
                     before(grammarAccess.getCheckboxActionAccess().getALLKeyword_2_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getCheckboxActionAccess().getALLKeyword_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBad.g:425:2: ( ( rule__CheckboxAction__ActionsAssignment_2_1 )* )
                    {
                    // InternalBad.g:425:2: ( ( rule__CheckboxAction__ActionsAssignment_2_1 )* )
                    // InternalBad.g:426:3: ( rule__CheckboxAction__ActionsAssignment_2_1 )*
                    {
                     before(grammarAccess.getCheckboxActionAccess().getActionsAssignment_2_1()); 
                    // InternalBad.g:427:3: ( rule__CheckboxAction__ActionsAssignment_2_1 )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_STRING) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalBad.g:427:4: rule__CheckboxAction__ActionsAssignment_2_1
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__CheckboxAction__ActionsAssignment_2_1();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                     after(grammarAccess.getCheckboxActionAccess().getActionsAssignment_2_1()); 

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
    // $ANTLR end "rule__CheckboxAction__Alternatives_2"


    // $ANTLR start "rule__FillField__Alternatives_4"
    // InternalBad.g:435:1: rule__FillField__Alternatives_4 : ( ( ( rule__FillField__ValueAssignment_4_0 ) ) | ( ( rule__FillField__Group_4_1__0 ) ) );
    public final void rule__FillField__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:439:1: ( ( ( rule__FillField__ValueAssignment_4_0 ) ) | ( ( rule__FillField__Group_4_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalBad.g:440:2: ( ( rule__FillField__ValueAssignment_4_0 ) )
                    {
                    // InternalBad.g:440:2: ( ( rule__FillField__ValueAssignment_4_0 ) )
                    // InternalBad.g:441:3: ( rule__FillField__ValueAssignment_4_0 )
                    {
                     before(grammarAccess.getFillFieldAccess().getValueAssignment_4_0()); 
                    // InternalBad.g:442:3: ( rule__FillField__ValueAssignment_4_0 )
                    // InternalBad.g:442:4: rule__FillField__ValueAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FillField__ValueAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFillFieldAccess().getValueAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBad.g:446:2: ( ( rule__FillField__Group_4_1__0 ) )
                    {
                    // InternalBad.g:446:2: ( ( rule__FillField__Group_4_1__0 ) )
                    // InternalBad.g:447:3: ( rule__FillField__Group_4_1__0 )
                    {
                     before(grammarAccess.getFillFieldAccess().getGroup_4_1()); 
                    // InternalBad.g:448:3: ( rule__FillField__Group_4_1__0 )
                    // InternalBad.g:448:4: rule__FillField__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FillField__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFillFieldAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__FillField__Alternatives_4"


    // $ANTLR start "rule__StoreElement__Alternatives"
    // InternalBad.g:456:1: rule__StoreElement__Alternatives : ( ( ( rule__StoreElement__Group_0__0 ) ) | ( ( rule__StoreElement__Group_1__0 ) ) );
    public final void rule__StoreElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:460:1: ( ( ( rule__StoreElement__Group_0__0 ) ) | ( ( rule__StoreElement__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==25) ) {
                    alt9=1;
                }
                else if ( (LA9_1==22) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalBad.g:461:2: ( ( rule__StoreElement__Group_0__0 ) )
                    {
                    // InternalBad.g:461:2: ( ( rule__StoreElement__Group_0__0 ) )
                    // InternalBad.g:462:3: ( rule__StoreElement__Group_0__0 )
                    {
                     before(grammarAccess.getStoreElementAccess().getGroup_0()); 
                    // InternalBad.g:463:3: ( rule__StoreElement__Group_0__0 )
                    // InternalBad.g:463:4: rule__StoreElement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StoreElement__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStoreElementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBad.g:467:2: ( ( rule__StoreElement__Group_1__0 ) )
                    {
                    // InternalBad.g:467:2: ( ( rule__StoreElement__Group_1__0 ) )
                    // InternalBad.g:468:3: ( rule__StoreElement__Group_1__0 )
                    {
                     before(grammarAccess.getStoreElementAccess().getGroup_1()); 
                    // InternalBad.g:469:3: ( rule__StoreElement__Group_1__0 )
                    // InternalBad.g:469:4: rule__StoreElement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StoreElement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStoreElementAccess().getGroup_1()); 

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
    // $ANTLR end "rule__StoreElement__Alternatives"


    // $ANTLR start "rule__ClickType__Alternatives"
    // InternalBad.g:477:1: rule__ClickType__Alternatives : ( ( ( 'BUTTON' ) ) | ( ( 'LINK' ) ) | ( ( 'IMAGE' ) ) | ( ( 'COMBO' ) ) );
    public final void rule__ClickType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:481:1: ( ( ( 'BUTTON' ) ) | ( ( 'LINK' ) ) | ( ( 'IMAGE' ) ) | ( ( 'COMBO' ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt10=1;
                }
                break;
            case 14:
                {
                alt10=2;
                }
                break;
            case 15:
                {
                alt10=3;
                }
                break;
            case 16:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalBad.g:482:2: ( ( 'BUTTON' ) )
                    {
                    // InternalBad.g:482:2: ( ( 'BUTTON' ) )
                    // InternalBad.g:483:3: ( 'BUTTON' )
                    {
                     before(grammarAccess.getClickTypeAccess().getBUTTONEnumLiteralDeclaration_0()); 
                    // InternalBad.g:484:3: ( 'BUTTON' )
                    // InternalBad.g:484:4: 'BUTTON'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getClickTypeAccess().getBUTTONEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBad.g:488:2: ( ( 'LINK' ) )
                    {
                    // InternalBad.g:488:2: ( ( 'LINK' ) )
                    // InternalBad.g:489:3: ( 'LINK' )
                    {
                     before(grammarAccess.getClickTypeAccess().getLINKEnumLiteralDeclaration_1()); 
                    // InternalBad.g:490:3: ( 'LINK' )
                    // InternalBad.g:490:4: 'LINK'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getClickTypeAccess().getLINKEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBad.g:494:2: ( ( 'IMAGE' ) )
                    {
                    // InternalBad.g:494:2: ( ( 'IMAGE' ) )
                    // InternalBad.g:495:3: ( 'IMAGE' )
                    {
                     before(grammarAccess.getClickTypeAccess().getIMAGEEnumLiteralDeclaration_2()); 
                    // InternalBad.g:496:3: ( 'IMAGE' )
                    // InternalBad.g:496:4: 'IMAGE'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getClickTypeAccess().getIMAGEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBad.g:500:2: ( ( 'COMBO' ) )
                    {
                    // InternalBad.g:500:2: ( ( 'COMBO' ) )
                    // InternalBad.g:501:3: ( 'COMBO' )
                    {
                     before(grammarAccess.getClickTypeAccess().getCOMBOEnumLiteralDeclaration_3()); 
                    // InternalBad.g:502:3: ( 'COMBO' )
                    // InternalBad.g:502:4: 'COMBO'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getClickTypeAccess().getCOMBOEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__ClickType__Alternatives"


    // $ANTLR start "rule__ElemType__Alternatives"
    // InternalBad.g:510:1: rule__ElemType__Alternatives : ( ( ( 'LINK' ) ) | ( ( 'TEXT' ) ) );
    public final void rule__ElemType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:514:1: ( ( ( 'LINK' ) ) | ( ( 'TEXT' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==14) ) {
                alt11=1;
            }
            else if ( (LA11_0==17) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalBad.g:515:2: ( ( 'LINK' ) )
                    {
                    // InternalBad.g:515:2: ( ( 'LINK' ) )
                    // InternalBad.g:516:3: ( 'LINK' )
                    {
                     before(grammarAccess.getElemTypeAccess().getLINKEnumLiteralDeclaration_0()); 
                    // InternalBad.g:517:3: ( 'LINK' )
                    // InternalBad.g:517:4: 'LINK'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getElemTypeAccess().getLINKEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBad.g:521:2: ( ( 'TEXT' ) )
                    {
                    // InternalBad.g:521:2: ( ( 'TEXT' ) )
                    // InternalBad.g:522:3: ( 'TEXT' )
                    {
                     before(grammarAccess.getElemTypeAccess().getTEXTEnumLiteralDeclaration_1()); 
                    // InternalBad.g:523:3: ( 'TEXT' )
                    // InternalBad.g:523:4: 'TEXT'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getElemTypeAccess().getTEXTEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__ElemType__Alternatives"


    // $ANTLR start "rule__BoolString__Alternatives"
    // InternalBad.g:531:1: rule__BoolString__Alternatives : ( ( ( 'TRUE' ) ) | ( ( 'FALSE' ) ) );
    public final void rule__BoolString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:535:1: ( ( ( 'TRUE' ) ) | ( ( 'FALSE' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            else if ( (LA12_0==19) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalBad.g:536:2: ( ( 'TRUE' ) )
                    {
                    // InternalBad.g:536:2: ( ( 'TRUE' ) )
                    // InternalBad.g:537:3: ( 'TRUE' )
                    {
                     before(grammarAccess.getBoolStringAccess().getTRUEEnumLiteralDeclaration_0()); 
                    // InternalBad.g:538:3: ( 'TRUE' )
                    // InternalBad.g:538:4: 'TRUE'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getBoolStringAccess().getTRUEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBad.g:542:2: ( ( 'FALSE' ) )
                    {
                    // InternalBad.g:542:2: ( ( 'FALSE' ) )
                    // InternalBad.g:543:3: ( 'FALSE' )
                    {
                     before(grammarAccess.getBoolStringAccess().getFALSEEnumLiteralDeclaration_1()); 
                    // InternalBad.g:544:3: ( 'FALSE' )
                    // InternalBad.g:544:4: 'FALSE'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getBoolStringAccess().getFALSEEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__BoolString__Alternatives"


    // $ANTLR start "rule__NavigateToUrl__Group__0"
    // InternalBad.g:552:1: rule__NavigateToUrl__Group__0 : rule__NavigateToUrl__Group__0__Impl rule__NavigateToUrl__Group__1 ;
    public final void rule__NavigateToUrl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:556:1: ( rule__NavigateToUrl__Group__0__Impl rule__NavigateToUrl__Group__1 )
            // InternalBad.g:557:2: rule__NavigateToUrl__Group__0__Impl rule__NavigateToUrl__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__NavigateToUrl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavigateToUrl__Group__1();

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
    // $ANTLR end "rule__NavigateToUrl__Group__0"


    // $ANTLR start "rule__NavigateToUrl__Group__0__Impl"
    // InternalBad.g:564:1: rule__NavigateToUrl__Group__0__Impl : ( 'NAV_TO' ) ;
    public final void rule__NavigateToUrl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:568:1: ( ( 'NAV_TO' ) )
            // InternalBad.g:569:1: ( 'NAV_TO' )
            {
            // InternalBad.g:569:1: ( 'NAV_TO' )
            // InternalBad.g:570:2: 'NAV_TO'
            {
             before(grammarAccess.getNavigateToUrlAccess().getNAV_TOKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNavigateToUrlAccess().getNAV_TOKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigateToUrl__Group__0__Impl"


    // $ANTLR start "rule__NavigateToUrl__Group__1"
    // InternalBad.g:579:1: rule__NavigateToUrl__Group__1 : rule__NavigateToUrl__Group__1__Impl ;
    public final void rule__NavigateToUrl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:583:1: ( rule__NavigateToUrl__Group__1__Impl )
            // InternalBad.g:584:2: rule__NavigateToUrl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NavigateToUrl__Group__1__Impl();

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
    // $ANTLR end "rule__NavigateToUrl__Group__1"


    // $ANTLR start "rule__NavigateToUrl__Group__1__Impl"
    // InternalBad.g:590:1: rule__NavigateToUrl__Group__1__Impl : ( ( rule__NavigateToUrl__UrlAssignment_1 ) ) ;
    public final void rule__NavigateToUrl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:594:1: ( ( ( rule__NavigateToUrl__UrlAssignment_1 ) ) )
            // InternalBad.g:595:1: ( ( rule__NavigateToUrl__UrlAssignment_1 ) )
            {
            // InternalBad.g:595:1: ( ( rule__NavigateToUrl__UrlAssignment_1 ) )
            // InternalBad.g:596:2: ( rule__NavigateToUrl__UrlAssignment_1 )
            {
             before(grammarAccess.getNavigateToUrlAccess().getUrlAssignment_1()); 
            // InternalBad.g:597:2: ( rule__NavigateToUrl__UrlAssignment_1 )
            // InternalBad.g:597:3: rule__NavigateToUrl__UrlAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NavigateToUrl__UrlAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNavigateToUrlAccess().getUrlAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigateToUrl__Group__1__Impl"


    // $ANTLR start "rule__CheckExists__Group_0__0"
    // InternalBad.g:606:1: rule__CheckExists__Group_0__0 : rule__CheckExists__Group_0__0__Impl rule__CheckExists__Group_0__1 ;
    public final void rule__CheckExists__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:610:1: ( rule__CheckExists__Group_0__0__Impl rule__CheckExists__Group_0__1 )
            // InternalBad.g:611:2: rule__CheckExists__Group_0__0__Impl rule__CheckExists__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__CheckExists__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CheckExists__Group_0__1();

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
    // $ANTLR end "rule__CheckExists__Group_0__0"


    // $ANTLR start "rule__CheckExists__Group_0__0__Impl"
    // InternalBad.g:618:1: rule__CheckExists__Group_0__0__Impl : ( 'CHECK_EXISTS' ) ;
    public final void rule__CheckExists__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:622:1: ( ( 'CHECK_EXISTS' ) )
            // InternalBad.g:623:1: ( 'CHECK_EXISTS' )
            {
            // InternalBad.g:623:1: ( 'CHECK_EXISTS' )
            // InternalBad.g:624:2: 'CHECK_EXISTS'
            {
             before(grammarAccess.getCheckExistsAccess().getCHECK_EXISTSKeyword_0_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCheckExistsAccess().getCHECK_EXISTSKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckExists__Group_0__0__Impl"


    // $ANTLR start "rule__CheckExists__Group_0__1"
    // InternalBad.g:633:1: rule__CheckExists__Group_0__1 : rule__CheckExists__Group_0__1__Impl rule__CheckExists__Group_0__2 ;
    public final void rule__CheckExists__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:637:1: ( rule__CheckExists__Group_0__1__Impl rule__CheckExists__Group_0__2 )
            // InternalBad.g:638:2: rule__CheckExists__Group_0__1__Impl rule__CheckExists__Group_0__2
            {
            pushFollow(FOLLOW_7);
            rule__CheckExists__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CheckExists__Group_0__2();

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
    // $ANTLR end "rule__CheckExists__Group_0__1"


    // $ANTLR start "rule__CheckExists__Group_0__1__Impl"
    // InternalBad.g:645:1: rule__CheckExists__Group_0__1__Impl : ( ( rule__CheckExists__TypeAssignment_0_1 ) ) ;
    public final void rule__CheckExists__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:649:1: ( ( ( rule__CheckExists__TypeAssignment_0_1 ) ) )
            // InternalBad.g:650:1: ( ( rule__CheckExists__TypeAssignment_0_1 ) )
            {
            // InternalBad.g:650:1: ( ( rule__CheckExists__TypeAssignment_0_1 ) )
            // InternalBad.g:651:2: ( rule__CheckExists__TypeAssignment_0_1 )
            {
             before(grammarAccess.getCheckExistsAccess().getTypeAssignment_0_1()); 
            // InternalBad.g:652:2: ( rule__CheckExists__TypeAssignment_0_1 )
            // InternalBad.g:652:3: rule__CheckExists__TypeAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__CheckExists__TypeAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckExistsAccess().getTypeAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckExists__Group_0__1__Impl"


    // $ANTLR start "rule__CheckExists__Group_0__2"
    // InternalBad.g:660:1: rule__CheckExists__Group_0__2 : rule__CheckExists__Group_0__2__Impl ;
    public final void rule__CheckExists__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:664:1: ( rule__CheckExists__Group_0__2__Impl )
            // InternalBad.g:665:2: rule__CheckExists__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CheckExists__Group_0__2__Impl();

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
    // $ANTLR end "rule__CheckExists__Group_0__2"


    // $ANTLR start "rule__CheckExists__Group_0__2__Impl"
    // InternalBad.g:671:1: rule__CheckExists__Group_0__2__Impl : ( ( rule__CheckExists__IdAssignment_0_2 ) ) ;
    public final void rule__CheckExists__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:675:1: ( ( ( rule__CheckExists__IdAssignment_0_2 ) ) )
            // InternalBad.g:676:1: ( ( rule__CheckExists__IdAssignment_0_2 ) )
            {
            // InternalBad.g:676:1: ( ( rule__CheckExists__IdAssignment_0_2 ) )
            // InternalBad.g:677:2: ( rule__CheckExists__IdAssignment_0_2 )
            {
             before(grammarAccess.getCheckExistsAccess().getIdAssignment_0_2()); 
            // InternalBad.g:678:2: ( rule__CheckExists__IdAssignment_0_2 )
            // InternalBad.g:678:3: rule__CheckExists__IdAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__CheckExists__IdAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getCheckExistsAccess().getIdAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckExists__Group_0__2__Impl"


    // $ANTLR start "rule__CheckExists__Group_1__0"
    // InternalBad.g:687:1: rule__CheckExists__Group_1__0 : rule__CheckExists__Group_1__0__Impl rule__CheckExists__Group_1__1 ;
    public final void rule__CheckExists__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:691:1: ( rule__CheckExists__Group_1__0__Impl rule__CheckExists__Group_1__1 )
            // InternalBad.g:692:2: rule__CheckExists__Group_1__0__Impl rule__CheckExists__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__CheckExists__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CheckExists__Group_1__1();

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
    // $ANTLR end "rule__CheckExists__Group_1__0"


    // $ANTLR start "rule__CheckExists__Group_1__0__Impl"
    // InternalBad.g:699:1: rule__CheckExists__Group_1__0__Impl : ( 'CHECK_EXISTS' ) ;
    public final void rule__CheckExists__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:703:1: ( ( 'CHECK_EXISTS' ) )
            // InternalBad.g:704:1: ( 'CHECK_EXISTS' )
            {
            // InternalBad.g:704:1: ( 'CHECK_EXISTS' )
            // InternalBad.g:705:2: 'CHECK_EXISTS'
            {
             before(grammarAccess.getCheckExistsAccess().getCHECK_EXISTSKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCheckExistsAccess().getCHECK_EXISTSKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckExists__Group_1__0__Impl"


    // $ANTLR start "rule__CheckExists__Group_1__1"
    // InternalBad.g:714:1: rule__CheckExists__Group_1__1 : rule__CheckExists__Group_1__1__Impl rule__CheckExists__Group_1__2 ;
    public final void rule__CheckExists__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:718:1: ( rule__CheckExists__Group_1__1__Impl rule__CheckExists__Group_1__2 )
            // InternalBad.g:719:2: rule__CheckExists__Group_1__1__Impl rule__CheckExists__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__CheckExists__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CheckExists__Group_1__2();

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
    // $ANTLR end "rule__CheckExists__Group_1__1"


    // $ANTLR start "rule__CheckExists__Group_1__1__Impl"
    // InternalBad.g:726:1: rule__CheckExists__Group_1__1__Impl : ( ( rule__CheckExists__TypeAssignment_1_1 ) ) ;
    public final void rule__CheckExists__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:730:1: ( ( ( rule__CheckExists__TypeAssignment_1_1 ) ) )
            // InternalBad.g:731:1: ( ( rule__CheckExists__TypeAssignment_1_1 ) )
            {
            // InternalBad.g:731:1: ( ( rule__CheckExists__TypeAssignment_1_1 ) )
            // InternalBad.g:732:2: ( rule__CheckExists__TypeAssignment_1_1 )
            {
             before(grammarAccess.getCheckExistsAccess().getTypeAssignment_1_1()); 
            // InternalBad.g:733:2: ( rule__CheckExists__TypeAssignment_1_1 )
            // InternalBad.g:733:3: rule__CheckExists__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CheckExists__TypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckExistsAccess().getTypeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckExists__Group_1__1__Impl"


    // $ANTLR start "rule__CheckExists__Group_1__2"
    // InternalBad.g:741:1: rule__CheckExists__Group_1__2 : rule__CheckExists__Group_1__2__Impl rule__CheckExists__Group_1__3 ;
    public final void rule__CheckExists__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:745:1: ( rule__CheckExists__Group_1__2__Impl rule__CheckExists__Group_1__3 )
            // InternalBad.g:746:2: rule__CheckExists__Group_1__2__Impl rule__CheckExists__Group_1__3
            {
            pushFollow(FOLLOW_9);
            rule__CheckExists__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CheckExists__Group_1__3();

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
    // $ANTLR end "rule__CheckExists__Group_1__2"


    // $ANTLR start "rule__CheckExists__Group_1__2__Impl"
    // InternalBad.g:753:1: rule__CheckExists__Group_1__2__Impl : ( 'FROM' ) ;
    public final void rule__CheckExists__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:757:1: ( ( 'FROM' ) )
            // InternalBad.g:758:1: ( 'FROM' )
            {
            // InternalBad.g:758:1: ( 'FROM' )
            // InternalBad.g:759:2: 'FROM'
            {
             before(grammarAccess.getCheckExistsAccess().getFROMKeyword_1_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCheckExistsAccess().getFROMKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckExists__Group_1__2__Impl"


    // $ANTLR start "rule__CheckExists__Group_1__3"
    // InternalBad.g:768:1: rule__CheckExists__Group_1__3 : rule__CheckExists__Group_1__3__Impl rule__CheckExists__Group_1__4 ;
    public final void rule__CheckExists__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:772:1: ( rule__CheckExists__Group_1__3__Impl rule__CheckExists__Group_1__4 )
            // InternalBad.g:773:2: rule__CheckExists__Group_1__3__Impl rule__CheckExists__Group_1__4
            {
            pushFollow(FOLLOW_7);
            rule__CheckExists__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CheckExists__Group_1__4();

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
    // $ANTLR end "rule__CheckExists__Group_1__3"


    // $ANTLR start "rule__CheckExists__Group_1__3__Impl"
    // InternalBad.g:780:1: rule__CheckExists__Group_1__3__Impl : ( 'VAR' ) ;
    public final void rule__CheckExists__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:784:1: ( ( 'VAR' ) )
            // InternalBad.g:785:1: ( 'VAR' )
            {
            // InternalBad.g:785:1: ( 'VAR' )
            // InternalBad.g:786:2: 'VAR'
            {
             before(grammarAccess.getCheckExistsAccess().getVARKeyword_1_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCheckExistsAccess().getVARKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckExists__Group_1__3__Impl"


    // $ANTLR start "rule__CheckExists__Group_1__4"
    // InternalBad.g:795:1: rule__CheckExists__Group_1__4 : rule__CheckExists__Group_1__4__Impl ;
    public final void rule__CheckExists__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:799:1: ( rule__CheckExists__Group_1__4__Impl )
            // InternalBad.g:800:2: rule__CheckExists__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CheckExists__Group_1__4__Impl();

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
    // $ANTLR end "rule__CheckExists__Group_1__4"


    // $ANTLR start "rule__CheckExists__Group_1__4__Impl"
    // InternalBad.g:806:1: rule__CheckExists__Group_1__4__Impl : ( ( rule__CheckExists__VarnameAssignment_1_4 ) ) ;
    public final void rule__CheckExists__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:810:1: ( ( ( rule__CheckExists__VarnameAssignment_1_4 ) ) )
            // InternalBad.g:811:1: ( ( rule__CheckExists__VarnameAssignment_1_4 ) )
            {
            // InternalBad.g:811:1: ( ( rule__CheckExists__VarnameAssignment_1_4 ) )
            // InternalBad.g:812:2: ( rule__CheckExists__VarnameAssignment_1_4 )
            {
             before(grammarAccess.getCheckExistsAccess().getVarnameAssignment_1_4()); 
            // InternalBad.g:813:2: ( rule__CheckExists__VarnameAssignment_1_4 )
            // InternalBad.g:813:3: rule__CheckExists__VarnameAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__CheckExists__VarnameAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getCheckExistsAccess().getVarnameAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckExists__Group_1__4__Impl"


    // $ANTLR start "rule__ClickOn__Group_0__0"
    // InternalBad.g:822:1: rule__ClickOn__Group_0__0 : rule__ClickOn__Group_0__0__Impl rule__ClickOn__Group_0__1 ;
    public final void rule__ClickOn__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:826:1: ( rule__ClickOn__Group_0__0__Impl rule__ClickOn__Group_0__1 )
            // InternalBad.g:827:2: rule__ClickOn__Group_0__0__Impl rule__ClickOn__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__ClickOn__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickOn__Group_0__1();

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
    // $ANTLR end "rule__ClickOn__Group_0__0"


    // $ANTLR start "rule__ClickOn__Group_0__0__Impl"
    // InternalBad.g:834:1: rule__ClickOn__Group_0__0__Impl : ( 'CLICK_ON' ) ;
    public final void rule__ClickOn__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:838:1: ( ( 'CLICK_ON' ) )
            // InternalBad.g:839:1: ( 'CLICK_ON' )
            {
            // InternalBad.g:839:1: ( 'CLICK_ON' )
            // InternalBad.g:840:2: 'CLICK_ON'
            {
             before(grammarAccess.getClickOnAccess().getCLICK_ONKeyword_0_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getClickOnAccess().getCLICK_ONKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickOn__Group_0__0__Impl"


    // $ANTLR start "rule__ClickOn__Group_0__1"
    // InternalBad.g:849:1: rule__ClickOn__Group_0__1 : rule__ClickOn__Group_0__1__Impl rule__ClickOn__Group_0__2 ;
    public final void rule__ClickOn__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:853:1: ( rule__ClickOn__Group_0__1__Impl rule__ClickOn__Group_0__2 )
            // InternalBad.g:854:2: rule__ClickOn__Group_0__1__Impl rule__ClickOn__Group_0__2
            {
            pushFollow(FOLLOW_11);
            rule__ClickOn__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickOn__Group_0__2();

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
    // $ANTLR end "rule__ClickOn__Group_0__1"


    // $ANTLR start "rule__ClickOn__Group_0__1__Impl"
    // InternalBad.g:861:1: rule__ClickOn__Group_0__1__Impl : ( ( rule__ClickOn__TypeAssignment_0_1 ) ) ;
    public final void rule__ClickOn__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:865:1: ( ( ( rule__ClickOn__TypeAssignment_0_1 ) ) )
            // InternalBad.g:866:1: ( ( rule__ClickOn__TypeAssignment_0_1 ) )
            {
            // InternalBad.g:866:1: ( ( rule__ClickOn__TypeAssignment_0_1 ) )
            // InternalBad.g:867:2: ( rule__ClickOn__TypeAssignment_0_1 )
            {
             before(grammarAccess.getClickOnAccess().getTypeAssignment_0_1()); 
            // InternalBad.g:868:2: ( rule__ClickOn__TypeAssignment_0_1 )
            // InternalBad.g:868:3: rule__ClickOn__TypeAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ClickOn__TypeAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getClickOnAccess().getTypeAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickOn__Group_0__1__Impl"


    // $ANTLR start "rule__ClickOn__Group_0__2"
    // InternalBad.g:876:1: rule__ClickOn__Group_0__2 : rule__ClickOn__Group_0__2__Impl ;
    public final void rule__ClickOn__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:880:1: ( rule__ClickOn__Group_0__2__Impl )
            // InternalBad.g:881:2: rule__ClickOn__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClickOn__Group_0__2__Impl();

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
    // $ANTLR end "rule__ClickOn__Group_0__2"


    // $ANTLR start "rule__ClickOn__Group_0__2__Impl"
    // InternalBad.g:887:1: rule__ClickOn__Group_0__2__Impl : ( ( rule__ClickOn__Alternatives_0_2 ) ) ;
    public final void rule__ClickOn__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:891:1: ( ( ( rule__ClickOn__Alternatives_0_2 ) ) )
            // InternalBad.g:892:1: ( ( rule__ClickOn__Alternatives_0_2 ) )
            {
            // InternalBad.g:892:1: ( ( rule__ClickOn__Alternatives_0_2 ) )
            // InternalBad.g:893:2: ( rule__ClickOn__Alternatives_0_2 )
            {
             before(grammarAccess.getClickOnAccess().getAlternatives_0_2()); 
            // InternalBad.g:894:2: ( rule__ClickOn__Alternatives_0_2 )
            // InternalBad.g:894:3: rule__ClickOn__Alternatives_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ClickOn__Alternatives_0_2();

            state._fsp--;


            }

             after(grammarAccess.getClickOnAccess().getAlternatives_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickOn__Group_0__2__Impl"


    // $ANTLR start "rule__ClickOn__Group_0_2_1__0"
    // InternalBad.g:903:1: rule__ClickOn__Group_0_2_1__0 : rule__ClickOn__Group_0_2_1__0__Impl rule__ClickOn__Group_0_2_1__1 ;
    public final void rule__ClickOn__Group_0_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:907:1: ( rule__ClickOn__Group_0_2_1__0__Impl rule__ClickOn__Group_0_2_1__1 )
            // InternalBad.g:908:2: rule__ClickOn__Group_0_2_1__0__Impl rule__ClickOn__Group_0_2_1__1
            {
            pushFollow(FOLLOW_7);
            rule__ClickOn__Group_0_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickOn__Group_0_2_1__1();

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
    // $ANTLR end "rule__ClickOn__Group_0_2_1__0"


    // $ANTLR start "rule__ClickOn__Group_0_2_1__0__Impl"
    // InternalBad.g:915:1: rule__ClickOn__Group_0_2_1__0__Impl : ( ( ( 'VAR' ) ) ( ( 'VAR' )* ) ) ;
    public final void rule__ClickOn__Group_0_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:919:1: ( ( ( ( 'VAR' ) ) ( ( 'VAR' )* ) ) )
            // InternalBad.g:920:1: ( ( ( 'VAR' ) ) ( ( 'VAR' )* ) )
            {
            // InternalBad.g:920:1: ( ( ( 'VAR' ) ) ( ( 'VAR' )* ) )
            // InternalBad.g:921:2: ( ( 'VAR' ) ) ( ( 'VAR' )* )
            {
            // InternalBad.g:921:2: ( ( 'VAR' ) )
            // InternalBad.g:922:3: ( 'VAR' )
            {
             before(grammarAccess.getClickOnAccess().getVARKeyword_0_2_1_0()); 
            // InternalBad.g:923:3: ( 'VAR' )
            // InternalBad.g:923:4: 'VAR'
            {
            match(input,23,FOLLOW_12); 

            }

             after(grammarAccess.getClickOnAccess().getVARKeyword_0_2_1_0()); 

            }

            // InternalBad.g:926:2: ( ( 'VAR' )* )
            // InternalBad.g:927:3: ( 'VAR' )*
            {
             before(grammarAccess.getClickOnAccess().getVARKeyword_0_2_1_0()); 
            // InternalBad.g:928:3: ( 'VAR' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBad.g:928:4: 'VAR'
            	    {
            	    match(input,23,FOLLOW_12); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getClickOnAccess().getVARKeyword_0_2_1_0()); 

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
    // $ANTLR end "rule__ClickOn__Group_0_2_1__0__Impl"


    // $ANTLR start "rule__ClickOn__Group_0_2_1__1"
    // InternalBad.g:937:1: rule__ClickOn__Group_0_2_1__1 : rule__ClickOn__Group_0_2_1__1__Impl ;
    public final void rule__ClickOn__Group_0_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:941:1: ( rule__ClickOn__Group_0_2_1__1__Impl )
            // InternalBad.g:942:2: rule__ClickOn__Group_0_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClickOn__Group_0_2_1__1__Impl();

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
    // $ANTLR end "rule__ClickOn__Group_0_2_1__1"


    // $ANTLR start "rule__ClickOn__Group_0_2_1__1__Impl"
    // InternalBad.g:948:1: rule__ClickOn__Group_0_2_1__1__Impl : ( ( rule__ClickOn__VarnameAssignment_0_2_1_1 ) ) ;
    public final void rule__ClickOn__Group_0_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:952:1: ( ( ( rule__ClickOn__VarnameAssignment_0_2_1_1 ) ) )
            // InternalBad.g:953:1: ( ( rule__ClickOn__VarnameAssignment_0_2_1_1 ) )
            {
            // InternalBad.g:953:1: ( ( rule__ClickOn__VarnameAssignment_0_2_1_1 ) )
            // InternalBad.g:954:2: ( rule__ClickOn__VarnameAssignment_0_2_1_1 )
            {
             before(grammarAccess.getClickOnAccess().getVarnameAssignment_0_2_1_1()); 
            // InternalBad.g:955:2: ( rule__ClickOn__VarnameAssignment_0_2_1_1 )
            // InternalBad.g:955:3: rule__ClickOn__VarnameAssignment_0_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ClickOn__VarnameAssignment_0_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getClickOnAccess().getVarnameAssignment_0_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickOn__Group_0_2_1__1__Impl"


    // $ANTLR start "rule__ClickOn__Group_1__0"
    // InternalBad.g:964:1: rule__ClickOn__Group_1__0 : rule__ClickOn__Group_1__0__Impl rule__ClickOn__Group_1__1 ;
    public final void rule__ClickOn__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:968:1: ( rule__ClickOn__Group_1__0__Impl rule__ClickOn__Group_1__1 )
            // InternalBad.g:969:2: rule__ClickOn__Group_1__0__Impl rule__ClickOn__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__ClickOn__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickOn__Group_1__1();

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
    // $ANTLR end "rule__ClickOn__Group_1__0"


    // $ANTLR start "rule__ClickOn__Group_1__0__Impl"
    // InternalBad.g:976:1: rule__ClickOn__Group_1__0__Impl : ( 'CLICK_ON' ) ;
    public final void rule__ClickOn__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:980:1: ( ( 'CLICK_ON' ) )
            // InternalBad.g:981:1: ( 'CLICK_ON' )
            {
            // InternalBad.g:981:1: ( 'CLICK_ON' )
            // InternalBad.g:982:2: 'CLICK_ON'
            {
             before(grammarAccess.getClickOnAccess().getCLICK_ONKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getClickOnAccess().getCLICK_ONKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickOn__Group_1__0__Impl"


    // $ANTLR start "rule__ClickOn__Group_1__1"
    // InternalBad.g:991:1: rule__ClickOn__Group_1__1 : rule__ClickOn__Group_1__1__Impl rule__ClickOn__Group_1__2 ;
    public final void rule__ClickOn__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:995:1: ( rule__ClickOn__Group_1__1__Impl rule__ClickOn__Group_1__2 )
            // InternalBad.g:996:2: rule__ClickOn__Group_1__1__Impl rule__ClickOn__Group_1__2
            {
            pushFollow(FOLLOW_13);
            rule__ClickOn__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickOn__Group_1__2();

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
    // $ANTLR end "rule__ClickOn__Group_1__1"


    // $ANTLR start "rule__ClickOn__Group_1__1__Impl"
    // InternalBad.g:1003:1: rule__ClickOn__Group_1__1__Impl : ( ( rule__ClickOn__TypeAssignment_1_1 ) ) ;
    public final void rule__ClickOn__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1007:1: ( ( ( rule__ClickOn__TypeAssignment_1_1 ) ) )
            // InternalBad.g:1008:1: ( ( rule__ClickOn__TypeAssignment_1_1 ) )
            {
            // InternalBad.g:1008:1: ( ( rule__ClickOn__TypeAssignment_1_1 ) )
            // InternalBad.g:1009:2: ( rule__ClickOn__TypeAssignment_1_1 )
            {
             before(grammarAccess.getClickOnAccess().getTypeAssignment_1_1()); 
            // InternalBad.g:1010:2: ( rule__ClickOn__TypeAssignment_1_1 )
            // InternalBad.g:1010:3: rule__ClickOn__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ClickOn__TypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getClickOnAccess().getTypeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickOn__Group_1__1__Impl"


    // $ANTLR start "rule__ClickOn__Group_1__2"
    // InternalBad.g:1018:1: rule__ClickOn__Group_1__2 : rule__ClickOn__Group_1__2__Impl rule__ClickOn__Group_1__3 ;
    public final void rule__ClickOn__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1022:1: ( rule__ClickOn__Group_1__2__Impl rule__ClickOn__Group_1__3 )
            // InternalBad.g:1023:2: rule__ClickOn__Group_1__2__Impl rule__ClickOn__Group_1__3
            {
            pushFollow(FOLLOW_14);
            rule__ClickOn__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickOn__Group_1__3();

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
    // $ANTLR end "rule__ClickOn__Group_1__2"


    // $ANTLR start "rule__ClickOn__Group_1__2__Impl"
    // InternalBad.g:1030:1: rule__ClickOn__Group_1__2__Impl : ( 'POS' ) ;
    public final void rule__ClickOn__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1034:1: ( ( 'POS' ) )
            // InternalBad.g:1035:1: ( 'POS' )
            {
            // InternalBad.g:1035:1: ( 'POS' )
            // InternalBad.g:1036:2: 'POS'
            {
             before(grammarAccess.getClickOnAccess().getPOSKeyword_1_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getClickOnAccess().getPOSKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickOn__Group_1__2__Impl"


    // $ANTLR start "rule__ClickOn__Group_1__3"
    // InternalBad.g:1045:1: rule__ClickOn__Group_1__3 : rule__ClickOn__Group_1__3__Impl rule__ClickOn__Group_1__4 ;
    public final void rule__ClickOn__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1049:1: ( rule__ClickOn__Group_1__3__Impl rule__ClickOn__Group_1__4 )
            // InternalBad.g:1050:2: rule__ClickOn__Group_1__3__Impl rule__ClickOn__Group_1__4
            {
            pushFollow(FOLLOW_15);
            rule__ClickOn__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickOn__Group_1__4();

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
    // $ANTLR end "rule__ClickOn__Group_1__3"


    // $ANTLR start "rule__ClickOn__Group_1__3__Impl"
    // InternalBad.g:1057:1: rule__ClickOn__Group_1__3__Impl : ( ( rule__ClickOn__Pos_indexAssignment_1_3 ) ) ;
    public final void rule__ClickOn__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1061:1: ( ( ( rule__ClickOn__Pos_indexAssignment_1_3 ) ) )
            // InternalBad.g:1062:1: ( ( rule__ClickOn__Pos_indexAssignment_1_3 ) )
            {
            // InternalBad.g:1062:1: ( ( rule__ClickOn__Pos_indexAssignment_1_3 ) )
            // InternalBad.g:1063:2: ( rule__ClickOn__Pos_indexAssignment_1_3 )
            {
             before(grammarAccess.getClickOnAccess().getPos_indexAssignment_1_3()); 
            // InternalBad.g:1064:2: ( rule__ClickOn__Pos_indexAssignment_1_3 )
            // InternalBad.g:1064:3: rule__ClickOn__Pos_indexAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__ClickOn__Pos_indexAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getClickOnAccess().getPos_indexAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickOn__Group_1__3__Impl"


    // $ANTLR start "rule__ClickOn__Group_1__4"
    // InternalBad.g:1072:1: rule__ClickOn__Group_1__4 : rule__ClickOn__Group_1__4__Impl rule__ClickOn__Group_1__5 ;
    public final void rule__ClickOn__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1076:1: ( rule__ClickOn__Group_1__4__Impl rule__ClickOn__Group_1__5 )
            // InternalBad.g:1077:2: rule__ClickOn__Group_1__4__Impl rule__ClickOn__Group_1__5
            {
            pushFollow(FOLLOW_7);
            rule__ClickOn__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickOn__Group_1__5();

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
    // $ANTLR end "rule__ClickOn__Group_1__4"


    // $ANTLR start "rule__ClickOn__Group_1__4__Impl"
    // InternalBad.g:1084:1: rule__ClickOn__Group_1__4__Impl : ( 'IN' ) ;
    public final void rule__ClickOn__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1088:1: ( ( 'IN' ) )
            // InternalBad.g:1089:1: ( 'IN' )
            {
            // InternalBad.g:1089:1: ( 'IN' )
            // InternalBad.g:1090:2: 'IN'
            {
             before(grammarAccess.getClickOnAccess().getINKeyword_1_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getClickOnAccess().getINKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickOn__Group_1__4__Impl"


    // $ANTLR start "rule__ClickOn__Group_1__5"
    // InternalBad.g:1099:1: rule__ClickOn__Group_1__5 : rule__ClickOn__Group_1__5__Impl ;
    public final void rule__ClickOn__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1103:1: ( rule__ClickOn__Group_1__5__Impl )
            // InternalBad.g:1104:2: rule__ClickOn__Group_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClickOn__Group_1__5__Impl();

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
    // $ANTLR end "rule__ClickOn__Group_1__5"


    // $ANTLR start "rule__ClickOn__Group_1__5__Impl"
    // InternalBad.g:1110:1: rule__ClickOn__Group_1__5__Impl : ( ( rule__ClickOn__IdAssignment_1_5 ) ) ;
    public final void rule__ClickOn__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1114:1: ( ( ( rule__ClickOn__IdAssignment_1_5 ) ) )
            // InternalBad.g:1115:1: ( ( rule__ClickOn__IdAssignment_1_5 ) )
            {
            // InternalBad.g:1115:1: ( ( rule__ClickOn__IdAssignment_1_5 ) )
            // InternalBad.g:1116:2: ( rule__ClickOn__IdAssignment_1_5 )
            {
             before(grammarAccess.getClickOnAccess().getIdAssignment_1_5()); 
            // InternalBad.g:1117:2: ( rule__ClickOn__IdAssignment_1_5 )
            // InternalBad.g:1117:3: rule__ClickOn__IdAssignment_1_5
            {
            pushFollow(FOLLOW_2);
            rule__ClickOn__IdAssignment_1_5();

            state._fsp--;


            }

             after(grammarAccess.getClickOnAccess().getIdAssignment_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickOn__Group_1__5__Impl"


    // $ANTLR start "rule__ClickOn__Group_2__0"
    // InternalBad.g:1126:1: rule__ClickOn__Group_2__0 : rule__ClickOn__Group_2__0__Impl rule__ClickOn__Group_2__1 ;
    public final void rule__ClickOn__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1130:1: ( rule__ClickOn__Group_2__0__Impl rule__ClickOn__Group_2__1 )
            // InternalBad.g:1131:2: rule__ClickOn__Group_2__0__Impl rule__ClickOn__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__ClickOn__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickOn__Group_2__1();

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
    // $ANTLR end "rule__ClickOn__Group_2__0"


    // $ANTLR start "rule__ClickOn__Group_2__0__Impl"
    // InternalBad.g:1138:1: rule__ClickOn__Group_2__0__Impl : ( 'CLICK_ON' ) ;
    public final void rule__ClickOn__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1142:1: ( ( 'CLICK_ON' ) )
            // InternalBad.g:1143:1: ( 'CLICK_ON' )
            {
            // InternalBad.g:1143:1: ( 'CLICK_ON' )
            // InternalBad.g:1144:2: 'CLICK_ON'
            {
             before(grammarAccess.getClickOnAccess().getCLICK_ONKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getClickOnAccess().getCLICK_ONKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickOn__Group_2__0__Impl"


    // $ANTLR start "rule__ClickOn__Group_2__1"
    // InternalBad.g:1153:1: rule__ClickOn__Group_2__1 : rule__ClickOn__Group_2__1__Impl rule__ClickOn__Group_2__2 ;
    public final void rule__ClickOn__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1157:1: ( rule__ClickOn__Group_2__1__Impl rule__ClickOn__Group_2__2 )
            // InternalBad.g:1158:2: rule__ClickOn__Group_2__1__Impl rule__ClickOn__Group_2__2
            {
            pushFollow(FOLLOW_7);
            rule__ClickOn__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickOn__Group_2__2();

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
    // $ANTLR end "rule__ClickOn__Group_2__1"


    // $ANTLR start "rule__ClickOn__Group_2__1__Impl"
    // InternalBad.g:1165:1: rule__ClickOn__Group_2__1__Impl : ( ( rule__ClickOn__TypeAssignment_2_1 ) ) ;
    public final void rule__ClickOn__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1169:1: ( ( ( rule__ClickOn__TypeAssignment_2_1 ) ) )
            // InternalBad.g:1170:1: ( ( rule__ClickOn__TypeAssignment_2_1 ) )
            {
            // InternalBad.g:1170:1: ( ( rule__ClickOn__TypeAssignment_2_1 ) )
            // InternalBad.g:1171:2: ( rule__ClickOn__TypeAssignment_2_1 )
            {
             before(grammarAccess.getClickOnAccess().getTypeAssignment_2_1()); 
            // InternalBad.g:1172:2: ( rule__ClickOn__TypeAssignment_2_1 )
            // InternalBad.g:1172:3: rule__ClickOn__TypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ClickOn__TypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClickOnAccess().getTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickOn__Group_2__1__Impl"


    // $ANTLR start "rule__ClickOn__Group_2__2"
    // InternalBad.g:1180:1: rule__ClickOn__Group_2__2 : rule__ClickOn__Group_2__2__Impl rule__ClickOn__Group_2__3 ;
    public final void rule__ClickOn__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1184:1: ( rule__ClickOn__Group_2__2__Impl rule__ClickOn__Group_2__3 )
            // InternalBad.g:1185:2: rule__ClickOn__Group_2__2__Impl rule__ClickOn__Group_2__3
            {
            pushFollow(FOLLOW_16);
            rule__ClickOn__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickOn__Group_2__3();

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
    // $ANTLR end "rule__ClickOn__Group_2__2"


    // $ANTLR start "rule__ClickOn__Group_2__2__Impl"
    // InternalBad.g:1192:1: rule__ClickOn__Group_2__2__Impl : ( ( rule__ClickOn__Id_comboAssignment_2_2 ) ) ;
    public final void rule__ClickOn__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1196:1: ( ( ( rule__ClickOn__Id_comboAssignment_2_2 ) ) )
            // InternalBad.g:1197:1: ( ( rule__ClickOn__Id_comboAssignment_2_2 ) )
            {
            // InternalBad.g:1197:1: ( ( rule__ClickOn__Id_comboAssignment_2_2 ) )
            // InternalBad.g:1198:2: ( rule__ClickOn__Id_comboAssignment_2_2 )
            {
             before(grammarAccess.getClickOnAccess().getId_comboAssignment_2_2()); 
            // InternalBad.g:1199:2: ( rule__ClickOn__Id_comboAssignment_2_2 )
            // InternalBad.g:1199:3: rule__ClickOn__Id_comboAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__ClickOn__Id_comboAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getClickOnAccess().getId_comboAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickOn__Group_2__2__Impl"


    // $ANTLR start "rule__ClickOn__Group_2__3"
    // InternalBad.g:1207:1: rule__ClickOn__Group_2__3 : rule__ClickOn__Group_2__3__Impl rule__ClickOn__Group_2__4 ;
    public final void rule__ClickOn__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1211:1: ( rule__ClickOn__Group_2__3__Impl rule__ClickOn__Group_2__4 )
            // InternalBad.g:1212:2: rule__ClickOn__Group_2__3__Impl rule__ClickOn__Group_2__4
            {
            pushFollow(FOLLOW_7);
            rule__ClickOn__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClickOn__Group_2__4();

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
    // $ANTLR end "rule__ClickOn__Group_2__3"


    // $ANTLR start "rule__ClickOn__Group_2__3__Impl"
    // InternalBad.g:1219:1: rule__ClickOn__Group_2__3__Impl : ( 'VALUE' ) ;
    public final void rule__ClickOn__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1223:1: ( ( 'VALUE' ) )
            // InternalBad.g:1224:1: ( 'VALUE' )
            {
            // InternalBad.g:1224:1: ( 'VALUE' )
            // InternalBad.g:1225:2: 'VALUE'
            {
             before(grammarAccess.getClickOnAccess().getVALUEKeyword_2_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getClickOnAccess().getVALUEKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickOn__Group_2__3__Impl"


    // $ANTLR start "rule__ClickOn__Group_2__4"
    // InternalBad.g:1234:1: rule__ClickOn__Group_2__4 : rule__ClickOn__Group_2__4__Impl ;
    public final void rule__ClickOn__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1238:1: ( rule__ClickOn__Group_2__4__Impl )
            // InternalBad.g:1239:2: rule__ClickOn__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClickOn__Group_2__4__Impl();

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
    // $ANTLR end "rule__ClickOn__Group_2__4"


    // $ANTLR start "rule__ClickOn__Group_2__4__Impl"
    // InternalBad.g:1245:1: rule__ClickOn__Group_2__4__Impl : ( ( rule__ClickOn__To_selectAssignment_2_4 ) ) ;
    public final void rule__ClickOn__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1249:1: ( ( ( rule__ClickOn__To_selectAssignment_2_4 ) ) )
            // InternalBad.g:1250:1: ( ( rule__ClickOn__To_selectAssignment_2_4 ) )
            {
            // InternalBad.g:1250:1: ( ( rule__ClickOn__To_selectAssignment_2_4 ) )
            // InternalBad.g:1251:2: ( rule__ClickOn__To_selectAssignment_2_4 )
            {
             before(grammarAccess.getClickOnAccess().getTo_selectAssignment_2_4()); 
            // InternalBad.g:1252:2: ( rule__ClickOn__To_selectAssignment_2_4 )
            // InternalBad.g:1252:3: rule__ClickOn__To_selectAssignment_2_4
            {
            pushFollow(FOLLOW_2);
            rule__ClickOn__To_selectAssignment_2_4();

            state._fsp--;


            }

             after(grammarAccess.getClickOnAccess().getTo_selectAssignment_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickOn__Group_2__4__Impl"


    // $ANTLR start "rule__CheckboxAction__Group__0"
    // InternalBad.g:1261:1: rule__CheckboxAction__Group__0 : rule__CheckboxAction__Group__0__Impl rule__CheckboxAction__Group__1 ;
    public final void rule__CheckboxAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1265:1: ( rule__CheckboxAction__Group__0__Impl rule__CheckboxAction__Group__1 )
            // InternalBad.g:1266:2: rule__CheckboxAction__Group__0__Impl rule__CheckboxAction__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__CheckboxAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CheckboxAction__Group__1();

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
    // $ANTLR end "rule__CheckboxAction__Group__0"


    // $ANTLR start "rule__CheckboxAction__Group__0__Impl"
    // InternalBad.g:1273:1: rule__CheckboxAction__Group__0__Impl : ( 'CHECKBOX_ACTION' ) ;
    public final void rule__CheckboxAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1277:1: ( ( 'CHECKBOX_ACTION' ) )
            // InternalBad.g:1278:1: ( 'CHECKBOX_ACTION' )
            {
            // InternalBad.g:1278:1: ( 'CHECKBOX_ACTION' )
            // InternalBad.g:1279:2: 'CHECKBOX_ACTION'
            {
             before(grammarAccess.getCheckboxActionAccess().getCHECKBOX_ACTIONKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCheckboxActionAccess().getCHECKBOX_ACTIONKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxAction__Group__0__Impl"


    // $ANTLR start "rule__CheckboxAction__Group__1"
    // InternalBad.g:1288:1: rule__CheckboxAction__Group__1 : rule__CheckboxAction__Group__1__Impl rule__CheckboxAction__Group__2 ;
    public final void rule__CheckboxAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1292:1: ( rule__CheckboxAction__Group__1__Impl rule__CheckboxAction__Group__2 )
            // InternalBad.g:1293:2: rule__CheckboxAction__Group__1__Impl rule__CheckboxAction__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__CheckboxAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CheckboxAction__Group__2();

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
    // $ANTLR end "rule__CheckboxAction__Group__1"


    // $ANTLR start "rule__CheckboxAction__Group__1__Impl"
    // InternalBad.g:1300:1: rule__CheckboxAction__Group__1__Impl : ( ( rule__CheckboxAction__BoolAssignment_1 ) ) ;
    public final void rule__CheckboxAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1304:1: ( ( ( rule__CheckboxAction__BoolAssignment_1 ) ) )
            // InternalBad.g:1305:1: ( ( rule__CheckboxAction__BoolAssignment_1 ) )
            {
            // InternalBad.g:1305:1: ( ( rule__CheckboxAction__BoolAssignment_1 ) )
            // InternalBad.g:1306:2: ( rule__CheckboxAction__BoolAssignment_1 )
            {
             before(grammarAccess.getCheckboxActionAccess().getBoolAssignment_1()); 
            // InternalBad.g:1307:2: ( rule__CheckboxAction__BoolAssignment_1 )
            // InternalBad.g:1307:3: rule__CheckboxAction__BoolAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CheckboxAction__BoolAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxActionAccess().getBoolAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxAction__Group__1__Impl"


    // $ANTLR start "rule__CheckboxAction__Group__2"
    // InternalBad.g:1315:1: rule__CheckboxAction__Group__2 : rule__CheckboxAction__Group__2__Impl ;
    public final void rule__CheckboxAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1319:1: ( rule__CheckboxAction__Group__2__Impl )
            // InternalBad.g:1320:2: rule__CheckboxAction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CheckboxAction__Group__2__Impl();

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
    // $ANTLR end "rule__CheckboxAction__Group__2"


    // $ANTLR start "rule__CheckboxAction__Group__2__Impl"
    // InternalBad.g:1326:1: rule__CheckboxAction__Group__2__Impl : ( ( rule__CheckboxAction__Alternatives_2 ) ) ;
    public final void rule__CheckboxAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1330:1: ( ( ( rule__CheckboxAction__Alternatives_2 ) ) )
            // InternalBad.g:1331:1: ( ( rule__CheckboxAction__Alternatives_2 ) )
            {
            // InternalBad.g:1331:1: ( ( rule__CheckboxAction__Alternatives_2 ) )
            // InternalBad.g:1332:2: ( rule__CheckboxAction__Alternatives_2 )
            {
             before(grammarAccess.getCheckboxActionAccess().getAlternatives_2()); 
            // InternalBad.g:1333:2: ( rule__CheckboxAction__Alternatives_2 )
            // InternalBad.g:1333:3: rule__CheckboxAction__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__CheckboxAction__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getCheckboxActionAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxAction__Group__2__Impl"


    // $ANTLR start "rule__FillField__Group__0"
    // InternalBad.g:1342:1: rule__FillField__Group__0 : rule__FillField__Group__0__Impl rule__FillField__Group__1 ;
    public final void rule__FillField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1346:1: ( rule__FillField__Group__0__Impl rule__FillField__Group__1 )
            // InternalBad.g:1347:2: rule__FillField__Group__0__Impl rule__FillField__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__FillField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillField__Group__1();

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
    // $ANTLR end "rule__FillField__Group__0"


    // $ANTLR start "rule__FillField__Group__0__Impl"
    // InternalBad.g:1354:1: rule__FillField__Group__0__Impl : ( 'FILL_FIELD' ) ;
    public final void rule__FillField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1358:1: ( ( 'FILL_FIELD' ) )
            // InternalBad.g:1359:1: ( 'FILL_FIELD' )
            {
            // InternalBad.g:1359:1: ( 'FILL_FIELD' )
            // InternalBad.g:1360:2: 'FILL_FIELD'
            {
             before(grammarAccess.getFillFieldAccess().getFILL_FIELDKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFillFieldAccess().getFILL_FIELDKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillField__Group__0__Impl"


    // $ANTLR start "rule__FillField__Group__1"
    // InternalBad.g:1369:1: rule__FillField__Group__1 : rule__FillField__Group__1__Impl rule__FillField__Group__2 ;
    public final void rule__FillField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1373:1: ( rule__FillField__Group__1__Impl rule__FillField__Group__2 )
            // InternalBad.g:1374:2: rule__FillField__Group__1__Impl rule__FillField__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__FillField__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillField__Group__2();

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
    // $ANTLR end "rule__FillField__Group__1"


    // $ANTLR start "rule__FillField__Group__1__Impl"
    // InternalBad.g:1381:1: rule__FillField__Group__1__Impl : ( 'NAME' ) ;
    public final void rule__FillField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1385:1: ( ( 'NAME' ) )
            // InternalBad.g:1386:1: ( 'NAME' )
            {
            // InternalBad.g:1386:1: ( 'NAME' )
            // InternalBad.g:1387:2: 'NAME'
            {
             before(grammarAccess.getFillFieldAccess().getNAMEKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFillFieldAccess().getNAMEKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillField__Group__1__Impl"


    // $ANTLR start "rule__FillField__Group__2"
    // InternalBad.g:1396:1: rule__FillField__Group__2 : rule__FillField__Group__2__Impl rule__FillField__Group__3 ;
    public final void rule__FillField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1400:1: ( rule__FillField__Group__2__Impl rule__FillField__Group__3 )
            // InternalBad.g:1401:2: rule__FillField__Group__2__Impl rule__FillField__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__FillField__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillField__Group__3();

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
    // $ANTLR end "rule__FillField__Group__2"


    // $ANTLR start "rule__FillField__Group__2__Impl"
    // InternalBad.g:1408:1: rule__FillField__Group__2__Impl : ( ( rule__FillField__IdAssignment_2 ) ) ;
    public final void rule__FillField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1412:1: ( ( ( rule__FillField__IdAssignment_2 ) ) )
            // InternalBad.g:1413:1: ( ( rule__FillField__IdAssignment_2 ) )
            {
            // InternalBad.g:1413:1: ( ( rule__FillField__IdAssignment_2 ) )
            // InternalBad.g:1414:2: ( rule__FillField__IdAssignment_2 )
            {
             before(grammarAccess.getFillFieldAccess().getIdAssignment_2()); 
            // InternalBad.g:1415:2: ( rule__FillField__IdAssignment_2 )
            // InternalBad.g:1415:3: rule__FillField__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FillField__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFillFieldAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillField__Group__2__Impl"


    // $ANTLR start "rule__FillField__Group__3"
    // InternalBad.g:1423:1: rule__FillField__Group__3 : rule__FillField__Group__3__Impl rule__FillField__Group__4 ;
    public final void rule__FillField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1427:1: ( rule__FillField__Group__3__Impl rule__FillField__Group__4 )
            // InternalBad.g:1428:2: rule__FillField__Group__3__Impl rule__FillField__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__FillField__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillField__Group__4();

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
    // $ANTLR end "rule__FillField__Group__3"


    // $ANTLR start "rule__FillField__Group__3__Impl"
    // InternalBad.g:1435:1: rule__FillField__Group__3__Impl : ( 'VALUE' ) ;
    public final void rule__FillField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1439:1: ( ( 'VALUE' ) )
            // InternalBad.g:1440:1: ( 'VALUE' )
            {
            // InternalBad.g:1440:1: ( 'VALUE' )
            // InternalBad.g:1441:2: 'VALUE'
            {
             before(grammarAccess.getFillFieldAccess().getVALUEKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFillFieldAccess().getVALUEKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillField__Group__3__Impl"


    // $ANTLR start "rule__FillField__Group__4"
    // InternalBad.g:1450:1: rule__FillField__Group__4 : rule__FillField__Group__4__Impl ;
    public final void rule__FillField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1454:1: ( rule__FillField__Group__4__Impl )
            // InternalBad.g:1455:2: rule__FillField__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FillField__Group__4__Impl();

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
    // $ANTLR end "rule__FillField__Group__4"


    // $ANTLR start "rule__FillField__Group__4__Impl"
    // InternalBad.g:1461:1: rule__FillField__Group__4__Impl : ( ( rule__FillField__Alternatives_4 ) ) ;
    public final void rule__FillField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1465:1: ( ( ( rule__FillField__Alternatives_4 ) ) )
            // InternalBad.g:1466:1: ( ( rule__FillField__Alternatives_4 ) )
            {
            // InternalBad.g:1466:1: ( ( rule__FillField__Alternatives_4 ) )
            // InternalBad.g:1467:2: ( rule__FillField__Alternatives_4 )
            {
             before(grammarAccess.getFillFieldAccess().getAlternatives_4()); 
            // InternalBad.g:1468:2: ( rule__FillField__Alternatives_4 )
            // InternalBad.g:1468:3: rule__FillField__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__FillField__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getFillFieldAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillField__Group__4__Impl"


    // $ANTLR start "rule__FillField__Group_4_1__0"
    // InternalBad.g:1477:1: rule__FillField__Group_4_1__0 : rule__FillField__Group_4_1__0__Impl rule__FillField__Group_4_1__1 ;
    public final void rule__FillField__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1481:1: ( rule__FillField__Group_4_1__0__Impl rule__FillField__Group_4_1__1 )
            // InternalBad.g:1482:2: rule__FillField__Group_4_1__0__Impl rule__FillField__Group_4_1__1
            {
            pushFollow(FOLLOW_9);
            rule__FillField__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillField__Group_4_1__1();

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
    // $ANTLR end "rule__FillField__Group_4_1__0"


    // $ANTLR start "rule__FillField__Group_4_1__0__Impl"
    // InternalBad.g:1489:1: rule__FillField__Group_4_1__0__Impl : ( 'FROM' ) ;
    public final void rule__FillField__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1493:1: ( ( 'FROM' ) )
            // InternalBad.g:1494:1: ( 'FROM' )
            {
            // InternalBad.g:1494:1: ( 'FROM' )
            // InternalBad.g:1495:2: 'FROM'
            {
             before(grammarAccess.getFillFieldAccess().getFROMKeyword_4_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFillFieldAccess().getFROMKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillField__Group_4_1__0__Impl"


    // $ANTLR start "rule__FillField__Group_4_1__1"
    // InternalBad.g:1504:1: rule__FillField__Group_4_1__1 : rule__FillField__Group_4_1__1__Impl rule__FillField__Group_4_1__2 ;
    public final void rule__FillField__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1508:1: ( rule__FillField__Group_4_1__1__Impl rule__FillField__Group_4_1__2 )
            // InternalBad.g:1509:2: rule__FillField__Group_4_1__1__Impl rule__FillField__Group_4_1__2
            {
            pushFollow(FOLLOW_7);
            rule__FillField__Group_4_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FillField__Group_4_1__2();

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
    // $ANTLR end "rule__FillField__Group_4_1__1"


    // $ANTLR start "rule__FillField__Group_4_1__1__Impl"
    // InternalBad.g:1516:1: rule__FillField__Group_4_1__1__Impl : ( 'VAR' ) ;
    public final void rule__FillField__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1520:1: ( ( 'VAR' ) )
            // InternalBad.g:1521:1: ( 'VAR' )
            {
            // InternalBad.g:1521:1: ( 'VAR' )
            // InternalBad.g:1522:2: 'VAR'
            {
             before(grammarAccess.getFillFieldAccess().getVARKeyword_4_1_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFillFieldAccess().getVARKeyword_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillField__Group_4_1__1__Impl"


    // $ANTLR start "rule__FillField__Group_4_1__2"
    // InternalBad.g:1531:1: rule__FillField__Group_4_1__2 : rule__FillField__Group_4_1__2__Impl ;
    public final void rule__FillField__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1535:1: ( rule__FillField__Group_4_1__2__Impl )
            // InternalBad.g:1536:2: rule__FillField__Group_4_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FillField__Group_4_1__2__Impl();

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
    // $ANTLR end "rule__FillField__Group_4_1__2"


    // $ANTLR start "rule__FillField__Group_4_1__2__Impl"
    // InternalBad.g:1542:1: rule__FillField__Group_4_1__2__Impl : ( ( rule__FillField__VarnameAssignment_4_1_2 ) ) ;
    public final void rule__FillField__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1546:1: ( ( ( rule__FillField__VarnameAssignment_4_1_2 ) ) )
            // InternalBad.g:1547:1: ( ( rule__FillField__VarnameAssignment_4_1_2 ) )
            {
            // InternalBad.g:1547:1: ( ( rule__FillField__VarnameAssignment_4_1_2 ) )
            // InternalBad.g:1548:2: ( rule__FillField__VarnameAssignment_4_1_2 )
            {
             before(grammarAccess.getFillFieldAccess().getVarnameAssignment_4_1_2()); 
            // InternalBad.g:1549:2: ( rule__FillField__VarnameAssignment_4_1_2 )
            // InternalBad.g:1549:3: rule__FillField__VarnameAssignment_4_1_2
            {
            pushFollow(FOLLOW_2);
            rule__FillField__VarnameAssignment_4_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFillFieldAccess().getVarnameAssignment_4_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillField__Group_4_1__2__Impl"


    // $ANTLR start "rule__StoreElement__Group_0__0"
    // InternalBad.g:1558:1: rule__StoreElement__Group_0__0 : rule__StoreElement__Group_0__0__Impl rule__StoreElement__Group_0__1 ;
    public final void rule__StoreElement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1562:1: ( rule__StoreElement__Group_0__0__Impl rule__StoreElement__Group_0__1 )
            // InternalBad.g:1563:2: rule__StoreElement__Group_0__0__Impl rule__StoreElement__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__StoreElement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoreElement__Group_0__1();

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
    // $ANTLR end "rule__StoreElement__Group_0__0"


    // $ANTLR start "rule__StoreElement__Group_0__0__Impl"
    // InternalBad.g:1570:1: rule__StoreElement__Group_0__0__Impl : ( 'STORE_ELEMENT' ) ;
    public final void rule__StoreElement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1574:1: ( ( 'STORE_ELEMENT' ) )
            // InternalBad.g:1575:1: ( 'STORE_ELEMENT' )
            {
            // InternalBad.g:1575:1: ( 'STORE_ELEMENT' )
            // InternalBad.g:1576:2: 'STORE_ELEMENT'
            {
             before(grammarAccess.getStoreElementAccess().getSTORE_ELEMENTKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getStoreElementAccess().getSTORE_ELEMENTKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreElement__Group_0__0__Impl"


    // $ANTLR start "rule__StoreElement__Group_0__1"
    // InternalBad.g:1585:1: rule__StoreElement__Group_0__1 : rule__StoreElement__Group_0__1__Impl rule__StoreElement__Group_0__2 ;
    public final void rule__StoreElement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1589:1: ( rule__StoreElement__Group_0__1__Impl rule__StoreElement__Group_0__2 )
            // InternalBad.g:1590:2: rule__StoreElement__Group_0__1__Impl rule__StoreElement__Group_0__2
            {
            pushFollow(FOLLOW_14);
            rule__StoreElement__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoreElement__Group_0__2();

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
    // $ANTLR end "rule__StoreElement__Group_0__1"


    // $ANTLR start "rule__StoreElement__Group_0__1__Impl"
    // InternalBad.g:1597:1: rule__StoreElement__Group_0__1__Impl : ( 'POS' ) ;
    public final void rule__StoreElement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1601:1: ( ( 'POS' ) )
            // InternalBad.g:1602:1: ( 'POS' )
            {
            // InternalBad.g:1602:1: ( 'POS' )
            // InternalBad.g:1603:2: 'POS'
            {
             before(grammarAccess.getStoreElementAccess().getPOSKeyword_0_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStoreElementAccess().getPOSKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreElement__Group_0__1__Impl"


    // $ANTLR start "rule__StoreElement__Group_0__2"
    // InternalBad.g:1612:1: rule__StoreElement__Group_0__2 : rule__StoreElement__Group_0__2__Impl rule__StoreElement__Group_0__3 ;
    public final void rule__StoreElement__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1616:1: ( rule__StoreElement__Group_0__2__Impl rule__StoreElement__Group_0__3 )
            // InternalBad.g:1617:2: rule__StoreElement__Group_0__2__Impl rule__StoreElement__Group_0__3
            {
            pushFollow(FOLLOW_8);
            rule__StoreElement__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoreElement__Group_0__3();

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
    // $ANTLR end "rule__StoreElement__Group_0__2"


    // $ANTLR start "rule__StoreElement__Group_0__2__Impl"
    // InternalBad.g:1624:1: rule__StoreElement__Group_0__2__Impl : ( ( rule__StoreElement__Pos_indexAssignment_0_2 ) ) ;
    public final void rule__StoreElement__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1628:1: ( ( ( rule__StoreElement__Pos_indexAssignment_0_2 ) ) )
            // InternalBad.g:1629:1: ( ( rule__StoreElement__Pos_indexAssignment_0_2 ) )
            {
            // InternalBad.g:1629:1: ( ( rule__StoreElement__Pos_indexAssignment_0_2 ) )
            // InternalBad.g:1630:2: ( rule__StoreElement__Pos_indexAssignment_0_2 )
            {
             before(grammarAccess.getStoreElementAccess().getPos_indexAssignment_0_2()); 
            // InternalBad.g:1631:2: ( rule__StoreElement__Pos_indexAssignment_0_2 )
            // InternalBad.g:1631:3: rule__StoreElement__Pos_indexAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__StoreElement__Pos_indexAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getStoreElementAccess().getPos_indexAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreElement__Group_0__2__Impl"


    // $ANTLR start "rule__StoreElement__Group_0__3"
    // InternalBad.g:1639:1: rule__StoreElement__Group_0__3 : rule__StoreElement__Group_0__3__Impl rule__StoreElement__Group_0__4 ;
    public final void rule__StoreElement__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1643:1: ( rule__StoreElement__Group_0__3__Impl rule__StoreElement__Group_0__4 )
            // InternalBad.g:1644:2: rule__StoreElement__Group_0__3__Impl rule__StoreElement__Group_0__4
            {
            pushFollow(FOLLOW_7);
            rule__StoreElement__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoreElement__Group_0__4();

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
    // $ANTLR end "rule__StoreElement__Group_0__3"


    // $ANTLR start "rule__StoreElement__Group_0__3__Impl"
    // InternalBad.g:1651:1: rule__StoreElement__Group_0__3__Impl : ( 'FROM' ) ;
    public final void rule__StoreElement__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1655:1: ( ( 'FROM' ) )
            // InternalBad.g:1656:1: ( 'FROM' )
            {
            // InternalBad.g:1656:1: ( 'FROM' )
            // InternalBad.g:1657:2: 'FROM'
            {
             before(grammarAccess.getStoreElementAccess().getFROMKeyword_0_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getStoreElementAccess().getFROMKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreElement__Group_0__3__Impl"


    // $ANTLR start "rule__StoreElement__Group_0__4"
    // InternalBad.g:1666:1: rule__StoreElement__Group_0__4 : rule__StoreElement__Group_0__4__Impl rule__StoreElement__Group_0__5 ;
    public final void rule__StoreElement__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1670:1: ( rule__StoreElement__Group_0__4__Impl rule__StoreElement__Group_0__5 )
            // InternalBad.g:1671:2: rule__StoreElement__Group_0__4__Impl rule__StoreElement__Group_0__5
            {
            pushFollow(FOLLOW_21);
            rule__StoreElement__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoreElement__Group_0__5();

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
    // $ANTLR end "rule__StoreElement__Group_0__4"


    // $ANTLR start "rule__StoreElement__Group_0__4__Impl"
    // InternalBad.g:1678:1: rule__StoreElement__Group_0__4__Impl : ( ( rule__StoreElement__Id_fromAssignment_0_4 ) ) ;
    public final void rule__StoreElement__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1682:1: ( ( ( rule__StoreElement__Id_fromAssignment_0_4 ) ) )
            // InternalBad.g:1683:1: ( ( rule__StoreElement__Id_fromAssignment_0_4 ) )
            {
            // InternalBad.g:1683:1: ( ( rule__StoreElement__Id_fromAssignment_0_4 ) )
            // InternalBad.g:1684:2: ( rule__StoreElement__Id_fromAssignment_0_4 )
            {
             before(grammarAccess.getStoreElementAccess().getId_fromAssignment_0_4()); 
            // InternalBad.g:1685:2: ( rule__StoreElement__Id_fromAssignment_0_4 )
            // InternalBad.g:1685:3: rule__StoreElement__Id_fromAssignment_0_4
            {
            pushFollow(FOLLOW_2);
            rule__StoreElement__Id_fromAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getStoreElementAccess().getId_fromAssignment_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreElement__Group_0__4__Impl"


    // $ANTLR start "rule__StoreElement__Group_0__5"
    // InternalBad.g:1693:1: rule__StoreElement__Group_0__5 : rule__StoreElement__Group_0__5__Impl rule__StoreElement__Group_0__6 ;
    public final void rule__StoreElement__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1697:1: ( rule__StoreElement__Group_0__5__Impl rule__StoreElement__Group_0__6 )
            // InternalBad.g:1698:2: rule__StoreElement__Group_0__5__Impl rule__StoreElement__Group_0__6
            {
            pushFollow(FOLLOW_7);
            rule__StoreElement__Group_0__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoreElement__Group_0__6();

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
    // $ANTLR end "rule__StoreElement__Group_0__5"


    // $ANTLR start "rule__StoreElement__Group_0__5__Impl"
    // InternalBad.g:1705:1: rule__StoreElement__Group_0__5__Impl : ( 'PROP' ) ;
    public final void rule__StoreElement__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1709:1: ( ( 'PROP' ) )
            // InternalBad.g:1710:1: ( 'PROP' )
            {
            // InternalBad.g:1710:1: ( 'PROP' )
            // InternalBad.g:1711:2: 'PROP'
            {
             before(grammarAccess.getStoreElementAccess().getPROPKeyword_0_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getStoreElementAccess().getPROPKeyword_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreElement__Group_0__5__Impl"


    // $ANTLR start "rule__StoreElement__Group_0__6"
    // InternalBad.g:1720:1: rule__StoreElement__Group_0__6 : rule__StoreElement__Group_0__6__Impl rule__StoreElement__Group_0__7 ;
    public final void rule__StoreElement__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1724:1: ( rule__StoreElement__Group_0__6__Impl rule__StoreElement__Group_0__7 )
            // InternalBad.g:1725:2: rule__StoreElement__Group_0__6__Impl rule__StoreElement__Group_0__7
            {
            pushFollow(FOLLOW_15);
            rule__StoreElement__Group_0__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoreElement__Group_0__7();

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
    // $ANTLR end "rule__StoreElement__Group_0__6"


    // $ANTLR start "rule__StoreElement__Group_0__6__Impl"
    // InternalBad.g:1732:1: rule__StoreElement__Group_0__6__Impl : ( ( rule__StoreElement__Prop_nameAssignment_0_6 ) ) ;
    public final void rule__StoreElement__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1736:1: ( ( ( rule__StoreElement__Prop_nameAssignment_0_6 ) ) )
            // InternalBad.g:1737:1: ( ( rule__StoreElement__Prop_nameAssignment_0_6 ) )
            {
            // InternalBad.g:1737:1: ( ( rule__StoreElement__Prop_nameAssignment_0_6 ) )
            // InternalBad.g:1738:2: ( rule__StoreElement__Prop_nameAssignment_0_6 )
            {
             before(grammarAccess.getStoreElementAccess().getProp_nameAssignment_0_6()); 
            // InternalBad.g:1739:2: ( rule__StoreElement__Prop_nameAssignment_0_6 )
            // InternalBad.g:1739:3: rule__StoreElement__Prop_nameAssignment_0_6
            {
            pushFollow(FOLLOW_2);
            rule__StoreElement__Prop_nameAssignment_0_6();

            state._fsp--;


            }

             after(grammarAccess.getStoreElementAccess().getProp_nameAssignment_0_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreElement__Group_0__6__Impl"


    // $ANTLR start "rule__StoreElement__Group_0__7"
    // InternalBad.g:1747:1: rule__StoreElement__Group_0__7 : rule__StoreElement__Group_0__7__Impl rule__StoreElement__Group_0__8 ;
    public final void rule__StoreElement__Group_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1751:1: ( rule__StoreElement__Group_0__7__Impl rule__StoreElement__Group_0__8 )
            // InternalBad.g:1752:2: rule__StoreElement__Group_0__7__Impl rule__StoreElement__Group_0__8
            {
            pushFollow(FOLLOW_9);
            rule__StoreElement__Group_0__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoreElement__Group_0__8();

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
    // $ANTLR end "rule__StoreElement__Group_0__7"


    // $ANTLR start "rule__StoreElement__Group_0__7__Impl"
    // InternalBad.g:1759:1: rule__StoreElement__Group_0__7__Impl : ( 'IN' ) ;
    public final void rule__StoreElement__Group_0__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1763:1: ( ( 'IN' ) )
            // InternalBad.g:1764:1: ( 'IN' )
            {
            // InternalBad.g:1764:1: ( 'IN' )
            // InternalBad.g:1765:2: 'IN'
            {
             before(grammarAccess.getStoreElementAccess().getINKeyword_0_7()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStoreElementAccess().getINKeyword_0_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreElement__Group_0__7__Impl"


    // $ANTLR start "rule__StoreElement__Group_0__8"
    // InternalBad.g:1774:1: rule__StoreElement__Group_0__8 : rule__StoreElement__Group_0__8__Impl rule__StoreElement__Group_0__9 ;
    public final void rule__StoreElement__Group_0__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1778:1: ( rule__StoreElement__Group_0__8__Impl rule__StoreElement__Group_0__9 )
            // InternalBad.g:1779:2: rule__StoreElement__Group_0__8__Impl rule__StoreElement__Group_0__9
            {
            pushFollow(FOLLOW_7);
            rule__StoreElement__Group_0__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoreElement__Group_0__9();

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
    // $ANTLR end "rule__StoreElement__Group_0__8"


    // $ANTLR start "rule__StoreElement__Group_0__8__Impl"
    // InternalBad.g:1786:1: rule__StoreElement__Group_0__8__Impl : ( 'VAR' ) ;
    public final void rule__StoreElement__Group_0__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1790:1: ( ( 'VAR' ) )
            // InternalBad.g:1791:1: ( 'VAR' )
            {
            // InternalBad.g:1791:1: ( 'VAR' )
            // InternalBad.g:1792:2: 'VAR'
            {
             before(grammarAccess.getStoreElementAccess().getVARKeyword_0_8()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStoreElementAccess().getVARKeyword_0_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreElement__Group_0__8__Impl"


    // $ANTLR start "rule__StoreElement__Group_0__9"
    // InternalBad.g:1801:1: rule__StoreElement__Group_0__9 : rule__StoreElement__Group_0__9__Impl ;
    public final void rule__StoreElement__Group_0__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1805:1: ( rule__StoreElement__Group_0__9__Impl )
            // InternalBad.g:1806:2: rule__StoreElement__Group_0__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StoreElement__Group_0__9__Impl();

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
    // $ANTLR end "rule__StoreElement__Group_0__9"


    // $ANTLR start "rule__StoreElement__Group_0__9__Impl"
    // InternalBad.g:1812:1: rule__StoreElement__Group_0__9__Impl : ( ( rule__StoreElement__VarnameAssignment_0_9 ) ) ;
    public final void rule__StoreElement__Group_0__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1816:1: ( ( ( rule__StoreElement__VarnameAssignment_0_9 ) ) )
            // InternalBad.g:1817:1: ( ( rule__StoreElement__VarnameAssignment_0_9 ) )
            {
            // InternalBad.g:1817:1: ( ( rule__StoreElement__VarnameAssignment_0_9 ) )
            // InternalBad.g:1818:2: ( rule__StoreElement__VarnameAssignment_0_9 )
            {
             before(grammarAccess.getStoreElementAccess().getVarnameAssignment_0_9()); 
            // InternalBad.g:1819:2: ( rule__StoreElement__VarnameAssignment_0_9 )
            // InternalBad.g:1819:3: rule__StoreElement__VarnameAssignment_0_9
            {
            pushFollow(FOLLOW_2);
            rule__StoreElement__VarnameAssignment_0_9();

            state._fsp--;


            }

             after(grammarAccess.getStoreElementAccess().getVarnameAssignment_0_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreElement__Group_0__9__Impl"


    // $ANTLR start "rule__StoreElement__Group_1__0"
    // InternalBad.g:1828:1: rule__StoreElement__Group_1__0 : rule__StoreElement__Group_1__0__Impl rule__StoreElement__Group_1__1 ;
    public final void rule__StoreElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1832:1: ( rule__StoreElement__Group_1__0__Impl rule__StoreElement__Group_1__1 )
            // InternalBad.g:1833:2: rule__StoreElement__Group_1__0__Impl rule__StoreElement__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__StoreElement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoreElement__Group_1__1();

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
    // $ANTLR end "rule__StoreElement__Group_1__0"


    // $ANTLR start "rule__StoreElement__Group_1__0__Impl"
    // InternalBad.g:1840:1: rule__StoreElement__Group_1__0__Impl : ( 'STORE_ELEMENT' ) ;
    public final void rule__StoreElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1844:1: ( ( 'STORE_ELEMENT' ) )
            // InternalBad.g:1845:1: ( 'STORE_ELEMENT' )
            {
            // InternalBad.g:1845:1: ( 'STORE_ELEMENT' )
            // InternalBad.g:1846:2: 'STORE_ELEMENT'
            {
             before(grammarAccess.getStoreElementAccess().getSTORE_ELEMENTKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getStoreElementAccess().getSTORE_ELEMENTKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreElement__Group_1__0__Impl"


    // $ANTLR start "rule__StoreElement__Group_1__1"
    // InternalBad.g:1855:1: rule__StoreElement__Group_1__1 : rule__StoreElement__Group_1__1__Impl rule__StoreElement__Group_1__2 ;
    public final void rule__StoreElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1859:1: ( rule__StoreElement__Group_1__1__Impl rule__StoreElement__Group_1__2 )
            // InternalBad.g:1860:2: rule__StoreElement__Group_1__1__Impl rule__StoreElement__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__StoreElement__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoreElement__Group_1__2();

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
    // $ANTLR end "rule__StoreElement__Group_1__1"


    // $ANTLR start "rule__StoreElement__Group_1__1__Impl"
    // InternalBad.g:1867:1: rule__StoreElement__Group_1__1__Impl : ( 'FROM' ) ;
    public final void rule__StoreElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1871:1: ( ( 'FROM' ) )
            // InternalBad.g:1872:1: ( 'FROM' )
            {
            // InternalBad.g:1872:1: ( 'FROM' )
            // InternalBad.g:1873:2: 'FROM'
            {
             before(grammarAccess.getStoreElementAccess().getFROMKeyword_1_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getStoreElementAccess().getFROMKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreElement__Group_1__1__Impl"


    // $ANTLR start "rule__StoreElement__Group_1__2"
    // InternalBad.g:1882:1: rule__StoreElement__Group_1__2 : rule__StoreElement__Group_1__2__Impl rule__StoreElement__Group_1__3 ;
    public final void rule__StoreElement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1886:1: ( rule__StoreElement__Group_1__2__Impl rule__StoreElement__Group_1__3 )
            // InternalBad.g:1887:2: rule__StoreElement__Group_1__2__Impl rule__StoreElement__Group_1__3
            {
            pushFollow(FOLLOW_21);
            rule__StoreElement__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoreElement__Group_1__3();

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
    // $ANTLR end "rule__StoreElement__Group_1__2"


    // $ANTLR start "rule__StoreElement__Group_1__2__Impl"
    // InternalBad.g:1894:1: rule__StoreElement__Group_1__2__Impl : ( ( rule__StoreElement__Id_fromAssignment_1_2 ) ) ;
    public final void rule__StoreElement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1898:1: ( ( ( rule__StoreElement__Id_fromAssignment_1_2 ) ) )
            // InternalBad.g:1899:1: ( ( rule__StoreElement__Id_fromAssignment_1_2 ) )
            {
            // InternalBad.g:1899:1: ( ( rule__StoreElement__Id_fromAssignment_1_2 ) )
            // InternalBad.g:1900:2: ( rule__StoreElement__Id_fromAssignment_1_2 )
            {
             before(grammarAccess.getStoreElementAccess().getId_fromAssignment_1_2()); 
            // InternalBad.g:1901:2: ( rule__StoreElement__Id_fromAssignment_1_2 )
            // InternalBad.g:1901:3: rule__StoreElement__Id_fromAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__StoreElement__Id_fromAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getStoreElementAccess().getId_fromAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreElement__Group_1__2__Impl"


    // $ANTLR start "rule__StoreElement__Group_1__3"
    // InternalBad.g:1909:1: rule__StoreElement__Group_1__3 : rule__StoreElement__Group_1__3__Impl rule__StoreElement__Group_1__4 ;
    public final void rule__StoreElement__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1913:1: ( rule__StoreElement__Group_1__3__Impl rule__StoreElement__Group_1__4 )
            // InternalBad.g:1914:2: rule__StoreElement__Group_1__3__Impl rule__StoreElement__Group_1__4
            {
            pushFollow(FOLLOW_7);
            rule__StoreElement__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoreElement__Group_1__4();

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
    // $ANTLR end "rule__StoreElement__Group_1__3"


    // $ANTLR start "rule__StoreElement__Group_1__3__Impl"
    // InternalBad.g:1921:1: rule__StoreElement__Group_1__3__Impl : ( 'PROP' ) ;
    public final void rule__StoreElement__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1925:1: ( ( 'PROP' ) )
            // InternalBad.g:1926:1: ( 'PROP' )
            {
            // InternalBad.g:1926:1: ( 'PROP' )
            // InternalBad.g:1927:2: 'PROP'
            {
             before(grammarAccess.getStoreElementAccess().getPROPKeyword_1_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getStoreElementAccess().getPROPKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreElement__Group_1__3__Impl"


    // $ANTLR start "rule__StoreElement__Group_1__4"
    // InternalBad.g:1936:1: rule__StoreElement__Group_1__4 : rule__StoreElement__Group_1__4__Impl rule__StoreElement__Group_1__5 ;
    public final void rule__StoreElement__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1940:1: ( rule__StoreElement__Group_1__4__Impl rule__StoreElement__Group_1__5 )
            // InternalBad.g:1941:2: rule__StoreElement__Group_1__4__Impl rule__StoreElement__Group_1__5
            {
            pushFollow(FOLLOW_15);
            rule__StoreElement__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoreElement__Group_1__5();

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
    // $ANTLR end "rule__StoreElement__Group_1__4"


    // $ANTLR start "rule__StoreElement__Group_1__4__Impl"
    // InternalBad.g:1948:1: rule__StoreElement__Group_1__4__Impl : ( ( rule__StoreElement__Prop_nameAssignment_1_4 ) ) ;
    public final void rule__StoreElement__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1952:1: ( ( ( rule__StoreElement__Prop_nameAssignment_1_4 ) ) )
            // InternalBad.g:1953:1: ( ( rule__StoreElement__Prop_nameAssignment_1_4 ) )
            {
            // InternalBad.g:1953:1: ( ( rule__StoreElement__Prop_nameAssignment_1_4 ) )
            // InternalBad.g:1954:2: ( rule__StoreElement__Prop_nameAssignment_1_4 )
            {
             before(grammarAccess.getStoreElementAccess().getProp_nameAssignment_1_4()); 
            // InternalBad.g:1955:2: ( rule__StoreElement__Prop_nameAssignment_1_4 )
            // InternalBad.g:1955:3: rule__StoreElement__Prop_nameAssignment_1_4
            {
            pushFollow(FOLLOW_2);
            rule__StoreElement__Prop_nameAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getStoreElementAccess().getProp_nameAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreElement__Group_1__4__Impl"


    // $ANTLR start "rule__StoreElement__Group_1__5"
    // InternalBad.g:1963:1: rule__StoreElement__Group_1__5 : rule__StoreElement__Group_1__5__Impl rule__StoreElement__Group_1__6 ;
    public final void rule__StoreElement__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1967:1: ( rule__StoreElement__Group_1__5__Impl rule__StoreElement__Group_1__6 )
            // InternalBad.g:1968:2: rule__StoreElement__Group_1__5__Impl rule__StoreElement__Group_1__6
            {
            pushFollow(FOLLOW_9);
            rule__StoreElement__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoreElement__Group_1__6();

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
    // $ANTLR end "rule__StoreElement__Group_1__5"


    // $ANTLR start "rule__StoreElement__Group_1__5__Impl"
    // InternalBad.g:1975:1: rule__StoreElement__Group_1__5__Impl : ( 'IN' ) ;
    public final void rule__StoreElement__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1979:1: ( ( 'IN' ) )
            // InternalBad.g:1980:1: ( 'IN' )
            {
            // InternalBad.g:1980:1: ( 'IN' )
            // InternalBad.g:1981:2: 'IN'
            {
             before(grammarAccess.getStoreElementAccess().getINKeyword_1_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStoreElementAccess().getINKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreElement__Group_1__5__Impl"


    // $ANTLR start "rule__StoreElement__Group_1__6"
    // InternalBad.g:1990:1: rule__StoreElement__Group_1__6 : rule__StoreElement__Group_1__6__Impl rule__StoreElement__Group_1__7 ;
    public final void rule__StoreElement__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:1994:1: ( rule__StoreElement__Group_1__6__Impl rule__StoreElement__Group_1__7 )
            // InternalBad.g:1995:2: rule__StoreElement__Group_1__6__Impl rule__StoreElement__Group_1__7
            {
            pushFollow(FOLLOW_7);
            rule__StoreElement__Group_1__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StoreElement__Group_1__7();

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
    // $ANTLR end "rule__StoreElement__Group_1__6"


    // $ANTLR start "rule__StoreElement__Group_1__6__Impl"
    // InternalBad.g:2002:1: rule__StoreElement__Group_1__6__Impl : ( 'VAR' ) ;
    public final void rule__StoreElement__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:2006:1: ( ( 'VAR' ) )
            // InternalBad.g:2007:1: ( 'VAR' )
            {
            // InternalBad.g:2007:1: ( 'VAR' )
            // InternalBad.g:2008:2: 'VAR'
            {
             before(grammarAccess.getStoreElementAccess().getVARKeyword_1_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStoreElementAccess().getVARKeyword_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreElement__Group_1__6__Impl"


    // $ANTLR start "rule__StoreElement__Group_1__7"
    // InternalBad.g:2017:1: rule__StoreElement__Group_1__7 : rule__StoreElement__Group_1__7__Impl ;
    public final void rule__StoreElement__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:2021:1: ( rule__StoreElement__Group_1__7__Impl )
            // InternalBad.g:2022:2: rule__StoreElement__Group_1__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StoreElement__Group_1__7__Impl();

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
    // $ANTLR end "rule__StoreElement__Group_1__7"


    // $ANTLR start "rule__StoreElement__Group_1__7__Impl"
    // InternalBad.g:2028:1: rule__StoreElement__Group_1__7__Impl : ( ( rule__StoreElement__VarnameAssignment_1_7 ) ) ;
    public final void rule__StoreElement__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:2032:1: ( ( ( rule__StoreElement__VarnameAssignment_1_7 ) ) )
            // InternalBad.g:2033:1: ( ( rule__StoreElement__VarnameAssignment_1_7 ) )
            {
            // InternalBad.g:2033:1: ( ( rule__StoreElement__VarnameAssignment_1_7 ) )
            // InternalBad.g:2034:2: ( rule__StoreElement__VarnameAssignment_1_7 )
            {
             before(grammarAccess.getStoreElementAccess().getVarnameAssignment_1_7()); 
            // InternalBad.g:2035:2: ( rule__StoreElement__VarnameAssignment_1_7 )
            // InternalBad.g:2035:3: rule__StoreElement__VarnameAssignment_1_7
            {
            pushFollow(FOLLOW_2);
            rule__StoreElement__VarnameAssignment_1_7();

            state._fsp--;


            }

             after(grammarAccess.getStoreElementAccess().getVarnameAssignment_1_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreElement__Group_1__7__Impl"


    // $ANTLR start "rule__Program__InstructionsAssignment"
    // InternalBad.g:2044:1: rule__Program__InstructionsAssignment : ( ruleInstruction ) ;
    public final void rule__Program__InstructionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:2048:1: ( ( ruleInstruction ) )
            // InternalBad.g:2049:2: ( ruleInstruction )
            {
            // InternalBad.g:2049:2: ( ruleInstruction )
            // InternalBad.g:2050:3: ruleInstruction
            {
             before(grammarAccess.getProgramAccess().getInstructionsInstructionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getInstructionsInstructionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__InstructionsAssignment"


    // $ANTLR start "rule__NavigateToUrl__UrlAssignment_1"
    // InternalBad.g:2059:1: rule__NavigateToUrl__UrlAssignment_1 : ( RULE_URL ) ;
    public final void rule__NavigateToUrl__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:2063:1: ( ( RULE_URL ) )
            // InternalBad.g:2064:2: ( RULE_URL )
            {
            // InternalBad.g:2064:2: ( RULE_URL )
            // InternalBad.g:2065:3: RULE_URL
            {
             before(grammarAccess.getNavigateToUrlAccess().getUrlURLTerminalRuleCall_1_0()); 
            match(input,RULE_URL,FOLLOW_2); 
             after(grammarAccess.getNavigateToUrlAccess().getUrlURLTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavigateToUrl__UrlAssignment_1"


    // $ANTLR start "rule__CheckExists__TypeAssignment_0_1"
    // InternalBad.g:2074:1: rule__CheckExists__TypeAssignment_0_1 : ( ruleElemType ) ;
    public final void rule__CheckExists__TypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:2078:1: ( ( ruleElemType ) )
            // InternalBad.g:2079:2: ( ruleElemType )
            {
            // InternalBad.g:2079:2: ( ruleElemType )
            // InternalBad.g:2080:3: ruleElemType
            {
             before(grammarAccess.getCheckExistsAccess().getTypeElemTypeEnumRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElemType();

            state._fsp--;

             after(grammarAccess.getCheckExistsAccess().getTypeElemTypeEnumRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckExists__TypeAssignment_0_1"


    // $ANTLR start "rule__CheckExists__IdAssignment_0_2"
    // InternalBad.g:2089:1: rule__CheckExists__IdAssignment_0_2 : ( RULE_STRING ) ;
    public final void rule__CheckExists__IdAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:2093:1: ( ( RULE_STRING ) )
            // InternalBad.g:2094:2: ( RULE_STRING )
            {
            // InternalBad.g:2094:2: ( RULE_STRING )
            // InternalBad.g:2095:3: RULE_STRING
            {
             before(grammarAccess.getCheckExistsAccess().getIdSTRINGTerminalRuleCall_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCheckExistsAccess().getIdSTRINGTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckExists__IdAssignment_0_2"


    // $ANTLR start "rule__CheckExists__TypeAssignment_1_1"
    // InternalBad.g:2104:1: rule__CheckExists__TypeAssignment_1_1 : ( ruleElemType ) ;
    public final void rule__CheckExists__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:2108:1: ( ( ruleElemType ) )
            // InternalBad.g:2109:2: ( ruleElemType )
            {
            // InternalBad.g:2109:2: ( ruleElemType )
            // InternalBad.g:2110:3: ruleElemType
            {
             before(grammarAccess.getCheckExistsAccess().getTypeElemTypeEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElemType();

            state._fsp--;

             after(grammarAccess.getCheckExistsAccess().getTypeElemTypeEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckExists__TypeAssignment_1_1"


    // $ANTLR start "rule__CheckExists__VarnameAssignment_1_4"
    // InternalBad.g:2119:1: rule__CheckExists__VarnameAssignment_1_4 : ( RULE_STRING ) ;
    public final void rule__CheckExists__VarnameAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:2123:1: ( ( RULE_STRING ) )
            // InternalBad.g:2124:2: ( RULE_STRING )
            {
            // InternalBad.g:2124:2: ( RULE_STRING )
            // InternalBad.g:2125:3: RULE_STRING
            {
             before(grammarAccess.getCheckExistsAccess().getVarnameSTRINGTerminalRuleCall_1_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCheckExistsAccess().getVarnameSTRINGTerminalRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckExists__VarnameAssignment_1_4"


    // $ANTLR start "rule__ClickOn__TypeAssignment_0_1"
    // InternalBad.g:2134:1: rule__ClickOn__TypeAssignment_0_1 : ( ruleClickType ) ;
    public final void rule__ClickOn__TypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:2138:1: ( ( ruleClickType ) )
            // InternalBad.g:2139:2: ( ruleClickType )
            {
            // InternalBad.g:2139:2: ( ruleClickType )
            // InternalBad.g:2140:3: ruleClickType
            {
             before(grammarAccess.getClickOnAccess().getTypeClickTypeEnumRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClickType();

            state._fsp--;

             after(grammarAccess.getClickOnAccess().getTypeClickTypeEnumRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickOn__TypeAssignment_0_1"


    // $ANTLR start "rule__ClickOn__IdAssignment_0_2_0"
    // InternalBad.g:2149:1: rule__ClickOn__IdAssignment_0_2_0 : ( RULE_STRING ) ;
    public final void rule__ClickOn__IdAssignment_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:2153:1: ( ( RULE_STRING ) )
            // InternalBad.g:2154:2: ( RULE_STRING )
            {
            // InternalBad.g:2154:2: ( RULE_STRING )
            // InternalBad.g:2155:3: RULE_STRING
            {
             before(grammarAccess.getClickOnAccess().getIdSTRINGTerminalRuleCall_0_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getClickOnAccess().getIdSTRINGTerminalRuleCall_0_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickOn__IdAssignment_0_2_0"


    // $ANTLR start "rule__ClickOn__VarnameAssignment_0_2_1_1"
    // InternalBad.g:2164:1: rule__ClickOn__VarnameAssignment_0_2_1_1 : ( RULE_STRING ) ;
    public final void rule__ClickOn__VarnameAssignment_0_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:2168:1: ( ( RULE_STRING ) )
            // InternalBad.g:2169:2: ( RULE_STRING )
            {
            // InternalBad.g:2169:2: ( RULE_STRING )
            // InternalBad.g:2170:3: RULE_STRING
            {
             before(grammarAccess.getClickOnAccess().getVarnameSTRINGTerminalRuleCall_0_2_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getClickOnAccess().getVarnameSTRINGTerminalRuleCall_0_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickOn__VarnameAssignment_0_2_1_1"


    // $ANTLR start "rule__ClickOn__TypeAssignment_1_1"
    // InternalBad.g:2179:1: rule__ClickOn__TypeAssignment_1_1 : ( ruleClickType ) ;
    public final void rule__ClickOn__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:2183:1: ( ( ruleClickType ) )
            // InternalBad.g:2184:2: ( ruleClickType )
            {
            // InternalBad.g:2184:2: ( ruleClickType )
            // InternalBad.g:2185:3: ruleClickType
            {
             before(grammarAccess.getClickOnAccess().getTypeClickTypeEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClickType();

            state._fsp--;

             after(grammarAccess.getClickOnAccess().getTypeClickTypeEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickOn__TypeAssignment_1_1"


    // $ANTLR start "rule__ClickOn__Pos_indexAssignment_1_3"
    // InternalBad.g:2194:1: rule__ClickOn__Pos_indexAssignment_1_3 : ( RULE_INT ) ;
    public final void rule__ClickOn__Pos_indexAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:2198:1: ( ( RULE_INT ) )
            // InternalBad.g:2199:2: ( RULE_INT )
            {
            // InternalBad.g:2199:2: ( RULE_INT )
            // InternalBad.g:2200:3: RULE_INT
            {
             before(grammarAccess.getClickOnAccess().getPos_indexINTTerminalRuleCall_1_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getClickOnAccess().getPos_indexINTTerminalRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickOn__Pos_indexAssignment_1_3"


    // $ANTLR start "rule__ClickOn__IdAssignment_1_5"
    // InternalBad.g:2209:1: rule__ClickOn__IdAssignment_1_5 : ( RULE_STRING ) ;
    public final void rule__ClickOn__IdAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:2213:1: ( ( RULE_STRING ) )
            // InternalBad.g:2214:2: ( RULE_STRING )
            {
            // InternalBad.g:2214:2: ( RULE_STRING )
            // InternalBad.g:2215:3: RULE_STRING
            {
             before(grammarAccess.getClickOnAccess().getIdSTRINGTerminalRuleCall_1_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getClickOnAccess().getIdSTRINGTerminalRuleCall_1_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickOn__IdAssignment_1_5"


    // $ANTLR start "rule__ClickOn__TypeAssignment_2_1"
    // InternalBad.g:2224:1: rule__ClickOn__TypeAssignment_2_1 : ( ruleClickType ) ;
    public final void rule__ClickOn__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:2228:1: ( ( ruleClickType ) )
            // InternalBad.g:2229:2: ( ruleClickType )
            {
            // InternalBad.g:2229:2: ( ruleClickType )
            // InternalBad.g:2230:3: ruleClickType
            {
             before(grammarAccess.getClickOnAccess().getTypeClickTypeEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClickType();

            state._fsp--;

             after(grammarAccess.getClickOnAccess().getTypeClickTypeEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickOn__TypeAssignment_2_1"


    // $ANTLR start "rule__ClickOn__Id_comboAssignment_2_2"
    // InternalBad.g:2239:1: rule__ClickOn__Id_comboAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__ClickOn__Id_comboAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:2243:1: ( ( RULE_STRING ) )
            // InternalBad.g:2244:2: ( RULE_STRING )
            {
            // InternalBad.g:2244:2: ( RULE_STRING )
            // InternalBad.g:2245:3: RULE_STRING
            {
             before(grammarAccess.getClickOnAccess().getId_comboSTRINGTerminalRuleCall_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getClickOnAccess().getId_comboSTRINGTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickOn__Id_comboAssignment_2_2"


    // $ANTLR start "rule__ClickOn__To_selectAssignment_2_4"
    // InternalBad.g:2254:1: rule__ClickOn__To_selectAssignment_2_4 : ( RULE_STRING ) ;
    public final void rule__ClickOn__To_selectAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:2258:1: ( ( RULE_STRING ) )
            // InternalBad.g:2259:2: ( RULE_STRING )
            {
            // InternalBad.g:2259:2: ( RULE_STRING )
            // InternalBad.g:2260:3: RULE_STRING
            {
             before(grammarAccess.getClickOnAccess().getTo_selectSTRINGTerminalRuleCall_2_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getClickOnAccess().getTo_selectSTRINGTerminalRuleCall_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClickOn__To_selectAssignment_2_4"


    // $ANTLR start "rule__CheckboxAction__BoolAssignment_1"
    // InternalBad.g:2269:1: rule__CheckboxAction__BoolAssignment_1 : ( ruleBoolString ) ;
    public final void rule__CheckboxAction__BoolAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:2273:1: ( ( ruleBoolString ) )
            // InternalBad.g:2274:2: ( ruleBoolString )
            {
            // InternalBad.g:2274:2: ( ruleBoolString )
            // InternalBad.g:2275:3: ruleBoolString
            {
             before(grammarAccess.getCheckboxActionAccess().getBoolBoolStringEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolString();

            state._fsp--;

             after(grammarAccess.getCheckboxActionAccess().getBoolBoolStringEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxAction__BoolAssignment_1"


    // $ANTLR start "rule__CheckboxAction__ActionsAssignment_2_1"
    // InternalBad.g:2284:1: rule__CheckboxAction__ActionsAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__CheckboxAction__ActionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:2288:1: ( ( RULE_STRING ) )
            // InternalBad.g:2289:2: ( RULE_STRING )
            {
            // InternalBad.g:2289:2: ( RULE_STRING )
            // InternalBad.g:2290:3: RULE_STRING
            {
             before(grammarAccess.getCheckboxActionAccess().getActionsSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCheckboxActionAccess().getActionsSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CheckboxAction__ActionsAssignment_2_1"


    // $ANTLR start "rule__FillField__IdAssignment_2"
    // InternalBad.g:2299:1: rule__FillField__IdAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FillField__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:2303:1: ( ( RULE_STRING ) )
            // InternalBad.g:2304:2: ( RULE_STRING )
            {
            // InternalBad.g:2304:2: ( RULE_STRING )
            // InternalBad.g:2305:3: RULE_STRING
            {
             before(grammarAccess.getFillFieldAccess().getIdSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFillFieldAccess().getIdSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillField__IdAssignment_2"


    // $ANTLR start "rule__FillField__ValueAssignment_4_0"
    // InternalBad.g:2314:1: rule__FillField__ValueAssignment_4_0 : ( RULE_STRING ) ;
    public final void rule__FillField__ValueAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:2318:1: ( ( RULE_STRING ) )
            // InternalBad.g:2319:2: ( RULE_STRING )
            {
            // InternalBad.g:2319:2: ( RULE_STRING )
            // InternalBad.g:2320:3: RULE_STRING
            {
             before(grammarAccess.getFillFieldAccess().getValueSTRINGTerminalRuleCall_4_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFillFieldAccess().getValueSTRINGTerminalRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillField__ValueAssignment_4_0"


    // $ANTLR start "rule__FillField__VarnameAssignment_4_1_2"
    // InternalBad.g:2329:1: rule__FillField__VarnameAssignment_4_1_2 : ( RULE_STRING ) ;
    public final void rule__FillField__VarnameAssignment_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:2333:1: ( ( RULE_STRING ) )
            // InternalBad.g:2334:2: ( RULE_STRING )
            {
            // InternalBad.g:2334:2: ( RULE_STRING )
            // InternalBad.g:2335:3: RULE_STRING
            {
             before(grammarAccess.getFillFieldAccess().getVarnameSTRINGTerminalRuleCall_4_1_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFillFieldAccess().getVarnameSTRINGTerminalRuleCall_4_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FillField__VarnameAssignment_4_1_2"


    // $ANTLR start "rule__StoreElement__Pos_indexAssignment_0_2"
    // InternalBad.g:2344:1: rule__StoreElement__Pos_indexAssignment_0_2 : ( RULE_INT ) ;
    public final void rule__StoreElement__Pos_indexAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:2348:1: ( ( RULE_INT ) )
            // InternalBad.g:2349:2: ( RULE_INT )
            {
            // InternalBad.g:2349:2: ( RULE_INT )
            // InternalBad.g:2350:3: RULE_INT
            {
             before(grammarAccess.getStoreElementAccess().getPos_indexINTTerminalRuleCall_0_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getStoreElementAccess().getPos_indexINTTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreElement__Pos_indexAssignment_0_2"


    // $ANTLR start "rule__StoreElement__Id_fromAssignment_0_4"
    // InternalBad.g:2359:1: rule__StoreElement__Id_fromAssignment_0_4 : ( RULE_STRING ) ;
    public final void rule__StoreElement__Id_fromAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:2363:1: ( ( RULE_STRING ) )
            // InternalBad.g:2364:2: ( RULE_STRING )
            {
            // InternalBad.g:2364:2: ( RULE_STRING )
            // InternalBad.g:2365:3: RULE_STRING
            {
             before(grammarAccess.getStoreElementAccess().getId_fromSTRINGTerminalRuleCall_0_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStoreElementAccess().getId_fromSTRINGTerminalRuleCall_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreElement__Id_fromAssignment_0_4"


    // $ANTLR start "rule__StoreElement__Prop_nameAssignment_0_6"
    // InternalBad.g:2374:1: rule__StoreElement__Prop_nameAssignment_0_6 : ( RULE_STRING ) ;
    public final void rule__StoreElement__Prop_nameAssignment_0_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:2378:1: ( ( RULE_STRING ) )
            // InternalBad.g:2379:2: ( RULE_STRING )
            {
            // InternalBad.g:2379:2: ( RULE_STRING )
            // InternalBad.g:2380:3: RULE_STRING
            {
             before(grammarAccess.getStoreElementAccess().getProp_nameSTRINGTerminalRuleCall_0_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStoreElementAccess().getProp_nameSTRINGTerminalRuleCall_0_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreElement__Prop_nameAssignment_0_6"


    // $ANTLR start "rule__StoreElement__VarnameAssignment_0_9"
    // InternalBad.g:2389:1: rule__StoreElement__VarnameAssignment_0_9 : ( RULE_STRING ) ;
    public final void rule__StoreElement__VarnameAssignment_0_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:2393:1: ( ( RULE_STRING ) )
            // InternalBad.g:2394:2: ( RULE_STRING )
            {
            // InternalBad.g:2394:2: ( RULE_STRING )
            // InternalBad.g:2395:3: RULE_STRING
            {
             before(grammarAccess.getStoreElementAccess().getVarnameSTRINGTerminalRuleCall_0_9_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStoreElementAccess().getVarnameSTRINGTerminalRuleCall_0_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreElement__VarnameAssignment_0_9"


    // $ANTLR start "rule__StoreElement__Id_fromAssignment_1_2"
    // InternalBad.g:2404:1: rule__StoreElement__Id_fromAssignment_1_2 : ( RULE_STRING ) ;
    public final void rule__StoreElement__Id_fromAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:2408:1: ( ( RULE_STRING ) )
            // InternalBad.g:2409:2: ( RULE_STRING )
            {
            // InternalBad.g:2409:2: ( RULE_STRING )
            // InternalBad.g:2410:3: RULE_STRING
            {
             before(grammarAccess.getStoreElementAccess().getId_fromSTRINGTerminalRuleCall_1_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStoreElementAccess().getId_fromSTRINGTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreElement__Id_fromAssignment_1_2"


    // $ANTLR start "rule__StoreElement__Prop_nameAssignment_1_4"
    // InternalBad.g:2419:1: rule__StoreElement__Prop_nameAssignment_1_4 : ( RULE_STRING ) ;
    public final void rule__StoreElement__Prop_nameAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:2423:1: ( ( RULE_STRING ) )
            // InternalBad.g:2424:2: ( RULE_STRING )
            {
            // InternalBad.g:2424:2: ( RULE_STRING )
            // InternalBad.g:2425:3: RULE_STRING
            {
             before(grammarAccess.getStoreElementAccess().getProp_nameSTRINGTerminalRuleCall_1_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStoreElementAccess().getProp_nameSTRINGTerminalRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreElement__Prop_nameAssignment_1_4"


    // $ANTLR start "rule__StoreElement__VarnameAssignment_1_7"
    // InternalBad.g:2434:1: rule__StoreElement__VarnameAssignment_1_7 : ( RULE_STRING ) ;
    public final void rule__StoreElement__VarnameAssignment_1_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBad.g:2438:1: ( ( RULE_STRING ) )
            // InternalBad.g:2439:2: ( RULE_STRING )
            {
            // InternalBad.g:2439:2: ( RULE_STRING )
            // InternalBad.g:2440:3: RULE_STRING
            {
             before(grammarAccess.getStoreElementAccess().getVarnameSTRINGTerminalRuleCall_1_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStoreElementAccess().getVarnameSTRINGTerminalRuleCall_1_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StoreElement__VarnameAssignment_1_7"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\6\uffff\1\10\3\uffff";
    static final String dfa_3s = "\1\30\1\15\4\5\1\24\3\uffff";
    static final String dfa_4s = "\1\30\1\20\4\31\1\37\3\uffff";
    static final String dfa_5s = "\7\uffff\1\2\1\1\1\3";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2\1\3\1\4\1\5",
            "\1\6\21\uffff\1\10\1\uffff\1\7",
            "\1\6\21\uffff\1\10\1\uffff\1\7",
            "\1\6\21\uffff\1\10\1\uffff\1\7",
            "\1\6\21\uffff\1\10\1\uffff\1\7",
            "\2\10\2\uffff\1\10\2\uffff\1\11\2\10\1\uffff\1\10",
            "",
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "366:1: rule__ClickOn__Alternatives : ( ( ( rule__ClickOn__Group_0__0 ) ) | ( ( rule__ClickOn__Group_1__0 ) ) | ( ( rule__ClickOn__Group_2__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000B1300002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});

}