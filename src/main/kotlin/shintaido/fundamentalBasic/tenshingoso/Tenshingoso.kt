package shintaido.fundamentalBasic.tenshingoso

import shintaido.fundamentalBasic.tenshingoso.element.*

interface Tenshingoso {
    val tenshingosoElementA: ア
    val tenshingosoElementE: エ
    val tenshingosoElementI: イ
    val tenshingosoElementO: オ
    val tenshingosoElementUM: ウン
    fun balanced(): Boolean
    fun perfectlyBalanced():Boolean
}