package infomaticCurrency.graphCurrency

import infomaticCurrency.RuleOfUnitOfCurrency

class グラフ通貨の単位のルール(): RuleOfUnitOfCurrency {
    override val identifier: RuleOfUnitOfCurrency.Identifier = RuleOfUnitOfCurrency.Identifier(1)
    override val name: String = "グラフ通貨"
}