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
         * 低い
         */
    }

    fun handle(){
        復元力を高くする.handle()

        // ゆっくり滑って　ヨーイング角速度を大きくしたい。
        // 加重変化はうまくできない　
        -道具が交換できない場合の逆エッジのリスク計算.riskOf逆エッジ // これの戻り値にエッジアングルの増大もしくは　板の幅の増大を得たい。板の幅を変えない場合は
        // エッジアングルの増大のみを返したい。
        //

    }
}