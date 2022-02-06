package ridingSports.pumpingTrack

import ridingSports.RidersAttitude


/**
 * 支点を動かせない乗り物の動きとして考える
 */
interface PumpingInDownPumpingTrack : PumpingInPumpingTrack{
    override val pumpingTrackCondition :DownTrackCondition
    override val ridersAttitude: RidersAttitude

    override fun handle()
}