package infomaticCurrency.basic.currencyRepository

import infomaticCurrency.basic.Trader
import infomaticCurrency.money.Money

data class CurrencyPropertySaveRequestDTO(val id: Long,
                                          val publisher: Trader,
                                          val amount: Money.Amount) {

}