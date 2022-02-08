package ridingSports.snowSports

import ridingSports.mobilityMachine.MobileMachineCondition

/**
 * カービング時の曲がり方を書いていくか
 * トップとテールが広くて、ウェストが狭く　エッジがついていて、ズレがないターンを考える。
 */
interface Carving {
    val mobileMachineCondition: MobileMachineCondition


    /**
     * ロール角を増やすとターンする
     */
    fun plusRoll() {
        mobileMachineCondition.rollDegree++

    }

    /**
     * 小さいラディウスにする関数
     * ターン前半では前をたわませるし、後半だと後ろをたわませる
     * 接雪していくところを曲げていくことで、ラディウスを変える
     */
    fun minusRadius()

}