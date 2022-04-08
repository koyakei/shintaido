package ridingSports.byFeetThrust

import library.Force
import ridingSports.mobilityMachine.支持基底Condition
import ridingSports.pumpingTrack.ForwardBackwardGoal

interface ForwardThrustableByLegExtending {
    val thrustableLeg: ForwardThrustableLeg
    val gripToRoad: 支持基底Condition.GripToRoad
    val enoughGripToRoad: Force
    val goal: ForwardBackwardGoal
    fun handle(){
        gripToRoad.maintainGripForThrust(enoughGripToRoad)
        thrustableLeg.thrustToForward()
    }
    interface ForwardThrustableLeg: ThrustableLeg{
        fun thrustToForward(){}
    }
}