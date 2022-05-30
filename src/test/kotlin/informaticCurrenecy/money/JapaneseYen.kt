package informaticCurrenecy.money

import infomaticCurrency.basic.RuleOfMinimumUnitOfCurrency
import infomaticCurrency.money.Money
import infomaticCurrency.money.RuleForExchangingPropertyMoney
import infomaticCurrency.basic.通貨性
import infomaticCurrency.variationOfCurrentize.ruleForFunction.*
import infomaticCurrency.variationOfCurrentize.ruleForPropertyLifeCycle.RuleForCreateMoneyMoney
import infomaticCurrency.variationOfCurrentize.ruleForPropertyLifeCycle.RuleForDeleteMoneyMoney

class JapaneseYen(
    override val name: 通貨性.NameOfCurrency = 通貨性.NameOfCurrency("日本円"),
    override val unitOfCurrency: RuleOfMinimumUnitOfCurrency,
    override val ruleForCreation: RuleForCreation,
    override val ruleForExchangingProperty: RuleForExchangingProperty,
    override val ruleForReading: RuleForReading,
    override val ruleForCreateProperty: RuleForCreateMoneyMoney,
    override val ruleForDeleteProperty: RuleForDeleteMoneyMoney,
    override val ruleForAttach: RuleForAttach,
    override val ruleForDetach: RuleForDetach,
    override val ruleForDelete: RuleForDelete,
    override val ruleForExchangingMoney: RuleForExchangingPropertyMoney,
    override val amount: Money.Amount
) : Money