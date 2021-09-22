package shintaido.movePart.攻防.grip

/**
 * 親指側のエンドの先を刃として使うなら順手
 * 小指側奈良逆手
 */
class 持ち手(val 持ち手の方向: Direction = 順手){
    @JvmInline
    value class Direction(val boolean: Boolean)
    companion object{
        val 順手 = Direction(true)
        val 逆手 = Direction(false)
    }
}