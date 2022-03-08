package ridingSports.snowSports.逆エッジ

import library.Distance
import ridingSports.mobilityMachine.MobileMachineCondition
import ridingSports.snowSports.SnowSportsMobileMachine

interface 道具が交換できない場合の逆エッジのリスク計算 :逆エッジのリスクの計算{
    override val edgeDistanceBetweenSnow: Distance
        get() =
            Distance(snowSportsMobileMachine.waistWidth.toFloat() * mobileMachineCondition.rollDegree)
    val snowSportsMobileMachine: SnowSportsMobileMachine
    val mobileMachineCondition: MobileMachineCondition

}