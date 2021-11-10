/*
 * generated by Xtext 2.25.0
 */
grammar InternalDslPerson;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.ppgti.dslperson.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRulePersons
entryRulePersons
:
{ before(grammarAccess.getPersonsRule()); }
	 rulePersons
{ after(grammarAccess.getPersonsRule()); } 
	 EOF 
;

// Rule Persons
rulePersons 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPersonsAccess().getPersonsAssignment()); }
		(rule__Persons__PersonsAssignment)*
		{ after(grammarAccess.getPersonsAccess().getPersonsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePerson
entryRulePerson
:
{ before(grammarAccess.getPersonRule()); }
	 rulePerson
{ after(grammarAccess.getPersonRule()); } 
	 EOF 
;

// Rule Person
rulePerson 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPersonAccess().getGroup()); }
		(rule__Person__Group__0)
		{ after(grammarAccess.getPersonAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleValidID
entryRuleValidID
:
{ before(grammarAccess.getValidIDRule()); }
	 ruleValidID
{ after(grammarAccess.getValidIDRule()); } 
	 EOF 
;

// Rule ValidID
ruleValidID 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getValidIDAccess().getAlternatives()); }
		(rule__ValidID__Alternatives)
		{ after(grammarAccess.getValidIDAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCpf
entryRuleCpf
:
{ before(grammarAccess.getCpfRule()); }
	 ruleCpf
{ after(grammarAccess.getCpfRule()); } 
	 EOF 
;

// Rule Cpf
ruleCpf 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCpfAccess().getGroup()); }
		(rule__Cpf__Group__0)
		{ after(grammarAccess.getCpfAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttribute
entryRuleAttribute
:
{ before(grammarAccess.getAttributeRule()); }
	 ruleAttribute
{ after(grammarAccess.getAttributeRule()); } 
	 EOF 
;

// Rule Attribute
ruleAttribute 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeAccess().getGroup()); }
		(rule__Attribute__Group__0)
		{ after(grammarAccess.getAttributeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleValue
entryRuleValue
:
{ before(grammarAccess.getValueRule()); }
	 ruleValue
{ after(grammarAccess.getValueRule()); } 
	 EOF 
;

// Rule Value
ruleValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getValueAccess().getAlternatives()); }
		(rule__Value__Alternatives)
		{ after(grammarAccess.getValueAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDate
entryRuleDate
:
{ before(grammarAccess.getDateRule()); }
	 ruleDate
{ after(grammarAccess.getDateRule()); } 
	 EOF 
;

// Rule Date
ruleDate 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDateAccess().getGroup()); }
		(rule__Date__Group__0)
		{ after(grammarAccess.getDateAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBoolean
entryRuleBoolean
:
{ before(grammarAccess.getBooleanRule()); }
	 ruleBoolean
{ after(grammarAccess.getBooleanRule()); } 
	 EOF 
;

// Rule Boolean
ruleBoolean 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBooleanAccess().getAlternatives()); }
		(rule__Boolean__Alternatives)
		{ after(grammarAccess.getBooleanAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ValidID__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getValidIDAccess().getCpfParserRuleCall_1()); }
		ruleCpf
		{ after(grammarAccess.getValidIDAccess().getCpfParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Value__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); }
		RULE_INT
		{ after(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); }
		RULE_STRING
		{ after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getValueAccess().getANY_OTHERTerminalRuleCall_2()); }
		RULE_ANY_OTHER
		{ after(grammarAccess.getValueAccess().getANY_OTHERTerminalRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getValueAccess().getDateParserRuleCall_3()); }
		ruleDate
		{ after(grammarAccess.getValueAccess().getDateParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getValueAccess().getBooleanParserRuleCall_4()); }
		ruleBoolean
		{ after(grammarAccess.getValueAccess().getBooleanParserRuleCall_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Boolean__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); }
		'true'
		{ after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); }
		'false'
		{ after(grammarAccess.getBooleanAccess().getFalseKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Person__Group__0__Impl
	rule__Person__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPersonAccess().getPersonKeyword_0()); }
	'person'
	{ after(grammarAccess.getPersonAccess().getPersonKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Person__Group__1__Impl
	rule__Person__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPersonAccess().getCpfAssignment_1()); }
	(rule__Person__CpfAssignment_1)
	{ after(grammarAccess.getPersonAccess().getCpfAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Person__Group__2__Impl
	rule__Person__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getPersonAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Person__Group__3__Impl
	rule__Person__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPersonAccess().getGroup_3()); }
	(rule__Person__Group_3__0)?
	{ after(grammarAccess.getPersonAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Person__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getPersonAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Person__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Person__Group_3__0__Impl
	rule__Person__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPersonAccess().getAttributesAssignment_3_0()); }
	(rule__Person__AttributesAssignment_3_0)
	{ after(grammarAccess.getPersonAccess().getAttributesAssignment_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Person__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPersonAccess().getGroup_3_1()); }
	(rule__Person__Group_3_1__0)*
	{ after(grammarAccess.getPersonAccess().getGroup_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Person__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Person__Group_3_1__0__Impl
	rule__Person__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPersonAccess().getCommaKeyword_3_1_0()); }
	','
	{ after(grammarAccess.getPersonAccess().getCommaKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Person__Group_3_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPersonAccess().getAttributesAssignment_3_1_1()); }
	(rule__Person__AttributesAssignment_3_1_1)
	{ after(grammarAccess.getPersonAccess().getAttributesAssignment_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Cpf__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cpf__Group__0__Impl
	rule__Cpf__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Cpf__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpfAccess().getINTTerminalRuleCall_0()); }
	RULE_INT
	{ after(grammarAccess.getCpfAccess().getINTTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cpf__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cpf__Group__1__Impl
	rule__Cpf__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Cpf__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpfAccess().getFullStopKeyword_1()); }
	'.'
	{ after(grammarAccess.getCpfAccess().getFullStopKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cpf__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cpf__Group__2__Impl
	rule__Cpf__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Cpf__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpfAccess().getINTTerminalRuleCall_2()); }
	RULE_INT
	{ after(grammarAccess.getCpfAccess().getINTTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cpf__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cpf__Group__3__Impl
	rule__Cpf__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Cpf__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpfAccess().getFullStopKeyword_3()); }
	'.'
	{ after(grammarAccess.getCpfAccess().getFullStopKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cpf__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cpf__Group__4__Impl
	rule__Cpf__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Cpf__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpfAccess().getINTTerminalRuleCall_4()); }
	RULE_INT
	{ after(grammarAccess.getCpfAccess().getINTTerminalRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cpf__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cpf__Group__5__Impl
	rule__Cpf__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Cpf__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpfAccess().getHyphenMinusKeyword_5()); }
	'-'
	{ after(grammarAccess.getCpfAccess().getHyphenMinusKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cpf__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cpf__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Cpf__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpfAccess().getINTTerminalRuleCall_6()); }
	RULE_INT
	{ after(grammarAccess.getCpfAccess().getINTTerminalRuleCall_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__0__Impl
	rule__Attribute__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getKeyAssignment_0()); }
	(rule__Attribute__KeyAssignment_0)
	{ after(grammarAccess.getAttributeAccess().getKeyAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__1__Impl
	rule__Attribute__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getAttributeAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getValueAssignment_2()); }
	(rule__Attribute__ValueAssignment_2)
	{ after(grammarAccess.getAttributeAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Date__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Date__Group__0__Impl
	rule__Date__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Date__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDateAccess().getINTTerminalRuleCall_0()); }
	RULE_INT
	{ after(grammarAccess.getDateAccess().getINTTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Date__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Date__Group__1__Impl
	rule__Date__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Date__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDateAccess().getSolidusKeyword_1()); }
	'/'
	{ after(grammarAccess.getDateAccess().getSolidusKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Date__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Date__Group__2__Impl
	rule__Date__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Date__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDateAccess().getINTTerminalRuleCall_2()); }
	RULE_INT
	{ after(grammarAccess.getDateAccess().getINTTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Date__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Date__Group__3__Impl
	rule__Date__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Date__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDateAccess().getSolidusKeyword_3()); }
	'/'
	{ after(grammarAccess.getDateAccess().getSolidusKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Date__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Date__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Date__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDateAccess().getINTTerminalRuleCall_4()); }
	RULE_INT
	{ after(grammarAccess.getDateAccess().getINTTerminalRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Persons__PersonsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPersonsAccess().getPersonsPersonParserRuleCall_0()); }
		rulePerson
		{ after(grammarAccess.getPersonsAccess().getPersonsPersonParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__CpfAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPersonAccess().getCpfValidIDParserRuleCall_1_0()); }
		ruleValidID
		{ after(grammarAccess.getPersonAccess().getCpfValidIDParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__AttributesAssignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPersonAccess().getAttributesAttributeParserRuleCall_3_0_0()); }
		ruleAttribute
		{ after(grammarAccess.getPersonAccess().getAttributesAttributeParserRuleCall_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Person__AttributesAssignment_3_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPersonAccess().getAttributesAttributeParserRuleCall_3_1_1_0()); }
		ruleAttribute
		{ after(grammarAccess.getPersonAccess().getAttributesAttributeParserRuleCall_3_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__KeyAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getKeySTRINGTerminalRuleCall_0_0()); }
		RULE_STRING
		{ after(grammarAccess.getAttributeAccess().getKeySTRINGTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getValueValueParserRuleCall_2_0()); }
		ruleValue
		{ after(grammarAccess.getAttributeAccess().getValueValueParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;