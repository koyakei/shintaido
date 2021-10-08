package infomaticCurrency

interface SingleInformaticCurrencyUnit {
    @JvmInline
    value class Identifier(val number: Number)
    val identifier: Identifier

}