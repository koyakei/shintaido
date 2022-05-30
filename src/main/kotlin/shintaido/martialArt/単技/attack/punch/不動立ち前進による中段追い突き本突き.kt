package shintaido.martialArt.単技.attack.punch

import shintaido.martialArt.単技.技の発揮先.場所.技の発揮先が下段
import shintaido.martialArt.単技.技の発揮先.場所.技の発揮先の段
import shintaido.martialArt.武道の技
import shintaido.martialArt.種目別の技.karate.正拳
import shintaido.martialArt.種目別の技.karate.空手の武器
import shintaido.martialArt.種目別の技.武器の種類

/**
 * これの要素を記述できるように
 */
class 不動立ち前進による中段追い突き本突き(
    override val 武器の種類: 武器の種類 = 正拳(),
    override val 技の発揮先の段: 技の発揮先の段 = 技の発揮先が下段()) :武道の技 {
}