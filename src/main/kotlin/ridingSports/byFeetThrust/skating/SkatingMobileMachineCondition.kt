package ridingSports.byFeetThrust.skating

import ridingSports.byFeetThrust.WalkingMobileMachineCondition

interface SkatingMobileMachineCondition: WalkingMobileMachineCondition {
    val sideWayVelocityOfCenterOfMass: SideWayVelocityOfCenterOfMass
    override val walkableLeg: SkatableLeg
    interface SideWayVelocityOfCenterOfMass{
        val value: Double
    }

    interface SkatableLeg:WalkingMobileMachineCondition.WalkableLeg{
        fun sidewayExtendToMax()
        fun sidewayShrinkToMin()
    }
}