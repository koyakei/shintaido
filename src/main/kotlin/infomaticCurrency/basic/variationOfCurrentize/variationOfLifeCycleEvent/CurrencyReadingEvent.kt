package infomaticCurrency.variationOfCurrentize.variationOfLifeCycleEvent

import shintaido.fundamentalBasic.tenshingoso.element.イ

interface CurrencyReadingEvent : イ, CurrencyEventElement {
    override val beforeElement: CurrencyAttachEvent
    override val nextElement: CurrencyDetachEvent
}