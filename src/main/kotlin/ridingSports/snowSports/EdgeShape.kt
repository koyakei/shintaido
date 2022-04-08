package ridingSports.snowSports

import library.Length
interface EdgeShape {
    val edgeEffectiveLength: Number
    fun bevelAngle(): Float = sideAngle + baseAngle
    val sideAngle: Float
    val baseAngle: Float
    val 逆エッジAngle: Float
    val 正エッジAngle: Float
    val topWidth: TopWidth
    val tailWidth: TailWidth
    val waistWidth: Float
    @JvmInline
    value class TopWidth(val length: Length)
    @JvmInline
    value class TailWidth(val length: Length)
}