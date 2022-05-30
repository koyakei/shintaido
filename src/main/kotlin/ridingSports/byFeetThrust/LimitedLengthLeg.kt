package ridingSports.byFeetThrust

import library.Force
import library.ForceAndVector
import library.Radian
import library.vector.PhysicalVector
import java.lang.Math.PI

interface LimitedLengthLeg: Leg{
    val length: Int
    val footPosition: FootPosition
    interface FootPosition{
        val forwardBackward: ForwardBackward
        val side: Side
        val takingBackSpace: TakingBackSpace
        enum class ForwardBackward{
            BackwardMax,
            ForwardMax,
            Intermediate
        }
        enum class Side{
            InsideMax,
            OutsideMax,
            Intermediate
        }
        enum class TakingBackSpace{
            FullyTakingBack,
            FullyExtending,
            Intermediate
        }
    }

    fun takingBack(){
        shrinkToMin()
    }
}

interface BladeMachine{
    val bladeThrustableDirection: Radian
    val bladeLateralDirection: Radian
    get() = Radian(bladeThrustableDirection.number + PI) // TODO: 回すように書く
    val bladeLength: Double
    fun thrust(): ForceAndVector {
        // 刃と垂直に押すよ
        //
        return ForceAndVector(Force(0.0), PhysicalVector(PhysicalVector.PhysicalDirection(0.0.toFloat())))
    }
}

