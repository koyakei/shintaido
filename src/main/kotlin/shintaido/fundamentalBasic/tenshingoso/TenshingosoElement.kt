package shintaido.fundamentalBasic.tenshingoso

/**
 * 体技としての天真五相と概念としての天真五相を別にするべきかとおもうが　天真五相のそれぞれの要素の前後関係をinterface　で定義して奥にはどうするべきなのか？
 * ウンとアのかのエイオという表現をコードでやる方法が思いつかない。
 */
interface TenshingosoElement {
    val nextElement: TenshingosoElement
    val beforeElement: TenshingosoElement
}