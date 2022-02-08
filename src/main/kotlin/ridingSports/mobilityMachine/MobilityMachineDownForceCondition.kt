package ridingSports.mobilityMachine

import ridingSports.DownForce
import ridingSports.ridersAttitude.RidersAttitude
import ridingSports.roadCondition.RoadCondition

interface MobilityMachineDownForceCondition {
    val downForce: DownForce
    val ridersAttitude: RidersAttitude
    val pisteCondition: RoadCondition
}