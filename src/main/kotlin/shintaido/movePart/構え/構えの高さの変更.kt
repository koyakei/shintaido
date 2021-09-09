package shintaido.movePart.構え

/**
 * plus とminus は逆演算であることを保証するように設計
 *
 */
interface 構えの高さの変更 {

    /**
     * 低くなる場合
     * トレーニング継続が可能になる範囲の増加
     */
    fun minus( v構えの高さ: 構えの高さ)

    /**
     * 高くなる場合
     */
    fun plus(v構えの高さ: 構えの高さ)
}