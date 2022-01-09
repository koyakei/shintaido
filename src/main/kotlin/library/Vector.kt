package library

interface Vector {
    interface Direction{

    }
    val 始点: 点
    val distance: Distance
    val direction: Direction

    infix operator fun plus(vector: Vector) : Vector
    infix operator fun plus(点: 点) : Vector
    infix operator fun times(distance: Distance) : Vector
    fun normalize(): Vector
}