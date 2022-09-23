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



