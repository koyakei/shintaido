package ridingSports.pumpingTrack

import ridingSports.RidersAttitude


/**
 * 支点を動かせない乗り物の動きとして考える
 */
interface PumpingInPumpingTrack {
    val pumpingTrackCondition :PumpingTrackCondition
    val ridersAttitude: RidersAttitude

    //
    fun handle(){
        pumpingTrackCondition.friction // と gravity の合力ベクトル
        if (pumpingTrackCondition.slopeAngleAgainstGravity.number.toFloat() < 0){
            // 上りだったら
            ridersAttitude.bodyCenterOfMassHightBetween支持基底点.unaryMinus()

            ridersAttitude.plusBodyCenterOfMassHightBetween支持基底点(pumpingTrackCondition.minimum降伏Force)

        } else{
            ridersAttitude.bodyCenterOfMassHightBetween支持基底点.unaryPlus()
        }
    }
}