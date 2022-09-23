package ridingSports.byFeetThrust

import library.Force
import library.ForceAndVector
import library.Radian
import library.vector.PhysicalVector

interface BladeMachine{
    val bladeThrustableDirection: Radian
    val bladeLateralDirection: Radian
        get() = Radian(bladeThrustableDirection.number + Math.PI) // TODO: 回すように書く
    val bladeLength: Double
    fun thrust(): ForceAndVector {
        // 刃と垂直に押すよ
        //
        return ForceAndVector(Force(0.0), PhysicalVector(PhysicalVector.PhysicalDirection(0.0.toFloat())))
    }
}