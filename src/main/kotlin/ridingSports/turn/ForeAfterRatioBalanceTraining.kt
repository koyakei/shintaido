package ridingSports.turn

/**
 * carv fore after ration balance monitor mode 2021 で 任意の数字を出せるようにする練習
 *　- 足の裏だけで操作して合格することもできるが　アッパーシェルへの圧力と足裏の圧力分布を一致させて行うべき。
例えば、前に加重したければ、タンへの圧力も増やす。
- 外足加重でやる
- 加重中心を拇指球と小指球を結んだ線からかかとまで一定の方向とスピードで移動させる。途中でベクトルを変えない。
 なんで、ベクトルを変えないと早く上達するのか？
 ターン始動時に弧を想像してそのとおりに加重心を動かさないとスムーズではなくなる。
したがって、ターン始動時にターン弧を計画する癖がつく
 */
interface ForeAfterRatioBalanceTraining {
    fun handle(){
        oneTurnArcShape()
    }

    val centerOfPressureMovingPlan:CenterOfMassMovingPlan

    fun oneTurnArcShape():OneTurnArcShape


}