package infomaticCurrency.money.moneyRepository

import infomaticCurrency.money.Money

class MoneyExchangeDTO(
    val amount: Money.Amount,
    val traderIdentifier: KumiteParticipant.Identifier
){
}