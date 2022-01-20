package ridingSports.snowSports

import infomaticCurrency.basic.currencyRepository.CurrencyPropertySaveRequestDTO
import ridingSports.MobileMachine

interface Snow系乗り物の状態変化 {
    val snowMobileMachineWithEdge: SnowMobileMachineWIthEdge

    /**
     * 加速度じゃなくて変化したあとの速度を渡そう
     */
    fun 横に押す力で増えるヨーイングの角速度を計算(): MobileMachine.YawAngleVelocity
//    {
////        sidewayVelocity * edgeContactWithSnow.centerLateralResistance
//    }
    fun 横に押す力で増える角速度をセット()

}