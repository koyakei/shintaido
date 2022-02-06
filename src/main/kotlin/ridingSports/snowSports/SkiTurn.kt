package ridingSports.snowSports

import ridingSports.RidersCenterOfMassBalanceForMobility
import ridingSports.separetedBoard.rightLeft.外側荷重点計算機
import ridingSports.downHillSlope.最大横Gを得るターン弧を描くためのフォールラインに対しての相対角度を計算
import ridingSports.turn.Turn
import ridingSports.turn.TurnPhase

/**
 * 理想のターン
 * 最大のフォールラインに対しての横Forceを最大化したまま無限に継続できるターン
 * この命令で最適なターン判断を環境に合わせて行う
 * 次のターン内側の点は任意に決定するとする
 * その点と自分の状態を判断して、次の動きを常に決められるようにする。
 * ターン途中でのターン弧を変える判断はどうするのか？　
 */
class SkiTurn(
    val 最大横Gを得るターン弧を描くためのフォールラインに対しての相対角度を計算:
    最大横Gを得るターン弧を描くためのフォールラインに対しての相対角度を計算
    ,val skiRidersAttitude: SkiRidersAttitude,
    val snowCondition: SnowCondition,
    val ridersCenterOfMassBalanceForMobility: RidersCenterOfMassBalanceForMobility,
    val 外側荷重点計算機: 外側荷重点計算機,
    val turnPhase: TurnPhase
):Turn {

    override fun handle(){
        外側荷重点計算機.handle(skiRidersAttitude,snowCondition)// 荷重点を決定
        // 荷重点との差分を計算
        // 埋める重心移動
        // 支持基底点を設定するのが先なのか？　足元から考えるとは？
        // スキーと雪面の接触状態から考える

        if(turnPhase.ratio.number.toFloat() < 50){// ターン前半だったら
            // できるだけ重心はターンマックスから見てターン外側に動かしておくのか？
            // 切り替えた瞬間に一番外に来ているのがいいのか？　荷重点が前すぎる？　谷ではなくて　山に行く必要も　なさそうである。
            // 谷に重心が落ちていても、スケーティングだけを考える　ずれないことを考える　など色々考えることはある。全ての要求を書くか
        } else {

        }
        // 理想のターン弧との差
        val dir = 最大横Gを得るターン弧を描くためのフォールラインに対しての相対角度を計算.handle() - skiRidersAttitude.yawDirectionAgainstFallLine
        //ターン弧の調整って完全に逆元なのか？
        // ターン弧の調整と谷に体を落とすかはある程度独立していて、胴体の連結によって制限されている
        // ターン弧を速度がない状態でカービングに限定して小さくすると重心がなかに入りすぎる
        // 連立方程式にして、外側荷重　スピードの維持　小さいラディウスを兼ね備える
        // まずターン弧の変化が必要ない場合で考える

        if (dir.value < 0){ // ターン弧を緩めるとすると

        } else if (dir.value > 0){ // ターン弧をきつくするとすると

        }
    }
}