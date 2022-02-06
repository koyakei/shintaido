package ridingSports

import library.Distance
import library.Force

interface RidersAttitude {
    val bodyCenterOfMassHightBetween支持基底点: BodyCenterOfMassHightBetween支持基底点
    fun plusBodyCenterOfMassHightBetween支持基底点(force: Force)
    data class BodyCenterOfMassHightBetween支持基底点(val distance: Distance){

        operator fun unaryPlus(): BodyCenterOfMassHightBetween支持基底点 {
            return this.copy(distance = Distance(distance.distance.toFloat() + 1))
        }

        operator fun unaryMinus(): BodyCenterOfMassHightBetween支持基底点 {
            return this.copy(distance = Distance(distance.distance.toFloat() - 1))
        }
    }
}