package ridingSports.byFeetThrust.skating

import ridingSports.byFeetThrust.MobileMachineWalkable
import ridingSports.byFeetThrust.WalkingMobileMachineCondition
import ridingSports.pumpingTrack.ForwardBackwardGoal

interface Skatable: MobileMachineWalkable{
    //　後ろに蹴る　蹴って足が遠くに行ったら、
    // その足を戻さなきゃいけない。
    override val goal: ForwardBackwardGoal
    override val walkableLeg: SkatableLeg
    override fun handle(){
        if (sideWayVelocityOfCenterOfMass.value > 0.0){
            walkableLeg.sidewayExtendToMax()
        } else {
            walkableLeg.sidewayShrinkToMin()
        }
    }

    interface SideWayVelocityOfCenterOfMass{
        val value: Double
    }
    val sideWayVelocityOfCenterOfMass: SideWayVelocityOfCenterOfMass
    interface SkatableLeg: MobileMachineWalkable.WalkableLeg {
        fun sidewayExtendToMax()
        fun sidewayShrinkToMin()
    }
}