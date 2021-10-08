package informaticCurrenecy.money

import infomaticCurrency.RuleOfMinimumUnitOfCurrency
import infomaticCurrency.money.Money
import infomaticCurrency.money.RuleForExchangingMoney
import infomaticCurrency.variationOfCurrentize.RuleForCreation
import infomaticCurrency.variationOfCurrentize.RuleForExchanging
import infomaticCurrency.variationOfCurrentize.RuleForReading
import infomaticCurrency.通貨性

class JapaneseYen(
    override val ruleForExｚchangingMoney: RuleForExchangingMoney,
    override val name: 通貨性.NameOfCurrency = 通貨性.NameOfCurrency("日本円"),
    override val unitOfCurrency: RuleOfMinimumUnitOfCurrency,
    override val ruleForCreation: RuleForCreation,
    override val ruleForExchanging: RuleForExchanging,
    override val ruleForReading: RuleForReading
) : Money