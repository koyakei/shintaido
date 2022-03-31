package ridingSports.carving

import library.Radian

interface MobileMachineCarvable {

    @JvmInline
    value class SideCutRadius(val float: Float)
    /**
     * 剛体だとして、サイドカット
     */
    val sideCutRadius: SideCutRadius

    /**
     * サイドカットではない弾性体を変形させて得られるラディウス
     */
    fun elasticBodyRadius(rollDegree: Radian): Radian{
        return Radian(
            sideCutRadius.float * rollDegree.number.toFloat())
    }

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