package infomaticCurrency.basic.currencyRepository

import infomaticCurrency.basic.Trader

data class CurrencyPropertyDTO(val id: Long,
                          val publisher: Trader,
                          val amount: Number) {

}