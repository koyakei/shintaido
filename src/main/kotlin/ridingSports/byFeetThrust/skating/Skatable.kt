package ridingSports.byFeetThrust.skating

import ridingSports.byFeetThrust.ForwardThrustableByLegExtending
import ridingSports.pumpingTrack.ForwardBackwardGoal

interface Skatable: ForwardThrustableByLegExtending{
    //　後ろに蹴る　蹴って足が遠くに行ったら、
    // その足を戻さなきゃいけない。
    override val goal: ForwardBackwardGoal
    override val thrustableLeg: SkatableLeg
    /**
     * 乗り物と垂直に押したら進む
     * ピッチング0度で進むとどうするのか？
     */
    override fun handle(): Unit{
        super.handle()
        if (sideWayVelocityOfCenterOfMass.value > 0.0){
            thrustableLeg.thrustForwardBySidewayExtending()
        } else {
            thrustableLeg.readyToThrustSidewayPosition()
        }
    }

    interface SideWayVelocityOfCenterOfMass{
        val value: Double
    }
    val sideWayVelocityOfCenterOfMass: SideWayVelocityOfCenterOfMass
    interface SkatableLeg: ForwardThrustableByLegExtending.ForwardThrustableLeg {

        override fun thrustToForward() {
            super.thrustToForward()
            thrustForwardBySidewayExtending()
        }
        fun thrustForwardBySidewayExtending(){

        }

        override fun readyToThrust() {
            readyToThrustSidewayPosition()
        }
        fun readyToThrustSidewayPosition()
    }
}