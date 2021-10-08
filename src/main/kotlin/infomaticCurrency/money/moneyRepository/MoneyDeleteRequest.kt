package infomaticCurrency.money.moneyRepository

import infomaticCurrency.basic.currencyRepository.CurrencyDeleteRequest
import infomaticCurrency.money.Money

data class MoneyDeleteRequest(
    override val kumiteParticipantIdentifier: KumiteParticipant.Identifier,
    val moneyAmount: Money.Amount
):CurrencyDeleteRequest