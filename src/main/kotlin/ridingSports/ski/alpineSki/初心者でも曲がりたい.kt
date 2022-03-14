package ridingSports.ski.alpineSki

import ridingSports.RidersAbility
import ridingSports.balance.復元力を高くする
import ridingSports.snowSports.SnowSportsMobileMachine
import ridingSports.snowSports.SnowSportsRidersAbility
import ridingSports.snowSports.少なく不正確な加重移動でヨーイング角速度を大きくする
import ridingSports.snowSports.逆エッジ.逆エッジのリスクの計算
import ridingSports.snowSports.逆エッジ.道具が交換できない場合の逆エッジのリスク計算

interface 初心者でも曲がりたい {
    val 復元力を高くする: 復元力を高くする
    val 道具が交換できない場合の逆エッジのリスク計算: 道具が交換できない場合の逆エッジのリスク計算
    val snowSportsMobileMachine: SnowSportsMobileMachine
    val 少なく不正確な加重移動でヨーイング角速度を大きくする: 少なく不正確な加重移動でヨーイング角速度を大きくする


    interface スキー初心者: SnowSportsRidersAbility {
        /**
         * 能力が低い
         */
    }

    /**
     * 曲がりたいときに曲がれないよー
     * とにかくゆっくり曲がりたい。
     * 要求をすると姿勢変化が出てくるようにしたい。
     * よりないけいかくをとりたい。
     * 左右の移動量を大きくしたい。
     * 前後のプレッシャーの移動をなめらかにしたい。
     * started at forward pressure を毎ターン強くしたい。
     *
     * 前後バランスのタイミングがずれている。　正確にしたい。小さい目標
     * 前後バランスが正確になると、どのような安全な滑り方ができるのかは、別の説明で補足する
     * 現在の滑りから前後バランスを正確にするには、何の能力を上げたらいいのか、
     * どのような乗り物の動きが理想なのかを返す関数がほしい。
     *
     */

    fun handle(){
        復元力を高くする.handle()
        //次のターンに入ったときに角付けがされているように予め用意しておくために、支持基底面を広げるだけではなく、
        // Aフレームが出るような姿勢を取るべきだと計算結果を示せていない。時系列的変化のための準備をどのように表迂言するのか？
        少なく不正確な加重移動でヨーイング角速度を大きくする.handle()
        -道具が交換できない場合の逆エッジのリスク計算.riskOf逆エッジ // これの戻り値にエッジアングルの増大もしくは　板の幅の増大を得たい。板の幅を変えない場合は
        // エッジアングルの増大のみを返したい。
        //

    }
}