package infomaticCurrency.money.currentizeVariation.lifeCycleEvent.japaneseYen.yenRepository

import infomaticCurrency.money.Money

sealed interface UndertakerRepository{
    data class UndertakeDTO(
        val amount: Money.Amount,
        val undertakerIdentifier: KumiteParticipant.Identifier
    )
    fun save(undertakeDTO: UndertakeDTO):UndertakeDTO
}