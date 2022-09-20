package ridingSports.balance

import library.Vector

interface RightPositionOfCenterOfMass {

    /**
     * 重力方向と乗り手にかかる加速度の合成で下方向を決定
     * 支持基底点と鉛直上に重心を設定可能な範囲を線で表現
     */
    fun handle(gravityVector: Vector, ridersAccelerationVector: Vector): Vector{
        return gravityVector + ridersAccelerationVector
    }
}