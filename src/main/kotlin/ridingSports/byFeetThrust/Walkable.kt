package ridingSports.byFeetThrust

interface Walkable:ForwardThrustableByLegExtending{



    val 支持基底点の位置がピッチングモーメントが継続して生まれる状態 : Boolean
    var 足を前に送っている: Boolean
    override fun handle():Unit{
        /**
         * 異常系解消メソッド
         */
        ピッチングモーメントが継続して生まれる状態まで支持基底点を変化させる()
        /**
         * 異常系が解消したあとのメソッド
         */
        if (!足を前に送っている && gripToRoad.isEnoughGripToRoad.boolean && 支持基底点の位置がピッチングモーメントが継続して生まれる状態) {
            thrustableLeg.thrustToForward()
        }
        if (!足を前に送っている){
            gripToRoad.maintainGripForThrust(enoughGripToRoad)
        }
        if (!足を前に送っている && thrustableLeg.footPosition.forwardBackward == ThrustableLeg.FootPosition.ForwardBackward.BackwardMax){
            gripToRoad.releaseGrip()
            thrustableLeg.readyToThrust()
            足を前に送っている = true
            if (足を前に送っている && thrustableLeg.footPosition.forwardBackward == ThrustableLeg.FootPosition.ForwardBackward.ForwardMax){
                足を前に送っている = false
            }
        }
    }

    fun ピッチングモーメントが継続して生まれる状態まで支持基底点を変化させる()

}