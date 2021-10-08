package infomaticCurrency.money

import infomaticCurrency.money.market.ExchangeMarket
import infomaticCurrency.money.market.MoneyDemandRequest
import infomaticCurrency.money.market.MoneySupplyRequest
import infomaticCurrency.variationOfCurrentize.ruleForFunction.RuleForExchangingProperty

/**
 * お金の交換ルール
 * 通貨と違って数学的な整合性のある計算式で交換する市場で大半のお金が交換されていることが特徴
 * どう表現するんだよ
 *
 * ここに目標を書けばいいのか？交換
 *　所有権を認めるかもここで決定する。
 * 交換ルールを所有権を保留できるかどうかで区別するか？
 * 一番上のルールにはそのような具体的ルールは書かなほうがよいような気がする。
 * お金は所有権を保留可能であり、タグ付け時のるーるはない
 *
 */
interface RuleForExchangingPropertyMoney : RuleForExchangingProperty {
    val exchangeMarket: ExchangeMarket
    /**
     * 要求するお金と対価として支払うお金を定義する
     * 交換レートより相手側に有利なら交換
     * 交換レートは参考であってルールに従わなければならないわけではないのだけれども、それで合意形成している。
     * 合意形成がひとつの指標でできるかどうかが一番の違い。
     * 実態の交換じゃなくて供給の提案と需要の要請の一致だからなぁ　引数が違うみたい
     */
    fun mainExchangeProtocol(moneyDemandRequest: MoneyDemandRequest, moneySupplyRequest: MoneySupplyRequest){
        exchangeMarket // これと比較して需要と供給がマッチしたら交換する　交換関数は別に書いてもいいと思う。
    // 比較で大きければ交換できるというところが　無限大の通貨の操作権限を得ていく同期の表現になるんじゃないか？
    }

}