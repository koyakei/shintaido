package infomaticCurrency.graphCurrency

import infomaticCurrency.SingleInformaticCurrencyUnit
import infomaticCurrency.functionOfCurrency.CurrencyAttachedTarget

interface SingleGraphCurrencyUnit :SingleInformaticCurrencyUnit{
    val currencyAttachedTarget: CurrencyAttachedTarget
}