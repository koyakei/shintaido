package library

import org.nd4j.linalg.factory.Nd4j

interface 点 {
    fun matrix(){
        Nd4j.create(doubleArrayOf(x.toDouble(),y.toDouble(),z.toDouble()))
    }
    val x: Number
    val y: Number
    val z: Number

    infix operator fun minus(点: 点): Vector
//    {
////        点.x.toLong() - x.toLong()
////        点.y.toLong() - y.toLong()
////        点.z.toLong() - z.toLong()
//    }
    infix operator fun plus(点: 点): 点

    infix operator fun plus(vector: Vector): 点
}