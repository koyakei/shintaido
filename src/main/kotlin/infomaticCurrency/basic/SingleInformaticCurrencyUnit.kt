package infomaticCurrency.basic

interface SingleInformaticCurrencyUnit {
    @JvmInline
    value class Identifier(val number: Number)
    val identifier: Identifier

}