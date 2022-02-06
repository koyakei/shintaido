package ridingSports.pumpingTrack

import library.CoefficientOfFriction
import library.Force
import library.Radian

/**
 * 波のような動的な形状を含む波のようなコース
 */
interface PumpingTrackCondition {
    val slopeAngleAgainstGravity: Radian
    val friction: CoefficientOfFriction
    val minimum降伏Force: Force

}