package infomaticCurrency.money.moneyRepository

import infomaticCurrency.basic.currencyRepository.CurrencyDeleteRequestDTO
import infomaticCurrency.money.Money

data class MoneyDeleteRequestDTO(
    override val kumiteParticipantIdentifier: KumiteParticipant.Identifier,
    val moneyAmount: Money.Amount
):CurrencyDeleteRequestDTO