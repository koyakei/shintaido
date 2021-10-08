package infomaticCurrency.money.market

import infomaticCurrency.money.ValuationOfMinimumUnitOfMoney

/**
 *　
 */
interface ExchangeMarket {
    val marketParticipant: MarketParticipant
    /**
     * 相場の場所はここでいいのか？
     */
    interface 相場{
        val firstValuationOfUnitOfMoney: ValuationOfMinimumUnitOfMoney
        val secondValuationOfUnitOfMoney: ValuationOfMinimumUnitOfMoney
    }

    val v相場: 相場
}