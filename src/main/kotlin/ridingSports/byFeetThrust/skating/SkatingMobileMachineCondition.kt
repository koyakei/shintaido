package ridingSports.byFeetThrust.skating

import library.Force
import library.Radian
import ridingSports.mobilityMachine.MobileMachineCondition
import ridingSports.mobilityMachine.支持基底Condition
import ridingSports.pumpingTrack.ForwardBackwardGoal

class SkatingCondition(
    override val gripToRoad: 支持基底Condition.GripToRoad,
    override val enoughGripToRoad: Force,
    override val goal: ForwardBackwardGoal,
    override val thrustableLeg: Skatable.SkatableLeg,
    override val sideWayVelocityOfCenterOfMass: Skatable.SideWayVelocityOfCenterOfMass,
    override var rollDegree: Radian,
    override var pitchDegree: Float,
    override var yawDegree: Float,
    override val rollAngleVelocity: Float,
    override val rollAngleAcceleration: Float,
    override val pitchAngleVelocity: Float,
    override val pitchAngleAcceleration: Float,
    override val yawAngleVelocity: MobileMachineCondition.YawAngleVelocity,
    override val 支持基底面Width: Float,
    override val yawAngleAcceleration: MobileMachineCondition.YawAngleAcceleration,
    override val getDownForce: Force,
    override val forwardVelocity: Float,
    override val sidewayVelocity: Float,
    override val hightVelocity: Float
): Skatable, MobileMachineCondition {



}




