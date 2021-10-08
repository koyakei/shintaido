package infomaticCurrency.money.currentizeVariation.lifeCycleEvent

import infomaticCurrency.basic.currencyRepository.CurrencyPropertyRepository
import infomaticCurrency.money.Money
import infomaticCurrency.money.moneyRepository.MoneyDeleteRequest
import infomaticCurrency.variationOfCurrentize.variationOfLifeCycleEvent.CurrencyDeleteEvent

interface MoneyDeleteEvent :CurrencyDeleteEvent{
    val currencyPropertyRepository: CurrencyPropertyRepository
    fun handle(kumiteParticipantIdentifier: KumiteParticipant.Identifier,
               moneyAmount: Money.Amount
    ){
        currencyPropertyRepository.delete(
            MoneyDeleteRequest(kumiteParticipantIdentifier,moneyAmount)
        )
    }
}