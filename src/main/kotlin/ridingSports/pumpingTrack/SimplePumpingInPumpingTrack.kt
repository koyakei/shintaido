package ridingSports.pumpingTrack

class SimplePumpingInPumpingTrack(
    private val pumpingInPumpingTrackList: List<PumpingInPumpingTrack>,
)  {

    fun handle() {
        pumpingInPumpingTrackList.map { it.handle() }
    }
}