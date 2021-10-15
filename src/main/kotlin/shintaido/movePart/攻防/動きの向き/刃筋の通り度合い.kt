package shintaido.movePart.攻防.動きの向き


/**
 * 刃の方向に対して何度で動かすのか？
 * 棟の方向に切るのか？
 */
class 刃筋の通り度合い(val direction: Direction = 順斬り) {
    @JvmInline
    value class Direction(val int: Int)

    companion object {
        val 順斬り = Direction(0)
        val 棟受け = Direction(180)
    }
}