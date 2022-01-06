package ridingSports

/**
 * 加速度
 */
interface MobileMachine {
    var rollDegree: Float
    var pitchDegree: Float
    var yawDegree: Float
    val rollAngleVelocity: Float
    val rollAngleAcceleration: Float
    val pitchAngleVelocity: Float
    val pitchAngleAcceleration: Float
    val yawAngleVelocity: YawAngleVelocity
    @JvmInline
    value class YawAngleVelocity(val float: Float)
    val yawAngleAcceleration: YawAngleAcceleration
    @JvmInline
    value class YawAngleAcceleration(val float: Float)

    /**
     * plus forward
     */
    val forwardVelocity:Float

    /**
     * plus right
     */
    val sidewayVelocity: Float

    /**
     * plus up
     */
    val hightVelocity: Float
}