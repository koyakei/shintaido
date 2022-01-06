package ridingSports.snowSports

interface EdgeShape {
    fun bevelAngle(): Float = sideAngle + baseAngle
    val sideAngle: Float
    val baseAngle: Float
    val 逆エッジAngle: Float
    val 正エッジAngle: Float

}