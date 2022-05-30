package ridingSports.byFeetThrust.skating

import library.ForceAndVector
import library.Mass
import ridingSports.byFeetThrust.*

interface SkatableOnLimitedGripRoad : ThrustableOnLimitedGripRoad
    , BladeMachine{
    //　後ろに蹴る　蹴って足が遠くに行ったら、
    // その足を戻さなきゃいけない。
    val ridersMass: Mass
    /**
     * 乗り物と垂直に押したら進む
     * ピッチング0度で進むとどうするのか？
     * 長さ制限のある足で進むために　長くなったときに縮む
     * 余裕があるときは伸ばす機構を搭載したい。
     * グリップできない方向を定義することで、自然変換で最適なフォームを作り出したい
     *
     * 摩擦力に限界がある路面を進むときは摩擦力を調整したい。
     *
     * これらをインターフェイスを注入することで上手く達成したい。
     *
     * grip controller
     * leg controller
     * これらをつかってスケーティングする
     * 重心位置を制御するときは、 center of mass controller を追加する
     * 横に漕ぐ表現をしよう
     */

    interface SideWayVelocityOfCenterOfMass{
        val value: Double
    }
    val sideWayVelocityOfCenterOfMass: SideWayVelocityOfCenterOfMass
    /**
     * 横方向に勢いがある分だけ横に押す
     * thrust に渡して押す
     */
    fun pushingForceToZeroSideWayVelocity(pushingTime: Double): Double{
        return sideWayVelocityOfCenterOfMass.value / pushingTime * ridersMass.number
    }

    override fun thrust(): ForceAndVector {
        pushingForceToZeroSideWayVelocity(0.1) // 0.1秒で横方向の速度を止めるまで押すってこと
        //
        return super<BladeMachine>.thrust()
    }
}