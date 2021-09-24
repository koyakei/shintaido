package infomaticCurrency.variationOfCurrentize.variationOfEvent

import infomaticCurrency.variationOfCurrentize.CurrencyEventElement
import shintaido.fundamentalBasic.tenshingoso.element.エ

interface CurrencyAttachEvent: エ, CurrencyEventElement {
    override val beforeElement: CurrencyCreationEvent
    override val nextElement: CurrencyReadingEvent
}