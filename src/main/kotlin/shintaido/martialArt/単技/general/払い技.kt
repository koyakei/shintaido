package shintaido.martialArt.単技.general

import shintaido.martialArt.単技.技の発揮先.場所.技の発揮先の段
import shintaido.martialArt.種目別の技.技を出す台の移動以外の技の要素
import shintaido.movePart.攻防.刃の向き.持ち手の向き
import shintaido.movePart.攻防.刃の向き.順刃
import shintaido.movePart.攻防.動きの向き.刃筋の通り度合い
import shintaido.movePart.攻防.米字切込切り払い.上段切り払い
import shintaido.movePart.攻防.米字切込切り払い.米字切り
import shintaido.movePart.攻防.防御技

interface 払い技 :  技を出す台の移動以外の技の要素 {
    override val 持ち手の向き: 持ち手の向き
        get() = 順刃()
    override val 刃筋の通り度合い: 刃筋の通り度合い
        get() = 刃筋の通り度合い()
    val 技の発揮先の段: 技の発揮先の段
}