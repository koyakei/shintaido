package ridingSports

import library.平面
import library.点
import java.util.*

/**
 * 実態は面として考えないといけないけど　理想は点で考える
 * 面であっても中心を考えたほうがいい。
 */
interface RidersCenterOfMassBalanceForMobility {
    val 重力Vector: Vector<Number>
    val 慣性力Vector: Vector<Number>
    val 接雪面Vector: 平面

    /**
     *
     */
    fun riderに働くVector(): Vector<Number>
    //    {
//        return 重力Vector + 遠心力Vector
//    }
    fun handle(): 点 {
        return 接雪面Vector.find接点(riderに働くVector())
    }
}



