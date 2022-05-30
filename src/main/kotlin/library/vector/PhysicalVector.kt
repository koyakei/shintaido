package library.vector

import library.Direction
import library.Length
import library.Vector
import library.点

data class PhysicalVector(override val direction: PhysicalDirection): Vector {
    class PhysicalDirection(override val value: Float) : Direction{
        override fun minus(direction: Direction): Direction {
            TODO("Not yet implemented")
        }

    }
    override fun plus(vector: Vector): Vector {
        TODO("Not yet implemented")
    }

    override fun plus(点: 点): Vector {
        TODO("Not yet implemented")
    }

    override fun times(length: Length): Vector {
        TODO("Not yet implemented")
    }

    override fun minus(vector: Vector): Vector {
        TODO("Not yet implemented")
    }

    override fun normalize(): Vector {
        TODO("Not yet implemented")
    }
}
