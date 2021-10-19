package shintaido.movePart.稽古.整理体操

import shintaido.movePart.稽古.stretch.StaticStretch
import shintaido.movePart.稽古.稽古方法

interface 整理体操: 稽古方法 {
    val staticStretch: StaticStretch
}