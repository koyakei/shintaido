package ridingSports.pumpingTrack

import ridingSports.RidersAttitude

class SimplePumpingInPumpingTrack(
    private val pumpingInPumpingTrackList: List<PumpingInPumpingTrack>,
)  {

    fun handle() {
        pumpingInPumpingTrackList.map { it.handle() }
    }
}