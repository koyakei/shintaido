package shintaido.fundamentalBasic.tenshingoso.element

import shintaido.fundamentalBasic.tenshingoso.TenshingosoElement
import shintaido.fundamentalBasic.tenshinGyro.相対有

/**
 * 生成　誕生
 */
interface ア:TenshingosoElement, 相対有
{
    override val nextElement:  エ

    override val beforeElement:ウン
}