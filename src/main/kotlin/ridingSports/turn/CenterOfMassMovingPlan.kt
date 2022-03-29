package ridingSports.turn

interface CenterOfMassMovingPlan {
    val oneTurnArcShape: OneTurnArcShape
    /**
     * 一秒間に拇指球と踵を1とした場合　どれぐらいの割合を進むように操作するのか？
     */
    data class MovingRatioPerSecond(val long: Long)

    val movingRatioPerSecond: MovingRatioPerSecond
    get () =
        MovingRatioPerSecond(1 / oneTurnArcShape.timeDuration.seconds)

}