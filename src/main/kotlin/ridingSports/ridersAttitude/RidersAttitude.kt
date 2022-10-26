package ridingSports.ridersAttitude

import library.Length
import library.Force
import library.Mass
import library.Radian
import ridingSports.CenterOfPressurePosition
import ridingSports.mobilityMachine.支持基底Condition
import kotlin.math.sin

interface RidersAttitude {
    /**
     * 高さを稼ぐが結果として壁を踏み抜いてはいけない
     */
    val bodyCenterOfMassDistanceBetween支持基底点: BodyCenterOfMassDistanceBetween支持基底点
    val ridersCenterOfMassBalanceForMobility: RidersCenterOfMassBalanceForMobility

    val 斜面に対しての内傾角: Radian
    val 鉛直に対しての内傾角: Radian
    val skierMass: Mass
    val 重心と支持基底点を通る鉛直線との距離: Length
        get() = Length(bodyCenterOfMassDistanceBetween支持基底点.length.length.toFloat() * sin(鉛直に対しての内傾角.number.toFloat()) )
    val distanceBetweenCenterOfMassAndRoad: Length

    val 遠心力: Force

    interface BodyCenterOfMassDistanceBetween支持基底点{
        val length: Length
        val minimum降伏Force: Force
        val contactForceToPiste: Force
        operator fun unaryPlus(): 支持基底Condition

        /**
         * 得たいエッジグリップ force を入力
         * 得られるforce がかえる
         */
        fun incForGetGripToRoad(demandedForce: Force): 支持基底Condition

        operator fun unaryMinus(): 支持基底Condition

    }
}