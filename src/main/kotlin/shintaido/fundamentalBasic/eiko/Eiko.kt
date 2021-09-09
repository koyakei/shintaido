package shintaido.fundamentalBasic.eiko

interface Eiko {

    interface 目標が有界でない{
        @JvmInline
        value class Minimum(val any: Any)

        @JvmInline
        value class Maximum(val any: Any)
    }

    /**
     * 遺伝子的に一つのみの方向への集中
     * 這う　立つ　前に歩く　と進化したので　もっと天に向かって行くように集中する
     * 前に歩くときには前方へ集中するが、体と意識の集中する方向を同じにする
     */
    interface SimpleConcentrationGoal{
        /**
         * 複雑化するときの度合いは計測しないことにする
         */
    }
}