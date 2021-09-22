package infomaticCurrency.functionOfCurrency

/**
 * 通貨の湯よ対象
 */
interface CurrencyAttachedTarget {
    @JvmInline
    value class Identifier(val number: Number)
    val identifier: Identifier
}