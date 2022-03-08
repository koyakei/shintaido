package ridingSports.snowSports

import ridingSports.mobilityMachine.MobileMachineCondition

/**
 * エッジの形状とエッジの雪面コンタクト
 */
interface SnowMobileMachineConditionWithEdge: MobileMachineCondition {
    val edgeShape: EdgeShape
    val edgeContactConditionWithSnow: EdgeContactConditionWithSnow
}