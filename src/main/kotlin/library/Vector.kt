package library

interface Vector {
    infix operator fun plus(vector: Vector) : Vector
    infix operator fun plus(点: 点) : Vector
    infix operator fun times(length: Length) : Vector
    infix operator fun minus(vector: Vector):Vector
    fun normalize(): Vector
    interface Direction{

    }

    val direction: Direction
}