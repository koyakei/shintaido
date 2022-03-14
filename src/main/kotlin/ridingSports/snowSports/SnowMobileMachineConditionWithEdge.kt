package ridingSports.snowSports

import library.Force
import ridingSports.mobilityMachine.MobileMachineCondition
import ridingSports.mobilityMachine.MobilityMachineDownForceInPumpingTrack

/**
 * エッジの形状とエッジの雪面コンタクト
 */
data class SnowMobileMachineConditionWithEdge(
    override var rollDegree: Float,
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
    val edgeShape: EdgeShape,
    val edgeContactConditionWithSnow: EdgeContactConditionWithSnow,
    override val 支持基底面Width: Float,
    override val getDownForce: Force,

    ) : MobileMachineCondition {





}