package ridingSports.downHillSlope

import library.Force
import ridingSports.mobilityMachine.支持基底Condition
import ridingSports.ridersAttitude.RidersAttitude

interface MobileMachineSlopeDecendable{
    val gripToSlope: GripToSlope

    interface GripToSlope: 支持基底Condition.GripToRoad {
        val ridersAttitude: RidersAttitude
        override fun maintainGripForThrust(force: Force): 支持基底Condition {
            return ridersAttitude.bodyCenterOfMassHightBetween支持基底点.incForGetGripToRoad(
                force
            )
        }
    }
}