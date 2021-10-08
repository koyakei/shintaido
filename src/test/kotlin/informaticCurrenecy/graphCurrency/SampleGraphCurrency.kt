package informaticCurrenecy.graphCurrency

import infomaticCurrency.basic.RuleOfMinimumUnitOfCurrency
import infomaticCurrency.graphCurrency.GraphCurrency
import infomaticCurrency.graphCurrency.SingleGraphCurrencyUnit
import infomaticCurrency.variationOfCurrentize.ruleForFunction.RuleForCreation
import infomaticCurrency.variationOfCurrentize.ruleForFunction.RuleForExchangingProperty
import infomaticCurrency.variationOfCurrentize.ruleForFunction.RuleForReading
import infomaticCurrency.basic.通貨性

/**
 * 自分のタグ系重視の通貨をお金と反対の性質を持つ通貨として設計する
 * タグを生成　付与　付与することを条件に対価を得る交換をする　
 *　タグの消滅
 * これを表現すればいいのか
 * 表示に一番力を入れる
 * 　連結する　対象に対しての連結があるとの定義
 *　
 */
class SampleGraphCurrency(
    override val name: 通貨性.NameOfCurrency,
    override val ruleForCreation: RuleForCreation,
    override val ruleForExchangingProperty: RuleForExchangingProperty,
    override val ruleForReading: RuleForReading,
    override val ruleOfMinimumUnitOfCurrency: RuleOfMinimumUnitOfCurrency,
    override val setSingleInformaticCurrencyUnit: Set<SingleGraphCurrencyUnit> //ここで入れる必要ないんじゃないかな。　たくさんになるし、集約のインターフェイスをぢ杏優しておくか
) : GraphCurrency {

    override val unitOfCurrency: RuleOfMinimumUnitOfCurrency = Sampleグラフ通貨の単位のルール()
}