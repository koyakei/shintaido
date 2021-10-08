package infomaticCurrency.variationOfCurrentize.variationOfLifeCycleEvent

import shintaido.fundamentalBasic.tenshingoso.TenshingosoElement

interface CurrencyEventElement :TenshingosoElement{
    override val beforeElement: CurrencyEventElement
    override val nextElement: CurrencyEventElement
}