package ridingSports.singleRidingMaterialPumping

import ridingSports.byFeetThrust.ThrustableLeg
import ridingSports.byFeetThrust.WalkingTrackCondition
import ridingSports.byFeetThrust.skating.SkatingCondition
import ridingSports.pumpingTrack.ForwardBackwardGoal
import ridingSports.ridersAttitude.RidersAttitude

/**
 * 乗り物を一つにまとめてパンピングする
 * 一本足スケーティングともいう
 * なんで前半で伸びずに後半で上に伸びるのか？
 * ターンマックスに向かって縮んで　横に行く力を発揮しながら伸びる
 * スケーティングする　引くスケーティング
 * 立ち上がらないポンピングを考える
 * 立ち上がりで横方向に加速するポンピングを考える
 * 足の長さに制限があり、内傾角度と曲率に比例関係がある
 *
 */
interface SingleMaterialPumpable {
    val goal: ForwardBackwardGoal
    val roadCondition: WalkingTrackCondition
    val mobileMachineCondition: SkatingCondition
    val ridersAttitude: RidersAttitude
    fun handle() {
        mobileMachineCondition.gripToRoad
        // グリップしてる
        // ダブルプッシュを考慮する
        // 外側に押すときに出力を出す
        // 引きつけるときには出力しない
        // 外側に押し出す余地がある　外かつ後ろに押す
        // 外側に押し出す余地がない　引きつける
        // 押せる余地があるなら外後ろのいっぱいまで押す
        // 余地がなくなったら一番縮める
        // ダブルプッシュと矛盾がない？
        // ダブルプッシュはインラインでしかやらないのか？
        if (mobileMachineCondition.thrustableLeg.footPosition.side
            != ThrustableLeg.FootPosition.Side.OutsideMax
            || mobileMachineCondition.thrustableLeg.footPosition.forwardBackward !=
            ThrustableLeg.FootPosition.ForwardBackward.BackwardMax
        ){
            //途中で押す方向を変えることはしないとする。
            // 計画通りに押さないと大変なので変化させない
            // 伸ばす方向は後ろかつ外側 3象限　4象限に限るとする。
            mobileMachineCondition.thrustableLeg.thrustToForward()
        }else{
            mobileMachineCondition.thrustableLeg.readyToThrustSidewayPosition()
        }
    }
}