package ridingSports

/**
 * 意図した方向に移動すること
 */
interface Transport {

    val ridersCenterOfMassBalanceForMobility:RidersCenterOfMassBalanceForMobility

    fun handle(){
        ridersCenterOfMassBalanceForMobility.handle()
    }
}