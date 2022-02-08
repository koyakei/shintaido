package ridingSports.snowSports

import library.点
import ridingSports.CenterOfMass
import ridingSports.turn.InTurnThrustRidersCenterOfMassMobilityForward
import ridingSports.turn.TurnPhase

/**
 * 内側で支えないと次のターン外側に行けないと思っている人がいる
 */
interface 外側荷重のまま次のターン内側へ体を送る {
    val turnPhase: TurnPhase
    val idealNextTurnCenterOfMass: 点

    /**
     * 次のターンに縦方向だけに重心を送ってターンする
     */
    fun handle(){
        InTurnThrustRidersCenterOfMassMobilityForward(turnPhase).handle(idealNextTurnCenterOfMass)
    }
    val centerOfMass:CenterOfMass
    // 前後方向に運動して次のターンに行くのか？　横の引き起こしなのかが問題
//    fun handle(スキーの前方へ重心を送る)
}