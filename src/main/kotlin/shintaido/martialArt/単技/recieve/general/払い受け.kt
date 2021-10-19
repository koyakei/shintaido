package shintaido.martialArt.単技.recieve.general

import shintaido.martialArt.単技.general.払い技
import shintaido.martialArt.種目別の技.技を出す台の移動以外の技の要素
import shintaido.movePart.攻防.米字切込切り払い.上段切り払い
import shintaido.movePart.攻防.米字切込切り払い.米字切り
import shintaido.martialArt.防御技

/**
 * 刀もあるから実体にしちゃだめ
 */
interface 払い受け : 防御技, 技を出す台の移動以外の技の要素 , 払い技 {
    override val 米字切り: 米字切り
        get() = 上段切り払い()
}