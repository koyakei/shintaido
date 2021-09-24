package infomaticCurrency.variationOfCurrentize.variationOfEvent

import infomaticCurrency.variationOfCurrentize.CurrencyEventElement
import shintaido.fundamentalBasic.tenshingoso.element.イ

interface CurrencyReadingEvent : イ,CurrencyEventElement{
    override val beforeElement: CurrencyAttachEvent
    override val nextElement: CurrencyDetachEvent
}