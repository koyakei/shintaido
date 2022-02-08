package ridingSports.balance

import library.Force
import ridingSports.mobilityMachine.EdgeAngle

interface CrossOverBalance {
    val hightOfCenterOfMass: Number

    fun recoveryForce(): Force

    fun turnDownForce(edgeAngle: EdgeAngle): Force {
        return Force(hightOfCenterOfMass.toFloat() * edgeAngle.radian.number.toFloat())
    }
}