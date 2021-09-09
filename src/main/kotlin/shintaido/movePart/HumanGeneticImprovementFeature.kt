package shintaido.movePart

/**
 *
 *
 *　将来　植物　動物の上に人間を乗せるように使用
 * 　鉱物と鉱物以外の存在で何が分かれるかについて
 *
 */
interface HumanGeneticImprovementFeature {

    /**
     * 重力に逆らう方向への成長　植物と同様か
     */
    fun antiGravity(improveDegree : Int)

    /**
     * 行きたい方向へ重力と水平に移動する能力の成長
     * 存在自体が移動するのはどうぶつの
     */
    fun moveHorizontal(improveDegree : Int)

    /**
     * 開く　大事な部分を守るように成長してきたが、それを外に晒すように成長してきた。
     * 伸びる動物や抱きつくために開く動物がいるが　宇宙の彼方に向かって意識的に開けるのは人間だけではないか
     */
    fun openBody(improveDegree : Int)
}