package ridingSports.downHillSlope

import AchievingGoal
import ridingSports.pumpingTrack.ForwardBackwardGoal
import ridingSports.pumpingTrack.ThrustableInPumpingTrack
import ridingSports.singleRidingMaterialPumping.SingleMaterialPumpable

interface ContinuousTurnInDownhillSlope :AchievingGoal{
    val continuousTurnableInDownhillSlope: ContinuousTurnableInDownhillSlope
    val singleMaterialPumpable: SingleMaterialPumpable
    val thrustableInPumpingTrack: ThrustableInPumpingTrack
    override val goal: ForwardBackwardGoal
    override fun handle() {
        // 十分なグリップをターン後半で得るために前半で位置エネルギーを高くするポンピングをしない。
        //
        thrustableInPumpingTrack.handle()
        singleMaterialPumpable.handle()
        // これでいけるようにしたいけどまだなってないよね　どうすりゃいいんだ？
        continuousTurnableInDownhillSlope.handle()
    }
}