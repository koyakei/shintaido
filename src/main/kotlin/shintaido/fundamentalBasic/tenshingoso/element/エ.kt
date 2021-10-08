package shintaido.fundamentalBasic.tenshingoso.element

import shintaido.fundamentalBasic.tenshingoso.TenshingosoElement
import shintaido.fundamentalBasic.tenshinGyro.相対有

interface エ: TenshingosoElement, 相対有 {

    override val nextElement:  イ

    override val beforeElement:ア
}