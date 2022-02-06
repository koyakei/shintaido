package library

interface Direction {
    val value: Float
    infix operator fun minus(direction: Direction): Direction
}