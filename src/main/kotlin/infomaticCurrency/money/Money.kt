package infomaticCurrency.money

import infomaticCurrency.variationOfCurrentize.通貨性

interface Money : 通貨性 {
    /**
     * お金には数値比較による交換市場があるという表現
     */
    val ruleForExｚchangingMoney: RuleForExchangingMoney

}