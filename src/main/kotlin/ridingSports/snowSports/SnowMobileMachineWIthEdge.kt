package ridingSports.snowSports

import ridingSports.MobileMachine

/**
 * エッジの形状とエッジの雪面コンタクト
 */
interface SnowMobileMachineWIthEdge: MobileMachine {
    val edgeShape: EdgeShape
    val edgeContactConditionWithSnow: EdgeContactConditionWithSnow
}