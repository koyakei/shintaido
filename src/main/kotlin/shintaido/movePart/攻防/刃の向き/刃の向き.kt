package shintaido.movePart.攻防.刃の向き

class 刃の向き(val direction: Direction = 順刃) {
    @JvmInline
    value class Direction(val boolean: Boolean)
    companion object{
        val 順刃 = Direction(true)
        val 逆刃 = Direction(false)
    }
}