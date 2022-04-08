package ridingSports.snowSports.逆エッジ

import library.Length
import ridingSports.snowSports.SnowCondition

interface 逆エッジのリスクの計算 {
    val edgeLengthBetweenSnow: Length
    val snowCondition: SnowCondition
    data class 逆エッジのリスク(val riscOf逆エッジ: Float){
        operator fun unaryMinus(): 逆エッジのリスク {
            return 逆エッジのリスク(riscOf逆エッジ.minus(1))
        }
    }
    /**
     * 接雪エッジと反対側のエッジと雪面との距離と比例
     */
    val riskOf逆エッジ: 逆エッジのリスク
        get() =
        逆エッジのリスク(
            edgeLengthBetweenSnow.length.toFloat()
                    * snowCondition.counterEdgeRiskFactor.toFloat())
}