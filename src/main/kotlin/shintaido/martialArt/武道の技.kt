package shintaido.martialArt

import shintaido.fundamentalBasic.技
import shintaido.martialArt.単技.技の発揮先.場所.技の発揮先の段
import shintaido.martialArt.種目別の技.武器の種類

interface 武道の技:技 {
    val 武器の種類: 武器の種類
    val 技の発揮先の段: 技の発揮先の段
}