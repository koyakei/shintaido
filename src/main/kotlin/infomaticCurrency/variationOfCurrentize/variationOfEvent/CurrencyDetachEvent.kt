package infomaticCurrency.variationOfCurrentize.variationOfEvent

import infomaticCurrency.variationOfCurrentize.CurrencyEventElement
import shintaido.fundamentalBasic.tenshingoso.element.オ

interface CurrencyDetachEvent : オ, CurrencyEventElement {

    override val beforeElement: CurrencyReadingEvent
    override val nextElement: CurrencyDeleteEvent
}