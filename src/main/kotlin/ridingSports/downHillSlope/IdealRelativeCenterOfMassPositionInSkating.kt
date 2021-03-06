package ridingSports.downHillSlope

import ridingSports.relativeDirection.*
import ridingSports.turn.TurnPhase

/**
 * スキーを押して加速するスケーティングをするときの適切な重心位置を計算する
 * スキーの支持基底点にたいしての相対位置
 * 乗り物の重心に対して
 */
interface IdealRelativeCenterOfMassPositionInSkating {
    val turnPhase: TurnPhase
    fun handle(): IdealSlopeRelativeDirection {
        return if (turnPhase.ratio.number.toFloat() < 50) {
            IdealSlopeRelativeDirection(UpSide(), OutsideOfFallLine())
        } else {
            IdealSlopeRelativeDirection(DownSide(), InsideOfFallLine())
        }
    }

}