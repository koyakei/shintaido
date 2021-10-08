package infomaticCurrency.basic.currencyRepository

interface CurrencyPropertyRepository {
    fun save(currencyPropertySaveRequestDTO: CurrencyPropertySaveRequestDTO)
    fun delete(currencyDeleteRequestDTO: CurrencyDeleteRequestDTO)
}