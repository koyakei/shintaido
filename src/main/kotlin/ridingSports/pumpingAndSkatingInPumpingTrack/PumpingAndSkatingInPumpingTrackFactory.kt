package ridingSports.pumpingAndSkatingInPumpingTrack

import ridingSports.pumpingTrack.ForwardBackwardGoal

interface PumpingAndSkatingInPumpingTrackFactory {
    fun handle(goal: ForwardBackwardGoal)
}