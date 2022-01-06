package ridingSports.snowSports

/**
 * 体重移動の結果エッジにかかる力を表現
 */
interface EdgeContactWithSnow {
    /**
     * 前が０　後ろが１００として百分率で表示
     */
    val centerLateralResistance: Float

    /**
     * 雪面状況は乗り物側にはいれないとするか？
     * コンタクトしていれば、１００％性能を発揮するとしよう。
     */
    val edgeGrip: Boolean
}