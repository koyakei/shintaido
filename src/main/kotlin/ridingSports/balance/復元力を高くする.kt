package ridingSports.balance

import ridingSports.snowSports.SnowConditionCarvableConditionWithEdge

interface 復元力を高くする {

    val snowMobileMachineConditionWIthEdge: SnowConditionCarvableConditionWithEdge
    /**
     * 支持基底面を拡大すると復元力が増える
     *
     */
    fun handle() = snowMobileMachineConditionWIthEdge.let { it.支持基底面Width.inc() }
}