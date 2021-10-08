package informaticCurrenecy.graphCurrency

import infomaticCurrency.RuleOfMinimumUnitOfCurrency
import infomaticCurrency.graphCurrency.GraphCurrency
import infomaticCurrency.graphCurrency.SingleGraphCurrencyUnit
import infomaticCurrency.variationOfCurrentize.RuleForCreation
import infomaticCurrency.variationOfCurrentize.RuleForExchanging
import infomaticCurrency.variationOfCurrentize.RuleForReading
import infomaticCurrency.通貨性

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
    override val ruleForExchanging: RuleForExchanging,
    override val ruleForReading: RuleForReading,
    override val ruleOfMinimumUnitOfCurrency: RuleOfMinimumUnitOfCurrency,
    override val setSingleInformaticCurrencyUnit: Set<SingleGraphCurrencyUnit> //ここで入れる必要ないんじゃないかな。　たくさんになるし、集約のインターフェイスをぢ杏優しておくか
) : GraphCurrency {

    override val unitOfCurrency: RuleOfMinimumUnitOfCurrency = Sampleグラフ通貨の単位のルール()
}