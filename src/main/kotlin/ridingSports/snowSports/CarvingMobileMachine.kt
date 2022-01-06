package ridingSports.snowSports

interface CarvingMobileMachine {

    @JvmInline
    value class SideCutRadius(val float: Float)
    /**
     * 剛体だとして、サイドカット
     */
    val sideCutRadius: SideCutRadius
    /**
     * サイドカットではない弾性体を変形させて得られるラディウス
     */
    fun elasticBodyRadius(sideCutRadius: SideCutRadius,
    torsionBending: TorsionBending,
    flexBending: FlexBending): Float

    /**
     * 変形した板の状態
     * 縦方向の反り
     */
    val flexBending: FlexBending

    @JvmInline
    value class FlexBending(val float: Float)
    /**
     * 変形した板の状態
     * ねじれ方向の反り
     */
    val torsionBending: TorsionBending
    @JvmInline
    value class TorsionBending(val float: Float)
}