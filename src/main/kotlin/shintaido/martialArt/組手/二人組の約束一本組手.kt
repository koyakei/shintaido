package shintaido.martialArt.組手

import KumiteParticipant
import shintaido.martialArt.攻撃技

/**
 * 参加者を割り当てて、それぞれが技を出すようにしなきゃだめなんだろうなぁ
 */
interface 二人組の約束一本組手: 二人組の約束組手 {

    interface 攻撃側の参加者: KumiteParticipant{
        override val 技Set: Set<攻撃技>
    }

    interface 受け側の参加者: KumiteParticipant{
        override val 技Set: Set<攻撃技>
    }


}