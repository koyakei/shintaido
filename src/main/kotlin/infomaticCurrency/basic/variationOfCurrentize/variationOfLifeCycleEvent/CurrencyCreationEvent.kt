package infomaticCurrency.variationOfCurrentize.variationOfLifeCycleEvent

import shintaido.fundamentalBasic.tenshingoso.element.ア

interface CurrencyCreationEvent:ア, CurrencyEventElement {
    override val beforeElement: CurrencyDeleteEvent
    override val nextElement: CurrencyAttachEvent
}
