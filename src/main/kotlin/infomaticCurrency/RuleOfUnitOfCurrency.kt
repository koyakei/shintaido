package infomaticCurrency

interface RuleOfUnitOfCurrency {
    @JvmInline
    value class Identifier(val int: Int)
    val identifier: Identifier
    val name: String

}