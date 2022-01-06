package ridingSports.snowSports

import ridingSports.MobileMachine

/**
 * カービング時の曲がり方を書いていくか
 * トップとテールが広くて、ウェストが狭く　エッジがついていて、ズレがないターンを考える。
 */
interface Carving {
    val mobileMachine: MobileMachine


    /**
     * ロール角を増やすとターンする
     */
    fun plusRoll() {
        mobileMachine.rollDegree++

    }

    /**
     * 小さいラディウスにする関数
     * ターン前半では前をたわませるし、後半だと後ろをたわませる
     * 接雪していくところを曲げていくことで、ラディウスを変える
     */
    fun minusRadius()

}