package infomaticCurrency

import infomaticCurrency.variationOfCurrentize.RuleForCreation
import infomaticCurrency.variationOfCurrentize.RuleForExchanging
import infomaticCurrency.variationOfCurrentize.RuleForReading

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
    val unitOfCurrency: RuleOfMinimumUnitOfCurrency

    /**
     * ルールと性能は違うとおもう。　呼び方が良くないのでは？
     * 交換単位があって　数学的な代償の比較がどの程度容易なのか
     * 結びつきの変化のしにくさが適切なのか？　通貨のプラットフォームとしての性能はこれをどれだけ簡単に制御できるかどうか。
     *
     */
    val ruleForCreation: RuleForCreation

    val ruleForExchanging: RuleForExchanging

    val ruleForReading: RuleForReading


}