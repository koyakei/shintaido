package shintaido.martialArt.種目別の技

import shintaido.movePart.攻防.刃の向き.持ち手の向き
import shintaido.movePart.攻防.動きの向き.刃筋の通り度合い
import shintaido.movePart.攻防.米字切込切り払い.米字切り

interface 技を出す台の移動以外の技の要素 {
    val 持ち手の向き : 持ち手の向き
    val 刃筋の通り度合い: 刃筋の通り度合い
    val 米字切り: 米字切り
}