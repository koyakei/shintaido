package infomaticCurrency.money.currentizeVariation.lifeCycleEvent

import infomaticCurrency.basic.currencyRepository.CurrencyPropertyRepository
import infomaticCurrency.money.Money
import infomaticCurrency.money.moneyRepository.MoneyDeleteRequestDTO
import infomaticCurrency.variationOfCurrentize.variationOfLifeCycleEvent.CurrencyDeleteEvent

interface MoneyDeleteEvent :CurrencyDeleteEvent{
    val currencyPropertyRepository: CurrencyPropertyRepository
    fun handle(kumiteParticipantIdentifier: KumiteParticipant.Identifier,
               moneyAmount: Money.Amount
    ){
        currencyPropertyRepository.delete(
            MoneyDeleteRequestDTO(kumiteParticipantIdentifier,moneyAmount)
        )
    }
}