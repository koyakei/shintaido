package infomaticCurrency.money

import infomaticCurrency.basic.RuleOfMinimumUnitOfCurrency
import infomaticCurrency.money.market.MarketParticipant

interface ValuationOfMinimumUnitOfMoney : RuleOfMinimumUnitOfCurrency {
    /**
     * 所有権の移転に制限はない。
     *　所有していて総量規制があるのがお金としておこう
     * お金の最小単位ごとに必ず所有者がいる
     * 所有者は単独である。
     */
    val owner: MarketParticipant

}