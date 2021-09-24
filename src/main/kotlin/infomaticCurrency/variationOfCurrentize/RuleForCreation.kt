package infomaticCurrency.variationOfCurrentize

/**
 * SingleUnitOfCurrencyを作れる人の権限
 */
interface RuleForCreation {
    /**
     * 作成権限がある人間はだれ？
     */
    val publisherTerm: MovingRightHolder

    interface MovingRightHolder

}