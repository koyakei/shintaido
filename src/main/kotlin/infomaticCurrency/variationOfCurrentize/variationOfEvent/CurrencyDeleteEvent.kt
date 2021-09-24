package infomaticCurrency.variationOfCurrentize.variationOfEvent

import infomaticCurrency.variationOfCurrentize.CurrencyEventElement
import shintaido.fundamentalBasic.tenshingoso.element.ア
import shintaido.fundamentalBasic.tenshingoso.element.ウン
import shintaido.fundamentalBasic.tenshingoso.element.オ

interface CurrencyDeleteEvent:ウン,CurrencyEventElement {
    override val beforeElement: CurrencyDetachEvent
    override val nextElement: CurrencyCreationEvent


}
