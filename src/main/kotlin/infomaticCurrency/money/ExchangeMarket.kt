package infomaticCurrency.money

/**
 *　
 */
interface ExchangeMarket {
    val marketParticipant: MarketParticipant
    /**
     * 相場の場所はここでいいのか？
     */
    interface 相場{
        val firstValuationOfUnitOfMoney: ValuationOfUnitOfMoney<Number>
        val secondValuationOfUnitOfMoney: ValuationOfUnitOfMoney<Number>
    }

    val v相場: 相場
}