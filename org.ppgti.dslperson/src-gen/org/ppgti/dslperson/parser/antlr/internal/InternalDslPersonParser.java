package org.ppgti.dslperson.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.ppgti.dslperson.services.DslPersonGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslPersonParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ANY_OTHER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'person'", "'{'", "','", "'}'", "'.'", "'-'", "':'", "'/'", "'true'", "'false'"
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

        public InternalDslPersonParser(TokenStream input, DslPersonGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Persons";
       	}

       	@Override
       	protected DslPersonGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePersons"
    // InternalDslPerson.g:64:1: entryRulePersons returns [EObject current=null] : iv_rulePersons= rulePersons EOF ;
    public final EObject entryRulePersons() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersons = null;


        try {
            // InternalDslPerson.g:64:48: (iv_rulePersons= rulePersons EOF )
            // InternalDslPerson.g:65:2: iv_rulePersons= rulePersons EOF
            {
             newCompositeNode(grammarAccess.getPersonsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePersons=rulePersons();

            state._fsp--;

             current =iv_rulePersons; 
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
    // $ANTLR end "entryRulePersons"


    // $ANTLR start "rulePersons"
    // InternalDslPerson.g:71:1: rulePersons returns [EObject current=null] : ( (lv_persons_0_0= rulePerson ) )* ;
    public final EObject rulePersons() throws RecognitionException {
        EObject current = null;

        EObject lv_persons_0_0 = null;



        	enterRule();

        try {
            // InternalDslPerson.g:77:2: ( ( (lv_persons_0_0= rulePerson ) )* )
            // InternalDslPerson.g:78:2: ( (lv_persons_0_0= rulePerson ) )*
            {
            // InternalDslPerson.g:78:2: ( (lv_persons_0_0= rulePerson ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDslPerson.g:79:3: (lv_persons_0_0= rulePerson )
            	    {
            	    // InternalDslPerson.g:79:3: (lv_persons_0_0= rulePerson )
            	    // InternalDslPerson.g:80:4: lv_persons_0_0= rulePerson
            	    {

            	    				newCompositeNode(grammarAccess.getPersonsAccess().getPersonsPersonParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_persons_0_0=rulePerson();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getPersonsRule());
            	    				}
            	    				add(
            	    					current,
            	    					"persons",
            	    					lv_persons_0_0,
            	    					"org.ppgti.dslperson.DslPerson.Person");
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
    // $ANTLR end "rulePersons"


    // $ANTLR start "entryRulePerson"
    // InternalDslPerson.g:100:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalDslPerson.g:100:47: (iv_rulePerson= rulePerson EOF )
            // InternalDslPerson.g:101:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
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
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalDslPerson.g:107:1: rulePerson returns [EObject current=null] : (otherlv_0= 'person' ( (lv_cpf_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_attributes_3_0= ruleAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAttribute ) ) )* )? otherlv_6= '}' ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_cpf_1_0 = null;

        EObject lv_attributes_3_0 = null;

        EObject lv_attributes_5_0 = null;



        	enterRule();

        try {
            // InternalDslPerson.g:113:2: ( (otherlv_0= 'person' ( (lv_cpf_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_attributes_3_0= ruleAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAttribute ) ) )* )? otherlv_6= '}' ) )
            // InternalDslPerson.g:114:2: (otherlv_0= 'person' ( (lv_cpf_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_attributes_3_0= ruleAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAttribute ) ) )* )? otherlv_6= '}' )
            {
            // InternalDslPerson.g:114:2: (otherlv_0= 'person' ( (lv_cpf_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_attributes_3_0= ruleAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAttribute ) ) )* )? otherlv_6= '}' )
            // InternalDslPerson.g:115:3: otherlv_0= 'person' ( (lv_cpf_1_0= ruleValidID ) ) otherlv_2= '{' ( ( (lv_attributes_3_0= ruleAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAttribute ) ) )* )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonAccess().getPersonKeyword_0());
            		
            // InternalDslPerson.g:119:3: ( (lv_cpf_1_0= ruleValidID ) )
            // InternalDslPerson.g:120:4: (lv_cpf_1_0= ruleValidID )
            {
            // InternalDslPerson.g:120:4: (lv_cpf_1_0= ruleValidID )
            // InternalDslPerson.g:121:5: lv_cpf_1_0= ruleValidID
            {

            					newCompositeNode(grammarAccess.getPersonAccess().getCpfValidIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_cpf_1_0=ruleValidID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonRule());
            					}
            					set(
            						current,
            						"cpf",
            						lv_cpf_1_0,
            						"org.ppgti.dslperson.DslPerson.ValidID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDslPerson.g:142:3: ( ( (lv_attributes_3_0= ruleAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAttribute ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDslPerson.g:143:4: ( (lv_attributes_3_0= ruleAttribute ) ) (otherlv_4= ',' ( (lv_attributes_5_0= ruleAttribute ) ) )*
                    {
                    // InternalDslPerson.g:143:4: ( (lv_attributes_3_0= ruleAttribute ) )
                    // InternalDslPerson.g:144:5: (lv_attributes_3_0= ruleAttribute )
                    {
                    // InternalDslPerson.g:144:5: (lv_attributes_3_0= ruleAttribute )
                    // InternalDslPerson.g:145:6: lv_attributes_3_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getPersonAccess().getAttributesAttributeParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_attributes_3_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_3_0,
                    							"org.ppgti.dslperson.DslPerson.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDslPerson.g:162:4: (otherlv_4= ',' ( (lv_attributes_5_0= ruleAttribute ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==13) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalDslPerson.g:163:5: otherlv_4= ',' ( (lv_attributes_5_0= ruleAttribute ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FOLLOW_8); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getPersonAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalDslPerson.g:167:5: ( (lv_attributes_5_0= ruleAttribute ) )
                    	    // InternalDslPerson.g:168:6: (lv_attributes_5_0= ruleAttribute )
                    	    {
                    	    // InternalDslPerson.g:168:6: (lv_attributes_5_0= ruleAttribute )
                    	    // InternalDslPerson.g:169:7: lv_attributes_5_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getPersonAccess().getAttributesAttributeParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_attributes_5_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPersonRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_5_0,
                    	    								"org.ppgti.dslperson.DslPerson.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleValidID"
    // InternalDslPerson.g:196:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // InternalDslPerson.g:196:47: (iv_ruleValidID= ruleValidID EOF )
            // InternalDslPerson.g:197:2: iv_ruleValidID= ruleValidID EOF
            {
             newCompositeNode(grammarAccess.getValidIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValidID=ruleValidID();

            state._fsp--;

             current =iv_ruleValidID.getText(); 
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
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalDslPerson.g:203:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_Cpf_1= ruleCpf ) ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        AntlrDatatypeRuleToken this_Cpf_1 = null;



        	enterRule();

        try {
            // InternalDslPerson.g:209:2: ( (this_ID_0= RULE_ID | this_Cpf_1= ruleCpf ) )
            // InternalDslPerson.g:210:2: (this_ID_0= RULE_ID | this_Cpf_1= ruleCpf )
            {
            // InternalDslPerson.g:210:2: (this_ID_0= RULE_ID | this_Cpf_1= ruleCpf )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_INT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDslPerson.g:211:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDslPerson.g:219:3: this_Cpf_1= ruleCpf
                    {

                    			newCompositeNode(grammarAccess.getValidIDAccess().getCpfParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Cpf_1=ruleCpf();

                    state._fsp--;


                    			current.merge(this_Cpf_1);
                    		

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
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleCpf"
    // InternalDslPerson.g:233:1: entryRuleCpf returns [String current=null] : iv_ruleCpf= ruleCpf EOF ;
    public final String entryRuleCpf() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCpf = null;


        try {
            // InternalDslPerson.g:233:43: (iv_ruleCpf= ruleCpf EOF )
            // InternalDslPerson.g:234:2: iv_ruleCpf= ruleCpf EOF
            {
             newCompositeNode(grammarAccess.getCpfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCpf=ruleCpf();

            state._fsp--;

             current =iv_ruleCpf.getText(); 
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
    // $ANTLR end "entryRuleCpf"


    // $ANTLR start "ruleCpf"
    // InternalDslPerson.g:240:1: ruleCpf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT kw= '-' this_INT_6= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleCpf() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;
        Token this_INT_6=null;


        	enterRule();

        try {
            // InternalDslPerson.g:246:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT kw= '-' this_INT_6= RULE_INT ) )
            // InternalDslPerson.g:247:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT kw= '-' this_INT_6= RULE_INT )
            {
            // InternalDslPerson.g:247:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT kw= '-' this_INT_6= RULE_INT )
            // InternalDslPerson.g:248:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT kw= '-' this_INT_6= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getCpfAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,15,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getCpfAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_9); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getCpfAccess().getINTTerminalRuleCall_2());
            		
            kw=(Token)match(input,15,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getCpfAccess().getFullStopKeyword_3());
            		
            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_11); 

            			current.merge(this_INT_4);
            		

            			newLeafNode(this_INT_4, grammarAccess.getCpfAccess().getINTTerminalRuleCall_4());
            		
            kw=(Token)match(input,16,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getCpfAccess().getHyphenMinusKeyword_5());
            		
            this_INT_6=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_6);
            		

            			newLeafNode(this_INT_6, grammarAccess.getCpfAccess().getINTTerminalRuleCall_6());
            		

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
    // $ANTLR end "ruleCpf"


    // $ANTLR start "entryRuleAttribute"
    // InternalDslPerson.g:295:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalDslPerson.g:295:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalDslPerson.g:296:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalDslPerson.g:302:1: ruleAttribute returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalDslPerson.g:308:2: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalDslPerson.g:309:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalDslPerson.g:309:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) )
            // InternalDslPerson.g:310:3: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) )
            {
            // InternalDslPerson.g:310:3: ( (lv_key_0_0= RULE_STRING ) )
            // InternalDslPerson.g:311:4: (lv_key_0_0= RULE_STRING )
            {
            // InternalDslPerson.g:311:4: (lv_key_0_0= RULE_STRING )
            // InternalDslPerson.g:312:5: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_key_0_0, grammarAccess.getAttributeAccess().getKeySTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
            		
            // InternalDslPerson.g:332:3: ( (lv_value_2_0= ruleValue ) )
            // InternalDslPerson.g:333:4: (lv_value_2_0= ruleValue )
            {
            // InternalDslPerson.g:333:4: (lv_value_2_0= ruleValue )
            // InternalDslPerson.g:334:5: lv_value_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getValueValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.ppgti.dslperson.DslPerson.Value");
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleValue"
    // InternalDslPerson.g:355:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // InternalDslPerson.g:355:45: (iv_ruleValue= ruleValue EOF )
            // InternalDslPerson.g:356:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue.getText(); 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalDslPerson.g:362:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_ANY_OTHER_2= RULE_ANY_OTHER | this_Date_3= ruleDate | this_Boolean_4= ruleBoolean ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;
        Token this_ANY_OTHER_2=null;
        AntlrDatatypeRuleToken this_Date_3 = null;

        AntlrDatatypeRuleToken this_Boolean_4 = null;



        	enterRule();

        try {
            // InternalDslPerson.g:368:2: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_ANY_OTHER_2= RULE_ANY_OTHER | this_Date_3= ruleDate | this_Boolean_4= ruleBoolean ) )
            // InternalDslPerson.g:369:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_ANY_OTHER_2= RULE_ANY_OTHER | this_Date_3= ruleDate | this_Boolean_4= ruleBoolean )
            {
            // InternalDslPerson.g:369:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_ANY_OTHER_2= RULE_ANY_OTHER | this_Date_3= ruleDate | this_Boolean_4= ruleBoolean )
            int alt5=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF||(LA5_1>=13 && LA5_1<=14)) ) {
                    alt5=1;
                }
                else if ( (LA5_1==18) ) {
                    alt5=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt5=2;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt5=3;
                }
                break;
            case 19:
            case 20:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDslPerson.g:370:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getValueAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDslPerson.g:378:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDslPerson.g:386:3: this_ANY_OTHER_2= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_2=(Token)match(input,RULE_ANY_OTHER,FOLLOW_2); 

                    			current.merge(this_ANY_OTHER_2);
                    		

                    			newLeafNode(this_ANY_OTHER_2, grammarAccess.getValueAccess().getANY_OTHERTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDslPerson.g:394:3: this_Date_3= ruleDate
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getDateParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Date_3=ruleDate();

                    state._fsp--;


                    			current.merge(this_Date_3);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDslPerson.g:405:3: this_Boolean_4= ruleBoolean
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getBooleanParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Boolean_4=ruleBoolean();

                    state._fsp--;


                    			current.merge(this_Boolean_4);
                    		

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleDate"
    // InternalDslPerson.g:419:1: entryRuleDate returns [String current=null] : iv_ruleDate= ruleDate EOF ;
    public final String entryRuleDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDate = null;


        try {
            // InternalDslPerson.g:419:44: (iv_ruleDate= ruleDate EOF )
            // InternalDslPerson.g:420:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate.getText(); 
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
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // InternalDslPerson.g:426:1: ruleDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalDslPerson.g:432:2: ( (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT ) )
            // InternalDslPerson.g:433:2: (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT )
            {
            // InternalDslPerson.g:433:2: (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT )
            // InternalDslPerson.g:434:3: this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDateAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,18,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDateAccess().getSolidusKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_14); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDateAccess().getINTTerminalRuleCall_2());
            		
            kw=(Token)match(input,18,FOLLOW_10); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDateAccess().getSolidusKeyword_3());
            		
            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_4);
            		

            			newLeafNode(this_INT_4, grammarAccess.getDateAccess().getINTTerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleBoolean"
    // InternalDslPerson.g:469:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // InternalDslPerson.g:469:47: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalDslPerson.g:470:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalDslPerson.g:476:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDslPerson.g:482:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalDslPerson.g:483:2: (kw= 'true' | kw= 'false' )
            {
            // InternalDslPerson.g:483:2: (kw= 'true' | kw= 'false' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDslPerson.g:484:3: kw= 'true'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDslPerson.g:490:3: kw= 'false'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleBoolean"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000001800E0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});

}