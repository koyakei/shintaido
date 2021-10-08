/**
 * 物体も含むのでこちらで定義　組み手の定義が下層にあるけどそれはしょうがない
 * 人間同士の組みてに限定しない
 * 通貨の交換とかに全部これを適用するのか？　通貨の栄光を説明するためには必要そうだ
 */
interface KumiteParticipant {
    @JvmInline
    value class Identifier(val long: Long)
    val identifier: Identifier
    /**
     * 市場参加者は同じ目標を持っているわけじゃないんだけど、自分が操作可能な通貨の　cardinalNumberを任意の値に近づけようとする
     *
     */
}