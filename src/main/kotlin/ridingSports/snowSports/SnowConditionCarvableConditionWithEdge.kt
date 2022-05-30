package ridingSports.snowSports

import library.Force
import library.Radian
import ridingSports.byFeetThrust.GripToRoadController
import ridingSports.byFeetThrust.LimitedLengthLeg
import ridingSports.carving.CarvingCondition
import ridingSports.carving.MobileMachineCarvable
import ridingSports.mobilityMachine.MobileMachineCondition
import ridingSports.mobilityMachine.MobilityMachineDownForceInPumpingTrack

/**
 * エッジの形状とエッジの雪面コンタクト
 */
data class SnowConditionCarvableConditionWithEdge(
    override var rollDegree: Radian,
    override var pitchDegree: Float,
    override var yawDegree: Float,
    override val rollAngleVelocity: Float,
    override val rollAngleAcceleration: Float,
    override val pitchAngleVelocity: Float,
    override val pitchAngleAcceleration: Float,
    override val yawAngleVelocity: MobileMachineCondition.YawAngleVelocity,
    override val mobilityMachineDownForceInPumpingTrack: MobilityMachineDownForceInPumpingTrack,
    override val yawAngleAcceleration: MobileMachineCondition.YawAngleAcceleration,
    override val forwardVelocity: Float,
    override val sidewayVelocity: Float,
    override val hightVelocity: Float,
    override val edgeShape: EdgeShape,
    override val edgeContactConditionWithSnow: EdgeContactConditionWithSnow,
    override val 支持基底面Width: Float,
    override val getDownForce: Force,
    override val sideCutRadius: MobileMachineCarvable.SideCutRadius,
    override val gripToRoadController: GripToRoadController,
    override val limitedLengthLeg: LimitedLengthLeg,
    override var isTakingBackPhase: Boolean,
    ) : CarvingCondition {


}