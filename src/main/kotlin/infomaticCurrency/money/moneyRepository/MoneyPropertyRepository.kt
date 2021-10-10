package infomaticCurrency.money.moneyRepository

import infomaticCurrency.basic.currencyRepository.CurrencyPropertyRepository

interface MoneyPropertyRepository : CurrencyPropertyRepository {
    fun exchange(moneyExchangeDTO: MoneyExchangeDTO)
}