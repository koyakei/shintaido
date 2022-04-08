package ridingSports.snowboard

import library.Length
import library.Force
import library.Mass
import library.Radian
import ridingSports.snowSports.BootsResponse

/**
 * 縦のバランスは含まないとするか？
 */
interface 縦の重心移動 {
    // 足首の自由度が低い状態では胴体でバランスを取る必要がある。
    // どれだけ関節を動かせるのか？
    @JvmInline
    value class AnkleAngleFlexibleRange(val radian: Radian)

    @JvmInline
    value class TorsoAngleFlexibleRange(val radian: Radian)

    val mass: Mass
    val ankleAngleFlexibleRange: AnkleAngleFlexibleRange
    val torsoAngleFlexibleRange: TorsoAngleFlexibleRange

    fun movingRangeOfCenterOfMass(torsoAngleFlexibleRange: TorsoAngleFlexibleRange): Length

    @JvmInline
    value class DemandedAnkleManipulateAngle(val radian: Radian)
    /**
     * 重力加速度が一定だと自分のパワーが無限でもこの値は無限にはならない
     */
    fun forceOfMovingCenterOfMassVertically(torsoAngleFlexibleRange: TorsoAngleFlexibleRange): Force

    fun forceOfMovingCenterOfMassVertically(ankleAngleFlexibleRange: AnkleAngleFlexibleRange): Force

    fun 足首を曲げる必要がある角度(force: Force): DemandedAnkleManipulateAngle
    class 関節の操作(
        val DemandedAnkleManipulateAngle: DemandedAnkleManipulateAngle
    )
    /**
     * 重心位置を理想の位置に近づける
     * 理想的な高さに向かって近づけていく
     */
    fun handle() :Force{
        val 胴体以外で出力する必要がある力: Force = Force(
            idealVerticalForceForCenterOfMass.value - forceOfMovingCenterOfMassVertically(torsoAngleFlexibleRange).value)
        return ブーツに対して発揮される垂直圧力からスキーへの力を得る((関節の操作(
            足首を曲げる必要がある角度(胴体以外で出力する必要がある力)
        )))
    }

    fun ブーツに対して発揮される垂直圧力からスキーへの力を得る(関節の操作: 関節の操作):Force

    val bootsResponse: BootsResponse

    /**
     *
     */
    fun boots(force: Force): Force{
        return Force(force.value.toFloat() * bootsResponse.handle())
    }

    val idealVerticalForceForCenterOfMass: Force

    val differentialHightOfCenterOfMass: Float
        get() {
            return idealHightOfCenterOfMass.toFloat() - currentHightOfCenterOfMass.toFloat()
        }
    val idealHightOfCenterOfMass: Number

    val currentHightOfCenterOfMass: Number

}