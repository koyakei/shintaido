package shintaido.movePart.bodyMudrah

import shintaido.fundamentalBasic.mudrah.Mudrah
import shintaido.fundamentalBasic.mudrah.MudrahSize
import shintaido.fundamentalBasic.技の効く条件.step.SizePhysically


interface 体による印: Mudrah {
    /**
     * 体による印の大きさの定義
     * プロパティーの値が大きくなるほど
     * 技が効く条件と同一だが関連付けることはできないのか？
     */
    interface 体による印の大きさ: MudrahSize{
        /**
         * 声が大きい
         */
        val voiceVolume: Int

        /**
         * 移動距離
         */
        val movingDistance: SizePhysically

        /**
         * 体の開く度合い
         * 伸筋の緊張　屈筋の弛緩
         */
        val openness: Int

        /**
         * 流れも強いほど大きい印になるけど、それはどう扱うか？
         */
        val currentStrengthen: Int

        /**
         * 間合いの緊密さは組み手の要素だ
         */
    }


    /**
     * 発音の単純さ
     */
    val pronunciationDifficulty: Int

    /**
     *
     */
}