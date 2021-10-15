package shintaido.martialArt.単技.recieve.sword

import shintaido.movePart.攻防.刃の向き.持ち手の向き
import shintaido.movePart.攻防.動きの向き.刃筋の通り度合い
import shintaido.movePart.攻防.動きの向き.刃筋の通り度合い.Companion.棟受け
import shintaido.movePart.攻防.防御技

class 拓き受け(
    val 刃の向きv :持ち手の向き.Direction = 持ち手の向き.逆刃,
    val 動きの向きv :刃筋の通り度合い.Direction = 棟受け
) : 防御技{
}