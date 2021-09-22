package infomaticCurrency

import infomaticCurrency.functionOfCurrency.SingleUnitOfCurrencyProperty

interface SingleInformaticCurrencyUnit {
    @JvmInline
    value class Identifier(val number: Number)
    val identifier: Identifier
    val singleUnitOfCurrencyProperty :SingleUnitOfCurrencyProperty

}