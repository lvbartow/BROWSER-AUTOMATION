/*
 * generated by Xtext 2.36.0
 */
grammar InternalBad;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.project.browserautomation.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	iv_ruleProgram=ruleProgram
	{ $current=$iv_ruleProgram.current; }
	EOF;

// Rule Program
ruleProgram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getProgramAccess().getInstructionsInstructionParserRuleCall_0());
			}
			lv_instructions_0_0=ruleInstruction
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getProgramRule());
				}
				add(
					$current,
					"instructions",
					lv_instructions_0_0,
					"org.project.browserautomation.Bad.Instruction");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleInstruction
entryRuleInstruction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstructionRule()); }
	iv_ruleInstruction=ruleInstruction
	{ $current=$iv_ruleInstruction.current; }
	EOF;

// Rule Instruction
ruleInstruction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getNavigateToUrlParserRuleCall_0());
		}
		this_NavigateToUrl_0=ruleNavigateToUrl
		{
			$current = $this_NavigateToUrl_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getClickOnParserRuleCall_1());
		}
		this_ClickOn_1=ruleClickOn
		{
			$current = $this_ClickOn_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getFillFieldParserRuleCall_2());
		}
		this_FillField_2=ruleFillField
		{
			$current = $this_FillField_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getCheckExistsParserRuleCall_3());
		}
		this_CheckExists_3=ruleCheckExists
		{
			$current = $this_CheckExists_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getCheckboxActionParserRuleCall_4());
		}
		this_CheckboxAction_4=ruleCheckboxAction
		{
			$current = $this_CheckboxAction_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstructionAccess().getStoreElementParserRuleCall_5());
		}
		this_StoreElement_5=ruleStoreElement
		{
			$current = $this_StoreElement_5.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleNavigateToUrl
entryRuleNavigateToUrl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNavigateToUrlRule()); }
	iv_ruleNavigateToUrl=ruleNavigateToUrl
	{ $current=$iv_ruleNavigateToUrl.current; }
	EOF;

// Rule NavigateToUrl
ruleNavigateToUrl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='NAV_TO'
		{
			newLeafNode(otherlv_0, grammarAccess.getNavigateToUrlAccess().getNAV_TOKeyword_0());
		}
		(
			(
				lv_url_1_0=RULE_URL
				{
					newLeafNode(lv_url_1_0, grammarAccess.getNavigateToUrlAccess().getUrlURLTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNavigateToUrlRule());
					}
					setWithLastConsumed(
						$current,
						"url",
						lv_url_1_0,
						"org.project.browserautomation.Bad.URL");
				}
			)
		)
	)
;

// Entry rule entryRuleCheckExists
entryRuleCheckExists returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCheckExistsRule()); }
	iv_ruleCheckExists=ruleCheckExists
	{ $current=$iv_ruleCheckExists.current; }
	EOF;

// Rule CheckExists
ruleCheckExists returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='CHECK_EXISTS'
			{
				newLeafNode(otherlv_0, grammarAccess.getCheckExistsAccess().getCHECK_EXISTSKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCheckExistsAccess().getTypeElemTypeEnumRuleCall_0_1_0());
					}
					lv_type_1_0=ruleElemType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCheckExistsRule());
						}
						set(
							$current,
							"type",
							lv_type_1_0,
							"org.project.browserautomation.Bad.ElemType");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					lv_id_2_0=RULE_STRING
					{
						newLeafNode(lv_id_2_0, grammarAccess.getCheckExistsAccess().getIdSTRINGTerminalRuleCall_0_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCheckExistsRule());
						}
						setWithLastConsumed(
							$current,
							"id",
							lv_id_2_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
		    |
		(
			otherlv_3='CHECK_EXISTS'
			{
				newLeafNode(otherlv_3, grammarAccess.getCheckExistsAccess().getCHECK_EXISTSKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCheckExistsAccess().getTypeElemTypeEnumRuleCall_1_1_0());
					}
					lv_type_4_0=ruleElemType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCheckExistsRule());
						}
						set(
							$current,
							"type",
							lv_type_4_0,
							"org.project.browserautomation.Bad.ElemType");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_5='FROM'
			{
				newLeafNode(otherlv_5, grammarAccess.getCheckExistsAccess().getFROMKeyword_1_2());
			}
			otherlv_6='VAR'
			{
				newLeafNode(otherlv_6, grammarAccess.getCheckExistsAccess().getVARKeyword_1_3());
			}
			(
				(
					lv_varname_7_0=RULE_STRING
					{
						newLeafNode(lv_varname_7_0, grammarAccess.getCheckExistsAccess().getVarnameSTRINGTerminalRuleCall_1_4_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCheckExistsRule());
						}
						setWithLastConsumed(
							$current,
							"varname",
							lv_varname_7_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
	)
;

// Entry rule entryRuleClickOn
entryRuleClickOn returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClickOnRule()); }
	iv_ruleClickOn=ruleClickOn
	{ $current=$iv_ruleClickOn.current; }
	EOF;

// Rule ClickOn
ruleClickOn returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='CLICK_ON'
			{
				newLeafNode(otherlv_0, grammarAccess.getClickOnAccess().getCLICK_ONKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getClickOnAccess().getTypeClickTypeEnumRuleCall_0_1_0());
					}
					lv_type_1_0=ruleClickType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getClickOnRule());
						}
						set(
							$current,
							"type",
							lv_type_1_0,
							"org.project.browserautomation.Bad.ClickType");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					(
						lv_id_2_0=RULE_STRING
						{
							newLeafNode(lv_id_2_0, grammarAccess.getClickOnAccess().getIdSTRINGTerminalRuleCall_0_2_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getClickOnRule());
							}
							setWithLastConsumed(
								$current,
								"id",
								lv_id_2_0,
								"org.eclipse.xtext.common.Terminals.STRING");
						}
					)
				)
				    |
				(
					(
						otherlv_3='VAR'
						{
							newLeafNode(otherlv_3, grammarAccess.getClickOnAccess().getVARKeyword_0_2_1_0());
						}
					)+
					(
						(
							lv_varname_4_0=RULE_STRING
							{
								newLeafNode(lv_varname_4_0, grammarAccess.getClickOnAccess().getVarnameSTRINGTerminalRuleCall_0_2_1_1_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getClickOnRule());
								}
								setWithLastConsumed(
									$current,
									"varname",
									lv_varname_4_0,
									"org.eclipse.xtext.common.Terminals.STRING");
							}
						)
					)
				)
			)
		)
		    |
		(
			otherlv_5='CLICK_ON'
			{
				newLeafNode(otherlv_5, grammarAccess.getClickOnAccess().getCLICK_ONKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getClickOnAccess().getTypeClickTypeEnumRuleCall_1_1_0());
					}
					lv_type_6_0=ruleClickType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getClickOnRule());
						}
						set(
							$current,
							"type",
							lv_type_6_0,
							"org.project.browserautomation.Bad.ClickType");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_7='POS'
			{
				newLeafNode(otherlv_7, grammarAccess.getClickOnAccess().getPOSKeyword_1_2());
			}
			(
				(
					lv_pos_index_8_0=RULE_INT
					{
						newLeafNode(lv_pos_index_8_0, grammarAccess.getClickOnAccess().getPos_indexINTTerminalRuleCall_1_3_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getClickOnRule());
						}
						setWithLastConsumed(
							$current,
							"pos_index",
							lv_pos_index_8_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			otherlv_9='IN'
			{
				newLeafNode(otherlv_9, grammarAccess.getClickOnAccess().getINKeyword_1_4());
			}
			(
				(
					lv_id_10_0=RULE_STRING
					{
						newLeafNode(lv_id_10_0, grammarAccess.getClickOnAccess().getIdSTRINGTerminalRuleCall_1_5_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getClickOnRule());
						}
						setWithLastConsumed(
							$current,
							"id",
							lv_id_10_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
		    |
		(
			otherlv_11='CLICK_ON'
			{
				newLeafNode(otherlv_11, grammarAccess.getClickOnAccess().getCLICK_ONKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getClickOnAccess().getTypeClickTypeEnumRuleCall_2_1_0());
					}
					lv_type_12_0=ruleClickType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getClickOnRule());
						}
						set(
							$current,
							"type",
							lv_type_12_0,
							"org.project.browserautomation.Bad.ClickType");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					lv_id_combo_13_0=RULE_STRING
					{
						newLeafNode(lv_id_combo_13_0, grammarAccess.getClickOnAccess().getId_comboSTRINGTerminalRuleCall_2_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getClickOnRule());
						}
						setWithLastConsumed(
							$current,
							"id_combo",
							lv_id_combo_13_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_14='VALUE'
			{
				newLeafNode(otherlv_14, grammarAccess.getClickOnAccess().getVALUEKeyword_2_3());
			}
			(
				(
					lv_to_select_15_0=RULE_STRING
					{
						newLeafNode(lv_to_select_15_0, grammarAccess.getClickOnAccess().getTo_selectSTRINGTerminalRuleCall_2_4_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getClickOnRule());
						}
						setWithLastConsumed(
							$current,
							"to_select",
							lv_to_select_15_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
	)
;

// Entry rule entryRuleCheckboxAction
entryRuleCheckboxAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCheckboxActionRule()); }
	iv_ruleCheckboxAction=ruleCheckboxAction
	{ $current=$iv_ruleCheckboxAction.current; }
	EOF;

// Rule CheckboxAction
ruleCheckboxAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='CHECKBOX_ACTION'
		{
			newLeafNode(otherlv_0, grammarAccess.getCheckboxActionAccess().getCHECKBOX_ACTIONKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCheckboxActionAccess().getBoolBoolStringEnumRuleCall_1_0());
				}
				lv_bool_1_0=ruleBoolString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCheckboxActionRule());
					}
					set(
						$current,
						"bool",
						lv_bool_1_0,
						"org.project.browserautomation.Bad.BoolString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2='ALL'
			{
				newLeafNode(otherlv_2, grammarAccess.getCheckboxActionAccess().getALLKeyword_2_0());
			}
			    |
			(
				(
					lv_actions_3_0=RULE_STRING
					{
						newLeafNode(lv_actions_3_0, grammarAccess.getCheckboxActionAccess().getActionsSTRINGTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCheckboxActionRule());
						}
						addWithLastConsumed(
							$current,
							"actions",
							lv_actions_3_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)*
		)
	)
;

// Entry rule entryRuleFillField
entryRuleFillField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFillFieldRule()); }
	iv_ruleFillField=ruleFillField
	{ $current=$iv_ruleFillField.current; }
	EOF;

// Rule FillField
ruleFillField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='FILL_FIELD'
		{
			newLeafNode(otherlv_0, grammarAccess.getFillFieldAccess().getFILL_FIELDKeyword_0());
		}
		otherlv_1='NAME'
		{
			newLeafNode(otherlv_1, grammarAccess.getFillFieldAccess().getNAMEKeyword_1());
		}
		(
			(
				lv_id_2_0=RULE_STRING
				{
					newLeafNode(lv_id_2_0, grammarAccess.getFillFieldAccess().getIdSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFillFieldRule());
					}
					setWithLastConsumed(
						$current,
						"id",
						lv_id_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='VALUE'
		{
			newLeafNode(otherlv_3, grammarAccess.getFillFieldAccess().getVALUEKeyword_3());
		}
		(
			(
				(
					lv_value_4_0=RULE_STRING
					{
						newLeafNode(lv_value_4_0, grammarAccess.getFillFieldAccess().getValueSTRINGTerminalRuleCall_4_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFillFieldRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_4_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			    |
			(
				otherlv_5='FROM'
				{
					newLeafNode(otherlv_5, grammarAccess.getFillFieldAccess().getFROMKeyword_4_1_0());
				}
				otherlv_6='VAR'
				{
					newLeafNode(otherlv_6, grammarAccess.getFillFieldAccess().getVARKeyword_4_1_1());
				}
				(
					(
						lv_varname_7_0=RULE_STRING
						{
							newLeafNode(lv_varname_7_0, grammarAccess.getFillFieldAccess().getVarnameSTRINGTerminalRuleCall_4_1_2_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getFillFieldRule());
							}
							setWithLastConsumed(
								$current,
								"varname",
								lv_varname_7_0,
								"org.eclipse.xtext.common.Terminals.STRING");
						}
					)
				)
			)
		)
	)
;

// Entry rule entryRuleStoreElement
entryRuleStoreElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStoreElementRule()); }
	iv_ruleStoreElement=ruleStoreElement
	{ $current=$iv_ruleStoreElement.current; }
	EOF;

// Rule StoreElement
ruleStoreElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='STORE_ELEMENT'
			{
				newLeafNode(otherlv_0, grammarAccess.getStoreElementAccess().getSTORE_ELEMENTKeyword_0_0());
			}
			otherlv_1='POS'
			{
				newLeafNode(otherlv_1, grammarAccess.getStoreElementAccess().getPOSKeyword_0_1());
			}
			(
				(
					lv_pos_index_2_0=RULE_INT
					{
						newLeafNode(lv_pos_index_2_0, grammarAccess.getStoreElementAccess().getPos_indexINTTerminalRuleCall_0_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStoreElementRule());
						}
						setWithLastConsumed(
							$current,
							"pos_index",
							lv_pos_index_2_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			otherlv_3='FROM'
			{
				newLeafNode(otherlv_3, grammarAccess.getStoreElementAccess().getFROMKeyword_0_3());
			}
			(
				(
					lv_id_from_4_0=RULE_STRING
					{
						newLeafNode(lv_id_from_4_0, grammarAccess.getStoreElementAccess().getId_fromSTRINGTerminalRuleCall_0_4_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStoreElementRule());
						}
						setWithLastConsumed(
							$current,
							"id_from",
							lv_id_from_4_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_5='PROP'
			{
				newLeafNode(otherlv_5, grammarAccess.getStoreElementAccess().getPROPKeyword_0_5());
			}
			(
				(
					lv_prop_name_6_0=RULE_STRING
					{
						newLeafNode(lv_prop_name_6_0, grammarAccess.getStoreElementAccess().getProp_nameSTRINGTerminalRuleCall_0_6_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStoreElementRule());
						}
						setWithLastConsumed(
							$current,
							"prop_name",
							lv_prop_name_6_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_7='IN'
			{
				newLeafNode(otherlv_7, grammarAccess.getStoreElementAccess().getINKeyword_0_7());
			}
			otherlv_8='VAR'
			{
				newLeafNode(otherlv_8, grammarAccess.getStoreElementAccess().getVARKeyword_0_8());
			}
			(
				(
					lv_varname_9_0=RULE_STRING
					{
						newLeafNode(lv_varname_9_0, grammarAccess.getStoreElementAccess().getVarnameSTRINGTerminalRuleCall_0_9_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStoreElementRule());
						}
						setWithLastConsumed(
							$current,
							"varname",
							lv_varname_9_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
		    |
		(
			otherlv_10='STORE_ELEMENT'
			{
				newLeafNode(otherlv_10, grammarAccess.getStoreElementAccess().getSTORE_ELEMENTKeyword_1_0());
			}
			otherlv_11='FROM'
			{
				newLeafNode(otherlv_11, grammarAccess.getStoreElementAccess().getFROMKeyword_1_1());
			}
			(
				(
					lv_id_from_12_0=RULE_STRING
					{
						newLeafNode(lv_id_from_12_0, grammarAccess.getStoreElementAccess().getId_fromSTRINGTerminalRuleCall_1_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStoreElementRule());
						}
						setWithLastConsumed(
							$current,
							"id_from",
							lv_id_from_12_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_13='PROP'
			{
				newLeafNode(otherlv_13, grammarAccess.getStoreElementAccess().getPROPKeyword_1_3());
			}
			(
				(
					lv_prop_name_14_0=RULE_STRING
					{
						newLeafNode(lv_prop_name_14_0, grammarAccess.getStoreElementAccess().getProp_nameSTRINGTerminalRuleCall_1_4_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStoreElementRule());
						}
						setWithLastConsumed(
							$current,
							"prop_name",
							lv_prop_name_14_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			otherlv_15='IN'
			{
				newLeafNode(otherlv_15, grammarAccess.getStoreElementAccess().getINKeyword_1_5());
			}
			otherlv_16='VAR'
			{
				newLeafNode(otherlv_16, grammarAccess.getStoreElementAccess().getVARKeyword_1_6());
			}
			(
				(
					lv_varname_17_0=RULE_STRING
					{
						newLeafNode(lv_varname_17_0, grammarAccess.getStoreElementAccess().getVarnameSTRINGTerminalRuleCall_1_7_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStoreElementRule());
						}
						setWithLastConsumed(
							$current,
							"varname",
							lv_varname_17_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
	)
;

// Rule ClickType
ruleClickType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='BUTTON'
			{
				$current = grammarAccess.getClickTypeAccess().getBUTTONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getClickTypeAccess().getBUTTONEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='LINK'
			{
				$current = grammarAccess.getClickTypeAccess().getLINKEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getClickTypeAccess().getLINKEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='IMAGE'
			{
				$current = grammarAccess.getClickTypeAccess().getIMAGEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getClickTypeAccess().getIMAGEEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='COMBO'
			{
				$current = grammarAccess.getClickTypeAccess().getCOMBOEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getClickTypeAccess().getCOMBOEnumLiteralDeclaration_3());
			}
		)
	)
;

// Rule ElemType
ruleElemType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='LINK'
			{
				$current = grammarAccess.getElemTypeAccess().getLINKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getElemTypeAccess().getLINKEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='TEXT'
			{
				$current = grammarAccess.getElemTypeAccess().getTEXTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getElemTypeAccess().getTEXTEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule BoolString
ruleBoolString returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='TRUE'
			{
				$current = grammarAccess.getBoolStringAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getBoolStringAccess().getTRUEEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='FALSE'
			{
				$current = grammarAccess.getBoolStringAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getBoolStringAccess().getFALSEEnumLiteralDeclaration_1());
			}
		)
	)
;

RULE_URL : 'http' 's'? '://' 'www.'? ('-'|'.'|'+'|'~'|'#'|'='|'%'|'_'|'@'|':'|'a'..'z'|'A'..'Z'|'0..9')+ '.' ('a'..'z'|'A'..'Z'|'0'..'9'|'('|')')+ ('-'|'.'|'+'|'~'|'#'|'='|'%'|'_'|'@'|':'|'/'|'?'|'&'|'a'..'z'|'A'..'Z'|'0'..'9'|'('|')')*;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
