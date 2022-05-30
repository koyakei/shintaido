package ridingSports.downHillSlope

import library.Force
import library.Radian
import ridingSports.byFeetThrust.ThrustableOnLimitedGripRoad
import ridingSports.mobilityMachine.支持基底Condition
import ridingSports.ridersAttitude.RidersAttitude

/**
 * 重力要素をトラックコンディションと進行方向に導入
 * 進行方向と重力方向のなす角が180度未満であるとする
 * エッジグリップの余裕を重力加速度の方向と比例させて算出
 * エッジグリップの限界までRidersAttitudeの加速する動作をする関数を呼ぶ
 * エッジグリップが足りなくなったら　エッジグリップを増やす関数を呼ぶ
 * エッジグリップはパワーの平方に比例する　だからパワーを瞬間的に上げたい
 * 平面でのポンピングを先にかんがえるか。
 * エッジグリップがたりないターン後半に立ち上がってエッジグリップを増すことを
 */
interface ContinuousTurnableInDownhillSlope : ThrustableOnLimitedGripRoad {
    val roadCondition: DownhillSlopeMachineCondition
    val ridersAttitude: RidersAttitude
    val gripToRoad: 支持基底Condition.GripToRoad

    override fun handle() {
        super.handle()
        // 重力方向と進行方向のなす角度を算出
        val angle: Radian = roadCondition.angleBetweenFallLineAndForward

        // 必要なエッジグリップを要求
        val edgeGrip = gripToRoad.maintainGripForThrust(demandedEdgeGripForce(angle))

        // できるだけ遅いヨーイング角速度を得るために　低いロール角　次のターンへの重心移動を速く移動させる
        // そのために高いポジションで切り替えているのか？

    }

    /**
     * ずれの量をターンを通じて一定にすることで、適切に雪の壁を作れるか？
     * ズレ幅を一定にするためには、ターン前半で位置エネルギーを低くしながらグリップを弱くしてエッジ角を深くすることで生まれるグリップで横かつ前に加速し、
     * ターン後半で位置エネルギーを高くすることでポンピングしつつグリップして　エッジ角度が浅くなっても強いグリップを維持したままターンを続けられるようにする。
     */
    fun amountOfskiddingを一定にする()

    fun demandedEdgeGripForce(radian: Radian): Force
}