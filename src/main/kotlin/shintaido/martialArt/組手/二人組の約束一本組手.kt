package shintaido.martialArt.組手

import KumiteParticipant
import shintaido.fundamentalBasic.技
import shintaido.martialArt.単技.単技
import shintaido.martialArt.武道の技
import shintaido.movePart.攻防.relativeSpeed.受け技
import shintaido.movePart.攻防.攻撃技

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