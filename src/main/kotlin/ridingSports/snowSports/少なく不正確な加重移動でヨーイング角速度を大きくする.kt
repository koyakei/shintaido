package ridingSports.snowSports


/**
 * edge angle が大きい状態で左右に加重移動をすると
 * edge angle が小さい時よりも深く曲がる
 *
 */
interface 少なく不正確な加重移動でヨーイング角速度を大きくする {
    val snowMobileMachineConditionWithEdge: SnowConditionCarvableConditionWithEdge
    /**
     * ラムダを返す
     * MobileMachineConditionのロールアングルを増やす
     * 返ってきたらラムダを　MobileMachineCondition 変数に適用すると、やるべきことがわかる
     *
     */
    fun handle() = snowMobileMachineConditionWithEdge.let { it.rollDegree.inc() }
}