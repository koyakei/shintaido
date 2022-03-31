package ridingSports.pumpingTrack

interface ThrustableInPumpingTrack {
    val goal: ForwardBackwardGoal
    val pumpingTrackCondition: PumpingTrackCondition
    val mobileMachineCondition: MobileMachineConditionInPumpingTrack

    fun handle() {
        if (
            (goal.forwardsBackwards == ForwardBackwardGoal.ForwardsBackwards.FORWARDS &&
                    pumpingTrackCondition.slopeAngleAgainstGravity.number.toFloat() < 0) ||
            (goal.forwardsBackwards == ForwardBackwardGoal.ForwardsBackwards.BACKWARDS &&
                    pumpingTrackCondition.slopeAngleAgainstGravity.number.toFloat() > 0)
        ) {
            mobileMachineCondition.mobilityMachineDownForceInPumpingTrack.unaryPlus()
        } else {
            mobileMachineCondition.mobilityMachineDownForceInPumpingTrack.unaryMinus()
        }
    }
}