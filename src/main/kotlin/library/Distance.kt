package library

interface Distance {
    val distance: Number
    infix operator fun div(distance: Distance): Distance
    infix operator fun div(number: Number): Number
}