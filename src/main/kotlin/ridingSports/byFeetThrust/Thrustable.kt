package ridingSports.byFeetThrust

import library.Force
import library.ForceAndVector
import library.Radian
import library.vector.PhysicalVector

interface Thrustable {
    fun next()
    fun thrust(): ForceAndVector{
        return ForceAndVector(Force(0.0), PhysicalVector(PhysicalVector.PhysicalDirection(0.0.toFloat())))
    }
    fun handle(){}
}

interface Leg{
    fun extendToMax(direction: Radian)
    fun extendToMax()
    fun shrinkToMin()
}

interface BladeThrustableLeg: LimitedLengthLeg, Thrustable,BladeMachine{
    override fun thrust() :ForceAndVector{
        // ブレードと垂直に押す
        extendToMax(bladeLateralDirection)
        return super<BladeMachine>.thrust()
    }
}