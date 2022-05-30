package ridingSports.byFeetThrust

interface ThrustableWithLimitedLegLength : Thrustable {
    val limitedLengthLeg: LimitedLengthLeg
    var isTakingBackPhase: Boolean

    /**
     * スネイクも考えるか
     * 一番やりやすいスラストをする
     * 次善のスラストでもとに戻る方向に行くなら、次善のスラストをする。
     * 戻ってきたらそのスラストを継続して限界まで行ったら次のスラストをする。
     */
    override fun handle() {
        if (isTakingBackPhase) {
            if (limitedLengthLeg.footPosition.takingBackSpace == LimitedLengthLeg.FootPosition.TakingBackSpace.FullyTakingBack) {
                next()
            } else {
                takingBack()
            }
        } else {
            if (limitedLengthLeg.footPosition.takingBackSpace == LimitedLengthLeg.FootPosition.TakingBackSpace.FullyExtending) {
                next()
            } else {
                thrust()
            }
        }
    }

    fun takingBack(){
        limitedLengthLeg.takingBack()
    }

    override fun next() {
        isTakingBackPhase = !isTakingBackPhase
    }
}


interface WalkableWithLimitedLegLength : ThrustableWithLimitedLegLength {

}

interface SkatableWithLimitedLegLength {
    val isTakingBack: Boolean
    fun handle() {
        if (isTakingBack) {
            // ThrustableWithLimitedLegLengthTakingBackPhase // を呼ぶ
        } else {

        }
    }
}