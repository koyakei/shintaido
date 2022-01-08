package ridingSports.separetedBoard.rightLeft

import library.点
import org.nd4j.linalg.api.ndarray.INDArray


interface 外側荷重点 {

    operator fun INDArray.plus(other: INDArray): INDArray = this.add(other)
    operator fun INDArray.minus(other: INDArray): INDArray = this.sub(other)
    operator fun INDArray.times(other: INDArray): INDArray = this.mmul(other)
    operator fun INDArray.plus(other: Number): INDArray = this.add(other)
    operator fun INDArray.minus(other: Number): INDArray = this.sub(other)
    operator fun INDArray.times(other: Number): INDArray = this.mul(other)
    operator fun INDArray.div(other: Number): INDArray = this.div(other)
    val 内スキー: 内スキー
    val 外スキー: 外スキー
    val deckVerticalPressureForce: Number
    @JvmInline
    value class Force(val number: Number)
    fun handle(force: Force): 点{
        val inSideSkiPressureForce = deckVerticalPressureForce.toLong()  - 外スキー.最大静止荷重.toLong()
        if (inSideSkiPressureForce < 0){
            return 外スキー.位置
        } else{
            inSideSkiPressureForce / 外スキー.最大静止荷重.toLong()
//            val 距離 = 外スキー.位置.matrix() - 内スキー.位置.matrix()
//            val 外スキーからの荷重点の距離 = 距離 / deckVerticalPressureForce * 外スキー.最大静止荷重.toLong()
//            val 荷重点 = 外スキー.位置 + 外スキーからの荷重点の距離 TODO: これがやりたい　でもベクトル演算をかんたんにできないみたい。
            return 外スキー.位置
        }

    }
}