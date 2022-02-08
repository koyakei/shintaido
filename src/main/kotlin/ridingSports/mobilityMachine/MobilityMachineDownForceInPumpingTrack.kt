package ridingSports.mobilityMachine

import ridingSports.DownForce
import ridingSports.ridersAttitude.RidersAttitude
import ridingSports.pumpingTrack.PumpingTrackCondition

class MobilityMachineDownForceInPumpingTrack(
    override val downForce: DownForce,
    override val ridersAttitude: RidersAttitude,
    override val pisteCondition: PumpingTrackCondition
) :MobilityMachineDownForceCondition {
    /**
     * 無限に向かって高くすることを定義する。イデアルを加えたら無限に飛ぶ　離散
     */
    fun unaryPlus() =
        +ridersAttitude.bodyCenterOfMassHightBetween支持基底点


   fun unaryMinus() = -ridersAttitude.bodyCenterOfMassHightBetween支持基底点

}