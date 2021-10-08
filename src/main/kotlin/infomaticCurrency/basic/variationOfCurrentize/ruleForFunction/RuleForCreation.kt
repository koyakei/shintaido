package infomaticCurrency.variationOfCurrentize.ruleForFunction

/**
 * SingleUnitOfCurrencyを作れる人の権限
 */
interface RuleForCreation :RuleForCurrencyFunction{
    /**
     * 作成権限がある人間はだれ？
     */
    val publisherTerm: MovingRightHolder

    interface MovingRightHolder

}