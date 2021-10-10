package infomaticCurrency.money.currentizeVariation.lifeCycleEvent

import infomaticCurrency.money.Money
import infomaticCurrency.money.moneyRepository.MoneyExchangeDTO
import infomaticCurrency.money.moneyRepository.MoneyPropertyRepository

/**
 * 所有権の交換であろう
 * 所有権をいくら誰に与えるかリクエストを送る
 * 受け取らないという選択肢があるの？　ないとしよう
 *
 * リクエストを受けたら永続リポジトリの所有者を書き換える
 * 新しい所有者
 */
interface MoneyExchangeEvent {
    val moneyPropertyRepository: MoneyPropertyRepository
    fun handle(moneyExchangeRequest: MoneyExchangeRequest){
        // transaction 開始
        // 古い所有権を消す
        // 一単位ごとに所有権を書き換えてもいいのだが、
        // 技術的な部分には立ち入らない 　TODO:交換時どのお金を書き換えるのか指定しない?
        moneyPropertyRepository.exchange(MoneyExchangeDTO(
            moneyExchangeRequest.amount,
            moneyExchangeRequest.traderIdentifier
        ))
    }
    interface MoneyExchangeRequest{
        val amount: Money.Amount
        val traderIdentifier: KumiteParticipant.Identifier
    }
}