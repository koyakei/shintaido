package ridingSports.pumpingTrack

import Goal

interface ForwardBackwardGoal:Goal {
    val forwardsBackwards: ForwardsBackwards
    enum class ForwardsBackwards {
        FORWARDS,
        BACKWARDS
    }

}