package infomaticCurrency.money.currentizeVariation.lifeCycleEvent

import infomaticCurrency.basic.Trader
import infomaticCurrency.basic.currencyRepository.CurrencyPropertyDTO
import infomaticCurrency.basic.currencyRepository.CurrencyPropertyRepository
import infomaticCurrency.variationOfCurrentize.variationOfLifeCycleEvent.CurrencyCreationEvent


interface MoneyCreationEvent :CurrencyCreationEvent{
    val currencyPropertyRepository: CurrencyPropertyRepository
    /**
     * 作る　所有権を作成者に与える
     * 発行者と発行量を指定すると
     * 発行者に
     * 日銀の債務の引受と発行は別にするか？
     * 裏付けがあるかどうかはお金の全てではない　自社トークンの発行を考えよ
     */
    fun handle(amount: Number, publisher: Trader){
//　お金の発行を永続リポジトリに保存する
        // 所有者　個数
        currencyPropertyRepository.save(CurrencyPropertyDTO(
            1,publisher,amount
        ))
    }
}