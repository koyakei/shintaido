package ridingSports.separetedBoard.rightLeft

import library.点

interface 外側荷重点 {
    @JvmInline
    value class Force(val number: Number)
    fun handle(force: Force): 点
}