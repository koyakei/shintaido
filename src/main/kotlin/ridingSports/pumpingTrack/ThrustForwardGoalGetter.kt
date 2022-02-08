package ridingSports.pumpingTrack

import GoalGetter
import ridingSports.mobilityMachine.MobileMachineCondition
import ridingSports.ridersAttitude.RidersAttitude

interface ThrustForwardGoalGetter : GoalGetter {
    override val goal: PumpingTrackGoal
    val pumpingTrackCondition: PumpingTrackCondition
    val mobileMachineCondition: MobileMachineCondition
    val ridersAttitude: RidersAttitude
    override fun handle() {
        pumpingTrackCondition.friction // と gravity の合力ベクトル
        if (pumpingTrackCondition.slopeAngleAgainstGravity.number.toFloat() < 0) {
            mobileMachineCondition.mobilityMachineDownForceInPumpingTrack.unaryPlus()
        } else {
            mobileMachineCondition.mobilityMachineDownForceInPumpingTrack.unaryMinus()
        }
    }
}