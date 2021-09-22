package shintaido.movePart.攻防.recieve.sword

import shintaido.movePart.攻防.刃の向き.刃の向き
import shintaido.movePart.攻防.動きの向き.技の動きの向き
import shintaido.movePart.攻防.動きの向き.技の動きの向き.Companion.逆手斬り
import shintaido.movePart.攻防.防御技

class 拓き受け(
    val 刃の向きv :刃の向き.Direction = 刃の向き.逆刃,
    val 動きの向きv :技の動きの向き.Direction = 逆手斬り
) : 防御技{
}