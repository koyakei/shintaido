package ridingSports.separetedBoard.rightLeft

import library.Distance
import library.DistanceVector
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
        val inSideSkiPressureForce =
            deckVerticalPressureForce.toLong()  - 外スキー.最大静止荷重.toLong()
        return if (inSideSkiPressureForce < 0){
            外スキー.位置
        } else{
            val 位置の差: DistanceVector = 外スキー.位置 - 内スキー.位置
            val 外スキーからの荷重点の距離: Distance = ((位置の差.distance / deckVerticalPressureForce).toLong() * 外スキー.最大静止荷重.toLong()) as Distance
            外スキー.位置 + (位置の差.normalize() * 外スキーからの荷重点の距離)
        }

    }
}