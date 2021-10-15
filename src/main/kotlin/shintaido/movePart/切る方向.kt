package shintaido.movePart

class 切る方向(
    val roll: Roll= 大上段切り,
    val yaw: Yaw = Yaw(0),
    val pitch: Pitch = Pitch(0)
) {
    @JvmInline
    value class Roll(val int: Int)

    companion object{
        val 大上段切り = Roll(0)
        val 上段切り = Roll(45)
        val 中段切り = Roll(90)
        val 下段切り = Roll(135)
        val 最下段切り = Roll(180)
    }

    @JvmInline
    value class Yaw(val int: Int)

    @JvmInline
    value class Pitch(val int: Int)
}