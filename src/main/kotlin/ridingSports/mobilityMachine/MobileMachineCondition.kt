package ridingSports.mobilityMachine

import library.Force

/**
 * 加速度
 */
interface MobileMachineCondition {
    var rollDegree: Float
    var pitchDegree: Float
    var yawDegree: Float
    val rollAngleVelocity: Float
    val rollAngleAcceleration: Float
    val pitchAngleVelocity: Float
    val pitchAngleAcceleration: Float
    val yawAngleVelocity: YawAngleVelocity

    val 支持基底面Width: Float
    @JvmInline
    value class YawAngleVelocity(val float: Float)

    val yawAngleAcceleration: YawAngleAcceleration

    @JvmInline
    value class YawAngleAcceleration(val float: Float)

    val getDownForce: Force





    /**
     * plus forward
     */
    val forwardVelocity: Float

    /**
     * plus right
     */
    val sidewayVelocity: Float

    /**
     * plus up
     */
    val hightVelocity: Float
}