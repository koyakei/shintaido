package ridingSports.byFeetThrust

import library.Force
import ridingSports.mobilityMachine.支持基底Condition
import ridingSports.pumpingTrack.ForwardBackwardGoal

interface MobileMachineWalkable{
    val walkableLeg:WalkableLeg
    val gripToRoad: 支持基底Condition.GripToRoad
    val goal: ForwardBackwardGoal
    fun handle(){
        if (gripToRoad.isEnoughGripToRoad.boolean) {
            walkableLeg.extendsLegToMaxLength()
        } else{
            walkableLeg.moveToMaxForward()
        }
        if (walkableLeg.footPosition.forwardBackward == MobileMachineWalkable.WalkableLeg.FootPosition.ForwardBackward.ForwardMax){
            gripToRoad.maintainGripForThrust(enoughGripToRoad)
        } else if (walkableLeg.footPosition.forwardBackward == MobileMachineWalkable.WalkableLeg.FootPosition.ForwardBackward.BackwardMax){
            gripToRoad.releaseGrip()
        }
    }
    val enoughGripToRoad: Force
    interface WalkableLeg{
        val length: Int
        val footPosition: FootPosition
        interface FootPosition{
            val forwardBackward: ForwardBackward
            val side: Side
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
        }
        fun extendsLegToMaxLength()
        fun moveToMaxForward()
    }
}