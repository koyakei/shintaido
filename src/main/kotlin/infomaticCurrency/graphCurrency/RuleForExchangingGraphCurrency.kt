package infomaticCurrency.graphCurrency

import infomaticCurrency.variationOfCurrentize.RuleForCreation

sealed interface RuleForExchangingGraphCurrency: RuleForCreation{

    override val publisherTerm: GraphCurrencyMovingRightHolder

    /**
     * 全員に渡しておいて、禁止リストに入っている人間だったらはねつけるように実装するか
     */
    interface GraphCurrencyMovingRightHolder: RuleForCreation.MovingRightHolder

}