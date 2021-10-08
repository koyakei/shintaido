package infomaticCurrency.basic.currencyRepository

interface CurrencyPropertyRepository {
    fun save(currencyPropertyDTO: CurrencyPropertyDTO)
    fun delete(currencyDeleteRequest: CurrencyDeleteRequest)
}