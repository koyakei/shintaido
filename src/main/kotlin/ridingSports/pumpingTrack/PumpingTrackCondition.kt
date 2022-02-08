package ridingSports.pumpingTrack

import library.CoefficientOfFriction
import library.Force
import library.Radian
import ridingSports.roadCondition.RoadCondition
import ridingSports.snowSports.SnowCondition

/**
 * 波のような動的な形状を含む波のようなコース
 */
interface PumpingTrackCondition : RoadCondition {
    /**
     * 進行方向に対しての傾斜
     * プラスだと下り坂
     * マイナスだと上り坂
     */
    val slopeAngleAgainstGravity: Radian
    val friction: CoefficientOfFriction

    /**
     * これ以上踏んだらずれる力
     */
    val minimum降伏Force: Force
}