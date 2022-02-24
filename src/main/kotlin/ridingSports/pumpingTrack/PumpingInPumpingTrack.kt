package ridingSports.pumpingTrack

import AchieveFlow


/**
 * 支点を動かせない乗り物の動きとして考える
 */
interface PumpingInPumpingTrack : AchieveFlow{
    override val currentStatus: PumpingTrackCurrentStatus
    override val goal: PumpingTrackGoal
    override val goalGetter: ThrustForwardGoalGetter

}