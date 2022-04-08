package ridingSports.snowSports

import library.Force

interface IncreaseEdgeGrip {
    val snowWallCondition: ridingSports.snowSports.SnowWallCondition
    val skiTipShape: SkiTipShape

    val edgeContactConditionWithSnow: EdgeContactConditionWithSnow

    /**
     * snowWallCondition + edgeContactConditionWithSnow
     */
    val isSkidding: Boolean

    /**
     * (skiTipShape: SkiTipShape, edgeContactConditionWithSnow: EdgeContactConditionWithSnow)
     */
    val 剪断力: Force
    /**
     * 鋭さと力の合計だからforce じゃないかなぁ
     * エッジの潜り込む形状によって大幅に変化しそうなもんだけど、あまり関係ない。無視するか
     * せん断力に含めてしまおう。
     * 増やしたければ
     */
    fun plus(edgeContactConditionWithSnow: EdgeContactConditionWithSnow){
        val diff = snowWallCondition.bestGripHight.length.toFloat() - snowWallCondition.currentHight.length.toFloat()
        if (diff < 0){
            edgeContactConditionWithSnow.moreTipContact()
        } else if (diff > 0){
            edgeContactConditionWithSnow.moreTailContact()
        }
        edgeContactConditionWithSnow.plusHorizontalForce()
    }

    fun minus()
}