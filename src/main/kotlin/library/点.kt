package library

import org.nd4j.linalg.factory.Nd4j

interface 点 {
    fun matrix(){
        Nd4j.create(doubleArrayOf(x.toDouble(),y.toDouble(),z.toDouble()))
    }
    val x: Number
    val y: Number
    val z: Number
}