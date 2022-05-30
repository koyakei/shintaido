package ridingSports.pumpingAndSkatingInPumpingTrack

import AchievingGoal
import ridingSports.byFeetThrust.skating.SkatableOnLimitedGripRoad
import ridingSports.pumpingTrack.ForwardBackwardGoal
import ridingSports.pumpingTrack.ThrustableInPumpingTrack

interface PumpingAndSkatingInPumpingTrack : AchievingGoal {
    val skatableOnLimitedGripRoad: SkatableOnLimitedGripRoad
    val thrustableInPumpingTrack: ThrustableInPumpingTrack
    override val goal: ForwardBackwardGoal

    /**
     * 関数を返したいなぁ やめとこ
     */
    override fun handle():Unit {
        // イベントに順序ができてしまっている。順序によらない実行をここで担保する
        thrustableInPumpingTrack.handle()
        skatableOnLimitedGripRoad.handle()
    }
}