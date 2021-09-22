package shintaido.movePart.攻防.recieve.sword

import shintaido.movePart.攻防.刃の向き.刃の向き
import shintaido.movePart.攻防.動きの向き.刃の向きで相対的に定義する切るの向き
import shintaido.movePart.攻防.動きの向き.刃の向きで相対的に定義する切るの向き.Companion.棟受け
import shintaido.movePart.攻防.防御技

class 拓き受け(
    val 刃の向きv :刃の向き.Direction = 刃の向き.逆刃,
    val 動きの向きv :刃の向きで相対的に定義する切るの向き.Direction = 棟受け
) : 防御技{
}