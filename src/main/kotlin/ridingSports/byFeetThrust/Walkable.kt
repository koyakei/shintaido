package ridingSports.byFeetThrust

import ridingSports.pumpingTrack.ForwardBackwardGoal
import ridingSports.ridersAttitude.RidersAttitude

/**
 * 一本足の歩行をデフォルトとして考える。
 */
interface Walkable {
    val goal: ForwardBackwardGoal
    val roadCondition: WalkingTrackCondition
    val mobileMachineCondition: WalkingMobileMachineCondition
    val ridersAttitude: RidersAttitude
    fun handle() {
        if (mobileMachineCondition.gripToRoad.gripToRoad) {
            mobileMachineCondition.walkableLeg.extendsLegToMaxLength()
        } else{
            mobileMachineCondition.walkableLeg.forward()
        }
        if (mobileMachineCondition.walkableLeg.footPosition == Leg.FootPosition.ForwardMax){
            mobileMachineCondition.gripToRoad.incForThrust()
        } else if (mobileMachineCondition.walkableLeg.footPosition == Leg.FootPosition.BackwardMax){
            mobileMachineCondition.gripToRoad.decToZero()
        }
    }


}