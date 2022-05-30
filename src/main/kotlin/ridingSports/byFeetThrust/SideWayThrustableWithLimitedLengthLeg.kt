package ridingSports.byFeetThrust

import library.ForceAndVector

interface SideWayThrustableWithLimitedLengthLeg : BladeThrustableLeg{
    /**
     * 足は長さの制限だけていきょうするか
     *
     */
    override fun thrust() :ForceAndVector{

        return super.thrust()
    }
}