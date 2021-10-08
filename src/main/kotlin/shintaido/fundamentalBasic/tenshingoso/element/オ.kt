package shintaido.fundamentalBasic.tenshingoso.element

import shintaido.fundamentalBasic.tenshingoso.TenshingosoElement
import shintaido.fundamentalBasic.tenshinGyro.相対有

interface オ: TenshingosoElement, 相対有 {

    override val nextElement:  ウン

    override val beforeElement:イ
}