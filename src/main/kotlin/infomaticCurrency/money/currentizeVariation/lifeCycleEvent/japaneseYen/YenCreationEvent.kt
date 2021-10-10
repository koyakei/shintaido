package infomaticCurrency.money.currentizeVariation.lifeCycleEvent.japaneseYen

import infomaticCurrency.basic.Trader
import infomaticCurrency.money.Money
import infomaticCurrency.money.currentizeVariation.lifeCycleEvent.MoneyCreationEvent
import infomaticCurrency.money.currentizeVariation.lifeCycleEvent.japaneseYen.yenRepository.UndertakerRepository


interface YenCreationEvent : MoneyCreationEvent {
    // こうやってプロパティをむやみに増やすのはいいことなのか？
    val undertakerIdentifier: KumiteParticipant.Identifier
    val undertakerRepository: UndertakerRepository
    /**
     * 作る　所有権を作成者に与える
     * 発行者と発行量を指定すると
     * 発行者に
     * 日銀の債務の引受と発行は別にするか？
     * 裏付けがあるかどうかはお金の全てではない　自社トークンの発行を考えよ
     */
    override fun handle(amount: Money.Amount, publisher: Trader) =
//　債務引受処理を書く
        super.handle(債権引受(amount, undertakerIdentifier), publisher)



    /**
     * Trader に買ってもらう
     * trader を債務引受人にしていいのか？ いいと思う
     * 　引受する人を募集する
     * 買ってもらう
     * 買ってもらった分だけ銀行券を発行できる
     * 今は募集はしないで、引受した状態を永続リポジトリに記載するところだけ
     */
    fun 債権引受(amount: Money.Amount, undertakeIdentifier: KumiteParticipant.Identifier) =
        undertakerRepository.save(UndertakerRepository.UndertakeDTO(amount, undertakeIdentifier)).amount


}