package ridingSports.snowSports

import ridingSports.roadCondition.RoadCondition

interface SnowCondition: RoadCondition {
    val counterEdgeRiskFactor: Number
}