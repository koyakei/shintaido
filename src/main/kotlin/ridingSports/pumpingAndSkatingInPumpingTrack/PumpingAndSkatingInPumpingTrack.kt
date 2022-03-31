package ridingSports.pumpingAndSkatingInPumpingTrack

import AchievingGoal
import ridingSports.byFeetThrust.skating.Skatable
import ridingSports.pumpingTrack.ForwardBackwardGoal
import ridingSports.pumpingTrack.ThrustableInPumpingTrack

interface PumpingAndSkatingInPumpingTrack : AchievingGoal {
    val skatable: Skatable
    val thrustableInPumpingTrack: ThrustableInPumpingTrack
    override val goal: ForwardBackwardGoal

    /**
     * 関数を返したいなぁ やめとこ
     */
    override fun handle() {
        // イベントに順序ができてしまっている。順序によらない実行をここで担保する
        thrustableInPumpingTrack.handle()
        skatable.handle()
    }
}