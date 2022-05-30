package ridingSports.byFeetThrust

import library.ForceAndVector

interface ThrustableOnLimitedGripRoad:ThrustableWithLimitedLegLength{
    val gripToRoadController:GripToRoadController


    override fun thrust(): ForceAndVector {
        gripToRoadController.gripToRoad()
        // 道路にグリップする
        return super.thrust()
    }

    override fun takingBack() {
        gripToRoadController.releaseGripToRoad()
    }

}