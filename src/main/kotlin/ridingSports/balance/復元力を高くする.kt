package ridingSports.balance

import ridingSports.snowSports.SnowMobileMachineConditionCarvableConditionWithEdge

interface 復元力を高くする {

    val snowMobileMachineConditionWIthEdge: SnowMobileMachineConditionCarvableConditionWithEdge
    /**
     * 支持基底面を拡大すると復元力が増える
     *
     */
    fun handle() = snowMobileMachineConditionWIthEdge.let { it.支持基底面Width.inc() }
}