package library

data class Length(val length: Number) {

    infix operator fun div(length: Length): Length {
        return Length(length = length.length)
    }
    infix operator fun div(number: Number): Number {
        return length
    }
}