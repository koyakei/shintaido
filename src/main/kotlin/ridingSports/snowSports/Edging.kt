package ridingSports.snowSports

/**
 * 逆エッジと正エッジの違いを定義
 */
interface Edging {

    /**
     * 返り値は抵抗力でいいのか？
     */
    fun handle()

    /**
     * 引っかかってから埋まりきったところの抵抗にするか。
     */
    fun handleReverse()

}