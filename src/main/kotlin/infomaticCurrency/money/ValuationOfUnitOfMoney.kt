package infomaticCurrency.money

import infomaticCurrency.RuleOfUnitOfCurrency

interface ValuationOfUnitOfMoney<out T : Number> : RuleOfUnitOfCurrency {
    /**
     * 基数はどんな通貨にもあるか？
     * グラフの場合は基数として扱わないことにするかな。
     * グラフ
     */
    val cardinalNumber: T
}