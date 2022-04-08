package ridingSports.snowSports.逆エッジ

import library.Length
import ridingSports.mobilityMachine.MobileMachineCondition
import ridingSports.snowSports.SnowSportsMobileMachine

interface 道具が交換できない場合の逆エッジのリスク計算 :逆エッジのリスクの計算{
    override val edgeLengthBetweenSnow: Length
        get() =
            Length(snowSportsMobileMachine.edgeShape.waistWidth * mobileMachineCondition.rollDegree.number.toFloat())
    val snowSportsMobileMachine: SnowSportsMobileMachine
    val mobileMachineCondition: MobileMachineCondition

}