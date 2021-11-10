/*
 * generated by Xtext 2.25.0
 */
grammar InternalDslPerson;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.ppgti.dslperson.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRulePersons
entryRulePersons returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPersonsRule()); }
	iv_rulePersons=rulePersons
	{ $current=$iv_rulePersons.current; }
	EOF;

// Rule Persons
rulePersons returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getPersonsAccess().getPersonsPersonParserRuleCall_0());
			}
			lv_persons_0_0=rulePerson
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getPersonsRule());
				}
				add(
					$current,
					"persons",
					lv_persons_0_0,
					"org.ppgti.dslperson.DslPerson.Person");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRulePerson
entryRulePerson returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPersonRule()); }
	iv_rulePerson=rulePerson
	{ $current=$iv_rulePerson.current; }
	EOF;

// Rule Person
rulePerson returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='person'
		{
			newLeafNode(otherlv_0, grammarAccess.getPersonAccess().getPersonKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPersonAccess().getCpfValidIDParserRuleCall_1_0());
				}
				lv_cpf_1_0=ruleValidID
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPersonRule());
					}
					set(
						$current,
						"cpf",
						lv_cpf_1_0,
						"org.ppgti.dslperson.DslPerson.ValidID");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getPersonAccess().getAttributesAttributeParserRuleCall_3_0_0());
					}
					lv_attributes_3_0=ruleAttribute
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPersonRule());
						}
						add(
							$current,
							"attributes",
							lv_attributes_3_0,
							"org.ppgti.dslperson.DslPerson.Attribute");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getPersonAccess().getCommaKeyword_3_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getPersonAccess().getAttributesAttributeParserRuleCall_3_1_1_0());
						}
						lv_attributes_5_0=ruleAttribute
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getPersonRule());
							}
							add(
								$current,
								"attributes",
								lv_attributes_5_0,
								"org.ppgti.dslperson.DslPerson.Attribute");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleValidID
entryRuleValidID returns [String current=null]:
	{ newCompositeNode(grammarAccess.getValidIDRule()); }
	iv_ruleValidID=ruleValidID
	{ $current=$iv_ruleValidID.current.getText(); }
	EOF;

// Rule ValidID
ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0());
		}
		    |
		{
			newCompositeNode(grammarAccess.getValidIDAccess().getCpfParserRuleCall_1());
		}
		this_Cpf_1=ruleCpf
		{
			$current.merge(this_Cpf_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleCpf
entryRuleCpf returns [String current=null]:
	{ newCompositeNode(grammarAccess.getCpfRule()); }
	iv_ruleCpf=ruleCpf
	{ $current=$iv_ruleCpf.current.getText(); }
	EOF;

// Rule Cpf
ruleCpf returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			$current.merge(this_INT_0);
		}
		{
			newLeafNode(this_INT_0, grammarAccess.getCpfAccess().getINTTerminalRuleCall_0());
		}
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCpfAccess().getFullStopKeyword_1());
		}
		this_INT_2=RULE_INT
		{
			$current.merge(this_INT_2);
		}
		{
			newLeafNode(this_INT_2, grammarAccess.getCpfAccess().getINTTerminalRuleCall_2());
		}
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCpfAccess().getFullStopKeyword_3());
		}
		this_INT_4=RULE_INT
		{
			$current.merge(this_INT_4);
		}
		{
			newLeafNode(this_INT_4, grammarAccess.getCpfAccess().getINTTerminalRuleCall_4());
		}
		kw='-'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getCpfAccess().getHyphenMinusKeyword_5());
		}
		this_INT_6=RULE_INT
		{
			$current.merge(this_INT_6);
		}
		{
			newLeafNode(this_INT_6, grammarAccess.getCpfAccess().getINTTerminalRuleCall_6());
		}
	)
;

// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	iv_ruleAttribute=ruleAttribute
	{ $current=$iv_ruleAttribute.current; }
	EOF;

// Rule Attribute
ruleAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_key_0_0=RULE_STRING
				{
					newLeafNode(lv_key_0_0, grammarAccess.getAttributeAccess().getKeySTRINGTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"key",
						lv_key_0_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getValueValueParserRuleCall_2_0());
				}
				lv_value_2_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"value",
						lv_value_2_0,
						"org.ppgti.dslperson.DslPerson.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleValue
entryRuleValue returns [String current=null]:
	{ newCompositeNode(grammarAccess.getValueRule()); }
	iv_ruleValue=ruleValue
	{ $current=$iv_ruleValue.current.getText(); }
	EOF;

// Rule Value
ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			$current.merge(this_INT_0);
		}
		{
			newLeafNode(this_INT_0, grammarAccess.getValueAccess().getINTTerminalRuleCall_0());
		}
		    |
		this_STRING_1=RULE_STRING
		{
			$current.merge(this_STRING_1);
		}
		{
			newLeafNode(this_STRING_1, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1());
		}
		    |
		this_ANY_OTHER_2=RULE_ANY_OTHER
		{
			$current.merge(this_ANY_OTHER_2);
		}
		{
			newLeafNode(this_ANY_OTHER_2, grammarAccess.getValueAccess().getANY_OTHERTerminalRuleCall_2());
		}
		    |
		{
			newCompositeNode(grammarAccess.getValueAccess().getDateParserRuleCall_3());
		}
		this_Date_3=ruleDate
		{
			$current.merge(this_Date_3);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getValueAccess().getBooleanParserRuleCall_4());
		}
		this_Boolean_4=ruleBoolean
		{
			$current.merge(this_Boolean_4);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDate
entryRuleDate returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDateRule()); }
	iv_ruleDate=ruleDate
	{ $current=$iv_ruleDate.current.getText(); }
	EOF;

// Rule Date
ruleDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			$current.merge(this_INT_0);
		}
		{
			newLeafNode(this_INT_0, grammarAccess.getDateAccess().getINTTerminalRuleCall_0());
		}
		kw='/'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDateAccess().getSolidusKeyword_1());
		}
		this_INT_2=RULE_INT
		{
			$current.merge(this_INT_2);
		}
		{
			newLeafNode(this_INT_2, grammarAccess.getDateAccess().getINTTerminalRuleCall_2());
		}
		kw='/'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDateAccess().getSolidusKeyword_3());
		}
		this_INT_4=RULE_INT
		{
			$current.merge(this_INT_4);
		}
		{
			newLeafNode(this_INT_4, grammarAccess.getDateAccess().getINTTerminalRuleCall_4());
		}
	)
;

// Entry rule entryRuleBoolean
entryRuleBoolean returns [String current=null]:
	{ newCompositeNode(grammarAccess.getBooleanRule()); }
	iv_ruleBoolean=ruleBoolean
	{ $current=$iv_ruleBoolean.current.getText(); }
	EOF;

// Rule Boolean
ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='true'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0());
		}
		    |
		kw='false'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;