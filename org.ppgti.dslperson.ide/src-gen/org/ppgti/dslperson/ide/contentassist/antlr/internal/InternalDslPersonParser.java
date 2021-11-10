package org.ppgti.dslperson.ide.contentassist.antlr.internal;

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
import org.ppgti.dslperson.services.DslPersonGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslPersonParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ANY_OTHER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'true'", "'false'", "'person'", "'{'", "'}'", "','", "'.'", "'-'", "':'", "'/'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=7;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalDslPersonParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslPersonParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslPersonParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDslPerson.g"; }


    	private DslPersonGrammarAccess grammarAccess;

    	public void setGrammarAccess(DslPersonGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRulePersons"
    // InternalDslPerson.g:53:1: entryRulePersons : rulePersons EOF ;
    public final void entryRulePersons() throws RecognitionException {
        try {
            // InternalDslPerson.g:54:1: ( rulePersons EOF )
            // InternalDslPerson.g:55:1: rulePersons EOF
            {
             before(grammarAccess.getPersonsRule()); 
            pushFollow(FOLLOW_1);
            rulePersons();

            state._fsp--;

             after(grammarAccess.getPersonsRule()); 
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
    // $ANTLR end "entryRulePersons"


    // $ANTLR start "rulePersons"
    // InternalDslPerson.g:62:1: rulePersons : ( ( rule__Persons__PersonsAssignment )* ) ;
    public final void rulePersons() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:66:2: ( ( ( rule__Persons__PersonsAssignment )* ) )
            // InternalDslPerson.g:67:2: ( ( rule__Persons__PersonsAssignment )* )
            {
            // InternalDslPerson.g:67:2: ( ( rule__Persons__PersonsAssignment )* )
            // InternalDslPerson.g:68:3: ( rule__Persons__PersonsAssignment )*
            {
             before(grammarAccess.getPersonsAccess().getPersonsAssignment()); 
            // InternalDslPerson.g:69:3: ( rule__Persons__PersonsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDslPerson.g:69:4: rule__Persons__PersonsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Persons__PersonsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getPersonsAccess().getPersonsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePersons"


    // $ANTLR start "entryRulePerson"
    // InternalDslPerson.g:78:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalDslPerson.g:79:1: ( rulePerson EOF )
            // InternalDslPerson.g:80:1: rulePerson EOF
            {
             before(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPersonRule()); 
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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalDslPerson.g:87:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:91:2: ( ( ( rule__Person__Group__0 ) ) )
            // InternalDslPerson.g:92:2: ( ( rule__Person__Group__0 ) )
            {
            // InternalDslPerson.g:92:2: ( ( rule__Person__Group__0 ) )
            // InternalDslPerson.g:93:3: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // InternalDslPerson.g:94:3: ( rule__Person__Group__0 )
            // InternalDslPerson.g:94:4: rule__Person__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleValidID"
    // InternalDslPerson.g:103:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // InternalDslPerson.g:104:1: ( ruleValidID EOF )
            // InternalDslPerson.g:105:1: ruleValidID EOF
            {
             before(grammarAccess.getValidIDRule()); 
            pushFollow(FOLLOW_1);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getValidIDRule()); 
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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalDslPerson.g:112:1: ruleValidID : ( ( rule__ValidID__Alternatives ) ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:116:2: ( ( ( rule__ValidID__Alternatives ) ) )
            // InternalDslPerson.g:117:2: ( ( rule__ValidID__Alternatives ) )
            {
            // InternalDslPerson.g:117:2: ( ( rule__ValidID__Alternatives ) )
            // InternalDslPerson.g:118:3: ( rule__ValidID__Alternatives )
            {
             before(grammarAccess.getValidIDAccess().getAlternatives()); 
            // InternalDslPerson.g:119:3: ( rule__ValidID__Alternatives )
            // InternalDslPerson.g:119:4: rule__ValidID__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ValidID__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValidIDAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleCpf"
    // InternalDslPerson.g:128:1: entryRuleCpf : ruleCpf EOF ;
    public final void entryRuleCpf() throws RecognitionException {
        try {
            // InternalDslPerson.g:129:1: ( ruleCpf EOF )
            // InternalDslPerson.g:130:1: ruleCpf EOF
            {
             before(grammarAccess.getCpfRule()); 
            pushFollow(FOLLOW_1);
            ruleCpf();

            state._fsp--;

             after(grammarAccess.getCpfRule()); 
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
    // $ANTLR end "entryRuleCpf"


    // $ANTLR start "ruleCpf"
    // InternalDslPerson.g:137:1: ruleCpf : ( ( rule__Cpf__Group__0 ) ) ;
    public final void ruleCpf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:141:2: ( ( ( rule__Cpf__Group__0 ) ) )
            // InternalDslPerson.g:142:2: ( ( rule__Cpf__Group__0 ) )
            {
            // InternalDslPerson.g:142:2: ( ( rule__Cpf__Group__0 ) )
            // InternalDslPerson.g:143:3: ( rule__Cpf__Group__0 )
            {
             before(grammarAccess.getCpfAccess().getGroup()); 
            // InternalDslPerson.g:144:3: ( rule__Cpf__Group__0 )
            // InternalDslPerson.g:144:4: rule__Cpf__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cpf__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCpfAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCpf"


    // $ANTLR start "entryRuleAttribute"
    // InternalDslPerson.g:153:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalDslPerson.g:154:1: ( ruleAttribute EOF )
            // InternalDslPerson.g:155:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalDslPerson.g:162:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:166:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalDslPerson.g:167:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalDslPerson.g:167:2: ( ( rule__Attribute__Group__0 ) )
            // InternalDslPerson.g:168:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalDslPerson.g:169:3: ( rule__Attribute__Group__0 )
            // InternalDslPerson.g:169:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleValue"
    // InternalDslPerson.g:178:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalDslPerson.g:179:1: ( ruleValue EOF )
            // InternalDslPerson.g:180:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalDslPerson.g:187:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:191:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalDslPerson.g:192:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalDslPerson.g:192:2: ( ( rule__Value__Alternatives ) )
            // InternalDslPerson.g:193:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalDslPerson.g:194:3: ( rule__Value__Alternatives )
            // InternalDslPerson.g:194:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleDate"
    // InternalDslPerson.g:203:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // InternalDslPerson.g:204:1: ( ruleDate EOF )
            // InternalDslPerson.g:205:1: ruleDate EOF
            {
             before(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_1);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDateRule()); 
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
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // InternalDslPerson.g:212:1: ruleDate : ( ( rule__Date__Group__0 ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:216:2: ( ( ( rule__Date__Group__0 ) ) )
            // InternalDslPerson.g:217:2: ( ( rule__Date__Group__0 ) )
            {
            // InternalDslPerson.g:217:2: ( ( rule__Date__Group__0 ) )
            // InternalDslPerson.g:218:3: ( rule__Date__Group__0 )
            {
             before(grammarAccess.getDateAccess().getGroup()); 
            // InternalDslPerson.g:219:3: ( rule__Date__Group__0 )
            // InternalDslPerson.g:219:4: rule__Date__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Date__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleBoolean"
    // InternalDslPerson.g:228:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalDslPerson.g:229:1: ( ruleBoolean EOF )
            // InternalDslPerson.g:230:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalDslPerson.g:237:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:241:2: ( ( ( rule__Boolean__Alternatives ) ) )
            // InternalDslPerson.g:242:2: ( ( rule__Boolean__Alternatives ) )
            {
            // InternalDslPerson.g:242:2: ( ( rule__Boolean__Alternatives ) )
            // InternalDslPerson.g:243:3: ( rule__Boolean__Alternatives )
            {
             before(grammarAccess.getBooleanAccess().getAlternatives()); 
            // InternalDslPerson.g:244:3: ( rule__Boolean__Alternatives )
            // InternalDslPerson.g:244:4: rule__Boolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "rule__ValidID__Alternatives"
    // InternalDslPerson.g:252:1: rule__ValidID__Alternatives : ( ( RULE_ID ) | ( ruleCpf ) );
    public final void rule__ValidID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:256:1: ( ( RULE_ID ) | ( ruleCpf ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_INT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDslPerson.g:257:2: ( RULE_ID )
                    {
                    // InternalDslPerson.g:257:2: ( RULE_ID )
                    // InternalDslPerson.g:258:3: RULE_ID
                    {
                     before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDslPerson.g:263:2: ( ruleCpf )
                    {
                    // InternalDslPerson.g:263:2: ( ruleCpf )
                    // InternalDslPerson.g:264:3: ruleCpf
                    {
                     before(grammarAccess.getValidIDAccess().getCpfParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCpf();

                    state._fsp--;

                     after(grammarAccess.getValidIDAccess().getCpfParserRuleCall_1()); 

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
    // $ANTLR end "rule__ValidID__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalDslPerson.g:273:1: rule__Value__Alternatives : ( ( RULE_INT ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) | ( ruleDate ) | ( ruleBoolean ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:277:1: ( ( RULE_INT ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) | ( ruleDate ) | ( ruleBoolean ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||(LA3_1>=15 && LA3_1<=16)) ) {
                    alt3=1;
                }
                else if ( (LA3_1==20) ) {
                    alt3=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt3=2;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt3=3;
                }
                break;
            case 11:
            case 12:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDslPerson.g:278:2: ( RULE_INT )
                    {
                    // InternalDslPerson.g:278:2: ( RULE_INT )
                    // InternalDslPerson.g:279:3: RULE_INT
                    {
                     before(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDslPerson.g:284:2: ( RULE_STRING )
                    {
                    // InternalDslPerson.g:284:2: ( RULE_STRING )
                    // InternalDslPerson.g:285:3: RULE_STRING
                    {
                     before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDslPerson.g:290:2: ( RULE_ANY_OTHER )
                    {
                    // InternalDslPerson.g:290:2: ( RULE_ANY_OTHER )
                    // InternalDslPerson.g:291:3: RULE_ANY_OTHER
                    {
                     before(grammarAccess.getValueAccess().getANY_OTHERTerminalRuleCall_2()); 
                    match(input,RULE_ANY_OTHER,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getANY_OTHERTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDslPerson.g:296:2: ( ruleDate )
                    {
                    // InternalDslPerson.g:296:2: ( ruleDate )
                    // InternalDslPerson.g:297:3: ruleDate
                    {
                     before(grammarAccess.getValueAccess().getDateParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDate();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getDateParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDslPerson.g:302:2: ( ruleBoolean )
                    {
                    // InternalDslPerson.g:302:2: ( ruleBoolean )
                    // InternalDslPerson.g:303:3: ruleBoolean
                    {
                     before(grammarAccess.getValueAccess().getBooleanParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleBoolean();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getBooleanParserRuleCall_4()); 

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
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Boolean__Alternatives"
    // InternalDslPerson.g:312:1: rule__Boolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:316:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDslPerson.g:317:2: ( 'true' )
                    {
                    // InternalDslPerson.g:317:2: ( 'true' )
                    // InternalDslPerson.g:318:3: 'true'
                    {
                     before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDslPerson.g:323:2: ( 'false' )
                    {
                    // InternalDslPerson.g:323:2: ( 'false' )
                    // InternalDslPerson.g:324:3: 'false'
                    {
                     before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__Boolean__Alternatives"


    // $ANTLR start "rule__Person__Group__0"
    // InternalDslPerson.g:333:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:337:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalDslPerson.g:338:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Person__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__1();

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
    // $ANTLR end "rule__Person__Group__0"


    // $ANTLR start "rule__Person__Group__0__Impl"
    // InternalDslPerson.g:345:1: rule__Person__Group__0__Impl : ( 'person' ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:349:1: ( ( 'person' ) )
            // InternalDslPerson.g:350:1: ( 'person' )
            {
            // InternalDslPerson.g:350:1: ( 'person' )
            // InternalDslPerson.g:351:2: 'person'
            {
             before(grammarAccess.getPersonAccess().getPersonKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getPersonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__0__Impl"


    // $ANTLR start "rule__Person__Group__1"
    // InternalDslPerson.g:360:1: rule__Person__Group__1 : rule__Person__Group__1__Impl rule__Person__Group__2 ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:364:1: ( rule__Person__Group__1__Impl rule__Person__Group__2 )
            // InternalDslPerson.g:365:2: rule__Person__Group__1__Impl rule__Person__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Person__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__2();

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
    // $ANTLR end "rule__Person__Group__1"


    // $ANTLR start "rule__Person__Group__1__Impl"
    // InternalDslPerson.g:372:1: rule__Person__Group__1__Impl : ( ( rule__Person__CpfAssignment_1 ) ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:376:1: ( ( ( rule__Person__CpfAssignment_1 ) ) )
            // InternalDslPerson.g:377:1: ( ( rule__Person__CpfAssignment_1 ) )
            {
            // InternalDslPerson.g:377:1: ( ( rule__Person__CpfAssignment_1 ) )
            // InternalDslPerson.g:378:2: ( rule__Person__CpfAssignment_1 )
            {
             before(grammarAccess.getPersonAccess().getCpfAssignment_1()); 
            // InternalDslPerson.g:379:2: ( rule__Person__CpfAssignment_1 )
            // InternalDslPerson.g:379:3: rule__Person__CpfAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Person__CpfAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getCpfAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__1__Impl"


    // $ANTLR start "rule__Person__Group__2"
    // InternalDslPerson.g:387:1: rule__Person__Group__2 : rule__Person__Group__2__Impl rule__Person__Group__3 ;
    public final void rule__Person__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:391:1: ( rule__Person__Group__2__Impl rule__Person__Group__3 )
            // InternalDslPerson.g:392:2: rule__Person__Group__2__Impl rule__Person__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Person__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__3();

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
    // $ANTLR end "rule__Person__Group__2"


    // $ANTLR start "rule__Person__Group__2__Impl"
    // InternalDslPerson.g:399:1: rule__Person__Group__2__Impl : ( '{' ) ;
    public final void rule__Person__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:403:1: ( ( '{' ) )
            // InternalDslPerson.g:404:1: ( '{' )
            {
            // InternalDslPerson.g:404:1: ( '{' )
            // InternalDslPerson.g:405:2: '{'
            {
             before(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__2__Impl"


    // $ANTLR start "rule__Person__Group__3"
    // InternalDslPerson.g:414:1: rule__Person__Group__3 : rule__Person__Group__3__Impl rule__Person__Group__4 ;
    public final void rule__Person__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:418:1: ( rule__Person__Group__3__Impl rule__Person__Group__4 )
            // InternalDslPerson.g:419:2: rule__Person__Group__3__Impl rule__Person__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Person__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__4();

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
    // $ANTLR end "rule__Person__Group__3"


    // $ANTLR start "rule__Person__Group__3__Impl"
    // InternalDslPerson.g:426:1: rule__Person__Group__3__Impl : ( ( rule__Person__Group_3__0 )? ) ;
    public final void rule__Person__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:430:1: ( ( ( rule__Person__Group_3__0 )? ) )
            // InternalDslPerson.g:431:1: ( ( rule__Person__Group_3__0 )? )
            {
            // InternalDslPerson.g:431:1: ( ( rule__Person__Group_3__0 )? )
            // InternalDslPerson.g:432:2: ( rule__Person__Group_3__0 )?
            {
             before(grammarAccess.getPersonAccess().getGroup_3()); 
            // InternalDslPerson.g:433:2: ( rule__Person__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDslPerson.g:433:3: rule__Person__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Person__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPersonAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__3__Impl"


    // $ANTLR start "rule__Person__Group__4"
    // InternalDslPerson.g:441:1: rule__Person__Group__4 : rule__Person__Group__4__Impl ;
    public final void rule__Person__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:445:1: ( rule__Person__Group__4__Impl )
            // InternalDslPerson.g:446:2: rule__Person__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__4__Impl();

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
    // $ANTLR end "rule__Person__Group__4"


    // $ANTLR start "rule__Person__Group__4__Impl"
    // InternalDslPerson.g:452:1: rule__Person__Group__4__Impl : ( '}' ) ;
    public final void rule__Person__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:456:1: ( ( '}' ) )
            // InternalDslPerson.g:457:1: ( '}' )
            {
            // InternalDslPerson.g:457:1: ( '}' )
            // InternalDslPerson.g:458:2: '}'
            {
             before(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__4__Impl"


    // $ANTLR start "rule__Person__Group_3__0"
    // InternalDslPerson.g:468:1: rule__Person__Group_3__0 : rule__Person__Group_3__0__Impl rule__Person__Group_3__1 ;
    public final void rule__Person__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:472:1: ( rule__Person__Group_3__0__Impl rule__Person__Group_3__1 )
            // InternalDslPerson.g:473:2: rule__Person__Group_3__0__Impl rule__Person__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Person__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_3__1();

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
    // $ANTLR end "rule__Person__Group_3__0"


    // $ANTLR start "rule__Person__Group_3__0__Impl"
    // InternalDslPerson.g:480:1: rule__Person__Group_3__0__Impl : ( ( rule__Person__AttributesAssignment_3_0 ) ) ;
    public final void rule__Person__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:484:1: ( ( ( rule__Person__AttributesAssignment_3_0 ) ) )
            // InternalDslPerson.g:485:1: ( ( rule__Person__AttributesAssignment_3_0 ) )
            {
            // InternalDslPerson.g:485:1: ( ( rule__Person__AttributesAssignment_3_0 ) )
            // InternalDslPerson.g:486:2: ( rule__Person__AttributesAssignment_3_0 )
            {
             before(grammarAccess.getPersonAccess().getAttributesAssignment_3_0()); 
            // InternalDslPerson.g:487:2: ( rule__Person__AttributesAssignment_3_0 )
            // InternalDslPerson.g:487:3: rule__Person__AttributesAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Person__AttributesAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getAttributesAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_3__0__Impl"


    // $ANTLR start "rule__Person__Group_3__1"
    // InternalDslPerson.g:495:1: rule__Person__Group_3__1 : rule__Person__Group_3__1__Impl ;
    public final void rule__Person__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:499:1: ( rule__Person__Group_3__1__Impl )
            // InternalDslPerson.g:500:2: rule__Person__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group_3__1__Impl();

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
    // $ANTLR end "rule__Person__Group_3__1"


    // $ANTLR start "rule__Person__Group_3__1__Impl"
    // InternalDslPerson.g:506:1: rule__Person__Group_3__1__Impl : ( ( rule__Person__Group_3_1__0 )* ) ;
    public final void rule__Person__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:510:1: ( ( ( rule__Person__Group_3_1__0 )* ) )
            // InternalDslPerson.g:511:1: ( ( rule__Person__Group_3_1__0 )* )
            {
            // InternalDslPerson.g:511:1: ( ( rule__Person__Group_3_1__0 )* )
            // InternalDslPerson.g:512:2: ( rule__Person__Group_3_1__0 )*
            {
             before(grammarAccess.getPersonAccess().getGroup_3_1()); 
            // InternalDslPerson.g:513:2: ( rule__Person__Group_3_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDslPerson.g:513:3: rule__Person__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Person__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPersonAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_3__1__Impl"


    // $ANTLR start "rule__Person__Group_3_1__0"
    // InternalDslPerson.g:522:1: rule__Person__Group_3_1__0 : rule__Person__Group_3_1__0__Impl rule__Person__Group_3_1__1 ;
    public final void rule__Person__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:526:1: ( rule__Person__Group_3_1__0__Impl rule__Person__Group_3_1__1 )
            // InternalDslPerson.g:527:2: rule__Person__Group_3_1__0__Impl rule__Person__Group_3_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Person__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group_3_1__1();

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
    // $ANTLR end "rule__Person__Group_3_1__0"


    // $ANTLR start "rule__Person__Group_3_1__0__Impl"
    // InternalDslPerson.g:534:1: rule__Person__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Person__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:538:1: ( ( ',' ) )
            // InternalDslPerson.g:539:1: ( ',' )
            {
            // InternalDslPerson.g:539:1: ( ',' )
            // InternalDslPerson.g:540:2: ','
            {
             before(grammarAccess.getPersonAccess().getCommaKeyword_3_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_3_1__0__Impl"


    // $ANTLR start "rule__Person__Group_3_1__1"
    // InternalDslPerson.g:549:1: rule__Person__Group_3_1__1 : rule__Person__Group_3_1__1__Impl ;
    public final void rule__Person__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:553:1: ( rule__Person__Group_3_1__1__Impl )
            // InternalDslPerson.g:554:2: rule__Person__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__Person__Group_3_1__1"


    // $ANTLR start "rule__Person__Group_3_1__1__Impl"
    // InternalDslPerson.g:560:1: rule__Person__Group_3_1__1__Impl : ( ( rule__Person__AttributesAssignment_3_1_1 ) ) ;
    public final void rule__Person__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:564:1: ( ( ( rule__Person__AttributesAssignment_3_1_1 ) ) )
            // InternalDslPerson.g:565:1: ( ( rule__Person__AttributesAssignment_3_1_1 ) )
            {
            // InternalDslPerson.g:565:1: ( ( rule__Person__AttributesAssignment_3_1_1 ) )
            // InternalDslPerson.g:566:2: ( rule__Person__AttributesAssignment_3_1_1 )
            {
             before(grammarAccess.getPersonAccess().getAttributesAssignment_3_1_1()); 
            // InternalDslPerson.g:567:2: ( rule__Person__AttributesAssignment_3_1_1 )
            // InternalDslPerson.g:567:3: rule__Person__AttributesAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Person__AttributesAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getAttributesAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group_3_1__1__Impl"


    // $ANTLR start "rule__Cpf__Group__0"
    // InternalDslPerson.g:576:1: rule__Cpf__Group__0 : rule__Cpf__Group__0__Impl rule__Cpf__Group__1 ;
    public final void rule__Cpf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:580:1: ( rule__Cpf__Group__0__Impl rule__Cpf__Group__1 )
            // InternalDslPerson.g:581:2: rule__Cpf__Group__0__Impl rule__Cpf__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Cpf__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cpf__Group__1();

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
    // $ANTLR end "rule__Cpf__Group__0"


    // $ANTLR start "rule__Cpf__Group__0__Impl"
    // InternalDslPerson.g:588:1: rule__Cpf__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Cpf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:592:1: ( ( RULE_INT ) )
            // InternalDslPerson.g:593:1: ( RULE_INT )
            {
            // InternalDslPerson.g:593:1: ( RULE_INT )
            // InternalDslPerson.g:594:2: RULE_INT
            {
             before(grammarAccess.getCpfAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCpfAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cpf__Group__0__Impl"


    // $ANTLR start "rule__Cpf__Group__1"
    // InternalDslPerson.g:603:1: rule__Cpf__Group__1 : rule__Cpf__Group__1__Impl rule__Cpf__Group__2 ;
    public final void rule__Cpf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:607:1: ( rule__Cpf__Group__1__Impl rule__Cpf__Group__2 )
            // InternalDslPerson.g:608:2: rule__Cpf__Group__1__Impl rule__Cpf__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Cpf__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cpf__Group__2();

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
    // $ANTLR end "rule__Cpf__Group__1"


    // $ANTLR start "rule__Cpf__Group__1__Impl"
    // InternalDslPerson.g:615:1: rule__Cpf__Group__1__Impl : ( '.' ) ;
    public final void rule__Cpf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:619:1: ( ( '.' ) )
            // InternalDslPerson.g:620:1: ( '.' )
            {
            // InternalDslPerson.g:620:1: ( '.' )
            // InternalDslPerson.g:621:2: '.'
            {
             before(grammarAccess.getCpfAccess().getFullStopKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCpfAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cpf__Group__1__Impl"


    // $ANTLR start "rule__Cpf__Group__2"
    // InternalDslPerson.g:630:1: rule__Cpf__Group__2 : rule__Cpf__Group__2__Impl rule__Cpf__Group__3 ;
    public final void rule__Cpf__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:634:1: ( rule__Cpf__Group__2__Impl rule__Cpf__Group__3 )
            // InternalDslPerson.g:635:2: rule__Cpf__Group__2__Impl rule__Cpf__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Cpf__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cpf__Group__3();

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
    // $ANTLR end "rule__Cpf__Group__2"


    // $ANTLR start "rule__Cpf__Group__2__Impl"
    // InternalDslPerson.g:642:1: rule__Cpf__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Cpf__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:646:1: ( ( RULE_INT ) )
            // InternalDslPerson.g:647:1: ( RULE_INT )
            {
            // InternalDslPerson.g:647:1: ( RULE_INT )
            // InternalDslPerson.g:648:2: RULE_INT
            {
             before(grammarAccess.getCpfAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCpfAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cpf__Group__2__Impl"


    // $ANTLR start "rule__Cpf__Group__3"
    // InternalDslPerson.g:657:1: rule__Cpf__Group__3 : rule__Cpf__Group__3__Impl rule__Cpf__Group__4 ;
    public final void rule__Cpf__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:661:1: ( rule__Cpf__Group__3__Impl rule__Cpf__Group__4 )
            // InternalDslPerson.g:662:2: rule__Cpf__Group__3__Impl rule__Cpf__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Cpf__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cpf__Group__4();

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
    // $ANTLR end "rule__Cpf__Group__3"


    // $ANTLR start "rule__Cpf__Group__3__Impl"
    // InternalDslPerson.g:669:1: rule__Cpf__Group__3__Impl : ( '.' ) ;
    public final void rule__Cpf__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:673:1: ( ( '.' ) )
            // InternalDslPerson.g:674:1: ( '.' )
            {
            // InternalDslPerson.g:674:1: ( '.' )
            // InternalDslPerson.g:675:2: '.'
            {
             before(grammarAccess.getCpfAccess().getFullStopKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCpfAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cpf__Group__3__Impl"


    // $ANTLR start "rule__Cpf__Group__4"
    // InternalDslPerson.g:684:1: rule__Cpf__Group__4 : rule__Cpf__Group__4__Impl rule__Cpf__Group__5 ;
    public final void rule__Cpf__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:688:1: ( rule__Cpf__Group__4__Impl rule__Cpf__Group__5 )
            // InternalDslPerson.g:689:2: rule__Cpf__Group__4__Impl rule__Cpf__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Cpf__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cpf__Group__5();

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
    // $ANTLR end "rule__Cpf__Group__4"


    // $ANTLR start "rule__Cpf__Group__4__Impl"
    // InternalDslPerson.g:696:1: rule__Cpf__Group__4__Impl : ( RULE_INT ) ;
    public final void rule__Cpf__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:700:1: ( ( RULE_INT ) )
            // InternalDslPerson.g:701:1: ( RULE_INT )
            {
            // InternalDslPerson.g:701:1: ( RULE_INT )
            // InternalDslPerson.g:702:2: RULE_INT
            {
             before(grammarAccess.getCpfAccess().getINTTerminalRuleCall_4()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCpfAccess().getINTTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cpf__Group__4__Impl"


    // $ANTLR start "rule__Cpf__Group__5"
    // InternalDslPerson.g:711:1: rule__Cpf__Group__5 : rule__Cpf__Group__5__Impl rule__Cpf__Group__6 ;
    public final void rule__Cpf__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:715:1: ( rule__Cpf__Group__5__Impl rule__Cpf__Group__6 )
            // InternalDslPerson.g:716:2: rule__Cpf__Group__5__Impl rule__Cpf__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Cpf__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cpf__Group__6();

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
    // $ANTLR end "rule__Cpf__Group__5"


    // $ANTLR start "rule__Cpf__Group__5__Impl"
    // InternalDslPerson.g:723:1: rule__Cpf__Group__5__Impl : ( '-' ) ;
    public final void rule__Cpf__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:727:1: ( ( '-' ) )
            // InternalDslPerson.g:728:1: ( '-' )
            {
            // InternalDslPerson.g:728:1: ( '-' )
            // InternalDslPerson.g:729:2: '-'
            {
             before(grammarAccess.getCpfAccess().getHyphenMinusKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCpfAccess().getHyphenMinusKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cpf__Group__5__Impl"


    // $ANTLR start "rule__Cpf__Group__6"
    // InternalDslPerson.g:738:1: rule__Cpf__Group__6 : rule__Cpf__Group__6__Impl ;
    public final void rule__Cpf__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:742:1: ( rule__Cpf__Group__6__Impl )
            // InternalDslPerson.g:743:2: rule__Cpf__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cpf__Group__6__Impl();

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
    // $ANTLR end "rule__Cpf__Group__6"


    // $ANTLR start "rule__Cpf__Group__6__Impl"
    // InternalDslPerson.g:749:1: rule__Cpf__Group__6__Impl : ( RULE_INT ) ;
    public final void rule__Cpf__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:753:1: ( ( RULE_INT ) )
            // InternalDslPerson.g:754:1: ( RULE_INT )
            {
            // InternalDslPerson.g:754:1: ( RULE_INT )
            // InternalDslPerson.g:755:2: RULE_INT
            {
             before(grammarAccess.getCpfAccess().getINTTerminalRuleCall_6()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCpfAccess().getINTTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cpf__Group__6__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalDslPerson.g:765:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:769:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalDslPerson.g:770:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalDslPerson.g:777:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__KeyAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:781:1: ( ( ( rule__Attribute__KeyAssignment_0 ) ) )
            // InternalDslPerson.g:782:1: ( ( rule__Attribute__KeyAssignment_0 ) )
            {
            // InternalDslPerson.g:782:1: ( ( rule__Attribute__KeyAssignment_0 ) )
            // InternalDslPerson.g:783:2: ( rule__Attribute__KeyAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getKeyAssignment_0()); 
            // InternalDslPerson.g:784:2: ( rule__Attribute__KeyAssignment_0 )
            // InternalDslPerson.g:784:3: rule__Attribute__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalDslPerson.g:792:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:796:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalDslPerson.g:797:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalDslPerson.g:804:1: rule__Attribute__Group__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:808:1: ( ( ':' ) )
            // InternalDslPerson.g:809:1: ( ':' )
            {
            // InternalDslPerson.g:809:1: ( ':' )
            // InternalDslPerson.g:810:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalDslPerson.g:819:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:823:1: ( rule__Attribute__Group__2__Impl )
            // InternalDslPerson.g:824:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2__Impl();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalDslPerson.g:830:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__ValueAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:834:1: ( ( ( rule__Attribute__ValueAssignment_2 ) ) )
            // InternalDslPerson.g:835:1: ( ( rule__Attribute__ValueAssignment_2 ) )
            {
            // InternalDslPerson.g:835:1: ( ( rule__Attribute__ValueAssignment_2 ) )
            // InternalDslPerson.g:836:2: ( rule__Attribute__ValueAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getValueAssignment_2()); 
            // InternalDslPerson.g:837:2: ( rule__Attribute__ValueAssignment_2 )
            // InternalDslPerson.g:837:3: rule__Attribute__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Date__Group__0"
    // InternalDslPerson.g:846:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:850:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // InternalDslPerson.g:851:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Date__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__1();

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
    // $ANTLR end "rule__Date__Group__0"


    // $ANTLR start "rule__Date__Group__0__Impl"
    // InternalDslPerson.g:858:1: rule__Date__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:862:1: ( ( RULE_INT ) )
            // InternalDslPerson.g:863:1: ( RULE_INT )
            {
            // InternalDslPerson.g:863:1: ( RULE_INT )
            // InternalDslPerson.g:864:2: RULE_INT
            {
             before(grammarAccess.getDateAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__0__Impl"


    // $ANTLR start "rule__Date__Group__1"
    // InternalDslPerson.g:873:1: rule__Date__Group__1 : rule__Date__Group__1__Impl rule__Date__Group__2 ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:877:1: ( rule__Date__Group__1__Impl rule__Date__Group__2 )
            // InternalDslPerson.g:878:2: rule__Date__Group__1__Impl rule__Date__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Date__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__2();

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
    // $ANTLR end "rule__Date__Group__1"


    // $ANTLR start "rule__Date__Group__1__Impl"
    // InternalDslPerson.g:885:1: rule__Date__Group__1__Impl : ( '/' ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:889:1: ( ( '/' ) )
            // InternalDslPerson.g:890:1: ( '/' )
            {
            // InternalDslPerson.g:890:1: ( '/' )
            // InternalDslPerson.g:891:2: '/'
            {
             before(grammarAccess.getDateAccess().getSolidusKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getSolidusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__1__Impl"


    // $ANTLR start "rule__Date__Group__2"
    // InternalDslPerson.g:900:1: rule__Date__Group__2 : rule__Date__Group__2__Impl rule__Date__Group__3 ;
    public final void rule__Date__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:904:1: ( rule__Date__Group__2__Impl rule__Date__Group__3 )
            // InternalDslPerson.g:905:2: rule__Date__Group__2__Impl rule__Date__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Date__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__3();

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
    // $ANTLR end "rule__Date__Group__2"


    // $ANTLR start "rule__Date__Group__2__Impl"
    // InternalDslPerson.g:912:1: rule__Date__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Date__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:916:1: ( ( RULE_INT ) )
            // InternalDslPerson.g:917:1: ( RULE_INT )
            {
            // InternalDslPerson.g:917:1: ( RULE_INT )
            // InternalDslPerson.g:918:2: RULE_INT
            {
             before(grammarAccess.getDateAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__2__Impl"


    // $ANTLR start "rule__Date__Group__3"
    // InternalDslPerson.g:927:1: rule__Date__Group__3 : rule__Date__Group__3__Impl rule__Date__Group__4 ;
    public final void rule__Date__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:931:1: ( rule__Date__Group__3__Impl rule__Date__Group__4 )
            // InternalDslPerson.g:932:2: rule__Date__Group__3__Impl rule__Date__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Date__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__4();

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
    // $ANTLR end "rule__Date__Group__3"


    // $ANTLR start "rule__Date__Group__3__Impl"
    // InternalDslPerson.g:939:1: rule__Date__Group__3__Impl : ( '/' ) ;
    public final void rule__Date__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:943:1: ( ( '/' ) )
            // InternalDslPerson.g:944:1: ( '/' )
            {
            // InternalDslPerson.g:944:1: ( '/' )
            // InternalDslPerson.g:945:2: '/'
            {
             before(grammarAccess.getDateAccess().getSolidusKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getSolidusKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__3__Impl"


    // $ANTLR start "rule__Date__Group__4"
    // InternalDslPerson.g:954:1: rule__Date__Group__4 : rule__Date__Group__4__Impl ;
    public final void rule__Date__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:958:1: ( rule__Date__Group__4__Impl )
            // InternalDslPerson.g:959:2: rule__Date__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Date__Group__4__Impl();

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
    // $ANTLR end "rule__Date__Group__4"


    // $ANTLR start "rule__Date__Group__4__Impl"
    // InternalDslPerson.g:965:1: rule__Date__Group__4__Impl : ( RULE_INT ) ;
    public final void rule__Date__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:969:1: ( ( RULE_INT ) )
            // InternalDslPerson.g:970:1: ( RULE_INT )
            {
            // InternalDslPerson.g:970:1: ( RULE_INT )
            // InternalDslPerson.g:971:2: RULE_INT
            {
             before(grammarAccess.getDateAccess().getINTTerminalRuleCall_4()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getINTTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__4__Impl"


    // $ANTLR start "rule__Persons__PersonsAssignment"
    // InternalDslPerson.g:981:1: rule__Persons__PersonsAssignment : ( rulePerson ) ;
    public final void rule__Persons__PersonsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:985:1: ( ( rulePerson ) )
            // InternalDslPerson.g:986:2: ( rulePerson )
            {
            // InternalDslPerson.g:986:2: ( rulePerson )
            // InternalDslPerson.g:987:3: rulePerson
            {
             before(grammarAccess.getPersonsAccess().getPersonsPersonParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPersonsAccess().getPersonsPersonParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Persons__PersonsAssignment"


    // $ANTLR start "rule__Person__CpfAssignment_1"
    // InternalDslPerson.g:996:1: rule__Person__CpfAssignment_1 : ( ruleValidID ) ;
    public final void rule__Person__CpfAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:1000:1: ( ( ruleValidID ) )
            // InternalDslPerson.g:1001:2: ( ruleValidID )
            {
            // InternalDslPerson.g:1001:2: ( ruleValidID )
            // InternalDslPerson.g:1002:3: ruleValidID
            {
             before(grammarAccess.getPersonAccess().getCpfValidIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getCpfValidIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__CpfAssignment_1"


    // $ANTLR start "rule__Person__AttributesAssignment_3_0"
    // InternalDslPerson.g:1011:1: rule__Person__AttributesAssignment_3_0 : ( ruleAttribute ) ;
    public final void rule__Person__AttributesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:1015:1: ( ( ruleAttribute ) )
            // InternalDslPerson.g:1016:2: ( ruleAttribute )
            {
            // InternalDslPerson.g:1016:2: ( ruleAttribute )
            // InternalDslPerson.g:1017:3: ruleAttribute
            {
             before(grammarAccess.getPersonAccess().getAttributesAttributeParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getAttributesAttributeParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__AttributesAssignment_3_0"


    // $ANTLR start "rule__Person__AttributesAssignment_3_1_1"
    // InternalDslPerson.g:1026:1: rule__Person__AttributesAssignment_3_1_1 : ( ruleAttribute ) ;
    public final void rule__Person__AttributesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:1030:1: ( ( ruleAttribute ) )
            // InternalDslPerson.g:1031:2: ( ruleAttribute )
            {
            // InternalDslPerson.g:1031:2: ( ruleAttribute )
            // InternalDslPerson.g:1032:3: ruleAttribute
            {
             before(grammarAccess.getPersonAccess().getAttributesAttributeParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getPersonAccess().getAttributesAttributeParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__AttributesAssignment_3_1_1"


    // $ANTLR start "rule__Attribute__KeyAssignment_0"
    // InternalDslPerson.g:1041:1: rule__Attribute__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Attribute__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:1045:1: ( ( RULE_STRING ) )
            // InternalDslPerson.g:1046:2: ( RULE_STRING )
            {
            // InternalDslPerson.g:1046:2: ( RULE_STRING )
            // InternalDslPerson.g:1047:3: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getKeySTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__KeyAssignment_0"


    // $ANTLR start "rule__Attribute__ValueAssignment_2"
    // InternalDslPerson.g:1056:1: rule__Attribute__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Attribute__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDslPerson.g:1060:1: ( ( ruleValue ) )
            // InternalDslPerson.g:1061:2: ( ruleValue )
            {
            // InternalDslPerson.g:1061:2: ( ruleValue )
            // InternalDslPerson.g:1062:3: ruleValue
            {
             before(grammarAccess.getAttributeAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getValueValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000018E0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});

}