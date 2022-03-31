package ridingSports.downHillSlope

import ridingSports.byFeetThrust.WalkingMobileMachineCondition
import ridingSports.byFeetThrust.skating.Skatable
import ridingSports.singleRidingMaterialPumping.SingleMaterialPumpable
import ridingSports.snowSports.CarvingMobileMachineEdgeable

interface DownhillSlopeMobileMachineCondition: WalkingMobileMachineCondition,
    MobileMachineSlopeDecendable,Skatable,CarvingMobileMachineEdgeable , SingleMaterialPumpable {
    override fun handle() {
        super<WalkingMobileMachineCondition>.handle()
        super<Skatable>.handle()
        super<SingleMaterialPumpable>.handle()

    }
}