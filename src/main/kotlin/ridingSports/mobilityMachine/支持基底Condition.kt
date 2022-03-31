package ridingSports.mobilityMachine

import library.Force

interface 支持基底Condition {
    val minimum降伏Force: Force
    val contactForceToPiste: Force
    interface GripToRoad {
        val isEnoughGripToRoad: IsEnoughGripToRoad
        @JvmInline
        value class IsEnoughGripToRoad(val boolean: Boolean)
        val demandedGripForce: Force
        fun maintainGripForThrust(demandedForce: Force): 支持基底Condition
        fun releaseGrip(): GripToRoad

    }
}