package ridingSports.byFeetThrust

interface ThrustableLeg{
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

    fun readyToThrust()
}