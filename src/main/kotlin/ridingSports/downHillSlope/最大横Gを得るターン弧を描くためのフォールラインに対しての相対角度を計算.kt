package ridingSports.downHillSlope

import library.Direction
import library.Velocity
import ridingSports.turn.TurnPhase

/**
 * 傾斜角と摩擦によって最大横Gを得られる旋回半径が決定する。
 */
interface 最大横Gを得るターン弧を描くためのフォールラインに対しての相対角度を計算 {
    val turnPhase: TurnPhase

    val velocity: Velocity
    /**
     * ターン局面から適切なヨーイング角を算出する
     */
    fun handle(): Direction
}