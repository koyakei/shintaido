package shintaido.martialArt.単技.recieve.general

import shintaido.martialArt.単技.技の発揮先.場所.技の発揮先が下段
import shintaido.martialArt.単技.技の発揮先.場所.技の発揮先の段

interface 下段払い受け :払い受け{
    override val 技の発揮先の段: 技の発揮先の段
        get() = 技の発揮先が下段()
}