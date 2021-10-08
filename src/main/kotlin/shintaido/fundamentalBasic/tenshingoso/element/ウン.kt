package shintaido.fundamentalBasic.tenshingoso.element

import shintaido.fundamentalBasic.tenshingoso.TenshingosoElement
import shintaido.fundamentalBasic.tenshinGyro.相対無
import shintaido.movePart.bodyMudrah.正のバリエーション.無想位

/**
 * 消滅
 * 無想印になっていく流れを含むのでここに
 */
interface  ウン: TenshingosoElement, 相対無, 無想位
{
    override val nextElement:  ア

    override val beforeElement:オ
}