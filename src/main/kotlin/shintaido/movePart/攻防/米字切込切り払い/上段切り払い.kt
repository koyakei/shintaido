package shintaido.movePart.攻防.米字切込切り払い

import shintaido.movePart.切る方向
import shintaido.movePart.切る方向.Companion.上段切り
import shintaido.movePart.攻防.切込切払理論.切り払い

class 上段切り払い: 切り払い ,米字切り{
    override val 切る方向 :切る方向
        get() = 切る方向(上段切り)

    override fun handle() {
        //切り払う
    }
}