package infomaticCurrency.basic

interface InformaticCurrency
    : 通貨性 {
    // ルールと独立してあるってなんかへんだな。
    // 通貨の単位一個ごとに取引ルールがあるが、それは通貨全体を参照しないとわからないのか？
    // まあそれでよいか
        val setSingleInformaticCurrencyUnit: Set<SingleInformaticCurrencyUnit>
        val ruleOfMinimumUnitOfCurrency: RuleOfMinimumUnitOfCurrency
}