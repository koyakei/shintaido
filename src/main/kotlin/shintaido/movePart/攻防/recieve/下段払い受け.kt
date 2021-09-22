package shintaido.movePart.攻防.recieve

import shintaido.movePart.攻防.刃の向き.刃の向き
import shintaido.movePart.攻防.動かし方.動かし方
import shintaido.movePart.攻防.動きの向き.刃の向きで相対的に定義する切るの向き
import shintaido.movePart.攻防.防御技
import shintaido.movePart.構え.上体の構えの高さ

class 下段払い受け : 防御技 {
    val 刃の向き : 刃の向き = 刃の向き(shintaido.movePart.攻防.刃の向き.刃の向き.順刃)
    val 刃の向きで相対的に定義する切るの向き: 刃の向きで相対的に定義する切るの向き = 刃の向きで相対的に定義する切るの向き()
    val 上体の構えの高さ: 上体の構えの高さ = shintaido.movePart.構え.上体の構えの高さ.下段
    val 動かし方: 動かし方 = shintaido.movePart.攻防.動かし方.動かし方.払い
}