package infomaticCurrency

import infomaticCurrency.variationOfCurrentize.variationOfEvent.*
import shintaido.fundamentalBasic.tenshingoso.Tenshingoso
import shintaido.fundamentalBasic.tenshingoso.element.*

interface InformaticCurrencyTenshingoso:Tenshingoso {
    override val tenshingosoElementA: CurrencyCreationEvent
    override val tenshingosoElementE: CurrencyAttachEvent
    override val tenshingosoElementI: CurrencyReadingEvent
    override val tenshingosoElementO: CurrencyDetachEvent
    override val tenshingosoElementUM: CurrencyDeleteEvent

    val AEventCount: Number
    val EEventCount: Number
    val IEventCount: Number

    val balanceCapacityNumber: Number

    /**
     * バランスが許容範囲かどうかを判定するサンプル関数
     */
    fun inCapacityOfBalance(): Boolean{
        return ( balanceCapacityNumber.toLong() > (AEventCount.toLong() - EEventCount.toLong())+ EEventCount.toLong() - IEventCount.toLong())
    }
}