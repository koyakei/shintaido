package ridingSports.ridersAttitude

import library.Distance
import library.Force
import ridingSports.mobilityMachine.支持基底Condition

interface RidersAttitude {
    /**
     * 高さを稼ぐが結果として壁を踏み抜いてはいけない
     */
    val bodyCenterOfMassHightBetween支持基底点: BodyCenterOfMassHightBetween支持基底点
    val ridersCenterOfMassBalanceForMobility: RidersCenterOfMassBalanceForMobility

    interface BodyCenterOfMassHightBetween支持基底点{
        val distance: Distance
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