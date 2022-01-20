package shintaido.fundamentalBasic.eiko

import shintaido.fundamentalBasic.mudrah.Mudrah
import shintaido.fundamentalBasic.tenshinGyro.天

interface Eiko: Mudrah ,天{

    interface 目標が有界でない{
        @JvmInline
        value class Minimum(val any: Any)

        @JvmInline
        value class Maximum(val any: Any)
    }
    // 栄光する
    fun handle(): Any

    /**
     * 遺伝子的に一つのみの方向への集中
     * 遺伝子的に合う方向への努力は栄光に含まれているのか？別に含まれないと思うが。
     * 這う　立つ　前に歩く　と進化したので　もっと天に向かって行くように集中する
     * 前に歩くときには前方へ集中するが、体と意識の集中する方向を同じにする
     * 複雑でも栄光は栄光ですから。
     */
//    interface SimpleConcentrationGoal{
//        /**
//         * 複雑化するときの度合いは計測しないことにする
//         */
//    }
}