package infomaticCurrency.basic

interface RuleOfMinimumUnitOfCurrency {
    @JvmInline
    value class Identifier(val int: Int)
    val identifier: Identifier
    val name: String

}