package ridingSports.downHillSlope

import library.Radian
import ridingSports.byFeetThrust.WalkingTrackCondition

interface DownHillSlopeCondition: WalkingTrackCondition {
    fun angleBetweenGravityAndForward(): Radian
}
