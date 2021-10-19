package bodyAnalysis

import Animal

/**
 *
 */
interface HumanBody:Animal {
    val ルーズジョイントの許容量v: ルーズジョイントの許容量
    val ルーズジョイントの度合い: ルーズジョイントの度合い
    @JvmInline
    value class ルーズジョイントの許容量(val int: Int)
}