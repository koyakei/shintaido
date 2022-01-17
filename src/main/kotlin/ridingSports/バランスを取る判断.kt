package ridingSports

import library.Power
import ridingSports.slope.AccelerationStatus
import ridingSports.turn.TurnPhase
import kotlin.math.cos
import kotlin.math.sin

// インサイドエッジを踏み切ってどこに体重を動かすのか？
//　踏み切ることで調整可能なバランスの範囲
// 踏み切るタイミングによってどのような結果の違いをもたらすのか？
// TODO:内足で踏み切らなきゃいけないという固定概念を覆す論理はなに？
interface バランスを取る判断 {
    val turnPhase: TurnPhase
    val accelerationStatus: AccelerationStatus
    //　内転　外転を使って引き起こしをできるだけ行わないことをどうやって意識するの？
    //
    fun 谷へ落ちるスピードの調整(speed: Double)

    // ターンエンドで横に踏み切る
    // 踏み切ることで、動ける方向を計算する
    // 得たいスピードを入力すると、どれだけどのような動作をしたらいいのか別クラスで定義したい。
    // 無限に高くすることで全体最適化をした探索手法を表現したいな。
    // スキーを始めたら、高くする方向に探索した。なんでそれを優先させたのか？みたいな表現
    fun 横への移動速度の調整(speed: Double)

    // スキーと体の重心を離す動き
    fun changeIntervalOfCenterOfMass(power: Power): AccelerationStatus =
        accelerationStatus.copy(
            fallLineSpeed = accelerationStatus.fallLineSpeed +
                    (sin(turnPhase.ratio.number.toDouble()) * power.value),
            sidewaySpeed = accelerationStatus.fallLineSpeed +
                    (cos(turnPhase.ratio.number.toDouble()) * power.value)
        )

    // ピッチング角速度の加速
    fun changePitchingAngleVelocity(power: Power): AccelerationStatus =
        accelerationStatus.copy(pitchingRotationRatio = accelerationStatus.pitchingRotationRatio + power.value)
}