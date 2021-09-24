package infomaticCurrency.money

import infomaticCurrency.variationOfCurrentize.RuleForExchanging

/**
 * お金の交換ルール
 * 通貨と違って数学的な整合性のある計算式で交換する市場で大半のお金が交換されていることが特徴
 * どう表現するんだよ
 *
 * ここに目標を書けばいいのか？交換
 * TODO: ここから書く　お金の所有権を贈与で移転した場合にどのような変化があるのか？
 */
interface RuleForExchangingMoney : RuleForExchanging {
    val exchangeMarket: ExchangeMarket
    /**
     * 要求するお金と対価として支払うお金を定義する
     * 交換レートより相手側に有利なら交換
     * 交換レートは参考であってルールに従わなければならないわけではないのだけれども、それで合意形成している。
     * 合意形成がひとつの指標でできるかどうかが一番の違い。
     */
    fun mainExchangeProtocol(demandUnitOfMoney: ValuationOfUnitOfMoney<out Number>, compensationUnitOfMoney: ValuationOfUnitOfMoney<out Number>){
        exchangeMarket // これと比較して需要と供給がマッチしたら交換する　交換関数は別に書いてもいいと思う。
    // 比較で大きければ交換できるというところが　無限大の通貨の操作権限を得ていく同期の表現になるんじゃないか？
    }



}