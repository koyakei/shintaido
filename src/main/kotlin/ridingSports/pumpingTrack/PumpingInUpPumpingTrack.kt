package ridingSports.pumpingTrack

import ridingSports.RidersAttitude


/**
 * 支点を動かせない乗り物の動きとして考える
 */
interface PumpingInUpPumpingTrack: PumpingInPumpingTrack {
    override val pumpingTrackCondition :UpTrackCondition
    override val ridersAttitude: RidersAttitude

    override fun handle()
}