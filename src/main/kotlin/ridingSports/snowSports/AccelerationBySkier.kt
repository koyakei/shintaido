package ridingSports.snowSports

import ridingSports.downHillSlope.IdealRelativeCenterOfMassPositionInSkating

/**
 * スキーヤーの動きで加速する全般の動作
 * ターンフェイズに合わせて反発を計算
 * 適切な加重変化を指示する
 * スキーを押して加速するスケーティングとは別要素にする
 */
interface AccelerationBySkier {
    val idealRelativeCenterOfMassPositionInSkating: IdealRelativeCenterOfMassPositionInSkating
    fun handle(){
        // 適切な場所に重心をおいて、で伸ばすだけ？
        // 踵に支持基底点の操作も必要そうだな
        idealRelativeCenterOfMassPositionInSkating.handle()
    }

}