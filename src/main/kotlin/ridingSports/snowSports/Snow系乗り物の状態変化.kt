package ridingSports.snowSports

import ridingSports.mobilityMachine.MobileMachineCondition

interface Snow系乗り物の状態変化 {
    val snowMobileMachineWithEdge: SnowMobileMachineConditionWithEdge

    /**
     * 加速度じゃなくて変化したあとの速度を渡そう
     */
    fun 横に押す力で増えるヨーイングの角速度を計算(): MobileMachineCondition.YawAngleVelocity
//    {
////        sidewayVelocity * edgeContactConditionWithSnow.centerLateralResistance
//    }
    fun 横に押す力で増える角速度をセット()

}