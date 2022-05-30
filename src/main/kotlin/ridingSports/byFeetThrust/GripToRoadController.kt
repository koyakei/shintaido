package ridingSports.byFeetThrust

import library.Force
import ridingSports.mobilityMachine.支持基底Condition
import ridingSports.pumpingTrack.ForwardBackwardGoal

interface GripToRoadController {
    val gripToRoad: 支持基底Condition.GripToRoad
    val enoughGripToRoad: Force
    val goal: ForwardBackwardGoal

    /**
     * 踏む余地があるなら踏む
     * 踏めないならできるだけ踏みやすいところまで戻す
     * 戻している間は踏めない
     * 足の長さが足りない場合しか戻さない
     * キャスターボードなら戻すことはないので推進力なしで戻すとは限らない
     */
    fun gripToRoad() {
        gripToRoad.maintainGripForThrust(enoughGripToRoad)
    }

    fun releaseGripToRoad() {
        gripToRoad.maintainGripForThrust(Force(0.0))
    }
}