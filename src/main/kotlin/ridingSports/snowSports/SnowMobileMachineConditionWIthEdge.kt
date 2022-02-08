package ridingSports.snowSports

import ridingSports.mobilityMachine.MobileMachineCondition

/**
 * エッジの形状とエッジの雪面コンタクト
 */
interface SnowMobileMachineConditionWIthEdge: MobileMachineCondition {
    val edgeShape: EdgeShape
    val edgeContactConditionWithSnow: EdgeContactConditionWithSnow
}