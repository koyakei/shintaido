package ridingSports.mobilityAndRider

import ridingSports.MobileMachine
import ridingSports.RidersAbility
import ridingSports.ridersAttitude.RidersAttitude

interface MobilityAndRider {
    val ridersAttitude: RidersAttitude
    val ridersAbility: RidersAbility
    val mobileMachine: MobileMachine
}