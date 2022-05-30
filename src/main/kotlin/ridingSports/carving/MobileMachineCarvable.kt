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
            (sideCutRadius.float * rollDegree.number.toFloat()).toDouble())
    }

}