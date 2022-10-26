package ridingSports.ski.biSki

import library.GravitationalAcceleration
import library.Length
import library.Radian
import ridingSports.snowSports.SkiRidersAttitude
import kotlin.math.*

interface 起き上がるまでの労力 {


    val attitude: SkiRidersAttitude

    val 必要な傾き: Radian
        get() = Radian(
            atan( attitude.遠心力.value / attitude.skierMass.number * GravitationalAcceleration().value )
        )
    // 必要な

    /**
     * 各関節の余裕も含める
     * 関節で動かせる空間 と 空間的余裕　の小さい方 = 動かせる範囲
     * 動かせる範囲を起き上がる力を発生させられる計算式に当てはめると、角運動量の発生できる量が決定する
     * 人間は空間的余裕をほぼ使い切ることができるので、関越が動かせる範囲を考慮しなくても実用的である。
     */
    fun ロール外側方向への角運動量の増加できる最大値(): Float =
        attitude.distanceBetweenCenterOfMassAndRoad.length.toFloat()

    /**
     * まずはロール方向のみで考える。
     * 釣り合いが適正だったときのみ有効
     * 釣り合いが内倒しすぎているかどうかは他の式で計算する
     * 体重は関係ない気がするが。どうしよう。重いほど振られる場合もあるし、重いほど倒さなくて良いとも言える。
     * ライダーの重心と乗り物の重心が違う。
     */
    fun 起き上がる難しさ(): Double =
        attitude.重心と支持基底点を通る鉛直線との距離.length.toFloat() * attitude.skierMass.number / ロール外側方向への角運動量の増加できる最大値()

    /**
     * 0-1 で内側加重か外側加重が良いのか結論を出す。
     */
    fun 簡単に起き上がるポジション(): Float
}