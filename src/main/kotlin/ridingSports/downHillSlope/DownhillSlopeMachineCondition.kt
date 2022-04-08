package ridingSports.downHillSlope

import ridingSports.byFeetThrust.Walkable
import ridingSports.byFeetThrust.WalkingMachineCondition
import ridingSports.byFeetThrust.skating.Skatable
import ridingSports.singleRidingMaterialPumping.SingleMaterialPumpable
import ridingSports.snowSports.CamberBendable
import ridingSports.snowSports.CarvingMobileMachineEdgeable

interface DownhillSlopeMachineCondition :
    MobileMachineSlopeDecendable, Skatable, CarvingMobileMachineEdgeable, SingleMaterialPumpable, CamberBendable {
    /**
     * 乗り物だから、乗り物に対して入力を受け付けるべきなのか？
     * 時々刻々変わる操作を handle 関数の引数に取るのが正しいのか？
     */
    override fun handle() {
        super<Skatable>.handle()
        super<SingleMaterialPumpable>.handle()
        super<CamberBendable>.handle()
    }
}