package bodyAnalysis

import library.*
import kotlin.math.pow

/**
 * https://www.youtube.com/watch?v=aq_2H_yi1g0
 * 関節モーメントとパワーの計算
 */
interface タメ {
    val v関節可動域: 関節可動域
    val 移動方向: Vector
    val 最大筋力: Force

    /**
     * - x^2 がトルクを表現する関数だとしてその積分で仕事量を計算する
     */
    fun トルクの積分(length: Length) =
        -length.length.toDouble().pow(3) + 最大筋力.value


    fun handle(始点最大伸展からの距離: Length, 終点最大伸展からの距離: Length) =
        トルクの積分(終点最大伸展からの距離) - トルクの積分(始点最大伸展からの距離)

}