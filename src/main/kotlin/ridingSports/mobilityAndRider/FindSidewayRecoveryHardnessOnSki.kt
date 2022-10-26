package ridingSports.mobilityAndRider

import ridingSports.snowSports.SkiRidersAttitude

// 起き上がりやすさ
// 比例
// 重心が雪面から垂直方向に離れていること
/**
 *Val mob = Mobile(Skier , ski)
 * Status = Mob.recoveryEasyness( .Max) // 局面に関わらず外が最も良いとそゆめいできているならこれ
 * Status.skierAttitude.sidewayCenterOfMass == 1   // 1 is outside 0 is inside
 *
 * Status = Mob.起き上がる難しさ( .min)
 * Status.skierAttitude.sidewayCenterOfMass == 0
 *
 * バランスが拮抗している状態からさらに外方向へのロール角速度を増やすための重心動作ができる余地の大きさ
 * 重心と雪面の鉛直方向の距離
 *  重心が雪面から離れていれば、突っ張る力をなくして重心が下る間に、重心を外側に移動できる。移動した瞬間に
 *      * 重心をロール角運動外側に移動する速度を増やし、重心を外側に移動させて、ターン外側への角運動量を増やす
 * 内傾角　が小さいほど簡単に起き上がれる
 * 重心と支持基底点を通る鉛直線との距離
 * 内傾角と進むスピードの掛け算が遠心力の強さ　遠心力が強いほど起き上がりやすい
 * ロール角運動量
 */
interface FindSidewayRecoveryHardnessOnSki {

    val skierAttitude: SkiRidersAttitude // なんかとりあえず
    enum class RecoveryHardness{
        Max,
        MIn
    }

    fun idealInOutPressure(recoveryHardness: RecoveryHardness): Float
}