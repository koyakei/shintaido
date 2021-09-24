package infomaticCurrency.variationOfCurrentize.variationOfEvent

import infomaticCurrency.variationOfCurrentize.CurrencyEventElement
import shintaido.fundamentalBasic.tenshingoso.element.ア

interface CurrencyCreationEvent:ア,CurrencyEventElement {
    override val beforeElement: CurrencyDeleteEvent
    override val nextElement: CurrencyAttachEvent
}
