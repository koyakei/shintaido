package ridingSports.mobilityAndRider

import ridingSports.MobileMachine
import ridingSports.course.Course
import ridingSports.ridersAttitude.RidersAttitude
import ridingSports.ski.SkiMobileMachine
import ridingSports.snowSports.SkiRidersAttitude

interface SkiAndSkier: MobilityAndRider {
    override val mobileMachine: SkiMobileMachine
    override val ridersAttitude: SkiRidersAttitude
    val course: Course
}