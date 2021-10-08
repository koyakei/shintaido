package informaticCurrenecy.money

import infomaticCurrency.basic.RuleOfMinimumUnitOfCurrency
import infomaticCurrency.money.Money
import infomaticCurrency.money.RuleForExchangingPropertyMoney
import infomaticCurrency.variationOfCurrentize.ruleForFunction.RuleForCreation
import infomaticCurrency.variationOfCurrentize.ruleForFunction.RuleForExchangingProperty
import infomaticCurrency.variationOfCurrentize.ruleForFunction.RuleForReading
import infomaticCurrency.basic.通貨性

class JapaneseYen(
    override val ruleForExｚchangingMoney: RuleForExchangingPropertyMoney,
    override val name: 通貨性.NameOfCurrency = 通貨性.NameOfCurrency("日本円"),
    override val unitOfCurrency: RuleOfMinimumUnitOfCurrency,
    override val ruleForCreation: RuleForCreation,
    override val ruleForExchangingProperty: RuleForExchangingProperty,
    override val ruleForReading: RuleForReading
) : Money