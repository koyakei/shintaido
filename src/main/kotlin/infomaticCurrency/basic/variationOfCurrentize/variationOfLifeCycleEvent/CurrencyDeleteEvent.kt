package infomaticCurrency.variationOfCurrentize.variationOfLifeCycleEvent

import shintaido.fundamentalBasic.tenshingoso.element.ウン

interface CurrencyDeleteEvent:ウン, CurrencyEventElement {
    override val beforeElement: CurrencyDetachEvent
    override val nextElement: CurrencyCreationEvent


}
