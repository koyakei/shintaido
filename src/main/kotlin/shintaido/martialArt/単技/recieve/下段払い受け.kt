package shintaido.martialArt.単技.recieve

import shintaido.martialArt.武器技.武器技の要素
import shintaido.movePart.攻防.刃の向き.持ち手の向き
import shintaido.movePart.攻防.刃の向き.順刃
import shintaido.movePart.攻防.動かし方.動かし方
import shintaido.movePart.攻防.動きの向き.刃の向きで相対的に定義する切るの向き
import shintaido.movePart.攻防.防御技
import shintaido.movePart.構え.上体の構えの高さ

/**
 * 刀もあるから実体にしちゃだめ
 */
interface 下段払い受け : 防御技,武器技の要素 {
    override val 持ち手の向き: 持ち手の向き
        get() = 順刃()
//    val 刃の向きで相対的に定義する切るの向き: 刃の向きで相対的に定義する切るの向き = 刃の向きで相対的に定義する切るの向き()
//    val 上体の構えの高さ: 上体の構えの高さ = shintaido.movePart.構え.上体の構えの高さ.下段
//    val 動かし方: 動かし方
//
//        get() = shintaido.movePart.攻防.動かし方.動かし方.払い
}