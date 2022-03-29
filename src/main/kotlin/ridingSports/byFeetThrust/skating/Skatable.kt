package ridingSports.byFeetThrust.skating

import ridingSports.byFeetThrust.Walkable
import ridingSports.byFeetThrust.WalkingMobileMachineCondition
import ridingSports.pumpingTrack.ForwardBackwardGoal

interface Skatable: Walkable {
    //　後ろに蹴る　蹴って足が遠くに行ったら、
    // その足を戻さなきゃいけない。
    override val mobileMachineCondition: SkatingMobileMachineCondition
    override val goal: ForwardBackwardGoal
    override fun handle() {
        super.handle()
        // 左右に振る
        // 左右への重心の移動量があるときは、移動量が0になるまで、移動方向と逆に加速するようにける
        // 片側だけをまず記述
        if (mobileMachineCondition.sideWayVelocityOfCenterOfMass.value > 0.0){
            mobileMachineCondition.walkableLeg.sidewayExtendToMax()
        } else {
            mobileMachineCondition.walkableLeg.sidewayShrinkToMin()
        }
    }
}