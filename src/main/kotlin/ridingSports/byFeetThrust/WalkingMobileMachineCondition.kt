package ridingSports.byFeetThrust

import ridingSports.mobilityMachine.MobileMachineCondition

interface WalkingMobileMachineCondition: MobileMachineCondition {
    val walkableLeg:WalkableLeg
    val gripToRoad: GripToRoad
    interface WalkableLeg{
        val length: Int
        val footPosition: FootPosition
        enum class FootPosition{
            BackwardMax,
            ForwardMax,
            Intermediate
        }
        fun extendsLegToMaxLength()
        fun forward()
    }
}

interface GripToRoad {
    val gripToRoad: Boolean
    fun incForThrust(): GripToRoad
    fun decToZero(): GripToRoad
}

