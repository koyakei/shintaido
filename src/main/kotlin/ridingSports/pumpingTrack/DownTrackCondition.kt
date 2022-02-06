package ridingSports.pumpingTrack

import library.CoefficientOfFriction
import library.Radian

data class DownTrackCondition(
    override val slopeAngleAgainstGravity: Radian,
    override val friction: CoefficientOfFriction
): PumpingTrackCondition {

}
