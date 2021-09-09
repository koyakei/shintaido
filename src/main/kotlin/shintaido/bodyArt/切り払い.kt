package shintaido.bodyArt

import shintaido.movePart.攻防.切込

/**
 * 自分の移動方向と攻撃の移動方向が違う場合切り払いになるけど、武器と自分の距離が有限だとすると自分が引っ張られるので切込になる
 * 例えば徒手格闘
 */
interface 切り払い: 切込 {
}