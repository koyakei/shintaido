package library

import org.nd4j.linalg.factory.Nd4j

interface 点 {
    fun matrix(){
        val a = Nd4j.create(doubleArrayOf(x.toDouble(),y.toDouble(),z.toDouble()))
        val b = Nd4j.create(doubleArrayOf(x.toDouble(),y.toDouble(),z.toDouble()))
        a.add(b)
    }
    val x: Number
    val y: Number
    val z: Number

    infix operator fun minus(点: 点): DistanceVector
//    {
////        点.x.toLong() - x.toLong()
////        点.y.toLong() - y.toLong()
////        点.z.toLong() - z.toLong()
//    }
    infix operator fun plus(点: 点): DistanceVector

    infix operator fun plus(distanceVector: DistanceVector): 点
}