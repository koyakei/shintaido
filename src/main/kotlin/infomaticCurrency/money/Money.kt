package infomaticCurrency.money

import infomaticCurrency.basic.通貨性

/**
 * currentize しない　競争しないから公正な最適化がされないので、幸せの上限がありますよ
 * という証明にするか。技を効かせるから公正である。
 */
interface Money : 通貨性 {
    @JvmInline
    value class Amount(val long: Long)
    /**
     * お金には数値比較による交換市場があるという表現
     */
    val ruleForExchangingMoney: RuleForExchangingPropertyMoney

    /**
     * お金の創造は創造主しかできない
     * でもこれは無制限と行っているのと同じか
     */
    val amount: Amount

    /**
     * お金は作ったら所有権の移転は無制限である
     */

    /**
     * Attach detach 不可能
     */

}