package ridingSports.pumpingTrack

import CurrentStatus
import ridingSports.ridersAttitude.RidersAttitude

interface PumpingTrackCurrentStatus: CurrentStatus {
    val pumpingTrackCondition: PumpingTrackCondition
    val ridersAttitude: RidersAttitude
}