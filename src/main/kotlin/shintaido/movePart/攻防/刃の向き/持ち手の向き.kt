package shintaido.movePart.攻防.刃の向き

interface 持ち手の向き {
    @JvmInline
    value class Direction(val boolean: Boolean)
    companion object{
        val 順刃 = Direction(true)
        val 逆刃 = Direction(false)
    }
}