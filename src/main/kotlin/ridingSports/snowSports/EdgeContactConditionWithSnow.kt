package ridingSports.snowSports

import library.Force

/**
 * 体重移動の結果エッジにかかる力を表現
 */
interface EdgeContactConditionWithSnow {
    /**
     * 前が０　後ろが１００として百分率で表示
     */
    val centerRatio: Float
    fun moreEvenForeAfterContact()
    fun moreTipContact()
    fun moreTailContact()
    val skiHorizontalForce: Force
    fun plusHorizontalForce():EdgeContactConditionWithSnow
    val skiVerticalForce: Force
    fun minusVerticalForce()
}