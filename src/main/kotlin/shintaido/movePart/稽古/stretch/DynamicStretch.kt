package shintaido.movePart.稽古.stretch

/**
 * 動的ストレッチ
 * improveJointRangePower とjointDislocationPowerは独立である。
 * なぜなら、筋が連結している複数の関節を一度に切り込むように目標を設定すると、関節が最大に伸展する上体でjointDislocationPowerは
 * 0になるが、improveJointRangePowerはその途中で大きくなるのが一つの関節を進展させるより早い
 * 関節の可動域限界よりも筋肉の長さの限界をできるだけ早めに迎えることによって、関節が外れる危険性のない状態で筋肉を伸ばせる
 *
**/
interface DynamicStretch: Stretch {
    /**
     * 関節を安定させるための筋力の大きさ
     * 動かすために使う筋力と
     */
    val staticPower: Int
    /**
     * 勢いをつけて関節の可動域を大きくする力
     *
     */
    val improveJointRangePower: Int
    /**
     * 勢いをつけて関節のを正しい位置から外す力
     *
     */
    val jointDislocationPower:Int

    /**
     * 勢いが関節を外す力になりやすい方向に動かしているか？
     * 切込で動かす分には関節の可動域の終端で可動域を超える方向に動く力が少なくなっていく
     * 切り払いで動かすよりは、あんぜんである。この表現をどうするか？
     */

    interface DynamicStretchSafety{
        val dynamicStretch:DynamicStretch
        /**
         * 逆操作もできるように定義
         */
        fun plus(){
            dynamicStretch.jointDislocationPower + 1
            dynamicStretch.staticPower + 1
        }
        fun minus(){
            dynamicStretch.jointDislocationPower - 1
            dynamicStretch.staticPower - 1
        }
    }



}