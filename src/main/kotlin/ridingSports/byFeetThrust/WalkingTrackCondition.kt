package ridingSports.byFeetThrust

import ridingSports.roadCondition.RoadCondition

interface WalkingTrackCondition: RoadCondition {
    val leftFoot: String
    val rightFoot: String
}