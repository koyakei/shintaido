package shintaido.fundamentalBasic.tenshingoso.element

import shintaido.fundamentalBasic.tenshingoso.TenshingosoElement
import shintaido.fundamentalBasic.tenshinGyro.相対有

interface イ: TenshingosoElement, 相対有 {
    override val nextElement:  オ

    override val beforeElement:エ
}