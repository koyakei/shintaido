package ridingSports.snowSports

import library.Force
import library.Vector
import ridingSports.CenterOfPressurePosition

interface CamberBendable {
    val centerOfPressurePosition: CenterOfPressurePosition

    val topTorsionBending: TorsionBending
    val tailTorsionBending: TorsionBending
    val topCamberFlexBending: FlexBending
    val tailCamberFlexBending: FlexBending

    @JvmInline
    value class TorsionBending(val float: Float)

    @JvmInline
    value class FlexBending(val float: Float)

    /**
     * pressurePoint が前に行ったら詰まるだけ？
     * 前と後ろどこが浮いているか考えないとなぁ
     * ロールしているほどトーションが貯まる
     * ピッチングしているほどフレックスがたまる
     * 前に進んでいるときに前にプレッシャが移動すると　トップフレックス
     * 後ろにプレッシャーをかけると前に推進する力が生まれる
     * 前が浮いていて後ろにプレッシャー　テールフレックスが増す
     */
    fun reactionForce(pressureForce: Force){
        (1 - centerOfPressurePosition.forwardAfterwardRatio) * tailCamberFlexBending.float * pressureForce.value
        centerOfPressurePosition.forwardAfterwardRatio * topCamberFlexBending.float * pressureForce.value
        /**
         * トーションした結果　デッキと垂直に弾むのか推進するのかが問題　この比率はいつも固定なの？
         */
        pressureForce.value * topTorsionBending.float
        pressureForce.value * tailTorsionBending.float

    }

    /**
     * 押している位置と力のベクトルから反発力ベクトルを返す
     */
    fun handle(){

    }
}