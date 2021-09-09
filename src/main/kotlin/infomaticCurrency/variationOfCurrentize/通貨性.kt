package infomaticCurrency.variationOfCurrentize

import infomaticCurrency.RuleOfUnitOfCurrency

/**
 *
 */
interface 通貨性 {
    @JvmInline
    value class NameOfCurrency(val name: String)
    /**
     * 通貨の名前
     */
    val name: NameOfCurrency

    /**
     * 通貨には単位がある
     */
    val unitOfCurrency: RuleOfUnitOfCurrency

    val ruleForCreation: RuleForCreation

    val ruleForExchanging: RuleForExchanging

    val ruleForReading: RuleForReading


}